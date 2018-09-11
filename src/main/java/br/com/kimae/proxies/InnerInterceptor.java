package br.com.kimae.proxies;

import java.lang.reflect.Method;

import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

@Slf4j
public class InnerInterceptor implements MethodInterceptor {

    private final ClassToBeProxied tbc;

    public InnerInterceptor(ClassToBeProxied tbc){
        this.tbc = tbc;
    }

    public Object intercept(final Object o, final Method method, final Object[] args, final MethodProxy methodProxy)
        throws Throwable {
        log.info("Inner Interceptor Begin");
        method.invoke(tbc, args);
        log.info("Inner Interceptor End");
        return null;
    }
}
