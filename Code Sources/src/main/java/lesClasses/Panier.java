<?php
	require_once 'IPanier.php';
	require_once 'IProduit.php';
	
	public class Panier implements IPanier{
		protected array $_mesProduits;
		
		public function __construct()
		{
			$this->_mesProduits = new array();
		}
		
		public function AjouterProduit($leProuit)
		{
			$nouvelInice = count($this->$_mesProduits)+1;
			
			$this->_mesProduits[$nouvelIndice] = $leProduit;
		}
		
		public function SupprimerProduit($leProduit)
		{
			$aTrouve = false;
			$iProduit = 0;
			$iProduitSup = null;
			
			while(!aTrouve and $iProduit<count($this->_mesProduits))
			{
				if($produit == $leProuit)
				{
					$aTrouve = true;
					
				}
				
				$iProduit = $iProduit +1;
			}
			
			if($iProduitSup != null)
			{
				unset($this->_mesProduits[$iProuitSup]);
			}
		}
		
		public function ViderPanier()
		{
			$this->_mesProduits = new array();
		}
		
		public function GetTotalPanier()
		{
			$totalPanier = 0;
			
			for($this->_mesProduits as $unProduit)
			{
				$totalPanier = $totalPanier + $unProduit->GetPrixPoduit();
			}
			
			return $totalPanier;
		}
		
		public function GetNbrProduit()
		{
			return count($this->_mesProduits);
		}
		
		public function AfficherPanier()
		{
		}
		
		public function RechercherProduit($idProduit)
		{
			$aTrouve = false;
			
			$leProduitTrouve = null;
			
			while(($this->_mesProduits as $unProduit) and !aTrouve)
			{
				if($unProduit->GetId() == $idProduit)
				{
					$leProduitTrouve = $unProduit;
					$aTrouve=true;
				}
			}
			
			return $leProduitTrouve;
		}
	}
?>