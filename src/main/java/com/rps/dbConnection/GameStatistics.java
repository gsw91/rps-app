package com.rps.dbConnection;

import java.sql.*;
import java.util.Optional;

public class GameStatistics {

    public void getBasicStatistics() {
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rps_statistics?serverTimezone=Europe/Warsaw&useSSL=False",
                    "rps_admin", "rpsgame");
            Statement stmt = conn.createStatement();
            System.out.println("RPS Statistics - percents of winning games\n");
            int i = 1;
            String column;
            Optional<String> result;
            while(i<6) {
                ResultSet resultSet = stmt.executeQuery("CALL ShowResultsRps()");
                while (resultSet.next()) {
                    try {
                        column = resultSet.getMetaData().getColumnLabel(i);
                        result = Optional.ofNullable(resultSet.getString(column));
                        if(result.isPresent()) {
                            System.out.println(column + "\n " + result.get() + "%\n");
                        } else {
                            System.out.println(column + "\n " + result.orElse("no games at this level\n"));
                        }
                        i++;
                    } catch (SQLException e) {
                        System.out.println(e.getSQLState());
                        break;
                    }
                }
            }
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
