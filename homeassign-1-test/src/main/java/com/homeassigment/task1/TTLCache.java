package com.homeassigment.task1;

public interface TTLCache<K, V> {
    abstract void put(K key, V item);

    abstract V get(K key);

    abstract void cleanUp();
}