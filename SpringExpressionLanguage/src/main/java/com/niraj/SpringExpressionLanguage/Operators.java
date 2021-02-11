package com.niraj.SpringExpressionLanguage;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

// arithmetic, relational and logical operators
public class Operators {
	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		
		// Arithmetic operator
		System.out.println(parser.parseExpression("'Niraj' + ' Thagunna'").getValue());
		System.out.println(parser.parseExpression("10 * 20 / 2").getValue());
		System.out.println(parser.parseExpression("'Today is : ' + new java.util.Date()").getValue());
		
		//logical operator  
		System.out.println(parser.parseExpression("true and true").getValue());  
		  
		//Relational operator  
		System.out.println(parser.parseExpression("'Niraj'.length() == 10").getValue());  
	}
}
