package lesClasses;

import lesInterfaces.IImage;
import lesInterfaces.IProduit;

/*

  @auteur frederic radigoy
*/

public class Produit implements IProduit {
    
    protected String _id;
    
    protected String _nomProduit;
    
    protected IImage _monImage;
    
    protected String _descriptionProduit;
    
    protected double _prixProduit;
            
           
    public Produit(String id, String nomProduit, double prixProduit, IImage uneImage, String description)
    {
        _id = id;
        _nomProduit = nomProduit;
        _prixProduit = prixProduit;
        _monImage = uneImage;
        _descriptionProduit = description;
    }

    public String getIdProduit(){
    
    	return _id;
    }

    @Override
    public String getCheminImage() {
        return _monImage.getCheminImage();
    }

    @Override
    public String getDescription() {
        
        return _descriptionProduit;
    }

    @Override
    public String getNomProduit() {
        return _nomProduit;
    }

    @Override
    public double getPrixProduit() {
        return _prixProduit;
    }

	@Override
	public String Afficher() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IImage getImage() {
		return _monImage;
	}

	@Override
	public String getId() {
		return _id;
	}
}