package com.nbapp.referee.modules.game
import com.nbapp.referee.modules.team.Team
import javax.persistence.*

@Entity
data class Game(
        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "hostId")
        var host : Team,
        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "guestId")
        var guest : Team,
        var hostResult: Int,
        var guestResult: Int)

{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val gameId: Int = 0
    fun updateHostResult(newResult: Int){
        hostResult = newResult
    }
    fun updateGuestResult(newResult: Int){
        guestResult=newResult
    }
}
