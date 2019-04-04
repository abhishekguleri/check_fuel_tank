package Guleri;
import java.util.Scanner;
public class car {
public static final double LITRE_PER_100KM = 8.9;
  public static  double efficency;
    public static double topSpeed;
    public static double fuelTankCapacity;
    public static int door;
public double getTopSpeed() {
    return topSpeed;
}
public int getDoors(){
    return door;
}
public double getFuelTankCapacity(){
    return fuelTankCapacity;
}
public static double range(){
    return 100*fuelTankCapacity/LITRE_PER_100KM;
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the top speed :");
        topSpeed=input.nextDouble();
        System.out.println("fuel tank capacity:");
                fuelTankCapacity=input.nextDouble();
        System.out.println( "number of the door  in your car");
        door=input.nextInt();

        System.out.println("your car range is "+     100*fuelTankCapacity/LITRE_PER_100KM+" KM");    }
}
