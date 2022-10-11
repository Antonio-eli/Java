package com.coderroan.poointerfaces.repositorio;

import java.util.List;

import com.coderroan.poointerfaces.modelo.Cliente;

public interface OrdenableRepositorio {
	List<Cliente> listar(String campo, Direccion dir);
}
