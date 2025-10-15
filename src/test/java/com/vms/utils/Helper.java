package com.vms.utils;

import io.github.cdimascio.dotenv.Dotenv;

public class Helper {
    public static Dotenv dotenv;

    public static Dotenv loaDotenv() {
        if (dotenv == null) {
            dotenv = Dotenv.load();
        }
        return dotenv;
    }

    public static String getKey(String key) {
        String value = loaDotenv().get(key);
        if (value == null) {
            System.out.println("Key not found in .env, try to get from System.getenv()");
            value = System.getenv(key);
        }

        if (value == null) {
            throw new RuntimeException("Key not found: " + key);
        }

        return value;
    }
}
