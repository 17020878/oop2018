package week9;
import java.io.*;

public class Utils {
    //phương thức đọc vào 1 xâu ký tự từ file
    public static String readContentFormFile(String path) {
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            String result = "";
            int i = 0;
            while ((i = fileInputStream.read()) != -1) {
                result += (char) i;
            }
            fileInputStream.close();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //phương thức ghi một xâu ký tự mới vào file, nếu file đó đã có nội dung thì ta xóa nội dung cũ đi vào thêm nội dung mới vào
    public static void writeContentToFile(String path, String newContent) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            byte[] temp = newContent.getBytes();
            fileOutputStream.write(temp);
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // phương thức ghi vào thêm vào file nội dung mới mà không xóa đi nội dung cũ
    public static void NewContentToFile(String path, String newContent) {
        try {
            FileWriter fileWriter = new FileWriter(path, true);
            fileWriter.write("\n");
            fileWriter.write(newContent);
            fileWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // phương thức tìm kiếm một file trong một thư mục
    public static File findFileByName(String folderPath, String fileName) {
        try {
            File dic = new File(folderPath);
            File[] arrFile = dic.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.startsWith(fileName) && name.endsWith(".txt");
                }
            });
            return arrFile[0];
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String args[]) {
        String newString = Utils.readContentFormFile("src/week9/file.txt");
        System.out.println(newString);
        String newContent = "Ghi them vao khi da xoa noi dung cu";
        Utils.writeContentToFile("src/week9/file.txt", newContent);
        Utils.NewContentToFile("src/week9/file.txt", "ghi them vao khong can xoa noi dung cu");
        File searchFile = Utils.findFileByName("src/week9/", "file.txt");
        if (searchFile != null) System.out.println("File is exist");
        else System.out.println("File is not exist");
    }
}