package com.khj.exam.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class UsrHomeController {
	

	
	@RequestMapping("usr/home/getString")
	@ResponseBody
	public String showMain() {
		return "HI";
	}
	
	@RequestMapping("usr/home/getInt")
	@ResponseBody
	public int getInt() {
		return 10;
	}
	
	@RequestMapping("usr/home/getFloat")
	@ResponseBody
	public float getFloat() {
		return 10.5f;
	}
	
	@RequestMapping("usr/home/getDouble")
	@ResponseBody
	public double getDouble() {
		return 10.5;
	}
		
	@RequestMapping("usr/home/getBoolean")
	@ResponseBody
	public boolean getBoolean() {
		return true;
	}
	
	@RequestMapping("usr/home/getChar")
	@ResponseBody
	public char getChar() {
		return 'a';
	}
	
	@RequestMapping("usr/home/getMap")
	@ResponseBody
	public Map<String, Integer> getMap() {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("철수나이", 22);
		map.put("영희나이", 21);
		return map;
	}
	
	@RequestMapping("usr/home/getArrayList")
	@ResponseBody
	public List<String> getArrayList() {
				
		List<String> list = new ArrayList<>();
	
		retrun list;
	}
	
	
}