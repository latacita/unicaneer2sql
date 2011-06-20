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
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import EER.diagram.edit.policies.DependencyRelationshipItemSemanticEditPolicy;
import EER.diagram.part.EERmodelVisualIDRegistry;
import EER.diagram.providers.EERmodelElementTypes;

/**
 * @generated
 */
public class DependencyRelationshipEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2010;

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
	public DependencyRelationshipEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new DependencyRelationshipItemSemanticEditPolicy());
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
		return primaryShape = new DependencyRelationshipFigure();
	}

	/**
	 * @generated
	 */
	public DependencyRelationshipFigure getPrimaryShape() {
		return (DependencyRelationshipFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DependencyRelationshipTypeEditPart) {
			((DependencyRelationshipTypeEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureDependencyType());
			return true;
		}
		if (childEditPart instanceof DependencyRelationshipNameEditPart) {
			((DependencyRelationshipNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureDependencyRelationshipNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DependencyRelationshipTypeEditPart) {
			return true;
		}
		if (childEditPart instanceof DependencyRelationshipNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(100, 50) {
			public PointList getPolygonPoints() {
				PointList points = new PointList(6);
				Rectangle anchRect = getHandleBounds();
				points.addPoint(anchRect.x + anchRect.width/2,       anchRect.y);                   	// A1
				points.addPoint(anchRect.x + anchRect.width,         anchRect.y + anchRect.height/2);   // A2
				points.addPoint(anchRect.x + anchRect.width/2,       anchRect.y + anchRect.height); 	// A3
				points.addPoint(anchRect.x                         , anchRect.y + anchRect.height/2);   // A4
				points.addPoint(anchRect.x + anchRect.width/2,       anchRect.y);                       // A1
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
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(EERmodelVisualIDRegistry
				.getType(DependencyRelationshipTypeEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(EERmodelElementTypes.Participant_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof WeakEntityEditPart) {
			types.add(EERmodelElementTypes.Participant_4001);
		}
		if (targetEditPart instanceof EntityEditPart) {
			types.add(EERmodelElementTypes.Participant_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == EERmodelElementTypes.Participant_4001) {
			types.add(EERmodelElementTypes.WeakEntity_2009);
			types.add(EERmodelElementTypes.Entity_2003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(EERmodelElementTypes.AggregationParticipant_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == EERmodelElementTypes.AggregationParticipant_4002) {
			types.add(EERmodelElementTypes.Aggregation_2017);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class DependencyRelationshipFigure extends PolygonShape {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDependencyRelationshipNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDependencyType;

		/**
		 * @generated
		 */
		public DependencyRelationshipFigure() {
			this.addPoint(new Point(getMapMode().DPtoLP(50), getMapMode()
					.DPtoLP(0)));
			this.addPoint(new Point(getMapMode().DPtoLP(100), getMapMode()
					.DPtoLP(25)));
			this.addPoint(new Point(getMapMode().DPtoLP(50), getMapMode()
					.DPtoLP(50)));
			this.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode()
					.DPtoLP(25)));
			this.addPoint(new Point(getMapMode().DPtoLP(50), getMapMode()
					.DPtoLP(0)));
			this.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode()
					.DPtoLP(25)));
			this.addPoint(new Point(getMapMode().DPtoLP(25), getMapMode()
					.DPtoLP(12)));
			this.addPoint(new Point(getMapMode().DPtoLP(75), getMapMode()
					.DPtoLP(12)));
			this.setFill(true);
			this.setLineWidth(2);
			this.setForegroundColor(ColorConstants.black);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(101),
					getMapMode().DPtoLP(51)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureDependencyType = new WrappingLabel();
			fFigureDependencyType.setText("");

			fFigureDependencyType.setFont(FFIGUREDEPENDENCYTYPE_FONT);

			fFigureDependencyType.setBorder(new MarginBorder(getMapMode()
					.DPtoLP(0), getMapMode().DPtoLP(47),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));

			this.add(fFigureDependencyType);

			fFigureDependencyRelationshipNameFigure = new WrappingLabel();
			fFigureDependencyRelationshipNameFigure.setText("<...>");

			fFigureDependencyRelationshipNameFigure.setBorder(new MarginBorder(
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(15),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(15)));

			this.add(fFigureDependencyRelationshipNameFigure);

			PolygonShape polyline0 = new PolygonShape();
			polyline0.setFill(true);

			this.add(polyline0);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDependencyRelationshipNameFigure() {
			return fFigureDependencyRelationshipNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDependencyType() {
			return fFigureDependencyType;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREDEPENDENCYTYPE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 7, SWT.NORMAL);

}
