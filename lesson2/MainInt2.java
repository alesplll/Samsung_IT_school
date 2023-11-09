
package gh.lesson2;

import java.util.ArrayList;
import java.util.List;

public class MainInt2 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        PC pc = new PC();
        Pager pager = new Pager();
        List<IMessage> list = new ArrayList<>();
        list.add(phone);
        list.add(pc);
        list.add(pager);

        rassylka(list);
    }

    static void rassylka(List<IMessage> messages) {
        for (IMessage iMessage : messages) {
            iMessage.sendMessage("This is rassylka");
        }
    }
}

interface IFriendSystem {
    void addFriend(int id);

    List<Integer> getAllFriends();
}

interface IMessage {
    void sendMessage(String message);

    String takeMessage();
}

class PC implements IMessage, IFriendSystem {

    @Override
    public void sendMessage(String message) {
        System.out.println("Отправлено сообщение с ПК: " + message);
    }

    @Override
    public String takeMessage() {
        return "Получено сообщение для ПК";
    }

    @Override
    public void addFriend(int id) {

    }

    @Override
    public List<Integer> getAllFriends() {
        return null;
    }
}

class Phone implements IMessage {

    @Override
    public void sendMessage(String message) {
        System.out.println("Отправлено сообщение с Телефона: " + message);
    }

    @Override
    public String takeMessage() {
        return "Получено сообщение для Телефона";
    }
}

class Pager implements IMessage {

    @Override
    public void sendMessage(String message) {
        System.out.println("Отправлено сообщение с Пэйджера: " + message);
    }

    @Override
    public String takeMessage() {
        return "Получено сообщение для Пейджера";
    }
}