package fıtnat_sena.task28.task01;

public class Dikdortgen implements Sekil{
   private  int uzunKenar;
   private  int kısaKenar;

    public int getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(int uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

    public int getKısaKenar() {
        return kısaKenar;
    }

    public void setKısaKenar(int kısaKenar) {
        this.kısaKenar = kısaKenar;
    }

    public Dikdortgen(int uzunKenar, int kısaKenar) {
        this.uzunKenar = uzunKenar;
        this.kısaKenar = kısaKenar;
    }

    @Override
    public int cevre(int... boyut) {
        return (2*(uzunKenar+kısaKenar));
    }

    @Override
    public int alan(int... boyut) {
        return kısaKenar*uzunKenar;
    }
}
