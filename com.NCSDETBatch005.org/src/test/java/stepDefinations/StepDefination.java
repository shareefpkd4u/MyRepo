package stepDefinations;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {

	WebDriver driver;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

	@Given("launch Chrome Browser")
	public void launch_chrome_browser() {
		driver = new ChromeDriver();
	}

	@Given("open NC Login Page")
	public void open_nc_login_page() {
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}

	@Then("verify NC login page got loaded")
	public void verify_nc_login_page_got_loaded() {
		boolean val = driver.findElement(By.id("Email")).isDisplayed();
		if (val == true) {
			System.out.println("NC Login page got loaded successfully");
		} else {
			System.out.println("NC Login page not loaded successfully");
		}

	}

	@When("do Login of the NC")
	public void do_login_of_the_nc() {
		driver.findElement(By.tagName("button")).click();
	}

	@Then("verify Login success")
	public void verify_login_success() {
		System.out.println("Login success");
	}

	@When("click on catalog")
	public void click_on_catalog() {

	}

	@When("click on products")
	public void click_on_products() {

	}

	@When("enter valid product name")
	public void enter_valid_product_name() {

	}

	@When("click on search button")
	public void click_on_search_button() {

	}

	@When("click on logout link")
	public void click_on_logout_link() {

	}

	@Then("verify logout success")
	public void verify_logout_success() {

	}

	@When("terminate the browser")
	public void terminate_the_browser() {
		driver.quit();
	}

	@Given("Launch the Firefox Browser")
	public void launch_the_Firefox_Browser() {

	}

	@Given("open nopcommerce Login Page")
	public void open_nopcommerce_Login_Page() {

	}

	@When("enter valid email data into email field")
	public void enter_valid_email_data_into_email_field() {

	}

	///////////////////////////////////

	@Given("open NC login page with valid url")
	public void open_nc_login_page_with_valid_url() {

		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

	}

	@When("enter valid {string} into email field")
	public void enter_valid_into_email_field(String string) {

		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(string);

	}

	@When("enter valid {string} into pws field")
	public void enter_valid_into_pws_field(String string) {

		driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys(string);

	}

	@When("click on nc login button for do login")
	public void click_on_nc_login_button_for_do_login() {
		driver.findElement(By.tagName("button")).click();
	}

	@Then("verify login is success or not")
	public void verify_login_is_success_or_not() {
		System.out.println("Login Success");
	}

	//////////////////////////////////////

	@Given("open nopCommerce login page with vali url")
	public void open_nop_commerce_login_page_with_vali_url() {
		driver = new FirefoxDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
	}

	@When("enter valid {string} data in email")
	public void enter_valid_data_in_email(String string) {

		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(string);

	}

	@When("enter valid {string} data in password")
	public void enter_valid_data_in_password(String string) {

		driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys(string);

	}

	@When("click on ncLogin button for login purpose")
	public void click_on_nc_login_button_for_login_purpose() {
		driver.findElement(By.tagName("button")).click();
	}
	///////////////////////////////////////////////

	@Given("open nc login in firefox browser using url")
	public void open_nc_login_in_firefox_browser_using_url() {

	}

	@When("enter email data in email")
	public void enter_data_in_email(DataTable dataTable) {

//		List<List<String>> data = dataTable.asLists();
//		String un = data.get(0).get(0);
//		System.out.println("Console data un is : "+un);

		List<Map<String, String>> data = dataTable.asMaps();
		String un = data.get(0).get("Email");
		System.out.println("Console data un is : " + un);

	}

	@When("enter pws data in password")
	public void enter_data_in_password(DataTable dataTable) {

//		List<List<String>> data = dataTable.asLists();
//		String pws = data.get(0).get(0);
//		System.out.println("Console data pws is : "+pws);

		List<Map<String, String>> data = dataTable.asMaps();
		String pws = data.get(0).get("Password");
		System.out.println("Console data pws is : " + pws);

	}

	@When("click on login button")
	public void click_on_login_button() {

	}

	@Given("open nc login page with url")
	public void open_nc_login_page_with_url() {
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}

}
