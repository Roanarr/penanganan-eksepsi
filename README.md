# EXCEPTION HANDLING PADA JAVA
## JAVA EXCEPTION
### Ketika mengeksekusi kode Java, beberapa kesalahan mungkin saja terjadi seperti kode error yang dibuat oleh programmer, kesalahan karena input yang salah, atau hal-hal lain yang tidak terduga. Ketika error terjadi, normalnya Java akan berhenti dan menghasilkan pesan error. Istilah teknis untuk ini adalah Java akan melempar sebuah exception (melempar sebuah error).
## JAVA TRY DAN CATCH
### Statement try memungkinkan Anda untuk mendefinisikan blok kode yang akan diuji untuk kesalahan yang akan dieksekusi.
### Statement catch memungkinkan Anda untuk mendefinisikan blok kode yang akan diuji, jika sebuah error terjadi di dalam blok try.
### Keyword try dan catch selalu berpasangan :
![eksepsi1](https://user-images.githubusercontent.com/118960008/208624320-1297b4fc-bc83-4a7c-9f36-679fc3c78405.png)
### Perhatikan contoh di bawah ini yang akan menghasilkan error, karena array nomorSaya dengan indeks 10 (nomorSaya[10]) tidak ada :
![eksepsi2](https://user-images.githubusercontent.com/118960008/208624638-0eb2844c-d8b2-4787-a851-3566c37d69c2.png)
### Hasilnya akan seperti berikut :Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10 at Main.main(Main.java:4) Jika sebuah error terjadi, kita dapat menggunakan try…catch untuk menangkap error dan mengeksekusi beberapa kode untuk menanganinya. Contoh :
![eksepsi3](https://user-images.githubusercontent.com/118960008/208624897-bf7952ed-d90e-47c6-896a-9aacb79c4a84.png)
### Hasilnya akan seperti berikut :Terjadi kesalahan.
## FINALLY
### Statement finally memungkinkan Anda untuk mengeksekusi kode setelah try…catch terlepas dari hasilnya. Contoh :
![eksepsi4](https://user-images.githubusercontent.com/118960008/208625125-17df805b-5f0c-49d6-9999-036b255b646e.png)
### Hasilnya akan seperti berikut :Terjadi kesalahan.'try...catch' sudah selesai.
## KEYWORD THROW
### Statement throw memungkinkan Anda untuk membuat error khusus. Statement throw digunakan bersama dengan tipe exception. Terdapat banyak tipe exception tersedia di Java seperti ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, dll. Contoh di bawah ini memperlihatkan method cekUmur akan melempar sebuah exception jika umur di bawah 18 (cetak “Akses ditolak”). Sedangkan jika umur adalah 18 atau lebih besar, cetak “Akses diterima” :
![eksepsi5](https://user-images.githubusercontent.com/118960008/208625404-69dfa7a8-9ed4-4c14-a090-cae22714a260.png)
### Hasilnya akan seperti berikut :

### Exception in thread "main" java.lang.ArithmeticException: Akses ditolak - Anda setidaknya harus berumur lebih dari 18 tahun
###        at Main.checkAge(Main.java:4)
###        at Main.main(Main.java:12) 
### Jika umur 20, Anda tidak akan mendapatkan sebuah exception. Contoh :
![eksepsi6](https://user-images.githubusercontent.com/118960008/208625685-c6dd55d8-363c-4747-8e61-c1fa657b0c40.png)

### Hasilnya akan seperti berikut :

### Akses diterima - Anda sudah cukup umur

#### https://nextgen.co.id/exception-handling-pada-java/
