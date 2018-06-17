
import static jdk.nashorn.tools.ShellFunctions.input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {

   
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://bvtest.school.cubes.rs/login");
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("qa@cubes.rs");
        
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("cubesqa");
        
        WebElement loginButton = driver.findElement(By.className("btn-primary"));
        loginButton.click();
        
        WebElement CategoriesLink = driver.findElement(By.partialLinkText("Cat"));
        CategoriesLink.click();
        
        WebElement addCategoriesButton = driver.findElement(By.className("btn"));
        addCategoriesButton.click();
        
        WebElement titleField = driver.findElement(By.id("title"));
        titleField.sendKeys("Zorica_Mijatovic");
        
        WebElement saveButton = driver.findElement(By.id("save-category-button"));
        saveButton.click();
       
        WebElement RegionsLink = driver.findElement(By.partialLinkText("Reg"));
        RegionsLink.click();
        
        WebElement addRegionButton = driver.findElement(By.className("pull-right"));
        addRegionButton.click();
        
        WebElement RegionsTitleField = driver.findElement(By.className("input-md"));
        RegionsTitleField.sendKeys("Beograd_Srbija");
        
        WebElement RegionsSaveButton = driver.findElement(By.id("save-region-button"));
        RegionsSaveButton.click();

          WebElement PortalsLink = driver.findElement(By.partialLinkText("Port"));
          PortalsLink.click();
          
          WebElement addPortal = driver.findElement(By.className("pull-right"));
          addPortal.click();
          
          WebElement PortalTitleField = driver.findElement(By.id("title"));
          PortalTitleField.sendKeys("Selenium_Vezbe");
          
          WebElement urlField = driver.findElement(By.id("url"));
          urlField.sendKeys("http://test.rs");
          
          WebElement PortalSaveButton = driver.findElement(By.id("save-portal-button"));
          PortalSaveButton.click();
           // driver.quit();
          
        
        
                
    }
    
}
