package com.iot.com.iot.util;

import iot.accenture.com.iotapplication.MainActivity;

/**
 * Created by amit.gaike on 1/19/2017.
 */

public class Constants {
    public  String heatingControlUrl="HEATINGONTROL";
    public  String humidityControlUrl="HUMIDITSENSORS";
    public  String tempratureControlUrl="TEMPERATRSENSOR";
    public  String baseUrlStart="http://"+MainActivity.ipAddress+":"+MainActivity.port+"/om2m/gscl/applications/";
    public  String baseUrlEnd="/containers/DATA/lates/content";
    public  String authorizationBasicParamValue="YWRtaW46YWRtaW4";


}
