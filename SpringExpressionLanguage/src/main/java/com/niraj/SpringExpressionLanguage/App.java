package com.niraj.SpringExpressionLanguage;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class App 
{
    public static void main( String[] args )
    {
    	ExpressionParser parser = new SpelExpressionParser();
    	
    	Expression exp = parser.parseExpression("'Hello Spring Expression Language'");
    	String msg = (String) exp.getValue();
    	System.out.println(msg);
    }
}
