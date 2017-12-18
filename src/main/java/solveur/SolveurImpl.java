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
        this.grille = newgrille;
    }

    /**
     * constructeur par d�faut de la classe.
     */
    public SolveurImpl() {
    }

    /**
     * V�rifie la validit� de la grille � r�soudre.
     *
     * @return boolean
     */
    public boolean verifierGrille() {
        char[][] grillecontent = grille.getGrille();
        for (int i = 0; i <grille.getDimension(); i=i+1) {
            for (int j = 0; j < grille.getDimension(); j=j+1) {
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
     * Verification de la r�solution de la grille.
     *
     * @return true si grille resolu, false sinon
     */
    public boolean resolu() {
        if (!verifierGrille()) {
            throw new IllegalArgumentException("Grille non valide.");
        }
        return true;
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
        int part = 3;
        try {
            if (resolu()) {
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
            } else {
                System.out.println("Aucune solution trouv�e.");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Erreur. Grille non valide");
        }
    }

}
