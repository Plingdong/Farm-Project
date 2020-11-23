package FullProgram;

import light.light;
import java.util.Scanner;
import temperature.*;

public class FarmProgram {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int select;
        int input;
        boolean waterPump = false;
        String hello = "1.เซ็คสถานะต้นไม้"
                + '\n' + "2.เซ็คสถานะอุปกณ์"
                + '\n' + "0.ออก"
                + '\n' + "เลือกระบบการทำงาน:";
        /*โปรแกรมวิเคราะห์อุณหภูมิ*/
        double[] tempair = {30.0, 28.0, 22.0, 20.0};
        double[] tempdirt = {36.0, 28.0, 20.0, 0.0};
        TempAnalysis plant = new TempAnalysis(4);
        plant.add(tempair[0], tempdirt[0]);
        plant.add(tempair[1], tempdirt[1]);
        plant.add(tempair[2], tempdirt[2]);
        plant.add(tempair[3], tempdirt[3]);

        /*โปรแกรมวิเคราะห์แสง*/
        light L = new light(25);
        L.analysis();

        do {
            System.out.print(hello);
            select = Sc.nextInt();
            System.out.print('\n');
            switch (select) {
                case 1:
                    do {
                        System.out.println(plant.toString());
                        System.out.print("3.ออก" + '\n' + "เลือกระบบการทำงาน:");
                        select = Sc.nextInt();
                        System.out.print('\n');
                    } while (select != 3);
                    break;

                case 2:
                    do {
                        System.out.print("1.ระบบแสง" + '\n'
                                + "2.ระบบปั้มน้ำ" + '\n'
                                + "3.ออก"
                                + '\n' + "เลือกระบบการทำงาน:");
                        select = Sc.nextInt();
                        System.out.print('\n');

                        switch (select) {
                            case 1:
                                do {
                                    System.out.println(L.toString());
                                    System.out.print("3.ออก" + '\n' + "เลือกระบบการทำงาน:");
                                    select = Sc.nextInt();
                                    System.out.print('\n');
                                } while (select != 3);
                                break;

                            case 2:
                                do {

                                    for (int i = 0; i < plant.getTemp().length; i++) {
                                        System.out.println("ต้นพืช ID ที่:" + i);
                                        if (tempdirt[i] > 25) {
                                            waterPump = true;
                                        } else if (tempdirt[i] <= 25) {
                                            waterPump = false;
                                        }
                                        System.out.println(waterPump);

                                    }
                                    System.out.print("3.ออก" + '\n' + "เลือกระบบการทำงาน:");
                                    select = Sc.nextInt();
                                    System.out.print('\n');
                                } while (select != 3);
                                break;

                        }
                    } while (select != 3);
                    break;
            }

        } while (select != 0);

    }

}
