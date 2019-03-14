package com.binglian.service.sub;

import org.springframework.stereotype.Component;

import com.binglian.service.ProductService;

/**
 * Created by cat on 2017-02-19.
 */
@Component
public class SubService extends ProductService{

    public void demo(){
        System.out.println("execute sub service method");
    }
}
