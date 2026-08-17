package com.facebook.react.reactperflogger;

import com.facebook.jni.HybridData;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b \u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H$¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0010\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0011\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0012\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0013\u0010\rJ\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0014\u0010\rJ\u001f\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0015\u0010\rJ\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0016\u0010\rJ\u000f\u0010\u0017\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u0017\u0010\u0003R\u001a\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001a\u0010\u0003¨\u0006\u001b"}, d2 = {"Lcom/facebook/react/reactperflogger/NativeModulePerfLogger;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "moduleName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "id", "Li7/B;", "moduleDataCreateStart", "(Ljava/lang/String;I)V", "moduleDataCreateEnd", "moduleCreateStart", "moduleCreateCacheHit", "moduleCreateConstructStart", "moduleCreateConstructEnd", "moduleCreateSetUpStart", "moduleCreateSetUpEnd", "moduleCreateEnd", "moduleCreateFail", "maybeLoadOtherSoLibraries", "mHybridData", "Lcom/facebook/jni/HybridData;", "getMHybridData$annotations", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class NativeModulePerfLogger {
    private final HybridData mHybridData;

    protected NativeModulePerfLogger() {
        maybeLoadOtherSoLibraries();
        this.mHybridData = initHybrid();
    }

    protected abstract HybridData initHybrid();

    protected final synchronized void maybeLoadOtherSoLibraries() {
    }

    public abstract void moduleCreateCacheHit(String moduleName, int id);

    public abstract void moduleCreateConstructEnd(String moduleName, int id);

    public abstract void moduleCreateConstructStart(String moduleName, int id);

    public abstract void moduleCreateEnd(String moduleName, int id);

    public abstract void moduleCreateFail(String moduleName, int id);

    public abstract void moduleCreateSetUpEnd(String moduleName, int id);

    public abstract void moduleCreateSetUpStart(String moduleName, int id);

    public abstract void moduleCreateStart(String moduleName, int id);

    public abstract void moduleDataCreateEnd(String moduleName, int id);

    public abstract void moduleDataCreateStart(String moduleName, int id);

    private static /* synthetic */ void getMHybridData$annotations() {
    }
}
