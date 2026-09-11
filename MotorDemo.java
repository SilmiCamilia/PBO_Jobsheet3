public class MotorDemo {
    public static void main(String[] args) {
        motor motor1 = new motor();

        motor1.setPlatNomor("B 0838 XZ");
        motor1.setIsMesinOn(false);

        System.out.println("Menambah kecepatan motor...");
        motor1.setKecepatan(50);

        motor1.displayStatus();

        System.out.println();

        motor1.setIsMesinOn(true);
        motor1.setKecepatan(50);

        motor1.displayStatus();
    }
}