import java.io.*;

class cevir
{
        public void cevcev(String girdi)
        {
                int toplam = 0;
                int ilkdeger = 0;
                int sondeger=0;
                int m;
                int f;
                int i;
                String roma = "IVXLC";
                for (int h = 0; h < girdi.length(); h++)
                {
                        if (girdi.charAt(h) == roma.charAt(1))
                        {
                                toplam += 5;
                        }

                        if (girdi.charAt(h) == roma.charAt(2))
                        {
                                toplam += 10;
                        }

                        if (girdi.charAt(h) == roma.charAt(3))
                        {
                                toplam += 50;
                        }
                        if (girdi.charAt(h) == roma.charAt(4))
                        {
                                toplam += 100;
                        }
                }
                for (i = 0; i < girdi.length(); i++)
                {
                        if (girdi.charAt(i) == roma.charAt(1) || girdi.charAt(i) == roma.charAt(2) || girdi.charAt(i) == roma.charAt(3) || girdi.charAt(i) == roma.charAt(4))
                        {
                                ilkdeger = i;
                                break;
                        }
                }
                if (ilkdeger != 0)
                {
                        for (int h = 0; h < ilkdeger; h++)
                        {
                                toplam = toplam - 1;
                        }
                }
                else
                {
                        for (int u = 0; u < girdi.length(); u++)
                        {
                                if (girdi.charAt(u) == roma.charAt(0))
                                {
                                        toplam += 1;
                                }
                        }
                }


                System.out.println(toplam);
        }
}

public class roma
{

        public static void main(String args[]) throws IOException
        {

                String giris;

                BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Roma rakamini giriniz:  ");

                giris = b.readLine();

                cevir c = new cevir();

                c.cevcev(giris);

        }

}
