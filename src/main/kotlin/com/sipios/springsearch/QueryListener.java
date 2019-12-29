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
import org.antlr.v4.runtime.tree.ParseTreeListener;

public interface QueryListener extends ParseTreeListener {
    void enterInput(InputContext var1);

    void exitInput(InputContext var1);

    void enterAtomQuery(AtomQueryContext var1);

    void exitAtomQuery(AtomQueryContext var1);

    void enterPriorityQuery(PriorityQueryContext var1);

    void exitPriorityQuery(PriorityQueryContext var1);

    void enterOpQuery(OpQueryContext var1);

    void exitOpQuery(OpQueryContext var1);

    void enterCriteria(CriteriaContext var1);

    void exitCriteria(CriteriaContext var1);

    void enterKey(KeyContext var1);

    void exitKey(KeyContext var1);

    void enterValue(ValueContext var1);

    void exitValue(ValueContext var1);

    void enterOp(OpContext var1);

    void exitOp(OpContext var1);
}
