import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {
//    ChromeDriver chromeDriver;
//    @BeforeEach
//    public void setUp() {
//        WebDriverManager.chromedriver().setup();
//        chromeDriver = new ChromeDriver();
//        chromeDriver.manage().window().maximize();
//    }
//    @Test
//    public void testTimChuyenBay() throws InterruptedException {
//        chromeDriver.get("https://www.vietjetair.com/vi");
//        Thread.sleep(3000);
//        WebElement chonDiemDi = chromeDriver.findElement(By.xpath("//div[@class='jss358']//div[1]//div[1]//div[1]//div[1]//input[1]"));
//        chonDiemDi.click();
//        Thread.sleep(3000);
//
//        WebElement chonViTri = chromeDriver.findElement(By.xpath("//body/div[@role='presentation']/div[@class='MuiPaper-root MuiPaper-elevation16 MuiDrawer-paper jss28 jss499 MuiDrawer-paperAnchorBottom']/div[@class='jss580']/div[@class='jss633']/div[2]/div[1]"));
//        chonViTri.click();
//        Thread.sleep(3000);
//    }
//
//    @AfterEach
//    public void tearDown() throws InterruptedException {
//        if (chromeDriver != null) {
//            Thread.sleep(7000);
//            chromeDriver.quit();
//        }
//    }
}
