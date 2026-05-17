package org.exampel;

import org.example.Karyawan;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KaryawanTest {

    @Test
    public void testHitungGajiManager() {

        Karyawan k = new Karyawan(
                "Budi",
                "Manager",
                10000000);

        double expected = 15000000;

        Assert.assertEquals(
                k.hitungGajiTotal(),
                expected);
    }

    @Test
    public void testHitungGajiStaff() {

        Karyawan k = new Karyawan(
                "Andi",
                "Staff",
                5000000);

        double expected = 7000000;

        Assert.assertEquals(
                k.hitungGajiTotal(),
                expected);
    }

    @Test
    public void testUpdateGaji() {

        Karyawan k = new Karyawan(
                "Sinta",
                "Staff",
                1000000);

        k.updateGaji(10);

        Assert.assertEquals(
                k.getGajiPokok(),
                1100000);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGajiNegatif() {

        new Karyawan(
                "Asep",
                "Staff",
                -1000);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testUpdateGajiNegatif() {

        Karyawan k = new Karyawan(
                "Dina",
                "Manager",
                5000000);

        k.updateGaji(-10);
    }
}