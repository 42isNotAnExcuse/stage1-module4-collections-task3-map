package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> res = new HashMap<>();

        sentence = sentence.toLowerCase()
                .replaceAll("[^a-zA-Z\\s+]", "");

        if (!sentence.isBlank()) {
            for (String s : sentence.toLowerCase().split(" ")) {
                res.put(s, 0);
            }

            for (String s : sentence.split(" ")) {
                if (res.containsKey(s))
                    res.put(s, res.get(s) + 1);
            }
        }

        return res;
    }
}
