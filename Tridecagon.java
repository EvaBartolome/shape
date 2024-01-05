/**
 * Implement a tridecagon (13-sided polygon)
 * 
 * @author Mr. Jaffe
 * @version 2017-07-14
 */
public class Tridecagon implements Shape
{
    private int sideLength;
    private String color;

    /**
     * Constructor for objects of class Tridecagon
     * 
     * @param sideLength the length of each side of the tridecagon
     * @param color the color of the tridecagon
     */
    public Tridecagon(int sideLength, String color)
    {
        this.sideLength = sideLength;
        this.color = color;
    }

    /**
     * Get the area of the tridecagon
     * 
     * @return returns the area of the tridecagon
     */
    public double getArea() //A = 13/4 * s^2 * cot (pi/13)
     {
        return (13.0 / 4.0) * (sideLength * sideLength) * (1.0 / Math.tan(Math.PI / 13.0));
    }

    /**
     * Get the perimeter of the tridecagon
     * 
     * @return returns the perimeter of the tridecagon
     */
    public double getPerimeter()
    {
        return 13.0 * sideLength;
    }

    /**
     * Get the color of the tridecagon
     * 
     * @return returns the color of the tridecagon
     */
    public String getColor()
    {
        return this.color;
    }
}