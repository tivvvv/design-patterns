package com.tiv.design.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元字符工厂
 */
public class FlyweightCharacterFactory {

    private Map<Character, FlyweightCharacter> characterMap = new HashMap<>();

    public FlyweightCharacter getCharacter(char c) {
        if (!characterMap.containsKey(c)) {
            characterMap.put(c, new FlyweightCharacter(c));
            System.out.println("创建新的享元字符 '" + c + "'");
        } else {
            System.out.println("复用已有享元字符 '" + c + "'");
        }
        return characterMap.get(c);
    }

    public int getCharacterCount() {
        return characterMap.size();
    }

}
