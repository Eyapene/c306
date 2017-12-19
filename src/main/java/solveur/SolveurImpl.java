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
     * Verifier la validité de la grille.
     *
     * @return true si la grille est valide, false sinon
     */
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
     * @return true si grille resolue, false sinon
     */
    public boolean resolu() {
        if (!verifierGrille()) {
            throw new IllegalArgumentException("Grille non valide.");
        }
        return true;
    }

    /**
     * Résolution de la grille de Sudoku.
     *
     * @return boolean
     */
    public boolean resoudre() {
        for (int i = 0; i < grille.getDimension(); i++) {
            for (int j = 0; j < grille.getDimension(); j++) {
//                if (grille.getGrille()[i][j] == GrilleImpl.EMPTY) {
                    for (int k = 0; k < grille.getDimension(); k = k + 1) {
                        char val = Grille.POSSIBLE_9[k];
//                        try {
//                            grille.setValue(i + 1, j + 1, val);
//                            if (resoudre()) {
//                                return true;
//                            }
//                        } catch (IllegalArgumentException ex) {
//                            System.out.println("Erreur. Valeur non valide.");
//                        }
                    }
//                    return false;
//                }
            }
        }
        return true;
    }

    /**
     * Affichage de la grille complète après résolution.
     */
    public void afficherSolution() {
        int part = 3;
            for (int i = 0; i < grille.getDimension(); ++i) {
                if (i % part == 0) {
                    System.out.println(" -----------------------");
                }
                for (int j = 0; j < grille.getDimension(); ++j) {
                    if (j % part == 0) {
                        System.out.print("| ");
                    }
                    System.out.print(grille.getGrille()[i][j]);
                    System.out.print(' ');
                }
                System.out.println("|");
            }
            System.out.println(" -----------------------");
    }

}
