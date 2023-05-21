package com.kristina.afanaseva222;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {


        System.out.println("Введить назву першой команди");

        Scanner scanner = new Scanner(System.in);

        String teamPolice = scanner.nextLine();

        int PoliceOnePlayer = scanner.nextInt();
        int PoliceTwoPlayer = scanner.nextInt();
        int PoliceFreePlayer = scanner.nextInt();
        int PoliceForPlayer = scanner.nextInt();
        int PoliceFivePlayer = scanner.nextInt();


        System.out.println("Введить назву другой команди");

        Scanner scanner1 = new Scanner(System.in);
        String teamTerrorist = scanner1.nextLine();

        int TerroristOnePlayer = scanner1.nextInt();
        int TerroristTwoPlayer = scanner1.nextInt();
        int TerroristFreePlayer = scanner1.nextInt();
        int TerroristForPlayer = scanner1.nextInt();
        int TerroristFivePlayer = scanner1.nextInt();


        int[] TeamPolice = {PoliceOnePlayer, PoliceTwoPlayer, PoliceFreePlayer, PoliceForPlayer, PoliceFivePlayer};

        double resul = 0;

        if (TeamPolice.length > 0) {
            double sum = 0;
            for (int j = 0; j < TeamPolice.length; j++) {
                sum += TeamPolice[j];
            }
            resul = sum / TeamPolice.length;

            double result = resul;

            System.out.println("Середне арифметическое" + "TeamPolice " + result);
        }

        int[] TeamTerrorist = {TerroristOnePlayer, TerroristTwoPlayer, TerroristFreePlayer, TerroristForPlayer, TerroristFivePlayer};
        double resul1 = 0;

        if (TeamTerrorist.length > 0) {
            double sum = 0;
            for (int x = 0; x < TeamTerrorist.length; x++) {
                sum += TeamTerrorist[x];

            }
            resul1 = sum / TeamTerrorist.length;

            double result1 = resul1;

            System.out.println("Середне арифметическое" + "TeamTerrorist " + result1);

        }

    }


    //      System.out.println("Перемогла команда" + " " + TeamName + "набрала" + result + " " + "очків");

}



