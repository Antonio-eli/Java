package com.coderroan.poointerfaces.repositorio;
import com.coderroan.poointerfaces.modelo.Cliente;
import java.util.List;

public interface PaginableRepositorio<T> {
	List<T> listar(int desde, int hasta);
}
