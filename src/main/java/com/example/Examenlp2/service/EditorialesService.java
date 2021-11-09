package com.example.Examenlp2.service;

import java.util.List;

import com.example.Examenlp2.entity.Editoriales;

public interface EditorialesService 
{
	String insertarEditoriales (Editoriales editoriales);
	List<Editoriales> listarEditoriales();
	Editoriales buscarEditoriales(int IDEDITORIAL);
	String eliminarEditoriales(int IDEDITORIAL);
	String actualizarEditoriales(Editoriales editoriales);
}
