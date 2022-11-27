package Collections;

import java.util.Hashtable;
import java.util.Objects;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
//        Vector vector = new Vector();
//        vector.addElement(1);
//        vector.addElement("string");

        Hashtable hashtable = new Hashtable();
        hashtable.put("Robert",12);
        hashtable.put("Magda",13);
        hashtable.put("Agnieszka",15);
        Object o = hashtable.get("Magda");
        System.out.println(o);
    }
}
