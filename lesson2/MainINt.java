
package gh.lesson2;

import java.util.Random;

public class MainINt {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Zombie zombie = new Zombie();
        testGun(player1);
        testGun(player2);

        testGun(zombie);
    }

    static void testGun(IWeapon iWeapon) {
        System.out.println(iWeapon.TakeWeapon());
    }
}

class Player implements IWeapon {
    public int hp;
    public int speed;
    public int damage;
    public int curWeapon;

    public Player() {
        this.hp = 100;
        this.speed = 20;
        this.damage = 10;
        this.curWeapon = 0;
    }

    public Player(int speed, int damage, int curWeapon) {
        this.hp = 100;
        this.speed = speed;
        this.damage = damage;
        this.curWeapon = curWeapon;
    }

    public void ToDoSome() {

    }

    @Override
    public int TakeWeapon() {
        curWeapon = new Random().nextInt(5);
        return curWeapon;
    }

    @Override
    public void Shoot(Player player) {
        player.hp -= damage;
        System.out.println("Player " + player + " has been damaged on " + damage + " => HP: " + player.hp);
    }
}

class Zombie implements IWeapon {

    @Override
    public int TakeWeapon() {
        return 0;
    }

    @Override
    public void Shoot(Player player) {

    }
}

interface IWeapon {
    int TakeWeapon();

    void Shoot(Player player);
}