package dao;

public class bddCommerce implements IbddCommerce {

	public void __construct() {

		}

		'SELECT id, pseudo, email, nom, prenom, refCivilite, dateDeNaissance FROM Client';

		'SELECT id, Reference, libelle, prix, stock, refCategorie, refCivilite, refFournisseur, refTva FROM Produit';
     
		'SELECT login, mdp FROM Administrateur';

		'SELECT id, Reference, prixTotal, refClient, refMoyenPaiement, refExpediteur, refAdresseLivraison, refAdresseFacturation, annulee FROM Commande';

		private $produit;
	
	}