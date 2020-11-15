package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ParcAuto myMobility=ParcAuto.getInstance();

        myMobility.init("filename.txt");

        myMobility.printAll();

        myMobility.addCar("BMW",34,2013,45,"white");

        myMobility.printAll();

        myMobility.setColor(35,"black");

        myMobility.findCar(35);

    }
}
