import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.sort;

public class Main {
    public static  void main(String[] args) {

        List<String> names = new ArrayList<>(3);
        names.add("Masha");
        names.add("Ivan");
        names.add("Petya");

        System.out.println(names);


        List<String> newNames = new ArrayList<>();
        for (String name : names) {
            String x = name.substring(1);
            newNames.add(x);
            Collections.sort(newNames);
        }
        System.out.println(newNames);

    }
}