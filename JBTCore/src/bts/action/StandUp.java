// ******************************************************* 
//                   MACHINE GENERATED CODE                
//                       DO NOT MODIFY                     
//                                                         
// Generated on 10/10/2016 14:06:30
// ******************************************************* 
package bts.action;

/** ModelAction class created from MMPM action StandUp. */
public class StandUp extends jbt.model.task.leaf.action.ModelAction {

	/** Constructor. Constructs an instance of StandUp. */
	public StandUp(jbt.model.core.ModelTask guard) {
		super(guard);
	}

	/**
	 * Returns a bts.action.execution.StandUp task that is able to run this
	 * task.
	 */
	public jbt.execution.core.ExecutionTask createExecutor(
			jbt.execution.core.BTExecutor executor,
			jbt.execution.core.ExecutionTask parent) {
		return new bts.action.execution.StandUp(this, executor, parent);
	}
}