package ejb;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import service.CalculatorService;

import javax.ejb.embeddable.EJBContainer;

public class CalculatorBeanTest {

    private static EJBContainer container;

    @BeforeClass
    public static void initializeContainer() {
        container = EJBContainer.createEJBContainer();
    }

    @Test
    public void testAdd() throws Throwable {
        CalculatorService service = (CalculatorService) container.getContext().lookup("java:global/classes/CalculatorService");
        Assert.assertEquals(3, service.add(1, 2));
    }

    @Test
    public void testSubstract() throws Throwable {
        CalculatorService service = (CalculatorService) container.getContext().lookup("java:global/classes/CalculatorService");
        Assert.assertEquals(2, service.substract(5, 3));
    }

    @AfterClass
    public static void tearDownContainer() {
        container.close();
    }

}
