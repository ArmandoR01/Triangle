/*=======================================================================
 * |
 * | Author:  Armando Ramos Jr
 * |   
 * | Purpose:  This class exist because it has all the formulas, that the 
 * | 	the main needs in order to calculate the measurements for the triangle.     
 * |
 * | Inherits From:  None
 * |
 * | Interfaces:  None
 * |
 * |  +-----------------------------------------------------------------------|
 * | Constants:  
 * | 	SQUARED When a number is squared the number its raised to
 * |   	TOTAL_DEGREES_IN_TRIANGLES The total amount of degrees in a triangle
 * |   	ACCEPTABLE_DIFFERENCE The point that "close enough" to be equal to is
 * |   	RIGHT_ANGLE_DEGREE Amount of degree that a right angle has
 * |
 * | +-----------------------------------------------------------------------|
 * | Constructors: 
 * | 	Triangle(float xCoordinate1, float yCoordinate1, float xCoordinate2,
 * |    	float yCoordinate2, float xCoordinate3, float yCoordinate3)
 * |    	Constructor used when main uses 6 variables and not 3 points
 * |
 * |    Triangle(Point2D.Float Point1, Point2D.Float Point2,
 * |        Point2D.Float Point3)
 * |    	Constructor used when main uses 3 points and not 6 variables 
 * |
 * |  Class Methods:  
 * |    getPoint1X - float 
 * |    getPoint1Y - float
 * |    getPoint2X - float 
 * |    getPoint2Y - float 
 * |    getPoint3X - float 
 * |    getPoint3Y - float
 * |    getLengthSide1 - float
 * |    getLengthSide2 - float
 * |    getLengthSide3 - float
 * |    getPerimeter - float
 * |    getHalfPerimeter - float
 * |    getArea - float
 * |    getPoint1Angle - float
 * |    getPoint2Angle - float
 * |    getPoint3Angle - float
 * |    differenceBetween - (Value1, Value2) float
 * |    isEquilateral - boolean
 * |    isRightAngled - boolean
 * |    Point1ToString - String
 * |    Point2ToString - String
 * |    Point3ToString - String
 * |    PointsOtput - 
 * |    SidesAnglePermAndAreaOutput - 
 * |    EquilAndRightOutput -
 * |    
 * | Instance Methods:  
 * | 	Point1 - float, Coordinate points for the first point 
 * |    Point1 - float, Coordinate points for the second point 
 * |    Point1 - float, Coordinate points for the third point 
 * |
 * |  *=======================================================================*/

import java.awt.geom.Point2D; //Imports Point Class for Coordinates Inputed

public class Triangle
{

    private Point2D.Float Point1;
    private Point2D.Float Point2;
    private Point2D.Float Point3;
    private double SQUARED = 2.0;
    private float TOTAL_DEGREES_IN_TRIANGLES = (float) 180.00;
    private float ACCEPTABLE_DIFFERENCE = (float) 0.1;
    private float RIGHT_ANGLE_DEGREE = (float) 90.0;

    public Triangle(Point2D.Float Point1, Point2D.Float Point2,
            Point2D.Float Point3)
    {
        this.Point1 = Point1;
        this.Point2 = Point2;
        this.Point3 = Point3;
    }

    public Triangle(float xCoordinate1, float yCoordinate1, float xCoordinate2,
            float yCoordinate2, float xCoordinate3, float yCoordinate3)
    {
        Point1.x = xCoordinate1;
        Point1.y = yCoordinate1;
        Point2.x = xCoordinate2;
        Point2.y = yCoordinate2;
        Point3.x = xCoordinate3;
        Point3.y = yCoordinate3;
    }

    /**
     * Retrieves The X coordinate of Point 1.
     * getPoint1X is needed to find distance and print X coordinate
     *
     * @return return the value the user input as the X coordinate of Point 1
     */
    public float getPoint1X()
    {
        return (float) Point1.getX();
    }

    /**
     * Retrieves The Y coordinate of Point 1.
     * getPoint1Y is needed to find distance and print Y coordinate
     *
     * @return return the value the user input as the Y coordinate of Point 1
     */
    public float getPoint1Y()
    {
        return (float) Point1.getY();
    }

