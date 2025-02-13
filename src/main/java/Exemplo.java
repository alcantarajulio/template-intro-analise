import java.io.*;

public class Exemplo {

    public static void main(String[] args) {

        // lendo da entrada padrão
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(" ");
                
                long start = System.nanoTime();
                indexOf(tokens,"xxxxxx");
                long end = System.nanoTime();
                long time = end - start;
                System.out.println("comparacao " + (time) + " " + tokens.length);

            }
        } catch (IOException ioe) {}

    }


    public static boolean comparaExtremos(String[] tokens) {
        return tokens[0].equals(tokens[tokens.length - 1]);
    }

    public static int indexOf(String[] tokens, String key) {
        for(int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals(key)) return i;
        }
        return -1;
    }

}
