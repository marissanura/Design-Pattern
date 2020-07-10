package Adapter;

public class MainClass 
{
    public static void main(String[] args) 
    {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);

        System.out.println("Is round peg fits round hole: " + hole.fits(rpeg));

        SquarePeg small_sqpeg = new SquarePeg(5);
        SquarePeg large_sqpeg = new SquarePeg(10);

        SquarePegAdapter small_peg_adapter = new SquarePegAdapter(small_sqpeg);
        SquarePegAdapter large_peg_adapter = new SquarePegAdapter(large_sqpeg);

        System.out.println("Is small square peg fits round hole: " + hole.fits(small_peg_adapter));
        System.out.println("Is large square peg fits round hole: " + hole.fits(large_peg_adapter));
    }    
}