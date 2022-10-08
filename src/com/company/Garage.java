package com.company;

import java.util.Scanner;

public class Garage {
    private static Object Vehicle;
    private static int garageCapacity = 0;
    private static int garageSlot = 0;
    private static Vehicle[] garage;

    public static void garageSize(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many cars can you keep in your garage");
        garageCapacity = Integer.parseInt(input.nextLine());
        garage = new Vehicle[garageCapacity];
    }



    public static void fillGarage(){
        if(Listener.brand.equals("BMW")){
            garage[garageSlot] = new BMW(Listener.brand, Listener.horsePower, Listener.model, Listener.wheelDrive);
        } else if (Listener.brand.equals("Mercedes")) {
            garage[garageSlot] = new Mercedes(Listener.brand, Listener.horsePower, Listener.model, Listener.wheelDrive);
        } else {
            garage[garageSlot] = new Audi(Listener.brand, Listener.horsePower, Listener.model, Listener.wheelDrive);
        }

        garageCapacity--;
        garageSlot++;
    }

    public static void showCars(){
        System.out.println();
        System.out.println("These are your cars ma boi: ");
        System.out.println();
        for (int i = 0; i < garageSlot; i++) {
            System.out.println("=====+CAR " + (i + 1) + "+=====");
            System.out.println("MODEL: " + garage[i].getModel());
            System.out.println("BRAND: " + garage[i].getBrand());
            System.out.println("WHEEL DRIVE: " + garage[i].getWheelDrive());
            System.out.println("HORSE POWER: " + garage[i].getHorsePower());
            System.out.println("=================");
            System.out.println();
        }
    }

    public static int getGarageCapacity(){
        return garageCapacity;
    }
}
