package com.klc.dto;

public class CreateOrderRequest {

    private String loadingCity;
    private String unloadingCity;
    private String cargoType;
    private Double weight;
    private String phone;
    private String comment;

    public String getLoadingCity() {
        return loadingCity;
    }

    public void setLoadingCity(String loadingCity) {
        this.loadingCity = loadingCity;
    }

    public String getUnloadingCity() {
        return unloadingCity;
    }

    public void setUnloadingCity(String unloadingCity) {
        this.unloadingCity = unloadingCity;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
