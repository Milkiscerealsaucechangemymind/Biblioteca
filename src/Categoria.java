public class Categoria {
    private String nombre;
    private int plazohoras;

    public Categoria(String nombre, int plazohoras) {
        this.nombre = nombre;
        this.plazohoras = plazohoras;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPlazohoras() {
        return plazohoras;
    }

    public void setPlazohoras(int plazohoras) {
        this.plazohoras = plazohoras;
    }
    
    
}
