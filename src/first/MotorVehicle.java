package first;

public non-sealed class MotorVehicle implements Vehicle {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public int speedUp(int increment) {
        speed += increment;
        return speed;
    }

    public int slowDown(int decrement) {
        speed -= decrement;
        return speed;
    }
}
