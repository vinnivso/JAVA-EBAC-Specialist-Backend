import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BackUpSys {
    public interface Batch{
        int[] getFileSize();
        int getTapeSize();

    }

    private static class NewBatch implements Batch{


        /**
         * Get the file sizes.
         * @return an array containing the file sizes
         */
        @Override
        public int[] getFileSize() {
            return new int[]{70, 10, 20, 40, 50, 60, 50, 100, 100};
        }

        /**
         * This method returns the size of the tape.
         *
         * @return the size of the tape
         */
        @Override
        public int getTapeSize() {
            return 100;
        }
    }

    private class Tape{
        private int stored;
        private int numberFile;

        public Tape(int stored){
            this.stored = stored;
            this.numberFile =  1;
        }

        /**
         * This method returns the value of the stored variable.
         * @return the value of the stored variable
         */
        public int getStored() {
            return stored;
        }

        /**
         * Increases the storage capacity by the specified amount.
         *
         * @param storage the amount by which to increase the storage capacity
         */
        public void addStorage(int storage){
            this.stored += storage;
        }


        /**
         * Increments the number of files by 1.
         */
        public void addFile(){
            this.numberFile++;
        }

        /**
         * Retrieves the number of the file.
         *
         * @return the number of the file
         */
        public int getNumberFile() {
            return numberFile;
        }
    }

    /**
     * Refactored function to calculate the minimum number of tapes needed to store files in a batch.
     * @param batch The batch object containing file sizes and tape size limit
     * @return The minimum number of tapes needed
     */
    public int getMinimumTapeCount(final Batch batch){
        // Get the file sizes and sort them in ascending order
        int[] sizes = batch.getFileSize();
        Arrays.sort(sizes);

        int tapes = 0;
        List<Tape> list = new ArrayList<>();

        // Iterate through each file size
        for (int i = sizes.length - 1; i >= 0 ; i--) {
            boolean stored = false;

            // Check if the file can be stored in an existing tape, else create a new tape
            for( Tape tape : list){
                if (((tape.getStored() + sizes[i]) <= batch.getTapeSize()) && (tape.getNumberFile() < 2)){
                    tape.addStorage(sizes[i]);
                    tape.addFile();
                    stored = true;
                    break;
                }
            }
            // If the file couldn't be stored in any existing tape, create a new tape
            if (!stored){
                tapes++;
                list.add(new Tape(sizes[i]));
            }

        }
        return tapes;
    }

    /**
     * Main method to demonstrate the functionality of BackUpSys class.
     * It initializes a BackUpSys object and a Batch object, then prints the minimum tape count.
     */
    public static void main(String[] args) {
        // Initialize BackUpSys object
        BackUpSys backUpSys = new BackUpSys();

        // Initialize Batch object
        Batch batch = new NewBatch();

        // Print the minimum tape count
        System.out.println(backUpSys.getMinimumTapeCount(batch));
    }
}
