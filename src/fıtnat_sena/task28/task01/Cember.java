package fıtnat_sena.task28.task01;

public class Cember implements Sekil {
    private double yarıçap;
    private final double pi=3.14;

    public double getYarıçap() {
        return yarıçap;
    }

    public void setYarıçap(double yarıçap) {
        this.yarıçap = yarıçap;
    }

    public Cember(double yarıçap) {
        this.yarıçap = yarıçap;
    }

    @Override
    public int cevre(int... boyut) {
        return (int) (2*pi*yarıçap);
    }

    @Override
    public int alan(int... boyut) {
        return (int) (pi*yarıçap*yarıçap);
    }
}
