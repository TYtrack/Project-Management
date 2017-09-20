package com.example.zzz.demo;

/**
 * Created by zzz on 2017/9/14.
 */

public class Contact {
    private String userName;
    private int imageId;

    public Contact(String userName,int imageId){
        this.userName=userName;
        this.imageId=imageId;

    }

    public int getImageId() {
        return imageId;
    }

    public String getName() {
        return userName;
    }


}
