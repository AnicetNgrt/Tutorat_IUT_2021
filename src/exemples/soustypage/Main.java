package src.exemples.soustypage;

import java.util.ArrayList;
import java.util.List;

// Object -> 

public class Main {

    public static List<Object> liste;

    public static void main(String[] args) {
        Object o = new Object();
        Truc t = new Truc();
        Machin machin = new Machin();
        machin.mutltiplier(50);

        liste = new ArrayList<Object>();
        liste.add(machin);
        
        if(liste.get(0) instanceof Machin) {
            Machin element = (Machin) liste.get(0);
        }
        
        System.out.println(o);
        System.out.println(t);
    }
}
