package MainPackage;

import java.util.ArrayList;

/**arrAdd is a specific threadable object that requires an array list and upper and lower bounds for the arraylist.
 * when run it sums up the array list within the upper and lower bound it was given. and then deposits that sum within the mathstorage
 * static class.
 *
 */
public class arrAdd implements Runnable{
    private ArrayList<Integer> handedList;
    private int lowerBound;
    private int upperBound;

    /**overWritten constructor for the arrAdd class that requires all the values the class needs to operate
     *
     * @param passed
     * @param upper
     * @param lower
     */
    public arrAdd(ArrayList passed, int lower, int upper){
        handedList = passed;
        lowerBound = lower;
        upperBound = upper;
    }

    /**the run class in the arrAdd method takes the numbers previously passed to it by constructor and adds them together.
     * once added together appropriately it hands that value to the mathstorage synchronized method which adds it to a running total. after that it
     * tries to run the programs final method.
     *
     */
    public void run(){
        int tempsum = 0;
        for (int i = lowerBound; i <= upperBound; i ++){
            tempsum = tempsum + handedList.get(i);
        }
        mathStorage.setThreadAddOutput(tempsum);
        mathStorage.setEndedThreads();

    }



}
