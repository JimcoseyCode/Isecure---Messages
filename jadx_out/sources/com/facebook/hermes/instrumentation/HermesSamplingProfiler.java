package com.facebook.hermes.instrumentation;

import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0005\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0006\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0087 ¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/hermes/instrumentation/HermesSamplingProfiler;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Li7/B;", "enable", "disable", PointerEventHelper.POINTER_TYPE_UNKNOWN, "filename", "dumpSampledTraceToFile", "(Ljava/lang/String;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HermesSamplingProfiler {
    public static final HermesSamplingProfiler INSTANCE = new HermesSamplingProfiler();

    static {
        SoLoader.t("jsijniprofiler");
    }

    private HermesSamplingProfiler() {
    }

    public static final native void disable();

    public static final native void dumpSampledTraceToFile(String filename);

    public static final native void enable();
}
