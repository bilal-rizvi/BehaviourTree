// ******************************************************* 
//                   MACHINE GENERATED CODE                
//                       DO NOT MODIFY                     
//                                                         
// Generated on 10/16/2016 21:41:45
// ******************************************************* 
package bts.condition;

/** ModelCondition class created from MMPM condition IsHealthy. */
public class IsHealthy extends jbt.model.task.leaf.condition.ModelCondition {

	/** Constructor. Constructs an instance of IsHealthy. */
	public IsHealthy(jbt.model.core.ModelTask guard) {
		super(guard);
	}

	/**
	 * Returns a bts.condition.execution.IsHealthy task that is able to run this
	 * task.
	 */
	public jbt.execution.core.ExecutionTask createExecutor(
			jbt.execution.core.BTExecutor executor,
			jbt.execution.core.ExecutionTask parent) {
		return new bts.condition.execution.IsHealthy(this, executor, parent);
	}
}