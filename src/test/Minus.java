package test;

public class Minus extends BinaryExpression{

	public Minus(Expression l, Expression r) {
		super(l, r);
		
	}

	@Override
	public double calculate() {
		return left.calculate()-right.calculate();
	}

}
