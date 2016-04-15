package TextLoadCipherToFile;

import java.io.*;

/**
 * Created by amikhalnyuk on 04.04.2016.
 */
public class TextLoadCipherToFile {
    public static void main (String[] args) throws IOException {
        try {


            FileOutputStream fos = new FileOutputStream ( "D://Work_docs/GO IT/Core Java/Lesson9/data.txt", true );

            BufferedReader br = new BufferedReader ( new InputStreamReader ( fos, "windows-1251" ) );

            BufferedWriter bw = new BufferedWriter ( new OutputStreamWriter ( fos ) );

            String str;
            do {

                str = br.readLine ();

                System.out.println ( str );

                bw.newLine ();

                bw.write ( str.toLowerCase ().replace ( ' ', '_' ) );
            } while (! str.equalsIgnoreCase ( "На Западном Фронте без перемен" ));

            br.close ();
            bw.close ();

        } catch (FileNotFoundException e) {
            System.out.println ( "Файл не найден! " + e );
        }
    }
}

