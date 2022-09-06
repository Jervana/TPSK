public class Arr {
    public void arr (int N){
        Dobutok dobutok = new Dobutok();
        Sum_Min sum_min = new Sum_Min();

        int[] array = new int[10];

        System.out.println("---------------\nМасив з 10 рандомних чисел\nв діапазоні від -100 до 100\n---------------");
        for ( int i = 0; i < N; i++){
            array[i] = (int) (Math.random() * (200 + 1)) -100;
            System.out.println(array[i]);
        }

        System.out.println("---------------\nВід'ємні числа\n---------------");

        int min = array[0];
        for(int i = 0; i < array.length; i++) {
            if (array[i]< min) {
                min = array[i];
            }
        }

        int answer = 1;
        int mmin = 0;
        int qwe = 0;
        for (int j = 0; j < array.length; j++){
            if (array[j] < 0){
                System.out.println(array[j]);
                answer = dobutok.dob( answer , array[j]);
            }
            if (array[j] == min){
                for (int q = j+1; q < array.length; q++){
                    mmin = sum_min.sum_min( mmin , array[q] );
                }
            }
        }
        System.out.println("---------------\nМінімальне = "+min);
        System.out.println("---------------\nДобуток усіх від'ємних чисел з масиву = "+answer);
        System.out.println("---------------\nСума чисел які йдуть після мінімального = "+mmin);
    }
}
