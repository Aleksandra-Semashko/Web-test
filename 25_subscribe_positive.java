// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class 25subscribepositiveTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void 25subscribepositive() {
    driver.get("https://skillfactory.ru/");
    driver.manage().window().setSize(new Dimension(1096, 672));
    js.executeScript("window.scrollTo(0,700)");
    js.executeScript("window.scrollTo(0,3201.333251953125)");
    driver.findElement(By.cssSelector(".t-input-group_em:nth-child(1) .t-input")).click();
    driver.findElement(By.cssSelector(".t-input-group_em:nth-child(1) .t-input")).sendKeys("shurasemashko94@gmail.com");
    driver.findElement(By.cssSelector(".tn-form__submit:nth-child(5) > .t-submit")).click();
    driver.findElement(By.cssSelector(".t-form-success-popup__close-icon")).click();
  }
}
