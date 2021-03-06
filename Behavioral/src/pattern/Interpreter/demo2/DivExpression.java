/**
 * 
 */
package pattern.Interpreter.demo2;

/**
 * 除法表达式
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-11
 */
public class DivExpression extends TwoArgsExpression {

	public DivExpression(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public double interpret() {
		return getLeft().interpret() / getRight().interpret();
	}
	
	@Override
	protected Operator getOperator() {
		return Operator.DIV;
	}
}
