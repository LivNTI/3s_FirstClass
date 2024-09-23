public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        // ClassName variableName = new ClassName();

        Car c1 = new Car();

        c1.model = "Bugatti";
        c1.speed = 0;

        //sout + tab
        System.out.println("the " + c1.model + " has speed "+ c1.speed);

        Car c2 = new Car();
        c2.model = "Corvette";
        c2.speed = 500;
        System.out.println("the " + c2.model + " has speed "+ c2.speed);

        c2.changeSpeed(-100);
        System.out.println("the " + c2.model + " now has speed "+ c2.speed);


    }





}