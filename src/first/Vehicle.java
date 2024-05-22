package first;

public sealed interface Vehicle permits MotorVehicle {
    int getSpeed();
    int speedUp(int increment);
    int slowDown(int decrement);
    default boolean isSomethingWrong() {
        return false;
    }
}
