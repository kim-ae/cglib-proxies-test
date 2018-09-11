package br.com.kimae.proxies;

import net.sf.cglib.proxy.Enhancer;

public class ProxiesTest {

    public static void main(String[] args){
        ClassToBeProxied obj = new ClassToBeProxied();
        InnerInterceptor inner = new InnerInterceptor(obj);

        ClassToBeProxied objProxy = (ClassToBeProxied) Enhancer.create(ClassToBeProxied.class, inner);

        objProxy.methodToBeProxied();
    }
}
