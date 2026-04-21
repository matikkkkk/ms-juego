package com.example.ms_juego.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ms_juego.Model.Juego;
@Repository
public interface JuegoRepository extends JpaRepository<Juego, Integer> {

}
