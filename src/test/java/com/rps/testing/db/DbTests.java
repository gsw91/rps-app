package com.rps.testing.db;

import org.junit.*;
import java.sql.*;

public class DbTests {

    private String humanPlayerName = "testRPShero";

    @After
    public void cleanDb() {
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rps_statistics?serverTimezone=Europe/Warsaw&useSSL=False", "rps_admin", "rpsgame");
            Statement stmt = conn.createStatement();
            stmt.execute("DELETE FROM scores where PLAYER_NAME = '" + humanPlayerName + "'");
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void addScoreToDb() {
        //given
        String level = "hard";
        String resultOfGame = "win";
        Long humanScoreConverted = 4L;
        Long computerScoreConverted = 3L;
        //when&then
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rps_statistics?serverTimezone=Europe/Warsaw&useSSL=False", "rps_admin", "rpsgame");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO scores (PLAYER_NAME, GAME_LEVEL, RESULT, ROUNDS_WINNING, ROUNDS_LOSING) " +
                    "VALUES ('" + humanPlayerName + "', '" +level+ "', '" + resultOfGame + "', " + humanScoreConverted + ", " + computerScoreConverted + ")");
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
