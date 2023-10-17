package cz.educanet.collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AddToSetTest {

    private Set<Integer> set;

    @BeforeEach
    void setUp() {
        set = set;
    }

    @Test
    public void should_addToSet_When_itemIsNotInSet() {
        List<Integer> list = Arrays.asList(20, 25, 40, 90);

        for (int i = 0; i < list.size(); i++) {
            Assertions.assertTrue(set.add(list.get(i)));
        }

        Utils.listEquals(list, set.toList());
    }

    @Test
    public void should_notAddToSet_When_itemIsInSet() {
        List<Integer> list = Arrays.asList(20, 25, 40, 90);

        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }

        for (int i = 0; i < list.size(); i++) {
            Assertions.assertFalse(set.add(i));
        }

        Utils.listEquals(list, set.toList());
    }
}