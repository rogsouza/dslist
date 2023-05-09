package com.radsouza.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.radsouza.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
