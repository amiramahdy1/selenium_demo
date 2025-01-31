package rigsterTest;
import pages.Registerion;
import  org.testng.annotations.Test;

public class RigsterTest {
    final Registerion registerion = new Registerion();
    @Test
    public  void RegisterionSucessfully (){


        registerion.Rigster();

    }


}
