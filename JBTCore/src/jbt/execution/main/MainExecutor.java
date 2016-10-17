package jbt.execution.main;

import jbt.execution.core.BTExecutorFactory;
import jbt.execution.core.ContextFactory;
import jbt.execution.core.ExecutionTask;
import jbt.execution.core.IBTExecutor;
import jbt.execution.core.IBTLibrary;
import jbt.execution.core.IContext;
import jbt.model.core.ModelTask;
import bts.btlibrary.LLMBTLibrary;



public class MainExecutor {

	public static void main(String[] args) {
		
		for(int i=0; i<20; i++)
		{
		/* First of all, we create the BT Library */
		IBTLibrary btLibrary = new LLMBTLibrary();
		
		/* Then we create the initial context, that the tree will use */
		IContext context = ContextFactory.createContext(btLibrary);
		
		/* Now we are asuming that, the LLM that is going to be the controlled has on id of "LLM1" */
		context.setVariable("CurrentEntityID", "llm1");
		
		/* Now we get the model BT to run. */
		ModelTask llmTree = btLibrary.getBT("LLM");
		if(llmTree == null){
			System.out.println("llmTree is nULL :(");
			System.exit(0);
		}
		/* Then we create the BT Exdecutor to run the tree */
		IBTExecutor btExecutor = BTExecutorFactory.createBTExecutor(llmTree, context);
		
		/* And finally we run the tree through the BT Executor */
		int counter = 0;
		
		do{
			counter++;
			btExecutor.tick();
			System.out.println("counter: " + counter);
		}while(btExecutor.getStatus() == ExecutionTask.Status.RUNNING);
		System.out.println("\n\n................"+i+ " No. cycle completed...........\n\n");
		}
	}

}
