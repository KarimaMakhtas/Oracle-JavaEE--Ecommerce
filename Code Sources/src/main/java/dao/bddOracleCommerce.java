package dao;

public abstract class bddOracleCommerce() {

	protected $hote = '127.0.0.1';
	protected $port = '1521'; // port par défaut
	protected $service = 'TEST';
	protected $utilisateur = 'TEST';
	protected $motdepasse = 'MotDePasse';
	protected $reponse;
	protected $command;

	$lien_base =
	"oci:dbname=(DESCRIPTION =
	(ADDRESS_LIST =
		(ADDRESS =
			(PROTOCOL = TCP)
			(Host = ".$hote .")
			(Port = ".$port."))
	)
	(CONNECT_DATA =
		(SERVICE_NAME = ".$service.")
	)
	)";

	public void seConnecter() {

		try
		{
			// connexion à la base Oracle et création de l'objet
			$connexion = oci_pconnect($lien_base, $utilisateur, $motdepasse);
		}
		catch (PDOException $erreur)
		{
			echo $erreur->getMessage();
		}
	}

	public void seDeconnecter() {
		$reponse->closeCursor();
		oci_close(connexion);
	}
	

	public void __construct() {

	}

	public void ajouterParametre($nomDuParametre, $valeurDuParametre) {
		oci_bind_by_name($command, ':p1', $p1);
	}

	public void definirProcedure($uneChaine) {
		$command = oci_parse($connexion, $uneChaine);
	}

	private void executerUneCommande() {
		return oci_execute($command);
	}

	'SELECT id, pseudo, email, nom, prenom, refCivilite, dateDeNaissance FROM Client';

	'SELECT id, Reference, libelle, prix, stock, refCategorie, refCivilite, refFournisseur, refTva FROM Produit';

    'SELECT login, mdp FROM Administrateur';

	'SELECT id, Reference, prixTotal, refClient, refMoyenPaiement, refExpediteur, refAdresseLivraison, refAdresseFacturation, annulee FROM Commande';

	public void seConnecter();
	public void seDecnnecter();

	public void listeDeProduit() {
		seConnecter();
		definirProcedure('begin listeDeProduits(); end;');
		executerUneCommande();
		$reponse = executerUneCommande();
		seDecnnecter();
	}

	public void getProduit() {
		return $produit;
	}

	public void setProduits() {
		$this->produit = $produit;
	}



	public void getClient() {
		return $this->client;
	}

	public void setClient($Client client) {
		$this->client = $client;
	}



	public void getUtilisateur() {
		return $this->utilisateur;
	}

	public void setUtilsateur($Utilisateur utilisateur) {
		$this->utilisateur = $utilisateur;
	}



	public void getAdministrateur() {
		return $this->Administrateur;
	}

	public void setAdministrateur($Administrateur Administrateur) {
		$this->Administrateur = $Administrateur;
	}



	public void getCommande() {
		return $this->Commande;
	}

	public void setCommande($Commande Commande) {
		$this->Commande = $Commande;
	}
}
	