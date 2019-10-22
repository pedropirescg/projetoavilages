package modelo;

/**
 *
 * @pedropirescg User
 */
public class Documentos {
    /** Classificação do objeto
     * Atributos
     * Métodos
     * Estado
     */
    private Date data;
    private String caminhoarquivo;
    private int codigocliente;

    public date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getCodigocliente() {
        return codigocliente;
    }

    public void setCodigocliente(int codigocliente) {
        this.codigocliente = codigocliente;
    }

    public String getCaminhoarquivo() {
        return caminhoarquivo;
    }

    public void setCaminhoarquivo(String caminhoarquivo) {
        this.caminhoarquivo = caminhoarquivo;
    }    
    
}