package om.abc.maven.chromeTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {
	@Test
	public void ctest() {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

}

