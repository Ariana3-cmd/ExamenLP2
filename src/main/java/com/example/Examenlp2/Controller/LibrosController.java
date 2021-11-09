package com.example.Examenlp2.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Examenlp2.entity.Libros;
import com.example.Examenlp2.service.LibrosService;
import com.example.Examenlp2.serviceImpl.LibrosImpl;
import com.example.sigca.entity.Distrito;
import com.example.sigca.entity.Usuario;

@RestController
@RequestMapping("/api/libro")
public class LibrosController {
	@Autowired
	private LibrosImpl libro;
	
	@GetMapping("/all")
	public ResponseEntity<List<Libros>> listarLibro(){
		try {
			List<Libros> list = new ArrayList<>();
			list=libro.listarLibro();
			if (list.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(list,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/search/{id}")
	public ResponseEntity<Libro> buscarLibro(@PathVariable("id") int id){
		Libros d = libro.buscarLibro(id);
		if (d.getIdlibro()>0) {
			return new ResponseEntity<>(d,HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	@PostMapping("/insertar")
	public ResponseEntity<Libros> save(@RequestBody Libros libro){
		try {
			Libros a = new Libros();
			
			a.setIdlibro(libro.getIdlibro());
			a.setTitulo(libro.getTitulo());
			a.setPaginas(libro.getDescripcion());
			a.setAutores(libro.getAutores().getIdautor());
			a.setEditoriales(libro.getEditoriales().getIdeditorial()))
			Libros al = LibrosService.create(a);
			return new ResponseEntity<>(al, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
