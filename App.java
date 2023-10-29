import java.beans.Statement;
import java.io.BufferedReader;
import java.util.*;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader; //package for input reader
import java.io.IOException;

// Utilisation de l'API NIO
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.nio.charset.Charset;

//Utilisation des threads
import java.lang.Thread;
import java.util.concurrent.Executors;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

//Databases
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Properties;




//importation des classes (package)
import fr.sstelcher.*;

public class App {

    public static void main(String[] args) {

          Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("config.properties"));
            String password = properties.getProperty("db.password");
            System.out.println(password);
            Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDevBase.db?dataDir=C:\\ProgramData\\MySQL\\MySQL Server 8.2\\Data\\", "hliosone", password);

            java.sql.Statement stmt = co.createStatement();

            ResultSet res = stmt.executeQuery("SELECT * FROM products");

        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
