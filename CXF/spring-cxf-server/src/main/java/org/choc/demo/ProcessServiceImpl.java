package org.choc.demo;

import org.springframework.stereotype.Component;

import javax.jws.WebService;

@WebService
@Component
public class ProcessServiceImpl implements ProessService {

    @Override
    public String StartProcess(String name) {
        return "start the process " + name;
    }
}