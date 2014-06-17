package lesInterfaces;

public interface IPanier{
	public void AjouterProduit($leProuit);
	public void SupprimerProduit($leProduit);
	public void ViderPanier();
	public void GetTotalPanier();
	public void GetNbrProduit();
	public void AfficherPanier();
	public void RechercherProduit($idProduit);
}