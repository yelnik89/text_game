package TextQest.TextQest.Constructor.service;


import TextQest.TextQest.Constructor.model.Games;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface GamesRepository extends JpaRepository<Games, String>, JpaSpecificationExecutor<Games> {
}
