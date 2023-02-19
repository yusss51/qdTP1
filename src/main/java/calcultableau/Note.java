package calcultableau;

import java.util.ArrayList;
import java.lang.IllegalArgumentException;

public class Note {

    private String date;
    private ArrayList<Integer> notes;

    public Note(String notedate) {
        date = notedate;
        notes = new ArrayList<Integer>();
    }

    public Note(String notedate, ArrayList<Integer> notenotes) throws IllegalArgumentException {
        date = notedate;

        for (Integer integer : notenotes) {
            if (integer < 0 || integer > 20) {
                throw new IllegalArgumentException("La note doit être entre 0 et 20");
            }
        }

        notes = notenotes;
    }

    public double moyenne() {
        int resultat = 0;
        for (int note : notes) {
            resultat += note;
        }
        return resultat / notes.size();
    }

    public double median() {
        int taille = notes.size();
        if (taille % 2 == 0) {
            return (notes.get(taille / 2) + notes.get(taille / 2 - 1)) / 2;
        } else {
            return notes.get(taille / 2);
        }
    }

    /**
     getters and setters
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<Integer> getNotes() {
        return notes;
    }


    public void setNotes(ArrayList<Integer> notes) {
        this.notes = notes;
    }
}
