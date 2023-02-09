package modelos;

/**
 *
 * @author Thaly
 */

public class Generica <T> {
    private T val;
    
    
    public Generica()
    {
        
    }
    public void setVal(T v)
    {
        this.val=v;
    }
    
    public T getVal()
    {
        return this.val;
    }
}
