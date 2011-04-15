package EER.diagram.providers;

import EER.diagram.part.Eer2sqlDiagramEditorPlugin;

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
		ElementInitializers cached = Eer2sqlDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			Eer2sqlDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
