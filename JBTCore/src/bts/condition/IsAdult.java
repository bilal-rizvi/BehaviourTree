// ******************************************************* 
//                   MACHINE GENERATED CODE                
//                       DO NOT MODIFY                     
//                                                         
// Generated on 10/10/2016 14:06:30
// ******************************************************* 
package bts.condition;

/** ModelCondition class created from MMPM condition IsAdult. */
public class IsAdult extends jbt.model.task.leaf.condition.ModelCondition {

	/** Constructor. Constructs an instance of IsAdult. */
	public IsAdult(jbt.model.core.ModelTask guard) {
		super(guard);
	}

	/**
	 * Returns a bts.condition.execution.IsAdult task that is able to run this
	 * task.
	 */
	public jbt.execution.core.ExecutionTask createExecutor(
			jbt.execution.core.BTExecutor executor,
			jbt.execution.core.ExecutionTask parent) {
		return new bts.condition.execution.IsAdult(this, executor, parent);
	}
}