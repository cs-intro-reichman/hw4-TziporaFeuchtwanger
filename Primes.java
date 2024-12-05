public class Primes {
    public static void main(String[] args) {

        final int N = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean [N +1];
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= N; i++) {
          isPrime[i] = true;
         }

        for (int i = 2; i < isPrime.length; i++) {
          for (int j = 2; j < i ; j++) {
              if ((i % j == 0)){
                  isPrime[i] = false;
              }
         }
        }
        int count = 0;
        for (int i = 0; i <= N; i++) {
            if (isPrime[i] == true) {
                count ++;   
            }
            //System.out.println("Index " + i + ": " + isPrime[i]);
        }
        int T = Integer.parseInt(args[0]);
        double average = (double) (count * 100) / T;
        System.out.println("There are " + count + " primes between 2 and " + T + " (" + (int)average + "% are primes)");
    }
}