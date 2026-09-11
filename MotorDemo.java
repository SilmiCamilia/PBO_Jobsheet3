public class MotorDemo {
    public static void main(String[] args) {

        motor motor1 = new motor();
        motor motor2 = new motor();
        motor motor3 = new motor();

        motor1.setPlatNomor("B 0838 XZ");
        motor1.setIsMesinOn(false);
        motor1.setKecepatan(50);

        motor1.displayStatus();

        motor2.setPlatNomor("N 9804 AB");
        motor2.setIsMesinOn(false);
        motor2.setKecepatan(40);

        motor2.displayStatus();
        
        motor3.setPlatNomor("D 8343 CV");
        motor3.setIsMesinOn(false);
        motor3.setKecepatan(70);
        
        motor3.displayStatus();
    }
}