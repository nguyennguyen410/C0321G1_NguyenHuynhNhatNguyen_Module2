package io_text_file.bai_tap.doc_file_csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileCsvRead {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\codegym\\CG\\C0321G1_NguyenHuynhNhatNguyen_Module2\\src\\" +
                    "io_text_file\\bai_tap\\doc_file_csv\\word");

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] string = line.split(",");
                System.out.println("ID: "+string[0]+", CODE: "+string[1]+", NAME: "+string[2]);
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại hoặc nội dung có lỗi!");
        }
    }
}
