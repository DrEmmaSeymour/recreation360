package com.recreation360;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {
  public static void main(String[] args) throws Exception {
    String url = "jdbc:postgresql://recreation360db.postgres.database.azure.com:5432/recreation360?sslmode=require";
    try (Connection c = DriverManager.getConnection(url, "dbadmin", "YourPasswordHere")) {
      System.out.println("Connected!");
    }
  }
}
