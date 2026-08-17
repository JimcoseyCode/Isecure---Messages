package com.facebook.yoga;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class t extends YogaNodeJNIBase {
    public t(c cVar) {
        super(cVar);
    }

    protected void finalize() throws Throwable {
        try {
            w0();
        } finally {
            super.finalize();
        }
    }

    public void w0() {
        long j10 = this.f20742l;
        if (j10 != 0) {
            this.f20742l = 0L;
            YogaNative.jni_YGNodeFinalizeJNI(j10);
        }
    }
}
