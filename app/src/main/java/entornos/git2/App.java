package entornos.git2;

import java.io.IOException;
import java.util.HashMap;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        HashMap<String, Menu> menu = new HashMap<>();
        Menu menu1 = new Menu("Macarrones", 12);
        Menu menu2 = new Menu("Pizza", 15);
        Menu menu3 = new Menu("Calzone", 13);

    }

}
