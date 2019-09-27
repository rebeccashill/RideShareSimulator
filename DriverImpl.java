package a3;

public class DriverImpl implements Driver
{
  private String _first;
  private String _last;
  private Integer _id;
  private Vehicle _vehicle;

  public DriverImpl(String first, String last, int id, Vehicle vehicle)
  {
		if (first == null)
		{
			throw new RuntimeException();
		}
		if (last == null)
		{
			throw new RuntimeException();
		}
		if (vehicle == null)
		{
			throw new RuntimeException();
		}
    _first = first;
    _last = last;
    _id = id;
    _vehicle = vehicle;
  }

  public String getFirstName()
  {
    return _first;
  }

  public String getLastName()
  {
    return _last;
  }

  public int getID()
  {
    return _id;
  }

  public Vehicle getVehicle()
  {
    return _vehicle;
  }

  public void setVehicle(Vehicle v)
  {
    if (v == null)
    {
      throw new RuntimeException();
    }
    _vehicle = v;
  }
}
