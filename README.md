# Gezgin Zeplin Problemi

**Giriş:**      En kısa yol problemi, bir başlangıç düğümünden bir bitiş düğümüne en az maliyeti olan yolu bulma problemidir.    
### Problemin Tanımı

Bir turizm firması yeni geliştirilen Zeplin aracı ile turistlere Türkiye'yi minimum maliyet ve maksimum kârla gezdirmeyi planlamaktadır. Bu hedefi gerçekleştirebilmek için size başvurmaktadır.

### Projenin Amacı

Projeyi yapan kişi için veri yapıları ve veri modellerini anlaması, graf yapısını kullanması ve algoritma mantığı kullanarak bir probleme çözüm sağlayabilmesi amaçlanmaktadır.

#### Firmanın talepleri:

    • Sabit ücret 20 TL olarak alındığında kaç yolcu ile sefer düzenlenirse maksimum kâr elde edilir ?

    • Bir yolcudan kaç TL alınırsa yüzde 50 kâra ulaşılır ?

**Aracın özellikleri:**

• Yolcu kapasitesi maksimum 50 minimum 5'tir.

• Tamamen doluyken en fazla 30 derecelik eğimle gidebileceği şehirlere hareket edebilir.

• Her binen kişi maksimum hareket eğim kabiliyetini 1 derece azaltmaktadır.

• Ornek: 50 yolcu 30 derece, 10 yolcu 70 derece, 13 yolcu 67 derece

• Havalandıktan sonra yerden yüksekliği eğime bağlı olarak belirli bir mesafeyi koruyacak şekilde hareket edebilmektedir.

• Bir şehirden başka bir şehire giderken komşu şehirlerden birinden geçmek zorundadır.

• Yerden 50 m sabit yükseklikte hareket etmektedir.

• 100 km'nin Zeplin'e maliyeti 1000 TL'dir.

**Çözüm için yapılması gereken adımlar:**

• Türkiye'nin şehirlerini içeren latitude, longitute, altitude (rakım) ve komşuluk bilgilerini içeren bir dosya hazırlanmalıdır 
(lat long altitude bilgileri için verilen dosyadan faydalanılmalı).

• Her şehrin komşu şehrine gidip gidemeyeceği tespit edilmelidir. Bunun tespiti için kendi rakım ve komşu şehrin rakım bilgisi değerlendirilerek eğim (derece) kriterini sağlayıp sağlamadığına bakılmalıdır. Eğim hesaplanırken yükseklik değeri metre, yatay mesafe kilometre olarak alınmalıdır.

• Yol uzunlukları yükseklik bilgisi kilometreye dönüştürülerek hesaplanmalıdır.

• Her şehir düğüm, gidilebilir komşu düğümler ve hesaplanan ağırlık değeri bağlantıların kenarı olacak şekilde graf yapısı tanımlanmalıdır. Geliştirilecek algoritma graf üzerinde çaışacak şekilde ayarlanmalıdır. Algoritma olarak En kısa yol algoritmalarından Bellman Ford, Dijkstra, önereceğiniz başka bir algoritma ya da fikir önceden sorulmak şartıyla değerlendirilebilir.

• Taşınabilir yolcu sayısına göre eğim değişeceği için graf yapısında komşuluklar ve ağırlıklar değişebilmektedir. Bu sebeple yolcu sayısına göre graf yapısı değiştirilebilmelidir.

• Graf için girdi olarak başlangıç ve bitiş şehri seçilebilmelidir. Seçilen şehirler arasında graf üzerinde en kısa yol algoritması işletilerek yolcu sayısına göre farklı çözümler sunulmalıdır.

### Proje İsterleri

• Konum ve güzergah bilgileri ayrı ayrı harita üzerinde gösterilmelidir (resim vs).

• Sabit ücretle kaç yolcu ile sefer düzenlenirse en çok kârı yapabilirim probleminde; 5 ile 50 arasındaki yolcu sayıları kadar olan yolcu sayısı için en iyi çözümü veren yol (harita üzerinde) ve girdi olarak alınan şehirler arasındaki toplam yollar ayrı ayrı çıktı
olarak verilmelidir. Çıktı üzerinde maksimum kâr hesaplanarak en iyi sonuca göre sıralanmalıdır.

• Bir yolcudan kaç TL alınırsa yüzde 50 kâr yapılabilir probleminde; 10,20,30,40,50 yolcu sayıları için en iyi çözümü veren yol (harita üzerinde) ve girdi olarak alınan şehirler arasındaki toplam yollar ayrı ayrı çıktı olarak verilmelidir. Çıktı üzerinde kâr miktarı yüzde 50 olacak şekilde bir yolcudan alınması gereken para miktarı hesaplanmalıdır.

• Her iki problem için lat, long ve komşular arasındaki mesafeler bir dosyaya yazılmalıdır.

• Çalışma süreleri gösterilmelidir.

### Kullanıcı Kataloğu

•  Programda hedef ve kaynak şehirleri girerken Türkçe karakter kullanmayınız ve ilk harfi büyük giriniz. Örnek: Ankara

•  Yolcu sayısını yazı olarak değil rakam kullanarak giriniz. Örnek: 5, 25, 30 

•  Kaynak şehri, hedef şehri ve yolcu sayısını girdikten sonra 'git' butonuna tıklarsanız 2 hedef arasındaki (varsa) en kısa 
yolu bulur ve haritaya çizer. Ayrica zeplinin kalkışından inişine kadar izlediği yolu tüm ayrıntılarıyla, 'Hareket_Detay' isimli  dosyaya yazdırır. Bu dosya projenin kendi klasöründe oluşur.

•  Kaynak şehri ve hedef şehri girdikten sonra 'problem 2' butonuna tıklarsanız 5-50 yolcu arasında sabit ücretle yapılan kârları bulur ve en fazla kârın olduğu yolcu sayısındaki güzergahı haritaya çizer.

• Kaynak şehri ve hedef şehri girdikten sonra 'problem 3' butonuna tıklarsanız 10,20,30,40,50 yolcu ile kişi başı ne kadar ücret 
alırsam 50% kârı elde edebilirim problemini çözer ve kişi başı en az ücret düşen ihtimalin güzergahını haritaya çizdirir.
