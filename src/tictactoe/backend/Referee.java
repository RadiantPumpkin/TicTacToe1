//controls the game, checks for wins
package tictactoe.backend;
import java.util.*;

public class Referee
{
    private static short xPoints = 0;
    private static short oPoints = 0;
    private static short drawPoints = 0;
    private Player player;
    private ArrayList<Block> blocks = new ArrayList<>();
    
    public Referee()
    {
        player = new Player();
        board();
    }
    
    public void reset()
    {
        XO point = player.getMarker();
        if (point == XO.X)
            oPoints++;
        else if (point == XO.O)
            xPoints++;
        player = new Player();
    }
    
    public static short getXPoints()
    {
        return xPoints;
    }
    
    public static short getOPoints()
    {
        return oPoints;
    }
    
    public static short getDrawPoints()
    {
        return drawPoints;
    }
    
    public void board()
    {
        for(int counter = 0; counter < 9; counter++)
        {
            blocks.add(new Block());
        }
    }
    
    public void turn()
    {
        int move = player.turn();
        XO marker = player.getMarker();
        blocks.get(move - 1).setMarker(marker);
        System.out.println(blocks.get(0) + "|" + blocks.get(1) + "|" + blocks.get(2));
        System.out.println("------");
        System.out.println(blocks.get(3) + "|" + blocks.get(4) + "|" + blocks.get(5));
        System.out.println("------");
        System.out.println(blocks.get(6) + "|" + blocks.get(7) + "|" + blocks.get(8));
    }
    
    public ArrayList<Block> getList()
    {
        return blocks;
    }
}
