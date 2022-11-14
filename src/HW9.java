public class HW9 {

    public static void main(String[] args) {
        System.out.println("Массивы, часть 2");
        double totalMonth = 0;
        int sumMax = -1;
        int sumMin = arr[0];
        for (int i = 0; i < arr.length; i++) {
            totalMonth += arr[i];
            if (sumMax < arr[i]) {
                sumMax = arr[i];
            }
            if (sumMin > arr[i]) {
                sumMin = arr[i];
            }
        }
        double sumAverage = totalMonth / arr.length;
        String formattedTotalMonth = String.format("%.0f", totalMonth);
        String formattedSumAverage = String.format("%.2f", sumAverage);
        System.out.println("МЗадание 1");
        System.out.println("Сумма трат за месяц составила " + formattedTotalMonth + " рублей");
        System.out.println("МЗадание 2");
        System.out.println("Минимальная сумма трат за день составила " + sumMin + " рублей. Максимальная сумма трат за день составила" + sumMax + "рублей");
        System.out.println("МЗадание 3");
        System.out.println("Средняя сумма трат в день составила " + formattedSumAverage + " рублей");

        System.out.println("МЗадание 4");
        char [] reverseFullName = {'n','a','v','I',' ','v','o','n','a','v','I'};
        int f = reverseFullName.length;
        while (f > 0){
            f--;
            System.out.print(reverseFullName[f]);
        }
    }



    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray () {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            System.out.println(arr[i]);
        }
        return arr;
    }
}
