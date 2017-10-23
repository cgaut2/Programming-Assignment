package programming.assignment.pkg1;
import java.util.Scanner;
import java.lang.Math;
public class Shapes3D extends Calculations {
    

    
  public Shapes3D (){
  }

    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    boolean restart = true;
   
    //Creating the decision tree based on what shape the user wants
   while (restart){
    System.out.println("What shape would you like to use");
    System.out.println("(1)Cone,(2)RectangualrPrism, (3)Sphere, (4)Cylinder");
    while (!scan.hasNextInt()){
        System.out.println("Please enter a valid number");
        scan.next();}
    int Shape = scan.nextInt();
    switch(Shape){
       
    //Input for cone
    case 1:
    System.out.println("Enter the radius and height of the cone");
    int coneRadius = scan.nextInt();
    int coneHeight = scan.nextInt();
    Shapes3D cone = new Shapes3D();
    cone.coneCalcs(coneRadius,coneHeight);
    break;
    
    //Input for Rectangular Prism
    case 2:
    System.out.println("Enter the length, width and height of the rectangular prism");
    int RPLength = scan.nextInt();
    int RPWidth = scan.nextInt();
    int RPHeight = scan.nextInt();
    Shapes3D rectangularPrism = new Shapes3D();
    rectangularPrism.rectangularPrismCalcs(RPLength,RPWidth,RPHeight);
    break;
    
    //Input for sphere
    case 3:
    System.out.println("Enter the radius of the sphere");
    int sphereRadius = scan.nextInt();
    Shapes3D sphere = new Shapes3D();
    sphere.sphereCalcs(sphereRadius);
    break;
    
    //Input for cylinder
    case 4:
    System.out.println("Enter the radius and height of the cylinder");
    int cylinderHeight = scan.nextInt();
    int cylinderRadius = scan.nextInt();
    Shapes3D cylinder = new Shapes3D();
    cylinder.cylinderCalcs(cylinderHeight,cylinderRadius);
    break;
    
    default:
    System.out.println("Invalid Input");
   }
   System.out.println("Would you like to try again(yes/no)");
   String again = scan.next();
   if ("no".equalsIgnoreCase(again)){
       restart = false;           
   }
   
   }  
  }
}
