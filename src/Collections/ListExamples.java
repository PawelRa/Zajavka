package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {
//        Vector vector = new Vector();
//        vector.addElement(1);
//        vector.addElement("string");

//        Hashtable hashtable = new Hashtable();
//        hashtable.put("Robert", 12);
//        hashtable.put("Magda", 13);
//        hashtable.put("Agnieszka", 15);
//        Object o = hashtable.get("Magda");
//        System.out.println(o);

//        List<String> citiesList = new ArrayList<>();
//        List<String> citiesList2 = new ArrayList<>();
//        citiesList.add("Warsaw");
//        citiesList.add("Gdańsk");
//        citiesList.add("Wrocław");
//        System.out.println(citiesList);
//        citiesList.add(1, "Szczecin");
//        System.out.println(citiesList);
//        System.out.println(citiesList.get(0));
//        System.out.println(citiesList.get(1));
//        System.out.println(citiesList.get(2));
//        System.out.println(citiesList.get(3));
////        System.out.println(citiesList.get(4));
//
//        System.out.println(citiesList.size());
//        System.out.println(citiesList.isEmpty());
//        System.out.println(citiesList2.isEmpty());
//        System.out.println(citiesList.contains("Szczecin"));
//        System.out.println(citiesList.contains("Szcze"));
//        System.out.println(citiesList.remove(1));
//        System.out.println(citiesList);
//        System.out.println(citiesList.remove("Warsaw"));
//        System.out.println(citiesList);
//        System.out.println(citiesList.indexOf("Gdańsk"));
//        System.out.println("---------------------");
//        String[] array = citiesList.toArray(new String[0]);
//        System.out.println(Arrays.toString(array));
//
//        citiesList.clear(); // kasuje zawartość
//        System.out.println(citiesList);

        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("Whatever");
        listOfStrings.add("Second element");
        List<String> testList = Arrays.asList("String1", "String2");
        listOfStrings.addAll(testList);
        listOfStrings.add("Whatever");
//        System.out.println(listOfStrings);
//        testList.add("String3");
//        System.out.println(testList);

        for (int i = 0; i < listOfStrings.size(); i++) {
            System.out.println(listOfStrings.get(i));
        }
        System.out.println("------------------------");
        System.out.println(listOfStrings.contains("Whatever"));
        System.out.println(listOfStrings.contains("whatever"));
        System.out.println(listOfStrings.contains(2));
        System.out.println(listOfStrings.containsAll(testList));
        System.out.println(listOfStrings.indexOf("What"));
        System.out.println(listOfStrings.indexOf("Whatever"));
        System.out.println(listOfStrings.lastIndexOf("Whatever"));
        System.out.println(listOfStrings.indexOf("whatever"));
        System.out.println("------------------------");
//        Object[] ourArray = listOfStrings.toArray();
//        System.out.println(ourArray);
//        String[] ourArray = listOfStrings.toArray(new String[listOfStrings.size()]);
        String[] ourArray = listOfStrings.toArray(new String[0]);
        System.out.println(Arrays.toString(ourArray));
    }
}
