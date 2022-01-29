package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var var1 = 3.14;
        System.out.println("Первая переменная = " + var1);
        byte var2 = 120;
        System.out.println("Целочисленная переменная типа byte = " + var2);
        short var3 = 32_000;
        System.out.println("Целочисленная переменная типа short = " + var3);
        int var4 = 148;
        System.out.println("Целочисленная переменная типа int = " + var4);
        long var5 = 1_000_000L;
        System.out.println("Целочисленная переменная типа long = " + var5);
        float var6 = 25E-3f;
        System.out.println("Вещественная переменная типа float = " + var6);
        double var7 = 3.1415926535;
        System.out.println("Вещественная переменная типа double = " + var7);

        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeight = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес обоих боксеров равен " + totalWeight + " кг.");
        var differenceWeight = weightBoxer2 - weightBoxer1;
        System.out.println("Разница в весе боксерами равна " + differenceWeight + " кг.");

        int weightBananas = 5 * 80;
        int weightMilk = 200 / 100 * 105;
        int weightIce_cream = 2 * 100;
        int weightEggs = 4 * 70;
        float totalWeightGramm = weightBananas + weightMilk + weightIce_cream + weightEggs;
        float totalWeightKg = totalWeightGramm / 1000;
        System.out.println("Масса завтрака равна " + totalWeightGramm + " г или " + totalWeightKg + " кг.");

        int target = 7 * 1000;
        int sbros250 = target / 250;
        int sbros500 = target / 500;
        float middle = (sbros250 + sbros500) / 2.0f;
        System.out.println("Если спортсмен будет каждый день будет сбрасывать по 250 г, то ему понадобится " + sbros250 + " дней.");
        System.out.println("Если спортсмен будет каждый день будет сбрасывать по 500 г, то ему понадобится " + sbros500 + " дней.");
        System.out.println("Тренер поставил задачу сбросить 7 кг за " + middle + " дней.");

        int zpMasha = 67760;
        int zpDenis = 83690;
        int zpKris = 76230;
        double zpMashaNew = zpMasha + (zpMasha * 0.1);
        double zpDenisNew = zpDenis + (zpDenis * 0.1);
        double zpKrisNew = zpKris + (zpKris * 0.1);
        double rostMasha = zpMashaNew * 12 - zpMasha * 12;
        double rostDenis = zpDenisNew * 12 - zpDenis * 12;
        double rostKris = zpKrisNew * 12 - zpKris * 12;
        System.out.println("Теперь Маша зарабатывает " + zpMashaNew + " руб." + ", а её годовой доход увеличился на " + rostMasha + " руб.");
        System.out.println("Теперь Денис зарабатывает " + zpDenisNew + " руб." + ", а его годовой доход увеличился на " + rostDenis + " руб.");
        System.out.println("Теперь Кристина зарабатывает " + zpKrisNew + " руб." + ", а её годовой доход увеличился на " + rostKris + " руб.");
    }
}
