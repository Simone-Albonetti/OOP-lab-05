package it.unibo.oop.lab05.ex5;

import java.util.Collection;

/**
 *
 */
public final class Utilities {

    private Utilities() {
    }

    /**
     * Copies all the element of the first collection in the second collection.
     * 
     * @param source
     *            the source collection
     * @param target
     *            the target collection
     * @param <X>
     *            Collection type
     */
    public static <X> void copyAll(final Collection<X> source, final Collection<? super X> target) {
        for (X x : source) {
            target.add(x);
        }
    }

    /**
     * @param coll
     *            the collection
     * @param <X>
     *            collection type
     * @return a random element from the collection
     * 
     */
    public static <X> X getRandomElement(final Collection<X> coll) {
        var x = Math.random()*100 % coll.size(); 
        var y = coll.iterator();
        for(int i = 1 ; i< x ; i++) {
            y.next();
        }
        return y.next();
    }

    /**
     * @param one
     *            first collection
     * @param two
     *            second collection
     * @param <X>
     *            First collection type
     * @param <Y>
     *            Second collection type
     * @return a pair with two random elements
     */
    public static <X, Y> Pair<X, Y> getRandomPair(final Collection<X> one, final Collection<Y> two) {
        var z = getRandomElement(one);
        var k = getRandomElement(two);
        return new Pair(z,k);
    }
}
