package com.nbapp.referee.modules.team

import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.JpaRepository


@Repository
interface TeamRepository:JpaRepository<Team,Int>
