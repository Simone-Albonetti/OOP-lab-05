package it.unibo.oop.lab05.ex3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class WarehouseImpl implements Warehouse {
	
	Set<Product> warehouse = new LinkedHashSet<>();

	public void addProduct(Product p) {
		warehouse.add(p);		
	}


	public Set<String> allNames() {
		Set<String> names = new TreeSet<>();
		for (Product p : warehouse) {
			names.add(p.getName());
		}
		return names;
	}


	public Set<Product> allProducts() {
		return new HashSet<Product>(warehouse);
	}

	public boolean containsProduct(Product p) {
		return (warehouse.contains(p));
	}

	public double getQuantity(String name) {
		for(Product p : warehouse) {
			if ((p.getName()).equals(name)) {
				return p.getQuantity();
			}
		}
		return 0;
	}

	public String toString(){
		return "WarehouseImpl [warehouse=" + warehouse + "]";
	}

}
