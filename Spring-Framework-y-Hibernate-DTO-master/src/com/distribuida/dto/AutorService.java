package com.distribuida.dto;

import java.util.List;

import com.distribuida.entities.Autor;

public interface AutorService {

public List<Autor> findAll();
	
	public Autor findOne(int id);
	
	public void add(Autor autor);
	
	public void update(Autor autor);
	
	public void delete(int id);

	public List<Autor> findAll(String busqueda);
	
}
