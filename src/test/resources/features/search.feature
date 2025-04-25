Feature: US001 babayigitSearch ile tes yapma

  Scenario: TC001 babayigitSearch ile wise quarter arama sonuc sayısı bulma

    Given kullanici "babayigitUrl" adresine gider
      # Kullanıcının siteye gitmesi sağlanır
    Then kullanici arama kismina "wise quarter" yazar ve arama butonuna basar
      # Kullanıcı arayacağı kelimeyi yazar ve arama tuşuna basar
    Then kullanici sonuc sayfasinda arama sonuc sayisini alir ve yazdirir
      # Kullanıcı arama sonuçları sayfasında kaç adet sonuç olduğunu bulur ve yazdırır
    Then kullanici arama sonuc sayisinin 1000000 adetten fazla oldugunu dogrular
      # Kullanici arama sonuc sayısını ilgili degerle assert eder
    Then kullanici pencereyi kapatir
      # Kullanıcı işlemleri tamamladığı için pencereyi kapatır ve test sonlanır
