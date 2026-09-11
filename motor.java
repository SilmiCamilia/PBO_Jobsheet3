public class motor {
    private String platNomor;
    private boolean isMesinOn;
    private int kecepatan;

    public void displayStatus() {
        System.out.println("Plat Nomor: " + platNomor);
        System.out.println("Mesin On: " + isMesinOn);
        System.out.println("Kecepatan: " + kecepatan);
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setIsMesinOn(boolean isMesinOn) {
        this.isMesinOn = isMesinOn;
    }

    public boolean getIsMesinOn() {
        return isMesinOn;
    }

    public void setKecepatan(int kecepatan) {
    if (!isMesinOn) {
        System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off!");
    } else if (kecepatan < 0) {
        System.out.println("Kecepatan tidak boleh negatif!");
    } else if (kecepatan > 100) {
        System.out.println("Kecepatan maksimal adalah 100!");
    } else {
        this.kecepatan = kecepatan;
    }
    }

    public int getKecepatan() {
        return kecepatan;
    }
}