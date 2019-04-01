package org.choc.demo;

import javax.jws.WebService;

@WebService
public interface ProessService {
    String StartProcess(String name);
}