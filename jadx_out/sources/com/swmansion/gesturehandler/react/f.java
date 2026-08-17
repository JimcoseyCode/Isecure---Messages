package com.swmansion.gesturehandler.react;

import J6.AbstractC1274d;
import J6.q;
import android.util.SparseArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.gesturehandler.react.k;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements J6.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f24934d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray f24935a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f24936b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f24937c = new SparseArray();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final int[] f(ReadableMap readableMap, String str) {
        ReadableArray array = readableMap.getArray(str);
        AbstractC2855l.d(array);
        int size = array.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = array.getInt(i10);
        }
        return iArr;
    }

    @Override // J6.e
    public boolean a(AbstractC1274d handler, AbstractC1274d otherHandler) {
        AbstractC2855l.g(handler, "handler");
        AbstractC2855l.g(otherHandler, "otherHandler");
        int[] iArr = (int[]) this.f24936b.get(handler.T());
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == otherHandler.T()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // J6.e
    public boolean b(AbstractC1274d handler, AbstractC1274d otherHandler) {
        AbstractC2855l.g(handler, "handler");
        AbstractC2855l.g(otherHandler, "otherHandler");
        int[] iArr = (int[]) this.f24937c.get(handler.T());
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == otherHandler.T()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // J6.e
    public boolean c(AbstractC1274d handler, AbstractC1274d otherHandler) {
        AbstractC2855l.g(handler, "handler");
        AbstractC2855l.g(otherHandler, "otherHandler");
        int[] iArr = (int[]) this.f24935a.get(handler.T());
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == otherHandler.T()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // J6.e
    public boolean d(AbstractC1274d handler, AbstractC1274d otherHandler) {
        AbstractC2855l.g(handler, "handler");
        AbstractC2855l.g(otherHandler, "otherHandler");
        return otherHandler instanceof q ? ((q) otherHandler).X0() : otherHandler instanceof k.b;
    }

    public final void e(AbstractC1274d handler, ReadableMap config) {
        AbstractC2855l.g(handler, "handler");
        AbstractC2855l.g(config, "config");
        handler.A0(this);
        if (config.hasKey("waitFor")) {
            this.f24935a.put(handler.T(), f(config, "waitFor"));
        }
        if (config.hasKey("simultaneousHandlers")) {
            this.f24936b.put(handler.T(), f(config, "simultaneousHandlers"));
        }
        if (config.hasKey("blocksHandlers")) {
            this.f24937c.put(handler.T(), f(config, "blocksHandlers"));
        }
    }

    public final void g(int i10) {
        this.f24935a.remove(i10);
        this.f24936b.remove(i10);
    }

    public final void h() {
        this.f24935a.clear();
        this.f24936b.clear();
    }
}
