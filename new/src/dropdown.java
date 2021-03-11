import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {

	public static void main(String[] args) throws InterruptedException 
	{
	
		
		System.setProperty("webdriver.chrome.driver","C:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BHO']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		


	}

}
