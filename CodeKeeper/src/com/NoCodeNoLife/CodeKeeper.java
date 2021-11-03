package com.NoCodeNoLife;

import java.util.ArrayList;
import java.util.Iterator;

public class CodeKeeper {

    ArrayList<String> list;
    String[] codes = {"alpha", "lambda", "gamma", "delta", "zeta"};

    public CodeKeeper(String[] userCodes) {
        list = new ArrayList<String>();
        for (int i = 0; i < codes.length; i++) {
            addCode(codes[i]);
        }
        for (int j = 0; j < userCodes.length; j++) {
            addCode(userCodes[j]);
        }
        for (Iterator ite = list.iterator(); ite.hasNext(); ) {
            String output = (String) ite.next();
            System.out.println(output);
        }
    }

    private void addCode(String code) {
        if (!list.contains(code)) {
            list.add(code);
        }
    }
}
