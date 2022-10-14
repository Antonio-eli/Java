package com.coderroan.poointerfaces.repositorio;
import com.coderroan.poointerfaces.modelo.Cliente;
import java.util.List;

public interface PaginableRepositorio {
	List<Cliente> listar(int desde, int hasta);
}
