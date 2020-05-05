package recursive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListUtil_re {

	/**
	 * Return a list containing the first unique occurrence of elements in the
	 * parameter list. Does not modify the parameter. For example, if list = { a, b,
	 * b, b, c, b, c, c} then unique(list) will return {a, b, c}.
	 * 
	 * Objects in the list are compared using their own equals method.
	 * 
	 * @param list<T> is a list of any kind of object. The elements are not null.
	 * @return a new list containing first unique occurrence of elements in list
	 */
	public static <T> List<T> unique(List<T> list) {
		List<T> uniqueList = new ArrayList<T>();
		uniqueList.addAll(subunique(uniqueList, list));
		return uniqueList;
	}

	public static <T> List<T> subunique(List<T> base, List<T> list) {
		List<T> newBase = new ArrayList<T>();
		newBase.addAll(base);

		if (list.size() == 0) 
			return newBase;

		if (!base.contains(list.get(0)))
			newBase.add(list.get(0));

		return subunique(newBase, list.subList(1, list.size()));
	}

	// public static void main(String[] args) {
	// 	List<String> list = new ArrayList<>();
	// 	list.addAll(Arrays.asList("a", "b", "a", "a", "z", "b", "z"));
	// 	System.out.println(unique(list));
	// 	// ["a", "b", "z"]
	// }

	/**
	 * Flatten a list containing nested lists into a single list containing all the
	 * elements of the nested lists.
	 * 
	 * For Example: list = { a, {b,c}, {d,e,{f,g}} } flatten(list) returns {a, b, c,
	 * d, e, f, g}
	 * 
	 * list = {a, b, c} flatten(list) returns {a, b, c} because there are no nested
	 * lists
	 * 
	 * The type parameter <?> means that the list can contain anything.
	 * 
	 * @param list3 a list of anything, possibly containing other lists as elements
	 * @return a list of all elements without any nested lists
	 */
	public static List<?> flatten(List<?> list3) {
		List<Object> array = new ArrayList<>();
		array.addAll(subflatten(array, list3));
		return array;
	}

	public static List<?> subflatten(List<?> base, List<?> list3) {
		if (list3.size() == 0) return base;
		List<Object> newBase = new ArrayList<>();
		newBase.addAll(base);
		
		if (list3.get(0).getClass().getSimpleName().equalsIgnoreCase("ArrayList")){
			List<?> list = (List<?>)(list3.get(0));
			newBase.addAll(subflatten(new ArrayList<>(), list));
		} else
			newBase.add(list3.get(0));
		return subflatten(newBase, list3.subList(1, list3.size()));
	}

	// public static void main(String[] args) {
	// List<String> list1 = Arrays.asList("a", "b");
	// List<?> list2 = Arrays.asList(list1, "c", "d");
	// List<?> list3 = Arrays.asList("x", "y", list2, "z");
	// System.out.println(list3);
	// // [x, y, [[a, b], c, d], z]
	// System.out.println(flatten(list3));
	// // [x, y, a, b, c, d, z]
	// System.out.println(flatten(list1));
	// // [a, b]
	// }
}
