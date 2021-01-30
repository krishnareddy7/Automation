import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Flunwait {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = null;
		FluentWait wait =new FluentWait(driver);
		
		wait.withTimeout(20, TimeUnit.SECONDS);//f
		wait.pollingEvery(2, TimeUnit.SECONDS);
	}

}
