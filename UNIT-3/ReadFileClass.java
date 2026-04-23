import java.io.*;

class ReadFileClass {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("hello.txt"));
        String line;
        int l = 0, w = 0, c = 0;

        while ((line = br.readLine()) != null) {
            l++;
            c += line.length();
            w += line.split("\\s+").length;
        }

        System.out.println("Lines=" + l);
        System.out.println("Words=" + w);
        System.out.println("Chars=" + c);
    }
}