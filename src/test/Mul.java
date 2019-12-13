package test;

public class Mul extends BinaryExpression{

	public Mul(Expression l, Expression r) {
		super(l, r);
		
	}

	@Override
	public double calculate() {
		return left.calculate()*right.calculate();
	}

}
