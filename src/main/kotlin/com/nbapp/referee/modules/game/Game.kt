package com.nbapp.referee.modules.game

import javax.persistence.*

@Entity
class Game(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val gameId: Int? = null,

        val hostId: Int,

        val guestId: Int,

        var hostResult: Int,

        var guestResult: Int)
{
    fun updateHostResult(newResult: Int){
        hostResult = newResult
    }
    fun updateGuestResult(newResult: Int){
        guestResult=newResult
    }
}
