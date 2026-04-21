package com.example.ms_juego.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ms_juego.Model.Juego;
import com.example.ms_juego.Service.JuegoService;

@RestController

@RequestMapping("/api/v1/juegos")
public class JuegoController {
@Autowired
private JuegoService service;
@GetMapping("/{id}")
public Juego buscarPorId(@PathVariable int id){
    return service.findById(id);
}
}
