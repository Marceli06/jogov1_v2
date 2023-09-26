public class JogoV1 {
    public static void main(String[] args) { 
        //1. construir um objeto personagem
        var p = new Personagem();
        //2. dar um nome para ele
        p.nome = "Giovanna";
        p.energia = 10;
        p.fome = 0;
        p.sono = 0;
        //3. fazer ele caçar
        p.cacar();
        //4. fazer ele comer
        p.comer();
        //5. faezr ele dormir
        p.dormir();

        int a = 2;
        //a++;
        //++a;
        System.out.println(a++);
        System.out.println(++a);
    }
}
