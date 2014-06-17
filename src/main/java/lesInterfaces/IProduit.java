package lesInterfaces;

/**
 * Description of IProduit
 *
 * @author frederic radigoy
 */
public interface IProduit {
    
    public String afficherProduit();
    public IProduit getNomProduit();
    public double getPrixProduit();
    public String getDescription();
    public IImage getCheminImage();
    public String getId();
}