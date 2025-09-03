package com.tiv.design.patterns.structural.proxy;

public class DataSourceContextHolder {

    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();

    public static String getDBType() {
        return CONTEXT_HOLDER.get();
    }

    public static void setDBType(String dbType) {
        CONTEXT_HOLDER.set(dbType);
    }

    public static void clearDBType() {
        CONTEXT_HOLDER.remove();
    }

}
