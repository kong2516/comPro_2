package recursive;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {

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
		List<T> ne = new ArrayList<T>();
		ne.addAll(subunique(ne, list));
		return ne;
	}

	public static <T> List<T> subunique(List<T> base, List<T> list) {
		if (list.size() == 0)
			return list;
		List<T> sub = list.subList(1, list.size());
		if (!base.contains(list.get(0)))
			base.add(list.get(0));
		return subunique(base, sub);
	}

	// public static void main(String[] args) {
	// List<String> list = new ArrayList<>();
	// list.addAll(Arrays.asList("a", "b", "a", "a", "z", "b", "z"));
	// System.out.println(unique(list));
	// // ["a", "b", "z"]
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

	public static List<?> subflatten(List<Object> base, List<?> list) {
		if (list.size() == 0)
			return list;
		List<?> sub = list.subList(1, list.size());
		Object item = list.get(0);
		if (item.getClass().getSimpleName().equals("ArrayList")) {
			base.addAll(subflatten(base, (List) item));
		} else
			base.add(item);
		return subflatten(base, sub);
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
