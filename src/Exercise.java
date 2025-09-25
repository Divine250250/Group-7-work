import java.util.Scanner;
import java.math.*;
public class Exercise {
    public static void main(String[] args) {

        //Question 1

        /**Scanner input = new Scanner(System.in);
        char major, status;
        System.out.println("Enter major label");
        major = input.nextLine().charAt(0);

        System.out.println("Enter status");
        status = input.nextLine().charAt(0);

        System.out.println(major+status);

        String Major  = "";
        if (major == 'M'){
            Major = "Mathematics";

        }
        else if(major =='C'){
            Major = "Computer Science";
        }
        else if (major == 'I'){
            Major = "Information Technology";
        }

        String Status = "";
        if (status ==1){
            Status = "Freshman";
        }
        else if(status ==2){
            Status = "Sophomore";
        }
        else if(status ==3){
            Status = "Junior";;
        }
        else if(status ==4){
            Status = "Senior";
        }

        System.out.println(Major+Status);**/

        //Question 2

        double length;
        double side;
        double area;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length from the center to the vertex of pentagon");

        length = input.nextFloat();

        side = 2*length *(Math.sin(Math.PI /5));

        area = (5*Math.pow(side, 2))/(4*Math.tan(Math.PI /5));

        double roundedArea = String.format("%.2f",area);

        System.out.println("The area of the pentagon is "+ roundedArea);

        // Question 3

        System.out.println("Enter a letter: ");
        String letter = input.nextLine();

        switch (letter){
            case "a","b","c" -> System.out.println("The number is 2");
            case "d","e","f" -> System.out.println("The number is 3");
            case "g","h","i" -> System.out.println("The number is 4");
            case "j","k","l" -> System.out.println("The number is 5");
            case "m","n","o" -> System.out.println("The number is 6");
            case "p","q","r","s"-> System.out.println("The number is 7");
            case "t","u","v" -> System.out.println("The number is 8");
            case "W","x","y","z"-> System.out.println("The number is 9");
            default -> System.out.println("Wrong input.");
        }

    }
}
