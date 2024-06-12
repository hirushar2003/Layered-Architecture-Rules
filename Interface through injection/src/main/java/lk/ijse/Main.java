package lk.ijse;

public class Main {
    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.setInjection(new Girl());
        boy.chatWithGirl();
    }
}