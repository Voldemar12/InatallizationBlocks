package example3;

import example2.Thread;

public class Main {
    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Run boy run!");
            }
        });
    }
}

}
