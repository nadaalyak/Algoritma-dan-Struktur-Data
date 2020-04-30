# Jawaban Pertanyaan Percobaan 13.3.3.3
1. Double linked list memiliki dua buah pointer, yaitu next dan prev. Pointer next untuk menunjuk ke node setelahnya dan pointer prev menunjuk ke node sebelumnya.
2. Pointer next untuk menunjuk ke node setelahnya dan pointer prev menunjuk ke node sebelumnya.
3. Untuk mendeklarasikan bahwa atribut head masih kosong yang berarti linked list masih kosong atau belum terisi, dan size atau ukuran yang memuat jumlah dari node linked list adalah 0.
4. Node prev dianggap sama dengan null karena method ini adalah method yang berfungsi untuk mengisi node pertama pada linked list, yang dimana pada double linked list, node prev pada head selalu menunjuk pada null.
5. Mengubah node prev dari head awal, karena data ditambahkan dengan data baru di awal linked list. Sehingga head awal akan menunjuk ke node yang baru yang juga menjadi head yang baru.
6. Pembuatan object Node dengan mengisikan parameter prev dengan current dikarenakan current merupakan node terakhir pada linked list, lalu setelah node tersebut ditambahkan dengan node baru yang node prev nya menunjuk pada node yang terakhir tadi. Dan parameter next dengan null karena node yang baru akan ditaruh di node paling akhir, yang dimana next dari node terakhir selalu menunjuk pada null.

# Jawaban Pertanyaan Percobaan 13.4.3
1. Head awal diganti dengan head.next, dan prev dari head yang baru diganti menjadi null. Ini dilakukan agar node pertama pada linked list dapat terhapus dan digantikan oleh node setelah node pertama, dan prev dari head menunjuk ke null.
2. Memberikan kondisi apabila node next nya menunjuk pada null, maka node tersebut adalah node terakhir, karena next pada node terakhir selalu menunjuk pada null, hal tersebut dibuktikan pada potongan kode program berikut  
<img src = linklist.png>  
Yang berarti perulangan akan berhenti ketika node next bernilai null.

3. Current.prev.next = current.next
berfungsi untuk mengubah node next pada node sebelum current diubah menjadi node current.next, sehingga node current diabaikan dan next dari node sebelum current langsung menunjuk pada node setelah current
current.next.prev = current prev
berfungsi untuk mengubah node prev pada node setelah current diubah menjadi node current.prev, sehingga node current diabaikan dan prev dari node setelah current langsung menunjuk pada node sebelum current.

# Jawaban Pertanyaan Percobaan 13.5.3
1. Mengetahui size atau jumlah dari seluruh node yang ada pada linked list lalu nilainya dikembalikan pada pemanggilan method tersebut dengan tipe data int.
2. Indeks pada linked list dimulai dari 0, indeks ini tergantung pada inisiasi perulangannya, apakah dimulai dari 0 atau 1, pada percobaan yang telah dilakukan, perulangannya dimulai dari 0, hal ini dapat kita ketahui melalui method add(), remove(), dan get() dengan inisialisasi i = 0.
3. Ada perbedaan antara fungsi Add pada double linked list dan single linked list. Pada double linked list dilakukan pengubahan pada 2 atribut pada node yaitu pengubahan atribut prev dan next, sedangkan pada single linked list dilakukan pengubahan hanya 1 atribut yaitu atribut next saja, perbedaan dapat terlihat dari potongan kode program berikut  
DLL :  
<img src = dlinklist.png>

    SLL :  
<img src = slinklist.png>