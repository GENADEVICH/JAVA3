package ru;
class StaticBlock {

    static double rootOF9;
    static double rootOF27;
    int number;

    static {
        System.out.println("Инициализация статических членов класса...");
        rootOF9 = Math.sqrt(9.0);
        rootOF27 = Math.sqrt(27.0);
    }

    StaticBlock(int number) {
        System.out.println("Инициализация переменных экземпляров класса...");
        this.number = number;
    }
}


    public class StaticBlockDemo {
        public static void main(String[] args) {
            System.out.println("Корень из 9 pавен "  + StaticBlock.rootOF9) ;
            System.out.println("Корень из 27 pавен "  + StaticBlock.rootOF27) ;

            StaticBlock sb1 = new StaticBlock(4) ;
            System.out.println("sb1.number = " + sb1.number) ;

            StaticBlock sb2 = new StaticBlock(16);
            System.out.println("sb2.number = " + sb2.number);
        }
    }
