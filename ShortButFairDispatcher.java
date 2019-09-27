package a3;

import java.util.ArrayList;

public class ShortButFairDispatcher implements Dispatcher{
	private ArrayList<Driver> lastFive = new ArrayList<Driver>();

	public Driver chooseDriver(Driver[] availableDrivers, RideRequest request)
	{
		int driverIndex = 0;
		int minDist = Integer.MAX_VALUE;
		for ( int i = 0; i < availableDrivers.length; i++)
		{
			if (availableDrivers[i].getVehicle().getPosition().getManhattanDistanceTo(request.getClientPosition()) < minDist && !lastFive.contains(availableDrivers[i]))
			{
				driverIndex = i;
				minDist = availableDrivers[i].getVehicle().getPosition().getManhattanDistanceTo(request.getClientPosition());
			}
		}
		if (lastFive.size() == 5)
		{
			lastFive.remove(0);
		}
		lastFive.add(availableDrivers[driverIndex]);
		return availableDrivers[driverIndex];
	}
}
