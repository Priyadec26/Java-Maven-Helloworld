package InsightsProForStagingGRLS.config;


public class ConfigFileReader {

    public String getReportConfigPath(){

        ConfigFileReader cfr = new ConfigFileReader();
        String reportConfigPath = "C:\\PharmaPodWebAutomation\\src\\test\\java\\PharmaPod\\config\\extent-config.xml";
        if(reportConfigPath!= null) return reportConfigPath;
        else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
    }

}
