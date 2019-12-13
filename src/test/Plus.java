package test;

public class Plus extends BinaryExpression{

	public Plus(Expression l, Expression r) {
		super(l, r);
		
	}

	
	@Override
	public double calculate() {
		return left.calculate()+right.calculate();
	}

}
