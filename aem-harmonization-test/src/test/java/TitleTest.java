import static org.junit.Assert.*;

import org.junit.Test;

import com.medtronic.corp.base.CommonMethods;
import com.medtronic.corp.base.TestBase;
import com.medtronic.corp.pages.EditorPage;
import com.medtronic.corp.pages.LoginPage;
import com.medtronic.corp.pages.SitesPage;

public class TitleTest extends TestBase{

	LoginPage _loginPage = new LoginPage(driver);
	EditorPage _editorPage = new EditorPage(driver);
	SitesPage _sitesPage;
	
	@Test
	public void addTitleOnProductModel() throws InterruptedException {
		_sitesPage=_loginPage.login();
		_sitesPage.createPage("Product Model Template", "Auto-product-model");
		CommonMethods.switchToNewTab();
		
		_editorPage.editorHeader.enableEditMode();
		_editorPage.addComponent("Title");
		_editorPage.openConfigureDialog("container/title", 1);
	}

}
