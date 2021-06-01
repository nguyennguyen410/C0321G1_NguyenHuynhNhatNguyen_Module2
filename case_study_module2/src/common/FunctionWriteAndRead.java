package common;

import models.Customer;
import models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FunctionWriteAndRead {
    public List<String> readFile(String filePath) {
        List<String> list = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie Error");
        }
        return list;
    }

    public void writeFile(String filePath, String addData) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(addData);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*public List<Villa> readFileVilla(String filePath) {
        List<Villa> listVilla = new ArrayList<>();
        List<String> list = readFile(filePath);
       for (int i=0; i<list.size(); i++){
           String[] string = list.get(i).split(",");
           listVilla.add(new Villa(string[0],string[1],string[2],string[3],string[4],string[5],string[6],string[7],string[8]));
       }
        return listVilla;
    }*/

    public List<Customer> readFileCustomer(String filePath){
        List<Customer> listCustomer = new ArrayList<>();
        List<String> list = readFile(filePath);
        for (int i=0; i<list.size(); i++){
            String[] string = list.get(i).split(",");
            listCustomer.add(new Customer(string[0],string[1],string[2],string[3],string[4],string[5],string[6]));
        }
        return listCustomer;
    }
}
