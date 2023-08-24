@all
Feature: US001 TechProEducation Sayfasi Testi
  Scenario: TC01 Sayfada Arama Yapma
    Given kullanici techpro sayfasina gider
    Then arama kutusunda qa aratir
    And sayfa basliginin qa icerdigini test eder
    And sayfayi kapatir

    #Feature file da daha once olusturdugumuz bir methodu baska senaryolarda tekrar olusturmadan kullanabiliriz
    #Yukaridaki ornek de sayfayi kapatir step'i icin daha once AmazonStepDefinition'da olusturdugumuz methodu kullanabiliriz
  Scenario: TC02 Sayfada Arama Yapma
    Given kullanici techpro sayfasina gider
    Then arama kutusunda java aratir
    And sayfa basliginin java icerdigini test eder
    And sayfayi kapatir
@techpro
  Scenario: TC03 Sayfada Arama Yapma
    Given kullanici techpro sayfasina gider
    Then arama kutusunda mobil aratir
    When cikan dropdown da mobile developer linkine tiklar
    And sayfa basliginin mobile icerdigini test eder
    And sayfayi kapatir

