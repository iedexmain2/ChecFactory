import org.junit.Test;


public class SomeTest {
  @Test
  public void delayTest(){
    try {
        Thread.sleep(30000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
  }
}
