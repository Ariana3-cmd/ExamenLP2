package com.example.Examenlp2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Examenlp2.entity.Editoriales;
@Repository

public interface EditorialesRepository extends JpaRepository<Editoriales, Integer> {
	
	@Query(value = "{ CALL SP_LISTAR_EDITORIALES(0) }", nativeQuery = true)
	List<Editoriales> listarEditoriales();
	
	@Query(value = "{call SP_LISTAR_EDITORIALES(:p_nIDEDITORIAL )}", nativeQuery = true) 
	Editoriales buscarEditoriales(@Param("p_nIDEDITORIAL ") int p_nIDEDITORIAL );
	
	@Query(value = "{ CALL SP_ELIMINAR_EDITORIALES(:P_nIDEDIT) }", nativeQuery = true)
	String eliminarEditoriales(@Param("P_nIDEDIT") int P_nIDEDIT);
	
	@Query(value = "{call SP_INS_EDITORIALES(:P_NOMBRE)}", nativeQuery = true) 
	String insertarEditoriales(@Param("P_NOMBRE") String P_NOMBRE);
	
	@Query(value = "{call SP_UPD_EDITORIALES(:p_nId,:P_NOMBRE)}", nativeQuery = true) 
	String actualizarEditoriales(@Param("p_nId") int p_nId ,@Param("P_NOMBRE") String P_NOMBRE);
	
}
