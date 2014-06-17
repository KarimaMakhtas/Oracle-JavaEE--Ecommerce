<?php



/**
 * Description of IProduit
 *
 * @author frederic radigoy
 */
interface IProduit {
    
    public function afficherProduit($produit);
    public function getNomProduit();
    public function getPrixProduit();
    public function getDescription();
    public function getCheminImage();  
    
}
