package entornos.git2;

import java.util.HashMap;

public class App {

    public static void main(String[] args) {
        HashMap<String, Plato> menu = new HashMap<>();
        // afegir_plat(nom, preu): Afegeix un nou plat al menú amb el seu preu.
        Plato plato1 = new Plato("Macarrones", 12);
        Plato plato2 = new Plato("Pizza", 15);
        Plato plato3 = new Plato("Calzone", 13);
        menu.put("Macarrones", plato1);
        menu.put("Pizza", plato2);
        menu.put("Calzone", plato3);
        // eliminar_plat(nom): Elimina un plat del menú.
        menu.remove("Calzone");
        // llistar_menu(): Mostra tots els plats disponibles al menú.
        System.out.println(menu);

        HashMap<String, Comanda> comandas = new HashMap<>();
        // Comanda comanda1 = new Comanda(1, 1, plato1);
    }
}
