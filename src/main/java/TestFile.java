import java.io.File;

public class TestFile {

    public static void main(String[] args) {
        String userDir = System.getProperty("user.dir");
        File homeDir = new File(userDir);
        if (homeDir.exists() && homeDir.isDirectory()) {
            printFilesName(homeDir.getAbsolutePath());
        }
    }

    private static void printFilesName(String filename) {
        File homeDir = new File(filename);
        File[] files = homeDir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    printFilesName(file.getAbsolutePath());
                } else {
                    System.out.println(file.getName());
                }
            }
        }
    }

}
