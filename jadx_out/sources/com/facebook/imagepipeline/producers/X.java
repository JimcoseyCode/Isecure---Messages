package com.facebook.imagepipeline.producers;

import java.io.InputStream;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface X {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
        void a();

        void b(InputStream inputStream, int i10);

        void onFailure(Throwable th);
    }

    C createFetchState(InterfaceC1978n interfaceC1978n, e0 e0Var);

    void fetch(C c10, a aVar);

    Map getExtraMap(C c10, int i10);

    void onFetchCompletion(C c10, int i10);

    boolean shouldPropagate(C c10);
}
