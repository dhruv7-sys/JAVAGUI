package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new LinkedList<>();

        list1.add(50);
        list1.add(40);
        list1.add(70);
        list1.add(44);

        System.out.println(list1);
    }
}
