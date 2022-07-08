
import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void diceTest() {
        //Given
        Dice dice = new Dice(2);
        //When
        Integer toss = dice.tossAndSum();
        //Then
        System.out.println(toss);
    }
}
