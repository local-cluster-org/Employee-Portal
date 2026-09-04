import java.sql.Connection;
import java.sql.Statement;

public class UserService {

    public void findUser(Connection connection, String username)
            throws Exception {

        String query =
                "SELECT * FROM users WHERE name = '" + username + "'";

        Statement statement = connection.createStatement();
        statement.executeQuery(query);
    }
}
