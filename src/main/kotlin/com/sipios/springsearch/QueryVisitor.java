//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.sipios.springsearch;

import com.sipios.springsearch.QueryParser.AtomQueryContext;
import com.sipios.springsearch.QueryParser.CriteriaContext;
import com.sipios.springsearch.QueryParser.InputContext;
import com.sipios.springsearch.QueryParser.KeyContext;
import com.sipios.springsearch.QueryParser.OpContext;
import com.sipios.springsearch.QueryParser.OpQueryContext;
import com.sipios.springsearch.QueryParser.PriorityQueryContext;
import com.sipios.springsearch.QueryParser.ValueContext;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public interface QueryVisitor<T> extends ParseTreeVisitor<T> {
    T visitInput(InputContext var1);

    T visitAtomQuery(AtomQueryContext var1);

    T visitPriorityQuery(PriorityQueryContext var1);

    T visitOpQuery(OpQueryContext var1);

    T visitCriteria(CriteriaContext var1);

    T visitKey(KeyContext var1);

    T visitValue(ValueContext var1);

    T visitOp(OpContext var1);
}
