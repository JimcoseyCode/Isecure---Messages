package com.facebook.react.internal;

import B3.a;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/facebook/react/internal/SystraceSection;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "sectionName", "<init>", "(Ljava/lang/String;)V", "Li7/B;", "close", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SystraceSection implements AutoCloseable {
    public SystraceSection(String sectionName) {
        AbstractC2855l.g(sectionName, "sectionName");
        a.c(0L, sectionName);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        a.i(0L);
    }
}
