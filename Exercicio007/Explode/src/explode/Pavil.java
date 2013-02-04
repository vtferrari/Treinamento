package explode;

public class Pavil extends Bomba implements Runnable {

    @Override
    public void run() {
        write.lock();
        try {
            for (int j = 1; j <= 1000; j++) {
                Bomba.maisPolvora();
            }
        } finally {
            write.unlock();
        }

    }
}
