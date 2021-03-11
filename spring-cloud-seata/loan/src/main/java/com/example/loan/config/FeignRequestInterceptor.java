package com.example.loan.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import io.seata.core.context.RootContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignRequestInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate template) {
        //在feign调用过程中，传递seata的xid，以形成一个分布式事务组
        String xid = RootContext.getXID();
        template.header(RootContext.KEY_XID, xid);
    }
}
