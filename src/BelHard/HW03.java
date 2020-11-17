package BelHard;

public class HW03 {
    public static void main(String[] args) {

        int month = 10;

        if (month == 1 || month == 2 || month == 12) {
            System.out.println("Зима");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Весна");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Лето");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Осень");
        } else {
            System.out.println("Посмотри календарь Майя");
        }

        String timeOfYear = "Наша пора года сейчас: ";
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println(timeOfYear + "Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(timeOfYear + "Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(timeOfYear + "Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(timeOfYear + "Осень");
                break;
            default:
                System.out.println(timeOfYear + "ХЗ");
        }


        int[] array = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89};

        for (int i = 9; i < array.length; i--) {
            System.out.print(array[i] + " ");
        }

        int [][] squareArray;

        squareArray = new int [3][3];

        squareArray [0][0] = 11;
        squareArray [0][1] = 12;
        squareArray [0][2] = 13;
        squareArray [1][0] = 14;
        squareArray [1][1] = 15;
        squareArray [1][2] = 16;

        for (int i2 = 0; i2 > squareArray.length; i2++) {
            System.out.print(squareArray[i2] + " ");
        }
        }


    }