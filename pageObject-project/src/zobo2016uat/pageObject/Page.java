package zobo2016uat.pageObject;
/** 
 * Абстрактный класс PageObject
 * @author a.fatov
 */
public abstract class Page {
	public Page() {
	}
	public String baseUrl = "https://www.google.ru";
	//public String baseUrl = "http://test-cl.checkout.ru";
	public String pageUrl = "";
	public abstract String getPage() throws Exception;
	public abstract void openPage() throws Exception;
}
