package solveur;

/**
 *
 * Interface pour l'impl�mentation d'un solveur.
 *
 * @author ATSOU Komi Bi-Ay�fo
 * @author BOKOBOSSO Eyap�n�
 *
 */
public interface InterfaceSolveur {
    
    /**
     * Teste la validit� de la grille.
     *
     * @return boolean
     */
    boolean verifierGrille();

    /**
     * R�soud la grille pass�e en param�tre.
     *
     * @throws IllegalArgumentException si la grille � r�soudre n'est pas
     * valable ou si aucune solution n'a pu �tre calcul�e
     * @return boolean
     */
    boolean resoudre();
    
    /**
     * Verifie si la grille est r�solue.
     *
     *@throws IllegalArgumentException si grille non valide
     *@return boolean
     */
    public boolean resolu();    

    /**
     * Affiche la solution trouv�e � la grille.
     */
    void afficherSolution();   
}
