package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Grocery {
    public static List<String> groceryList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void startGrocery() {
        System.out.println("Giris yapiniz - 0 - 1 - 2 : ");
        int itemHandler = scanner.nextInt();

        switch (itemHandler) {
            case 0:
                break;
            case 1:
                System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                addItems(scanner.nextLine());
                break;
            case 2:
                System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.");
                removeItems(scanner.nextLine());
                break;
            default:
                System.out.println("Hatali giris");
        }
    }

    public static void addItems(String input) {

    }

    public static void removeItems(String input) {

    }


    public static boolean checkItemIsInList(String product) {
        return groceryList.contains(product);
    }

    public static void printSorted() {
        Collections.sort(groceryList);
        System.out.println(groceryList);
    }
}
