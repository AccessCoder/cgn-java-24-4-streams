package de.neuefische;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> fruits = List.of("Banana", "Pear", "Apple", "Pineapple", "Grapefruit", "Coconut");

        for (String fruit:fruits) {
            if (fruit.contains("a")){
                System.out.println(fruit);
            }
        }

        //1. Schritt -> Stream beginnen
        String sum = "Fruits in the Basket = " +fruits.stream()
                //2. Schritt ->
                .filter(currywurst -> currywurst.contains("a")) //lambda
                .map(currywurst -> "Fruit in basket= "+currywurst)
                .peek(currywurst -> System.out.println(currywurst))

                //3. Terminator

                .collect(Collectors.joining(", "));

        System.out.println(sum);
    }

    public boolean checkFruit(String fruit){
        return fruit.contains("a");
    }
}