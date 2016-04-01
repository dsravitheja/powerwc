import java.io.*;  
    import java.net.*; 
    public class cli {
    public static void main(String[] args) {  

    try{      

    Socket soc=new Socket("192.168.43.46",2004);  
    BufferedOutputStream dout=new BufferedOutputStream(soc.getOutputStream());
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	OutputStreamWriter osw = new OutputStreamWriter(dout, "US-ASCII");
   // String s = br.readLine();
   int i = Integer.parseInt(br.readLine());
    osw.write(i);
    osw.flush();
    osw.close();  
    soc.close();
    }catch(Exception e){
        e.printStackTrace();}  
    }
}
