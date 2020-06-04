package com.nbapp.referee.modules.team

import org.springframework.stereotype.Repository

@Repository
interface TeamRepository:JpaRepository<Team,Int>
