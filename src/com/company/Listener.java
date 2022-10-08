package com.company;

import java.util.Scanner;

public class Listener {
    static String brand;
    static String model;
    static String wheelDrive;
    static int horsePower;

    public static void run(){
        Scanner input = new Scanner(System.in);

        //Making a choice
        System.out.println("Would you like to buy a car?");
        String listener = input.nextLine();

        while(listener.equalsIgnoreCase("YES") && Garage.getGarageCapacity() > 0){
            System.out.println("Choose a brand: |BMW| |Mercedes| |Audi|");
            brand = input.nextLine();
            while(!(brand.equals("BMW") || brand.equals("Mercedes") || brand.equals("Audi"))){
                System.out.println("Make a valid choice: |BMW| |Mercedes| |Audi|");
                brand = input.nextLine();
            }

            if(brand.equals("BMW")){
                System.out.println("Choose a model: |X6| |Z4|");
                model = input.nextLine();
                while(!(model.equals("X6") || model.equals("Z4"))){
                    System.out.println("Make a valid choice: |X6| |Z4|");
                    model = input.nextLine();
                }
            } else if (brand.equals("Audi")){
                System.out.println("Choose a model: |Q4| |A4|");
                model = input.nextLine();
                while(!(model.equals("Q4") || model.equals("A4"))){
                    System.out.println("Make a valid choice: |Q4| |A4|");
                    model = input.nextLine();
                }
            } else {
                System.out.println("Choose a model: |G-Class| |GLS-Class|");
                model = input.nextLine();
                while(!(model.equals("G-Class") || model.equals("GLS-Class"))){
                    System.out.println("Make a valid choice: |G-Class| |GLS-Class|");
                    model = input.nextLine();
                }
            }

            System.out.println("Choose a wheel drive: |RWD| |FWD| |AWD|");
            wheelDrive = input.nextLine();

            while (!(wheelDrive.equals("RWD") || wheelDrive.equals("FWD") || wheelDrive.equals("AWD"))){
                System.out.println("Make a valid choice: |RWD| |FWD| |AWD|");
                wheelDrive = input.nextLine();;
            }

            System.out.print("Enter horse power: ");
            horsePower = Integer.parseInt(input.nextLine());

            Garage.fillGarage();

            if(Garage.getGarageCapacity() == 0){
                System.out.println("YOUR GARAGE IS FULL!");
                break;
            }

            System.out.println("Would you like to continue! Type  YES to continue! Type anything to stop!");
            listener = input.nextLine();
        }
    }
}
