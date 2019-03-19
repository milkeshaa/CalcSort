import java.util.Scanner;

public class CalcSort {
    private double[] array;
    private int size;
    private double[] helpArray = new double[50];
    public CalcSort (int size)
    {
        this.size = size;
        this.array = new double[size];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Initialize array");
        for (int i = 0; i < this.size; i++) {
            this.array[i] = scanner.nextDouble();
        }
        for (int i = 0; i < 50; i++) {
            this.helpArray[i] = 0;
        }
        this.sort();
    }

    private void sort()
    {
        for (int i = 0; i < this.size; i++) {
            this.helpArray[(int)(this.array[i])]++;
        }
        int buffer = 0;
        for (int j = 0; j < 50; j++) {
            for (int i = 0; i < this.helpArray[j]; i++) {
                this.array[buffer] = j;
                buffer++;
            }
        }
    }

    public void showResult ()
    {
        for (int i = 0; i < this.size; i++) {
            System.out.print(this.array[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of an array");
        CalcSort Sort = new CalcSort(sc.nextInt());
        Sort.showResult();
    }
}
