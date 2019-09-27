package a3;

public class CompletedRideImpl implements CompletedRide
{
	private RideRequest _request;
	private Driver _driver;
	private int _getWait;

	public CompletedRideImpl(RideRequest request, Driver driver)
	{
		if (request == null)
		{
			throw new RuntimeException();
		}
		if (driver == null)
		{
			throw new RuntimeException();
		}
		_request = request;
		_driver = driver;
		if (_request.getIsComplete())
		{
			_getWait = _driver.getVehicle().getInitialPosition().getManhattanDistanceTo(_request.getClientPosition());
		}
		else
		{
			_getWait = _driver.getVehicle().getPosition().getManhattanDistanceTo(_request.getClientPosition());
		}
	}

	public RideRequest getRequest()
	{
		return _request;
	}

	public Driver getDriver()
	{
		return _driver;
	}

	public int getWaitTime()
	{
		return _getWait;
	}
}

