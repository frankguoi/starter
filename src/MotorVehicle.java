public class MotorVehicle implements Vehicle {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void slowDown(int decrement) {
        speed -= decrement;
    }
}
