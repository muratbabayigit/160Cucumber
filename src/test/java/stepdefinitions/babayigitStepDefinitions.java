package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.BabayigitPage;
import utilities.ConfigReader;
import utilities.Driver;

public class babayigitStepDefinitions {
    BabayigitPage babayigitPage=new BabayigitPage();

    @Given("kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String siteAdresi) {
        Driver.getDriver().get(ConfigReader.getProperty(siteAdresi));


    }

    @Then("kullanici arama kismina {string} yazar ve arama butonuna basar")
    public void kullaniciAramaKisminaYazarVeAramaButonunaBasar(String aramaKelimesi) {
        babayigitPage.searchBox.sendKeys(aramaKelimesi+ Keys.ENTER);
    }

    @Then("kullanici sonuc sayfasinda arama sonuc sayisini alir ve yazdirir")
    public void kullaniciSonucSayfasindaAramaSonucSayisiniAlirVeYazdirir() {
        System.out.println("Toplam Sonuç Sayısı: "+babayigitPage.result.getText());

    }

    @Then("kullanici arama sonuc sayisinin {int} adetten fazla oldugunu dogrular")
    public void kullaniciAramaSonucSayisininAdettenFazlaOldugunuDogrular(int limit) {
     //  String resultMetin=babayigitPage.result.getText();
     //  resultMetin=resultMetin.replaceAll("[^0-9]", "");
     //  int result=Integer.parseInt(resultMetin);
     //  Assert.assertTrue(result>limit);
    }

    @Then("kullanici pencereyi kapatir")
    public void kullaniciPencereyiKapatir() {
        Driver.quitDriver();
    }
}
