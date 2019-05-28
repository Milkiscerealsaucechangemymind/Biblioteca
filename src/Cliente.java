import java.util.TreeMap;
public class Cliente {
    private String nombre;
    private int edad;
    private double multa;
    private TreeMap<Integer,Libro> prestados;

    public Cliente(String nombre, int edad, double multa) {
        this.nombre = nombre;
        this.edad = edad;
        this.multa = multa;
        this.prestados=new TreeMap<>();
        
    }
    
    public void agregarPrestado(Libro nuevoprestado){
        this.prestados.put(nuevoprestado.getId(), nuevoprestado);
    }
    
    
}
