package com.mask;

import com.github.ricksbrown.cowsay.Cowsay;

public class App {
	public static void main(String[] args) {

		String[] words = new String[] { "Hello", "World", "!" };

		System.out.println(Cowsay.say(words));

	}
}
