package com.voices.dataProvider;

import com.voices.enums.DriverType;
import com.voices.enums.EnvironmentType;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
    private Properties properties;
    private final String propertyFilePath= "configs/configuration.properties";


    public ConfigFileReader(){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    public String getDriverPath(){
        String driverPath = properties.getProperty("driverPath");
        if(driverPath!= null) return driverPath;
        else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
    }

    public long getImplicitlyWait() {
        String implicitlyWait = properties.getProperty("implicitlyWait");
        if(implicitlyWait != null) {
            try{
                return Long.parseLong(implicitlyWait);
            }catch(NumberFormatException e) {
                throw new RuntimeException("Not able to parse value : " + implicitlyWait + " in to Long");
            }
        }
        return 30;
    }

    public String getApplicationUrl() {
        String url = properties.getProperty("baseURL");
        if(url != null) return url;
        else throw new RuntimeException("url not specified in the Configuration.properties file.");
    }
    public String getClientUserName() {
        String userName = properties.getProperty("clientUserName");
        if(userName != null) return userName;
        else throw new RuntimeException("userName not specified in the Configuration.properties file.");
    }
    public String getClientPassword() {
        String password = properties.getProperty("clientPassword");
        if(password != null) return password;
        else throw new RuntimeException("password not specified in the Configuration.properties file.");
    }

    public String getAIUserName() {
        String userName = properties.getProperty("AIUserName");
        if(userName != null) return userName;
        else throw new RuntimeException("userName not specified in the Configuration.properties file.");
    }
    public String getAIPassword() {
        String password = properties.getProperty("AIPassword");
        if(password != null) return password;
        else throw new RuntimeException("password not specified in the Configuration.properties file.");
    }
    public String getApproveUserName() {
        String userName = properties.getProperty("ApproveUsername");
        if(userName != null) return userName;
        else throw new RuntimeException("userName not specified in the Configuration.properties file.");
    }
    public String getApprovePassword() {
        String password = properties.getProperty("ApprovePassword");
        if(password != null) return password;
        else throw new RuntimeException("password not specified in the Configuration.properties file.");
    }

    public String getSauceTunnelName() {
        String userName = properties.getProperty("sauceTunnel");
        if(userName != null) return userName;
        else throw new RuntimeException("sauceTunnel not specified in the Configuration.properties file.");
    }

    public String getSauceUserName() {
        String userName = properties.getProperty("sauceLabUserName");
        if(userName != null) return userName;
        else throw new RuntimeException("sauceLabUserName not specified in the Configuration.properties file.");
    }

    public String getSauceAccessKey() {
        String userName = properties.getProperty("sauceLabAccessKey");
        if(userName != null) return userName;
        else throw new RuntimeException("sauceLabAccessKey not specified in the Configuration.properties file.");
    }

    public String getPrimeUserName() {
        String userName = properties.getProperty("PremiumUserName");
        if(userName != null) return userName;
        else throw new RuntimeException("userName not specified in the Configuration.properties file.");
    }
    public String getPrimePassword() {
        String password = properties.getProperty("PremiumUserPassword");
        if(password != null) return password;
        else throw new RuntimeException("password not specified in the Configuration.properties file.");
    }
    public String getPrimeAccountUserName() {
        String userName = properties.getProperty("PremiumAccountUserName");
        if(userName != null) return userName;
        else throw new RuntimeException("userName not specified in the Configuration.properties file.");
    }
    public String getPrimeAccountPassword() {
        String password = properties.getProperty("PremiumAccountPassword");
        if(password != null) return password;
        else throw new RuntimeException("password not specified in the Configuration.properties file.");
    }
    public String getTalentGuestUserName() {
        String userName = properties.getProperty("TalentGuestName");
        if(userName != null) return userName;
        else throw new RuntimeException("userName not specified in the Configuration.properties file.");
    }

    public String getenvironmentValue() {
        String environment = properties.getProperty("environment");
        if(environment != null) return environment;
        else throw new RuntimeException("environment not specified in the Configuration.properties file.");
    }



    public String getTalentGuestPassword() {
        String password = properties.getProperty("TalentGuestPassword");
        if(password != null) return password;
        else throw new RuntimeException("password not specified in the Configuration.properties file.");
    }

    public DriverType getBrowser() {
        String browserName = properties.getProperty("browser");
        if(browserName == null || browserName.equals("chrome")) return DriverType.CHROME;
        else if(browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
        else if(browserName.equals("edge")) return DriverType.EDGE;
        else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
    }

    public EnvironmentType getEnvironment() {
        String environmentName = properties.getProperty("environment");
        if(environmentName == null || environmentName.equalsIgnoreCase("local")) return EnvironmentType.LOCAL;
        else if(environmentName.equals("remote")) return EnvironmentType.REMOTE;
        else throw new RuntimeException("Environment Type Key value in Configuration.properties is not matched : " + environmentName);
    }

    public Boolean getBrowserWindowSize() {
        String windowSize = properties.getProperty("windowMaximize");
        if(windowSize != null) return Boolean.valueOf(windowSize);
        return true;
    }

    public String getUrlEndPoint(String urlEndPointKey) {
        return properties.getProperty(urlEndPointKey);
    }

}
