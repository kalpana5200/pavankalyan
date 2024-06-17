package kalyan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactTest {
	@Test
	public void createContact() {
		System.out.println("create contact executed");
	}

	@Test
	public void modifyContact() {
		System.out.println("modify contact executed");
	}

	@Test
	public void deleteContact() {
		System.out.println("delete contact executed");
	}

	@BeforeClass
	public void beforeClass() throws InterruptedException {
		String browser = System.getProperty("browser","chrome");
		String env = System.getProperty("envi", "http://localhost:8888/");
		System.out.println(env);
		System.out.println("launch "+browser);
		String user = System.getProperty("username", "admin");
		System.out.println(user);
		String password = System.getProperty("password", "root");
		System.out.println(password);
		

		WebDriver driver = null;
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.get("http://localhost:8888/");
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}
}
