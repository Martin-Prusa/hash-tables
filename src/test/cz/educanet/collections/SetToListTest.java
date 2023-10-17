package cz.educanet.collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SetToListTest {

    private Set<Integer> set;

    @BeforeEach
    void setUp() {
        set = set;
    }

    @Test
    public void should_Equals() {
        List<Integer> list = Arrays.asList(20, 25, 40, 90);
        List<Integer> list2 = Arrays.asList(20, 25, 40, 25, 90);

        for (int i = 0; i < list2.size(); i++) {
            Assertions.assertTrue(set.add(list2.get(i)));
        }

        Utils.listEquals(list, set.toList());
    }


}