package fıtnat_sena.task27.sirket;

public abstract class insan {
    private String isim;
    private String soyisim;

    public insan(String isim, String soyisim) {
        this.isim = isim;
        this.soyisim = soyisim;
    }

    public abstract void calis();

    public void Bilgilendirme() {

        System.out.println("İsim:  " + this.isim + "    Soyisim : " + this.soyisim);
    }

    public void isimDegistir(String isim, String soyisim) {

        this.isim = isim;
        this.soyisim = soyisim;

    }


}
