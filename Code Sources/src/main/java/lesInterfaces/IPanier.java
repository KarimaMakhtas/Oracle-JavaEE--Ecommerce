<?php

public interface IPanier{
	public function AjouterProduit($leProuit);
	public function SupprimerProduit($leProduit);
	public function ViderPanier();
	public function GetTotalPanier();
	public function GetNbrProduit();
	public function AfficherPanier();
	public function RechercherProduit($idProduit);
}
?>