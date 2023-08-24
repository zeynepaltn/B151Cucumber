@tech
Feature: US003 TechProEducation Sayfasi Testi
   #Feature file icinde Scenario larda ortak kullanilan step'lerde Background: yapisini kullanabiliriz.
  #Her scenario'dan once buradaki step calisir sonra scenario'daki stepler calismaya devam eder
  Background: Kullanici TechProEducation sayfasina gider
    Given kullanici techpro sayfasina gider

  Scenario: TC01 Sayfada Arama Yapma
    Then arama kutusunda qa aratir
    And sayfa basliginin qa icerdigini test eder


    #Feature file da daha once olusturdugumuz bir methodu baska senaryolarda tekrar olusturmadan kullanabiliriz
    #Yukaridaki ornek de sayfayi kapatir step'i icin daha once AmazonStepDefinition'da olusturdugumuz methodu kullanabiliriz
  Scenario: TC02 Sayfada Arama Yapma
    Then arama kutusunda java aratir
    And sayfa basliginin java icerdigini test eder


  Scenario: TC03 Sayfada Arama Yapma
    Then arama kutusunda mobil aratir
    When cikan dropdown da mobile developer linkine tiklar
    And sayfa basliginin mobile icerdigini test eder
    And sayfayi kapatir
    #Scenario larimizin tek bir browser da calismasini istersek ve tum secenariolardan sonra browser'i kapatmak istersek
    #en son scenario'da close yapabiliriz