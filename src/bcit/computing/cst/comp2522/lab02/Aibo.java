package bcit.computing.cst.comp2522.lab02;

public class Aibo extends Robot implements Speakable {

    private String speak;

    public Aibo() {
        speak = "Woof!";
    }

    public void speak() {
        System.out.println(speak);
    }
}
