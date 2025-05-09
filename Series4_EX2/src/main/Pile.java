package main;

import java.util.*;


class Pile{
	
	private Deque<Character> pile = new ArrayDeque<Character>(); //line5
	
		// pushes x onto the top of the stack
	
	public void push(char x){
		this.pile.add(x);
	}
	public char pop() throws EmptyStackExceptionextendsException{
		if(this.pile.size() == 0) {
			throw new EmptyStackExceptionextendsException("stack is empty");
		}
		
		return this.pile.removeFirst();
	}
	
	public boolean isEmpty() {
		return this.pile.size() == 0;
	}
	
}

class EmptyStackExceptionextendsException extends Exception{
	EmptyStackExceptionextendsException(String msg){
		super(msg);
	}
}