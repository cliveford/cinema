package org.cliveford.cinema;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AuditoriumTest {

    @Test
    void checkGetAuditoriumReturnsCorrectArrayList() {
        Auditorium auditorium = new Auditorium();
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        ArrayList<Integer> rowA = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
        ArrayList<Integer> rowB = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
        ArrayList<Integer> rowC = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
        expected.add(rowA);
        expected.add(rowB);
        expected.add(rowC);
        ArrayList<ArrayList<Integer>> actual = auditorium.getAuditorium();
        assertEquals(expected, actual);

    }
}