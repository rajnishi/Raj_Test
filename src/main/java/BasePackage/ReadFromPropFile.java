package BasePackage;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadFromPropFile {

    public FileInputStream fileInputStream;
    public Properties properties;
    String path = System.getProperty("user.dir");

    public ReadFromPropFile(String fileName) {

        properties = new Properties();
        try {
            fileInputStream = new FileInputStream(path + "//src//main//resources//"+ fileName);
            properties.load(fileInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getUrl() {
        return properties.getProperty("url");
    }

    public String getDriverPath() {
        return properties.getProperty("driverpath");
    }

     public String getBrowser(){
        return properties.getProperty("browser");
    }

    public String getUserName(){
        return properties.getProperty("userName");
            }
    public String getpassword(){
        return properties.getProperty("password");
    }


    public static void main(String[] args) {
        ReadFromPropFile readFromPropFileObj = new ReadFromPropFile("config.properties");
        ReadFromPropFile readFromPropFileObj1 = new ReadFromPropFile("loginCredential.properties");

        System.out.println("Url "+ readFromPropFileObj.getUrl());
        System.out.println("DriverPath "+ readFromPropFileObj.getDriverPath());
        System.out.println("Broswer "+ readFromPropFileObj.getBrowser());
        System.out.println("Username "+ readFromPropFileObj1.getUserName());
        System.out.println("password "+ readFromPropFileObj1.getpassword());


    }
}

