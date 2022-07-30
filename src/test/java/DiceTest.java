
import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void diceTest1() {
        //Given
        Dice dice = new Dice(1);
        //When
        Integer toss = dice.tossAndSum();
        //Then
        System.out.println(toss);
    }
    @Test
    public void diceTest2() {
        //Given
        Dice dice = new Dice(2);
        //When
        Integer toss = dice.tossAndSum();
        //Then
        System.out.println(toss);
    }
    @Test
    public void diceTest3() {
        //Given
        Dice dice = new Dice(3);
        //When
        Integer toss = dice.tossAndSum();
        //Then
        System.out.println(toss);
    }
    @Test
    public void diceTest4() {
        //Given
        Dice dice = new Dice(4);
        //When
        Integer toss = dice.tossAndSum();
        //Then
        System.out.println(toss);
    }
}
