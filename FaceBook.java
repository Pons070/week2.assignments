package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Downloading and Setup Path
		WebDriverManager.chromedriver().setup();
		
//Launch browser and open URL		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		//Maximise window
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Create new account
		
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Test");
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Project");
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']")).sendKeys("9043464005");
		driver.findElement(By.id("password_step_input")).sendKeys("Test@12345");
		
		WebElement bDay = driver.findElement(By.name("birthday_day"));
		
		Select ddBday = new Select(bDay);
		ddBday.selectByValue("21");
		
		WebElement bMonth = driver.findElement(By.name("birthday_month"));
		
		Select ddBmonth = new Select(bMonth);
		ddBmonth.selectByValue("9");
		
		WebElement bYear = driver.findElement(By.name("birthday_year"));
		
		Select ddByear = new Select(bYear);
		ddByear.selectByValue("1993");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
	}

}
