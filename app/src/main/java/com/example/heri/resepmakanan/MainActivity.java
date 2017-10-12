package com.example.heri.resepmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Resep>resepList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ResepAdapter rAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rv_main);

        rAdapter = new ResepAdapter(this,resepList);
        RecyclerView.LayoutManager rlayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(rlayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(rAdapter);

        ResepData();

    }

    public void ResepData() {
        Resep resep = new Resep("Lempah Kuning", R.drawable.lempahkuning,
                "Bahan-bahan :\n"
                    + "\t •  1/2 kg ikan tengiri pot jd 4 \n "
                    + "\t •  1/2 buah nanas potong2\n "
                    + "\t •  3 bh kacang panjang\n "
                    + "\t •  1 bh jagung manis\n"
                    + "\t •  2 bh tomat merah ,tomat hijau suka2\n"
                    + "\t •  1 ikat daun kemangi (selera)\n"
                    + "\t •  2 bh serei geprek\n"
                    + "\t Bumbu Halus: \n "
                        +"\t • 5 siung bawang merah\n"
                        +"\t • 3 siung bawang putih \n"
                        +"\t • 3 cm kunyit \n"
                        +"\t • sesuai selera cabe merah besar\n" +
                        "\t  •  sesuai selera cabe rawit\n" +
                        "\t  •  1 ruas jahe\n" +
                        "\t  •  1 ruas lengkuas\n" +
                        "\t  •  secukupnya garam,gula\n" +
                        "\t  •  sedikit terasi\n" +
                        "\t  •  sesuai selera air asam jawa\n\n"
                +"Langkah-Langkah :\n"
                +       "\t 1. Rebus air terlebih dulu,\n" +
                        "\t 2. Tumis bumbu halus bersama sereh,lengkuas,sampai harum,\n" +
                        "\t 3. Masukkan semua bahan kecuali ikan,\n" +
                        "\t 4. Ketika air mendidih baru masukkan ikan sebentar saja," +
                        "      kalau terlalu lama ikan akan hancur,\n" +
                        "\t 5. Bumbui dengan garam, gula,\n" +
                        "\t 6. Tes rasa terakhir masukkan daun kemangi atau bias " +
                        "      juga diganti dengan daun kedondong,\n" +
                        "\t 7. dan Sajikan\n\n" );

        resepList.add(resep);
        resep = new Resep("Lempah Darat", R.drawable.lempahdarat,
                "Bahan-bahan :\n"
                        +"\t  •  300 gram Pepaya tua mengkal, iris2\n"
                        +"\t  •  1 ikat Daun katuk, siangi ambil daunnya\n "
                        +"\t  Bumbu Halus :\n "
                        +"\t  •  15 buah Cabe rawit merah\n"
                        +"\t  •  1-2 sdm Terasi\n"
                        +"\t  •  1 sdt Gula pasir\n"
                        +"\t  •  secukupnya Garam \n\n"
                +"\t Langkah-Langkah :\n"
                        +"\t 1.	Cuci bersih pepaya dan daun katuk\n"
                        +"\t 2.	Masak bumbu halus dengan air sekitar 700ml\n"
                        +"\t 3.	Masak sampai mendidih\n"
                        +"\t 4.	Masukan daun katuk\n"
                        +"\t 5.	Masak sampai setengah matang\n"
                        +"\t 6.	sajikan");

        resepList.add(resep);
        resep = new Resep("Sambel Petai", R.drawable.sambelpetai,
                "Bahan-bahan : \n"
                        +"\t •	200 gram teri medan kering\n"
                        +"\t •	1 papan petai\n"
                        +"\t •	100 gram cabai keriting merah\n"
                        +"\t •	20 buah cabai rawit merah\n"
                        +"\t •	10 buah cabai rawit hijau\n"
                        +"\t •	10 siung bawang merah\n"
                        +"\t •	10 siung bawang putih\n"
                        +"\t •	secukupnya gula\n"
                        +"\t •	secukupnya garam\n"
                        +"\t •	secukupnya kaldu bubuk\n\n"
                +"\t Langkah-Langkah :\n"
                        +"\t 1. Ikan teri dicuci dan dibersihkan dari kotoran." +
                        "       kemudian rendam beberapa saat\n"
                        +"\t 2.	Petai dikupas dan dibersihkan." +
                        "       bisa direbus dahulu bila suka\n"
                        +"\t 3.	Haluskan cabai merah, rawit hijau, rawit merah, " +
                        "       bawang putih, dan bawang merah\n"
                        +"|t 4.	Panaskan minyak, kemudian goreng teri hingga kering\n"
                        +"\t 5.	Saat teri masih didalam wajan, masukkan bahan yang " +
                        "       telah dihaluskan ke dalam wajan, aduk hingga semua matang\n"
                        +"\t 6.	Masukkan petai\n"
                        +"\t 7.	Tambahkan garam, gula, kaldu bubuk. aduk rata, kemudian koreksi rasa\n"
                        +"\t 8.	Angkat dan sajikan");

        resepList.add(resep);
        resep = new Resep("Soto Betawi", R.drawable.sotobetawi,
                "Bahan-bahan : \n"
                    +"\t •	500g jerohan (usus, paru, dan babat)\n"
                    +"\t •	500g daging sapi skengkel (paha atas)\n"
                    +"\t •	2 buah kentang, dikupas, dibelah 4 bagian, dan digoreng\n"
                    +"\t •	2 batang serai, dimemarkan\n"
                    +"\t •	3 lembar daun salam\n"
                    +"\t •	3 lembar daun jeruk\n"
                    +"\t •	1½ liter santan sedang kentalnya\n"
                    +"\t •	2 sdm air jeruk limo\n"
                    +"\t •	2 sdm bawang goreng\n"
                    +"\t •	1 batang daun bawang diiris halus\n"
                    +"\t •	1 buah tomat dipotong 8 bagian\n"
                    +"\t •	1 sdm daun sledri dirajang halus\n"
                    +"\t •	1 batang kayu manis\n"
                    +"\t •	1 sdt garam\n"
                    +"\t •	1 sdm gula\n"
                    +"\t •	minyak untuk menumis\n"
                    +"\t •	emping melinjo goring\n"
                    +"\t Bumbu yang dihaluskan:"
                    +"\t 3 siung bawang putih\n"
                    +"\t 7 buah bawang merah\n"
                    +"\t 3 butir kemiri\n"
                    +"\t 2 sdt jintan\n"
                    +"\t 2 sdt lada\n"
                    +"\t 3 sdt ketumbar\n\n"
                +"Langkah-Langkah :\n"
                    +"\t 1. Bersihkan jerohan, kemudian rebus hingga ¾ empuk.Angkat dan sisihkan\n"
                    +"\t 2. Rebus santan hingga mendidih dengan api kecil. Masukkan jeroan dan daging Rebus kembali hingga keduanya matang\n"
                    +"\t 3. Tumis bumbu yang dihaluskan hingga harum dan matang. Masukkan serai, daun salam, daun jeruk, dan kayu manis. Setelah bumbu benar-benar harum dan matang, masukkan jeroan, daging, garam, dan gula ke dalam rebusan\n"
                    +"\t 4. Angkat jeroan dan daging. Potong-potong sesuai selera, lalu goreng. Sisihkan\n"
                    +"\t 5. Cara menyajikan: Letakkan potongan kentang goreng, potongan jeroan dan daging, daun bawang, daun sledri, dan air jeruk limau di dasar mangkok. Siram dengan kuah soto. Terakhir, taburi dengan bawang goreng. Hidangkan dengan emping melinjo" );

        resepList.add(resep);
        resep = new Resep("Sambel Petai", R.drawable.sambelpetai,
                "Bahan-bahan : \n"
                    +"\t •	500 gr iga sapi, potong jadi 10 sampai 12 bagian\n"
                    +"\t •	2 buah wortel organik, iris-iris bulat pipih\n"
                    +"\t •	4 buah tomat muda, iris menjadi empat bagian per buahnya\n"
                    +"\t •	4 buah kentang ukuran sedang, potong berbentuk stik keriting\n"
                    +"\t •	3 sdm gilingan bawang merah dan bawang putih dengan perbandingan 1 : 2\n"
                    +"\t •	1000 cc air\n"
                    +"\t •	Garam secukupnya\n"
                    +"\t •	1/4 sdt pala bubuk\n"
                    +"\t •	Merica secukupnya\n"
                    +"\t •	Bawang goreng secukupnya\n"
                    +"\t •	1 sdt gula pasir\n"
                    +"\t •	1 batang seledri, ikat\n"
                    +"\t •	Daun bawang secukupnya\n\n"
                +"Langkah-Langkah : \n"
                +"\t 1. Rebus iga yang telah dibersihkan ke dalam seliter air sampai empuk, tiriskan iga, saring kuah kaldunya, sisihkan\n"
                +"\t Tumis gilingan bawang dengan daun bawang dan seledri menggunakan api kecil, tuangkan kuah kaldu. Masukkan bahan-bahan sayur seperti wortel dan kentang\n"
                +"\t Rebus sayur sampai sedikit empuk, masukkan iga sapi\n"
                +"\t Tambahkan garam, pala, merica, dan gula. Kemudian masukkan irisam tomat. Aduk sampai sop matang\n"
                +"\t Angkat, sajikan dalam mangkuk, taburi dengan bawang goreng sesuai selera");

        resepList.add(resep);
        rAdapter.notifyDataSetChanged();
    }
}
