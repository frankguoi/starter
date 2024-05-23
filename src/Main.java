import second.Car;
import second.Truck;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Nissan", "red"));
        cars.add(new Car("Mercedes", "blue"));
        cars.add(new Car("Volvo", "white"));
        cars.add(new Car("Renault", "white"));
        List<Car> whiteCars = cars
                .stream()
                .filter(car -> Objects.equals(car.color(), "white"))
                .toList();
        List<Truck> trucks = cars
                .stream()
                .map(car -> new Truck(car.manufacturer(), car.color()))
                .toList();
    }
}