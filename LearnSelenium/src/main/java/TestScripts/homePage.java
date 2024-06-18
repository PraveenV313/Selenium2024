package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRepository.homeObjects;

public class homePage implements homeObjects {
	
	Integer AMount = 1000;
	
	public Integer collectAmount() {
		System.out.println("the amount is " + AMount);
		return AMount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\prave\\Downloads\\chromedriver-win64.zip");
		//WebDriver driver = new ChromeDriver();
		//driver.get("www.google.com");
		
		homePage home = new homePage();
	    Integer newAmount = home.collectAmount();
		System.out.println("amount is " + newAmount);
		
		
	}

}


