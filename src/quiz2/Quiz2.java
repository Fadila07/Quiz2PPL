/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

/**
 *
 * @author LEGION
 */
import java.awt.Robot;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    private static WebDriver driver=null;
    
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        System.setProperty("webdriver.chrome.driver", 
                "C:\\seleniumWebdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.1crmcloud.com/login.php");
        
        WebElement une = driver.findElement(By.name("user_name"));
        
        une.sendKeys("admin");
        une.sendKeys(Keys.TAB);
        WebElement pass = driver.findElement(By.name("user_password"));
        pass.sendKeys("admin");
        pass.sendKeys(Keys.ENTER);
        
        Thread.sleep(10000);
        driver.findElement(By.className("default-avatar")).click();
//        driver.findElement(By.xpath(""))
    }
    
}
