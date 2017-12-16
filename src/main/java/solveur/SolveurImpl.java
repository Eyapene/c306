package solveur;

import grille.Grille;
import grille.GrilleImpl;

/**
 *
 * Classe d'implémentation de linterface solveur.
 *
 * @author ATSOU Komi Bi-Ayéfo
 * @author BOKOBOSSO Eyapènè
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
     * constructeur par défaut de la classe.
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
     * Vérifie la validité de la grille à résoudre.
     *
     * @return boolean
     */
    public boolean verifierGrille() {
        return true;
    }

    /**
     * Verification de la résolution de la grille.
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
     * Résolution de la grille de Sudoku.
     *
     * @return boolean
     */
    public boolean resoudre() {
        return true;
    }

    /**
     * Affichage de la grille complète après résolution.
     */
    public void afficherSolution() {
    }

}

