package com.rk.skp;

class BujurSangkar {
    protected int Sisi;

    public void setSisi(int S) {
        Sisi = S;
    }

    public int getSisi() {
        return (Sisi);
    }

    public int HitungLuas() {
        return (Sisi * Sisi);
    }

    public int HitungKeliling() {
        return (4 * Sisi);
    }
}

class Kubus extends BujurSangkar {
    public int HitungLuas() {
        return (super.HitungLuas() * 6);
    }

    public int HitungVolume() {
        return (super.HitungLuas() * super.getSisi());
    }
}

public class Main {
    public static void main(String[] args) {
        BujurSangkar ObjSangkar = new BujurSangkar();
        Kubus ObjKubus = new Kubus();

        ObjSangkar.setSisi(10);
        ObjKubus.setSisi(20);

        System.out.println("---------------------------");
        System.out.println("       BUJUR SANGKAR       ");
        System.out.println("---------------------------");
        System.out.println("Sisi       = " + ObjSangkar.getSisi());
        System.out.println("Keliling   = " + ObjSangkar.HitungKeliling());
        System.out.println("Luas       = " + ObjSangkar.HitungLuas());
        System.out.println("---------------------------\n");
        System.out.println("---------------------------");
        System.out.println("           KUBUS           ");
        System.out.println("---------------------------");
        System.out.println("Sisi       = " + ObjKubus.getSisi());
        System.out.println("Luas       = " + ObjKubus.HitungLuas());
        System.out.println("Volume     = " + ObjKubus.HitungVolume());
        System.out.println("---------------------------");
    }
}

