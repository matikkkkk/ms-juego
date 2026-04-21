package com.example.ms_juego.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ms_juego.Model.Juego;
import com.example.ms_juego.Repository.JuegoRepository;

@Service
public class JuegoService {
@Autowired
private JuegoRepository repository;

public Juego findById(int id){
    return repository.findById(id).orElse(null);
}
}
