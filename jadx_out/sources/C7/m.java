package C7;

import C7.k;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface m extends k, Function1 {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a extends k.b, Function1 {
    }

    Object get(Object obj);

    Object getDelegate(Object obj);

    @Override // C7.k
    a getGetter();
}
