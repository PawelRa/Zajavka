package Collections;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {
//        Deque<String> list = new LinkedList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        ArrayList<String> arrayList = new ArrayList<>();
        linkedList.add("Warsaw");
        linkedList.add("Gdańsk");
        linkedList.add("Poznań");

        System.out.println(linkedList);
        linkedList.addFirst("Białystok");
        System.out.println(linkedList);
        linkedList.addLast("Szczecin");
        System.out.println(linkedList);
    }
}
