package com.example.pedometer.igo.Model;

/**
 * Created by vvv98 on 2016/6/1.
 */
public class Province {
    private int id;
    private String provinceName;
    private String ProvinceCode;

    public String getProvinceCode() {
        return ProvinceCode;
    }

    public void setProvinceCode(String ProvinceCode) {
        this.ProvinceCode = ProvinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
