package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoNavigation
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./src/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//Dimension dim=new Dimension(250,50);
		//driver.manage().window().setSize(dim);	
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incnognito");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		/*
		driver.navigate().to("http://pms.karbonnlive.com/view_all_bug_page.php?refresh=true");
		Thread.sleep(300);
		driver.navigate().back();
		Thread.sleep(300);
		driver.navigate().forward();
		Thread.sleep(300);
		driver.navigate().refresh();
		*/
	} 
}
 