package org.example.urinals;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;
   /**
     * @author Manideep Nalluri
     */
    public class urinals {
        public String[] openFile() throws IOException {
            File urinal_data = new File("D:\\My SE Course Work\\SER-515\\ICA_8_TESTING\\urinal.dat");
            Scanner sc = new Scanner(urinal_data);
            File urinal_data1 = new File("D:\\My SE Course Work\\SER-515\\ICA_8_TESTING\\urinal.dat");
            int cnt = 0;
            try (LineNumberReader LNR = new LineNumberReader(new FileReader(urinal_data1))) {

                while (LNR.readLine() != null) {
                }

                cnt = LNR.getLineNumber();

            } catch (IOException e) {
                e.printStackTrace();
            }
            int i = 0;
            String[] File_Array = new String[cnt];
            while (sc.hasNextLine()) {
                File_Array[i] = sc.nextLine();
                i++;
            }
            return File_Array;
        }

        public void getString() throws IOException {
            String[] strArray = openFile();
            for (int i = 0; i < strArray.length; i++) {
                int result=countUrinals(strArray[i]);
                System.out.println(result);
            }
        }

        public int countUrinals(String str) {
            int count = 0;
            if (validString(str)) {
                int length = str.length();
                for (int i = 0; i < length - 1; i++) {
                    if (str.charAt(i) == '0') {
                        if (i == 0 && str.charAt(i + 1) == '0') {
                            count++;
                            str = str.substring(0, i) + '1'
                                    + str.substring(i + 1);

                        } else if (i > 0) {
                            if (str.charAt(i - 1) == '0' && str.charAt(i + 1) == '0') {
                                count++;
                                str = str.substring(0, i) + '1'
                                        + str.substring(i + 1);

                            }

                        }
                    }
                }
                if (str.charAt(length - 1) == '0' && str.charAt(length - 2) == '0') {
                    count++;
                    str = str.substring(0, length - 1) + '1'
                            + str.substring(length);
                }
            } else {
                count = -1;
            }
            return count;
        }

        public boolean validString(String str) {

            if (str != null) {
                int length = str.length();
                for (int i = 0; i < length - 1; i++) {

                    if (i == 0) {
                        if (str.charAt(0) == '1' && str.charAt(1) == '1') {
                            return false;
                        }
                    } else {
                        if (str.charAt(i) == '1') {
                            if (str.charAt(i - 1) == '1' || str.charAt(i + 1) == '1') {
                                return false;
                            }

                        }
                    }

                }
                return str.charAt(length - 1) != '1' || str.charAt(length - 2) != '1';
            }
            return true;
        }

        public static void main(String[] args) throws NullPointerException, IOException {
            urinals urinal = new urinals();
            urinal.getString();
        }
    }

