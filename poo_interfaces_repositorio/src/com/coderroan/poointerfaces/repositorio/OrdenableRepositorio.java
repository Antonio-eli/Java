package com.coderroan.poointerfaces.repositorio;
import com.coderroan.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
	List<Cliente> listar(String campo, Direccion dir);
}
