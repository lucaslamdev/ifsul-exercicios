
package heranca;

/**
 *
 * @author lucas
 */
public class VIP extends Ingresso{
    float adicional;
    
    public VIP(){
        this.adicional = 0.0F;
    }
    
    public float retornarValor(){
        float valorTotal = this.valor + this.adicional;
        return valorTotal;
    }
}