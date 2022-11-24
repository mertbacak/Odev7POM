---- MAVEN ile Testlerin Koşulması----

-Tüm testleri koşmak için
mvn test

Tüm Otomobil Kategori İlan Listesi KM, ilan Başlığı,Fiyat Bilgisi İlan Detay Karşılaştırma Testlerini Koşmak için
mvn test -Dtest="AutoMobileSearch"

Popüler Arama Testleri Koşmak için
mvn test -Dtest="PopularCategoryTest"

Login Senaryoları
--Login içerisindeki tüm senaryoları koşmak için
mvn test -Dtest="LoginClass"
--Login Username şifre boş Case'ini koşmak için
mvn test -Dtest="LoginClass#loginDetailUsernameAndPasswordempty"
--Login Usernam alanı dolu Şifre alanı boş Case'ini koşmak için
mvn test -Dtest="LoginClass#loginDetailUsernameFilledAndPasswordEmpty"
--Login Username alanı boş Şifre alanı dolu Case'ini koşmak için
mvn test -Dtest="LoginClass#loginDetailUsernameEmptyAndPasswordFilled"
--Login Username ya da şifre alanı yanlış bilgi girildiğinde Case'ini koşmak için
mvn test -Dtest="LoginClass#loginusernameorpasswordwrong"
--Login başarılı senaryosunu koşmak için
mvn test -Dtest="LoginClass#loginSuccess"

Emlak İlan Verme Senaryosunu
mvn test -Dtest="ClassifiedCreate"

Arama Sonuç Detayı Senaryosu
-Tüm arama sonuç detay caseleri koşmak için
mvn test -Dtest="SearchResult"
-Arama sonuç Fiyat Filtresi Case'i koşmak için
mvn test -Dtest="SearchResult#searcResultCarPriceFilter"
-Arama sonuç Yıl Filtresi Case'i koşmak için
mvn test -Dtest="SearchResult#searcResultCarYearFilter"
-Arama sonuç Sıralama Yıla göre Eskiden Yeniye Case'i koşmak için
mvn test -Dtest="SearchResult#searcResultCarYearFilter"
-Arama sonuç Yıl Fiyat Sıralama Case'i koşmak için
mvn test -Dtest="SearchResult#searcResultCarYearPriceSortingFilter"





