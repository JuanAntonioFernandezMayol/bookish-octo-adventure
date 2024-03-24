package entornos.git2;

import java.util.HashMap;

public class Comanda {
    private HashMap<String, Integer> platos;
    private Menu menu;

    public Comanda(Menu menu) {
        this.menu = menu;
        this.platos = new HashMap<>();
    }

    public void agregarPlatoComanda(String nombrePlato) {
        int count = platos.containsKey(nombrePlato) ? platos.get(nombrePlato) : 0;
        platos.put(nombrePlato, count + 1);
    }

    public double calcularTotalComanda() {
        double total = 0;
        for (String plato : platos.keySet()) {
            total += menu.getPrecio(plato) * platos.get(plato);
        }
        return total;
    }

    public void mostrarComanda() {
        for (String plato : platos.keySet()) {
            System.out.println(plato + ": " + platos.get(plato));
        }
    }
}
