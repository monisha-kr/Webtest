import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.NoSuchElementException;


public class RufusLaunch {
    public static void main(String[] args) {
   
    	WebDriver driver = null;
    	try {
            
    		//Bypass security checks
    		System.setProperty("webdriver.chrome.whitelistedIps", "");
    		System.setProperty("SELENIUM_SKIP_SECURITY", "true");

    		ChromeOptions options = new ChromeOptions();
            // Setup Chrome WebDriver using WebDriverManager
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
            
            driver.manage().window().maximize();

            // Load credentials from config.properties
//            Properties prop = new Properties();
//            prop.load(new FileInputStream("src/resources/config.properties"));
//            String email = prop.getProperty("email");
//            String password = prop.getProperty("password");
            
            options.addArguments("user-data-dir=C:\\Users\\Monisha\\AppData\\Local\\Google\\Chrome\\User Data");
//            options.addArguments("user-data-dir=C:\\Users\\Monisha\\AppData\\Local\\Temp\\scoped_dir9384_1081691185");
            options.addArguments("profile-directory=Default");

            // Navigate to Amazon
            driver.get("https://www.amazon.in");
            Thread.sleep(2000);

//            try {
//                WebElement continueButton = driver.findElement(By.xpath("//span[contains(text(),'Continue shopping')]"));
//                if(continueButton.isDisplayed()) {
//                    continueButton.click();
//                    Thread.sleep(2000);
//                }
//            } catch (NoSuchElementException e) {
//                System.out.println("Continue shopping button not found - proceeding with login");
//            }

            
//            // Click sign-in button
//            driver.findElement(By.id("nav-link-accountList")).click();
//            Thread.sleep(2000);
//
//            // Enter email
//            driver.findElement(By.id("ap_email_login")).sendKeys(email);  // Correct id for email input on Amazon login
//            Thread.sleep(1000);
//
//            // Click continue button
//            driver.findElement(By.id("continue")).click();
//            Thread.sleep(1000);
//
//            // Enter password
//            driver.findElement(By.id("ap_password")).sendKeys(password);
//            Thread.sleep(1000);

//            // Click sign-in button
//            driver.findElement(By.id("signInSubmit")).click();
//            Thread.sleep(3000);

            System.out.println("Login successful!");
    	}
    	 catch (Exception e) {
    		 e.printStackTrace();
    	 }
    }
}
