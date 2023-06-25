public class Main{
    public static void main(String[] args) {
        Car car = new Car();
       car.setMake(null);
        car.describeCar();

        System.out.println("Make:"+ car.getMake());
        System.out.println("Color:"+ car.getColor());

    }
}