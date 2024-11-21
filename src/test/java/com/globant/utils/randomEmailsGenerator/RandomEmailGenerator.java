package com.globant.utils.randomEmailsGenerator;
import java.util.Random;
public class RandomEmailGenerator {
    private static final Random RANDOM = new Random();
    private static final String[] EMAIL_SUFFIXES = {"@gmail.com", "@hotmail.com", "@outlook.com"};
    public String generateEmail() {
        StringBuilder sb = new StringBuilder(10);
        for (int i = 0; i < 10; i++) {
            char randomChar = (char) ('a' + RANDOM.nextInt(26));
            sb.append(randomChar);
        }
        sb.append(EMAIL_SUFFIXES[RANDOM.nextInt(EMAIL_SUFFIXES.length)]);
        return sb.toString();
    }
    public static void main(String[] args) {
        RandomEmailGenerator randomEmailGenerator = new RandomEmailGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(randomEmailGenerator.generateEmail());
        }
    }
}
