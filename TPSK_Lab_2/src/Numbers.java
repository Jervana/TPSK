public class Numbers {
    public int sum (int N){
        float count = 0;
        int rez = 0;

        int[] array = new int[10];

        for (int i = 0; i < N; i++){
            array[i] = i;

            if (i % 2 == 0){}
            else {
                count ++;
                rez += array[i];
                System.out.println("Парне по індексу = " + array[i]);
            }
        }
        float a = rez / count;
        System.out.println(a);
        return (int) a;
    }
}
