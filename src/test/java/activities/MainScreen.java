package activities;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

import java.util.Locale;

public class MainScreen {
    public Button addAlarmButton = new Button(By.id("com.kittoboy.repeatalarm:id/fabAddAlarm"));
    public Button dontShowButton = new Button(By.id("android:id/button3"));
    public Button screenButton = new Button(By.id("com.kittoboy.repeatalarm:id/layoutHowToAlarmOnOff"));

    public void tryCloseDialog(){
        if(dontShowButton.isControlDisplayed()){
            dontShowButton.click();
        }
    }

    public Label getAlarmWithName(String text){
        return new Label(By.xpath("//android.widget.TextView[@text='"+text+"']"));
    }
}
