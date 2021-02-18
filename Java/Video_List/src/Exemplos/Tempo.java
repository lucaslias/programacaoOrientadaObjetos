package Exemplos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Tempo {

	public static void main(String args[]) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		// ArrayList add
		long startTime = System.nanoTime();

		for (int i = 0; i < 100000; i++) {
			arrayList.add(i);
		}
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println(" ArrayList add:  " + duration);

		// LinkedList add
		startTime = System.nanoTime();

		for (int i = 0; i < 100000; i++) {
			linkedList.add(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("-LinkedList add: " + duration + "\n");

		// ArrayList get
		startTime = System.nanoTime();

		for (int i = 0; i < 10000; i++) {
			arrayList.get(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("-ArrayList get:  " + duration);

		// LinkedList get
		startTime = System.nanoTime();

		for (int i = 0; i < 10000; i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println(" LinkedList get: " + duration + "\n");
		
		// ArrayList set
		startTime = System.nanoTime();

		for (int i = 0; i < 10000; i++) {
			linkedList.set(i, i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("-ArrayList set:  " + duration);

		// LinkedList set
		startTime = System.nanoTime();

		for (int i = 0; i < 10000; i++) {
			linkedList.set(i, i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println(" LinkedList set: " + duration + "\n");

		// ArrayList remove
		startTime = System.nanoTime();

		for (int i = 9999; i >= 0; i--) {
			arrayList.remove(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println(" ArrayList remove:  " + duration);

		// LinkedList remove
		startTime = System.nanoTime();

		for (int i = 9999; i >= 0; i--) {
			linkedList.remove(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("-LinkedList remove: " + duration);

	}

}