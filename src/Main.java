public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHp(300);
        boss.setDmg(50);
        boss.setName("IronMan");
        boss.weapon.setWeaponName("Hatsan 125");
        boss.weapon.setWeaponType(WeaponType.PNEMATIC);
        System.out.println("health: " + boss.getHp() + "damage:" + boss.getDmg()
                + "name:" + boss.getName() + "hame of weapon:" + boss.weapon.getWeaponName() +
                "type of weapon:" + boss.weapon.getWeaponType());
    }
}