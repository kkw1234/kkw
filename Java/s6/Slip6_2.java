 import java.io.*;
import java.net.*;

class Server_Slip6_2
{
            public static void main(String a[]) throws Exception
            {
                        ServerSocket ss = new ServerSocket(1000);
                        System.out.println("Server is waiting for client : ");
                        Socket s =ss.accept();
                        System.out.println("Client is connected");
                        DataInputStream ios=new DataInputStream(s.getInputStream());
                        DataOutputStream dos=new DataOutputStream(s.getOutputStream());

                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        String s1,s2;
                        while(true)
                        {
                                    s1 = (String)ios.readUTF();
                                    if(s1.equals("end") || s1.equals("END"))
                                    {
                                                System.out.println("chatting terminated");
                                                break;
                                    }
                                    System.out.println("Client "+s1);
                                    System.out.println("Server ...");
                                    s2 = br.readLine();
                                    dos.writeUTF(s2);
                                    if(s2.equals("end") || s2.equals("END"))
                                    {
                                                System.out.println("chatting terminated");
                                                break;
                                    }          
                        }
            }
}
/*client_Slip6_2*/


import java.io.*;
import java.net.*;

class Client_Slip6_2
{
            public static void main(String a[]) throws Exception
            {
                        Socket s = new Socket("localhost",1000);
                        System.out.println("client is connected : ");
                        DataInputStream ios=new DataInputStream(s.getInputStream());
                        DataOutputStream dos=new DataOutputStream(s.getOutputStream());

                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        String s1,s2;
                        while(true)
                        {
                                    System.out.println("Server ....");
                                    s1=br.readLine();
                                    dos.writeUTF(s1);
                                    s2=(String)ios.readUTF();
                                    if(s2.equals("end") || s2.equals("END"))
                                    {
                                                System.out.println("chatting terminated");
                                                break;
                                    }
                                    System.out.println("Client "+s2);
                        }
            }
}