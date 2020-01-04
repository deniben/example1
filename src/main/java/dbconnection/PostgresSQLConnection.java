package dbconnection;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class PostgresSQLConnection {
    private PostgresSQLConnection() {
    }

    public static Connection getPostgresSQLConnection() throws ClassNotFoundException, SQLException, IOException {
        Properties properties = new Properties();
        FileReader fileReader = new FileReader("E:\\IntelijIDEA\\SheduleBoard\\src\\main\\resources\\JDBCSettings");
        properties.load(fileReader);
        String dbDriverClass = properties.getProperty("db.driver.class");

        String dbConnUrl = properties.getProperty("db.conn.url");

        String dbUserName = properties.getProperty("db.username");

        String dbPassword = properties.getProperty("db.password");

        Class.forName(dbDriverClass);

        return DriverManager.getConnection(dbConnUrl, dbUserName, dbPassword);
    }

}
