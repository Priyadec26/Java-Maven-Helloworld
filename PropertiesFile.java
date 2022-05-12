package InsightsProForStagingGRLS.config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
//java util
public class PropertiesFile {


            //readPropertiesFile();
        //writePropertiesFile();

    public static Properties prop = new Properties();
    public static void readPropertiesFile()
    {
        try
        {

            InputStream input = new FileInputStream("PharmaPodWebAutomation\\src\\test\\java\\PharmaPod\\config\\config.properties");
            prop.load(input);

            System.out.println(prop.getProperty("browser"));

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }

    public static void writePropertiesFile()
    {
        try
        {

            OutputStream output = new FileOutputStream("PharmaPodWebAutomation\\src\\test\\java\\PharmaPod\\config\\config.properties");
            prop.setProperty("result", "Pass");
            prop.store(output, null);

        }
        catch (Exception e)
        {
            e.printStackTrace();        }
    }
}
