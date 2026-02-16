package Esercizio_Liste;

import java.util.LinkedList;

public class Pila {
	private LinkedList<Object> stack = new LinkedList<>();

	public void add(Object ob) {
		stack.addFirst(ob);
	}

	public Object remove() throws RuntimeException {
		if (stack.isEmpty()) {
			throw new RuntimeException("Pila Vuota");
		} else {
			return stack.removeFirst();
		}

	}
}
