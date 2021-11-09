package com.example.Examenlp2.service;

import java.util.List;

import com.example.Examenlp2.entity.Libros;



public interface LibrosService {
	
	String insertarLibro(Libros libros);
	List<Libros> listarLibro();
	Libros buscarLibro(int IDLIBRO);
	String eliminarLibro(int IDLIBRO);
	String actualizarLibro(Libros libro);
}
