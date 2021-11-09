package com.example.Examenlp2.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Examenlp2.entity.Libros;
import com.example.Examenlp2.repository.LibrosRepository;
import com.example.Examenlp2.service.LibrosService;

public class LibrosImpl implements LibrosService{
	
	@Autowired
	private LibrosRepository l;
	
	@Override
	public String insertarLibro(Libros libros) {
		// TODO Auto-generated method stub
		return l.insertarLibro(libros.getTitulo(),libros.getPaginas(),libros.getDescripcion(),libros.getAutores().getIdautor(), libros.getEditoriales().getIdeditorial());
	}

	@Override
	public List<Libros> listarLibro() {
		// TODO Auto-generated method stub
		return l.listarLibro();
	}

	@Override
	public Libros buscarLibro(int IDLIBRO) {
		// TODO Auto-generated method stub
		return l.buscarLibro(IDLIBRO);
	}

	@Override
	public String eliminarLibro(int IDLIBRO) {
		// TODO Auto-generated method stub
		return l.eliminarLibro(IDLIBRO);
	}

	@Override
	public String actualizarLibro(Libros libro) {
		// TODO Auto-generated method stub
		return l.actualizarLibro(libro.getIdlibro(), libro.getTitulo(), libro.getPaginas(), libro.getDescripcion(), libro.getAutores().getIdautor(), libro.getEditoriales().getIdeditorial());
	}

}
