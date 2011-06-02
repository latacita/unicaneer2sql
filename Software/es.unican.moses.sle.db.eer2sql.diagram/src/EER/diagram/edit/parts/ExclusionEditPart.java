package EER.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import EER.diagram.edit.policies.ExclusionItemSemanticEditPolicy;

/**
 * @generated
 */
public class ExclusionEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4009;

	/**
	 * @generated
	 */
	public ExclusionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ExclusionItemSemanticEditPolicy());
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
		return new ExclusionFigure();
	}

	/**
	 * @generated
	 */
	public ExclusionFigure getPrimaryShape() {
		return (ExclusionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ExclusionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public ExclusionFigure() {
			this.setLineStyle(Graphics.LINE_DASH);
			this.setForegroundColor(ColorConstants.lightGray);

		}

	}

}
