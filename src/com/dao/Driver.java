package com.dao;

/**
 * Created by MIN on 2016/8/16.
 */
public class Driver {
    private static Driver ourInstance = new Driver();

    public static Driver getInstance() {
        return ourInstance;
    }

    private Driver() {
    }
}
