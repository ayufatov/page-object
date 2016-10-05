package bavaria2016uat.pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;
/**
 * �������� ����������� �������� �� �����  ������������
 * @author a.fatov
 * ����������:
 * @public WebDriver driver
 * @public String pageUrl
 * ������:
 * @public HomePage(WebDriver driver) throws Exception
 * @public String getPage() throws Exception
 * @public void openPage() throws Exception
 */
public class AuthorizationPage extends Page {
	//if(elem.Displayed) �������� ���� ������� ��� ���
	//										����������
	public WebDriver driver;
	public String pageUrl = "/home.html";
	public By usernameLocator = By.name("login");
	public By passwordLocator = By.name("password");
	public By loginButtonLocator = By.id("btn");
	public By errorsLocator = By.className("errors");
	public String Login = "a.fatov";
	public String Password = "Fatik32rus";
	//    									������
	public AuthorizationPage(WebDriver driver) throws Exception {
		this.driver = driver;
	}
	//����������� � ���������� �������
	public void loginAs() throws Exception {
	    driver.findElement(usernameLocator).clear();
	    driver.findElement(usernameLocator).sendKeys("a.fatov");
	    driver.findElement(passwordLocator).clear();
	    driver.findElement(passwordLocator).sendKeys("Fatik32rus");
	    driver.findElement(loginButtonLocator).click();
	    System.out.println("AuthorizationPage.loginAs() success!");
	}
	//����������� � ������������ �������
	public void loginAsInvalidLogin() throws Exception {
	    driver.findElement(usernameLocator).clear();
	    driver.findElement(usernameLocator).sendKeys("a.fatov123");
	    driver.findElement(passwordLocator).clear();
	    driver.findElement(passwordLocator).sendKeys("Fatik32rus");
	    driver.findElement(loginButtonLocator).click();
	    driver.findElement(errorsLocator);
	    System.out.println(driver.findElement(errorsLocator).getText());
	    assertTrue(driver.findElement(errorsLocator).getText().equals("Invalid user"));
	    System.out.println("AuthorizationPage.loginAsInvalidLogin() success!");
	}
	
	public void openPage() throws Exception {
		driver.get(pageUrl);
		System.out.println("AuthorizationPage.openPage() success!");
	 }
	@Override
	public String getPage() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	}