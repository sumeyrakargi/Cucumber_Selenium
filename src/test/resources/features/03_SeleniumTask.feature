Feature: Google search test
  Scenario: Google da bir kelime arandığındailgili kelimeyi barındıran sonuçlar görüntülenmelidir
    Given Kullanıcı Google a gider
    When Kullanıcı arama kısmında cucumber kelimesini aratır
    Then Kullanıcı title da cucumber kelimesinin geçtiğini doğrular