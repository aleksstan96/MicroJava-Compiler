// generated with ast extension for cup
// version 0.8
// 12/0/2020 22:57:53


package rs.ac.bg.etf.pp1.ast;

public class AssignDesignatorErrorStmt extends DesignatorStatement {

    private Designator Designator;
    private AssignErrorPart AssignErrorPart;

    public AssignDesignatorErrorStmt (Designator Designator, AssignErrorPart AssignErrorPart) {
        this.Designator=Designator;
        if(Designator!=null) Designator.setParent(this);
        this.AssignErrorPart=AssignErrorPart;
        if(AssignErrorPart!=null) AssignErrorPart.setParent(this);
    }

    public Designator getDesignator() {
        return Designator;
    }

    public void setDesignator(Designator Designator) {
        this.Designator=Designator;
    }

    public AssignErrorPart getAssignErrorPart() {
        return AssignErrorPart;
    }

    public void setAssignErrorPart(AssignErrorPart AssignErrorPart) {
        this.AssignErrorPart=AssignErrorPart;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Designator!=null) Designator.accept(visitor);
        if(AssignErrorPart!=null) AssignErrorPart.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Designator!=null) Designator.traverseTopDown(visitor);
        if(AssignErrorPart!=null) AssignErrorPart.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Designator!=null) Designator.traverseBottomUp(visitor);
        if(AssignErrorPart!=null) AssignErrorPart.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("AssignDesignatorErrorStmt(\n");

        if(Designator!=null)
            buffer.append(Designator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(AssignErrorPart!=null)
            buffer.append(AssignErrorPart.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [AssignDesignatorErrorStmt]");
        return buffer.toString();
    }
}
