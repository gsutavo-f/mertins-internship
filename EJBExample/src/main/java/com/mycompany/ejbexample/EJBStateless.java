package com.mycompany.ejbexample;

import javax.ejb.Stateless;

@Stateless
public class EJBStateless implements EJBStatelessRemote {

    @Override
    public String toSpaceUpper(String param) {
        if(param == null) {
            return param;
        } else {
            StringBuilder sb = new StringBuilder("");
            for(char c: param.toCharArray()) {
                sb.append(Character.toUpperCase(c));
                sb.append(" ");
            }
            sb.deleteCharAt(sb.length()-1);
            return sb.toString();
        }
    }
    
}
