package example1;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	@Ignore
	@Test
	public void edit() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivachakri.thokala\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/");
		d1.findElement(By.linkText("Edit")).click();
		d1.findElement(By.id("email")).sendKeys("sivachakri99@gmail.com");
		d1.findElement(By.xpath("//input[@value='Append ']")).clear();
		d1.findElement(By.cssSelector("input[value='Append ']")).sendKeys("HCL");
		d1.findElement(By.name("username")).clear();
		d1.findElement(By.name("username")).sendKeys("Siva Chakri");
		d1.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		d1.findElement(By.xpath("//input[@value='Clear me!!']")).sendKeys("yes");
	}

	@Ignore
	@Test
	public void button() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivachakri.thokala\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/");
		d1.findElement(By.linkText("Button")).click();
		d1.findElement(By.id("home")).click();
		d1.findElement(By.linkText("Button")).click();
		d1.findElement(By.id("position")).click();
		d1.findElement(By.id("color")).click();
		d1.findElement(By.id("size")).click(); 
	}
	
	@Ignore
	@Test
	public void link()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivachakri.thokala\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/");
		d1.findElement(By.linkText("HyperLink")).click();
		d1.findElement(By.xpath("//a[@href='../home.html']")).click();
		d1.findElement(By.linkText("HyperLink")).click();
		d1.findElement(By.xpath("//a[@href='Button.html']")).click();
		d1.findElement(By.id("home")).click();
		d1.findElement(By.linkText("HyperLink")).click();
		d1.findElement(By.xpath("//a[@href='../home.html']")).click();
		d1.findElement(By.linkText("HyperLink")).click();
		d1.findElement(By.xpath("//a[@href='error.html']")).click();
		
	}
	
	@Ignore
	@Test
	public void image() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivachakri.thokala\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/");
		d1.findElement(By.linkText("Image")).click();
		d1.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		d1.findElement(By.linkText("Image")).click();
		d1.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
		
		
	}
	
	@Ignore
	@Test
	public void radio_button() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivachakri.thokala\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/");
		d1.findElement(By.linkText("Radio Button")).click();
		d1.findElement(By.id("yes")).click();
		d1.findElement(By.xpath("//input[@name='news']")).click();
		d1.findElement(By.xpath("//input[@name='age'][2]")).click();
		
	}
	
	@Test
	public void chechbox() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivachakri.thokala\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/");
		d1.findElement(By.linkText("Checkbox")).click();
		d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[3]/input")).click();
		d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input")).click();
		
	}
		
}

