//enums to signify the X and the O in the game
package tictactoe.backend;

public enum XO
{
    X, O, clear;
    
    @Override
    public String toString()
    {
        switch(this)
        {
            case X: return "X";
            case O: return "0";
            case clear: return " ";
            default: return " ";
        }
    }
}
