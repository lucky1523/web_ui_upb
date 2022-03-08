package pages;

import control.Button;
import control.Label;
import control.TextBox;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class DeleteSection {

    public Button deleteButton = new Button(By.id("ProjShareMenuDel"));
    public TextBox currentName = new TextBox(By.id("CurrentProjectTitle"));

}
