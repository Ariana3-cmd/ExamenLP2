package com.example.Examenlp2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.Examenlp2.entity.Libros;

@Repository
public interface LibrosRepository extends JpaRepository<Libros, Integer> {
	
	@Query(value = "{ CALL SP_LISTAR_LIBROS(0) }", nativeQuery = true)
	List<Libros> listarLibro();
	
	@Query(value = "{call SP_LISTAR_LIBROS(:p_nIDLIBROS )}", nativeQuery = true) 
	Libros buscarLibro(@Param("p_nIDLIBROS ") int p_nIDLIBROS );
	
	@Query(value = "{ CALL SP_ELIMINAR_LIBROS(:P_nIDLI) }", nativeQuery = true)
	String eliminarLibro(@Param("P_nIDLI") int P_nIDLI);
	
	@Query(value = "{call SP_INS_LIBROS(:p_titulo,:p_paginas,:p_descripcion,:p_autor,:p_editorial)}", nativeQuery = true) 
	String insertarLibro(@Param("p_titulo") String p_titulo, @Param("p_paginas") int p_paginas,@Param("p_descripcion") String p_descripcion,@Param("p_autor") int p_autor,@Param("p_editorial") int p_editorial);
	
	@Query(value = "{call SP_UPD_LIBROS(:p_nId,:p_titulo,:p_paginas,:p_descripcion,:p_autor,:p_editorial)}", nativeQuery = true) 
	String actualizarLibro(@Param("p_nId") int p_nId ,@Param("p_titulo") String p_titulo, @Param("p_paginas") int p_paginas,@Param("p_descripcion") String p_descripcion,@Param("p_autor") int p_autor,@Param("p_editorial") int p_editorial);
	
}
