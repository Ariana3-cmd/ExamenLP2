package com.example.Examenlp2.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="libros")
public class Libros implements Serializable {

	public Libros(int idlibro, String titulo, String paginas, String descripcion) {
		super();
		this.idlibro = idlibro;
		this.titulo = titulo;
		this.paginas = paginas;
		this.descripcion = descripcion;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idlibro")
	private int idlibro;
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="paginas")
	private String paginas;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idautor",referencedColumnName = "autor_id")
	private Autores autores;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ideditorial",referencedColumnName = "editorial_id")
	private Editoriales editoriales;


}
