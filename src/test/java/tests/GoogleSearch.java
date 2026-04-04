	package tests;
	


	import com.microsoft.playwright.*;
	import org.junit.jupiter.api.*;
	import static org.junit.jupiter.api.Assertions.*;

public class GoogleSearch {


	    // Playwright objects
	    static Playwright playwright;
	    static Browser browser;
	    BrowserContext context;
	    Page page;

	    // Runs ONCE before all tests — launch browser
	    @BeforeAll
	    static void launchBrowser() {
	        playwright = Playwright.create();
	        browser = playwright.chromium().launch(
	            new BrowserType.LaunchOptions().setHeadless(false) // false = see the browser!
	        );
	    }

	    // Runs before EACH test — fresh page
	    @BeforeEach
	    void createPage() {
	        context = browser.newContext();
	        page = context.newPage();
	    }

	    // ✅ Test 1 — Check Google title
	    @Test
	    void testGoogleTitle() {
	        page.navigate("https://www.google.com");
	        String title = page.title();
	        System.out.println("Page title is: " + title);
	        assertTrue(title.contains("Google"));
	    }

	    // ✅ Test 2 — Check search box exists
	    @Test
	    void testSearchBoxExists() {
	        page.navigate("https://www.google.com");
	        boolean isVisible = page.locator("textarea[name='q']").isVisible();
	        assertTrue(isVisible, "Search box should be visible");
	    }

	    // ✅ Test 3 — Search and verify results page
	    @Test
	    void testSearch() {
	        page.navigate("https://www.google.com");
	        page.locator("textarea[name='q']").fill("Playwright Java");
	        page.locator("textarea[name='q']").press("Enter");

	        // Wait for results and verify URL changed
	        page.waitForLoadState();
	        assertTrue(page.url().contains("search"));
	        System.out.println("Search results URL: " + page.url());
	    }

	    // Runs after EACH test — close page
	    @AfterEach
	    void closePage() {
	        context.close();
	    }

	    // Runs ONCE after all tests — close browser
	    @AfterAll
	    static void closeBrowser() {
	        browser.close();
	        playwright.close();
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
