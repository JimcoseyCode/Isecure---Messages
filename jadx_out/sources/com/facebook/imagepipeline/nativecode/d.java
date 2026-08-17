package com.facebook.imagepipeline.nativecode;

import y3.AbstractC3612a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f19904a;

    public static synchronized void a() {
        if (!f19904a) {
            AbstractC3612a.d("native-imagetranscoder");
            f19904a = true;
        }
    }
}
