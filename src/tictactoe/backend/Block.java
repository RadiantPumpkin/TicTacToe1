
package tictactoe.backend;

public class Block
{
    private XO marker;
    public Block()
    {
        marker = XO.clear;
    }
    
    public void setMarker(XO setter)
    {
        marker = setter;
    }
    
    public XO getMarker()
    {
        return marker;
    }
    
    @Override
    public String toString()
    {
        ;
    }
}
