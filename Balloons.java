import java.util.Scanner; // Needed to make scanner available

public class Balloons {
    // runs the compiled code
    public static void main(String [] a) {
        Compiled();
        System.exit(0);
    }
    // Asks the user for the Length of their room and stores it in a variable Length
    public static double Length() {
        Scanner scanner = new Scanner(System.in);
        double Length;
        System.out.println("What is the length of your room in cm?");
        Length = scanner.nextDouble();
        return Length;
    }
    // Asks the user for the Length of their room and stores it in a variable Height
    public static double Height() {
        Scanner scanner = new Scanner(System.in);
        double Height;
        System.out.println("What is the height of your room in cm?");
        Height = scanner.nextDouble();
        return Height;
    }
    // Asks the user for the Length of their room and stores it in a variable Width
    public static double Width() {
        Scanner scanner = new Scanner(System.in);
        double Width;
        System.out.println("What is the width of your room in cm?");
        Width = scanner.nextDouble();
        return (Width);
    }
    // Passes through the variables: width height and length, multiplies
    // them and then divides by 1000000 to find volume of room in m3
    public static double Volume(double width, double height, double length) {
        final double million = 1000000;
        double Volume = (length*height*width)/million;
        System.out.println("The volume of your room is " + Volume + "m3");
        return(Volume);
    }
    // Asks the user for the volume of each balloon and stores it in the variable balloon
    // divides the volume of the room by the volume of the balloons and rounds down to tell the user how many balloons they need
    public static double Balloon() {
        Scanner scanner = new Scanner(System.in);
        double balloon;
        System.out.println("What is the volume of each balloon in m3?");
        balloon = scanner.nextDouble();
        return(balloon);
    }
    // Finds how many balloons can fit in the room and rounds it down.
    public static void HowMany(double balloon, double volume){
        double HowMany = volume/balloon;
        System.out.println("You need " + (int)HowMany + " balloons.");
    }
    // Compiles all the methods and creates variables that need to be passed through to other methods
    public static void Compiled(){
        double length = Length();
        double height = Height();
        double width = Width();
        double volume = Volume(width, height, length);
        double balloon = Balloon();
        HowMany(balloon, volume);
    }
}
