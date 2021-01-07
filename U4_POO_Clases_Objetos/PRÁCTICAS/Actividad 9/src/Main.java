import MAQUINARIA.Locomotoras;
import MAQUINARIA.Trenes;
import MAQUINARIA.Vagones;
import PERSONAL.Maquinistas;
import PERSONAL.Mecanicos;

public class Main {

    public static void main(String[] args) {
        Mecanicos pepe = new Mecanicos("Pepe Pérez", "666777888");

        Locomotoras loc = new Locomotoras("2222XXX777", 5000, 2000, pepe);

        Maquinistas maquinista = new Maquinistas("Julian Rodríguez", "666555X", 1500, "oficial");

        Trenes tren1 = new Trenes(maquinista, loc);

        System.out.println(tren1);

        Vagones vagon1 = new Vagones(10000, 1500, "MERCANCÍA");
    }
}