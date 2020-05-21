package DecoratorPattern;

public class DecoratorMain {

    public static void main(String[] args) {

        Bautura cafea = new Cafea();

        System.out.println(cafea.decorate());

        Bautura cafeaCuLapte = new Lapte(new Cafea());

        System.out.println(cafeaCuLapte.decorate());

        Bautura cafeaCuLapteSiZahar = new Zahar(new Lapte(new Cafea()));

        System.out.println(cafeaCuLapteSiZahar.decorate());

        BauturaFactory bf = new MyBauturaFactory();

        Bautura cafeaDubluLapte = bf.createBautura(BauturaType.CAFEA_DUBLU_LAPTE);

        System.out.println(cafeaCuLapte.decorate());

    }
}
