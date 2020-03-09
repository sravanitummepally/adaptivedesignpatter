package adaptive;

interface WebDriver{
	public void getElement();
	public void selectElement();
}

class ChromeDriver implements WebDriver
{

	@Override
	public void getElement() {
		System.out.println("Get elemnt from chromeDriver");
		
		
	}

	@Override
	public void selectElement() {
		System.out.println("Selected elemnet from chrome driver");  
		
	}
	
}


class IEDriver{
	public void findElement() {
		System.out.println("Find element from ADDriver");
		
	}
	public void clickElement() {
		
		System.out.println("click element from IDDriver");
	}
}



class WebDriverAdapter implements WebDriver{
	IEDriver ieDriver;
	public WebDriverAdapter(IEDriver iedriver, IEDriver ieDriver)
	{
		this.ieDriver = ieDriver;
	}

	@Override
	public void getElement() {
		ieDriver.findElement();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectElement() {
		ieDriver.clickElement();
		
	}
	
	
}

public class AdapterDesignPatternCODE {
	public static void main(String[] args)
	{
	ChromeDriver a = new ChromeDriver();
	a.getElement();
	a.selectElement();
	
	IEDriver e = new IEDriver();
	e.findElement();
	e.clickElement();
		
	WebDriver WID = new WebDriverAdapter(e, e);
	WID.getElement();
	WID.selectElement();
	
	
	
	
	}
	

}
























