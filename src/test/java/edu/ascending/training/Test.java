
/*As you learned object,class from step1. I need you to write a simple class "bike" in intellj,
 and another two class, bicycle, motorcycle

class bike
attribute, wheelShape,wheelNum, seatShape

        Bicycle inherit from bike
        extra attribute pedalNum

        Motorcycle
        extra attribute pedalNum, gasTank,motor
*/


// base class
class Bike {

    public String wheelShape ;
    public int wheelNum;
    public String seatShape;

    // One constructor
    public Bike(String wheelShape, int wheelNum, String seatShape)
    {
        this.wheelShape = wheelShape;
        this.wheelNum = wheelNum;
        this.seatShape = seatShape;
    }

    // 1 method

    public void printBike(){
        System.out.println("Bike's Wheel shape is : " + wheelShape);
        System.out.println("Bike's Wheel number is : "+ wheelNum);
        System.out.println("Bike's Seat shape is : " + seatShape);

    }
}

class Bicycle extends Bike {
    public int pedalNum;

    // one constructor

    public Bicycle(int pedalNum, String wheelShape, int wheelNum, String seatShape) {
        super(wheelShape, wheelNum, seatShape);

        this.pedalNum = pedalNum;

    }

    // one method
    public void printBicycle() {
        System.out.println("Bicycle's Wheel shape is : " + wheelShape);
        System.out.println("Bicycle's Wheel number is : " + wheelNum);
        System.out.println("Bicycle's Seat shape is : " + seatShape);
        System.out.println("Bicycle's Pedal number is: " + pedalNum);
    }
}


class Motorcycle extends Bike{

    public int pedalNum;
    public String gasTank;
    public String motor;

    // one constructor
    public Motorcycle(int pedalNum, String wheelShape, int wheelNum, String seatShape, String gasTank, String motor)
    {
        super(wheelShape, wheelNum, seatShape);

        this.pedalNum = pedalNum;
        this.gasTank = gasTank;
        this.motor = motor;
    }

    // one method
    public void printMotorcycle()
    {
        System.out.println("Motorcycle's Wheel shape is : " + wheelShape);
        System.out.println("Motorcycle's Wheel number is : " + wheelNum);
        System.out.println("Motorcycle's Seat shape is : " + seatShape);
        System.out.println("Motorcycle's Pedal number is: " + pedalNum);
        System.out.println("Motorcycle's Gas Tank is: " + gasTank);
        System.out.println("Motorcycle's Motor is: " + motor);
    }


}

public class Test{

    public static void main(String args[])
        {
            // Create objects and access the class
        Bike testBike = new Bike("Circle",2,"Cool");
        testBike.printBike();

        Bicycle testBicycle = new Bicycle(3,"star",3,"bad");

        testBicycle.printBicycle();

        Motorcycle testMotorcycle = new Motorcycle(4,"Rectangle",2,"Awesome","Huge","V8");

        testMotorcycle.printMotorcycle();

        }
        }