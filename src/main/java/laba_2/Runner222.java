package laba_2;

import java.util.Scanner;
import java.util.Random;

public class Runner222 {


        private static final int MAX_SIZE = 20;
        private static final int RANDOM_MIN = 1;
        private static final int RANDOM_MAX = 100;

        private final int[][] matrix;
        private final int width;
        private final int height;

        public Runner222 (int width, int height) {
            this.width = width;
            this.height = height;
            this.matrix = new int[height][width];
        }

        // Метод для введення матриці з клавіатури
        public void inputMatrixFromKeyboard(Scanner scanner) {
            System.out.println("Enter the elements of the matrix:");
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
        }

        // Метод для генерації випадкової матриці
        public void generateRandomMatrix() {
            Random random = new Random();
            System.out.println("Randomly generated matrix:");
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    matrix[i][j] = random.nextInt(RANDOM_MAX - RANDOM_MIN + 1) + RANDOM_MIN;
                }
            }
        }

        // Метод для пошуку мінімального елементу в матриці
        public int findMinimum() {
            int min = matrix[0][0];
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if (matrix[i][j] < min) {
                        min = matrix[i][j];
                    }
                }
            }
            return min;
        }

        // Метод для пошуку максимального елементу в матриці
        public int findMaximum() {
            int max = matrix[0][0];
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if (matrix[i][j] > max) {
                        max = matrix[i][j];
                    }
                }
            }
            return max;
        }

        // Метод для обчислення середнього арифметичного елементів матриці
        public double calculateAverage() {
            double sum = 0;
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    sum += matrix[i][j];
                }
            }
            return sum / (width * height);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Введення розмірів матриці
            System.out.println("Enter the width of the matrix (not more than " + MAX_SIZE + "):");
            int width = scanner.nextInt();
            System.out.println("Enter the height of the matrix (not more than " + MAX_SIZE + "):");
            int height = scanner.nextInt();

            // Перевірка на максимальний розмір
            if (width > MAX_SIZE || height > MAX_SIZE) {
                System.out.println("Matrix size exceeds the maximum allowed size.");
                return;
            }

            Runner222 matrixOperations = new Runner222 (width, height);

            // Вибір методу введення матриці
            System.out.println("Choose how to create the matrix:");
            System.out.println("1. Enter from keyboard");
            System.out.println("2. Generate randomly");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    matrixOperations.inputMatrixFromKeyboard(scanner);
                    break;
                case 2:
                    matrixOperations.generateRandomMatrix();
                    break;
                default:
                    System.out.println("Invalid choice. Exiting program.");
                    return;
            }

            // Виведення матриці
            System.out.println("Matrix:");
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    System.out.print(matrixOperations.matrix[i][j] + "\t");
                }
                System.out.println();
            }

            // Пошук мінімального та максимального елементів
            int min = matrixOperations.findMinimum();
            int max = matrixOperations.findMaximum();
            System.out.println("Minimum element: " + min);
            System.out.println("Maximum element: " + max);

            // Обчислення середнього арифметичного
            double average = matrixOperations.calculateAverage();
            System.out.println("Average: " + average);

            scanner.close();
        }




}
