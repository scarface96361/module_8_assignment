package MainPackage;

public class mathStorage {

    private static int threadAddOutput ;
    private static int endedthreads = 0 ;

    private static long startTime;
    private static long endtime;

    public static synchronized void setThreadAddOutput(int p){
        threadAddOutput = threadAddOutput +  p;
    }

    /**setEndedThreads is designed to output the final time the multithreaded addition took as well as the final sum of the multithreaded version.
     * if there is still a running thread however it will simply add one to the ended thread counter untilt ehc ounter hits 3. once the counter hits 3
     * the method will run through the final segment of the program and end
     */
    public static synchronized void setEndedThreads(){
        //this if statement checks for 3 because its the 4th thread closing that needs to trigger this method running
        if (endedthreads == 3|| endedthreads > 3){
            //TODO implement the counter and final method to time and output sum.
            endtime = System.nanoTime();
            System.out.println("Multithreaded output = " + threadAddOutput);
            System.out.println("Multithreaded time = " + (endtime-startTime));


        }
        else{
            endedthreads++;
        }
    }

    /**Set start time for the end of program sum calculation. needs to run before the 4 addition threads are counted
     *
     */
    public static void setStartTime(){
        startTime = System.nanoTime();
    }
}
