// generated with ast extension for cup
// version 0.8
// 12/0/2020 22:57:53


package rs.ac.bg.etf.pp1.ast;

public class MethVarDeclNoEmpty extends MethVarDecl {

    private VarDecl VarDecl;
    private MethVarDecl MethVarDecl;

    public MethVarDeclNoEmpty (VarDecl VarDecl, MethVarDecl MethVarDecl) {
        this.VarDecl=VarDecl;
        if(VarDecl!=null) VarDecl.setParent(this);
        this.MethVarDecl=MethVarDecl;
        if(MethVarDecl!=null) MethVarDecl.setParent(this);
    }

    public VarDecl getVarDecl() {
        return VarDecl;
    }

    public void setVarDecl(VarDecl VarDecl) {
        this.VarDecl=VarDecl;
    }

    public MethVarDecl getMethVarDecl() {
        return MethVarDecl;
    }

    public void setMethVarDecl(MethVarDecl MethVarDecl) {
        this.MethVarDecl=MethVarDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(VarDecl!=null) VarDecl.accept(visitor);
        if(MethVarDecl!=null) MethVarDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarDecl!=null) VarDecl.traverseTopDown(visitor);
        if(MethVarDecl!=null) MethVarDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarDecl!=null) VarDecl.traverseBottomUp(visitor);
        if(MethVarDecl!=null) MethVarDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MethVarDeclNoEmpty(\n");

        if(VarDecl!=null)
            buffer.append(VarDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MethVarDecl!=null)
            buffer.append(MethVarDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MethVarDeclNoEmpty]");
        return buffer.toString();
    }
}
