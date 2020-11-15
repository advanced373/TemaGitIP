package com.company;

import java.io.File;
import java.io.FileNotFoundException;
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

}
