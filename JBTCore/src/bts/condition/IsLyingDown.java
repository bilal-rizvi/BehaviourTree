// ******************************************************* 
//                   MACHINE GENERATED CODE                
//                       DO NOT MODIFY                     
//                                                         
// Generated on 10/16/2016 21:41:45
// ******************************************************* 
package bts.condition;

/** ModelCondition class created from MMPM condition IsLyingDown. */
public class IsLyingDown extends jbt.model.task.leaf.condition.ModelCondition {

	/** Constructor. Constructs an instance of IsLyingDown. */
	public IsLyingDown(jbt.model.core.ModelTask guard) {
		super(guard);
	}

	/**
	 * Returns a bts.condition.execution.IsLyingDown task that is able to run
	 * this task.
	 */
	public jbt.execution.core.ExecutionTask createExecutor(
			jbt.execution.core.BTExecutor executor,
			jbt.execution.core.ExecutionTask parent) {
		return new bts.condition.execution.IsLyingDown(this, executor, parent);
	}
}