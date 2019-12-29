//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.sipios.springsearch;

import com.sipios.springsearch.QueryParser.*;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class QueryBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements QueryVisitor<T> {
    public QueryBaseVisitor() {
    }

    public T visitInput(InputContext ctx) {
        return this.visitChildren(ctx);
    }

    public T visitAtomQuery(AtomQueryContext ctx) {
        return this.visitChildren(ctx);
    }

    public T visitPriorityQuery(PriorityQueryContext ctx) {
        return this.visitChildren(ctx);
    }

    public T visitOpQuery(OpQueryContext ctx) {
        return this.visitChildren(ctx);
    }

    public T visitCriteria(CriteriaContext ctx) {
        return this.visitChildren(ctx);
    }

    public T visitKey(KeyContext ctx) {
        return this.visitChildren(ctx);
    }

    public T visitValue(ValueContext ctx) {
        return this.visitChildren(ctx);
    }

    public T visitOp(OpContext ctx) {
        return this.visitChildren(ctx);
    }
}
