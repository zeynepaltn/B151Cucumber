package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

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
public class Runner2 {
}
