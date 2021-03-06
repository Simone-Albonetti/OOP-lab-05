package it.unibo.oop.lab05.ex4;
/**
 *
 */
public final class UseWarehouse {

    private UseWarehouse() {
    }

    /**
     * @param args
     *            unused
     */
    public static void main(final String[] args) {
        /*
         * Provide a different solution to the previous exercise by implementing
         * two classes: ComparableProduct and OrderedWarehouse. Classes from the
         * previous exercise can be extended and reused, but not modified.
         * 
         * The new solution must comply to these new requirements:
         * 
         * 1) allProducts() returns the products alphabetically ordered. Prefer
         * solutions that reuse existing code.
         * 
         * 2) The implementation of Product must implement Comparable<Product>.
         */
        final ComparableProduct p1 = new ComparableProduct("Viti", 150);
        final ComparableProduct p2 = new ComparableProduct("Bulloni", 180);
        final ComparableProduct p3 = new ComparableProduct("Rondelle", 100);
        final OrderedWarehouse w = new OrderedWarehouse();
        w.addProduct(p3);
        w.addProduct(p1);
        w.addProduct(p2);
        System.out.println(w.allNames());
        System.out.println(w.allProducts());
    }

}
