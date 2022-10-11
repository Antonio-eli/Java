package com.coderroan.poointerfaces.repositorio;

import java.util.List;

import com.coderroan.poointerfaces.modelo.Cliente;

public interface CrudRepositorio {
	List<Cliente> listar();
	Cliente porId(Integer id);
	void crear(Cliente cliente);
	void editar(Cliente cliente);
	void eliminar(Integer id);
	
}
