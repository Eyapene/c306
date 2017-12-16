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
     * @return boolean
     */
    boolean verifierGrille();

    /**
     * Résoud la grille passée en paramètre.
     *
     * @throws IllegalArgumentException si la grille à résoudre n'est pas
     * valable ou si aucune solution n'a pu être calculée
     * @return boolean
     */
    boolean resoudre();

    /**
     * Verifie si la grille est résolue.
     *
     *@throws IllegalArgumentException si la grille non valide
     *@return boolean
     */
    boolean resolu();

    /**
     * Affiche la solution trouvée à la grille.
     */
    void afficherSolution(); 
}
