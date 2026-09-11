public class MotorDemo {
    public static void main(String[] args) {

        motor motor1 = new motor();
        motor motor2 = new motor();
        motor motor3 = new motor();

        motor1.platNomor = "B 0838 XZ";
        motor1.isMesinOn = false;
        motor1.kecepatan = 50;

        motor2.platNomor = "N 9804 AB";
        motor2.isMesinOn = true;
        motor2.kecepatan = 40;

        motor3.platNomor = "D 8343 CV";
        motor3.isMesinOn = false;
        motor3.kecepatan = 60;

        motor1.displayStatus();
        System.out.println();

        motor2.displayStatus();
        System.out.println();

        motor3.displayStatus();
    }
}