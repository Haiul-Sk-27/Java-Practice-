public class index {
    public static void main(String[] args) throws Exception {
        final Object A = new Object();
        final Object B = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (A) {
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (B) { }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (B) {
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (A) { }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
