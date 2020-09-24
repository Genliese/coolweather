package com.coolweather.android.util;

import okhttp3.OkHttp;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @author Genliese
 * @create 2020-09-23 15:54
 */
public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
