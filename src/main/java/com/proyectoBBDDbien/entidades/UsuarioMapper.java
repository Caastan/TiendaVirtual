package com.proyectoBBDDbien.entidades;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UsuarioMapper implements RowMapper<Usuarios>{

	@Override
	public Usuarios mapRow(ResultSet rs, int rowNum) throws SQLException {
		Usuarios u = new Usuarios();
		u.setNombre(rs.getString("nombre"));
		u.setPassword(rs.getString("password"));
		u.setLogin(rs.getString("login"));
		u.setId(rs.getInt("id"));
		u.setFecha(rs.getString("fechanacimiento"));
		return u;
	}
	
}
