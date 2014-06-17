package lesInterfaces;

/**
 * Description of IProduit
 *
 * @author frederic radigoy
 */
public interface IProduit extends ITemplate {
    public String getNomProduit();
    public double getPrixProduit();
    public String getDescription();
    public String getCheminImage();
    public IImage getImage();
    public String getId();
}