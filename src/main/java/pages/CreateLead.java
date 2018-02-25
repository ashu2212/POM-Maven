package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	public CreateLead() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement cName;
	public CreateLead input_Compname (String data)
	{
		type(cName,data);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement fName;
	public CreateLead input_FName(String data)
	{
		type(fName,data);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement lName;
	public CreateLead input_lName(String data)
	{
		type(lName,data);
		return this;
	}
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement createclick;
	public ViewLead clickCreate()
	{
		click(createclick);
		return new ViewLead();

	}
}
