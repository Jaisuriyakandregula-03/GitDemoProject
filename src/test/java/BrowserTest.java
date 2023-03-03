import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		
		//WebDriver driver = new FirefoxDriver();
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://seleniumhq.org/");
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
