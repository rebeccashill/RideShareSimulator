package a3;

public class ShortestWaitDispatcher implements Dispatcher
{
	public Driver chooseDriver(Driver[] availableDrivers, RideRequest request)
	{
		int driverIndex = 0;
		int minDist = Integer.MAX_VALUE;
		for ( int i = 0; i < availableDrivers.length; i++)
		{
			if (availableDrivers[i].getVehicle().getPosition().getManhattanDistanceTo(request.getClientPosition()) < minDist)
			{
				driverIndex = i;
				minDist = availableDrivers[i].getVehicle().getPosition().getManhattanDistanceTo(request.getClientPosition());
			}
		}
		return availableDrivers[driverIndex];
	}
}