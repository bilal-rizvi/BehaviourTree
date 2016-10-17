// ******************************************************* 
//                   MACHINE GENERATED CODE                
//                       DO NOT MODIFY                     
//                                                         
// Generated on 10/16/2016 21:41:45
// ******************************************************* 
package bts.action;

/** ModelAction class created from MMPM action RunForFiveMin. */
public class RunForFiveMin extends jbt.model.task.leaf.action.ModelAction {

	/** Constructor. Constructs an instance of RunForFiveMin. */
	public RunForFiveMin(jbt.model.core.ModelTask guard) {
		super(guard);
	}

	/**
	 * Returns a bts.action.execution.RunForFiveMin task that is able to run
	 * this task.
	 */
	public jbt.execution.core.ExecutionTask createExecutor(
			jbt.execution.core.BTExecutor executor,
			jbt.execution.core.ExecutionTask parent) {
		return new bts.action.execution.RunForFiveMin(this, executor, parent);
	}
}