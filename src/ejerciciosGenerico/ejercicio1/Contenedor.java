package ejerciciosGenerico.ejercicio1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Contenedor <T extends Serializable,U extends Serializable> {
    
    private T[] elementos;
    private U identificador;

    public Contenedor(T[] elementos, U identificador){
        this.elementos = elementos;
        this.identificador = identificador;        
    }

    public byte[] serializar() throws IOException{
        
        ByteArrayOutputStream bs= new ByteArrayOutputStream();
        ObjectOutputStream os = new ObjectOutputStream (bs);
        os.writeObject(elementos); 
        os.writeObject(identificador);
        os.close();
        
        byte[] bytes =  bs.toByteArray(); 
        return bytes;
    }

}
