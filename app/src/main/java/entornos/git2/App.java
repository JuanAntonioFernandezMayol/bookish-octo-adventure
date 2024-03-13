package entornos.git2;

import java.util.HashMap;

public class App {

    public static void main(String[] args) {
        HashMap<String, Menu> menu = new HashMap<>();
        Menu plato1 = new Menu("Macarrones", 12);
        Menu plato2 = new Menu("Pizza", 15);
        Menu plato3 = new Menu("Calzone", 13);
        menu.put("Macarrones", plato1);
        menu.put("Pizza", plato2);
        menu.put("Calzone", plato3);
    }

}
