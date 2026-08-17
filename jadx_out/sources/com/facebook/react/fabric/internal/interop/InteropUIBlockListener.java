package com.facebook.react.fabric.internal.interop;

import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.fabric.interop.UIBlock;
import com.facebook.react.fabric.interop.UIBlockViewResolver;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\rR&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0015\u0010\u0016R&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/facebook/react/fabric/internal/interop/InteropUIBlockListener;", "Lcom/facebook/react/bridge/UIManagerListener;", "<init>", "()V", "Lcom/facebook/react/fabric/interop/UIBlock;", "block", "Li7/B;", "prependUIBlock", "(Lcom/facebook/react/fabric/interop/UIBlock;)V", "addUIBlock", "Lcom/facebook/react/bridge/UIManager;", "uiManager", "willMountItems", "(Lcom/facebook/react/bridge/UIManager;)V", "didMountItems", "didDispatchMountItems", "willDispatchViewUpdates", "didScheduleMountItems", PointerEventHelper.POINTER_TYPE_UNKNOWN, "beforeUIBlocks", "Ljava/util/List;", "getBeforeUIBlocks$ReactAndroid_release", "()Ljava/util/List;", "getBeforeUIBlocks$ReactAndroid_release$annotations", "afterUIBlocks", "getAfterUIBlocks$ReactAndroid_release", "getAfterUIBlocks$ReactAndroid_release$annotations", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InteropUIBlockListener implements UIManagerListener {
    private final List<UIBlock> beforeUIBlocks = new ArrayList();
    private final List<UIBlock> afterUIBlocks = new ArrayList();

    public final synchronized void addUIBlock(UIBlock block) {
        AbstractC2855l.g(block, "block");
        this.afterUIBlocks.add(block);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uiManager) {
        AbstractC2855l.g(uiManager, "uiManager");
        didMountItems(uiManager);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(UIManager uiManager) {
        AbstractC2855l.g(uiManager, "uiManager");
        if (uiManager instanceof UIBlockViewResolver) {
            synchronized (this) {
                if (this.afterUIBlocks.isEmpty()) {
                    return;
                }
                List listP0 = AbstractC2800q.P0(this.afterUIBlocks);
                this.afterUIBlocks.clear();
                Iterator it = listP0.iterator();
                while (it.hasNext()) {
                    ((UIBlock) it.next()).execute((UIBlockViewResolver) uiManager);
                }
            }
        }
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uiManager) {
        AbstractC2855l.g(uiManager, "uiManager");
    }

    public final List<UIBlock> getAfterUIBlocks$ReactAndroid_release() {
        return this.afterUIBlocks;
    }

    public final List<UIBlock> getBeforeUIBlocks$ReactAndroid_release() {
        return this.beforeUIBlocks;
    }

    public final synchronized void prependUIBlock(UIBlock block) {
        AbstractC2855l.g(block, "block");
        this.beforeUIBlocks.add(block);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(UIManager uiManager) {
        AbstractC2855l.g(uiManager, "uiManager");
        willMountItems(uiManager);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(UIManager uiManager) {
        AbstractC2855l.g(uiManager, "uiManager");
        if (uiManager instanceof UIBlockViewResolver) {
            synchronized (this) {
                if (this.beforeUIBlocks.isEmpty()) {
                    return;
                }
                List listP0 = AbstractC2800q.P0(this.beforeUIBlocks);
                this.beforeUIBlocks.clear();
                Iterator it = listP0.iterator();
                while (it.hasNext()) {
                    ((UIBlock) it.next()).execute((UIBlockViewResolver) uiManager);
                }
            }
        }
    }

    public static /* synthetic */ void getAfterUIBlocks$ReactAndroid_release$annotations() {
    }

    public static /* synthetic */ void getBeforeUIBlocks$ReactAndroid_release$annotations() {
    }
}
