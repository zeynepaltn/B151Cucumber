Feature: US002 Amazon Urun Arama Testi
  @iphone @techpro
  Scenario: TC01 Amazonda iphone aramasi
    Given kullanici amazon sayfasina gider
    And sayfayi yeniler
    And kullanici arama kutusunda iphone aratir
    And basligin iphone icerdigini test eder
    And sayfayi

    @samsung
    Scenario: TC02 Amazonda samsung aramasi
      Given kullanici amazon sayfasina gider
      And sayfayi yeniler
      And kullanici aramaKutusunda samsung aratir
      And basligin samsung icerdigini test eder
      And sayfayi kapatir