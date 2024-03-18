package task1;


import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day");
        String day = scanner.nextLine();

        System.out.print("enter after how many days you want to join in the course ");
        int K = scanner.nextInt();

        int daysToAdd = K % 7; // Taking modulo to handle cases where K is greater than 7
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int index = getIndex(day, weekdays);
        int newIndex = (index + daysToAdd) % 7;

        System.out.println("The day of the week after " + K + " days will be: " + weekdays[newIndex]);
    }

    // Method to get the index of the given day in the weekdays array
    private static int getIndex(String day, String[] weekdays) {
        for (int i = 0; i < weekdays.length; i++) {
            if (weekdays[i].equalsIgnoreCase(day)) {
                return i;
            }
        }
        return -1; // If the day is not found
    }
}






















