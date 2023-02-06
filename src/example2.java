public class example2 {
    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Run boy run!");
            }
        });
        t.run();
    }
}
