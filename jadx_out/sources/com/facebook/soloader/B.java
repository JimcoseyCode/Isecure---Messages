package com.facebook.soloader;

import android.content.Context;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class B extends C {
    public B(String str, String str2) {
        super(str, str2);
    }

    public static B b(String str, Context context, E[] eArr) {
        StringBuilder sb = new StringBuilder("couldn't find DSO to load: ");
        sb.append(str);
        sb.append("\n\texisting SO sources: ");
        for (int i10 = 0; i10 < eArr.length; i10++) {
            sb.append("\n\t\tSoSource ");
            sb.append(i10);
            sb.append(": ");
            sb.append(eArr[i10].toString());
        }
        if (context != null) {
            sb.append("\n\tNative lib dir: ");
            sb.append(context.getApplicationInfo().nativeLibraryDir);
            sb.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        return new B(str, sb.toString());
    }
}
