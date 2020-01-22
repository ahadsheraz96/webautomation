import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutoPage {
    WebDriver driver=null;
    @BeforeMethod
    public void pageOpenTest() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ahads\\IdeaProjects\\webautomation1\\src\\Driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
    }
    @Test
    public void searchTest(){
        driver.findElement(By.id("search_query_top")).sendKeys("women");
        driver.findElement(By.name("submit_search")).click();

    }
    @Test
    public void contactusTest(){
        driver.findElement(By.linkText("Contact us")).click();
        driver.findElement(By.id("email")).sendKeys("ahadsheraz96@.com");
        driver.findElement(By.xpath("//input[@id='id_order']")).sendKeys("123456789");
       // driver.findElement(By.xpath("//button[@id='submitMessage']")).click();
    }
    @Test
    public void addingToCartTest(){
        driver.findElement(By.linkText("Women")).click();
        driver.findElement(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']")).click();
       //driver.findElement(By.xpath("//span[@class='continue btn btn-default button exclusive-medium']")).click();

    }
    @Test
    public void viewCartTest(){
        driver.findElement(By.xpath("//b")).click();
        driver.findElement(By.id("newsletter-input")).sendKeys("ahad123");
    }
    @Test
    public void bestSellingTest(){
        driver.findElement(By.linkText("Best sellers" )).click();
       driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[2]")).click();
        //driver.findElement(By.xpath("//div[@class='quick-view-wrapper-mobile']")).click();
        //driver.findElement(By.linkText("Add to cart")).click();
    }
    @AfterMethod
    public void finishTest(){
        driver.quit();
    }
}
