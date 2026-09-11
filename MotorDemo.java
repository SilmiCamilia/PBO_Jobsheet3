public class MotorDemo {
    public static void main(String[] args) {

        motor motor1 = new motor();

        motor1.platNomor = "B 0838 XZ";
        motor1.isMesinOn = false;
        motor1.kecepatan = 50;

        motor1.displayStatus();
    }
}