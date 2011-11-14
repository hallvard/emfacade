package org.eclipse.gmt.emfacade.lib;

import java.util.Map;

import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Pair;

public class MapExtensions extends CollectionExtensions {

	/**
	 * The operator mapping from {@code +=} to {@link Map#put(Object)}. Returns <code>true</code> if the
	 * collection changed due to this operation.
	 * 
	 * @param map
	 *            the to-be-changed map. May not be <code>null</code>.
	 * @param pair
	 *            the pair that should be added to the map.
	 * @return <code>true</code> if the map changed due to this operation.
	 * @see Map#put(Object)
	 * @see Pair
	 */
	public static <K,V> boolean operator_add(Map<K, ? super V> map, Pair<K, V> pair) {
		if (map.get(pair.getKey()) == pair.getValue()) {
			return false;
		}
		map.put(pair.getKey(), pair.getValue());
		return true;
	}
}
