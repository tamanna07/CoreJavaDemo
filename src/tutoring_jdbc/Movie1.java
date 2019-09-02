package tutoring_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Movie1
{
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/netflix?serverTimezone=UTC",
                "root",
                "root");
        Statement statement = connection.createStatement();

        String query = "INSERT INTO movie(id, title, releaseYear, genre, mpaaRating) VALUES" +
                "(9, 'Spider-Man: Far From Home', 2019, 'Fantasy/Sci-fi', 'PG-13');";

        statement.execute(query);

    }
}
