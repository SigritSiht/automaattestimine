
package TestInit;

import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sigri
 */
public class JunitTest {
    
   String appID = "11111";//mockitud väärtused
   String cityID = "55252";
   MyHttpClient httpClient;
   
    public JunitTest() {
    }
    

    @Before
    public void setupHttpClient(){
       this.httpClient = httpClient;
    }

    @Test
    public void isTheConnectionCode200(){
       Response response = this.httpClient.get("https://api.openweathermap.org/"
           + "data/2.5/forecast?id="+cityID+"&APPID="+appID);
       assertEquals(200, response.getStatus());
    }
    
    @Test
    public void isTheTeperatureDownWithLawsOfPhysics(){
        Response response = this.getWeatherTempInCelsiusFromOpenWeatherAPI();
        assertEquals(-273.15, this);
    }
    @Test
    public void isItGettingTooHotInHere(){
        Response response = this.getWeatherTempInCelsiusFromOpenWeatherAPI();
        assertEquals(100, this);
    }
    /*
    If account exceeds the limits, then a notification about limits exceeding is sent.
    If it repeats again, then the account is blocked for an hour. Therefore, the lock period is increased
    by one hour until 4 hours block sets. When blocking repeats the fifth time, then the
    lock period lasts 24 hours. This rule is cycled. 
    Please be carefull with the number of API calls you complete. 
    */
    @Test
    public void haveIBeenBlockedFromOpenWeatherAPI(){}
    
    @Test
    public void areTheReceivedPeakValuesForTemperatureReallyThePeakValues(){}
    
    @Test
    public void 

}
