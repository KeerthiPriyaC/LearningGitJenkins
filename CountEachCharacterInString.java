package com.learning.StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountEachCharacterInString {

	public static void main(String[] args) {
		String str="the world is not the same due to covid pandemic";
		String str1="This is a beautiful life don' waste it";
		char[] character=str.toCharArray();
		Map<Character,Integer> occurances=new HashMap<>();
		Map<String, Integer> stringOccurances=new HashMap<>();
		
		for(char characters: character)
		{
			Integer integer=occurances.get(characters);
			if(integer==null)
			{
				occurances.put(characters, 1);
			} else
				occurances.put(characters, integer+1);
		}
		System.out.println(occurances);
		
		
		String[] words= str1.split(" ");
		Map<String,Integer> wordOccurances= new HashMap<>();
		for(String word: words)
		{
			Integer integer1= wordOccurances.get(word);
			if(integer1==null)
			{
				wordOccurances.put(word,1);
			} else
			{
				wordOccurances.put(word, integer1+1);
			}
		}
		System.out.println(wordOccurances);
		
	}

}
