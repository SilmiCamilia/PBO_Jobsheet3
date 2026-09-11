public class motor {
    public String platNomor;
    public boolean isMesinOn;
    public int kecepatan;

    public void displayStatus() {
        System.out.println("Plat Nomor: " + platNomor);
        System.out.println("Mesin On: " + isMesinOn);
        System.out.println("Kecepatan: " + kecepatan);
    }
}