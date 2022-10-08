package com.company;

abstract class Vehicle {
    private int horsePower;
    private String brand;
    private String model;
    private enum Drive {
        RWD,
        FWD,
        AWD
    }
    private Drive wheelDrive;

    //Setters
    public void setHorsePower(int hp){
        horsePower = hp;
    }

    public void setModel(String m){
        model = m;
    }

    public void setBrand(String b){
        brand = b;
    }

    public void setWheelDrive(String a){
        wheelDrive = Drive.valueOf(a);
    }
    ///////////////////////////

    //Getters
    public int getHorsePower(){
        return horsePower;
    }

    public String getModel(){
        return model;
    }

    public String getBrand(){
        return brand;
    }

    public Drive getWheelDrive(){
        return wheelDrive;
    }
    ///////////////////////////


}
