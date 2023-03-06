Feature: Amazon search page


  Scenario Outline:Kullanıcı aratacağı kelimeyi sonuçlarda görmelidir
    Given Kullanıcı Amazon sitesine gider
    When Kullanıcı amazonda "<kelime>" aratır
    Then Kullanıcı arama sonuçlarında "<kelime>" görmelidir
    And Kullanıcı Ekran görüntüsü alır
    And Kullanıcı Browser ı kapatır

    Examples:
    |kelime|
    |mac   |
    |windows|
    |linux  |