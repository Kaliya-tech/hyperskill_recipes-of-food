class Starter {

    public static void startRunnables(Runnable[] runnables) {
        // implement the method
        for (Runnable t : runnables) {
            Thread thread = new Thread(t);
            thread.start();
        }
    }
}