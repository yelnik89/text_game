package TextQest.TextQest.Constructor.controller;

import TextQest.TextQest.Constructor.model.Games;
import TextQest.TextQest.Constructor.service.GamesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
public class GameRestController {

    @Autowired
    private GamesService gamesService;


//    URL:
//    http://localhost:8080/game/gameId
    @GetMapping(value = "game/{gameId}")
    public ResponseEntity<Games> getGame(@PathVariable("gameId") Integer id) {
        return ResponseEntity.ok(gamesService.getGamesById(id));
    }

    @PutMapping(value = "game/{gameId}")
    public ResponseEntity<Games> updateGame(@RequestBody Games game, @PathVariable("gameId") Integer id) {
        System.out.println("(Servis Side) Editing game:" +game.getId());
        return ResponseEntity.ok(gamesService.update(id, game));
    }

    @DeleteMapping(value = "game/{gameId}")
    public ResponseEntity<Void> deleteGame(@PathVariable("gameId") Integer id) {
        System.out.println("(Server Side) Deleting game:" + id);
        gamesService.delete(id);
        return ResponseEntity.ok().build();
    }


}
