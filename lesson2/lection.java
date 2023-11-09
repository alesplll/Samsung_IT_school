package gh.lesson2;

import java.util.Random;

public class lection {
    public static void main(String[] args) {
        IWeapon player = new Player();
        Player player2 = new Player();
        // Zombie z = new Zombie();

        // int b = testGun(player2);
        player.shoot(player2);

        Message computer = new PC();
        Message telephPhone = new Phone();
        Message table = new Tablet();

        computer.sendMessage("11");
        telephPhone.sendMessage("11");
        table.sendMessage("11");

    }

    static int testGun(Player player) {
        return player.takeWeapon();
    }
}

class Player implements IWeapon {
    public int hp;
    public int speed;
    public int damage;

    public Player() {
        hp = 100;
        speed = 100;
        damage = 10;
    }

    public void minsum() {

    }

    public int takeWeapon() {
        int wp = new Random().nextInt(5);
        return wp;
    }

    public void shoot(Player player) {
        player.hp -= damage;
        System.out.println("Player " + player + " has been damaged " + player.damage + " last hp " + player.hp);
    }
}

class Zombie implements IWeapon {
    public int hp;
    public int speed;
    public int damage;

    public Zombie() {
        hp = 100;
        speed = 100;
        damage = 10;
    }

    public int takeWeapon() {
        int wp = new Random().nextInt(500);
        return wp;
    }

    public void shoot(Player player) {
        player.hp -= damage;
        System.out.println("Zombie " + player + " has been damaged " + player.damage + " last hp " + player.hp);
    }
}

interface IWeapon {
    int takeWeapon();

    void shoot(Player player);

}

interface Message {
    void sendMessage(String sms);

    String takeMessage();
}

class PC implements Message {
    public void sendMessage(String sms) {
        System.out.println("sended from pc");
    }

    public String takeMessage() {
        System.out.println("get sms on pc");
        return "1";
    }
}

class Phone implements Message {
    public void sendMessage(String sms) {
        System.out.println("sended from phone");
    }

    public String takeMessage() {
        System.out.println("get sms on phone");
        return "1";

    }
}

class Tablet implements Message {
    public void sendMessage(String sms) {
        System.out.println("sended from tablet");
    }

    public String takeMessage() {
        System.out.println("get sms on tablet");
        return "1";

    }
}
