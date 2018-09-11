package br.com.kimae.proxies;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClassToBeProxied {

    public void methodToBeProxied(){
        log.info("Método.");
    }
}
