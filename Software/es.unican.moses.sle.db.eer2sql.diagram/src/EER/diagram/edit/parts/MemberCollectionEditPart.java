package EER.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolygonShape;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import EER.diagram.edit.policies.MemberCollectionItemSemanticEditPolicy;
import EER.diagram.providers.EERmodelElementTypes;

/**
 * @generated
 */
public class MemberCollectionEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2014;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public MemberCollectionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new MemberCollectionItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new MemberCollectionFigure();
	}

	/**
	 * @generated
	 */
	public MemberCollectionFigure getPrimaryShape() {
		return (MemberCollectionFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(21, 31);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EERmodelElementTypes.AggregationParticipant_4002);
		types.add(EERmodelElementTypes.AggregationParticipant_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof EntityEditPart) {
			types.add(EERmodelElementTypes.AggregationParticipant_4002);
		}
		if (targetEditPart instanceof WeakEntityEditPart) {
			types.add(EERmodelElementTypes.AggregationParticipant_4002);
		}
		if (targetEditPart instanceof RelationshipEditPart) {
			types.add(EERmodelElementTypes.AggregationParticipant_4002);
		}
		if (targetEditPart instanceof DependencyRelationshipEditPart) {
			types.add(EERmodelElementTypes.AggregationParticipant_4002);
		}
		if (targetEditPart instanceof EntityEditPart) {
			types.add(EERmodelElementTypes.AggregationParticipant_4003);
		}
		if (targetEditPart instanceof WeakEntityEditPart) {
			types.add(EERmodelElementTypes.AggregationParticipant_4003);
		}
		if (targetEditPart instanceof RelationshipEditPart) {
			types.add(EERmodelElementTypes.AggregationParticipant_4003);
		}
		if (targetEditPart instanceof DependencyRelationshipEditPart) {
			types.add(EERmodelElementTypes.AggregationParticipant_4003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == EERmodelElementTypes.AggregationParticipant_4002) {
			types.add(EERmodelElementTypes.Entity_2003);
			types.add(EERmodelElementTypes.WeakEntity_2009);
			types.add(EERmodelElementTypes.Relationship_2007);
			types.add(EERmodelElementTypes.DependencyRelationship_2010);
		} else if (relationshipType == EERmodelElementTypes.AggregationParticipant_4003) {
			types.add(EERmodelElementTypes.Entity_2003);
			types.add(EERmodelElementTypes.WeakEntity_2009);
			types.add(EERmodelElementTypes.Relationship_2007);
			types.add(EERmodelElementTypes.DependencyRelationship_2010);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class MemberCollectionFigure extends PolygonShape {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMemberCollectionNameFigure;

		/**
		 * @generated
		 */
		public MemberCollectionFigure() {
			this.addPoint(new Point(getMapMode().DPtoLP(10), getMapMode()
					.DPtoLP(0)));
			this.addPoint(new Point(getMapMode().DPtoLP(20), getMapMode()
					.DPtoLP(15)));
			this.addPoint(new Point(getMapMode().DPtoLP(10), getMapMode()
					.DPtoLP(30)));
			this.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode()
					.DPtoLP(15)));
			this.setFill(true);
			this.setForegroundColor(ColorConstants.black);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(21),
					getMapMode().DPtoLP(31)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureMemberCollectionNameFigure = new WrappingLabel();
			fFigureMemberCollectionNameFigure.setText("<...>");

			this.add(fFigureMemberCollectionNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMemberCollectionNameFigure() {
			return fFigureMemberCollectionNameFigure;
		}

	}

}
