Feature: US001 Google Sayfasinda Urun Aratma

  Scenario: TC01 Arama Kutusunda Verilen Urunler Aratilir
    Given kullanici "googleUrl" sayfasina properties ile gider gider
    Then kullanici data tableda verilen bilgileri aratir
      | Datalar  |
      | samsung  |
      | nokia    |
      | apple    |
      | motorola |
    And sayfayi kapatir


 #DataTable Scenario Outline daki gibi birden fazla veriyi ayni scenario'da test etmek icin kullanilir
  #Scenario Outline' dan farkli olarak verilerle ilgili tablolari istedigimiz stepten sonra kendimiz olusturabiliriz
  #Tabloyu olusturdugumuz step'in methoduna parametre olarak cucumber.io dan DataTable parametresini ekleriz.
  #Bu parametre sayesinde olusturmus oldugumuz tabloyu bir list' e donusturup loop ile verileri kullanabiliriz
  #Birden fazla sutun olusturduysak yine DataTable parametresi sayseinde Excel'den bildigimiz row() methodu ile
  #bu datalara ulasabiliriz
      | email | password |
      | dfs   | sdfs     |
      | fs    | fsdf     |










