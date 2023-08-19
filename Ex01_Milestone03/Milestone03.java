package Ex01_Milestone03;

public class Milestone03 {

    public static void main(String[] args) throws InterruptedException {
        int hour = 0, minutes = 0, seconds = 0;
        
        while (true) {
            System.out.printf("%02d:%02d:%02d\n", hour, minutes, seconds);
            Thread.sleep(1000);
            
            seconds++;
            if (seconds == 60) {
                seconds = 0;
                minutes++;
                if (minutes == 60) {
                    minutes = 0;
                    hour++;
                    if (hour == 24) {
                        hour = 0;
                    }
                }
            }
        }
    }
}
