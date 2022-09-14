package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		//String driverPath = System.getProperty("webdriver.chrome.driver");
		//System.out.println(driverPath);
		
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
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Ponsangkar");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ponsangkar");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']")).sendKeys("M");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		WebElement Source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(Source);
		dd.selectByVisibleText("Employee");
		WebElement Campaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select ddCamp = new Select(Campaign);
		ddCamp.selectByValue("9001");
		WebElement Own = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ddOwn = new Select(Own);
		ddOwn.selectByIndex(5);
		WebElement Country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select ddCountry = new Select(Country);
		ddCountry.selectByVisibleText("India");
		driver.findElement(By.name("submitButton")).click();
		String Title = driver.getTitle();
		System.out.println(Title);
		driver.close();
		
	}

}
