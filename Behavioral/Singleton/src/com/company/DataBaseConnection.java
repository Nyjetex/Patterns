package com.company;

import java.util.Random;

/**
 * Create database connection. Singleton;
 *
 * @author Nyjetex
 */
public class DataBaseConnection {
    private static volatile DataBaseConnection dataBaseConnection;
    private final int id;

    private DataBaseConnection(int id) {
        this.id = id;
    }

    /**
     *
     * @return current database connection
     */
    public static DataBaseConnection getDataBaseConnection() {
        DataBaseConnection tmp = dataBaseConnection;
        if (dataBaseConnection == null) {
            synchronized (DataBaseConnection.class) {
                tmp = dataBaseConnection;
                if (tmp == null) {
                    Random random = new Random();
                    tmp = dataBaseConnection = new DataBaseConnection(random.nextInt());
                }
            }
        }
        return dataBaseConnection;
    }

    @Override
    public String toString() {
        return "DataBaseConnection{" +
                "id=" + id +
                '}';
    }
}
