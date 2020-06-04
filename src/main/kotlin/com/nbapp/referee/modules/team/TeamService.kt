package com.nbapp.referee.modules.team

import org.springframework.stereotype.Service

@Service
class TeamService (private val teamRepository: TeamRepository){
    fun getTeams():Iterable<Team> {
        return teamRepository.findAll()
    }

    fun getTeamById(id : Int) : Team {
        return teamRepository.getOne(id)
    }
}