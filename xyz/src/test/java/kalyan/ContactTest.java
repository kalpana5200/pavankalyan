package kalyan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

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
	@Test
	public void m1() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		Thread.sleep(5000);
		System.out.println("from m1()");
		driver.quit();
	}
}
