package activities;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import session.Session;

import java.util.List;
import java.util.Random;

public class AlarmScreen {
    public Button onceButton = new Button(By.id("com.kittoboy.repeatalarm:id/rbOnce"));
    public Button alarmNameButton = new Button(By.id("com.kittoboy.repeatalarm:id/tv_alarm_name"));
    public Button setTimeButton = new Button(By.id("com.kittoboy.repeatalarm:id/tvAlarmTime"));
    public Button saveAlarmButton = new Button(By.id("com.kittoboy.repeatalarm:id/btn_save"));

}
