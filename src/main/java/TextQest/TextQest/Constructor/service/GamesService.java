package TextQest.TextQest.Constructor.service;


import TextQest.TextQest.Constructor.model.Games;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class GamesService {

    @Autowired
    private GamesRepository gamesRepository;

    public void delete(Integer id) {
        gamesRepository.delete(this.getGamesById(id));
    }

    public Games create(Games games) {
        return gamesRepository.save(games);
    }

    public Games update(Integer id, Games newGame){
        Games originalGame = getGamesById(id);
        if (!originalGame.getId().equals(id)) {
            throw new IllegalStateException("Mismatch of game id's!");
        }
        newGame.setId(originalGame.getId());
        return gamesRepository.save(newGame);
    }

    public List<Games> getAllGames() {
        return gamesRepository.findAll();
    }

    public Games getGamesById(Integer id) {
        String stringId = id.toString();
        return gamesRepository.findById(stringId).orElseThrow(ResourceNotFoundException::new);
    }

    //TODO
    //public Games getGamesByAuthor
}
