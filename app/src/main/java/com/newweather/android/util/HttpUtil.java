package com.newweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/***
 * 所有的省市县数据都是从服务器端获取到的，这里是和服务器的交互的
 * @author wyt
 */
public class HttpUtil {

    //发起一条HTTP请求调用sendOkHttpRequest()方法，传入请求地址，并注册一个回调来处理服务器相应的就可以了
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
