
package heranca;

/**
 *
 * @author lucas
 */
public class Normal extends Ingresso{
    String localizacao;
    
    public Normal(){
        this.localizacao = "Localização Não Informada!";
    }
    
    public void imprimeNormal() {
        this.imprimeValor();
        System.out.println("A localização é " + this.localizacao);  
    }
    
}
