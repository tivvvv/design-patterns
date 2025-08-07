package com.tiv.design.patterns.creational.singleton.hungry;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test {

    public static void main(String[] args) throws Exception {
        HungrySingleton instance = HungrySingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(Paths.get("singleton")));
        objectOutputStream.writeObject(instance);

        File file = new File("singleton");
        ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(file.toPath()));
        HungrySingleton newInstance = (HungrySingleton) objectInputStream.readObject();
        System.out.println(instance);
        System.out.println(newInstance);
        file.delete();
    }

}
