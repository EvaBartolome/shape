/**
 * Implement a triangle
 * 
 * @author Mr. Jaffe 
 * @version 2017-07-14
 */
public class Triangle implements Shape
{
    private int sideA;
    private int sideB;
    private int sideC;
    private String color;

    /**
     * Constructor for objects of class Triangle
     */
    public Triangle(int sideA, int sideB, int sideC, String color)
    {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.color = color;
    }

    /**
     * Get the area
     * 
     * @return returns the area of the triangle
     */
    public double getArea()
    {
        // Using Heron's formula for the area of a triangle (finding area based on length of sides, works for all types of triangles)
        double s = (sideA + sideB + sideC) / 2.0;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    /**
     * Get the perimeter
     * 
     * @return returns the perimeter of the triangle
     */
    public double getPerimeter()
    {
        return sideA + sideB + sideC;
    }

    /**
     * Get the color
     * 
     * @return returns the color of the triangle
     */
    public String getColor()
    {
        return this.color;
    }
}