package pl.jakubmarjankowski.codewars.snail;

public class Snail {
    public static int[] snail(int[][] array) {
        //if(array.length == 0){
            //return  new arr[];
       // }
        int [][] mistakeArray = {{}};
        int [] smallMistakeArray = {};
        if(mistakeArray == array){
            System.out.println("dwj");
            return smallMistakeArray;
        }


        int count = 0;
        int maxIndex = array.length ;
        int minIndex = 0;
        int tab[] = new int[array.length * array.length ];
        int x = 0;
        int y = 0;
        while (count < array.length * array.length )  {
System.out.println("max index = " + maxIndex + " y " + y);
            while (y < maxIndex) {
                System.out.println("zapetla y < maxindex");
                if (count < array.length * array.length ) {
                    System.out.println(x + "\t" + y + "\t" + array[x][y]) ;
                    tab[count] = array[x][y];
                    count++;
                        y++;
                }else{
                    break;
                }
            }
            y--;
            x++;


            while (x < maxIndex) {
                System.out.println("zapetla x < maxindex plus count = " + count);
                if(count < array.length * array.length ){
                    System.out.println(maxIndex + " " + count + "\t" + x + "\t" + y);

                    System.out.println("count= " + count);
                    System.out.println(x + "\t" + y + "\t" + array[x][y]);
                tab[count] = array[x][y];
                    count++;
                    x++;

            }else{
                    break;
                }
            }
            x--;
           y--;
            maxIndex--;
            while (y > minIndex) {
                System.out.println("zapetla y < minindex");
                if(count < array.length * array.length  ){

                    System.out.println(x + "\t" + y + "\t" + array[x][y]);
                    tab[count] = array[x][y];
                    y--;

                    count++;



            }else{
                    break;
                }
            }

            while (x > minIndex + 1) {
                System.out.println("zapetla x < minindex");
                if(count < array.length * array.length  ) {

                    System.out.println(minIndex + " " + count + " " + x + " " + y);
                    System.out.println(x + "\t" + y + "\t" + array[x][y]);
                    tab[count] = array[x][y];
                    x--;
                    count++;

                    //x--;

                }else{
                    break;
                }
            }
            System.out.println("zapetla poza whilem wenwetrznym");
            //minIndex++;



        }
        return tab;
    }

        public static void main (String[]args){
            int[][] array
                    = {{1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14,15,16}};
            int[][] arraySmall
                    = {{1, 2},
                    {4, 3}};
            int[][] arrayBig = {
                    {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                    {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                    {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
                    {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
                    {41, 42, 43, 44, 45, 46, 47, 48, 49, 50},
                    {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
                    {61, 62, 63, 64, 65, 66, 67, 68, 69, 70},
                    {71, 72, 73, 74, 75, 76, 77, 78, 79, 80},
                    {81, 82, 83, 84, 85, 86, 87, 88, 89, 90},
                    {91, 92, 93, 94, 95, 96, 97, 98, 99, 100}};
            int[][] arrayVerySmall = {{}};

            int simpleArray[] = Snail.snail(arrayVerySmall);
            for(Integer i: simpleArray){
                System.out.println(i);
            }
        }
    }
