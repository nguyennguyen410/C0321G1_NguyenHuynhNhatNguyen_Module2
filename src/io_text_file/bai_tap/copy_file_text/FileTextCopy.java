package io_text_file.bai_tap.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileTextCopy {
    public List<String> readFile(String filePath) {
        List<String> string = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                string.add(line);
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return string;
    }

    public int countWord (List<String> string){
        String[] string1 = new String[string.size()];
        int count=0;
        for (int i = 0; i<string.size(); i++){
            string1[i] = string.get(i);
        }
        for (int j = 0; j<string1.length; j++){
            count = count + string1[j].split(" ").length;
        }
        return count;
    }

    public void writeFile(String filePath, List<String> string, int count){
        try {
            FileWriter writer = new FileWriter(filePath, false);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (int i = 0; i<string.size(); i++){
                bufferedWriter.write(string.get(i));
                bufferedWriter.newLine();
            }
            bufferedWriter.write("Co tat ca "+count+ " tu trong file");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FileTextCopy fileTextCopy = new FileTextCopy();
        List<String> string = fileTextCopy.readFile("C:\\codegym\\CG\\C0321G1_NguyenHuynhNhatNguyen_Module2\\" +
                "src\\io_text_file\\bai_tap\\copy_file_text\\file_goc");
        int count = fileTextCopy.countWord(string);
        fileTextCopy.writeFile("C:\\codegym\\CG\\C0321G1_NguyenHuynhNhatNguyen_Module2\\" +
                "src\\io_text_file\\bai_tap\\copy_file_text\\file_copy",string,count);
    }
}
