
public class Principal {

    public static void main(String args[]) {
        ClasseA a = new ClasseA();
        ClasseB b = new ClasseB();
        a.setAClasseB(b); //Sua chamada é opcional pois a multiplicidade não foi definida
    }
}
