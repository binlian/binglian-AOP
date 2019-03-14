package com.binglian.log;


import org.springframework.stereotype.Component;

import com.binglian.anno.AdminOnly;
import com.binglian.bean.Product;

/**
 * Created by cat on 2017-02-19.
 */
@Component
public class LogService implements Loggable{
    @Override
    @AdminOnly
    public void log() {
        System.out.println("log from LogService");
    }
    
    
    public void annoArg(Product product){
    	System.out.println("execute log service annoArg");
    }

   
}
