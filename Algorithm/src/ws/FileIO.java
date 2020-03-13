package ws;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;

public class FileIO
{
    public static void main(String[] args)
    {
        File file = new File("/temptemp");

        byte[] byteArr = new byte[1024];

        InputStream in = new ByteArrayInputStream(byteArr);
    }
}
