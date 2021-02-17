package kiralynok;

import java.io.IOException;

public class Kiralynok {
    public static void main(String[] args) throws IOException {
        System.out.println("4.feladat: Üres tábla létrehozása");
        Tabla tabla = new Tabla('#');
        tabla.megjelenit();
        System.out.println("6.feladat: Feltöltött tábla");
        tabla.elhelyez(8);
        tabla.megjelenit();
    }
    
}
