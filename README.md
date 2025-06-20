# 🛒 E-Commerce Android App

Aplicație mobilă Android de tip e-commerce, creată în Java folosind Android Studio, cu salvarea datelor locală prin TinyDB. Proiectul simulează un magazin online funcțional, oferind o experiență prietenoasă pentru utilizator.

## 🚀 Lansare

> Lansarea versiunii inițiale: **iunie 2025**

Această versiune include funcționalități de bază precum listare produse, adăugare în coș, vizualizare detalii produs și persistarea locală a comenzilor. Este orientată spre demonstrarea logicii de business într-o aplicație mobilă nativă.

## 📱 Tehnologii utilizate

| Componentă      | Tehnologie                  |
|------------------|------------------------------|
| Limbaj principal | Java                         |
| UI & Layout      | XML (Android Layout)         |
| IDE              | Android Studio               |
| Stocare locală   | [TinyDB](https://github.com/Krupen/TinyDB) – key-value storage |
| Navigare între activități | Intents & Activity Lifecycle |


## 🔧 Funcționalități

✅ Afișare listă de produse  
✅ Adăugare în coș (cu salvare în TinyDB)  
✅ Navigare între ecrane  
✅ Vizualizare total coș  
✅ UI responsive pentru mobil

## 🔌 Salvare locală – TinyDB

Aplicația nu folosește backend sau bază de date externă. Informațiile sunt stocate local folosind TinyDB, o bibliotecă simplificată pentru `SharedPreferences`:

```java
TinyDB tinydb = new TinyDB(getApplicationContext());
tinydb.putListString("cart", cartList);

▶️ Rulare aplicație
Clonează repo:

bash
Копировать
Редактировать
git clone https://github.com/EduardDubenco/E-Commerce.git
Deschide în Android Studio

Rulează aplicația pe emulator sau dispozitiv real cu Android 8+

📦 Dependențe (build.gradle)
gradle
Копировать
Редактировать
implementation 'com.google.code.gson:gson:2.8.9'
implementation 'com.github.Krupen:TinyDB:1.0.1'
🛣️ Planuri viitoare
 Integrare Firebase pentru autentificare și salvare cloud

 Căutare și filtrare produse

 Plată simulată cu QR / card

 Panou de administrare local

 Notificări push cu Firebase Cloud Messaging
