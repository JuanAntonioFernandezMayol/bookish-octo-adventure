package entornos.git2;

public class Restaurante {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.agregarPlato("Paella", 15.0);
        menu.agregarPlato("Tortilla", 10.0);

        System.out.println("Menú:");
        menu.listarMenu();

        Comanda comanda = new Comanda(menu);
        comanda.agregarPlatoComanda("Paella");
        comanda.agregarPlatoComanda("Tortilla");

        System.out.println("\nComanda:");
        comanda.mostrarComanda();

        System.out.println("\nTotal de la comanda: " + comanda.calcularTotalComanda());
    }
}
