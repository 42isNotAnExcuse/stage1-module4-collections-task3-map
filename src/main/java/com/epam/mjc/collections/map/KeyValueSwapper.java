package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> res = new HashMap<>();

        sourceMap.keySet().stream().sorted()
                .forEach(s -> {
                    if (!res.containsKey(sourceMap.get(s)))
                        res.put(sourceMap.get(s), s);
                });

        return res;
    }
}
