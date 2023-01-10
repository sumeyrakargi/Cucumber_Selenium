Feature: Google search test
  Scenario: Google da bir kelime arandığındailgili kelimeyi barındıran sonuçlar görüntülenmelidir
    Given Kullanıcı Google sayfasına gider
    When Kullanıcı arama kısmında samsung kelimesini ara
    Then Kullanıcı sayfada samsung kelimesinin geçtiğini doğrular