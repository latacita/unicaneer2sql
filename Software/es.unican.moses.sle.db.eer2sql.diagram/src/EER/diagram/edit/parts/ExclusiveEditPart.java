package EER.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import EER.diagram.edit.policies.ExclusiveItemSemanticEditPolicy;

/**
 * @generated
 */
public class ExclusiveEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4010;

	/**
	 * @generated
	 */
	public ExclusiveEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ExclusiveItemSemanticEditPolicy());
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
		return new ExclusiveFigure();
	}

	/**
	 * @generated
	 */
	public ExclusiveFigure getPrimaryShape() {
		return (ExclusiveFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ExclusiveFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public ExclusiveFigure() {
			this.setForegroundColor(ColorConstants.lightGray);

		}

	}

}
