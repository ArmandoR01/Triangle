/* ============================================================================
 * | 
 * | Author: Armando Ramos Jr
 * |
 * | Description: A program that creates a triangle given 3 points and will
 * | 	return the Coordinates, Side Lengths, Angle measurements, Perimeter, Area,
 * |	and if the triangle is either Equilateral, Right, or neither.
 * |
 * | Input: The only user input 6 numbers (negative, positive, or zero) which
 * | 	are the coordinates of the points of the triangle, in the format of the x
 * | 	'enter' y of the first point, 'enter' x 'enter' y of the second point, and
 * | 	'enter' x 'enter' y of the third point.
 * |
 * | Output: The output is formatted to be 13 lines which print the 3 points
 * | 	Coordinates, Side Lengths, Angle measurements, Perimeter, Area, and if the
 * | 	triangle is either Equilateral, Right, or neither.
 * |
 * | Process: The program will start off by asking you for 6 numbers which is
 * | 	the x's and y's of the coordinates of each point.
 * |
 * | *======================================================================= */


import java.awt.geom.Point2D;   //Imports Point Class for Coordinates Inputed
import java.util.Scanner;   //Reads User Input to be Used by the Program

public class TriangleTester
{

    public static void main(String[] args)
    {

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter Three Coordinates for the Triangle, "
                + "Each Coordinate Separated by an Return or Enter, "
                + "Only Real Numbers:");

        Point2D.Float PointA = new Point2D.Float(Input.nextFloat(),
                Input.nextFloat());
        Point2D.Float PointB = new Point2D.Float(Input.nextFloat(),
                Input.nextFloat());
        Point2D.Float PointC = new Point2D.Float(Input.nextFloat(),
                Input.nextFloat());

        Triangle TriangleDrawn = new Triangle(PointA, PointB, PointC);
        
        TriangleDrawn.PointsOtput();
        TriangleDrawn.SidesAnglePermAndAreaOutput();
        TriangleDrawn.EquilAndRightOutput();
    }

}
