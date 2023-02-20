package qdTP1;

import calcultableau.Utilisateur;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class testUtilisateur {

    @BeforeAll
    public static void init() {
        Utilisateur enseignant = new Utilisateur("Alain", "Dupont", "alain.dupont@iut.fr");
    }

    @Test
    void test() {
        Utilisateur enseignant = new Utilisateur("Alain", "Dupont", "alain.dupont@iut.fr");
        assertEquals(enseignant.getPrenom(), "Alain");
    }

    /**
     On test si le nom et le prenom contiennent au moins un carcatere
     */
    @Test
    void testCaractereNomPrenom() {
        Utilisateur enseignant = new Utilisateur("Alain", "Dupont", "alain.dupont@iut.fr");
        String nom = enseignant.getNom();
        String prenom = enseignant.getPrenom();



        assertThat(nom).isNotEmpty();
        assertThat(prenom).isNotEmpty();

    }

    /**
     On test si le nom et le prenom contiennent que des lettres
     */
    @Test
    void testLettresNomPrenom() {
        Utilisateur enseignant = new Utilisateur("Alain", "Dupont", "alain.dupont@iut.fr");
        String nom = enseignant.getNom();
        String prenom = enseignant.getPrenom();



        assertThat(nom).contains("Dupont");
        assertThat(prenom).contains("Alain");
        assertThat(nom).doesNotContain("1").doesNotContain("2").doesNotContain("3").doesNotContain("4")
                .doesNotContain("5").doesNotContain("6").doesNotContain("7").doesNotContain("8").doesNotContain("9")
                .doesNotContain("0");
        assertThat(prenom).doesNotContain("1").doesNotContain("2").doesNotContain("3").doesNotContain("4")
                .doesNotContain("5").doesNotContain("6").doesNotContain("7").doesNotContain("8").doesNotContain("9")
                .doesNotContain("0");
    }

    /**
     On test l'email de  l'utilisateur
     */
    @Test
    void testEmail() {
        Utilisateur enseignant = new Utilisateur("Alain", "Dupont", "alain.dupont@iut.fr");
        assertEquals(enseignant.getMail(), "alain.dupont@iut.fr");
    }

    /*
    On test le nom de l'utilisateur
     */

    @Test
    void testNom() {
        Utilisateur enseignant = new Utilisateur("Alain", "Dupont", "alain.dupont@iut.fr");
        assertEquals(enseignant.getNom(), "Dupont");
    }




}
