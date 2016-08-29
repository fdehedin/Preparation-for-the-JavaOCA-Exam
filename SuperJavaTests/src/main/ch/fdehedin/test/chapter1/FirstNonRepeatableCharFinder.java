package ch.fdehedin.test.chapter1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class FirstNonRepeatableCharFinder {

	public static final String test = "l�f�lasjkdpf�lkasdjfl�kasjdf�jklasdf";

	public void findFirstNonRepeatedChar(String stringToFind) {

		String[] arrChars = test.split("");
		System.out.println("arrTest.length: " + arrChars.length);

		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();

	
		
		for (int i = 0; i < arrChars.length; i++) {
			if (!lhm.containsKey(arrChars[i])) {
			//	System.out.println("putting key: " + arrChars[i]);
				lhm.put(arrChars[i], 0);
			}

			int n = lhm.get(arrChars[i]);
			n += 1;
			//System.out.println("key: " + arrChars[i]);
			//System.out.println("arrChars" + lhm.get(arrChars));

			lhm.put(arrChars[i], n);
		}

		Set<Entry<String, Integer>> set = lhm.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Entry<String, Integer> entry = (Entry<String, Integer>) it.next();
			if (entry.getValue() == 1) {
				System.out.println("and the first non repeated string is: " + entry.getKey());
			}
		}

	}

	public static void main(String[] args) {
		new FirstNonRepeatableCharFinder().findFirstNonRepeatedChar(test);
	}

}
