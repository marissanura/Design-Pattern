package Adapter;

public class SquarePegAdapter extends RoundPeg
{
    private SquarePeg adaptee;

    public SquarePegAdapter(SquarePeg adaptee)
    {
        super(0);
        this.adaptee = adaptee;
    }
    @Override
    public double getRadius() 
    {
        return (adaptee.getWidth() * Math.sqrt(2) / 2);
    }
}