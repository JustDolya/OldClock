import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ticksCount = 0;
        Scanner scanner = new Scanner(System.in);
        String[] startTime = scanner.nextLine().split(" ");
        String[] endTime = scanner.nextLine().split(" ");
        try {
            int startHour = Integer.parseInt(startTime[0]);
            int startMinute = Integer.parseInt(startTime[1]);
            int endHour = Integer.parseInt(endTime[0]);
            int endMinute = Integer.parseInt(endTime[1]);

            if (startMinute < 30){
                ticksCount++;
            }
            if (endMinute <= 30){
                ticksCount--;
            }
            if (startHour > endHour){
                endHour += 24;
            }
            for (int hour = startHour + 1; hour <= endHour; hour++){
                if (hour > 24){
                    ticksCount += hour - 24;
                } else if (hour > 12 && hour <= 24){
                    ticksCount += hour - 12;
                }else{
                   ticksCount += hour;
                }
                ticksCount++;
            }
            System.out.println(ticksCount);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}