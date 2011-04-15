package EER.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import EER.diagram.edit.policies.InclusionItemSemanticEditPolicy;

/**
 * @generated
 */
public class InclusionEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4011;

	/**
	 * @generated
	 */
	public InclusionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new InclusionItemSemanticEditPolicy());
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
		return new InclusionFigure();
	}

	/**
	 * @generated
	 */
	public InclusionFigure getPrimaryShape() {
		return (InclusionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class InclusionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureInclusionNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureInclusionCommentFigure;

		/**
		 * @generated
		 */
		public InclusionFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureInclusionNameFigure = new WrappingLabel();
			fFigureInclusionNameFigure.setText("<...>");

			this.add(fFigureInclusionNameFigure);

			fFigureInclusionCommentFigure = new WrappingLabel();
			fFigureInclusionCommentFigure.setText("<...>");

			this.add(fFigureInclusionCommentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInclusionNameFigure() {
			return fFigureInclusionNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInclusionCommentFigure() {
			return fFigureInclusionCommentFigure;
		}

	}

}
