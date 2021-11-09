package com.example.Examenlp2.service;

import java.util.List;

import com.example.Examenlp2.entity.Autores;

public interface AutoresService {

	String insertarAutores (Autores autores);
	List<Autores> listarAutores();
	Autores buscarAutores(int IDAUTOR);
	String eliminarAutores(int IDAUTOR);
	String actualizarAutores(Autores autores);
}
