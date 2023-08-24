package techproed.stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.GooglePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class GoogleStepDefinition {
    GooglePage googlePage=new GooglePage();
    @Given("kullanici {string} sayfasina properties ile gider gider")
    public void kullaniciSayfasinaPropertiesIleGiderGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
        ReusableMethods.bekle(3);//elle cerezleri kapatmk icin kendime verdigim sure
    }

    @Then("kullanici arama kutusunda {string} aratir")
    public void kullaniciAramaKutusundaAratir(String str) {
        googlePage.aramaKutusu.sendKeys(ConfigReader.getProperty(str), Keys.ENTER);
    }

    @And("kullanici sayfa basliginin {string} icerdigini test eder")
    public void kullaniciSayfaBasligininIcerdiginiTestEder(String str) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(ConfigReader.getProperty(str)));
    }

    @Then("kullanici google arama kutusunda {string} aratir")
    public void kullaniciGoogleAramaKutusundaAratir(String str) {
        googlePage.aramaKutusu.sendKeys(str,Keys.ENTER);
    }

    @And("kullanici sayfa basliginin {string} icerdigini test etti")
    public void kullaniciSayfaBasligininIcerdiginiTestEtti(String str) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(str));
    }

    @Then("kullanici google arama kutusunda {string} ie propertiesden aratir")
    public void kullaniciGoogleAramaKutusundaIePropertiesdenAratir(String str) {
        googlePage.aramaKutusu.sendKeys(ConfigReader.getProperty(str), Keys.ENTER);
    }

    @Then("kullanici data tableda verilen bilgileri aratir")
    public void kullaniciDataTabledaVerilenBilgileriAratir(DataTable data) {
        System.out.println(data.asList());
        for (int i = 1; i <data.asList().size() ; i++) {
            googlePage.aramaKutusu.sendKeys(data.asList().get(i), Keys.ENTER);
            ReusableMethods.bekle(2);
            Assert.assertTrue(Driver.getDriver().getTitle().contains(data.asList().get(i)));
            ReusableMethods.bekle(2);
            googlePage.aramaKutusu.clear();
        }

    }

    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int sayi) {
        try {
            Thread.sleep(sayi*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
