package calcultableau;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilisateur {

    private String prenom;
    private String nom;
    private String mail;

    private Note note = new Note("18/02/2023");

    public Utilisateur(String prenom, String nom, String mail) {
        this.prenom = prenom;
        this.nom = nom;
        this.mail = mail;
    }

    /**
     getters and setters
     */
    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Veuillez saisir votre mail: ");
            String mail = sc.next("[\\w.-]+@[\\w.-]+\\.[a-z]{2,}");
            System.out.println(mail + " : Email valide !");
        } catch (InputMismatchException e) {
            System.out.println("Email non valide");
        }



    }
}