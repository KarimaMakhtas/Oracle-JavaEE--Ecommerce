package lesInterfaces;


public interface IPanier{
	public void AjouterProduit(IProduit leProuit);
	public void SupprimerProduit(IProduit leProduit);
	public void ViderPanier();
	public double GetTotalPanier();
	public int GetNbrProduit();
	public String AfficherPanier();
	public IProduit RechercherProduit(Long idProduit);
}