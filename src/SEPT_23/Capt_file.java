package SEPT_23;

import java.io.*;
import java.util.StringTokenizer;

public class Capt_file {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader fr = new BufferedReader(new FileReader("sample.txt"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("result.txt")));
        StringBuilder sb = new StringBuilder();
        String line;
        while((line = fr.readLine()) != null){
            StringTokenizer stk  = new StringTokenizer(line);
            while(stk.hasMoreTokens()){
                String capt = stk.nextToken();
                String a = capt.substring(0, 1).toUpperCase();
                String b = capt.substring(1).toLowerCase();
                sb.append(a).append(b).append(" ");
            }
        }
        System.out.println(sb);
        fr.close();
        pw.write(sb.toString().trim());
        pw.close();
    }
}
