package tests;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AmazonSearch {
	
	//playwright objects
	static Playwright playwright;
	static Browser browser;
	BrowserContext context;
	Page page;
	
	//Runs before all the tests - launch Browser
	@BeforeAll
	static void launchBrowser() {
		playwright = Playwright.create();
		browser = playwright.chromium().launch(
				new BrowserType.LaunchOptions().setHeadless(false)
				);
	}
	
	//Runs Before each test
	@BeforeEach
	void createPage() {
		context = browser.newContext();
		page = context.newPage();
		page.setDefaultTimeout(10000);
	}
	
	//Test 1 - check amazon title
	@Test
	 void testAmazonTitle() {
		page.navigate("https://www.amazon.com/");
		page.waitForLoadState();
		String title = page.title();
		System.out.println("Page title is "+ title);
		assertTrue(title.contains("Amazon"), "Title should contain amazon");
	}
	
	//Test 2 - Search box is visible
	@Test
	 void serachBoxVisible() {
		page.navigate("https://www.amazon.com/");
		page.waitForLoadState();
		boolean isVisble = page.locator("#twotabsearchtextbox").isVisible();
		assertTrue(isVisble, "Search Box is Visible");
	}
	
	//Test 3 search for a product
	@Test
	 void serachForaProduct() {
		page.navigate("https://www.amazon.com/");
		page.locator("#twotabsearchtextbox").fill("laptop");
		page.press("#twotabsearchtextbox", "Enter");
		page.waitForLoadState();
		assertTrue(page.url().contains("laptop"), "URL has laptop in it");
	}
	
	//TEST 4 One results as a laptop in it.
	
	@Test
	 void verifySerachResult() {
		page.navigate("https://www.amazon.com/");
		page.locator("#twotabsearchtextbox").fill("laptop");
		page.press("#twotabsearchtextbox", "Enter");
		page.waitForLoadState();
		int numofResults = page.getByText("laptop").count();
		assertTrue(numofResults > 0, "Atleast one of them have laptop");
	}
	
	@AfterEach
	void closepage() {
		context.close();
	}
	
	@AfterAll
	static void closeBrowser() {
		browser.close();
		playwright.close();
	}

}
