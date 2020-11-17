// generated with ast extension for cup
// version 0.8
// 12/0/2020 22:57:53


package rs.ac.bg.etf.pp1.ast;

public class ExprWithMinus extends Expr {

    private Minus Minus;
    private AddOpTermList AddOpTermList;

    public ExprWithMinus (Minus Minus, AddOpTermList AddOpTermList) {
        this.Minus=Minus;
        if(Minus!=null) Minus.setParent(this);
        this.AddOpTermList=AddOpTermList;
        if(AddOpTermList!=null) AddOpTermList.setParent(this);
    }

    public Minus getMinus() {
        return Minus;
    }

    public void setMinus(Minus Minus) {
        this.Minus=Minus;
    }

    public AddOpTermList getAddOpTermList() {
        return AddOpTermList;
    }

    public void setAddOpTermList(AddOpTermList AddOpTermList) {
        this.AddOpTermList=AddOpTermList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Minus!=null) Minus.accept(visitor);
        if(AddOpTermList!=null) AddOpTermList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Minus!=null) Minus.traverseTopDown(visitor);
        if(AddOpTermList!=null) AddOpTermList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Minus!=null) Minus.traverseBottomUp(visitor);
        if(AddOpTermList!=null) AddOpTermList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ExprWithMinus(\n");

        if(Minus!=null)
            buffer.append(Minus.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(AddOpTermList!=null)
            buffer.append(AddOpTermList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ExprWithMinus]");
        return buffer.toString();
    }
}
