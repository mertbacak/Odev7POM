# Odev7POM

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
[mvn test -Dtest="LoginClass#loginDetailUsernameEmptyAndPasswordFilled"]


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


Caselerin Detayları

-----Login Senaryosu(Login Class) -----
**Login senaryosunda 5 farklı case yazılmıştır.**

loginDetailUsernameAndPasswordempty test methodunda ;
username ve passwordalanın boş bırakılır ve giriş butonuna tıklanır.
Username ve password textbox alanının altında çıkan hataların doğru geldiği kontrol edilmiştir.

-----
loginDetailUsernameFilledAndPasswordEmpty test methodunda;
username alanına vasitasupermagaza girilir password alanı boş
bırakılır.
Login butonuna tıklandığında password textboxının altında çıkan hatanın doğru hata olduğu görülür.

------
loginDetailUsernameFilledAndPasswordEmpty  test methodunda;
 username alanına boş bırakılır. Password alanına değer girilir.Login butonuna tıklandığında username textboxının altında çıkan hatanın doğru olduğu görülür.

-------
loginusernameorpasswordwrong test methodunda ;
 username alanına doğru kullanıcı adı girilir.
 Şifre alanına yanlış şifre girilir ve giriş yap butonuna tıklanır.
 Kullanıcı bilgileri doğru olmadığında çıkan hatanın doğru geldiği görülür.


----- İlan Verme Senaryosu(ClassifiedCreate Class)-----
vehicleClassifiedCreate test methodunda;
Sahibinden çerez kabul edilir.
Login giriş yap butonuna tıklanır.
Emlaknormalmagaza kullanıcı ise giriş yapılır.
İlan ver butonuna tıklanır. Kategori Seç adımında Konut>Satılık>Daire
seçilir.
 İlan Başlığı, Açıklama,Fiyat,m2(brüt),m2(net),aidat değerleri girilir. Odasayısı,Binayaşı,BulunduğuKat,Kat sayısı,
ısıtma,Banyo sayısı,Balkon,Kullanım durumu,Tapu durumu,Kimden,Görüntü arama gezilebilir,takaslı comboboxtan değerleri seçilir.
Adres bilgileri comboboxları girilerek google maps üzerinden adres pinlenir.
Detaylı bilgi alanları seçim yapmak istemiyorum
checkboxları seçilir.
 İlan verme kuralları checkbox işaretlenir ve Devam butonuna tıklanır.
 Önizleme sayfasında ilan ön izleme alanının geldiği görülür.Devam et butonuna tıklanır.
Doping sayfasında "Daha fazla alıcıya ulaşmak ister misiniz?" metninin geldiği doğru geldiği görülür.Dopinglerin geldiği
görülür.Doping sayfasında devam butonuna tıklanır.
Success sayfasında success iconunun ve Success sayfasındaki "Tebrikler! İlanınız yayına alınmıştır!" doğru geldiği görülür.

------Arama Sonuç(Search Result)

searcResultCarPriceFilter test methodunda;
sahibinden sayfasında çerez kabul edilir.
Arama textboxına bmw otomobil yazılır. Arama butonuna tıklanır.
Arama sayfasında arama textinin geldiği görülür.
Arama listesinde dönen element sayısının 0 dan büyük olduğu görülür.
Fiyat min alanına 100.000 TL Fiyat max alanına 250.000 girilir ve Ara butonuna tıklanır.
Filtre uygulandıktan sonra Listedeki elementlerin Fiyatlarının 100.000 TL ile 250.000 TL arasında olduğu görülür.



searcResultCarPriceFilter test methodunda;

sahibinden sayfasında çerez kabul edilir.
Arama textboxına bmw otomobil yazılır. Arama butonuna tıklanır.
Arama sayfasında arama textinin geldiği görülür.
Arama listesinde dönen element sayısının 0 dan büyük olduğu görülür.
Yıl min alanına 1990 yazılır Yıl max alanına 2012 yazılır ve ara butonuna tıklanır.
Yıl etiket alanı geleni kadar beklenir.
Filtre uygulandıktan sonra Listedeki elementlerin yıllarının 1996 ile 2000 TL arasında olduğu görülür.

searcResultCarSortByYearOldest test methodunda;
sahibinden sayfasında çerez kabul edilir.
Arama textboxına bmw otomobil yazılır. Arama butonuna tıklanır.
Arama sayfasında arama textinin geldiği görülür.
Arama listesinde dönen element sayısının 0 dan büyük olduğu görülür.
Sıralama alanına tıklanır.Yıllara göre (önce en eski) seçilir.
Sıralama filtresi uygulandıktan sonra Listedeki elementlerin yıla göre sıralandığı elementler kendi arasındaki yılları
karşılaştırılarak kontrol edilir.

