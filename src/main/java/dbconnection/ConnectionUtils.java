package dbconnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionUtils {
    public static Connection getConnection () throws SQLException, IOException, ClassNotFoundException {
        return PostgresSQLConnection.getPostgresSQLConnection();
    }
}
