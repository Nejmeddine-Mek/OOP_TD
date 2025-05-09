package main;

public class ParenthesizedExpression {
	
	private String expression;
	
	public ParenthesizedExpression(String expression) {
		this.expression = expression;
	}
	
	public boolean validParenthesis() {
		if(this.expression == "") return true;
		
		int n = this.expression.length();
		Pile stack = new Pile();
		
		for(int i = 0; i < n ; i++) {
			// if we meet an opening parenthesis, we push it immediately
			if(this.expression.charAt(i) == '(') stack.push(this.expression.charAt(i));
				
			else if(this.expression.charAt(i) == ')') {
				// if we encounter a closing parenthesis, we verify if our stack is empty, we return false
				try {
					stack.pop();
				} catch(EmptyStackExceptionextendsException e) {
					return false;
				}
			}
		}
		if(!stack.isEmpty()) return false;
		
		return true;
	}
}
