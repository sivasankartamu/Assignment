package velmurugan;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObj {
	public  PageObj() {
		System.out.println(
				"//input[@placeholder='First Name'],//input[@placeholder='Last Name'],//textarea[@ng-model='Adress'],id=\"eid\",//input[@ng-model='Phone'],//input[@value='Male'],id=\"checkbox1\",id=\"msdd\",//option[text()='Adobe Photoshop'],//option[text()='Albania'],id=\"select2-country-container\",id=\"yearbox\",//option[text()='March'],id=\"daybox\",id=\"firstpassword\",id=\"secondpassword\",id=\"submitbtn\"http://demo.automationtesting.in/Register.html");		
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement fname;
	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement lname;
	@FindBy(xpath="//textarea[@ng-model='Adress']")
	private WebElement addr;
	@FindBy(id="eid")
	private WebElement eid;
	@FindBy(xpath="//input[@ng-model='Phone']")
	private WebElement phone;
	@FindBy(xpath="//input[@value='Male']")
	private WebElement gender;
	@FindBy(id="checkbox1")
	private WebElement c1;
	@FindBy(id="msdd")
	private WebElement c2;
	@FindBy(xpath="option[text()='Adobe Photoshop']")
	private WebElement field;
	@FindBy(xpath="//option[text()='Albania']")
	private WebElement city;
	@FindBy(id="select2-country-container")
	private WebElement country;
	@FindBy(id="yearbox")
	private WebElement year;
	@FindBy(xpath="//option[text()='March']")
	private WebElement month;
	@FindBy(id="datebox")
	private WebElement date;
	@FindBy(id="firstpassword")
	private WebElement fpassword;
	@FindBy(id="secondpassword")
	private WebElement cnpass;
	@FindBy(id="submitbtn")
	private WebElement submit;
	public WebElement getFname() {
		return fname;
	}
		public WebElement getLname() {
		return lname;
	}
	
	public WebElement getAddr() {
		return addr;
	}
	
	public WebElement getEid() {
		return eid;
	}
	
	public WebElement getPhone() {
		return phone;
	}
	
	public WebElement getGender() {
		return gender;
	}
	
	public WebElement getC1() {
		return c1;
	}
	
	public WebElement getC2() {
		return c2;
	}
	
	public WebElement getField() {
		return field;
	}
	
	public WebElement getCity() {
		return city;
	}
	
	public WebElement getCountry() {
		return country;
	}
	
	public WebElement getYear() {
		return year;
	}
	
	public WebElement getMonth() {
		return month;
	}
	
	public WebElement getDate() {
		return date;
	}
	
	public WebElement getFpassword() {
		return fpassword;
	}
	
	public WebElement getCnpass() {
		return cnpass;
	}
	
	public WebElement getSubmit() {
		return submit;
	}
	
	
	

}
