package Adapter;

public class RoundHole 
{
    private double Radius;

    public RoundHole(int radius)
    {
        this.Radius = radius;
    }

    public double getRadius() 
    {
        return Radius;
    }

    public boolean fits(RoundPeg peg)
    {
        return this.getRadius() >= peg.getRadius();
    }
}