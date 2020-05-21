import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       /* MySingleton s1 = MySingleton.createInstance();
        MySingleton s2 = MySingleton.createInstance();
        MySingleton s3 = MySingleton.createInstance();
        MySingleton s4 = MySingleton.createInstance();*/

        Cerc c1 = new Cerc(2);
        Cerc c2 = new Cerc(3);
        Cerc c3 = new Cerc(4);
        Dreptunghi d1 = new Dreptunghi(2,3);
        List<FormaGeometrica> formaGeometrica = new ArrayList<>();

        formaGeometrica.add(c1);
        formaGeometrica.add(c2);
        formaGeometrica.add(c3);

        System.out.println(AreaCalculator.calculateArea(formaGeometrica));


    }
}
