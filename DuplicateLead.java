package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		WebElement userName= driver.findElement(By.xpath("//input[@class='inputLogin']"));
		userName.sendKeys("Demosalesmanager");
		WebElement Password= driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//*[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("vishwakala97@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000, 0);
		
		String leadName = driver.findElement(By.xpath("//a[text()='Vishwakala']")).getText();
		System.out.println(leadName);
		
		driver.findElement(By.xpath("//a[text()='Vishwakala']")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.className("smallSubmit")).click();
		String dupLeadname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (dupLeadname==leadName)
		{
			System.out.println("The Duplicate Lead name is confirmed");
		}
		else {
			System.out.println("Duplicate leadname is not confirmed");
		}
		
		driver.close();
	}

}
