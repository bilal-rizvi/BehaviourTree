// ******************************************************* 
//                   MACHINE GENERATED CODE                
//                       DO NOT MODIFY                     
//                                                         
// Generated on 10/10/2016 14:06:30
// ******************************************************* 
package bts.action;

/** ModelAction class created from MMPM action WalkforLong. */
public class WalkforLong extends jbt.model.task.leaf.action.ModelAction {

	/** Constructor. Constructs an instance of WalkforLong. */
	public WalkforLong(jbt.model.core.ModelTask guard) {
		super(guard);
	}

	/**
	 * Returns a bts.action.execution.WalkforLong task that is able to run this
	 * task.
	 */
	public jbt.execution.core.ExecutionTask createExecutor(
			jbt.execution.core.BTExecutor executor,
			jbt.execution.core.ExecutionTask parent) {
		return new bts.action.execution.WalkforLong(this, executor, parent);
	}
}