    /**
     * Retrieves The X coordinate of Point 2.
     * getPoint2X is needed to find distance and print X coordinate
     *
     * @return return the value the user input as the X coordinate of Point 2
     */
    public float getPoint2X()
    {
        return (float) Point2.getX();
    }

    /**
     * Retrieves The Y coordinate of Point 2.
     * getPoint2Y is needed to find distance and print Y coordinate
     *
     * @return return the value the user input as the Y coordinate of Point 2
     */
    public float getPoint2Y()
    {
        return (float) Point2.getY();
    }

    /**
     * Retrieves The X coordinate of Point 3.
     * getPoint3X is needed to find distance and print X coordinate
     *
     * @return return the value the user input as the X coordinate of Point 3
     */
    public float getPoint3X()
    {
        return (float) Point3.getX();
    }

    /**
     * Retrieves The Y coordinate of Point 3.
     * getPoint3Y is needed to find distance and print Y coordinate
     *
     * @return return the value the user input as the Y coordinate of Point 3
     */
    public float getPoint3Y()
    {
        return (float) Point3.getY();
    }

    /**
     * Calculates the distance of Side 1, opposite of Point 1 using a Formula.
     * getLengthSide1 is needed to find Area and Angles of the Triangle
     * ~Formula - Distance Formula distance = sqrt( (x2-x1)^2 + (y2-y1)^2 )
     * SQUARD is 2 which is used with Math.pow to Square the difference of
     * the Xs and Ys
     * ~Citation sources -
     * https://www.chilimath.com/lessons/intermediate-algebra/distance-formula/
     *
     * @return return the length of side 1
     */
    public float getLengthSide1()
    {
        float Length = (float) Math.sqrt(Math.pow(getPoint3X() - getPoint2X(),
                SQUARED) + Math.pow(getPoint3Y() - getPoint2Y(), SQUARED));
        return Length;
    }

    /**
     * Calculates the distance of Side 2, opposite of Point 2 using a Formula.
     * getLengthSide2 is needed to find Area and Angles of the Triangle
     * ~Formula - Distance Formula distance = sqrt( (x2-x1)^2 + (y2-y1)^2 )
     * SQUARD is 2 which is used with Math.pow to Square the difference of
     * the Xs and Ys
     * ~Citation sources -
     * https://www.chilimath.com/lessons/intermediate-algebra/distance-formula/
     *
     * @return return the length of side 2
     */
    public float getLengthSide2()
    {
        float Length = (float) Math.sqrt(Math.pow(getPoint3X() - getPoint1X(),
                SQUARED) + Math.pow(getPoint3Y() - getPoint1Y(), SQUARED));
        return Length;
    }

    /**
     * Calculates the distance of Side 3, opposite of Point 3 using a Formula.
     * getLengthSide1 is needed to find Area and Angles of the Triangle
     * ~Formula - Distance Formula distance = sqrt( (x2-x1)^2 + (y2-y1)^2 )
     * SQUARD is 2 which is used with Math.pow to Square the difference of
     * the Xs and Ys
     * ~Citation sources -
     * https://www.chilimath.com/lessons/intermediate-algebra/distance-formula/
     *
     * @return return the length of side 3
     */
    public float getLengthSide3()
    {
        float Length = (float) Math.sqrt(Math.pow(getPoint2X() - getPoint1X(),
                SQUARED) + Math.pow(getPoint2Y() - getPoint1Y(), SQUARED));
        return Length;
    }

    /**
     * Calculates the perimeter of the triangle using a Formula.
     * getPerimeter is needed to find the Area of the triangle
     * ~Formula - Perimeter Formula Perimeter = a + b + c
     * where a, b, c are the lengths of each side
     *
     * @return return the Perimeter of the Triangle
     */
    public float getPerimeter()
    {
        float Perimeter = getLengthSide3()
                + getLengthSide1() + getLengthSide2();
        return Perimeter;
    }

    /**
     * Calculates half of the perimeter of the triangle.
     * getHalfPerimeter is needed to find the Area of the triangle
     * SQUARED is used to divide the perimeter to get half
     *
     * @return return half the Perimeter of the Triangle
     */
    public float getHalfPerimeter()
    {
        float halfPerimeter = (float) (getPerimeter() / SQUARED);
        return halfPerimeter;
    }

