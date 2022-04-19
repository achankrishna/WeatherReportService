package com.ntuc.weather.service;

import org.springframework.stereotype.Service;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;

@Service
public class WeatherReportService {

    public String weatherServiceURL = "https://samples.openweathermap.org/data/2.5/weather?";
    private String ctryCity = null;
    private String apiKey = null;
    Integer appKeyCnt=0;
    Map<String, Integer> apiKeyCntMap = new HashMap<>();
    Map<String, Long> apiKeyTimerMap = new HashMap<>();

    Date dt = new Date();
    Calendar calendar = GregorianCalendar.getInstance();

    //@Bean
    public String getWeatherReport(Map<String, String> customQuery) throws IOException, JSONException {
        String reportDesc;

        calendar.setTime(dt);
        Iterator<Map.Entry<String, String>> iterator = customQuery.entrySet().iterator();
        StringBuilder sb = new StringBuilder();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if(entry.getKey().equals("appid")){
                /*if(apiKeyCntMap.get(entry.getValue())== null) {
                    System.out.println("inside null");
                    apiKeyCntMap.put(entry.getValue(), 1);
                } else {
                    System.out.println("inside else");
                    apiKeyCntMap.put(entry.getValue(), apiKeyCntMap.get(entry.getValue()).intValue()+1);
                }
                if(apiKeyCntMap.get(entry.getKey().equals("appid"))==1){
                    apiKeyTimerMap.put(entry.getValue(),calendar.getTimeInMillis());
                }
                long initTime = apiKeyTimerMap.get(entry.getKey());
                long currentTime = calendar.getTimeInMillis();
                long diffTime = currentTime-initTime;
                diffTime = diffTime/(60 * 60 * 1000);
                if(apiKeyCntMap.get(entry.getKey().equals("appid"))>5 && diffTime>1) {
                    return "API Key rate limit exceeded";
                }*/
            }
            weatherServiceURL = weatherServiceURL+entry+"&";
        }

        weatherServiceURL = weatherServiceURL.substring(0, weatherServiceURL.length() - 1);
        System.out.println("weatherServiceURL::"+weatherServiceURL);
        URL url = new URL(weatherServiceURL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");
        System.out.println("url::"+url.toString());
        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + conn.getResponseCode());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(
                (conn.getInputStream())));

        String output;
        System.out.println("Output from WeatherAPP .... \n");
        while ((output = br.readLine()) != null) {
            sb.append(output);
            System.out.println("output::"+sb.toString());
        }
        String result = sb.toString();
        JSONObject object = new JSONObject(result);
        System.out.println(result.getClass());
        Iterator<String> keys = object.keys();

        while(keys.hasNext()) {
            String key = keys.next();
            if(key.equals("weather")) {
                JSONArray weatkeyArr = object.getJSONArray("weather");
                System.out.println("weatkeyArr::"+weatkeyArr);
                for(int i=0;i<weatkeyArr.length();i++) {
                    JSONObject obj = weatkeyArr.getJSONObject(i);
                    Iterator weathKey = obj.keys();
                    while(weathKey.hasNext()){
                        String k = weathKey.next().toString();
                        if(k.equals("description")) {
                            System.out.println("weathKey : " + k + ", waethvalue : "
                                    + obj.getString(k));
                            reportDesc = obj.getString(k);
                            return reportDesc;
                        }
                    }
                }
            }
        }
        conn.disconnect();
        return output;
    }
}
