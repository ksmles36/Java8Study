package functionPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class functionPackageEx2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            list.add(i);

        list.forEach(i -> System.out.print(i + ", "));
//        for (int i : list)
//            System.out.print(i + ", ");
        System.out.println();

        list.removeIf(i -> i % 2 == 0 || i % 3 == 0);
        System.out.println(list);

        list.replaceAll(i -> i * 10);
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("1", "하나");
        map.put("2", "두울");
        map.put("3", "세엣");
        map.put("4", "네엣");

        map.forEach((k, v) -> System.out.print("{" + k + ", " + v + "},"));
        System.out.println();
    }

}
