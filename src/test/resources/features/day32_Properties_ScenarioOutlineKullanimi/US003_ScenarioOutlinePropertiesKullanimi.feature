Feature: US003 Google Sayfasi Testi

  Scenario Outline: TC01 Arama Kutusunda Araclar Aratilir
    Given kullanici "googleUrl" sayfasina properties ile gider gider
    Then kullanici google arama kutusunda "<aranacakAraclar>" ie propertiesden aratir
    And kullanici sayfa basliginin "<aranacakAraclar>" icerdigini test eder
    And sayfayi kapatir
    Examples:
      | aranacakAraclar |
      | arac1           |
      | arac2           |
      | arac3           |
      | arac4           |

    #Bu ornekte Scenario Outline yapisi ile verileri properties dosyasindan cektik