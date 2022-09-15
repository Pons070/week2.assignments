package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

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
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		WebElement firstName = driver.findElement(By.id("firstNameField"));
		firstName.sendKeys("Ponsangkar");
		WebElement surName = driver.findElement(By.id("lastNameField"));
		surName.sendKeys("M");
		WebElement localFirstName = driver.findElement(By.id("createContactForm_firstNameLocal"));
		localFirstName.sendKeys("Ponsangkar");
		WebElement localSurName = driver.findElement(By.id("createContactForm_lastNameLocal"));
		localSurName.sendKeys("M");
		WebElement department = driver.findElement(By.id("createContactForm_departmentName"));
		department.sendKeys("SoftwareQA");
		WebElement description = driver.findElement(By.id("createContactForm_description"));
		description.sendKeys("Quality Assurance");
		WebElement emailAddress = driver.findElement(By.id("createContactForm_primaryEmail"));
		emailAddress.sendKeys("sangkar111@gmail.com");
		
		WebElement State = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select ddState =new Select(State);
		ddState.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.xpath("(//a[text()='Edit'])[1]")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		WebElement importantNote = driver.findElement(By.id("updateContactForm_importantNote"));
		importantNote.sendKeys("Test Script");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
