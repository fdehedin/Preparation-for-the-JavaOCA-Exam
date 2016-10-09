package ch.fdehedin.oca.buildingblocks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableHashMap {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("eins");
		list.add("noch eins");
		list.add("und noch eins");
		list.add("a 1");

		Iterator<String> itList = list.iterator();
		while (itList.hasNext()) {
			String s = (String) itList.next();
			if (s.equals("noch eins")) {
				itList.remove();
			}
			System.out.println("string: " + s);
		}
		Iterator<String> itList2 = list.iterator();
		while (itList2.hasNext()) {
			String s = (String) itList2.next();
			System.out.println("string 2: " + s);
		}

		HashMap<String, String> hm = new HashMap<String, String>();

		hm.put("1", null);
		hm.put("2", null);

		try {

			Hashtable<String, String> ht = new Hashtable<String, String>();

			ht.put("1", null);
			ht.put("2", null);
		} catch (NullPointerException e) {
			System.out.println("Error: " + e.getMessage());
		}

		Set<Entry<String, String>> set = hm.entrySet();
		Iterator it = set.iterator();

		while (it.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) it.next();
			System.out.println("key ist: " + entry.getKey() + " / " + entry.getValue());
			if (entry.getKey().equals("1")) {
				it.remove();
			}
		}

		Set<Entry<String, String>> set2 = hm.entrySet();
		Iterator it2 = set2.iterator();

		while (it2.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) it2.next();
			System.out.println("2 key ist: " + entry.getKey() + " / " + entry.getValue());

		}

	}
}
