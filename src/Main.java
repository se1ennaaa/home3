public class Main {
    public static void main(String[] args) {
        double nur [] ={3,23,5,78,-90,12,34,7,56,2,-89,54,67,4,12,-23};
        double gas = 0;
        int reah =0 ;
        boolean bool = false;
        for (double f : nur){
            if (f<0) {
                bool = true;

            } else if (bool) {
                reah++;
                gas = gas+f;

            }

        }
        System.out.println(gas/reah);
        }
    }
