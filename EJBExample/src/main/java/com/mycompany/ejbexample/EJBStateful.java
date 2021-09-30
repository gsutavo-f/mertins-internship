package com.mycompany.ejbexample;

import javax.ejb.Stateful;

@Stateful
public class EJBStateful implements EJBStatefulRemote {
    private boolean caixaAlta = false;

    @Override
    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }

    @Override
    public boolean isCaixaAlta() {
        return caixaAlta;
    }

    @Override
    public String toSpace(String param) {
        if(param == null) {
            return param;
        } else {
            StringBuilder sb = new StringBuilder("");
            for(char c: param.toCharArray()) {
                if(caixaAlta) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
                sb.append(" ");
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
    }
    
}
