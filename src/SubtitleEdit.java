import java.io.*;

public class SubtitleEdit {

    String folderPath = "C:\\Users\\ascha\\Desktop\\test";

    public SubtitleEdit() {

        File folder = new File(folderPath);
        File[] fileList = folder.listFiles();

        for(File currentFile : fileList) {

            try {
                FileReader fileReader = new FileReader(currentFile);
                BufferedReader reader = new BufferedReader(fileReader);

                FileWriter fileWriter = new FileWriter(currentFile.getPath()+"New");
                BufferedWriter writer = new BufferedWriter(fileWriter);

                String currentString = reader.readLine();

                while (currentString != null) {

                    writer.write(currentString + "New");
                    currentString = reader.readLine();
                }

                reader.close();
                writer.close();

            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new SubtitleEdit();
    }
}
