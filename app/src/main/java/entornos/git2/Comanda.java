package entornos.git2;

import java.util.HashMap;

public class Comanda {
    private HashMap<String, Integer> ComandaDePlatos;
    private Menu menu=new Menu();
    
    public Comanda(Menu menu) {
        this.ComandaDePlatos = new HashMap<>();
        this.menu=menu;
    }

    public void agregarPlatoComanda(String nombrePlato) {
    
        ComandaDePlatos.put(nombrePlato, ComandaDePlatos.getOrDefault(nombrePlato, 0) + 1);
    }

    public double calcularTotalComanda() {
        double total = 0.0;

        for (String nombrePlato : ComandaDePlatos.keySet()) {
            int cantidad = ComandaDePlatos.get(nombrePlato);
            double precio = menu.getPrecio(nombrePlato);
            total += precio*cantidad;
        }
        return total;
    }
    public void mostrarComanda(){
        
    }
}
