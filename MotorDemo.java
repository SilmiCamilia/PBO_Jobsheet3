public class MotorDemo {
    public static void main(String[] args) {

        motor motor1 = new motor();
        motor motor2 = new motor();
        motor motor3 = new motor();

        motor1.platNomor = "B 0838 XZ";
        motor1.isMesinOn = false;

        motor2.platNomor = "N 9804 AB";
        motor2.isMesinOn = true;

        motor3.platNomor = "D 8343 CV";
        motor3.isMesinOn = false;

        if (motor1.isMesinOn) {
            motor1.kecepatan = 50;
        } 
        else {
            motor1.kecepatan = 0;
        }

        if (motor2.isMesinOn) {
            motor2.kecepatan = 80;
        } 
        else {
            motor2.kecepatan = 0;
        }

        if (motor3.isMesinOn) {
            motor3.kecepatan = 70;
        } 
        else {
            motor3.kecepatan = 0;
        }
        motor1.displayStatus();
        System.out.println();

        motor2.displayStatus();
        System.out.println();

        motor3.displayStatus();
    }
}