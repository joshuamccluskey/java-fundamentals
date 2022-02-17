/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import javax.print.DocFlavor;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;
import java.nio.file.Path;
import java.io.File;

public class App {

    public static void main(String[] args) {
        System.out.println("hello world");

    }

    public void linter () throws IOException {
        Path linterPath = Paths.get("/Users/joshuamccluskey/projects/courses/401/java-fundamentals/linter/app/src/main/resources/gates.js");
        System.out.println(linterPath.toAbsolutePath());

        String semicolon = ";";
        String curlyOpen = "{";
        String curlyClose = "}";
        String ifState = "if";
        String elseState = "else";

        Scanner scanner = null;
        try {
            scanner = new Scanner(linterPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        HashMap<Integer, Boolean> colonsMap = new HashMap<>();
        int lineNumber = 0;

        while (scanner.hasNextLine()) {
            String currentLine = scanner.nextLine();
            lineNumber++;
            if (currentLine.contains(curlyOpen) || currentLine.contains(curlyClose) || currentLine.contains(ifState) || currentLine.contains(elseState))
                continue;
            if (!currentLine.contains(semicolon)) {
                colonsMap.put(lineNumber, false);
                System.out.println("Line " + lineNumber + " Missing semicolon.");
            }
        }

    }
}