public class main{
//     public static void main(String[] args) {
//         int[] sum = new int[]{2,2,3};
//         int[] sum1 = new int[]{5,4,1};
//         int result = 1;
//         for(int i= 0; i<sum.length; i++){
//             result *= sum[i];
//         }
//           int result1 = 1;
//         for(int i= 0; i<sum1.length; i++){
//             result1 *= sum1[i];
//         }

//         if(result > result1){
//             System.out.println(result - result1);
//         }else{
//             System.out.println(result1 - result);
//         }


//         Game game = new Game();
//         System.out.println(game.combat(10, 14));


//         RentCar rentCar = new RentCar();
//         System.out.println(rentCar.rentalCarCost(3));

//         Quarter quarter = new Quarter();
//         System.out.println(quarter.quarterOf(10));
//     }
// }

class CuboidVolumes{

    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid){
        int result1 = 1;
        int result2 = 1;
        for(int i= 0; i<firstCuboid.length; i++){
            result1 *= firstCuboid[i];
        }
        for(int i= 0; i<secondCuboid.length; i++){
            result2 *= secondCuboid[i];
        }

        if(result1 > result2){
           return result1 - result2;
        }else{
            return result2 - result1;
        }
    }
}

class Game {
  
  public static int combat(int health, int damage) {
    int result = health - damage;
    if(result <= 0){
        return 0;
    }else{
        return result;
    }
  }
}

class RentCar{
    public static int rentalCarCost(int d) {
    int result = 0;
    if(d >= 7){
        return (d * 40)-50;
    }else if(d >= 3 )
        return (d * 40)-20;
        else{
            return d * 40;
        }
  }
}

class Count{
    public static int[] countPositivesSumNegatives(int[] input)
    {

        return null; 
    }
}

class Quarter{
    public static int quarterOf(int month) {
        if(month >=1 && month <= 3){
            return 1;
        }else if(month >=4 && month <= 6){
            return 2;
        }else if (month >=7 && month <=9){
            return 3;
        }else if (month >=10 && month <= 12){
            return 4;
        }else{
            return 0;
        }
    }
}

class MaxAndMin{
     public static String highAndLow(String numbers) {

    return "throw towel";
  }
}