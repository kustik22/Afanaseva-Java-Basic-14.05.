package com.kristina.afanaseva222;

import java.util.Random;
import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {
        int[] first = new int[7];

        int[] second = new int[7];

        Random rand = new Random();

        for (int i = 0; i < 7; i++) {

            first[i] = rand.nextInt(10);

            second[i] = rand.nextInt(10);
        }

        Arrays.sort(first);

        Arrays.sort(second);

        int matches = 0;

        for (int i = 0; i < 7; i++) {

            if (first[i] == second[i]) {

                matches++;

            }

        }
        System.out.println(Arrays.toString(first));

        System.out.println(Arrays.toString(second));

        System.out.println("Кількість збігів: " + matches);

    }

}



