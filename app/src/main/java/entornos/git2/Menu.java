package entornos.git2;

import java.util.HashMap;

public class Menu {
    private HashMap<String, Double> platos;

    public Menu() {
        this.platos = new HashMap<>();
    }

    public void agregarPlato(String nombre, double precio) {
        platos.put(nombre, precio);
    }

    public void eliminarPlato(String nombre) {
        platos.remove(nombre);
    }

    public void listarMenu() {
        for (String plato : platos.keySet()) {
            System.out.println(plato + ": " + platos.get(plato));
        }
    }

    public Double getPrecio(String nombre) {
        if (platos.containsKey(nombre)) {
            return platos.get(nombre);
        }
        return null;
    }
}
