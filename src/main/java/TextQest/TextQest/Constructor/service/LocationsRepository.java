package TextQest.TextQest.Constructor.service;

import TextQest.TextQest.Constructor.model.Locations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationsRepository extends JpaRepository<Locations, String>, JpaSpecificationExecutor<Locations> {
}
