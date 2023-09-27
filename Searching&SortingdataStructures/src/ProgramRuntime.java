public class ProgramRuntime {

    static {
        Object interruptedException = null;
        // Object interruptedException1 = interruptedException;
        {

            long start = System.nanoTime();

            // -------- program --------
            GUI gui = new GUI();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //final computations

            long duration = (System.nanoTime() - start) / 1000000;
            System.out.println("GUI program runtime is:" + duration + "ms");
        }
    }
}
