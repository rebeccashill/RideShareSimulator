package a3;

public class PositionImpl implements Position
{
  private int _x;
  private int _y;

  public PositionImpl(int x, int y)
  {
    _x = x;
    _y = y;
  }

  public int getX()
  {
    return _x;
  }

  public int getY()
  {
    return _y;
  }

}
