package maven2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prj1 {
public static void main(String[] args) {
	WebDriverManager.firefoxdriver().setup();
	WebDriver f=new FirefoxDriver();
	
}
}
