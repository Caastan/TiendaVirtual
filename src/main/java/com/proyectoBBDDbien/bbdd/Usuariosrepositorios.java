package com.proyectoBBDDbien.bbdd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.proyectoBBDDbien.entidades.UsuarioMapper;
import com.proyectoBBDDbien.entidades.Usuarios;



@Repository
public class Usuariosrepositorios {
	@Autowired
	protected JdbcTemplate template;
	
	public List<Usuarios> obtenerUsuario() {
		
		return template.query("select * from usuarios where id ='0'", new UsuarioMapper());
	}
}
