Feature: US002 Google Sayfasi Testi

  Scenario Outline: TC01 Arama Kutusunda Araclar Aratilir
    Given kullanici "googleUrl" sayfasina properties ile gider gider
    Then kullanici google arama kutusunda "<aranacakAraclar>" aratir
    And kullanici sayfa basliginin "<aranacakAraclar>" icerdigini test etti
    And sayfayi kapatir
    Examples:
      | aranacakAraclar |
      | volvo           |
      | ford            |
      | audi            |
      | mercedes        |
  #option+command+L yapinca duzeliyor liste

    #Scenario Outline: kullanimi TestNg deki data provider mantigiyla ayni calisir
    # Yukaridaki ornekteki gibi birden fazla veriyi loop kullanmadan teset edeiliriz
    #Scenario Outline kullaniminda examples yapisini kendimiz yazmamiza gerek yok
    #Scenario Outline yazdigimiz zaman altini kirmizi cizer ve mouse ile uzerine geldigimizde
    #Example yapisini create edebiliriz
