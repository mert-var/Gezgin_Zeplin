# Gezgin Zeplin Problemi

**Giriş:**  En kısa yol problemi, bir başlangıç düğümünden bir bitiş düğümüne en az maliyeti olan yolu bulma problemidir.

**Amaç:**   Projeyi yapan kişi için veri yapıları ve veri modellerini anlaması, graf yapısını kullanması ve algoritma mantığı kullanarak bir probleme çözüm sağlayabilmesi amaçlanmaktadır.

### Problemin Tanımı

Bir turizm firması yeni geliştirilen Zeplin aracı ile turistlere Türkiye'yi minimum maliyet ve maksimum kârla gezdirmeyi planlamaktadır. Bu hedefi gerçekleştirebilmek için size başvurmaktadır.

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

• Türkiye'nin şehirlerini işeren latitude, longitute, altitude (rakım) ve komşuluk bilgilerini işeren bir dosya hazırlanmalıdır (lat long altitude bilgileri işin verilen dosyadan faydalanılmalı).

• Her şehrin komşu şehrine gidip gidemeyeceği tespit edilmelidir. Bunun tespiti için kendi rakım ve komşu şehrin rakım bilgisi değerlendirilerek eğim (derece) kriterini sağlayıp sağlamadığına bakılmalıdır. Eğim hesaplanırken yükseklik değeri metre, yatay mesafe kilometre olarak alınmalıdır.

• Yol uzunlukları yükseklik bilgisi kilometreye dönüştürülerek hesaplanmalıdır.

• Her şehir düğüm, gidilebilir komşu düğümler ve hesaplanan ağırlık değeri bağlantıların kenarı olacak şekilde graf yapısı tanımlanmalıdır. Geliştirilecek algoritma graf üzerinde çaışacak şekilde ayarlanmalıdır. Algoritma olarak En kısa yol algoritmalarından Bellman Ford, Dijkstra, önereceğiniz başka bir algoritma ya da fikir önceden sorulmak şartıyla değerlendirilebilir.

• Taşınabilir yolcu sayısına göre eğim değişeceği için graf yapısında komşuluklar ve ağırlıklar değişebilmektedir. Bu sebeple yolcu sayısına göre graf yapısı değiştirilebilmelidir.

