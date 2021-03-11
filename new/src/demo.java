import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo {


	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver","C:\\automation\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
     driver.manage().window().maximize();
    driver.findElement(By.id("divpaxinfo")).click();
    Thread.sleep(2000L);
    driver.findElement(By.id("hrefIncChd")).click();
    
    
    for(int i=0;i<5;i++)
    {
    	driver.findElement(By.id("hrefIncChd")).click();
    	i++;
    }
    
    driver.findElement(By.id("btnclosepaxoption")).click();
	}

}
