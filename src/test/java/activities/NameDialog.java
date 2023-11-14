package activities;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class NameDialog extends Dialog{
    public TextBox alarmNameTextBox = new TextBox(By.id("com.kittoboy.repeatalarm:id/edit_alarm_name"));

}
