package com.mycompany.ejbexample;

import javax.ejb.Remote;

@Remote
public interface EJBStatelessRemote {
    abstract String toSpaceUpper(String param);
}
