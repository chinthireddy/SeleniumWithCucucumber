package Base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;

import java.io.File;

/**
 * Created by Karthik on 31/01/2019.
 */

public class BaseUtil {

    public static WebDriver Driver;

    public ExtentReports extent;

    public static ExtentTest scenarioDef;

    public static ExtentTest features;

    public static String filePathSeparator = System.getenv(File.pathSeparator);

    public static String reportLocation = filePathSeparator+"Users"+filePathSeparator+"karthikkk"+filePathSeparator+"report"+filePathSeparator;


}
