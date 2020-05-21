

public class Dreptunghi implements FormaGeometrica {
    private int lungime;
    private int inaltime;

    public Dreptunghi(int lungime, int inaltime) {
        this.lungime = lungime;
        this.inaltime = inaltime;
    }

    public int getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public int getInaltime() {
        return inaltime;
    }

    public void setInaltime(int inaltime) {
        this.inaltime = inaltime;
    }


    @Override
    public double getArea() {
        return 0;
    }
}


