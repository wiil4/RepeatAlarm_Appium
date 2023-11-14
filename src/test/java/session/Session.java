package session;

import factory.FactoryDevice;
import io.appium.java_client.AppiumDriver;

public class Session {
    private static Session session = null;
    private AppiumDriver device;
    private Session(){
        device = FactoryDevice.make("android").create();
    }
    public static Session getSession(){
        if(session == null)
            session = new Session();
        return session;
    }
    public AppiumDriver getDevice(){
        return device;
    }
}
