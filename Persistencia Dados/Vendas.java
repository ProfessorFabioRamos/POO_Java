import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Venda {
    public void processarVenda(){
        String cliente = "Jose Silva";
        float venda = 500.23f;
        boolean entregaGratis = false;

        System.out.println("Iniciando o salvamento de dados...");

        // TXT com modo append e histórico
        try(FileWriter fw = new FileWriter("historico_vendas.txt",true);
            PrintWriter out = new PrintWriter(fw)){
            out.println("Cliente: "+cliente+" | Venda: "+venda+" | Entrega Gratis:"+entregaGratis);
            System.out.println("Arquivo txt atualizado com sucesso!");
        }catch(IOException e){
            System.out.println("Erro ao salvar txt: "+e.getMessage());
        }
    }
}
