package org.eclipse.gmt.emfacade.swt.util;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.util.EcoreUtil;

public class Util {
	
	private static Map<String, Pattern> patterns = new HashMap<String, Pattern>();

	public static Pattern getPattern(String regex) {
		Pattern pattern = patterns.get(regex);
		if (pattern == null) {
			pattern = Pattern.compile(regex);
			patterns.put(regex, pattern);
		}
		return pattern;
	}
	
	public static Matcher parse(String s, String regex) {
		Pattern pattern = getPattern(regex);
		Matcher matcher = pattern.matcher(s);
		matcher.matches();
		return matcher;
	}
	
	public static <T> Object valueOf(Matcher matcher, int group, Class<?> clazz, Object result) {
		try {
			String s = matcher.group(group);
			result = (T) (clazz.isPrimitive() ? EcoreUtil.wrapperClassFor(clazz) : clazz).getMethod("valueOf", String.class).invoke(null, s);
		} catch (Exception e) {
		}
		return result;
	}
	
	public static Object[] valuesOf(Matcher matcher, Class<?> clazz, Object def) {
		int size = matcher.groupCount();
		@SuppressWarnings("unchecked")
		Object[] result = (Object[]) Array.newInstance(clazz, size);
//		for (int i = 0; i < size; i++) {
//			Array.set(result, i, valueOf(matcher, i + 1, clazz, def));
//		}
		for (int i = 0; i < size; i++) {
			result[i] = valueOf(matcher, i + 1, clazz, def);
		}
		return result;
	}

	public static Object[] parse(String s, String regex, Class<?> clazz, Object def) {
		return valuesOf(parse(s, regex), clazz, def);
	}

	public static <T, R> R parse(String s, String regex, Class<T> valueClass, T def, Class<R> resultClass) {
		Object[] values = parse(s, regex, (valueClass.isPrimitive() ? EcoreUtil.wrapperClassFor(valueClass) : valueClass), def);
		Class<T>[] params = new Class[values.length];
		for (int i = 0; i < params.length; i++)
			params[i] = valueClass;
		R result = null;
		try {
			result = resultClass.getConstructor(params).newInstance(values);
		} catch (Exception e) {
			System.err.println("Exception when parsing " + s + ": " + e);
		}
		return result;
	}
}
