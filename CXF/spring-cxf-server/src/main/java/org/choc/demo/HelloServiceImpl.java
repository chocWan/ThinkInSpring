package org.choc.demo;

import org.springframework.stereotype.Component;

import javax.jws.WebService;

@WebService
@Component
public class HelloServiceImpl implements HelloService {

    @Override
    public String SayYes() {
        return "choc";
    }

    @Override
    public String Say(String name) {
        return "hello " + name;
    }

}