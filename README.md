Explanation of the calculator project

Projenin başlangıcında gerekli import ve package işlemleri yapıldı.
İlk başta kullanıcının karşısına MenuSecim() fonksiyonu içinde çağırılan MenuOpen()
fonksiyonu çıkar. Bu fonksiyonu MenuSecim fonksiyonu içinde çağırmamdaki sebep seçilen
değerin 0-7 arasında bulunduğu sürece sürekliliği sağlamaktır.
Daha sonra kullanıcıdan menu içerisindeki işlem seçeneğini seçmesi beklenir.
Eğer girilen değer 0-7 arasında değilse uyarı mesajı vererek kullanıcıdan tekrar
seçim yapması istenmektedir.

Kullanıcıdan alınan değerin kontrolü main içindeki switch'de kontrol edilirken, kullanılan
veri tiplerini 2 biçimde kullanarak döngü ile kullanıcıdan giriş sağlanmaktadır.

Kullanıcının girdiği değerlerin kontrolü yapılarak istenmeyen şekilde programın
sonlanması engellenmesi için koşul durumları kullanılmalıdır.
