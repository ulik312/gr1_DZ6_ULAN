package com.pushki;

public class Main {

    public static void main(String[] args) {
        Boss boss=new Boss();
        boss.getWeapon().setWeapon(WeaponType.BULAVA);
        boss.setDamage(50);
        boss.setHealth(400);
        boss.getWeapon().setWeaponType("Холодное ");
        System.out.println(boss.info());
        System.out.println("________________________");
        Skelleton skelleton1=new Skelleton();
        Skelleton skelleton2=new Skelleton();
        skelleton1.setDamage(40);
        skelleton1.setHealth(200);
        skelleton1.setUmberOfArrows(200);
        skelleton1.getWeapon().setWeapon(WeaponType.AK47);
        skelleton1.getWeapon().setWeaponType("огнестрельное ");
        skelleton2.setDamage(50);
        skelleton2.setHealth(100);
        skelleton2.setUmberOfArrows(100);
        skelleton2.getWeapon().setWeapon(WeaponType.M16);
        skelleton2.getWeapon().setWeaponType("огнестрельное :");

        System.out.println(skelleton1.info());
        System.out.println("_________________________");
        System.out.println(skelleton2.info());
    }
}