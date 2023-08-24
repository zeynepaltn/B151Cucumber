package techproed.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.DataTablePage;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class DataTablesStepDefinition {
    DataTablePage dataTablePage=new DataTablePage();
    @Then("kullanici sayfadaki tabloda new butonuna tiklar")
    public void kullaniciSayfadakiTablodaNewButonunaTiklar() {
        dataTablePage.newButton.click();
    }

    @And("kullanici bilgileri girer {string},{string},{string},{string},{string},{string},{string}")
    public void kullaniciBilgileriGirer(String name, String lastname, String position, String office, String extension, String date, String salary) {
        dataTablePage.firstName.sendKeys(name, Keys.TAB, lastname, Keys.TAB, position, Keys.TAB, office, Keys.TAB, extension, Keys.TAB,date, Keys.TAB, salary);
        ReusableMethods.bekle(2);
    }

    @And("kullanici create buttonuna basar")
    public void kullaniciCreateButtonunaBasar() {
        dataTablePage.createButton.click();
        ReusableMethods.bekle(2);
    }


    @Then("kullanici search bolumune {string} bilgisini girer")
    public void kullaniciSearchBolumuneBilgisiniGirer(String str) {
        dataTablePage.searchBox.sendKeys(str);
        ReusableMethods.bekle(2);
    }


    @And("kullanici {string} basarili bir sekilde giris yapildigini dogrular")
    public void kullaniciBasariliBirSekildeGirisYapildiginiDogrular(String str) {
        Assert.assertTrue(dataTablePage.searchVerify.getText().contains(str));
        ReusableMethods.bekle(2);
    }
}
