package Exceptions.HW2;

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    UserInputReader inputReader = new UserInputConsoleReader(scanner);
    UserDataFileWriter fileWriter = new UserDataFileWriterImpl();

    try {
      UserData userData = inputReader.readUserData();
      fileWriter.writeUserData(userData);
    } catch (UserDataException | IOException e) {
      System.out.println("Ошибка: " + e.getMessage());
    }
  }
}
