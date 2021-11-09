package com.example.Examenlp2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Examenlp2.entity.Autores;


@Repository
public interface AutoresRepository extends JpaRepository<Autores, Integer> {
	
	@Query(value = "{ CALL SP_LISTAR_AUTORES(0) }", nativeQuery = true)
	List<Autores> listarAutores();
	
	@Query(value = "{call SP_LISTAR_AUTORES(:p_nIDAUTOR )}", nativeQuery = true) 
	Autores buscarAutores(@Param("p_nIDAUTOR ") int p_nIDAUTOR );
	
	@Query(value = "{ CALL SP_ELIMINAR_AUTORES(:p_nIDAUTOR) }", nativeQuery = true)
	String eliminarAutor(@Param("p_nIDAUTOR") int p_nIDAUTOR);
	
	@Query(value = "{call SP_INS_AUTORES(:P_NOMBRE,:P_APELLIDO)}", nativeQuery = true) 
	String insertarAutor(@Param("P_NOMBRE") String P_NOMBRE,@Param("P_APELLIDO") String P_APELLIDO);
	
	@Query(value = "{call SP_UPD_AUTORES(:P_ID,:P_NOMBRE,:P_APELLIDO)}", nativeQuery = true) 
	String actualizarSede(@Param("P_ID") int P_ID ,@Param("P_NOMBRE") String P_NOMBRE,@Param("P_APELLIDO") String P_APELLIDO);
	
	
}
