public class Trapesium extends BangunDatar {

    private double sisiAtas,sisiBawah,tinggi,sisiKiri,sisiKanan;

    public Trapesium(double sisiAtas,double sisiBawah,double sisiKiri,double sisiKanan,double tinggi) {
        super("Trapesium");
        if(sisiAtas<=0||sisiBawah<=0||tinggi<=0||sisiKiri<=0||sisiKanan<=0){
            throw new IllegalArgumentException("Sisi atas, bawah, kiri, kanan atau tinggi tidak boleh kurang dari 0");
        }
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.sisiKiri = sisiKiri;
        this.sisiKanan = sisiKanan;
        this.tinggi = tinggi;
    }

    @Override public double luas()     { return 0.5*(sisiAtas+sisiBawah)*tinggi; }
    @Override public double keliling()     { return sisiAtas+sisiBawah+sisiKiri+sisiKanan; }
    @Override public String toString() {
        return getNama() + "(Atas = "+sisiAtas+", bawah = "+sisiBawah+", kiri = "+sisiKiri+", kanan = "+sisiKanan+") luas = "+luas();
    }
    public double getSisiAtas(){
        return sisiAtas;
    }

    public double getSisiBawah(){
        return sisiBawah;
    }

    public double getSisiKiri(){
        return sisiKiri;
    }

    public double getSisiKanan(){
        return sisiKanan;
    }

    public double getTinggi(){
        return tinggi;
    }
}

