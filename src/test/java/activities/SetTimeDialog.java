package activities;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class SetTimeDialog extends Dialog{
    public Button toggleModeButton = new Button(By.id("android:id/toggle_mode"));
    public TextBox hourTextBox = new TextBox(By.id("android:id/input_hour"));
    public TextBox minTextBox = new TextBox(By.id("android:id/input_minute"));
    private Button amPMDropdown = new Button(By.id("android:id/am_pm_spinner"));
    public void setTime(int hour, int minute, String time){
        hourTextBox.setText(Integer.toString(hour));
        minTextBox.setText(Integer.toString(minute));
        amPMDropdown.click();
        new Button(By.xpath("//android.widget.CheckedTextView[@text='"+time+"']")).click();
    }
}
