package com.coderroan.poointerfaces.repositorio;

import java.util.ArrayList;
import java.util.List;

import com.coderroan.poointerfaces.modelo.Cliente;

public class ClienteListRepositorio implements CrudRepositorio, OrdenableRepositorio, PaginableRepositorio {
	private List<Cliente> dataSource;
	
	

	public ClienteListRepositorio() {
		this.dataSource = new ArrayList<Cliente>();
	}

	@Override
	public List<Cliente> listar() {
		return null;
	}

	@Override
	public Cliente porId(Integer id) {
		Cliente resultado = null;
		for (Cliente cli : dataSource) {
			if (cli.getId().equals(id)) {
				resultado = cli;
				break;
			}
		}
		return resultado;
	}

	@Override
	public void crear(Cliente cliente) {
		this.dataSource.add(cliente);
	}

	@Override
	public void editar(Cliente cliente) {
		Cliente cli = this.porId(cliente.getId());
		cli.setNombre(cliente.getNombre());
		cli.setApellido(cliente.getApellido());
		
	}

	@Override
	public void eliminar(Integer id) {
		this.dataSource.remove(this.porId(id));
		
	}

	@Override
	public List<Cliente> listar(String campo, Direccion dir) {
		return null;
	}

	@Override
	public List<Cliente> listar(int desde, int hasta) {
		return null;
	}

}
