package solveur;

import grille.Grille;
import grille.GrilleImpl;

/**
 *
 * Classe d'impl�mentation de linterface solveur.
 *
 * @author ATSOU Komi Bi-Ay�fo
 * @author BOKOBOSSO Eyap�n�
 *
 */
public final class SolveurImpl implements ISolveur {

    /**
     * Grille de Sudoku.
     */
    private GrilleImpl grille;

    /**
     * Constructeur de la classe.
     *
     * @param newgrille GrilleImpl
     */
    public SolveurImpl(final GrilleImpl newgrille) {
    }

    /**
     * constructeur par d�faut de la classe.
     */
    public SolveurImpl() {
    }

    /**
     * Getter de la grille.
     *
     * @return GrilleImpl
     */
    public GrilleImpl getGrille() {
        return grille;
    }

    /**
     * Setter de la gille.
     *
     * @param newgrille GrilleImpl
     */
    public void setGrille(final GrilleImpl newgrille) {
    }

    /**
     * V�rifie la validit� de la grille � r�soudre.
     *
     * @return boolean
     */
    public boolean verifierGrille() {
        return true;
    }

    /**
     * Verification de la r�solution de la grille.
     *
     * @return boolean
     */
    public boolean resolu() {
        if (!verifierGrille()) {
            throw new IllegalArgumentException("Grille non valide.");
        }
        return resoudre();
    }

    /**
     * R�solution de la grille de Sudoku.
     *
     * @return boolean
     */
    public boolean resoudre() {
        return true;
    }

    /**
     * Affichage de la grille compl�te apr�s r�solution.
     */
    public void afficherSolution() {
    }

}

