package solveur;

import static org.junit.Assert.*;

import org.junit.Test;

import grille.GrilleImpl;

/**
 *
 * Classe de test du solveur de grille.
 *
 * @author ATSOU Komi Bi-Ay�fo
 * @author BOKOBOSSO Eyap�n�
 *
 */
public final class SolveurTest {

    /**
     * Grille correcte.
     */
    private static final char[][] GRILLE_CORRECTE
            = {{'5', '3', '4', '6', '7', '8', '9', '1', '2'},
            {'6', '7', '2', '1', '9', '5', '3', '4', '8'},
            {'1', '9', '8', '3', '4', '2', '5', '6', '7'},
            {'8', '5', '9', '7', '6', '1', '4', '2', '3'},
            {'4', '2', '6', '8', '5', '3', '7', '9', '1'},
            {'7', '1', '3', '9', '2', '4', '8', '5', '6'},
            {'9', '6', '1', '5', '3', '7', '2', '8', '4'},
            {'2', '8', '7', '4', '1', '9', '6', '3', '5'},
            {'3', '4', '5', '2', '8', '6', '1', '7', '9'}};

    /**
     * Grille incorrecte. 5 est pr�sent 2 fois sur la premi�re colonne.
     */
    private static final char[][] GRILLE_INCORRECTE
            = {{'5', '3', '4', '6', '7', '8', '9', '1', '2'},
            {'6', '7', '2', '1', '9', '5', '3', '4', '8'},
            {'5', '9', '8', '3', '4', '2', '5', '2', '7'},
            {'8', '5', '9', '7', '6', '1', '4', '2', '3'},
            {'4', '2', '6', '8', '5', '3', '7', '9', '1'},
            {'7', '1', '3', '9', '2', '4', '8', '5', '6'},
            {'9', '6', '1', '5', '3', '7', '2', '8', '4'},
            {'2', '8', '7', '4', '1', '9', '6', '3', '5'},
            {'3', '4', '5', '2', '8', '6', '1', '7', '9'}};

    /**
     * Grille incorrecte.
     * 2 est pr�sent 2 fois sur la troisi�me ligne.
     * Des caract�res non autoris�s sont pr�sents dans la grille (x, g).
     */
    private static final char[][] GRILLE_INCORRECTE_2
            = {{'5', '3', '4', '6', '7', '8', '9', '1', '2', 'x'},
            {'6', '7', '2', '1', '9', '5', '3', '4', '8', '1'},
            {'5', '9', '8', '3', '4', '2', '5', '2', '7', 't'},
            {'8', '5', '9', '7', '6', '1', '4', '2', '3', '5'},
            {'4', '2', '6', '8', '5', '3', '7', '9', '1', '5'},
            {'7', '1', '3', '9', '2', '4', '8', '5', '6', 'g'},
            {'9', '6', '1', '5', '3', '7', '2', '8', '4', '1'},
            {'2', '8', '7', '4', '1', '9', '6', '3', '5', '2'},
            {'3', '4', '5', '2', '8', '6', '1', '7', '9', '9'}};

    /**
     * Grille incorrecte. T et X pr�sents dans la grille.
     */
    private static final char[][] GRILLE_INCORRECTE_3
            = {{'X', 'T', '4', '6', '7', '8', '9', '1', '2'},
            {'X', '7', '@', '1', '9', '5', '3', '4', '8'},
            {'1', '9', '8', '3', '@', '2', '5', '6', '7'},
            {'8', '5', '9', '7', '6', '1', '4', '2', '3'},
            {'4', '2', '@', '8', '5', '3', '7', '9', '1'},
            {'7', '1', '3', '9', '2', '4', '@', '5', '6'},
            {'9', '6', '1', '5', '@', '7', '2', '8', '4'},
            {'@', '8', '7', '4', '1', '9', '6', '@', '5'},
            {'3', '4', '5', '2', 't', '6', '1', '7', '9'}};

    /**
     * Test du constructeur de GrillImpl.
     */
    @Test
    public void testConstructeurGrilleImpl() {
        SolveurImpl solveur =
                new SolveurImpl(new GrilleImpl(GRILLE_CORRECTE));
    }

    /**
     * Test de la m�thode verifierGrille().
     *
     */
    @Test
    public void testVerifierGrille() {
        SolveurImpl solveur =
                new SolveurImpl(new GrilleImpl(GRILLE_INCORRECTE));
        assertEquals(false, solveur.verifierGrille());
    }

    /**
     * Test de la m�thode resoudre().
     */
    @Test
    public void testResoudre() {
        SolveurImpl solveurGrilleCorrecteResolue =
                new SolveurImpl(new GrilleImpl(GRILLE_CORRECTE));
        assertEquals("Test de la m�thode resoudre().",
                      true,
                      solveurGrilleCorrecteResolue.resoudre());
    }

    /**
     * Test de la m�thode resolu() pour une grille compl�te.
     */
    @Test
    public void testResolu() {
        SolveurImpl solveur
                = new SolveurImpl(new GrilleImpl(GRILLE_CORRECTE));
        boolean solution = solveur.resolu();
        assertEquals(true, solution);
    }

    /**
     * Test de la m�thode resolu()avec exception pour une grille incorrecte.
     */
    @Test
    public void testResoluAvecException() {
        try {
            SolveurImpl solveur
                    = new SolveurImpl(new GrilleImpl(GRILLE_INCORRECTE));
            solveur.resolu();
            fail("L'exception aurait du �tre lev� pour grille non valide");
        } catch (IllegalArgumentException e) {
            //rien a faire, c'est normal qu'on ait l'exception
        }
    }

    /**
     * Test de la m�thode afficherSolution().
     */
    @Test
    public void testafficherSolution() {
        //test avec une grille non compl�te
        SolveurImpl solveur2
                = new SolveurImpl(new GrilleImpl(GRILLE_CORRECTE));
        solveur2.afficherSolution();
    }

}
