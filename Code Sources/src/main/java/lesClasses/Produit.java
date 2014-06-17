/*

  @auteur frederic radigoy
*/






<?php

    class Produit implements IProduit {
        
        protected $_id;
        
        protected $_nomProduit;
        
        protected $_cheminImage;
        
        protected $_descriptionProduit;
        
        protected $_prixProduit;
                
               
        function __construct($id, $nomProduit, $prixProduit, $cheminProduit, $description) {
            
            $this->_id = $id;
            $this->_nomProduit = $nomProduit;
            $this->_prixProduit = $prixProduit;
            $this->_cheminImage = $cheminProduit;
            $this->_descriptionProduit = $description;

        }

        public function getIdProduit(){
        
        	return $_id;
        }
        
        public function afficherProduit() {
            return new Produit();
        }


        public function getCheminImage() {
            return $this->_cheminImage;
        }


        public function getDescription() {
            
            return $this->_descriptionProduit;

        }


        public function getNomProduit() {
            return $this->_nomProduit;
        }


        public function getPrixProduit() {
            
            return $this->_prixProduit;

        }

}