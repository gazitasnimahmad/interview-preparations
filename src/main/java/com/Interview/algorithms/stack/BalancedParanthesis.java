package com.Interview.algorithms.stack;

import ch.qos.logback.core.util.StringUtil;

import java.util.Stack;

public class BalancedParanthesis {

    public static void main( String[] args){

        String query = "{([])}";
        boolean isBalanced = checkBalancedBrackets(query);
        System.out.println(isBalanced ? "yes its balanced" : "its not balanced");

    }

    private static boolean checkBalancedBrackets(String query) {

        if(StringUtil.isNullOrEmpty(query))
            return true;

        Stack<Character> stack = new Stack<>();

        for (char ch: query.toCharArray()){
            if(ch == '{' || ch == '(' || ch == '[')
                stack.push(ch);

            else if(ch == '}' || ch == ')' || ch == ']'){
                Character top = stack.pop();

                if (ch == ']' && top != '[')
                    return false;
                if (ch == '}' && top != '{')
                    return false;
                if (ch == ')' && top != '(')
                    return false;
            }
        }

        return true;
    }
}
