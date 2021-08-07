package com.company.systemActions.InformationSystem;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class InformationSystem {
    private static final String informationFilePath = "src/com/company/systemActions/InformationSystem/Information.txt";

    public static void readInformation(){
        try {
            String text = Files.readString(Paths.get(informationFilePath));
            AboutSystemMessage.aboutProgram(text);
        } catch (IOException ignored) {}
    }
}