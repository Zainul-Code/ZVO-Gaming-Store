package Class;

import java.util.Scanner;

public class Transaksi {

    public void show() {
        Scanner in = new Scanner(System.in);
        String perintah = "";
        int pilihan, jumlah, jumlah1 = 0, jumlah2, harga, diskon;
        double total = 0;
        System.out.print("Masukkan Pilihan Angka = ");
        pilihan = in.nextInt();


        do {

            //input jumlah barang yang akan dibeli
            switch (pilihan) {
                case 1:
                    System.out.println();
                    System.out.println("PUBG");
                    System.out.println("Harga sudah termasuk 10% PPN");
                    System.out.print("Masukkan Nominal Topup / Jumlah UC = ");
                    jumlah = in.nextInt();
                    harga = 200 * jumlah;
                    System.out.println("Harga = Rp. " + harga);
                    if (jumlah % 5 >= 0) {
                    }
                    jumlah2 = jumlah ;

                    if (harga > 50000) {
                        diskon = harga * 2 / 100;
                        harga = harga - diskon;
                        System.out.println("Pembelian anda > 50000, Anda mendapatkan diskon 2% = Rp. " + diskon);
                    }

                    System.out.println("Jumlah barang yang didapat = " + jumlah2);
                    System.out.println("Selamat Anda cukup membayar Rp. " + harga + " untuk " + jumlah2 + " UC");

                    total = total + harga;
                    System.out.print("Ada Pesanan Lagi? (Y/N) ");
                    perintah = in.next();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Call Of Duty Mobile");
                    System.out.println("Harga sudah termasuk 10% PPN");
                    System.out.print("Masukan Nominal Topup / Jumblah CP = ");
                    jumlah = in.nextInt();
                    harga = 150 * jumlah;
                    System.out.println("Harga = Rp. " + harga);
                    if (jumlah % 5 >= 0) {
                    }
                    jumlah2 = jumlah ;

                    if (harga > 25000) {
                        diskon = harga * 4 / 100;
                        harga = harga - diskon;
                        System.out.println("Pembelian anda > 100000, Anda mendapat diskon 4% = Rp. " + diskon);
                    }

                    System.out.println("Jumlah CP didapat = " + jumlah2);
                    System.out.println("Selamat Anda cukup membayar Rp. " + harga + " untuk " + jumlah2 + " CP");

                    total = total + harga;
                    System.out.print("Ada Pesanan Lagi? (Y/N) ");
                    perintah = in.next();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Free Fire");
                    System.out.println("Harga sudah termasuk 10% PPN");
                    System.out.print("Masukan Nominal Topup / Jumblah Diamonds = ");
                    jumlah = in.nextInt();
                    harga = 145 * jumlah;
                    System.out.println("Harga = Rp. " + harga);
                    if (jumlah % 5 >= 0) {
                    }
                    jumlah2 = jumlah ;

                    if (harga > 24000) {
                        diskon = harga * 5 / 100;
                        harga = harga - diskon;
                        System.out.println("Pembelian anda > 24000, Anda mendapat diskon 2% = Rp. " + diskon);
                    }

                    System.out.println("Jumlah Diamonds yang didapat = " + jumlah2);
                    System.out.println("Selamat Anda cukup membayar Rp. " + harga + " untuk " + jumlah2 + " Diamonds");

                    total = total + harga;
                    System.out.print("Ada Pesanan Lagi? (Y/N) ");
                    perintah = in.next();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Mobile Legend");
                    System.out.println("Harga sudah termasuk 10% PPN");
                    System.out.print("Masukan Nominal Topup / Jumblah Diamonds = ");
                    jumlah = in.nextInt();
                    harga = 300 * jumlah;
                    System.out.println("Harga = Rp. " + harga);
                    if (jumlah % 5 >= 0) {

                    }
                    jumlah2 = jumlah ;

                    if (harga > 35000) {
                        diskon = harga * 6 / 100;
                        harga = harga - diskon;
                        System.out.println("Pembelian anda > 35000, Anda mendapat diskon 3% = Rp. " + diskon);
                    }

                    System.out.println("Jumlah Diamonds yang didapat = " + jumlah2);
                    System.out.println("Selamat Anda cukup membayar Rp. " + harga + " untuk " + jumlah2 + " Diamonds");

                    total = total + harga;
                    System.out.print("Ada Pesanan Lagi? (Y/N) ");
                    perintah = in.next();
                    break;
                case 5:
                    System.out.println();
                    System.out.println("Higgs Domino");
                    System.out.println("Harga sudah termasuk 10% PPN");
                    System.out.print("Masukkan Nominal Topup / Jumblah Koin Emas = ");
                    jumlah = in.nextInt();
                    harga = 5000 * jumlah;
                    System.out.println("Harga = Rp. " + harga);
                    if (jumlah % 5 >= 0) {

                    }
                    jumlah2 = jumlah ;

                    if (harga > 10000) {
                        diskon = harga * 1 / 100;
                        harga = harga - diskon;
                        System.out.println("Pembelian anda > 10000, Anda mendapat diskon 1% = Rp. " + diskon);
                    }

                    System.out.println("Jumlah Koin Emas yang didapat = " + jumlah2);
                    System.out.println("Selamat Anda cukup membayar Rp. " + harga + " untuk " + jumlah2 + " Koin Emas");

                    total = total + harga;
                    System.out.print("Ada Pesanan Lagi? (Y/N) ");
                    perintah = in.next();
            }
        } while (perintah.equalsIgnoreCase("Y"));
        System.out.println(" ");
        System.out.println("---------------------------------------------");
        System.out.println("Total  = RP. " + total);
        System.out.println("Terima Kasih Sudah Mempercayai Kami");
        System.out.println("---------------------------------------------");
    }

}
