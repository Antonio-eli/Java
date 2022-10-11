package com.coderroan.poointerfaces.repositorio;

import java.util.List;

import com.coderroan.poointerfaces.modelo.Cliente;

public interface PaginableRepositorio {
	List<Cliente> listar(int desde, int hasta);
}
