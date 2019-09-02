package tutoring_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Movie2
{
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Statement statement = null;

        try
        {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/netflix?serverTimezone=UTC",
                    "root",
                    "root");

            statement = connection.createStatement();

            String query = "INSERT INTO movie(id, title, releaseYear, genre, mpaaRating) " +
                    "VALUES(10, 'Jumanji: Welcome to the Jungle', 2017, 'Action/Comedy', 'PG-13');";
            statement.execute(query);

        }catch (Exception e)
        {
            System.out.println("Please check the codes and try again, something went wrong");
        }finally {
            connection.close();
            statement.close();
        }
    }
}
