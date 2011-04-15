package EER.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import EER.diagram.part.Eer2sqlVisualIDRegistry;

/**
 * @generated
 */
public class Eer2sqlNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4017;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof Eer2sqlNavigatorItem) {
			Eer2sqlNavigatorItem item = (Eer2sqlNavigatorItem) element;
			return Eer2sqlVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
