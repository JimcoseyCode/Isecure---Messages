package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.b;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1984u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1984u f20205a = new C1984u();

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.u$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    private C1984u() {
    }

    public static final W2.j a(com.facebook.imagepipeline.request.b imageRequest, W2.j jVar, W2.j jVar2, Map map) {
        String diskCacheId;
        AbstractC2855l.g(imageRequest, "imageRequest");
        if (imageRequest.getCacheChoice() == b.EnumC0218b.SMALL) {
            return jVar;
        }
        if (imageRequest.getCacheChoice() == b.EnumC0218b.DEFAULT) {
            return jVar2;
        }
        if (imageRequest.getCacheChoice() != b.EnumC0218b.DYNAMIC || map == null || (diskCacheId = imageRequest.getDiskCacheId()) == null) {
            return null;
        }
        return (W2.j) map.get(diskCacheId);
    }
}
