package org.pesc.api.repository;

import org.pesc.api.model.Endpoint;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by james on 3/21/16.
 */
@Repository
public interface EndpointRepository extends CrudRepository<Endpoint, Integer>, JpaSpecificationExecutor {

    @Query("from Endpoint where organizationId = ?1")
    List<Endpoint> findByOrganizationId(Integer orgID);

}
