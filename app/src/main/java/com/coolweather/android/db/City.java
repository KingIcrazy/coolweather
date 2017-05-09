package com.coolweather.android.db;

/**
 * Created by Administrator on 2017/5/9.
 */

public class City {

    private int id;

    private String cityName;

    private int cityCode;

    private int Province;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvince() {
        return Province;
    }

    public void setProvince(int province) {
        Province = province;
    }
}
