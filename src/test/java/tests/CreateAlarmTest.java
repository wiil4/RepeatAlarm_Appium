package tests;

import activities.AlarmScreen;
import activities.MainScreen;
import activities.NameDialog;
import activities.SetTimeDialog;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import session.Session;

import java.util.Date;
import java.util.Random;

public class CreateAlarmTest {
    MainScreen mainScreen = new MainScreen();
    AlarmScreen alarmScreen = new AlarmScreen();
    NameDialog nameDialog = new NameDialog();
    SetTimeDialog setTimeDialog = new SetTimeDialog();
    @Test
    public void createAlarm(){
        mainScreen.tryCloseDialog();
        mainScreen.addAlarmButton.click();
        alarmScreen.onceButton.click();
        alarmScreen.alarmNameButton.click();
        String alarmName = "New"+ new Date().getTime();
        nameDialog.alarmNameTextBox.setText(alarmName);
        nameDialog.okButton.click();
        alarmScreen.setTimeButton.click();
        setTimeDialog.toggleModeButton.click();
        int hour = new Random().nextInt(13);
        int min = new Random().nextInt(60);
        setTimeDialog.setTime(hour, min, getAMPM());
        setTimeDialog.okButton.click();
        alarmScreen.saveAlarmButton.click();
        mainScreen.screenButton.click();
        Assertions.assertTrue(mainScreen.getAlarmWithName(alarmName).isControlDisplayed(),
                "ERROR! Alarm with name: "+alarmName+" not displayed succesfully.");
    }

    private String getAMPM(){
        String[] time = {"AM","PM"};
        return time[(new Random().nextInt(time.length))];
    }
    @AfterEach
    public void closeApp(){
        Session.getSession().closeSession();
    }
}