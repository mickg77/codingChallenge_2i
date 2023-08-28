import org.example.SumFinder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class SumFinderTest {

    //three test cases used to run the program
    @Test
    public void setTest1() {
        SumFinder test1 = new SumFinder();
        int[] testArray1 = {3,4,5,6};
        test1.pairs(1,testArray1);
        Assertions.assertEquals(test1.pairs(1,testArray1),0); //test is a success but logic is flawed

    }

    @Test
    public void setTest2() {
        SumFinder test1 = new SumFinder();
        int[] testArray2 = {0,15,32,2000,15000};
        test1.pairs(15,testArray2);
        Assertions.assertEquals(test1.pairs(1,testArray2),1); //test failed due to logical error in algorithm

    }


    @Test
    public void setTest3() {
        SumFinder test1 = new SumFinder();
        int[] testArray3 = {0,15,32,2000,15000};
        test1.pairs(15,testArray3);
        Assertions.assertEquals(test1.pairs(1,testArray3),2); //test failed due to logical error in algorithm

    }

    @Test
    public void setTest4() {
        SumFinder test1 = new SumFinder();
        int[] testArray4 = {0,0,0,0};
        test1.pairs(10000000,testArray4);
        Assertions.assertEquals(test1.pairs(23,testArray4),0); //test is a success but logic is flawed

    }







}
