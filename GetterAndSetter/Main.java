public class Main {

    public static void main(String[] args) {

        Car car = new Car("MustangGT","red",120000);

        car.getColor();
        car.getPrice();

        System.out.println(car.getModel()+" "+car.getColor()+" "+car.getPrice());

    }
}