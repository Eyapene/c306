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
        this.grille = newgrille;
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
        this.grille = newgrille;
    }

    public boolean verifierGrille() {
        char[][] grillecontent = grille.getGrille();
        for (int i = 0; i < grille.getDimension(); i = i + 1) {
            for (int j = 0; j < grille.getDimension(); j = j + 1) {
                if (grillecontent[i][j] != Grille.EMPTY) {
                    char tmp = grillecontent[i][j];
                    grillecontent[i][j] = Grille.EMPTY;
                    try {
                        if (!grille.possible(i, j, tmp)) {
                            return false;
                        }
                    } catch (IllegalArgumentException e) {
                        return false;
                    }
                    grillecontent[i][j] = tmp;
                }
            }
        }
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
        for (int i = 0; i < grille.getDimension(); i++) {
            for (int j = 0; j < grille.getDimension(); j++) {
                if (grille.getGrille()[i][j] == GrilleImpl.EMPTY) {
                    for (int k = 0; k < grille.getDimension(); k = k + 1) {
                        char val = Grille.POSSIBLE_9[k];
                        try {
                            grille.setValue(i, j, val);
                            if (resoudre()) {
                                return true;
                            }
                        } catch (IllegalArgumentException ex) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Affichage de la grille complète après résolution.
     */
    public void afficherSolution() {
    }

}
