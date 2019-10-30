package algorithms;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class PlusMinus {

    static void plusMinus(int[] arr) {
        AtomicLong posCount = new AtomicLong();
        AtomicLong negCount = new AtomicLong();
        AtomicLong zeroCount = new AtomicLong();

        Arrays.stream(arr).forEach(element->{
            if(element==0) zeroCount.getAndIncrement();
            else if(element<0) negCount.getAndIncrement();
            else if(element>0) posCount.getAndIncrement();
        });


        System.out.println(Double.valueOf(posCount.get())/arr.length);
        System.out.println(negCount.get()/arr.length);
        System.out.println(zeroCount.get()/arr.length);

    }
}
