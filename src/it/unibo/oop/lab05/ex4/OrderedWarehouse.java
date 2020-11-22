package it.unibo.oop.lab05.ex4;


import java.util.Set;
import java.util.TreeSet;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.WarehouseImpl;

public class OrderedWarehouse extends WarehouseImpl {
        
        public OrderedWarehouse() {}
        
	Set<ComparableProduct> ordWare = new TreeSet<ComparableProduct>();
	
	public Set<Product> allProducts() {
		return new TreeSet<Product>(ordWare);
	}
	
	public Set<String> allNames() {
	    Set<String> names = new TreeSet<>();
	    for(ComparableProduct p : ordWare) {
	       names.add(p.getName());
	    }
	    return names;
	}
	public void addProduct(ComparableProduct p) {
            ordWare.add(p);               
    }

}
