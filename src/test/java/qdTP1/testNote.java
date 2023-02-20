package qdTP1;

import calcultableau.Note;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class testNote {



    Note noteTest;

    @BeforeAll
    public static void init() {

        ArrayList <Integer> list = new ArrayList<Integer>();


        list.add(20);
        list.add(20);
        list.add(10);
        list.add(20);

        Note note = new Note("17/02/2023", list);
    }


    /**
     On test la moyenne
     */
    @Test
    void testMoyenneInvalide() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(20);
        list.add(1000);
        list.add(20);
        list.add(10);
        list.add(20);

        list.add(-1000);
        Note noteTest = new Note("17/02/2023", list);


        assertEquals(noteTest.moyenne(), 10);
    }

    /**
     On test pour savoir si les notes sont bien comprises entre 0 et 20
     */
    @Test
    void testZeroVingt() {

        ArrayList<Integer> list = new ArrayList<Integer>();


        list.add(20);
        list.add(1000);
        list.add(20);

        list.add(10);
        list.add(20);
        list.add(-1000);

        boolean isInvalide = false;
        for (Integer val : list) {
            if (val > 20 || val < 0) {
                isInvalide = true;
                break;
            }
        }
        assertTrue(isInvalide);
    }


    /**
     On test la mediane
     */
    @Test
    void testMedian() {


        ArrayList <Integer> listt = noteTest.getNotes();


        ArrayList <Integer> list = new ArrayList<Integer>();


        list.add(10);
        list.add(10);
        list.add(10);
        list.add(15);

        list.add(20);
        list.add(20);
        list.add(20);

        noteTest.setNotes(list);
        assertEquals(noteTest.median(), 20);

        noteTest.setNotes(listt);

    }



}