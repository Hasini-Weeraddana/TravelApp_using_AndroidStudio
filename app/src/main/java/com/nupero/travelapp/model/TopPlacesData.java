package com.nupero.travelapp.model;

public class TopPlacesData {
    String placeName;
    String districtName;
    String price;
    Integer imageUrl;

    public TopPlacesData(String placeName, String districtName, String price, Integer imageUrl) {
        this.placeName = placeName;
        this.districtName = districtName;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }
}
