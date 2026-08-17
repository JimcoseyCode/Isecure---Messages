package com.facebook.react.views.scroll;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.t;
import j7.K;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewCommandHelper;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Companion", "ScrollCommandHandler", "ScrollToCommandData", "ScrollToEndCommandData", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactScrollViewCommandHelper {
    public static final int COMMAND_FLASH_SCROLL_INDICATORS = 3;
    public static final int COMMAND_SCROLL_TO = 1;
    public static final int COMMAND_SCROLL_TO_END = 2;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\r\u001a\u00020\n\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0014\u001a\u00020\n\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u0014\u001a\u00020\n\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewCommandHelper$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "T", "Lcom/facebook/react/views/scroll/ReactScrollViewCommandHelper$ScrollCommandHandler;", "viewManager", "scrollView", "Lcom/facebook/react/bridge/ReadableArray;", "args", "Li7/B;", "scrollTo", "(Lcom/facebook/react/views/scroll/ReactScrollViewCommandHelper$ScrollCommandHandler;Ljava/lang/Object;Lcom/facebook/react/bridge/ReadableArray;)V", "scrollToEnd", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "getCommandsMap", "()Ljava/util/Map;", "commandType", "receiveCommand", "(Lcom/facebook/react/views/scroll/ReactScrollViewCommandHelper$ScrollCommandHandler;Ljava/lang/Object;ILcom/facebook/react/bridge/ReadableArray;)V", "(Lcom/facebook/react/views/scroll/ReactScrollViewCommandHelper$ScrollCommandHandler;Ljava/lang/Object;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "COMMAND_SCROLL_TO", "I", "COMMAND_SCROLL_TO_END", "COMMAND_FLASH_SCROLL_INDICATORS", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final <T> void scrollTo(ScrollCommandHandler<T> viewManager, T scrollView, ReadableArray args) {
            viewManager.scrollTo(scrollView, new ScrollToCommandData(Math.round(PixelUtil.toPixelFromDIP(args.getDouble(0))), Math.round(PixelUtil.toPixelFromDIP(args.getDouble(1))), args.getBoolean(2)));
        }

        private final <T> void scrollToEnd(ScrollCommandHandler<T> viewManager, T scrollView, ReadableArray args) {
            viewManager.scrollToEnd(scrollView, new ScrollToEndCommandData(args.getBoolean(0)));
        }

        public final Map<String, Integer> getCommandsMap() {
            return K.k(t.a("scrollTo", 1), t.a("scrollToEnd", 2), t.a("flashScrollIndicators", 3));
        }

        public final <T> void receiveCommand(ScrollCommandHandler<T> viewManager, T scrollView, int commandType, ReadableArray args) {
            AbstractC2855l.g(viewManager, "viewManager");
            if (scrollView == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (commandType == 1) {
                if (args == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                scrollTo(viewManager, scrollView, args);
                return;
            }
            if (commandType == 2) {
                if (args == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                scrollToEnd(viewManager, scrollView, args);
            } else {
                if (commandType == 3) {
                    viewManager.flashScrollIndicators(scrollView);
                    return;
                }
                throw new IllegalArgumentException("Unsupported command " + commandType + " received by " + viewManager.getClass().getSimpleName() + ".");
            }
        }

        private Companion() {
        }

        public final <T> void receiveCommand(ScrollCommandHandler<T> viewManager, T scrollView, String commandType, ReadableArray args) {
            AbstractC2855l.g(viewManager, "viewManager");
            AbstractC2855l.g(commandType, "commandType");
            if (scrollView != null) {
                int iHashCode = commandType.hashCode();
                if (iHashCode != -402165208) {
                    if (iHashCode != 28425985) {
                        if (iHashCode == 2055114131 && commandType.equals("scrollToEnd")) {
                            if (args == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            scrollToEnd(viewManager, scrollView, args);
                            return;
                        }
                    } else if (commandType.equals("flashScrollIndicators")) {
                        viewManager.flashScrollIndicators(scrollView);
                        return;
                    }
                } else if (commandType.equals("scrollTo")) {
                    if (args == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    scrollTo(viewManager, scrollView, args);
                    return;
                }
                throw new IllegalArgumentException("Unsupported command " + commandType + " received by " + viewManager.getClass().getSimpleName() + ".");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewCommandHelper$ScrollCommandHandler;", "T", PointerEventHelper.POINTER_TYPE_UNKNOWN, "scrollView", "Lcom/facebook/react/views/scroll/ReactScrollViewCommandHelper$ScrollToCommandData;", "data", "Li7/B;", "scrollTo", "(Ljava/lang/Object;Lcom/facebook/react/views/scroll/ReactScrollViewCommandHelper$ScrollToCommandData;)V", "Lcom/facebook/react/views/scroll/ReactScrollViewCommandHelper$ScrollToEndCommandData;", "scrollToEnd", "(Ljava/lang/Object;Lcom/facebook/react/views/scroll/ReactScrollViewCommandHelper$ScrollToEndCommandData;)V", "flashScrollIndicators", "(Ljava/lang/Object;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ScrollCommandHandler<T> {
        void flashScrollIndicators(T scrollView);

        void scrollTo(T scrollView, ScrollToCommandData data);

        void scrollToEnd(T scrollView, ScrollToEndCommandData data);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewCommandHelper$ScrollToCommandData;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "mDestX", PointerEventHelper.POINTER_TYPE_UNKNOWN, "mDestY", "mAnimated", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(IIZ)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ScrollToCommandData {
        public final boolean mAnimated;
        public final int mDestX;
        public final int mDestY;

        public ScrollToCommandData(int i10, int i11, boolean z10) {
            this.mDestX = i10;
            this.mDestY = i11;
            this.mAnimated = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewCommandHelper$ScrollToEndCommandData;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "mAnimated", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Z)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ScrollToEndCommandData {
        public final boolean mAnimated;

        public ScrollToEndCommandData(boolean z10) {
            this.mAnimated = z10;
        }
    }

    public static final Map<String, Integer> getCommandsMap() {
        return INSTANCE.getCommandsMap();
    }

    public static final <T> void receiveCommand(ScrollCommandHandler<T> scrollCommandHandler, T t10, int i10, ReadableArray readableArray) {
        INSTANCE.receiveCommand(scrollCommandHandler, t10, i10, readableArray);
    }

    public static final <T> void receiveCommand(ScrollCommandHandler<T> scrollCommandHandler, T t10, String str, ReadableArray readableArray) {
        INSTANCE.receiveCommand(scrollCommandHandler, t10, str, readableArray);
    }
}
