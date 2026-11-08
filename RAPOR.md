# Rapor

**Ad Soyad:**Bilgekağan Okuducu
**Numara:**698

## 1. Problem Analizi
Kullanıcı bir sınava girmiştir. Doğru ve yanlış sayısını öğrenmiştir fakat başarı durumunu bilmemektedir. Öğrenmek için programı kullanır. Program kullanıcıdan doğru ve yanlış sayılarını ister, boş soru sayısını, netini ve başarı durumunu hesaplayıp kullanıcıya bildirir.


## 2. Girdi - İşlem - Çıktı

**Girdiler:**
- 12, 6

**İşlemler:**
- Başlar
- Doğru sayısını ister
- Doğru sayısını okur
- Yanlış sayısını ister
- Yanlış sayısını okur
- Girilen sayıların programa uygun olup olmadığını kontrol eder.
- Uygunsa doğru ile yanlış sayısını toplayıp 20`den çıkarıp boş sayısını hesaplar.
- Yanlış sayısını dörde bölüp doğru sayısından çıkarıp neti hesaplar.
- Netin hangi sayı aralığında olduğunu kontrol eder.
- Netin bulunduğu sayı aralığına göre doğru sayısını, yanlış sayısını, boş sayısını, neti ve başarı durumunu çıktı verir.
- Bitirir

**Çıktılar:**
- 20 soru içerisinden 12 doğru, 6 yanlış yaptınız. Boş sayınız 2. Net sayınız 10,5. Başarı durumunuz iyi.

## 3. Matematiksel Formüller

- 12>0
- 6>0
- 12+6=18
- 20-(12+6)=2=bos
- 12-(6/4)=10.5=net
- 10.5>10 && 10,5<15

## 4. Sözde Kod (Pseudocode)


1. BAŞLA
2. DOĞRU SAYISINI İSTE
3. DOĞRU SAYISINI OKU
4. YANLIŞ SAYISINI İSTE
5. YANLIŞ SAYISINI OKU
6. DOĞRU VE YANLIŞ SAYISININ POZİTİF OLDUĞUNU VE İKİSİNİN TOPLAMININ YİRMİYİ GEÇMEDİĞİNİ KONTROL ET
7. DOĞRU VE YANLIŞ SAYISININ TOPLAMINI TOPLAM SORU SAYISINDAN (20) ÇIKARIP BOŞ SORU SAYISINI HESAPLA
8. YANLIŞ SAYISINI DÖRDE BÖLÜP DOĞRU SAYISINDAN ÇIKARIP NET SAYISINI HESAPLA
9. NET SAYISI 5`E EŞİT YADA BEŞTEN KÜÇÜKSE DOĞRU SAYISINI YANLIŞ SAYISINI BOŞ SAYISINI NETİNİ VE BAŞARI DURUMUNU GELİŞİTİRİLMELİ OLARAK ÇIKTI VER
10. NET SAYISI BEŞTEN BÜYÜK VE ONA EŞİT YADA ONDAN KÜÇÜKSE DOĞRU SAYISINI YANLIŞ SAYISINI BOŞ SAYISINI NETİNİ VE BAŞARI DURUMUNU ORTA OLARAK ÇIKTI VER
11. NET SAYISI ONDAN BÜYÜK VE 15E EŞİT YADA 15TEN KÜÇÜKSE DOĞRU SAYISINI YANLIŞ SAYISINI BOŞ SAYISINI NETİNİ VE BAŞARI DURUMUNU İYİ OLARAK ÇIKTI VER
12. NET SAYISI 15TEN BÜYÜK VE 20YE EŞİT YADA 20DEN KÜÇÜKSE DOĞRU SAYISINI YANLIŞ SAYISINI BOŞ SAYISINI NETİNİ VE BAŞARI DURUMUNU ÇOK İYİ OLARAK ÇIKTI VER
13. BİTİR  


## 5. Akış Şeması

![Akış Şeması](<img width="1163" height="746" alt="akis" src="https://github.com/user-attachments/assets/9cf5eeeb-35b5-4f2f-becc-aa5d69eed0f5" />

)

## 6. Başarı Durumu Koşulları
<!-- Koşulları hangi sırayla ve hangi operatörlerle yazdığınızı, nedenini açıklayın. -->
- Koşulların ilki girdilerin sistemin amacına uygun olup olmadığını analiz eder. girdilerin negatif olmamasını ve girdiler toplamının gereğinden fazla olmaması gerektiğini söyler. Bu koşul için < > || operatörleri kullanılır.
- Diğer koşullar ise hesaplanan net sayısının hangi başarı durumuna tekabül ettiğini kontrol eder. Bu koşul için < > >= <= && operatörleri kullanılır.

## 7. Test Sonuçları

| Doğru | Yanlış | Beklenen | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 20 | 0 | Net 20, Çok iyi | | |
| 15 | 4 | Net 14, İyi | | |
| 10 | 8 | Net 8, Orta | | |
| 5 | 0 | Net 5, Geliştirilmeli | | |
| 0 | 20 | Net -5, Geliştirilmeli | | |
| 10 | 10 | Net 7,5, Orta | | |
| 15 | 10 | Geçersiz giriş | | |
| 12 | 9 | Geçersiz giriş | | |
| -1 | 5 | Geçersiz giriş | | |
