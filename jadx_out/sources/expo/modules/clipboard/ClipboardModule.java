package expo.modules.clipboard;

import C7.o;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.clipboard.ClipboardModule;
import expo.modules.clipboard.ClipboardModule.ClipboardEventEmitter;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.functions.AsyncFunctionBuilder;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.SuspendFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import i7.AbstractC2746i;
import i7.AbstractC2753p;
import i7.C2735B;
import i7.C2750m;
import i7.C2752o;
import i7.t;
import j7.AbstractC2800q;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import l1.AbstractC2861a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0014\u001a\u00060\u0015R\u00020\u0000X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001b*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lexpo/modules/clipboard/ClipboardModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "clipboardManager", "Landroid/content/ClipboardManager;", "getClipboardManager", "()Landroid/content/ClipboardManager;", "clipboardCacheDir", "Ljava/io/File;", "getClipboardCacheDir", "()Ljava/io/File;", "clipboardCacheDir$delegate", "Lkotlin/Lazy;", "clipboardEventEmitter", "Lexpo/modules/clipboard/ClipboardModule$ClipboardEventEmitter;", "clipboardHasItemWithType", PointerEventHelper.POINTER_TYPE_UNKNOWN, "mimeType", PointerEventHelper.POINTER_TYPE_UNKNOWN, "firstItem", "Landroid/content/ClipData$Item;", "getFirstItem", "(Landroid/content/ClipboardManager;)Landroid/content/ClipData$Item;", "ClipboardEventEmitter", "expo-clipboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClipboardModule extends Module {

    /* JADX INFO: renamed from: clipboardCacheDir$delegate, reason: from kotlin metadata */
    private final Lazy clipboardCacheDir = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.clipboard.i
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return ClipboardModule.clipboardCacheDir_delegate$lambda$15(this.f26471g);
        }
    });
    private ClipboardEventEmitter clipboardEventEmitter;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lexpo/modules/clipboard/ClipboardModule$ClipboardEventEmitter;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Lexpo/modules/clipboard/ClipboardModule;)V", "Li7/B;", "resumeListening", "()V", "pauseListening", "attachListener", "()Ljava/lang/Object;", "detachListener", "()Li7/B;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isListening", "Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "timestamp", "J", "Landroid/content/ClipboardManager$OnPrimaryClipChangedListener;", "listener", "Landroid/content/ClipboardManager$OnPrimaryClipChangedListener;", "Landroid/content/ClipboardManager;", "maybeClipboardManager", "Landroid/content/ClipboardManager;", "expo-clipboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class ClipboardEventEmitter {
        private final ClipboardManager.OnPrimaryClipChangedListener listener;
        private final ClipboardManager maybeClipboardManager;
        private boolean isListening = true;
        private long timestamp = -1;

        public ClipboardEventEmitter() {
            Object objB;
            this.listener = new ClipboardManager.OnPrimaryClipChangedListener() { // from class: expo.modules.clipboard.k
                @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
                public final void onPrimaryClipChanged() {
                    ClipboardModule.ClipboardEventEmitter.listener$lambda$7(clipboardModule, this);
                }
            };
            try {
                C2752o.a aVar = C2752o.f28721h;
                objB = C2752o.b(ClipboardModule.this.getClipboardManager());
            } catch (Throwable th) {
                C2752o.a aVar2 = C2752o.f28721h;
                objB = C2752o.b(AbstractC2753p.a(th));
            }
            this.maybeClipboardManager = (ClipboardManager) (C2752o.f(objB) ? null : objB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void listener$lambda$7(ClipboardModule clipboardModule, ClipboardEventEmitter clipboardEventEmitter) {
            ClipDescription primaryClipDescription;
            if (clipboardModule.getAppContext().getHasActiveReactInstance()) {
                ClipboardManager clipboardManager = clipboardEventEmitter.maybeClipboardManager;
                if (!clipboardEventEmitter.isListening) {
                    clipboardManager = null;
                }
                if (clipboardManager == null || (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) == null) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    if (clipboardEventEmitter.timestamp == primaryClipDescription.getTimestamp()) {
                        return;
                    } else {
                        clipboardEventEmitter.timestamp = primaryClipDescription.getTimestamp();
                    }
                }
                ContentType contentType = ContentType.PLAIN_TEXT;
                if (!ClipboardModuleKt.getHasTextContent(primaryClipDescription)) {
                    contentType = null;
                }
                ContentType contentType2 = ContentType.HTML;
                if (!primaryClipDescription.hasMimeType("text/html")) {
                    contentType2 = null;
                }
                List listO = AbstractC2800q.o(contentType, contentType2, primaryClipDescription.hasMimeType("image/*") ? ContentType.IMAGE : null);
                ArrayList arrayList = new ArrayList(AbstractC2800q.u(listO, 10));
                Iterator it = listO.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ContentType) it.next()).getJsName());
                }
                clipboardModule.sendEvent(ClipboardModuleKt.CLIPBOARD_CHANGED_EVENT_NAME, D0.c.a(t.a("contentTypes", arrayList)));
            }
        }

        public final Object attachListener() {
            C2735B c2735b;
            ClipboardManager clipboardManager = this.maybeClipboardManager;
            if (clipboardManager != null) {
                clipboardManager.addPrimaryClipChangedListener(this.listener);
                c2735b = C2735B.f28704a;
            } else {
                c2735b = null;
            }
            return c2735b == null ? Integer.valueOf(Log.e(ClipboardModuleKt.TAG, "'CLIPBOARD_SERVICE' unavailable. Events won't be received")) : c2735b;
        }

        public final C2735B detachListener() {
            ClipboardManager clipboardManager = this.maybeClipboardManager;
            if (clipboardManager == null) {
                return null;
            }
            clipboardManager.removePrimaryClipChangedListener(this.listener);
            return C2735B.f28704a;
        }

        public final void pauseListening() {
            this.isListening = false;
        }

        public final void resumeListening() {
            this.isListening = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StringFormat.values().length];
            try {
                iArr[StringFormat.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StringFormat.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File clipboardCacheDir_delegate$lambda$15(ClipboardModule clipboardModule) {
        File file = new File(clipboardModule.getContext().getCacheDir(), ClipboardModuleKt.CLIPBOARD_DIRECTORY_NAME);
        file.mkdirs();
        return file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean clipboardHasItemWithType(String mimeType) {
        ClipDescription primaryClipDescription = getClipboardManager().getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType(mimeType);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getClipboardCacheDir() {
        return (File) this.clipboardCacheDir.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClipboardManager getClipboardManager() throws ClipboardUnavailableException {
        Object systemService = getContext().getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        throw new ClipboardUnavailableException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new IllegalArgumentException("React Application Context is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClipData.Item getFirstItem(ClipboardManager clipboardManager) {
        ClipData primaryClip = clipboardManager.getPrimaryClip();
        if (primaryClip != null) {
            if (primaryClip.getItemCount() <= 0) {
                primaryClip = null;
            }
            if (primaryClip != null) {
                return primaryClip.getItemAt(0);
            }
        }
        return null;
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        Class cls;
        AsyncFunctionComponent intAsyncFunctionComponent;
        Class cls2;
        AnyTypeProvider anyTypeProvider;
        Boolean bool;
        Class cls3;
        Class cls4;
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoClipboard");
            boolean zB = AbstractC2855l.b(GetStringOptions.class, Promise.class);
            Class cls5 = Integer.TYPE;
            Class cls6 = Float.TYPE;
            Class cls7 = Double.TYPE;
            Class cls8 = Boolean.TYPE;
            if (zB) {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("getStringAsync", new AnyType[0], new Function2() { // from class: expo.modules.clipboard.ClipboardModule$definition$lambda$12$$inlined$AsyncFunction$1
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(Object[] objArr, Promise promise) {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        ClipboardModule clipboardModule = this.this$0;
                        ClipData.Item firstItem = clipboardModule.getFirstItem(clipboardModule.getClipboardManager());
                        int i10 = ClipboardModule.WhenMappings.$EnumSwitchMapping$0[((GetStringOptions) promise).getPreferredFormat().ordinal()];
                        if (i10 == 1) {
                            if (firstItem != null) {
                                ClipboardModuleKt.coerceToPlainText(firstItem, this.this$0.getContext());
                            }
                        } else {
                            if (i10 != 2) {
                                throw new C2750m();
                            }
                            if (firstItem != null) {
                                firstItem.coerceToHtmlText(this.this$0.getContext());
                            }
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Object[]) obj, (Promise) obj2);
                        return C2735B.f28704a;
                    }
                });
                cls = GetImageOptions.class;
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
                cls = GetImageOptions.class;
                AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(GetStringOptions.class), Boolean.FALSE));
                if (anyType == null) {
                    anyType = new AnyType(new LazyKType(D.b(GetStringOptions.class), false, new InterfaceC3487a() { // from class: expo.modules.clipboard.ClipboardModule$definition$lambda$12$$inlined$AsyncFunction$2
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(GetStringOptions.class);
                        }
                    }), converters);
                }
                AnyType[] anyTypeArr = {anyType};
                Function1 function1 = new Function1() { // from class: expo.modules.clipboard.ClipboardModule$definition$lambda$12$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final String invoke(Object[] objArr) {
                        AbstractC2855l.g(objArr, "<destruct>");
                        GetStringOptions getStringOptions = (GetStringOptions) objArr[0];
                        ClipboardModule clipboardModule = this.this$0;
                        ClipData.Item firstItem = clipboardModule.getFirstItem(clipboardModule.getClipboardManager());
                        int i10 = ClipboardModule.WhenMappings.$EnumSwitchMapping$0[getStringOptions.getPreferredFormat().ordinal()];
                        String strCoerceToPlainText = null;
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new C2750m();
                            }
                            if (firstItem != null) {
                                strCoerceToPlainText = firstItem.coerceToHtmlText(this.this$0.getContext());
                            }
                        } else if (firstItem != null) {
                            strCoerceToPlainText = ClipboardModuleKt.coerceToPlainText(firstItem, this.this$0.getContext());
                        }
                        return strCoerceToPlainText == null ? PointerEventHelper.POINTER_TYPE_UNKNOWN : strCoerceToPlainText;
                    }
                };
                intAsyncFunctionComponent = AbstractC2855l.b(String.class, cls5) ? new IntAsyncFunctionComponent("getStringAsync", anyTypeArr, function1) : AbstractC2855l.b(String.class, cls8) ? new BoolAsyncFunctionComponent("getStringAsync", anyTypeArr, function1) : AbstractC2855l.b(String.class, cls7) ? new DoubleAsyncFunctionComponent("getStringAsync", anyTypeArr, function1) : AbstractC2855l.b(String.class, cls6) ? new FloatAsyncFunctionComponent("getStringAsync", anyTypeArr, function1) : AbstractC2855l.b(String.class, String.class) ? new StringAsyncFunctionComponent("getStringAsync", anyTypeArr, function1) : new UntypedAsyncFunctionComponent("getStringAsync", anyTypeArr, function1);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getStringAsync", intAsyncFunctionComponent);
            TypeConverterProvider converters2 = moduleDefinitionBuilder.getConverters();
            AnyTypeProvider anyTypeProvider2 = AnyTypeProvider.INSTANCE;
            C7.d dVarB = D.b(String.class);
            Boolean bool2 = Boolean.FALSE;
            AnyType anyType2 = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, bool2));
            if (anyType2 == null) {
                cls2 = SetStringOptions.class;
                anyTypeProvider = anyTypeProvider2;
                anyType2 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.clipboard.ClipboardModule$definition$lambda$12$$inlined$AsyncFunction$4
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters2);
            } else {
                cls2 = SetStringOptions.class;
                anyTypeProvider = anyTypeProvider2;
            }
            AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls2), bool2));
            if (anyType3 == null) {
                ClipboardModule$definition$lambda$12$$inlined$AsyncFunction$5 clipboardModule$definition$lambda$12$$inlined$AsyncFunction$5 = new InterfaceC3487a() { // from class: expo.modules.clipboard.ClipboardModule$definition$lambda$12$$inlined$AsyncFunction$5
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(SetStringOptions.class);
                    }
                };
                C7.d dVarB2 = D.b(cls2);
                bool = bool2;
                anyType3 = new AnyType(new LazyKType(dVarB2, false, clipboardModule$definition$lambda$12$$inlined$AsyncFunction$5), converters2);
            } else {
                bool = bool2;
            }
            AnyType[] anyTypeArr2 = {anyType2, anyType3};
            Function1 function12 = new Function1() { // from class: expo.modules.clipboard.ClipboardModule$definition$lambda$12$$inlined$AsyncFunction$6
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Object[] objArr) {
                    ClipData clipDataNewPlainText;
                    AbstractC2855l.g(objArr, "<destruct>");
                    String str = (String) objArr[0];
                    int i10 = ClipboardModule.WhenMappings.$EnumSwitchMapping$0[((SetStringOptions) objArr[1]).getInputFormat().ordinal()];
                    if (i10 == 1) {
                        clipDataNewPlainText = ClipData.newPlainText(null, str);
                    } else {
                        if (i10 != 2) {
                            throw new C2750m();
                        }
                        clipDataNewPlainText = ClipData.newHtmlText(null, ClipboardModuleKt.plainTextFromHtml(str), str);
                    }
                    this.this$0.getClipboardManager().setPrimaryClip(clipDataNewPlainText);
                    return Boolean.TRUE;
                }
            };
            moduleDefinitionBuilder.getAsyncFunctions().put("setStringAsync", AbstractC2855l.b(Boolean.class, cls5) ? new IntAsyncFunctionComponent("setStringAsync", anyTypeArr2, function12) : AbstractC2855l.b(Boolean.class, cls8) ? new BoolAsyncFunctionComponent("setStringAsync", anyTypeArr2, function12) : AbstractC2855l.b(Boolean.class, cls7) ? new DoubleAsyncFunctionComponent("setStringAsync", anyTypeArr2, function12) : AbstractC2855l.b(Boolean.class, cls6) ? new FloatAsyncFunctionComponent("setStringAsync", anyTypeArr2, function12) : AbstractC2855l.b(Boolean.class, String.class) ? new StringAsyncFunctionComponent("setStringAsync", anyTypeArr2, function12) : new UntypedAsyncFunctionComponent("setStringAsync", anyTypeArr2, function12));
            AnyType[] anyTypeArr3 = new AnyType[0];
            Function1 function13 = new Function1() { // from class: expo.modules.clipboard.ClipboardModule$definition$lambda$12$$inlined$AsyncFunction$7
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    ClipDescription primaryClipDescription = this.this$0.getClipboardManager().getPrimaryClipDescription();
                    return Boolean.valueOf(primaryClipDescription != null ? ClipboardModuleKt.getHasTextContent(primaryClipDescription) : false);
                }
            };
            moduleDefinitionBuilder.getAsyncFunctions().put("hasStringAsync", AbstractC2855l.b(Boolean.class, cls5) ? new IntAsyncFunctionComponent("hasStringAsync", anyTypeArr3, function13) : AbstractC2855l.b(Boolean.class, cls8) ? new BoolAsyncFunctionComponent("hasStringAsync", anyTypeArr3, function13) : AbstractC2855l.b(Boolean.class, cls7) ? new DoubleAsyncFunctionComponent("hasStringAsync", anyTypeArr3, function13) : AbstractC2855l.b(Boolean.class, cls6) ? new FloatAsyncFunctionComponent("hasStringAsync", anyTypeArr3, function13) : AbstractC2855l.b(Boolean.class, String.class) ? new StringAsyncFunctionComponent("hasStringAsync", anyTypeArr3, function13) : new UntypedAsyncFunctionComponent("hasStringAsync", anyTypeArr3, function13));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction = moduleDefinitionBuilder.AsyncFunction("getImageAsync");
            String name = asyncFunctionBuilderAsyncFunction.getName();
            TypeConverterProvider converters3 = asyncFunctionBuilderAsyncFunction.getConverters();
            Boolean bool3 = bool;
            AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls), bool3));
            if (anyType4 == null) {
                ClipboardModule$definition$lambda$12$$inlined$Coroutine$1 clipboardModule$definition$lambda$12$$inlined$Coroutine$1 = new InterfaceC3487a() { // from class: expo.modules.clipboard.ClipboardModule$definition$lambda$12$$inlined$Coroutine$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(GetImageOptions.class);
                    }
                };
                cls4 = String.class;
                C7.d dVarB3 = D.b(cls);
                cls3 = cls6;
                anyType4 = new AnyType(new LazyKType(dVarB3, false, clipboardModule$definition$lambda$12$$inlined$Coroutine$1), converters3);
            } else {
                cls3 = cls6;
                cls4 = String.class;
            }
            asyncFunctionBuilderAsyncFunction.setAsyncFunctionComponent(new SuspendFunctionComponent(name, new AnyType[]{anyType4}, new ClipboardModule$definition$lambda$12$$inlined$Coroutine$2(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction2 = moduleDefinitionBuilder.AsyncFunction("setImageAsync");
            String name2 = asyncFunctionBuilderAsyncFunction2.getName();
            TypeConverterProvider converters4 = asyncFunctionBuilderAsyncFunction2.getConverters();
            AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls4), bool3));
            if (anyType5 == null) {
                anyType5 = new AnyType(new LazyKType(D.b(cls4), false, new InterfaceC3487a() { // from class: expo.modules.clipboard.ClipboardModule$definition$lambda$12$$inlined$Coroutine$3
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters4);
            }
            asyncFunctionBuilderAsyncFunction2.setAsyncFunctionComponent(new SuspendFunctionComponent(name2, new AnyType[]{anyType5}, new ClipboardModule$definition$lambda$12$$inlined$Coroutine$4(null, this)));
            AnyType[] anyTypeArr4 = new AnyType[0];
            Function1 function14 = new Function1() { // from class: expo.modules.clipboard.ClipboardModule$definition$lambda$12$$inlined$AsyncFunction$8
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    ClipDescription primaryClipDescription = this.this$0.getClipboardManager().getPrimaryClipDescription();
                    boolean z10 = false;
                    if (primaryClipDescription != null && primaryClipDescription.hasMimeType("image/*")) {
                        z10 = true;
                    }
                    return Boolean.valueOf(z10);
                }
            };
            moduleDefinitionBuilder.getAsyncFunctions().put("hasImageAsync", AbstractC2855l.b(Boolean.class, cls5) ? new IntAsyncFunctionComponent("hasImageAsync", anyTypeArr4, function14) : AbstractC2855l.b(Boolean.class, cls8) ? new BoolAsyncFunctionComponent("hasImageAsync", anyTypeArr4, function14) : AbstractC2855l.b(Boolean.class, cls7) ? new DoubleAsyncFunctionComponent("hasImageAsync", anyTypeArr4, function14) : AbstractC2855l.b(Boolean.class, cls3) ? new FloatAsyncFunctionComponent("hasImageAsync", anyTypeArr4, function14) : AbstractC2855l.b(Boolean.class, cls4) ? new StringAsyncFunctionComponent("hasImageAsync", anyTypeArr4, function14) : new UntypedAsyncFunctionComponent("hasImageAsync", anyTypeArr4, function14));
            moduleDefinitionBuilder.Events(ClipboardModuleKt.CLIPBOARD_CHANGED_EVENT_NAME);
            Map<EventName, EventListener> eventListeners = moduleDefinitionBuilder.getEventListeners();
            EventName eventName = EventName.MODULE_CREATE;
            eventListeners.put(eventName, new BasicEventListener(eventName, new InterfaceC3487a() { // from class: expo.modules.clipboard.ClipboardModule$definition$lambda$12$$inlined$OnCreate$1
                @Override // w7.InterfaceC3487a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m29invoke();
                    return C2735B.f28704a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m29invoke() {
                    ClipboardModule clipboardModule = this.this$0;
                    clipboardModule.clipboardEventEmitter = clipboardModule.new ClipboardEventEmitter();
                    ClipboardModule.ClipboardEventEmitter clipboardEventEmitter = this.this$0.clipboardEventEmitter;
                    if (clipboardEventEmitter == null) {
                        AbstractC2855l.y("clipboardEventEmitter");
                        clipboardEventEmitter = null;
                    }
                    clipboardEventEmitter.attachListener();
                }
            }));
            Map<EventName, EventListener> eventListeners2 = moduleDefinitionBuilder.getEventListeners();
            EventName eventName2 = EventName.MODULE_DESTROY;
            eventListeners2.put(eventName2, new BasicEventListener(eventName2, new InterfaceC3487a() { // from class: expo.modules.clipboard.ClipboardModule$definition$lambda$12$$inlined$OnDestroy$1
                @Override // w7.InterfaceC3487a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m30invoke();
                    return C2735B.f28704a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m30invoke() {
                    ClipboardModule.ClipboardEventEmitter clipboardEventEmitter = this.this$0.clipboardEventEmitter;
                    if (clipboardEventEmitter == null) {
                        AbstractC2855l.y("clipboardEventEmitter");
                        clipboardEventEmitter = null;
                    }
                    clipboardEventEmitter.detachListener();
                }
            }));
            Map<EventName, EventListener> eventListeners3 = moduleDefinitionBuilder.getEventListeners();
            EventName eventName3 = EventName.ACTIVITY_ENTERS_BACKGROUND;
            eventListeners3.put(eventName3, new BasicEventListener(eventName3, new InterfaceC3487a() { // from class: expo.modules.clipboard.ClipboardModule$definition$lambda$12$$inlined$OnActivityEntersBackground$1
                @Override // w7.InterfaceC3487a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m27invoke();
                    return C2735B.f28704a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m27invoke() {
                    ClipboardModule.ClipboardEventEmitter clipboardEventEmitter = this.this$0.clipboardEventEmitter;
                    if (clipboardEventEmitter == null) {
                        AbstractC2855l.y("clipboardEventEmitter");
                        clipboardEventEmitter = null;
                    }
                    clipboardEventEmitter.pauseListening();
                }
            }));
            Map<EventName, EventListener> eventListeners4 = moduleDefinitionBuilder.getEventListeners();
            EventName eventName4 = EventName.ACTIVITY_ENTERS_FOREGROUND;
            eventListeners4.put(eventName4, new BasicEventListener(eventName4, new InterfaceC3487a() { // from class: expo.modules.clipboard.ClipboardModule$definition$lambda$12$$inlined$OnActivityEntersForeground$1
                @Override // w7.InterfaceC3487a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m28invoke();
                    return C2735B.f28704a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m28invoke() {
                    ClipboardModule.ClipboardEventEmitter clipboardEventEmitter = this.this$0.clipboardEventEmitter;
                    if (clipboardEventEmitter == null) {
                        AbstractC2855l.y("clipboardEventEmitter");
                        clipboardEventEmitter = null;
                    }
                    clipboardEventEmitter.resumeListening();
                }
            }));
            ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder.buildModule();
            AbstractC2861a.f();
            return moduleDefinitionDataBuildModule;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }
}
