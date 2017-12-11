package com.company;

enum SORT_DIRECTION {ASC, DESC}

public class Main {

    public static void main(String[] args) {

        int[] array = {3, 2, 6, 0};
        bubbleSort(array, SORT_DIRECTION.ASC);

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }
    }

    public static void bubbleSort(int[] array, SORT_DIRECTION sortDirection) {
        for (int i = array.length - 1; i >= 1; i--) {

            for (int j = 0; j <= i - 1; j++) {

                if (sortDirection.equals(sortDirection.ASC)) {
                    if (array[j] > array[j + 1]) {
                        int swap = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = swap;

                    }
                }
                else {
                    if (array[j] < array[j + 1]) {
                        int swap = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = swap;

                    }


                }
            }
        }


    }


  /*  int [][] matrixArray = {{1,2,3,4,5}, {3,5,6,9,8}};
    public static void matrix(int[][] matrixArray){
        for (int i = 0; i<matrixArray.length;i++){

        }



    }


    	/*Human human = new Human();
    human.doMove();
	human.doSleep();
	Dog dog = new Dog();
	dog.doSleep();
	dog.doMove(); */
}
