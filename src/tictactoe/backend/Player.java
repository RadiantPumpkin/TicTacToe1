
package tictactoe.backend;
import java.util.Scanner;

public class Player
{
    private XO marker;
    
    public Player()
    {
        marker = XO.X;
    }
    
    public void swap()
    {
        if(marker == XO.X)
            marker = XO.O;
        else if (marker == XO.O)
            marker = XO.X;
    }
    
    public XO getMarker()
    {
        return marker;
    }
    
    public int turn()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Where would you like to go? Enter 1-9: ");
        int position = input.nextInt();
        return position;
    }
}
