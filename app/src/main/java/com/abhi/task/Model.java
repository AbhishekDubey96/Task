package com.abhi.task;

public class Model {

    private int brandLogo;
    private String brandName;
    private int brandStatus;
    private String brandAmount;
    private String brandDate;
    private String brandStats;

    public int getBrandLogo() {
        return brandLogo;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getBrandStatus() {
        return brandStatus;
    }

    public void setBrandLogo(int brandLogo) {
        this.brandLogo = brandLogo;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setBrandStatus(int brandStatus) {
        this.brandStatus = brandStatus;
    }

    public String getBrandAmount() {
        return brandAmount;
    }

    public String getBrandDate() {
        return brandDate;
    }

    public String getBrandStats() {
        return brandStats;
    }

    public void setBrandAmount(String brandAmount) {
        this.brandAmount = brandAmount;
    }

    public void setBrandDate(String brandDate) {
        this.brandDate = brandDate;
    }

    public void setBrandStats(String brandStats) {
        this.brandStats = brandStats;
    }
}
