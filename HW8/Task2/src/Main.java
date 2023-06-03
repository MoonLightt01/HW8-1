import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут
        double[] weight = new double[10];
        int summ = 0;
        int peopleCount = 0;

        for (int i = 0; i < weight.length; i++) {
            Random random = new Random();
            int num = 40 + random.nextInt(101) - 40;
            weight[i] = num;
            summ += weight[i];
            if (weight[i] >= 60 && weight[i] <= 80) {
                peopleCount++;
            }
        }


        System.out.println("Средний вес: " + summ / weight.length);
        System.out.println("Людей с весов (60-80):  " + peopleCount);


    }
}
