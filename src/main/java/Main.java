import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Simulation simulation = new Simulation(2, 1000000);
        simulation.runSimulation();
        simulation.printResults();
    }

//    public void run() {
//        System.out.println("Welcome to dicey lab!\n" +
//                "Please input the number of dice you would like to throw followed by the number of throws to simulate");
//        int dice = getIntegerInput("");
//        int numThrows = getIntegerInput("");
//        Simulation simulation = new Simulation(dice, numThrows);
//        simulation.runSimulation();
//    }
//    public static void print(String output, Object... args) {
//        System.out.printf(output, args);
//    }
//    public static void println(String output, Object... args) {
//        print(output + "\n", args);
//    }
//    public static Integer getIntegerInput(String prompt) {
//        Scanner scanner = new Scanner(System.in);
//        println(prompt);
//        Integer userInput = scanner.nextInt();
//        return userInput;
//    }
}
