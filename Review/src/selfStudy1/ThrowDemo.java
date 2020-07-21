package selfStudy1;

import java.util.NoSuchElementException;

class ThrowDemo{
    static void demoproc(){
        try{
            throw new NoSuchElementException("demo");
        }catch(NoSuchElementException e){
            System.out.println("Caught inside demoproc.");
            throw e; //istisnayi yeniden firlat
        }
    }
     
    public static void main(String[] args){
        try{
            demoproc();
        }catch(NoSuchElementException e){
            System.out.println("Recaught: "+e);
            e.getMessage();
        }
    }
}
