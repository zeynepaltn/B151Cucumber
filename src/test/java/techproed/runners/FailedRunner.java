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
        features = "@TestOutput/failed_scenario.txt", //dosya yolunun basina @ isareti koyduk
        //normalde features lari normal dosya yolu olarak calistirirken rerun da features bolumunun basina @ isaret i konur
        glue={"techproed/stepDefinition"},
        dryRun = false, //true secersek senaryolari kontrol eder browseri calistirmaz
        //false secersek default olarak otomatik calistirir
        monochrome = false//bu sekilde konolda renkli cikti olur, true yazarsak siyah beyaz
)
public class FailedRunner {
}
/*
    FailedRunner class'ını oluşturma amacımız rerun ile belirttiğimiz yolda fail olan scenarioları
tekrar bu class'dan tüm scenario'ları tekrar çalıştırmak yerine sadece fail olanları çalıştırmak
için kullanırız. @CucumberOptions() parametresi içine belirttiğimiz features tag'ına bu class'da
fail olan scenarioları tutan txt dosyasının yolunu belirtiriz. Dosya yolu belirttiğimiz için
önüne @ işareti koymamız gerekir
 */
