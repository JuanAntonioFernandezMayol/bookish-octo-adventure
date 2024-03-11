package entornos.git2;

public class Menu {
    private String nombre;
    private Integer precio;

    public Menu(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        System.out.println(nombre);
        return nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
}