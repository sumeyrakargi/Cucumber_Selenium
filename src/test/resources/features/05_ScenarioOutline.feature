Feature: Google Arama Feature

  Scenario Outline:
    Given  Kullanıcı Google sayfasına gider
    When Kullanıcı "<aranacakKelime>" arattığında
    Then Kullanıcı title da "<dogrulanacakKelime>" görmelidir

    Examples:
    |aranacakKelime|dogrulanacakKelime|
    |samsung       |samsung           |
    |cucumber      |cucumber          |
    |selenium      |selenium          |