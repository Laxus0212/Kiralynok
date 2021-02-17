package kiralynok;

import java.io.IOException;

public class Kiralynok {
    
    private Tabla tabla;

    public Kiralynok() {
        tabla = new Tabla('#');
        megoldasok();
    }
    
    
    
    
    public static void main(String[] args) throws IOException {
        Kiralynok kir = new Kiralynok();
        kir.megoldasok();
        
        
    }

    public void megoldasok() {
        feladat4();
        feladat6();
        feladat9();
        }

    private void feladat4() {
        System.out.println("4.feladat: Üres tábla létrehozása:");
        tabla.megjelenit();
    }

    private void feladat6() {
        System.out.println("6.feladat: Feltöltött tábla:");
        tabla.elhelyez(8);
        tabla.megjelenit();
    }

    private void feladat9() {
        System.out.println("9. feladat: Üres oszlopok és sorok száma:");
        System.out.println("sorok száma: " + tabla.uresSorokSzama());
        System.out.println("oszlopok száma: " + tabla.uresOszlopokSzama());
    }
    
}
