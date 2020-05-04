package com.example.tb_detector;

public class Upload {
    private String location;
    private String result,imageURL;

    public Upload() {
    }

    public Upload(String location, String result,String imageURL) {
        this.location = location;
        this.result = result;
        this.imageURL = imageURL;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }


}



