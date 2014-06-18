package lesClasses;

import java.util.ArrayList;

import lesInterfaces.IPanier;
import lesInterfaces.IProduit;

public class Panier implements IPanier{
	protected ArrayList<IProduit> _mesProduits;
	
	public Panier()
	{
		_mesProduits = new ArrayList<IProduit>();
	}
	
	public void ViderPanier()
	{
		_mesProduits = new ArrayList<IProduit>();
	}
	
	@Override
	public double GetTotalPanier()
	{
		double totalPanier = 0;
		
		for(IProduit unProduit : _mesProduits)
		{
			totalPanier = totalPanier + unProduit.getPrixProduit();
		}
		
		return totalPanier;
	}
	
	@Override
	public void AjouterProduit(IProduit leProuit) {
		_mesProduits.add(leProuit);
	}

	@Override
	public void SupprimerProduit(IProduit leProduit) {
		boolean aTrouve = false;
		int iProduit = 0;
		int iProduitSup = 0;
		
		while((!aTrouve) && (iProduit<_mesProduits.size()))
		{
			if(_mesProduits.get(iProduit) == leProduit)
			{
				aTrouve = true;
				iProduitSup = iProduit;
			}
			
			iProduit = iProduit +1;
		}
		
		if(aTrouve)
		{
			_mesProduits.remove(iProduitSup);
		}
	}

	@Override
	public IProduit RechercherProduit(Long idProduit) {
		boolean aTrouve = false;
		IProduit leProduitTrouve = null;
		int iProduit = 0;
		
		while((iProduit  < _mesProduits.size()) && !aTrouve)
		{
			if(_mesProduits.get(iProduit).getId() == idProduit)
			{
				aTrouve=true;
				leProduitTrouve = _mesProduits.get(iProduit);
			}
			
			iProduit++;
		}
		
		return leProduitTrouve;
	}

	@Override
	public int GetNbrProduit() {
		return _mesProduits.size();
	}

	@Override
	public String AfficherPanier() {
		// TODO Auto-generated method stub
		return null;
	}}