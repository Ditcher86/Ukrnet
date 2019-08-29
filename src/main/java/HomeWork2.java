import java.util.Arrays;

public class HomeWork2 {

    public static int summ (int [] numbers){
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
/** Решил сделать без ввода доп массива, если надо, могу и с ним */
    public static void sorting(int [] arrayForSort)
    {
        int count = 0;
        for(int num : arrayForSort){
            if (num % 2 == 0){
                count += 1;
            }
        }

        int[] sortedArray = new int[arrayForSort.length];

        for (int i = 0, countOdd = 0; i < arrayForSort.length; i++){
            if (arrayForSort[i] % 2 == 0){
                sortedArray[countOdd] = arrayForSort[i];
                countOdd++;
            }
            else {
                sortedArray[count] = arrayForSort[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(sortedArray));
    }

    public static void main(String[] args)
    {
        int [] numbers = {1, 34, 2, 12, 3, 5, 0, -4, -7};
        System.out.println(summ(numbers));

        int [] arrayForSort = {1, 34, 2, 12, 3, 5, 0, -4, -7, 7, 6};
        sorting(arrayForSort);
    }

}
