package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//*[text()='Phone'])")).click();
		WebElement phone = driver.findElement(By.xpath("//*[@id=\"ext-gen270\"]"));
		phone.sendKeys("12345");
		driver.findElement(By.xpath("(//*[text()='Find Leads'])[3]")).click();
		WebElement LeadID=driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		System.out.println(LeadID.getText());
		LeadID.click();
		
		
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
	}

}
