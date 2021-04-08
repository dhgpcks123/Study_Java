package Lambda;

import java.util.function.Function;

public interface UnaryOperator<T> extends Function<T, T> {
	static <T> UnaryOperator<T> identity(){
		return t -> t;
		//UnaryOperator<T>
		//BinaryOperator<T>
	}
}
