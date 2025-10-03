import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

public class RufusIcon {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");
		WebDriver driver = new ChromeDriver(options);
		
		//driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(1024, 768));
		driver.manage().window().setPosition(new Point(0, 0));
		
        String targetUrl = "https://www.amazon.in/";
        String currentUrl = driver.getCurrentUrl();
        
        if (!currentUrl.equalsIgnoreCase(targetUrl)) {
        	System.out.println("Opening Amazon Shopping site...");
            driver.get(targetUrl);
            String targetPage = driver.getTitle();
            System.out.println("Amazon page opened successfully with Title " + targetPage);
        }
		
		WebElement rufusIcon = driver.findElement(By.xpath("//div[@id='nav-rufus-disco-text']"));

		//Checking Rufus icon visibility
		if (rufusIcon.isDisplayed()) {
		    System.out.println("Rufus icon is visible");
		} else {
		    System.out.println("Rufus icon is NOT visible");
		}
	}
}
