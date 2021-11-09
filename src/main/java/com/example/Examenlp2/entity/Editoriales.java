package com.example.Examenlp2.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="editoriales")
public class Editoriales implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ideditorial")
	private int ideditorial;
	
	@Column(name="editorial")
	private String editorial;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "editoriales")
	//@JoinColumn(name="editorial_id")
	private List<Libros> libros;
	
}
