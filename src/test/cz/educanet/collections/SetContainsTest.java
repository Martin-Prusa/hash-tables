package cz.educanet.collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SetContainsTest {

    private Set<Integer> set;

    @BeforeEach
    void setUp() {
        set = set;
    }

    @Test
    public void should_ReturnTrue_When_SetContainsItem() {
        List<Integer> list = Arrays.asList(20, 25, 40, 90);

        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }

        for (Integer integer : list) {
            Assertions.assertTrue(set.contains(integer));
        }
    }

    @Test
    public void should_ReturnFalse_When_SetNotContainsItem() {
        List<Integer> list = Arrays.asList(20, 25, 40, 90);
        List<Integer> list2 = Arrays.asList(1,2,3,5);

        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }

        for (Integer integer : list2) {
            Assertions.assertFalse(set.contains(integer));
        }
    }
}