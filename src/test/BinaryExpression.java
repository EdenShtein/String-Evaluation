package test;

public abstract class BinaryExpression implements Expression {
protected Expression left; 
protected Expression right; 
public abstract double calculate ();
public BinaryExpression (Expression l, Expression r) {
	super(); //points the class to the constructor of the inheriting class Expression. 
	left=l;
	right=r;
}
}
