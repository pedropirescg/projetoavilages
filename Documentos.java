package modelo;

/**
 *
 * @author User
 */
public class Documentos {
    
    private Date data;
    private String caminhoarquivo;
    private int codigocliente;

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the caminhoarquivo
     */
    public String getCaminhoarquivo() {
        return caminhoarquivo;
    }

    /**
     * @param caminhoarquivo the caminhoarquivo to set
     */
    public void setCaminhoarquivo(String caminhoarquivo) {
        this.caminhoarquivo = caminhoarquivo;
    }    
    
}