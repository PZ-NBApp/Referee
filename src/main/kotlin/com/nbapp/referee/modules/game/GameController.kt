package com.nbapp.referee.modules.game

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("")
class GameController (private val gameService: GameService) {
    @GetMapping
    fun getGames():Iterable<Game> {
        return gameService.getGames()
    }

    @GetMapping("/{id}")
    fun getGameById(@PathVariable id:Int): Game {
        return gameService.getGameById(id)
    }

    @PatchMapping("/{id}")
    fun enterGamerResult(@PathVariable id: Int, @RequestBody text:Map<String,Int>) {
        gameService.updateGame(id, text)
    }
}