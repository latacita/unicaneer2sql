package EER.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import EER.diagram.edit.policies.GeneralizationRelationshipItemSemanticEditPolicy;

/**
 * @generated
 */
public class GeneralizationRelationshipEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4005;

	/**
	 * @generated
	 */
	public GeneralizationRelationshipEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new GeneralizationRelationshipItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new LineGeneralizationEntityFigure();
	}

	/**
	 * @generated
	 */
	public LineGeneralizationEntityFigure getPrimaryShape() {
		return (LineGeneralizationEntityFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LineGeneralizationEntityFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public LineGeneralizationEntityFigure() {
			this.setForegroundColor(ColorConstants.black);

		}

	}

}
