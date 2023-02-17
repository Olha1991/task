import java.util.ArrayList;
import java.util.List;

public class Main {
    public static  void main(String[] args) {

        List<String> names = new ArrayList<>(List.of());
        names.add("Masha");
        names.add("Petya");
        names.add("Ivan");
        System.out.println(names);


        List<String> newNames = new ArrayList<>(List.of());
        for (String name : names) {
            String x = name.substring(1);
            newNames.add(x);
        }
        System.out.println(newNames);

    }
}