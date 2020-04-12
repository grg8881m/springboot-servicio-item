package com.formaciondbi.springboot.app.item.models.services;

import java.util.List;

import com.formaciondbi.springboot.app.item.models.Item;
import com.formaciondbi.springboot.app.commons.models.entity.Producto;

public interface ItemService {
	List<Item> findAll();
	Item findById(Long id, Integer cantidad);
	
	Producto save(Producto producto);
	Producto update(Long id, Producto producto);
	void delete(Long id);
}
