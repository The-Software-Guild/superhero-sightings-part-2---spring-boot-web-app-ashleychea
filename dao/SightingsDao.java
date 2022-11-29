package dao;

import models.Hero;
import models.Sighting;
import models.Location;
import java.util.List;

public interface SightingsDao {

    Sighting getSightingByID(int ID);
    List<Sighting> getAllSightings();
    Sighting addSighting(Sighting sighting);
    void updateSighting(Sighting sighting);
    void deleteSightingByID(int ID);

    List<Sighting> getSightingsForLocation(Location location);
}
