package com.swmansion.reanimated.keyboard;

import androidx.core.view.C1690q0;
import androidx.core.view.L0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class KeyboardAnimationCallback extends C1690q0.b {
    private static final int CONTENT_TYPE_MASK = L0.p.b();
    private final boolean mIsNavigationBarTranslucent;
    private final Keyboard mKeyboard;
    private final NotifyAboutKeyboardChangeFunction mNotifyAboutKeyboardChange;

    public KeyboardAnimationCallback(Keyboard keyboard, NotifyAboutKeyboardChangeFunction notifyAboutKeyboardChangeFunction, boolean z10) {
        super(1);
        this.mNotifyAboutKeyboardChange = notifyAboutKeyboardChangeFunction;
        this.mIsNavigationBarTranslucent = z10;
        this.mKeyboard = keyboard;
    }

    private static boolean isKeyboardAnimation(C1690q0 c1690q0) {
        return (c1690q0.c() & CONTENT_TYPE_MASK) != 0;
    }

    @Override // androidx.core.view.C1690q0.b
    public void onEnd(C1690q0 c1690q0) {
        if (isKeyboardAnimation(c1690q0)) {
            this.mKeyboard.onAnimationEnd();
            this.mNotifyAboutKeyboardChange.call();
        }
    }

    @Override // androidx.core.view.C1690q0.b
    public L0 onProgress(L0 l02, List<C1690q0> list) {
        Iterator<C1690q0> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (isKeyboardAnimation(it.next())) {
                this.mKeyboard.updateHeight(l02, this.mIsNavigationBarTranslucent);
                this.mNotifyAboutKeyboardChange.call();
                break;
            }
        }
        return l02;
    }

    @Override // androidx.core.view.C1690q0.b
    public C1690q0.a onStart(C1690q0 c1690q0, C1690q0.a aVar) {
        if (!isKeyboardAnimation(c1690q0)) {
            return aVar;
        }
        this.mKeyboard.onAnimationStart();
        this.mNotifyAboutKeyboardChange.call();
        return super.onStart(c1690q0, aVar);
    }
}
