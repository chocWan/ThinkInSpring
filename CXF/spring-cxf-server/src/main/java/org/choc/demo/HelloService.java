package org.choc.demo;

import javax.jws.WebService;

@WebService
public interface HelloService {
    String SayYes();

    String Say(String name);
}