    /**
     * Calculates the distance of Side 3, opposite of Point 3 using a Formula.
     * getArea is needed to find Area and Angles of the Triangle
     * ~Formula - Distance Heron's Formula
     * Area = sqrt( s(s-a)(s-b)(s-c) ) , where s = half of the perimeter,
     * and a, b, c are the lengths of each side
     * ~Citation sources -
     * https://www.mathsisfun.com/geometry/herons-formula.html
     *
     * @return return the area of the triangle
     */
    public float getArea()
    {
        float Area = (float) Math.sqrt(getHalfPerimeter()
                * (getHalfPerimeter() - getLengthSide1())
                * (getHalfPerimeter() - getLengthSide2())
                * (getHalfPerimeter() - getLengthSide3()));
        return Area;
    }

    /**
     * Calculates the angle of Point 1 given the lengths of the sides.
     * getPoint1Angle is needed as one of the values to be printed
     * ~Formula - Called the Laws of Cosines A = cos^-1(b^2 + c^2 − a^2)/2bc
     * where a, b, c are the lengths of each side and A is the Angle at Point A
     * or Point 1 in our case
     * SQUARED is used within the formula Math.pow to Square
     * ~Citation sources -
     * https://www.mathsisfun.com/algebra/trig-solving-sss-triangles.html
     *
     * @return return the angle of point 1
     */
    public float getPoint1Angle()
    {
        float numerator = (float) (((Math.pow(getLengthSide2(), SQUARED)
                + Math.pow(getLengthSide3(), SQUARED))
                - Math.pow(getLengthSide1(), SQUARED)));

        float denominator = (float) (SQUARED * getLengthSide2()
                * getLengthSide3());

        float Angle1 = (float) numerator / denominator;

        Angle1 = ((float) (Math.acos(Angle1)));
        Angle1 = (float) Math.toDegrees(Angle1);
        return Angle1;
    }

    /**
     * Calculates the angle of Point 2 given the lengths of the sides.
     * getPoint2Angle is needed as one of the values to be printed
     * ~Formula - Called the Laws of Cosines B = cos^-1(b^2 + c^2 − a^2)/2bc
     * where a, b, c are the lengths of each side and B is the Angle at Point B
     * or Point 2 in our case
     * SQUARED is used within the formula Math.pow to Square
     * ~Citation sources -
     * https://www.mathsisfun.com/algebra/trig-solving-sss-triangles.html
     *
     * @return return the angle of point 2
     */
    public float getPoint2Angle()
    {
        float numerator = (float) ((Math.pow(getLengthSide3(), SQUARED)
                + Math.pow(getLengthSide1(), SQUARED))
                - Math.pow(getLengthSide2(), SQUARED));

        float denominator = (float) (SQUARED * (getLengthSide1()
                * getLengthSide3()));

        float Angle2 = (float) numerator / denominator;
        Angle2 = ((float) (Math.acos(Angle2)));
        Angle2 = (float) Math.toDegrees(Angle2);
        return Angle2;
    }

    /**
     * Calculates the angle of Point 3 given angles of the other 2 Points.
     * getPoint3Angle is needed as one of the values to be printed
     * ~Formula - A triangle has 180 degrees from all three angles , subtracting
     * the angles found of the other two points gives us the angle of the third.
     * TOTAL_DEGREES_IN_TRIANGLES = 180, because that is the amount of degrees
     * in a triangle from the three angles added together.
     *
     * @return return the angle of point 3
     */
    public float getPoint3Angle()
    {
        float Angle3 = (float) (TOTAL_DEGREES_IN_TRIANGLES
                - (getPoint1Angle() + getPoint2Angle()));
        return Angle3;
    }

    /**
     * Calculates differences between two values.
     * differenceBetween is needed in multiple formulas
     *
     * @param Value1 Value of one item to find difference between both
     * @param Value2 Value of another item to find difference between both
     *
     * @return return the difference between two numbers
     */
    public float differenceBetween(float Value1, float Value2)
    {
        float Difference = (Math.abs(Value1 - Value2));
        return Difference;
    }

