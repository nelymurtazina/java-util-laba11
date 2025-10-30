package main.java.com.student.textutil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TextAnalyzer {
    public static void main(String[] args) {
        System.out.println("Программа запустилась!");

        try {
            List<String> lines = Files.readAllLines(Paths.get("test.txt"));

            int lineCount = lines.size();
            int wordCount = 0;

            for (String line : lines) {
                String[] words = line.split(" ");
                wordCount += words.length;
            }

            System.out.println("=== РЕЗУЛЬТАТЫ ===");
            System.out.println("Строк: " + lineCount);
            System.out.println("Слов: " + wordCount);
            System.out.println("Программа завершена успешно!");

        } catch (IOException e) {
            System.out.println("Ошибка: файл test.txt не найден!");
        }
    }
}