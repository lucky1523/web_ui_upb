package testClean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.*;

public class CRUDProjectTest extends BaseTodoLy{
    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    MenuSection menuSection = new MenuSection();
    CreationSection creationSection = new CreationSection();
    UpdateSection updateSection = new UpdateSection();
    DeleteSection deleteSection = new DeleteSection();


    @Test
    public void verifyCreateTodoLy() throws InterruptedException {
        mainPage.loginImage.click();
        loginModal.emailTxtBox.setText("erickmallea1234@gmail.com");
        loginModal.pwdTxtBox.setText("12345");
        loginModal.loginButton.click();
        Thread.sleep(2000);
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),"ERROR no se pudo hacer el login");

        //Creation
        creationSection.newProjectButton.click();
        creationSection.newProjectName.setText(projName);
        creationSection.submitNewProjectButton.click();
        Thread.sleep(2000);
        Assertions.assertTrue(creationSection.todoCreatedProject.isControlDisplayed(),"Error");

        //Update
        updateSection.projNameBox.click();
        updateSection.editMenu.click();
        updateSection.editButton.click();
        updateSection.newName.clearSetText("NewLuciano");
        updateSection.submitNewName.click();
        Thread.sleep(2000);
        Assertions.assertTrue(updateSection.newProjNameBox.isControlDisplayed(),"Error");

        //Delete
        updateSection.newProjNameBox.click();
        updateSection.editMenu.click();
        deleteSection.deleteButton.click();
        //Assertions.assertTrue();
        Thread.sleep(2000);


    }
}
