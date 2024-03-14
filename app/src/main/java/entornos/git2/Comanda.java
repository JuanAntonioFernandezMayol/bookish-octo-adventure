package entornos.git2;

import java.util.ArrayList;
import java.util.List;

public class Comanda {
    private Integer codigo;
    private Integer mesa;
    private ArrayList<Plato> platos;

    public Comanda(Integer codigo, Integer mesa, ArrayList<Plato> platos) {
        this.codigo = codigo;
        this.mesa = mesa;
        this.platos = platos;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getMesa() {
        return mesa;
    }

    public void setMesa(Integer mesa) {
        this.mesa = mesa;
    }

    public List<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }
}