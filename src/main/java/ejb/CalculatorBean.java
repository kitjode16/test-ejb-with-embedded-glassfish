package ejb;

import service.CalculatorService;

import javax.ejb.Stateless;

@Stateless(name = "CalculatorService")
public class CalculatorBean implements CalculatorService {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int substract(int a, int b) {
        return a - b;
    }
}
