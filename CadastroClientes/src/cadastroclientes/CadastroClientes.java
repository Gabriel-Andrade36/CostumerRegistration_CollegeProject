
package cadastroclientes;

public class CadastroClientes {

   
   public static void main(String[] args) {
   
       
       
       
       
   
    CadastroUI form = new CadastroUI();   // local onde fica o cadastro
   Pessoa pessoa = new Pessoa(form.name,form.CPF,form.City,form.State,form.Address);    //local onde as informações cadastradas são salvas    
    
   LoginUI.main(args);

   
    }


}