    /**
     * Gives boolean is the triangle is equilateral, all three sides are equal.
     * isEquilateral is needed as an item to be printed
     *
     * @return return boolean if all three sides are equal within the specified
     *         range
     */
    public boolean isEquilateral()
    {
        boolean isEquilateral = false;
        if ((differenceBetween(getLengthSide1(), getLengthSide2())
                < ACCEPTABLE_DIFFERENCE)
                && (differenceBetween(getLengthSide2(), getLengthSide3())
                < ACCEPTABLE_DIFFERENCE)
                && (differenceBetween(getLengthSide3(), getLengthSide1())
                < ACCEPTABLE_DIFFERENCE))
        {
            isEquilateral = true;
        }
        else
        {
            isEquilateral = false;
        }

        return isEquilateral;
    }

    /**
     * Gives boolean if any of the angles is a 90 degree angle.
     * isRightAngled is needed as an item to be printed
     *
     * @return return boolean if any angle is a right angle within the specified
     *         range
     */
    public boolean isRightAngled()
    {
        boolean isRightAngled = false;
        if ((differenceBetween(getPoint1Angle(), RIGHT_ANGLE_DEGREE)
                < ACCEPTABLE_DIFFERENCE)
                || (differenceBetween(getPoint2Angle(), RIGHT_ANGLE_DEGREE)
                < ACCEPTABLE_DIFFERENCE)
                || (differenceBetween(getPoint3Angle(), RIGHT_ANGLE_DEGREE)
                < ACCEPTABLE_DIFFERENCE))
        {
            isRightAngled = true;
        }
        else
        {
            isRightAngled = false;
        }

        return isRightAngled;
    }

    /**
     * Gives a string of the Coordinates of Point 1.
     * Point1ToString is needed as an item to be printed
     *
     * @return return string of the coordinates of Point 1
     */
    public String Point1ToString()
    {
        String coordinate = "(" + getPoint1X() + ", " + getPoint1Y() + ")";
        return coordinate;
    }

    /**
     * Gives a string of the Coordinates of Point 2.
     * Point2ToString is needed as an item to be printed
     *
     * @return return string of the coordinates of Point 2
     */
    public String Point2ToString()
    {
        String coordinate = "(" + getPoint2X() + ", " + getPoint2Y() + ")";
        return coordinate;
    }

    /**
     * Gives a string of the Coordinates of Point 3.
     * Point3ToString is needed as an item to be printed
     *
     * @return return string of the coordinates of Point 3
     */
    public String Point3ToString()
    {
        String coordinate = "(" + getPoint3X() + ", " + getPoint3Y() + ")";
        return coordinate;
    }

    /**
     * Prints the coordinates of all three points.
     * PointsOtput is needed to print the coordinates of all three points
     *
     */
    public void PointsOtput()
    {
        System.out.printf("\nPoint 1 Coordinates are: " + Point1ToString()
                + "\nPoint 2 Coordinates are: " + Point2ToString()
                + "\nPoint 3 Coordinates are: " + Point3ToString());
    }

    /**
     * Prints the side lengths, angles, perimeter, and area of the triangle.
     * SidesAnglePermAndAreaOutput is needed to print side lengths, angles,
     * perimeter, and area
     *
     */
    public void SidesAnglePermAndAreaOutput()
    {
        System.out.printf("\n\nSide 1 Length is: %.4f Units%n", getLengthSide1());
        System.out.printf("Side 2 Length is: %.4f Units%n", getLengthSide2());
        System.out.printf("Side 3 Length is: %.4f Units%n", getLengthSide3());
        System.out.printf("\nAngle 1 is: %.0f Degrees%n", getPoint1Angle());
        System.out.printf("Angle 2 is: %.0f Degrees%n", getPoint2Angle());
        System.out.printf("Angle 3 is: %.0f Degrees%n", getPoint3Angle());
        System.out.printf("\nThe Perimeter is: %.4f Units%n", getPerimeter());
        System.out.printf("The Area is: %.4f Square Units%n", getArea());
    }

    /**
     * Prints whether the Triangle is a right or equilateral triangle.
     * EquilAndRightOutput is needed to print the booleans that show if the
     * triangle is right or equilateral
     *
     */
    public void EquilAndRightOutput()
    {
        System.out.println("\nIs The Triangle Equilateral: " + isEquilateral()
                + "\nIs The Triangle Right-Angled: " + isRightAngled());
    }

}
