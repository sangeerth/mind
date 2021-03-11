import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.bcel.internal.generic.Select;

public class Staticdropdown {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\automation\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	     driver.manage().window().maximize();
	     WebElement staticDropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	Select dropdown=new org.openqa.selenium.support.ui.Select(staticDropdown);
	     dropdown.selectByIndex(2);
	     
	
	     }
}