package gh.lesson2;

public class Abstract_Classes {

}

abstract class BaseTank {
    public int hp, damage, speed;

    public void ToDoSomething() {
    }

    public abstract void absMethod();
    // тут мы его просто называем, но не говорим что это, т.к. каждый свой подкласс
    // будет сам его реализовывать
}

class TankNew extends BaseTank {
    public void absMethod() {
        // А тут уже реализуем
    }
}