package org.exampel;

import org.example.Divisi;
import org.example.Karyawan;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisiTest {

        @Test
        public void testTambahKaryawan() {

                Divisi divisi = new Divisi("IT");

                Karyawan k1 = new Karyawan(
                                "Budi",
                                "Manager",
                                10000000);

                divisi.tambahKaryawan(k1);

                Assert.assertEquals(
                                divisi.getJumlahKaryawan(),
                                1);
        }

        @Test
        public void testTambahBanyakKaryawan() {

                Divisi divisi = new Divisi("HR");

                divisi.tambahKaryawan(
                                new Karyawan("Andi", "Staff", 5000000));

                divisi.tambahKaryawan(
                                new Karyawan("Sinta", "Staff", 6000000));

                Assert.assertEquals(
                                divisi.getJumlahKaryawan(),
                                2);
        }

        @Test(expectedExceptions = IllegalArgumentException.class)
        public void testTambahKaryawanNull() {

                Divisi divisi = new Divisi("Finance");

                divisi.tambahKaryawan(null);
        }
}