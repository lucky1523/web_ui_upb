package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class CreationSection {

    public Button newProjectButton = new Button(By.xpath("//td[text()='Add New Project']"));
    public TextBox newProjectName = new TextBox(By.id("NewProjNameInput"));
    public Button submitNewProjectButton = new Button(By.id("NewProjNameButton"));
    public TextBox todoCreatedProject = new TextBox(By.id("NewItemContentInput"));

}
