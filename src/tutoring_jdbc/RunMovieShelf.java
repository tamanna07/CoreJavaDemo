package tutoring_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RunMovieShelf
{
    /*
    Deadpool
2016 ‧ Sci-fi/Action
Iron Man
PG-13
 2008 ‧ Sci-fi/Thriller
Ted
2012 ‧ Fantasy/Buddy
R
     */
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/netflix?serverTimezone=UTC";
        String username = "root";
        String password = "root";

        Connection connection = null;
        Statement statement = null;

        MovieShelf deadpool = new MovieShelf(
                14,
                "Deadpool",
                2016,
                "Sci-fi/Action",
                "R");
        MovieShelf ironMan = new MovieShelf(
                15,
                "Iron Man",
                2008,
                "Sci-fi/Thriller",
                "PG-13");
        MovieShelf ted = new MovieShelf(
                16,
                "Ted",
                2012,
                "Fantasy/Buddy",
                "R");

        List<MovieShelf> movies = new ArrayList<>();
        movies.add(deadpool);
        movies.add(ironMan);
        movies.add(ted);

        try {
            connection = DriverManager.getConnection(url,username,password);
            statement = connection.createStatement();

            for (MovieShelf mov: movies)
            {
                String query = "INSERT INTO movie (id, title, releaseYear, genre, mpaaRating) " +
                        "VALUES("+mov.getId()+", '"+mov.getTitle()+"', "+mov.getReleaseYear()
                        +", '"+mov.getGenre()+"', '"+mov.getMpaaRating()+"');";

                statement.execute(query);
            }

        }catch (Exception e)
        {
            System.out.println("sorry ther has been an error, please try again");
            e.printStackTrace();
        }finally {
            connection.close();
            statement.close();
        }


    }
}
