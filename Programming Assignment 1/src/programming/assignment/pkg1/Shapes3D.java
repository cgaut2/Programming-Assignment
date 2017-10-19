package programming.assignment.pkg1;
import java.util.Scanner;
import java.lang.Math;
public class Shapes3D extends Calculations {
    

    
  public Shapes3D (){
  }

    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
   
    //
    System.out.println("What shape would you like to use");
    System.out.println("(1)Cone,(2)RectangualrPrism, (3)Sphere");
    int Shape = scan.nextInt();
    switch(Shape){
       
    //    
    case 1:
    System.out.println("Enter the radius and height of the cone");
    int coneRadius = scan.nextInt();
    int coneHeight = scan.nextInt();
    Shapes3D cone = new Shapes3D();
    cone.coneCalcs(coneRadius,coneHeight);
    break;
    
    //
    case 2:
    System.out.println("Enter the length, width and height of the rectangular prism");
    int RPLength = scan.nextInt();
    int RPWidth = scan.nextInt();
    int RPHeight = scan.nextInt();
    Shapes3D rectangularPrism = new Shapes3D();
    rectangularPrism.rectangularPrismCalcs(RPLength,RPWidth,RPHeight);
    break;
    
    //
    case 3:
    System.out.println("Enter the radius of the sphere");
    int sphereRadius = scan.nextInt();
    Shapes3D sphere = new Shapes3D();
    sphere.sphereCalcs(sphereRadius);
    break;
   }
    
  }
}
