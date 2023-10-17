package cz.educanet.collections;

import org.junit.jupiter.api.Assertions;

import java.util.Comparator;
import java.util.List;

public class Utils {
    public static void listEquals(List<Integer> list, List<Integer> list2) {
        list = list.stream().sorted(Comparator.comparingInt(i -> i)).toList();
        list2 = list2.stream().sorted(Comparator.comparingInt(i -> i)).toList();
        if(list.size() == list2.size()) {
            for (int i = 0; i < list.size(); i++) {
                Assertions.assertEquals(list.get(i), list2.get(i));
            }
        }

    }
}
