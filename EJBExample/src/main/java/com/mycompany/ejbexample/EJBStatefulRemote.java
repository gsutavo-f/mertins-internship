package com.mycompany.ejbexample;

import javax.ejb.Remote;

@Remote
public interface EJBStatefulRemote {
    void setCaixaAlta(boolean caixaAlta);
    public boolean isCaixaAlta();
    String toSpace(String param);
}
