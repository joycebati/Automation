ADD A NEW PACKAGE;
GOD BLESS;
package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ClasssFrame {
	public static void main  (String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\H2\\Downloads\\geckodriver-v0.15.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        String alertMessage = "";

        driver.get("http://jsbin.com/usidix/1");
        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
        alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
       
        System.out.println(alertMessage);
        driver.quit();
		LEARN TO REST BUT NOT TO QUIT();
	}
	

}
