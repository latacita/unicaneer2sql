package EER.diagram.providers;

import EER.diagram.part.EERmodelDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = EERmodelDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			EERmodelDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
