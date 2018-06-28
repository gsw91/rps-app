package com.rps2.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Rps2ExportScore {

    public void exportScore(String humanResult, String computerResult, String playerName, String level, String gameResult ) {
        Long humanScoreConverted = Long.parseLong(humanResult);
        Long computerScoreConverted = Long.parseLong(computerResult);

        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rps_statistics?serverTimezone=Europe/Warsaw&useSSL=False",
                    "rps_admin", "rpsgame");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO RPS_TWO_SCORES (PLAYER_NAME, GAME_LEVEL, RESULT, ROUNDS_WINNING, ROUNDS_LOSING) " +
                    "VALUES ('" + playerName + "', '" +level+ "', '" + gameResult + "', " + humanScoreConverted + ", " + computerScoreConverted + ")");
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
