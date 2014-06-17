package lesClasses;

import lesInterfaces.IProduit;

public class Produit implements IProduit {
        
        protected $_id;
        
        protected $_nomProduit;
        
        protected $_cheminImage;
        
        protected $_descriptionProduit;
        
        protected $_prixProduit;
                
               
        public void __construct($id, $nomProduit, $prixProduit, $cheminProduit, $description) {
            
            $this->_id = $id;
            $this->_nomProduit = $nomProduit;
            $this->_prixProduit = $prixProduit;
            $this->_cheminImage = $cheminProduit;
            $this->_descriptionProduit = $description;

        }

        public void getIdProduit(){
        
        	return $_id;
        }
        
        public void afficherProduit() {
            return new Produit();
        }


        public void getCheminImage() {
            return $this->_cheminImage;
        }


        public void getDescription() {
            
            return $this->_descriptionProduit;

        }


        public void getNomProduit() {
            return $this->_nomProduit;
        }


        public function getPrixProduit() {
            
            return $this->_prixProduit;

        }
}