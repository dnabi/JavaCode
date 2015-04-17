package com.hp.interview.util.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.hp.interview.util.Utils;

public class UtilTest {

	@Test
	public void reverseArrayTest() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("def");
		list.add("ghi");
		list.add("klm");
		
		list = Utils.reverseArray(list);
		
		assertEquals("klm",list.get(0));
		assertEquals("abc",list.get(list.size()-1));
	}

	@Test
	public void reverseStringTest(){
		String str = "abcdefghijklm";
		str = Utils.reverseString(str);
		assertEquals("mlkjihgfedcba",str);
	}
}
