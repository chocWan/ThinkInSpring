package org.choc.demo;

import org.apache.wss4j.common.ext.WSPasswordCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Component
public class ServerPasswordCallBack implements CallbackHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServerPasswordCallBack.class);
    private static final Map<String,String> userMap = new HashMap<String,String>();

    static {
        userMap.put("server","serverpass");
        userMap.put("client","clientpass");
    }

    @Override
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        WSPasswordCallback callback = (WSPasswordCallback) callbacks[0];
        String clientUsername = callback.getIdentifier();
        String serverPassword = userMap.get(clientUsername);
        if(serverPassword != null){
            callback.setPassword(serverPassword);
        }
    }

}