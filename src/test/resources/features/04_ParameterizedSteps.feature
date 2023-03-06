Feature: Google Arama


  Background:
    Given Kullanıcı Google sayfasındadır



  Scenario: cucumber searc
    When Kullanıcı "cucumber" arattığında
    Then Kullanıcı title da "cucumber" görür

