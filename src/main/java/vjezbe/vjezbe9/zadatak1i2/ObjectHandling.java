package vjezbe.vjezbe9.zadatak1i2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class ObjectHandling {
    private static String filename = "test";

    public static <E> void writeToBinary (String filename, ArrayList<E> elements, boolean append){
        File file = new File (filename);
        ObjectOutputStream out = null;

        try{
            if (!file.exists () || !append) out = new ObjectOutputStream (new FileOutputStream (filename));
            else out = new vjezbe.vjezbe9.zadatak1i2.ObjectHandling.AppendableObjectOutputStream(new FileOutputStream (filename, append));
            for (E element : elements) {
                out.writeObject(element);
            }
            out.flush ();
        }catch (Exception e){
            e.printStackTrace ();
        }finally{
            try{
                if (out != null) out.close ();
            }catch (Exception e){
                e.printStackTrace ();
            }
        }
    }

    public static <E> ArrayList<E> readFromBinaryFile (String filename){
        File file = new File (filename);
        ArrayList<E> lista = new ArrayList<>();

        if (file.exists ()){
            ObjectInputStream ois = null;
            try{
                ois = new ObjectInputStream (new FileInputStream (filename));
                while (true){
                    lista.add((E) ois.readObject());
                }
            }catch (EOFException e){

            }catch (Exception e){
                e.printStackTrace ();
            }finally{
                try{
                    if (ois != null) ois.close();
                }catch (IOException e){
                    e.printStackTrace ();
                }
            }
        }
        return lista;
    }

    private static class AppendableObjectOutputStream extends ObjectOutputStream {
        public AppendableObjectOutputStream(OutputStream out) throws IOException {
            super(out);
        }

        @Override
        protected void writeStreamHeader() throws IOException {}
    }
}
