package Searching;

public class main {
    public static void main(String[] args) {
       int data[] = {25, 79, 62, 42, 38, 65, 47, 85, 71, 75, 48, 4, 55, 16, 50, 19, 50, 27, 7, 60};
       long awal, akhir, durasi;
       
       System.out.println("Liner Searching:");
       linearSearch(data, 60);
       linearSearch(data, 89);
       
       System.out.println("\nBinary Searching:");
       linearSearch(data, 77);
       linearSearch(data, 25);
       
       System.out.println("\nJump Searching:");
       linearSearch(data, 4);
       linearSearch(data, 16);

 
    }
   public static void linearSearch(int[] data, int cari) {
        boolean ditemuka = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == cari) {
                System.out.println("Elemen "+data[i]+" ditemukan dalam data indeks ke " + i);
                ditemuka = true;
                break;
            }
        }
        if (!ditemuka) {
            System.out.println("Elemen "+cari+" tidak ditemukan dalam di data");
        }
    }

   public static void binarySearch(int[] data, int cari) {
        int kiri = 0;
        int kanan = data.length - 1;
        boolean ditemukan = false;

        while (kiri <= kanan) {
            int tengah = kiri + (kanan - kiri) / 2;

            if (data[tengah] == cari) {
               System.out.println("Elemen "+data[tengah]+" ditemukan dalam data indeks ke " + tengah);
                ditemukan = true;
                break;
            } else if (data[tengah] < cari) {
                kiri = tengah + 1;
            } else {
                kanan = tengah - 1;
            }
        }

        if (!ditemukan) {
            System.out.println("Elemen "+cari+" tidak ditemukan dalam di data");
        }
    }
   
   public static void jumpSearch(int[] data, int cari) {
        int n = data.length;
        int jumpSize = (int) Math.floor(Math.sqrt(n));
        int prev = 0;

        while (data[Math.min(jumpSize, n) - 1] < cari) {
            prev = jumpSize;
            jumpSize += (int) Math.floor(Math.sqrt(n));
            if (jumpSize > n) {
            System.out.println("Elemen "+cari+" tidak ditemukan dalam di data");
                return;
            }
        }

        while (data[prev] < cari) {
            prev++;
            if (prev == Math.min(jumpSize, n)) {
            System.out.println("Elemen "+cari+" tidak ditemukan dalam di data");
                return;
            }
        }

        if (data[prev] == cari) {
               System.out.println("Elemen "+data[prev]+" ditemukan dalam data indeks ke " + prev);
        } else {
            System.out.println("Elemen "+cari+" tidak ditemukan dalam di data");
        }
    }

    
}
