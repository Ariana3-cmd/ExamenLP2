package com.example.Examenlp2.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Examenlp2.entity.Editoriales;
import com.example.Examenlp2.repository.EditorialesRepository;
import com.example.Examenlp2.service.EditorialesService;


@Service
public class EditorialesImpl implements EditorialesService{
	
	@Autowired
	private EditorialesRepository e;
	
	@Override
	public String insertarEditoriales(Editoriales editoriales) {
		// TODO Auto-generated method stub
		return e.insertarEditoriales(editoriales.getEditorial());
	}

	@Override
	public List<Editoriales> listarEditoriales() {
		// TODO Auto-generated method stub
		return e.listarEditoriales();
	}

	@Override
	public Editoriales buscarEditoriales(int IDEDITORIAL) {
		// TODO Auto-generated method stub
		return e.buscarEditoriales(IDEDITORIAL);
	}

	@Override
	public String eliminarEditoriales(int IDEDITORIAL) {
		// TODO Auto-generated method stub
		System.out.println(IDEDITORIAL);
		return e.eliminarEditoriales(IDEDITORIAL);
	}

	@Override
	public String actualizarEditoriales(Editoriales editoriales) {
		// TODO Auto-generated method stub
		return e.actualizarEditoriales(editoriales.getIdeditorial(), editoriales.getEditorial());
	}

}
