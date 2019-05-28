
import java.util.*;
public class Biblioteca {
    private String nombre;
    private int numprestados;
    private ArrayList<Libro> libros;
    private ArrayList<Categoria> categorias;
    private ArrayList<Cliente> clientes;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.categorias=new ArrayList<>();
        this.clientes=new ArrayList<>();
        this.libros=new ArrayList<>();
    }
    
    public void agregarLibro(Libro nuevolibro){
        this.libros.add(nuevolibro);
    }
    
    public void agregarCopiaDeLibro(Libro nuevacopia){
        for(int i=0;i<this.libros.size();i++){
            if(nuevacopia.getTitulo().equals(this.libros.get(i).getTitulo())){
                this.libros.get(i).agregarCopia(nuevacopia);
            }
        }
    }
    
    public void agregarCliente(Cliente nuevocliente){
        this.clientes.add(nuevocliente);
    }
    
    public void agregarCategoria(String nombre,int plazohoras){
        Categoria nuevacategoria=new Categoria(nombre,plazohoras);
        this.categorias.add(nuevacategoria);
    }
    
    public void cambiarCategoriaLibroxTitulo(String titulo,Categoria categoria){
        for(int i=0;i<this.libros.size();i++){
            if(this.libros.get(i).getTitulo().equals(titulo)){
                this.libros.get(i).setCategoria(categoria);
                for(int j=0;j<this.libros.get(i).getCopias().size();j++){
                    this.libros.get(i).getCopias().get(j).setCategoria(categoria);
                }
            }
        }
    }
    
    public void prestarLibro(Cliente cliente,String titulo){
        for(int i=0;i<this.libros.size();i++){
            if(this.libros.get(i).getTitulo().equals(titulo)){
                if(this.libros.get(i).isEstado()==false){
                    cliente.agregarPrestado(this.libros.get(i));
                    this.libros.get(i).setEstado(true);
                }else{
                    for(int j=0;j<this.libros.get(i).getCopias().size();j++){
                        if(this.libros.get(i).getCopias().get(j).isEstado()==false){
                            cliente.agregarPrestado(this.libros.get(i).getCopias().get(j));
                            this.libros.get(i).getCopias().entrySet();
                            break;
                        }
                    }
                }
            }
        }
    }
    
    public double recibirLibro(int id,Cliente cliente,int horas){
        double d=0.0;
        
        return d;
    }
    
}
