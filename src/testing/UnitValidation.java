package testing;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import classes.GeneralTest;

public class UnitValidation {
GeneralTest gt;
@Before
public void init()
{
gt=new GeneralTest();	
}
@Test
public void testDiv()
{
Assert.assertEquals(true, gt.testB(0));

}
@Test
public void soustractionTest()
{
Assert.assertEquals(true, gt.difference(6, 14));	
}
@Test
public void testChaine()
{
	Assert.assertEquals(true, gt.verifChaine(""));

}
}
