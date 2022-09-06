public class Program {
    public static void main (String[] args) {
        /*Написати підпрограму, яка обчислює середнє арифметичне елементів одновимірного
        масиву із n елементів цілого типу з парними індексами*/
        Numbers numbers = new Numbers();
        int r = numbers.sum( 10 );
        System.out.println(r);
    }
}