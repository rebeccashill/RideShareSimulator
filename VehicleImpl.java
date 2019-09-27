package a3;

public class VehicleImpl implements Vehicle
{
    private String _make;
    private String _model;
    private String _plate;
    private Position _position;
	private int _mileage;
	private Position _initialPosition;

    public VehicleImpl(String make, String model, String plate, Position position)
    {
    	if (make == null)
		{
			throw new RuntimeException();
		}
		if (model == null)
		{
			throw new RuntimeException();
		}
		if (plate == null)
		{
			throw new RuntimeException();
		}
		if (position == null)
		{
			throw new RuntimeException();
		}
        _make = make;
        _model = model;
        _plate = plate;
        _position = position;
		_mileage = 0;
		_initialPosition = position;
    }

	public String getMake()
	{
		return _make;
	}
	
	public void setMileage(int mileage)
	{
		_mileage = mileage;
	}

	public String getModel()
	{
		return _model;
	}

	public String getPlate()
	{
		return _plate;
	}

	public int getMileage()
	{
		return _mileage;
	}

	public Position getPosition()
	{
		return _position;

	}

	public void moveToPosition(Position p)
	{
		if (p == null)
		{
			throw new RuntimeException();
		}
		int temp = _position.getManhattanDistanceTo(p);
		_mileage += temp;
		_position = p;
	}
	
	public Position getInitialPosition()
	{
		return _initialPosition;
	}
	
	public void setInitialPosition(Position p)
	{
		_initialPosition = p;
	}

}
