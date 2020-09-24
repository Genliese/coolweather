package com.coolweather.android.gson;

/**
 * @author Genliese
 * @create 2020-09-24 8:23
 */
public class AQI {
    public AQICITY city;

    public class AQICITY {
        public String aqi;
        public String pm25;
    }
}
