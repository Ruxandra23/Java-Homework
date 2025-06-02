package fileoperations;

import java.io.*;
import java.util.*;

public class FileProcessor {

    public static String findLongestWord(String fileName) throws IOException {
        String longestWord = "";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    word = word.replaceAll("[^a-zA-Z0-9]", "");
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }
        }

        return longestWord;
    }

    public static void appendCurrentClassToFile(String fileName) throws IOException {
        String currentClassName = FileProcessor.class.getSimpleName() + ".java";

        try (FileWriter fw = new FileWriter(fileName, true);
             PrintWriter pw = new PrintWriter(fw)) {

            pw.println("\n=== Conținutul clasei " + currentClassName + " ===");
            pw.println("package fileoperations;");
            pw.println("import java.io.*;");
            pw.println("import java.util.*;");
            pw.println("public class FileProcessor { ... }");
        }
    }

    public static String[] saveFileToArray(String fileName) throws IOException {
        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        }

        return lines.toArray(new String[0]);
    }

    private static void createTestFile(String fileName) throws IOException {
        try (PrintWriter pw = new PrintWriter(fileName)) {
            pw.println("Acesta este un fisier de test pentru demonstrarea operatiilor.");
            pw.println("Contine mai multe cuvinte de lungimi diferite.");
            pw.println("Cuvantul supercalifragilisticexpialidocious este foarte lung.");
            pw.println("Programarea in Java este interesanta si educativa.");
        }
    }

    public static void main(String[] args) {
        String fileName = "test.txt";

        try {
            createTestFile(fileName);
            System.out.println("Fișierul de test a fost creat: " + fileName);

            String longestWord = findLongestWord(fileName);
            System.out.println("Cel mai lung cuvânt: " + longestWord);

            appendCurrentClassToFile(fileName);
            System.out.println("Conținutul clasei a fost adăugat în fișier.");

            String[] fileLines = saveFileToArray(fileName);
            System.out.println("Conținutul salvat în array (" + fileLines.length + " linii):");
            for (int i = 0; i < fileLines.length; i++) {
                System.out.println("Linia " + (i + 1) + ": " + fileLines[i]);
            }

        } catch (IOException e) {
            System.err.println("Eroare: " + e.getMessage());
        }
    }
}