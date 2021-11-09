package com.example.Examenlp2.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Examenlp2.entity.Autores;
import com.example.Examenlp2.repository.AutoresRepository;
import com.example.Examenlp2.service.AutoresService;
@Service
public class AutoresImpl implements AutoresService{
	
	@Autowired
	private AutoresRepository autor;
	
	@Override
	public String insertarAutores(Autores autores) {
		// TODO Auto-generated method stub
		return autor.insertarAutor(autores.getNombre(),autores.getApellido());
	}

	@Override
	public List<Autores> listarAutores() {
		// TODO Auto-generated method stub
		return autor.listarAutores();
	}

	@Override
	public Autores buscarAutores(int IDAUTOR) {
		// TODO Auto-generated method stub
		return autor.buscarAutores(IDAUTOR);
	}

	@Override
	public String eliminarAutores(int IDAUTOR) {
		// TODO Auto-generated method stub
		System.out.println(IDAUTOR);
		return autor.eliminarAutor(IDAUTOR);
	}

	@Override
	public String actualizarAutores(Autores autores) {
		// TODO Auto-generated method stub
		return autor.actualizarSede(autores.getIdautor(),autores.getNombre(), autores.getApellido());
	}

}
