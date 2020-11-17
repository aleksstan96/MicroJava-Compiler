// generated with ast extension for cup
// version 0.8
// 12/0/2020 22:57:54


package rs.ac.bg.etf.pp1.ast;

public class FactorExpr extends Factor {

    private FactorExprBegin FactorExprBegin;
    private Expr Expr;

    public FactorExpr (FactorExprBegin FactorExprBegin, Expr Expr) {
        this.FactorExprBegin=FactorExprBegin;
        if(FactorExprBegin!=null) FactorExprBegin.setParent(this);
        this.Expr=Expr;
        if(Expr!=null) Expr.setParent(this);
    }

    public FactorExprBegin getFactorExprBegin() {
        return FactorExprBegin;
    }

    public void setFactorExprBegin(FactorExprBegin FactorExprBegin) {
        this.FactorExprBegin=FactorExprBegin;
    }

    public Expr getExpr() {
        return Expr;
    }

    public void setExpr(Expr Expr) {
        this.Expr=Expr;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(FactorExprBegin!=null) FactorExprBegin.accept(visitor);
        if(Expr!=null) Expr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(FactorExprBegin!=null) FactorExprBegin.traverseTopDown(visitor);
        if(Expr!=null) Expr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(FactorExprBegin!=null) FactorExprBegin.traverseBottomUp(visitor);
        if(Expr!=null) Expr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FactorExpr(\n");

        if(FactorExprBegin!=null)
            buffer.append(FactorExprBegin.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Expr!=null)
            buffer.append(Expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FactorExpr]");
        return buffer.toString();
    }
}
