package com.formaciondbi.springboot.app.item.models.services;

import java.util.List;

import com.formaciondbi.springboot.app.item.models.Item;

public interface ItemService {
	List<Item> findAll();
	Item findById(Long id, Integer cantidad);
}
