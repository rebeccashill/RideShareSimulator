package a3;

public class RideRequestImpl implements RideRequest
{
	private Position _clientPos;
	private Position _destination;
	private boolean _completed;
	private CompletedRide _ride;

	public RideRequestImpl(Position clientPosition, Position destination)
	{
		if (clientPosition == null)
		{
			throw new RuntimeException();
		}
		if (destination == null)
		{
			throw new RuntimeException();
		}
		_clientPos = clientPosition;
		_destination = destination;
		_completed = false;
	}

	public Position getClientPosition()
	{
		return _clientPos;
	}

	public Position getDestination()
	{
		return _destination;
	}

	public boolean getIsComplete()
	{
		return _completed;
	}

	public CompletedRide complete(Driver driver)
	{
		if (driver == null)
		{
			throw new RuntimeException();
		}
		if (!getIsComplete())
		{
			_completed = true;
			driver.getVehicle().moveToPosition(_clientPos);
			driver.getVehicle().moveToPosition(_destination);
			_ride = new CompletedRideImpl(this, driver);
			driver.getVehicle().setInitialPosition(driver.getVehicle().getPosition());
		}
		return _ride;
	}

}
