package com.example.ms_juego.Service;

import java.util.List;

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
public List<Juego> findAll(){
    return repository.findAll();
}
}
