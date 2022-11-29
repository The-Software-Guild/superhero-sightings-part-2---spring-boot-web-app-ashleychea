package dao;

import models.Address;
import models.Organization;
import java.util.List;


public interface OrganizationsDao {

    Organization getOrganizationByID(int ID);
    List<Organization> getAllOrganizations();
    Organization addOrganization(Organization organization);
    void updateOrganization(Organization organization);
    void deleteOrganizationByID(int ID);

    List<Organization> getOrganizationForAddress(Address address);

}
