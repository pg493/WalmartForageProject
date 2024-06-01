package Practice;


public class JavaVersion {
    public static void main(String[] args) {
        //Display Java Version
        System.out.println("Java Version " + System.getProperty("java.version"));

        //Display Java runtime version
        System.out.println("Java Runtime Version " + System.getProperty("java.runtime.version"));

        //Display Java Home Directory
        System.out.println("Java Home " + System.getProperty("java.home"));

        //Display Java Vendor Name
        System.out.println("Java Vendor name " + System.getProperty("java.vendor"));

        //Display Java Vendore URL
        System.out.println("Java Vendor URL " + System.getProperty("java.vendor.url"));

        //Display Java class Path
        System.out.println("Java Class Path " + System.getProperty("java.class.path")+ "\n");
    }
}
