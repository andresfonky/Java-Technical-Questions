package basic;

import java.util.ArrayList;
import java.util.List;

public class Parse {
	
	public Parse() {
		
	}
	
	public boolean isBalanced(String s){
        if(s.length()%2 != 0) return false;
        boolean b = true;
        char[] c = s.toCharArray();
        List<Character> list = new ArrayList<Character>();
        for (int i=0; i<c.length; i++) {
        	if(c[i] == '{' || c[i] == '(') {
        		list.add(c[i]);
        	} else {
        		if(list.size() == 0) {
        			b = false;
        			break;
        		}
        		System.out.println(list.get(list.size()-1) + " " + c[i]);
                if((list.get(list.size()-1) == '{' && c[i] == '}') || (list.get(list.size()-1) == '(' && c[i] == ')')){ 
                	list.remove(list.size()-1);
                	continue;
                } else {
                	b = false;
        			break;
                }

        	}
        	
        }
        return b;
    }

}
