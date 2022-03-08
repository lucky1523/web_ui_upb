package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;
import testClean.BaseTodoLy;

public class UpdateSection{

    String projName="Luciano";
    String newProjName="NewLuciano";
    public TextBox projNameBox = new TextBox(By.xpath("//li[last()]//td[text()='"+projName+"']"));
    public TextBox newProjNameBox = new TextBox(By.xpath("//li[last()]//td[text()='"+newProjName+"']"));
    public Button editMenu = new Button(By.xpath("//div[@style=\"display: block;\"]/img"));
    public Button editButton = new Button(By.xpath("//ul[contains(@style,'block')]/li/a[text()='Edit']"));
    public TextBox newName = new TextBox(By.xpath("//td/div/input[@id='ItemEditTextbox']"));
    public Button submitNewName = new Button(By.xpath("//td/div/img[@id=\"ItemEditSubmit\"]"));


}
