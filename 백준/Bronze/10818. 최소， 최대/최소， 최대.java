import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = Integer.parseInt(st.nextToken());
        int max = min;
        for(int i = 0; i < n - 1; i++){
            int a = Integer.parseInt(st.nextToken());
            if(a < min)
                min = a;
            if(a > max)
                max = a;

        }
        bw.write(min + " " + max);
        bw.close();
    }
}