package expo.modules.core.interfaces;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface Arguments {
    boolean containsKey(String str);

    Object get(String str);

    Arguments getArguments(String str);

    boolean getBoolean(String str);

    boolean getBoolean(String str, boolean z10);

    double getDouble(String str);

    double getDouble(String str, double d10);

    int getInt(String str);

    int getInt(String str, int i10);

    List getList(String str);

    List getList(String str, List list);

    long getLong(String str);

    long getLong(String str, long j10);

    Map getMap(String str);

    Map getMap(String str, Map map);

    String getString(String str);

    String getString(String str, String str2);

    boolean isEmpty();

    int size();
}
