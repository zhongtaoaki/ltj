package sixth;
// Java Program illustrating the Byte Stream to copy
// contents of one file to another file.

import java.io.*;
public class ByteStream {
    public static void main(String[] args) throws IOException {
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;

        try {
            sourceStream = new FileInputStream("src/srcfile.txt");
            targetStream = new FileOutputStream ("src/tarfile1.txt");

            // Reading source file and writing content to target
            // file byte by byte
            int temp;
            while ((temp = sourceStream.read()) != -1)
                targetStream.write((byte)temp);
        }
        finally {
            if (sourceStream != null)
                sourceStream.close();
            if (targetStream != null)
                targetStream.close();
        }
    }
}
