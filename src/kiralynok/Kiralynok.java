package kiralynok;

import java.io.IOException;

public class Kiralynok {
    public static void main(String[] args) throws IOException {
        System.out.println("4.feladat: üres tábla létrehozása");
        Tabla tabla = new Tabla('#');
        tabla.megjelenit();
    }
    
}
