package entornos.git2;

// import java.util.HashMap;
   import java.util.ArrayList;
public class Menu {
   
   private ArrayList<plato> ListaPlatos=new ArrayList<>();
  
  
   public Menu(){
      this.ListaPlatos=new ArrayList<>();
   }


   public double getPrecio(String nombre) {
      Double resultado = null;
      for (plato plato : ListaPlatos) {
         if (plato.getNombre().equals(nombre)) {
           resultado=plato.getPrecio();
         }
      }
      return resultado;
   }

public void agregarPlato(String Nombre, double precio) {
  plato plato1=new plato(Nombre, precio);
  ListaPlatos.add(plato1);
}
public void eliminarPlato(String Nombre){

   for (plato plato : ListaPlatos) {
      if (plato.getNombre().equals(Nombre)) {
        ListaPlatos.remove(plato);
      }
   }
}

public void listarMenu(){
   for (plato plato : ListaPlatos) {
      System.out.println(plato);
   }
}

}
