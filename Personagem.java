public class Personagem {
    //variáveis de instância 
    //instância é sinônimo de objeto
    String nome;
    int energia;
    int fome;
    int sono;
    //tipo de retorno = void
    //nome = caçar
    //lista de parâmetros = ()
    //corpo = {}
    void cacar(){
        if (energia >= 2){
            energia = energia - 2; //energia -= 2;
            System.out.println(nome + " Caçando ");
        }
        else{
            System.out.println(nome + " sem energia pra caçar ");
        }
        fome = Math.min(fome + 1, 10);
        sono = sono + 1 > 10 ? 10 : sono + 1;
    }
    void comer(){
        if (fome >= 1){
            System.out.printf("%s Comendo\n", nome);
            --fome;
            energia = Math.min(energia + 1, 10);
        }
        else{
            System.out.println(nome + " sem fome ");
        }

    }
    void dormir(){
        if (sono >= 1){
            System.out.print(nome + " Dormindo \n");
            sono --;
            energia = energia + 1 <= 10 ? energia + 1 : 10;
        }
        else 
        System.out.println(nome + " sem sono ");
    }

    void exibirEstado(){
        System.out.printf(
            "%s: e: %d, f: %d, s: %d\n"
        );
    }
    
}
