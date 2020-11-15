package com.company;
import java.io.*;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
	// write your code here
        try {
            ParcAuto myMobility=ParcAuto.getInstance();

            myMobility.init("filename.txt");

            int optiune = 0;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while(optiune <1 || optiune > 5)
            {
                System.out.println("Meniu:\n");
                System.out.println("Afiseaza toate masinile - 1");
                optiune = Integer.parseInt(br.readLine());
                System.out.println("Adauga masina - 2");
                optiune = Integer.parseInt(br.readLine());
                System.out.println("Setare culoare - 3");
                optiune = Integer.parseInt(br.readLine());
                System.out.println("Cautare masina - 4");
                System.out.println("Iesire din program - 5");
                optiune = Integer.parseInt(br.readLine());
            }

            switch (optiune)
            {
                case 5:
                    exit(0);
                    break;
                case 1:
                    myMobility.printAll();
                    break;
                case 2:
                    myMobility.addCar("BMW",34,2013,45,"white");
                    myMobility.printAll();
                    break;
                case 3:
                    myMobility.setColor(35,"black");
                    myMobility.printAll();
                    break;
                case 4:
                    myMobility.findCar(35);
                    myMobility.printAll();
                    break;
                default: break;
            }

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
