package Com.Ecommerce.PageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecommarce.BaseClass.Ecommerce_BaseClass;

public class TC_Ecommerce_AddtoCart extends Ecommerce_BaseClass  {
	

		public TC_Ecommerce_AddtoCart() {

		PageFactory.initElements(driver, this);
		//Class .static meth

		}

		@FindBy(xpath="//a[contains(text(),'Computers ')]")
		public WebElement Com;

		@FindBy(xpath ="//a[contains(text(), 'Notebooks ')]")
		public WebElement Notebook;

		@FindBy(xpath ="//a[contains(text(),'Apple MacBook Pro 13-inch')]")
		public WebElement SelectMackbook;

		@FindBy(id = "add-to-cart-button-4")
		private WebElement Addtocart;

		@FindBy(xpath="//p[contains(text(), 'The product has been added to your ')]")
		public WebElement Message;
	
		@FindBy(xpath = "//span[@title=\"Close\"]")
		public WebElement CloseTab;

		
//		*******************************************************************
		
		
		
		
		public void NoteBook() {
		Notebook.click();
		}
		
		public void selectMackbook() {
			SelectMackbook.click();
		}

		public void AdsToCart() {
		Addtocart.click();
		}

		public void ProductAdded() {
		Message.isDisplayed();
		}
	
		public void Close() {
		CloseTab.click();
		}
		
	

}
