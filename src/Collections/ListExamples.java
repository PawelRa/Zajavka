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

        List<String> citiesList = new ArrayList<>();
        List<String> citiesList2 = new ArrayList<>();
        citiesList.add("Warsaw");
        citiesList.add("Gdańsk");
        citiesList.add("Wrocław");
        System.out.println(citiesList);
        citiesList.add(1, "Szczecin");
        System.out.println(citiesList);
        System.out.println(citiesList.get(0));
        System.out.println(citiesList.get(1));
        System.out.println(citiesList.get(2));
        System.out.println(citiesList.get(3));
//        System.out.println(citiesList.get(4));

        System.out.println(citiesList.size());
        System.out.println(citiesList.isEmpty());
        System.out.println(citiesList2.isEmpty());
        System.out.println(citiesList.contains("Szczecin"));
        System.out.println(citiesList.contains("Szcze"));
        System.out.println(citiesList.remove(1));
        System.out.println(citiesList);
        System.out.println(citiesList.remove("Warsaw"));
        System.out.println(citiesList);
        System.out.println(citiesList.indexOf("Gdańsk"));
        System.out.println("---------------------");
        String[] array = citiesList.toArray(new String[0]);
        System.out.println(Arrays.toString(array));

        citiesList.clear(); // kasuje zawartość
        System.out.println(citiesList);
    }
}
