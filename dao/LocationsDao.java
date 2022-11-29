package dao;

import models.Location;
import models.Address;
import java.util.List;
public interface LocationsDao {

    Location getLocationByID (int ID);
    List<Location> getAllLocations();
    Location addLocation(Location location);
    void updateLocation(Location location);
    void deleteLocationByID(int ID);

    List<Location> getLocationsForAddress(Address address);
}
