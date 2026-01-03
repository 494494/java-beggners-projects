package dev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static Scanner scan=new Scanner(System.in);
    public static void main(String[] args){

        ArrayList <String> grocery =new ArrayList<>();
        boolean flag=true;
        while (flag){
            printTextB();
            int a= Integer.parseInt(scan.nextLine());
            switch(a) {
                case 1->addItem(grocery);
                case 2->removeItem(grocery);
                default -> flag = false;
            }
            grocery.sort(Comparator.naturalOrder());
            System.out.println(grocery);
        }
    }

    public static void printTextB(){
        String textBox = """
            Available actions:
                0 - to shutdown
                1 - to add item(s) to list (comma delimited list)
                2 - to remove any items (comma delimited list)
                Enter a number for which action you want to do:""";
        System.out.print(textBox+" ");
    }
    public static void addItem(ArrayList<String> groceries){
        System.out.println("Add item(s) [separate items by comma]:");
        String[] items=scan.nextLine().split(",");
        for(String i:items){
            String trimmed=i.trim();
            if(!groceries.contains(trimmed)){
                groceries.add(trimmed);
            }
        }
    }
    public static void removeItem(ArrayList<String> groceries){
        System.out.println("Remove item(s) [separate items by comma]:");
        String[] items=scan.nextLine().split(",");
        for(var i:items){
            String Trimmed=i.trim();
            groceries.remove(Trimmed);
        }
    }
}