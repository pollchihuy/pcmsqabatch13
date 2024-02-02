package testng;

import java.util.Random;

import com.juaracoding.testng.Calculator;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCalculator {
	Calculator c;
	Random rand ;

	@BeforeTest
	public void generateData() {
		rand = new Random();
	}
	@Test
	public void testAddNilai() {
		System.out.println("===============================TEST ADD NILAI DIMULAI =========================================");
		int x =rand.nextInt(1,101);
		int y =rand.nextInt(1,103);
		
		AssertJUnit.assertEquals(c.addNilaiManda(x, y),c.addNilaiX(x, y));
		System.out.println("===============================TEST ADD NILAI SELESAI =========================================");
	}
	
	@BeforeMethod
	public void instance()
	{
		System.out.println("OK MASUK KESINI");
		c = new Calculator();
	}
}