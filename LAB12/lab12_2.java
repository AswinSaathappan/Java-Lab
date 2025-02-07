import java.io.*;

class lab12_2
{
    public static void main(String[] args)
    {
        FileInputStream in = null;
        FileOutputStream out = null;
        int n;
        try
        {
            in = new FileInputStream("sample.txt");
            out = new FileOutputStream("outputfile.txt");

            while ((n = in.read()) != -1)
            {
                out.write(n);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if (in != null)
                    in.close();
                if (out != null)
                    out.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
