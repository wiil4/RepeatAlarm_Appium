package factory;

import java.util.HashMap;

public class FactoryDevice {
    public static IDevice make(String type){
        HashMap<String, IDevice> devicesMap = new HashMap<String, IDevice>();
        devicesMap.put("android", new Android());
        devicesMap.put("ios", new Ios());

        return devicesMap.containsKey(type.toLowerCase())?
                devicesMap.get(type.toLowerCase()):
                devicesMap.get("android");
    }
}
