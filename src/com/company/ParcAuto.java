package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParcAuto {


    private List<ICar> listCars=new ArrayList<ICar>();

    public static  ParcAuto instance = null;

    public static ParcAuto getInstance(){
        if(instance==null){
            instance = new ParcAuto();
        }
        return instance;
    }

    private ParcAuto(){

    }



    public  void init(String pathName){
        try {
            File file = new File(pathName);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                String []split=data.split("\\s");

                ICar car=null;
                if(split[0].equals("BMW")){
                    car = new BMW(Integer.parseInt(split[1]),Integer.parseInt(split[2]),
                            Integer.parseInt(split[3]), split[4]);
                }
                if(split[0].equals("Audi")){
                    car = new Audi(Integer.parseInt(split[1]),Integer.parseInt(split[2]),
                            Integer.parseInt(split[3]), split[4]);
                }
                if(split[0].equals("Mercedes")){
                    car = new Mercedes(Integer.parseInt(split[1]),Integer.parseInt(split[2]),
                            Integer.parseInt(split[3]), split[4]);
                }

                if(car!=null){
                    listCars.add(car);
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void printAll(){
        for(ICar car :listCars){
            car.DisplayCharacteristics();
        }
    }




    private void save(String pathName){
        try {
            FileWriter writer = new FileWriter(pathName);
            for(ICar car:listCars){

                if(car instanceof BMW){
                    BMW carBMW= (BMW) car;
                    writer.write("BMW "+carBMW.registrationNumber+" "+
                            carBMW.year+" "+carBMW.HP+" "+carBMW.color+"\n");
                }
                if(car instanceof Audi){
                    Audi carAudi= (Audi) car;
                    writer.write("Audi "+carAudi.regisitrationNumber+" "+
                            carAudi.year+" "+carAudi.HP+" "+carAudi.color+"\n");
                }
                if(car instanceof Mercedes){
                    Mercedes carMercedes= (Mercedes) car;
                    writer.write("Mercedes "+carMercedes.regisitrationNumber+" "+
                            carMercedes.year+" "+carMercedes.HP+" "+carMercedes.color+"\n");
                }
            }
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void addCar(String brand,int registrationNumber,int year,
                       int HP,String color){

        ICar car=null;
        if(brand.equals("BMW")){
            car = new BMW(registrationNumber,year ,HP,color);
        }
        if(brand.equals("Audi")){
            car = new Audi(registrationNumber,year ,HP,color);
        }
        if(brand.equals("Mercedes")){
            car = new Mercedes(registrationNumber,year ,HP,color);
        }

        if(car!=null){
            listCars.add(car);
            save("filename.txt");
        }

    }

}
