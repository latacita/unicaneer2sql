package EER.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PolygonShape;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import EER.diagram.edit.policies.GeneralizationCanonicalEditPolicy;
import EER.diagram.edit.policies.GeneralizationItemSemanticEditPolicy;
import EER.diagram.providers.EERmodelElementTypes;

/**
 * @generated
 */
public class GeneralizationEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2011;

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
	public GeneralizationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new GeneralizationItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new GeneralizationCanonicalEditPolicy());
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
		return primaryShape = new GeneralizationFigure();
	}

	/**
	 * @generated
	 */
	public GeneralizationFigure getPrimaryShape() {
		return (GeneralizationFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	 protected NodeFigure createNodePlate() {
			DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(20, 20) {
				public PointList getPolygonPoints() {
					PointList points = new PointList(6);
					Rectangle anchRect = getHandleBounds();
					points.addPoint(anchRect.x + 1,                anchRect.y + 10);    						             
					points.addPoint(anchRect.x + anchRect.width,   anchRect.y + 10);                   
					points.addPoint(anchRect.x + anchRect.width/2, anchRect.y + anchRect.height); 
					points.addPoint(anchRect.x + 1,       		   anchRect.y + 10); 
					return points;
				}
			};
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
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
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
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EERmodelElementTypes.GeneralizationRelationship_4005);
		types.add(EERmodelElementTypes.SpecializationRelationship_4007);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == EERmodelElementTypes.GeneralizationRelationship_4005) {
			types.add(EERmodelElementTypes.WeakEntity_2009);
			types.add(EERmodelElementTypes.Entity_2003);
		} else if (relationshipType == EERmodelElementTypes.SpecializationRelationship_4007) {
			types.add(EERmodelElementTypes.WeakEntity_2009);
			types.add(EERmodelElementTypes.Entity_2003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class GeneralizationFigure extends PolygonShape {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureGeneralizationNameFigure;

		/**
		 * @generated
		 */
		public GeneralizationFigure() {
			this.addPoint(new Point(getMapMode().DPtoLP(11), getMapMode()
					.DPtoLP(10)));
			this.addPoint(new Point(getMapMode().DPtoLP(21), getMapMode()
					.DPtoLP(10)));
			this.addPoint(new Point(getMapMode().DPtoLP(11), getMapMode()
					.DPtoLP(27)));
			this.addPoint(new Point(getMapMode().DPtoLP(1), getMapMode()
					.DPtoLP(10)));
			this.addPoint(new Point(getMapMode().DPtoLP(11), getMapMode()
					.DPtoLP(10)));
			this.setFill(true);
			this.setForegroundColor(ColorConstants.black);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(22),
					getMapMode().DPtoLP(28)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureGeneralizationNameFigure = new WrappingLabel();
			fFigureGeneralizationNameFigure.setText("");

			fFigureGeneralizationNameFigure.setBorder(new MarginBorder(
					getMapMode().DPtoLP(10), getMapMode().DPtoLP(20),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));

			this.add(fFigureGeneralizationNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureGeneralizationNameFigure() {
			return fFigureGeneralizationNameFigure;
		}

	}

}
