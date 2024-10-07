package SEPT_23;

import java.io.*;

public class rm_html_tags {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new FileReader("sample.html"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
        StringBuilder sb = new StringBuilder();
        String line;
        while((line = br.readLine()) != null){
            line = line.replaceAll("<[^>]*>", "").trim();
            if(!line.isEmpty()){
                sb.append(line).append(System.lineSeparator());
            }
        }
        br.close();
        System.out.println(sb);
        pw.write(sb.toString().trim());
        pw.close();
    }
}
