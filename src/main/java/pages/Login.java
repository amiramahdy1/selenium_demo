package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class Login {
    WebDriver driver  = new ChromeDriver();
    public void LoginValidUser(){
        driver.get("https://practicesoftwaretesting.com/auth/login");
        driver.findElement(By.id("email")).sendKeys("momen.samir39.9@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Momen1996!");
        driver.findElement(By.xpath("//input[@value='Login']")).click();




    }


}
