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

        Float length;
        Float side;
        Float area;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length from the center to the vertex of pentagon");

        length = input.nextFloat();

        side = 2*length *(Math.sin(Math.PI /5));

        area = (5*Math.pow(side, 2))/(4*Math.tan(Math.PI /5))

        float roundedArea = String.format("%.2f",area);

        System.out.println("The area of the pentagon is "+ roundedArea);

    }
}
