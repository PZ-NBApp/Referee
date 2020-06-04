package com.nbapp.referee.modules.game

import org.springframework.stereotype.Service

@Service
class GameService(private val gameRepository: GameRepository, private val teamRepository:TeamRepository) {
    fun getGames():Iterable<Game>{
        return gameRepository.findAll()
    }

    fun getGameById(id : Int): Game {
        return gameRepository.getOne(id)
    }

    fun updateGame(id:Int, text:Map<String,Int>) {
        val hostResult:Int=text.getValue("hostResult").toInt()
        val guestResult:Int=text.getValue("guestResult").toInt()
        val game:Game=gameRepository.getOne(id)
        val hostId:Int=game.hostId
        val guestId:Int=game.guestId
        val host:Team= teamRepository.getOne(hostId)
        val guest:Team=teamRepository.getOne(guestId)
        game.updateHostResult(hostResult)
        game.updateGuestResult(guestResult)
        if (hostResult>guestResult){
            host.wonGame()
            guest.lostGame()

        }
        else
        {
            host.lostGame()
            guest.wonGame()
        }
        gameRepository.save(game)
    }
}