// ******************************************************* 
//                   MACHINE GENERATED CODE                
//                       DO NOT MODIFY                     
//                                                         
// Generated on 10/17/2016 11:49:23
// ******************************************************* 
package bts.btlibrary;

/**
 * BT library that includes the trees read from the following files:
 * <ul>
 * <li>LLM.xbt</li>
 * </ul>
 */
public class LLMBTLibrary implements jbt.execution.core.IBTLibrary {
	/** Tree generated from file LLM.xbt . */
	private static jbt.model.core.ModelTask LLM;

	/* Static initialization of all the trees. */
	static {
		LLM = new jbt.model.task.composite.ModelRandomSelector(
				null,
				new jbt.model.task.composite.ModelSequence(
						null,
						new bts.condition.IsSitting(null),
						new jbt.model.task.composite.ModelSelector(
								null,
								new jbt.model.task.composite.ModelSequence(
										null,
										new bts.condition.IsAdult(null),
										new jbt.model.task.decorator.ModelInverter(
												null,
												new bts.condition.IsHealthy(
														null)),
										new bts.action.WalkforShort(null)),
								new jbt.model.task.leaf.ModelSuccess(null))),
				new jbt.model.task.composite.ModelSequence(
						null,
						new bts.condition.IsLyingDown(null),
						new jbt.model.task.composite.ModelSelector(
								null,
								new jbt.model.task.composite.ModelSequence(
										null,
										new bts.condition.IsAdult(null),
										new jbt.model.task.decorator.ModelInverter(
												null,
												new bts.condition.IsHealthy(
														null)),
										new bts.action.WalkforLong(null)),
								new jbt.model.task.leaf.ModelSuccess(null))),
				new jbt.model.task.composite.ModelSequence(null,
						new bts.condition.IsEating(null),
						new jbt.model.task.composite.ModelSelector(null,
								new jbt.model.task.composite.ModelSequence(
										null, new bts.condition.IsAdult(null),
										new bts.condition.IsHypertensive(null),
										new bts.action.RunForFiveMin(null)),
								new jbt.model.task.leaf.ModelSuccess(null))),
				new jbt.model.task.composite.ModelSequence(null,
						new bts.condition.IsStanding(null),
						new jbt.model.task.composite.ModelSelector(null,
								new jbt.model.task.composite.ModelSequence(
										null, new bts.condition.IsAdult(null),
										new bts.condition.IsHypertensive(null),
										new bts.action.WalkforShort(null)),
								new jbt.model.task.leaf.ModelSuccess(null))));

	}

	/**
	 * Returns a behaviour tree by its name, or null in case it cannot be found.
	 * It must be noted that the trees that are retrieved belong to the class,
	 * not to the instance (that is, the trees are static members of the class),
	 * so they are shared among all the instances of this class.
	 */
	public jbt.model.core.ModelTask getBT(java.lang.String name) {
		if (name.equals("LLM")) {
			return LLM;
		}
		return null;
	}

	/**
	 * Returns an Iterator that is able to iterate through all the elements in
	 * the library. It must be noted that the iterator does not support the
	 * "remove()" operation. It must be noted that the trees that are retrieved
	 * belong to the class, not to the instance (that is, the trees are static
	 * members of the class), so they are shared among all the instances of this
	 * class.
	 */
	public java.util.Iterator<jbt.util.Pair<java.lang.String, jbt.model.core.ModelTask>> iterator() {
		return new BTLibraryIterator();
	}

	private class BTLibraryIterator
			implements
			java.util.Iterator<jbt.util.Pair<java.lang.String, jbt.model.core.ModelTask>> {
		static final long numTrees = 1;
		long currentTree = 0;

		public boolean hasNext() {
			return this.currentTree < numTrees;
		}

		public jbt.util.Pair<java.lang.String, jbt.model.core.ModelTask> next() {
			this.currentTree++;

			if ((this.currentTree - 1) == 0) {
				return new jbt.util.Pair<java.lang.String, jbt.model.core.ModelTask>(
						"LLM", LLM);
			}

			throw new java.util.NoSuchElementException();
		}

		public void remove() {
			throw new java.lang.UnsupportedOperationException();
		}
	}
}
