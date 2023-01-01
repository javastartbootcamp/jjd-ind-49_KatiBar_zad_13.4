package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        // tutaj możesz przeprowadzać manualne testy listy

        // lista powinna być parametryzowana (analogicznie jak java.util.ArrayList czy java.util.LinkedList)
        CustomList<String> customListOfStrings = new CustomList();
        CustomList<Integer> customListOfIntegers = new CustomList();

        customListOfStrings.add("a");
        customListOfStrings.add("ab");
        customListOfStrings.add("abc");
        customListOfStrings.add("abcd");
        System.out.println("Elementy listy: " + customListOfStrings.toString());
        System.out.println("Rozmiar listy: " + customListOfStrings.size());
        System.out.println();
        customListOfStrings.add(1, "abcde");
        System.out.println("Elementy listy: " + customListOfStrings.toString());
        System.out.println("Rozmiar listy: " + customListOfStrings.size());
        System.out.println("Element o indeksie 3: " + customListOfStrings.get(3));
        System.out.println();
        customListOfStrings.remove(3);
        System.out.println("Elementy listy: " + customListOfStrings.toString());
        System.out.println("Rozmiar listy: " + customListOfStrings.size());
    }
}
