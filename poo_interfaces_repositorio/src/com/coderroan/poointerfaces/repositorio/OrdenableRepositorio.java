package com.coderroan.poointerfaces.repositorio;
import com.coderroan.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio<T> {
	List<T> listar(String campo, Direccion dir);
}
