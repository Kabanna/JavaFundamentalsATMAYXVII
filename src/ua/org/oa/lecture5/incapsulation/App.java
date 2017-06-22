package ua.org.oa.lecture5.incapsulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        Human human = createHumanConsole();
        System.out.println(human);

        Boss boss1 = Boss.getInstance("Vasya");
        Boss boss2 = Boss.getInstance("Sveta");

        System.out.println(boss1);


    }

    private static Human createHumanConsole() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input human's name");
        String name = br.readLine();
        System.out.println("Input human's age");
        int age = Integer.parseInt(br.readLine());
        return new Human(name, age);
    }
}
