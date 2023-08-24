package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/*
Runner class'i testNG'deki .xml file kullanimindaki gibi istedigimiz scenario lari kullanacagimiz tag parametresi
sayesinde calistirabiliriz. Ve plugin parametresi ile raporlar alabiliriz

 */
@RunWith(Cucumber.class)//test calisitiric notasyon
//features yolunu features package'in content root'dan
//glu'nun yolunu step definition package source root'dan
@CucumberOptions(plugin = {"pretty",
                          "html:target/default-cucumber-reports.html",
                          "json:target/json-reports/cucumber.json",
                          "junit:target/xml-report/cucumber.xml",
                          "rerun:TestOutput/failed_scenario.txt"},
                          //rerun ile belirttigimiz dosya da fail olan scenario'lar tutulur.
                 features = "src/test/resources/features",
                 glue={"techproed/stepDefinition"},
                 tags="@arc",
                 dryRun = false, //true secersek senaryolari kontrol eder browseri calistirmaz
                                //false secersek default olarak otomatik calistirir
                 monochrome = false//bu sekilde konolda renkli cikti olur, true yazarsak siyah beyaz
)

public class Runner {
/*
@CucumberOptions notasyonuna parametre olarak
          features--> package'in yolunu
          glue--> stepdefinition package
          tag--> calistirmak istedigimiz scenariolari burda belirtiriz
Scenario'larin nerede nasil calisacagi hangi raporlari kullanacagi ile alakali secenekleri
bu notasyonda belirtiriz

 */


}
