package com.radsouza.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.radsouza.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
