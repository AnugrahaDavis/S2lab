import java.io.*;

public class evenoddfiles {
    public static void main(String args[]) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String inputFile = reader.readLine();

            BufferedReader fileReader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter evenWriter = new BufferedWriter(new FileWriter("even.txt"));
            BufferedWriter oddWriter = new BufferedWriter(new FileWriter("odd.txt"));

            String line;
            while ((line = fileReader.readLine()) != null) {
                try {
                    int number = Integer.parseInt(line.trim());

                    if (number % 2 == 0) {
                        evenWriter.write(line);
                        evenWriter.newLine();
                    } else {
                        oddWriter.write(line);
                        oddWriter.newLine();
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Skipping invalid line: " + line);
                }
            }

            System.out.println("Separated successfully");

            reader.close();
            fileReader.close();
            evenWriter.close();
            oddWriter.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}