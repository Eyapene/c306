package solveur;

/**
 *
 * Interface pour l'implémentation d'un solveur.
 *
 * @author ATSOU Komi Bi-Ayéfo
 * @author BOKOBOSSO Eyapènè
 *
 */
public interface ISolveur {

    /**
     * Teste la validité de la grille.
     *
     * @return true si la grille est valide, false sinon
     */
    boolean verifierGrille();

    /**
     * Résoud la grille passée en paramètre.
     *
     * @throws IllegalArgumentException si la grille à résoudre n'est pas
     * valable ou si aucune solution n'a pu être calculée
     * @return true si une solution est disponible, false sinon
     */
    boolean resoudre();

    /**
     * Verifie si la grille est résolue.
     *
     *@throws IllegalArgumentException si la grille non valide
     *@return true si la grille est resolue, false sinon
     */
    boolean resolu();

    /**
     * Affiche la solution trouvée à la grille.
     */
    void afficherSolution();
}
