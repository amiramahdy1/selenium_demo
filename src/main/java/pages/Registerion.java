package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registerion {
    WebDriver driver = new ChromeDriver();
    public void Rigster (){
        driver.navigate().to("https://practicesoftwaretesting.com/auth/register");
        driver.findElement(By.id("first_name")).sendKeys("John");
        driver.findElement(By.id("last_name")).sendKeys("Mark");
        driver.findElement(By.id("dob")).sendKeys("12/19/1980");
        driver.findElement(By.id("address")).sendKeys("Maadi");
        driver.findElement(By.id("postcode")).sendKeys("12588");
        driver.findElement(By.id("city")).sendKeys("Cairo");
        driver.findElement(By.id("state")).sendKeys("Cairo");
        driver.findElement(By.id("country")).sendKeys("Egypt");
        driver.findElement(By.id("phone")).sendKeys("20122828028");
        driver.findElement(By.id("email")).sendKeys("amiramahdy339@gmail.com");
        driver.findElement(By.id("password")).sendKeys("pAassword1@");

        driver.findElement(By.xpath("//button[normalize-space()='Register']")).click();


    }



    }


