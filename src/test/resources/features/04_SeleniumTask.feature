Feature: Google search test
  Scenario:Google da bir kelime arandığındailgili kelimeyi barındıran sonuçlar görüntülenmelidir
    Given Kullanıcı Google sayfasına açar
    When Kullanıcı arama kısmında selenium kelimesini aratır
    Then  Kullanıcı titleda selenium kelimesinin geçtiğini doğrular