package week10;

import week9.Utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public String getCodeFunction(String code, int startFunction) {
        int countOpen = 0;
        int countClose = 0;
        int length = code.length();

        for (int i = startFunction; i < length; i++) {
            if (code.charAt(i) == '{') countOpen++;
            if (code.charAt(i) == '}') countClose++;

            if (countOpen == countClose && countOpen != 0) {
                return code.substring(startFunction, i + 1);
            }
        }

        return "";
    }

    public String getSourceCode(File path) {
        String code = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String temp;
            boolean isComment = false;
            while ((temp = bufferedReader.readLine()) != null) {
                if (temp.contains("/*")) {
                    isComment = true;
                    code += temp.substring(0, temp.indexOf("/*")) + "\n";
                }

                int indexComment = temp.indexOf("//");
                if (indexComment != -1) {
                    code += temp.substring(0, indexComment) + "\n";
                } else {
                    if (!isComment) code += temp + "\n";
                }

                if (temp.contains("*/")) {
                    isComment = false;
                    code += temp.substring(temp.indexOf("*/") + 2) + "\n";
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error read file.");
        }

        return code;
    }

    public List<String> getAllFunctions(File path) {
        List<String> result = new ArrayList<>();

        String code = getSourceCode(path);
        int pos = code.indexOf("public static");

        while (pos != -1) {
            String func = getCodeFunction(code, pos);
            result.add(func);
            pos = code.indexOf("public static", pos + 1);
        }

        return result;
    }
    public String findFunctionByName(String name){
        Task1 task1 = new Task1();
        List<String> findFuctions =  task1.getAllFunctions(new File("C:\\Users\\DELL\\IdeaProjects\\oop2018\\src\\week9\\Utils.java"));
        String Name = name.substring(0,name.indexOf("("));
        for(int i=0; i<findFuctions.size() ;i++){
            if(findFuctions.get(i).indexOf(Name)!=-1){
                return findFuctions.get(i);
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        List<String> funcs = task1.getAllFunctions(new File("C:\\Users\\DELL\\IdeaProjects\\oop2018\\src\\week9\\Utils.java"));

        for (String func : funcs) {
            Utils.NewContentToFile("C:\\Users\\DELL\\IdeaProjects\\oop2018\\src\\week10\\test.txt", func);
        }

        System.out.println(task1.findFunctionByName("writeContentToFile(String,String)"));
    }
}