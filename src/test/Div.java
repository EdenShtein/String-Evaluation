package test;

public class Div extends BinaryExpression{

	public Div(Expression l, Expression r) {
		super(l, r);
		
	}

	@Override
	public double calculate() {
		return left.calculate()/right.calculate();
	}

}
