public class _03_varArgs {
    static void show(int a){
        System.out.println("Integer Method !!!   "+ a);
        System.out.println();
    }

    static void show(char ch){
        System.out.println("Character Method !!!   "+ ch);
        System.out.println();
    }
    
    static void show(float f){
        System.out.println("Float Method !!!   "+ f);
        System.out.println();
    }

    static void show(int ... a){
        System.out.println("Variable Arguments(var args) for Int Method !!!");
        System.out.println();
    }

    static void show(String ... a){
        System.out.println("Variable Arguments(var args) for String Method !!!");
        System.out.println();
    }

    public static void main(String[] args) {
        show('a');
        show(67);
        show(67, 34, 56);
        show(56.847f);
        show("Hello Boys");
        show("Hello Boys", "How are you");
    }
    
}
