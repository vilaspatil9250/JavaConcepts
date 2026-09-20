package webDriver_Arch;

public interface Webdriver {

	public void get(String url);

	public String getTitle();

	public void findElement(String ele);

	public void click(String ele);

	public void sendkeys(String ele, String value);

	public void quit();

}
