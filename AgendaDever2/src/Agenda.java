import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Agenda{
    
    public static void main(String[] args){
        List<Info> contatos = new ArrayList<>();
        int opcao = 0;
        Scanner ler = new Scanner(System.in);



        do {
            System.out.println("****************************************************");
            System.out.println("\n --------------Agenda de Contato------------------");
            System.out.println("\n1 - cadastrar um contato ");
            System.out.println("\n2 - remover um contato cadastrado");
            System.out.println("\n3 - listar os contatos cadastrados");
            System.out.println("\n0 - para encerrar a aplicação");
            System.out.println("****************************************************");
            opcao = ler.nextInt();
            ler.nextLine();

            switch(opcao){
            
            case 1:
            int num; 
            do{
                
                System.out.println("Digite o número do contato ou -2 para encerrar: ");
                num = ler.nextInt();
                ler.nextLine();
                if (num != -2){
                    System.out.println("\n Digite o nome do contato que quer registrar");
                    String nomeContato = ler.nextLine();
                    contatos.add(new Info(num, nomeContato));
                }
             }while (num !=-2);  
             break;
             case 2:
             System.out.println("\n Digite o contato que deseja remover que deseja remover");
             String removerContato = ler.nextLine(); 
             contatos.removeIf(p -> p.getNome().equalsIgnoreCase(removerContato));
             break;

             case 3:
                
                    
                    System.out.println("\nContatos registrados:");
                    for(Info info : contatos){
                        System.out.println("->" + info);

                    
                    }
                break;

             case 0:
             System.out.println("\nEncerrando o programa");
             return;

             default:
             System.out.println("Opcão inválida");
             }                         
        }while(opcao!=-1);
        ler.close();
    }
}
