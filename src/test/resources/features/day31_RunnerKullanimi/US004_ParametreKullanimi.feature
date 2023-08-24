Feature: US004 TechProEducation Arama Testi
  Scenario: TC01 Sayfada Arama Yapma
    Given kullanici "https://techproeducation.com" sayfasina gider
    Then arama kutusunda "mobil" aratir
    When cikan dropdown da mobile developer linkine tiklar
    And sayfa basliginin mobile icerdigini test eder
    And sayfayi kapatir

  Scenario: TC02 Sayfada Arama Yapma
    Given kullanici "https://techproeducation.com" sayfasina gider
    Then arama kutusunda "qa" aratir
    And sayfayi kapatir

  Scenario: TC02 Sayfada Arama Yapma
    Given kullanici "https://techproeducation.com" sayfasina gider
    Then arama kutusunda "java" aratir
    And sayfayi kapatir