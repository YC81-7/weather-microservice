package com.yc.ifav.domain;



public class WeatherFuture {
    private String dateAndweather;
    private String temperature;
    private String wind;
    private String p1;
    private String p2;


    public WeatherFuture(String dateAndweather, String temperature, String wind, String p1, String p2) {

        this.dateAndweather = dateAndweather;
        this.temperature = temperature;
        this.wind = wind;
        this.p1 = p1;
        this.p2 = p2;

    }
    public String getDateAndweather() {
        return dateAndweather;
    }
    public void setDateAndweather(String dateAndweather) {
        this.dateAndweather = dateAndweather;
    }
    public String getTemperature() {
        return temperature;
    }
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
    public String getWind() {
        return wind;
    }
    public void setWind(String wind) {
        this.wind = wind;
    }
    public String getP1() {
        return p1;
    }
    public void setP1(String p1) {
        this.p1 = p1;
    }
    public String getP2() {
        return p2;
    }
    public void setP2(String p2) {
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "WeatherFuture [dateAndweather=" + dateAndweather + ", temperature=" + temperature + ", wind=" + wind
                + ", p1=" + p1 + ", p2=" + p2 + "]";
    }
}
