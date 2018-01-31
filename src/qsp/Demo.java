package qsp;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {
	
	@Parameters({"app"})
	@Test
	public void testA(@Optional("http://www.google.com")String app) throws Exception {
	 Reporter.log(app,true);
	 URL url=new URL("http://localhost:4444/wd/hub");
	 DesiredCapabilities dc = DesiredCapabilities.chrome();
	 WebDriver driver=new RemoteWebDriver(url,dc);
	 driver.get(app);
	 driver.quit();
	 
	}
}
