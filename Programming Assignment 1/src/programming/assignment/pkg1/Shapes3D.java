package programming.assignment.pkg1;

import java.util.Scanner;
import java.lang.Math;
public class Shapes3D extends Calculations {
    

    
  public Shapes3D (){
  }

    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
   
    System.out.println("What shape would you like to use");
    System.out.println("(1)Cone,(2)RectangualrPrism");
    int Shape = scan.nextInt();
    switch(Shape){
       
    case 1:
    System.out.println("Enter the radius and height of the cone");
    int coneRadius = scan.nextInt();
    int coneHeight = scan.nextInt();
    Shapes3D cone = new Shapes3D();
    cone.cone(coneRadius,coneHeight);
    break;
       
    case 2:
    System.out.println("Enter the length, width and height of the rectangular prism");
    int RPLength = scan.nextInt();
    int RPWidth = scan.nextInt();
    int RPHeight = scan.nextInt();
    Shapes3D rectangularPrism = new Shapes3D();
    rectangularPrism.rectangularPrism(RPLength,RPWidth,RPHeight);
    break;
   }
  }
}
