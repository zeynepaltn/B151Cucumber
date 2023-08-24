package techproed.stepDefinition;


import com.google.common.io.ByteSink;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import techproed.utilities.Driver;


public class Hooks {
    /*
      Hooks class'inin kullanim amaci scenario'lardan once veya sonra calismasini istedigimiz kodlari
  belirttigimiz class'tir. Bunu @Before ve @After notasyonlarina sahip methodlar ile yapariz.
  Bu notasyonlar'in importu io.cucumber'dan olmalidir.
      Bu class'in scenario'lar tarafindan gorulup burdaki @Before, @After methodlarini isleme alabilmesi icin
  Hooks class'ini farkli bir package da olusturmak istersek Runner class'indaki glue parametresine bu
  package'i tanimlamamiz gerekir. Ancak Hooks class'ini direk stepDefinition packageí altinda olusturursak
  Runner class'indaki glue parametresinde stepDefinition package'i tanimli oldugu icin baska bir islem yapmama
  gerek kalmaz. Glue parametresinde stepDefinition package'i tanimli oldugu icin direkt Hooks class'inda kullanabiliriz
   */

    @Before//import islemi import io.cucumber.java.Before;'dan olmali
    public void setUp() throws Exception {
        System.out.println("Scenario lar calismaya basladi");

    }
    @Before("@arac2")
    public void setUp2(){
        System.out.println("Google'da Ford aratildi");
    }

    @Before("@arac3")
    public void setUp3(){
        System.out.println("Google'da Audi aratildi");
    }
    /*
    Scenario'dan once calismasini istedigimiz @Before method'unun notasyonuna parametre olarak
    scenario'ya tanimladigimiz
    tag'i belirte biliriz. Dolayisiyla sadece paremetre olarak belirttigimiz
    @Before methodu Scenario'dan once calisaktir
 */

    @After
    public void tearDown(Scenario scenario) throws Exception {
        if(scenario.isFailed()){//---->Scenario fail olursa
            TakesScreenshot ts= (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES),"image/jpeg","scenario_"+scenario.getName());

        }
        Driver.closeDriver();
    }
    //Bu method fail olan scenario'larda fail olan kimin resmini rapora ekleyecektir.
}
