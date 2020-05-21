package DecoratorPattern;

public class MyBauturaFactory implements BauturaFactory {


    @Override
    public Bautura createBautura(BauturaType bauturaType) {
        if (bauturaType== BauturaType.CAFEA)
            return new Cafea();
        if (bauturaType==BauturaType.CAFEA_CU_LAPTE)
            return new Lapte(new Cafea());
        if (bauturaType==BauturaType.CAFEA_CU_ZAHAR)
            return new Zahar(new Cafea());
        if (bauturaType==BauturaType.CAFEA_CU_ZAHARLAPTE)
            return new Zahar(new Lapte(new Cafea()));
        if (bauturaType==BauturaType.CAFEA_DUBLU_LAPTE)
            return new Lapte(new Lapte(new Cafea()));

        return null;

    }
}
