Feature: Google Arama Testi

  Background: Kulanıcı her senaryoda Google sitsinde olacaktır
    Given Kullanıcı Google sayfasındadır

  Scenario: Kullnıcı samsung aradığında samsung görmelidir.
    When Kullanıcı samsung kelimesini arar
    Then Kulanıcı sayfada samsung geçtiğini görür

  Scenario: Kullnıcı cucumber aradığında samsung görmelidir.
    When Kullanıcı cucumber kelimesini arar
    Then Kulanıcı sayfada cucumber geçtiğini görür

  Scenario: Kullnıcı selenium aradığında selenium görmelidir.
    When Kullanıcı selenium kelimesini arar
    Then Kulanıcı sayfada selenium geçtiğini görür

