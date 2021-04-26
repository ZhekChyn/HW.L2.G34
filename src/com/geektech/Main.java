package com.geektech;

import java.util.Random;

public class Main {

    // Основное домашнее задание:

    public static String goOut (int ageOfPerson, int temperature){
        if ((ageOfPerson > 20 && ageOfPerson < 45) && (temperature > -20 && temperature < 30)) {
            return "Можно идти гулять";
        }
        if (ageOfPerson < 20 && (temperature > 0 && temperature < 28)) {
            return "Можно идти гулять";
        }
        if (ageOfPerson > 45 && (temperature > -10 && temperature < 25)) {
            return "Можно идти гулять";
        }
        else return "Оставайтесь дома";
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(goOut(44,10));
        System.out.println(goOut(15,16));
        System.out.println(goOut(48,-1));
        System.out.println(goOut(100,-21));
        System.out.println(goOut(999,100));

          // Дополнительное домашнее задание:

        System.out.println(goOut(generateRandomAge(0,150),100));
        System.out.println(generateRandomAge(0,150));
    }

    public static int generateRandomAge(int min, int max) {
        return new Random().nextInt((max - min) + 1) + min;
    }

}
