package com.kuliah.wikisejarah;

import java.util.ArrayList;

public class SejarahData {
    private static String[] sejarahNames = {
            "Perang Dunia I",
            "Perang Dunia II",
            "Perang Ambarawa"
    };

    private static String[] sejarahDetails = {
            "Salah seorang ulama dan khatib terkemuka di Masjid Besar Kasultanan Yogyakarta pada masa itu, dan ibu dari K.H. Ahmad Dahlan adalah puteri dari H. Ibrahim yang juga menjabat penghulu Kesultanan Ngayogyakarta Hadiningrat pada masa itu. KH. Ahmad Dahlan telah mempelopori kebangkitan ummat Islam untuk menyadari nasibnya sebagai bangsa terjajah yang masih harus belajar dan berbuat.",
            "Jenderal TNI Anumerta Ahmad Yani (juga dieja Achmad Yani; lahir di Purworejo, Jawa Tengah, 19 Juni 1922 – meninggal di Lubang Buaya, Jakarta, 1 Oktober 1965 pada umur 43 tahun) adalah komandan Tentara Nasional Indonesia Angkatan Darat, dan dibunuh oleh anggota Gerakan 30 September saat mencoba untuk menculik dia dari rumahnya.",
            "Sutomo (lahir di Surabaya, Jawa Timur, 3 Oktober 1920 – meninggal di Padang Arafah, Arab Saudi, 7 Oktober 1981 pada umur 61 tahun) lebih dikenal dengan sapaan akrab oleh rakyat sebagai Bung Tomo, adalah pahlawan yang terkenal karena peranannya dalam membangkitkan semangat rakyat untuk melawan kembalinya penjajah Belanda melalui tentara NICA, yang berakhir dengan pertempuran 10 November 1945 yang hingga kini diperingati sebagai Hari Pahlawan."
    };
    private static String[][] sejarahTokoh = {
            {
                "K.H. Ahmad Dahlan",
                "H. Ibrahim"
            },
            {
                "Ahmad Yani"
            },
            {
                    "Sutomo"
            }
    };
    private static String[][] sejarahTokohDetail = {
            {
                "Kiai Haji Ahmad Dahlan atau Muhammad Darwis adalah seorang Pahlawan Nasional Indonesia yang merupakan pendiri Muhammadiyah. Dia adalah putra keempat dari tujuh bersaudara dari keluarga K.H. Abu Bakar.",
                "Orang tuah K.H. Ahmad Dahlan"
            },
            {
                "Jenderal TNI Ahmad Yani yang merupakan salah satu Pahlawan Revolusi yang gugur menjadi korban tragedi Gerakan 30 September dibunuh oleh anggota Gerakan 30 September saat mencoba untuk menculik dia dari rumahnya."
            },
            {
                "Sutomo atau lebih dikenal dengan sapaan akrab Bung Tomo adalah pahlawan nasional Indonesia yang terkenal karena peranannya dalam Pertempuran 10 November 1945."
            }
    };

    private static int[] sejarahImages = {
            R.drawable.ww1,
            R.drawable.ww2,
            R.drawable.ambarawa
    };

    static ArrayList<Sejarah> getListData() {
        ArrayList<Sejarah> list = new ArrayList<>();
        for (int position = 0; position < sejarahNames.length; position++) {
            Sejarah sejarah = new Sejarah();
            sejarah.setName(sejarahNames[position]);
            sejarah.setDetail(sejarahDetails[position]);
            sejarah.setPhoto(sejarahImages[position]);
            sejarah.setTokoh(sejarahTokoh[position]);
            sejarah.setTokohDdetail(sejarahTokohDetail[position]);
            list.add(sejarah);
        }
        return list;
    }
}