package EER.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import EER.diagram.edit.policies.AggregationParticipant2ItemSemanticEditPolicy;

/**
 * @generated
 */
public class AggregationParticipant2EditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4003;

	/**
	 * @generated
	 */
	public AggregationParticipant2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AggregationParticipant2ItemSemanticEditPolicy());
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
		return new LineMemberCollectionFigure();
	}

	/**
	 * @generated
	 */
	public LineMemberCollectionFigure getPrimaryShape() {
		return (LineMemberCollectionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LineMemberCollectionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public LineMemberCollectionFigure() {
			this.setForegroundColor(ColorConstants.red);

		}

	}

}
