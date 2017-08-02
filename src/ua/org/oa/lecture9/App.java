package ua.org.oa.lecture9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static final String INPUT_HUMAN_S_AGE = "Input human's age";

    public static void main(String[] args) {
//        Human human = createHumanConsole();
//        System.out.println(human);
//        human = createHumanConsole();
//        System.out.println(human);

        Human human = createHumanConsoleRapidValidation();
        System.out.println(human);
    }

    private static Human createHumanConsoleRapidValidation() {
        Human human = new Human();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new UncloseInputStream(System.in)));) {
            String name;
            int age;
            while (true) {
                try {
                    System.out.println("Input human's name");
                    name = br.readLine();
                    human.setName(name);
                    break;
                } catch (HumanNameException e) {
                    System.out.println(e.getMessage());
                }
            }
            while (true) {
                try {
                    age = readNumberConsole(br, INPUT_HUMAN_S_AGE);
                    human.setAge(age);
                    break;
                } catch (HumanAgeException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return human;
    }

    public static Human createHumanConsole() {
        Human human = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new UncloseInputStream(System.in)));) {
            System.out.println("Input human's name");
            String name = br.readLine();
            int age = readNumberConsole(br, INPUT_HUMAN_S_AGE);
            while (true) {
                try {
                    human = new Human(name, age);
                    break;
                } catch (HumanAgeException e) {
                    System.out.println(e.getMessage());
                    age = readNumberConsole(br, INPUT_HUMAN_S_AGE);
                } catch (HumanNameException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Input human's name");
                    name = br.readLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return human;
    }

    private static int readNumberConsole(BufferedReader br, String message) throws IOException {
        int number;
        while (true) {
            try {
                System.out.println(message);
                number = Integer.parseInt(br.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong number format");
            }
        }
        return number;
    }
}
class A{
  public void method() throws IOException{

  }
}
class B extends A{
    @Override
    public void method(){

    }
}