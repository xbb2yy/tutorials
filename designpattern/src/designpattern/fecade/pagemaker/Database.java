package designpattern.fecade.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {
    private Database() {}

    public static Properties getProperties(String dbName) {
        String fileName = dbName + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
}
