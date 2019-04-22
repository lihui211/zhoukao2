package com.lihui.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class StringUtil {

	//方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 (5分)
	public boolean hasLength(String str) {
		boolean empty = str.isEmpty();
		return empty;
	}
	@Test
	public void test1() {
		String str ="";
		boolean b = hasLength(str);
		System.out.println(b);
	}
	
	//方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
	
	public boolean hasText(String str) {
		String string = str.trim();
		boolean empty = string.isEmpty();
		return empty;
	}
	@Test
	public void test2() {
		String str =" ";
		boolean b = hasText(str);
		System.out.println(b);
	}
	
	//方法3：判断是否为手机号码 --------------------------------------(5分)
	public boolean isMobile(String str) {
		if(str.length()!=11) {
			return false;
		}
		
		if(!str.startsWith("1")) {
			return false;
		}
		char[] cs = str.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			if(cs[i]>=97) {
				return false;
			}
		}
		return true;
	}
	  
	@Test
	public void test3() {
		String str ="1311aa28373";
		boolean b = isMobile(str);
		System.out.println(b);
	}
	
	//方法4：判断是否为邮箱 (5分)----------------------------------------------------
	public boolean isEmail(String str) {
		if(str==null) {
			return false;
		}
		
		if(!str.startsWith("www.")) {
			return false;
		}
		if(!str.endsWith("com")) {
			return false;
		}
		if(!str.contains("@")) {
			return false;
		}
		return true;
		
	}
	
	@Test
	public void test4() {
		String str ="www.1914971401@qq.com";
		boolean b = isEmail(str);
		System.out.println(b);
	}
	
	//方法5：反转字符串，例如参数值是“abcdefg”，则输出“gfedcba” (5分)

	public String reverse(String str) {
	String string = StringUtils.reverse(str);
	return string;
		}
	
	@Test
	public void test5() {
		String str ="1234";
		 String string = reverse(str);
		System.out.println(string);
	}
		
	//按要求创建CollectionUtil集合工具类及方法，不得有Bug（10分）
	
	public boolean notEmpty(Collection list){
	    //实现代码
		if(list!=null && !list.isEmpty()) {
			return true;
		}
		
		return false;
	}
	
	@Test
	public void test6() {
		List list = new ArrayList<>();
		Set list2 = new HashSet<>();
		list2.add(2);
		boolean b = notEmpty(list);
		boolean b2 = notEmpty(list2);
		System.out.println(b);
		System.out.println(b2);
	}
	
	//方法2：判断Map集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	
	public boolean notEmpty(Map map){
	    //实现代码
		if(map!=null && !map.isEmpty()) {
			return true;
		}
		return false;
	}
	
	@Test
	public void test7() {
		Map map = new HashMap<>();
		Map map2 = new HashMap<>();
		map.put(1,"张三");
		boolean b = notEmpty(map);
		boolean b2 = notEmpty(map2);
		System.out.println(b);
		System.out.println(b2);
	}
	
	//按要求创建WebUtil集合工具类及方法，不得有Bug（30分）
	//list?name=张三&sex=男
	//方法1：获取url上的参数，返回字符串值类型，如果没有该参数则返回默认值 (5分)
	public String getString(String url, String name, String defaultValue){
	    //实现代码
		 if(!url.contains(name)) {
			 return defaultValue;
		 }
		
		 int indexOf = url.indexOf(name);
		 String str =  "";
		 return str;
	}
	
	@Test
	public void test8() {
		String str ="list?name=张三&sex=男" ;
		int i = str.indexOf("name");
		System.out.println(i);
	}
	
	//方法2：获取url上的参数，返回整数类型，如果没有该参数或该参数不是整形值，则返回默认值 (5分)
	public int getInt(String url, String age, int defaultValue){
	    //实现代码
		 if(!url.contains(age)) {
			 return defaultValue;
		 }
		
		 int i = 0;
		 return i;
		 
	}
	
	
	
	//方法3：获取url上的参数，返回布尔类型，如果没有该参数或该参数不是布尔类型，则返回false  (5分)
	public boolean getBoolean(String url, String age, int defaultValue){
	    //实现代码
		 if(!url.contains(age)) {
			 return false;
		 }
		return true;
	}
	
	//方法4：获取当前请求地址，注意参数不能丢 (5分)
	public String getUrl(HttpServletRequest request){
	    //实现代码
		return "";
	}
	
	//方法5：给定一个Cookie名获得取Cookie值 (5分)
	public String getCookieValue(Cookie cookie){
	    //实现代码
		return "";
	}
	
	
	
	
	
	}
	
	

