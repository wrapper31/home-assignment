package com.homeassigment.task1.impl;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.homeassigment.task1.TTLCache;

public final class CleanupTask<K, V> implements Runnable {
    
    private Logger LOG = LoggerFactory.getLogger(CleanupTask.class);

    private final TTLCache<K, V> instance;
    
    public CleanupTask(TTLCache<K, V> instance) {
        this.instance = instance;
    }

    public void run() {    
        while(true){
            try {
                TimeUnit.SECONDS.sleep(1);
                instance.cleanUp();
            }
            
            catch(InterruptedException ie){
                LOG.error("Error: " + ie);
            }
        }

    }
}