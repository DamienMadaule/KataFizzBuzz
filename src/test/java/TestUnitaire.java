import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUnitaire {
    //teste si le nombre est not divisible par 3 ou 5
    @Test
    public void should_print_number_if_not_divide_by_3_and_5(){
        Assertions.assertEquals(3, FizzBuzz.SayFizzBuzz(3));
    }
    @Test
    public void should_print_fizzbuzz_if_divide_by_3_and_5(int number){

    }

}
