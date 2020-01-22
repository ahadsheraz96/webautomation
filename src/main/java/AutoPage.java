import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoPage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahads\\IdeaProjects\\webautomation1\\src\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
    }

    public void addingToCartTest() {

    }
    public void bestSellingTest(){

    }

    public void viewCartTest() {
    }
}