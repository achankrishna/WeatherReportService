package com.ntuc.weather.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="weather_reports")
@EntityListeners(AuditingEntityListener.class)
public class Report {

	 @Id
	 @GeneratedValue
	 @Column(name="id",nullable=false)
	 private long id;
	 
	 @Column(name="coord_lon",nullable=true)
	 private Double coordLan;
	 
	 @Column(name="coord_lat",nullable=true)
	 private long coordLat;
	 
	 @Column(name="weather_id",nullable=true)
	 private long weatherId;
	 
	 @Column(name="weather_main",nullable=true)
	 private String weatherMain;
	 
	 @Column(name="weather_desc",nullable=true)
	 private String weatherDescription;
	 
	 @Column(name="weather_Icon", nullable=true)
	 private String weatherIcon;
	 
	 @Column(name="base", nullable=true)
	 private String base;
	 
	 @Column(name="main_Temp", nullable=true)
	 private Double mainTemp;
	 
	 @Column(name="main_pressure", nullable=true)
	 private Double mainPressure;
	 
	 @Column(name="main_humidity", nullable=true)
	 private Integer mainHumidity;
	 
	 @Column(name="main_temp_min", nullable=true)
	 private Double mainTempMin;
	 
	 @Column(name="main_temp_max", nullable=true)
	 private Double mainTempMax;
	 
	 @Column(name="visibility", nullable=true)
	 private Integer visibility;
	 
	 @Column(name="wind_speed", nullable=true)
	 private Double windSpeed;
	 
	 @Column(name="wind_deg", nullable=true)
	 private Integer windDeg;
	 
	 @Column(name="cloud_all", nullable=true)
	 private Integer cloudAll;
	 
	 @Column(name="date", nullable=false)
	 private Date date;
	 
	 @Column(name="sys_type", nullable=false)
	 private Integer sysType;
	 
	 @Column(name="sys_id", nullable=false)
	 private Integer sysId;
	 
	 @Column(name="sys_message", nullable=false)
	 private Date sysMessage;
	 
	 @Column(name="sys_country", nullable=false)
	 private String sysCountry;
	 
	 public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Double getCoordLan() {
		return coordLan;
	}

	public void setCoordLan(Double coordLan) {
		this.coordLan = coordLan;
	}

	public long getCoordLat() {
		return coordLat;
	}

	public void setCoordLat(long coordLat) {
		this.coordLat = coordLat;
	}

	public long getWeatherId() {
		return weatherId;
	}

	public void setWeatherId(long weatherId) {
		this.weatherId = weatherId;
	}

	public String getWeatherMain() {
		return weatherMain;
	}

	public void setWeatherMain(String weatherMain) {
		this.weatherMain = weatherMain;
	}

	public String getWeatherDescription() {
		return weatherDescription;
	}

	public void setWeatherDescription(String weatherDescription) {
		this.weatherDescription = weatherDescription;
	}

	public String getWeatherIcon() {
		return weatherIcon;
	}

	public void setWeatherIcon(String weatherIcon) {
		this.weatherIcon = weatherIcon;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public Double getMainTemp() {
		return mainTemp;
	}

	public void setMainTemp(Double mainTemp) {
		this.mainTemp = mainTemp;
	}

	public Double getMainPressure() {
		return mainPressure;
	}

	public void setMainPressure(Double mainPressure) {
		this.mainPressure = mainPressure;
	}

	public Integer getMainHumidity() {
		return mainHumidity;
	}

	public void setMainHumidity(Integer mainHumidity) {
		this.mainHumidity = mainHumidity;
	}

	public Double getMainTempMin() {
		return mainTempMin;
	}

	public void setMainTempMin(Double mainTempMin) {
		this.mainTempMin = mainTempMin;
	}

	public Double getMainTempMax() {
		return mainTempMax;
	}

	public void setMainTempMax(Double mainTempMax) {
		this.mainTempMax = mainTempMax;
	}

	public Integer getVisibility() {
		return visibility;
	}

	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}

	public Double getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(Double windSpeed) {
		this.windSpeed = windSpeed;
	}

	public Integer getWindDeg() {
		return windDeg;
	}

	public void setWindDeg(Integer windDeg) {
		this.windDeg = windDeg;
	}

	public Integer getCloudAll() {
		return cloudAll;
	}

	public void setCloudAll(Integer cloudAll) {
		this.cloudAll = cloudAll;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getSysType() {
		return sysType;
	}

	public void setSysType(Integer sysType) {
		this.sysType = sysType;
	}

	public Integer getSysId() {
		return sysId;
	}

	public void setSysId(Integer sysId) {
		this.sysId = sysId;
	}

	public Date getSysMessage() {
		return sysMessage;
	}

	public void setSysMessage(Date sysMessage) {
		this.sysMessage = sysMessage;
	}

	public String getSysCountry() {
		return sysCountry;
	}

	public void setSysCountry(String sysCountry) {
		this.sysCountry = sysCountry;
	}

	public Date getSysSunrise() {
		return sysSunrise;
	}

	public void setSysSunrise(Date sysSunrise) {
		this.sysSunrise = sysSunrise;
	}

	public Date getSysSunset() {
		return sysSunset;
	}

	public void setSysSunset(Date sysSunset) {
		this.sysSunset = sysSunset;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	@Column(name="sys_sunrise", nullable=false)
	 private Date sysSunrise;
	 
	 @Column(name="sys_sunset", nullable=false)
	 private Date sysSunset;
	 
	 @Column(name="name", nullable=false)
	 private String name;
	 
	 @Column(name="cod", nullable=false)
	 private Integer cod;
	 
	 
	 
}
