import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Automovil m1 = new Automovil();
        Automovil m2 = new Automovil();
        Automovil m3 = new Automovil();

        Set<Automovil> autos = new HashSet<>();

        autos.add(m1);
        autos.add(m2);
        autos.add(m3);

        System.out.println(autos);
        System.out.println(autos.size());

        ArrayList<Automovil> autoslist = new ArrayList<>();
        autoslist.add(m1);
        autoslist.add(m2);
        autoslist.add(m3);
        autoslist.add(m2);

        System.out.println(autoslist);
    }
}
