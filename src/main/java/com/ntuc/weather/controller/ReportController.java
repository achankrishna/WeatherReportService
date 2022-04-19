package com.ntuc.weather.controller;

import com.ntuc.weather.service.WeatherReportService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class ReportController {

    @Autowired
    WeatherReportService weatherReportService;
	
    @GetMapping("/report")
	@ResponseBody
      public String getReport(@RequestBody Map<String, String> customQuery) throws IOException, JSONException {
    	String report = null;
    	String countrtAndCity= customQuery.get("q");
        //return customQuery.get("apikey");
        return weatherReportService.getWeatherReport(customQuery);
    }

    public void validateRequest(Map<String, String> customQuery){

    }
	 
}
