
package programming.assignment.pkg1;


//test.

public class Calculations {
    float surfaceArea,Volume;
    
    public void rectangularPrism(int length,int width,int height){
        surfaceArea = 2*length*width + 2*length*height + 2*height*width;
        Volume = length*width*height;
        System.out.println("The surface area is " + surfaceArea + " and the volume is " + Volume );
    }
        public void cone(int radius,int height){
        surfaceArea = (float) (Math.PI*radius*(radius+Math.sqrt(height*height+radius*radius)));
        Volume = (float) (Math.PI*radius*radius*height/3);
        System.out.println("The surface area is " + surfaceArea + " and the volume is " + Volume );
    }
}
