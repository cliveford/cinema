package org.cliveford.cinema;

import java.util.ArrayList;
import java.util.Arrays;

public class Auditorium {


    private final ArrayList<ArrayList<Integer>> auditorium = new ArrayList<>();

    public Auditorium() {

        ArrayList<Integer> rowA = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
        ArrayList<Integer> rowB = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
        ArrayList<Integer> rowC = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));

        auditorium.add(rowA);
        auditorium.add(rowB);
        auditorium.add(rowC);
    }

    public ArrayList<ArrayList<Integer>> getAuditorium() {
        return auditorium;
    }
}
