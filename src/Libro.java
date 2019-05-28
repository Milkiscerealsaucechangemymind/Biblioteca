import java.util.TreeMap;
public class Libro {
    private String titulo;
    private String editorial;
    private int id;
    private Categoria categoria;
    private boolean estado;
    private TreeMap<Integer,Libro> copias;

    public Libro(String titulo, String editorial, int id, Categoria categoria) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.id = id;
        this.categoria = categoria;
        this.estado = false; 
        this.copias=new TreeMap<>();
    }

    
    
    public void agregarCopia(Libro nuevacopia){
        this.copias.put(nuevacopia.getId(),nuevacopia);
    }  

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TreeMap<Integer, Libro> getCopias() {
        return copias;
    }

    public void setCopias(TreeMap<Integer, Libro> copias) {
        this.copias = copias;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

      
    
    
    
    
}
