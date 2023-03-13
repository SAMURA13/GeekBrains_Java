package Lesson2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HW2_2 {
    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("filename.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String surname = parts[0].split(":")[1].replaceAll("\"", "");
                String mark = parts[1].split(":")[1].replaceAll("\"", "");
                String subject = parts[2].split(":")[1].replaceAll("\"", "");
                output.append("Студент ").append(surname)
                      .append(" получил ").append(mark)
                      .append(" по предмету ").append(subject)
                      .append(".\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(output);
    } 
}
