package expo.modules.asset;

import C7.o;
import P8.C1385d;
import P8.q;
import R8.AbstractC1413i;
import R8.N;
import android.content.Context;
import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionBuilder;
import expo.modules.kotlin.functions.SuspendFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.services.FilePermissionService;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2793j;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import l1.AbstractC2861a;
import n7.j;
import o7.AbstractC3016b;
import t7.AbstractC3375b;
import t7.AbstractC3376c;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lexpo/modules/asset/AssetModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "Ljava/net/URI;", "uri", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getMD5HashOfFilePath", "(Ljava/net/URI;)Ljava/lang/String;", "Lexpo/modules/kotlin/AppContext;", "appContext", "Ljava/io/File;", "localUrl", "Landroid/net/Uri;", "downloadAsset", "(Lexpo/modules/kotlin/AppContext;Ljava/net/URI;Ljava/io/File;Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "expo-asset_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AssetModule extends Module {

    /* JADX INFO: renamed from: expo.modules.asset.AssetModule$downloadAsset$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.asset.AssetModule", f = "AssetModule.kt", l = {41}, m = "downloadAsset")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass1 extends d {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return AssetModule.this.downloadAsset(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.asset.AssetModule$downloadAsset$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.asset.AssetModule$downloadAsset$2", f = "AssetModule.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LR8/N;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "<anonymous>", "(LR8/N;)Landroid/net/Uri;"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass2 extends l implements Function2 {
        final /* synthetic */ File $localUrl;
        final /* synthetic */ URI $uri;
        int label;
        final /* synthetic */ AssetModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(URI uri, AssetModule assetModule, File file, n7.f fVar) {
            super(2, fVar);
            this.$uri = uri;
            this.this$0 = assetModule;
            this.$localUrl = file;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return new AnonymousClass2(this.$uri, this.this$0, this.$localUrl, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws UnableToDownloadAssetException {
            InputStream inputStreamOpenStream;
            AbstractC3016b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            try {
                String string = this.$uri.toString();
                AbstractC2855l.f(string, "toString(...)");
                if (q.Q(string, ":", false, 2, null)) {
                    String string2 = this.$uri.toString();
                    AbstractC2855l.f(string2, "toString(...)");
                    if (q.K(string2, ResourceAssetKt.ANDROID_EMBEDDED_URL_BASE_RESOURCE, false, 2, null)) {
                        Context context = this.this$0.getContext();
                        String string3 = this.$uri.toString();
                        AbstractC2855l.f(string3, "toString(...)");
                        inputStreamOpenStream = ResourceAssetKt.openAndroidResStream(context, string3);
                    } else {
                        inputStreamOpenStream = this.$uri.toURL().openStream();
                    }
                } else {
                    Context context2 = this.this$0.getContext();
                    String string4 = this.$uri.toString();
                    AbstractC2855l.f(string4, "toString(...)");
                    inputStreamOpenStream = ResourceAssetKt.openAssetResourceStream(context2, string4);
                }
                File file = this.$localUrl;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        AbstractC2855l.d(inputStreamOpenStream);
                        if (AbstractC3375b.b(inputStreamOpenStream, fileOutputStream, 0, 2, null) == 0) {
                            Objects.toString(file);
                        }
                        C2735B c2735b = C2735B.f28704a;
                        AbstractC3376c.a(fileOutputStream, null);
                        AbstractC3376c.a(inputStreamOpenStream, null);
                        return Uri.fromFile(this.$localUrl);
                    } finally {
                    }
                } finally {
                }
            } catch (Exception unused) {
                String string5 = this.$uri.toString();
                AbstractC2855l.f(string5, "toString(...)");
                throw new UnableToDownloadAssetException(string5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object downloadAsset(AppContext appContext, URI uri, File file, n7.f fVar) throws UnableToDownloadAssetException, Exceptions.AppContextLost {
        AnonymousClass1 anonymousClass1;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                anonymousClass1.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        }
        Object objG = anonymousClass1.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            AbstractC2753p.b(objG);
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.exists()) {
                file.mkdirs();
            }
            FilePermissionService filePermission = appContext.getFilePermission();
            Context context = getContext();
            String parent = file.getParent();
            if (parent == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (!filePermission.getPathPermissions(context, parent).contains(FilePermissionService.Permission.WRITE)) {
                String string = uri.toString();
                AbstractC2855l.f(string, "toString(...)");
                throw new UnableToDownloadAssetException(string);
            }
            j jVarI = appContext.getBackgroundCoroutineScope().i();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(uri, this, file, null);
            anonymousClass1.label = 1;
            objG = AbstractC1413i.g(jVarI, anonymousClass2, anonymousClass1);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objG);
        }
        AbstractC2855l.f(objG, "withContext(...)");
        return objG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() throws Exceptions.AppContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.AppContextLost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getMD5HashOfFilePath(URI uri) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        String string = uri.toString();
        AbstractC2855l.f(string, "toString(...)");
        byte[] bytes = string.getBytes(C1385d.f8858b);
        AbstractC2855l.f(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        AbstractC2855l.f(bArrDigest, "digest(...)");
        return AbstractC2793j.Y(bArrDigest, PointerEventHelper.POINTER_TYPE_UNKNOWN, null, null, 0, null, new Function1() { // from class: expo.modules.asset.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetModule.getMD5HashOfFilePath$lambda$0(((Byte) obj).byteValue());
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence getMD5HashOfFilePath$lambda$0(byte b10) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
        AbstractC2855l.f(str, "format(...)");
        return str;
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoAsset");
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction = moduleDefinitionBuilder.AsyncFunction("downloadAsync");
            String name = asyncFunctionBuilderAsyncFunction.getName();
            TypeConverterProvider converters = asyncFunctionBuilderAsyncFunction.getConverters();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            C7.d dVarB = D.b(URI.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(D.b(URI.class), false, new InterfaceC3487a() { // from class: expo.modules.asset.AssetModule$definition$lambda$2$$inlined$Coroutine$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(URI.class);
                    }
                }), converters);
            }
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), Boolean.TRUE));
            if (anyType2 == null) {
                anyType2 = new AnyType(new LazyKType(D.b(String.class), true, new InterfaceC3487a() { // from class: expo.modules.asset.AssetModule$definition$lambda$2$$inlined$Coroutine$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), converters);
            }
            AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), bool));
            if (anyType3 == null) {
                anyType3 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.asset.AssetModule$definition$lambda$2$$inlined$Coroutine$3
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters);
            }
            asyncFunctionBuilderAsyncFunction.setAsyncFunctionComponent(new SuspendFunctionComponent(name, new AnyType[]{anyType, anyType2, anyType3}, new AssetModule$definition$lambda$2$$inlined$Coroutine$4(null, this)));
            ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder.buildModule();
            AbstractC2861a.f();
            return moduleDefinitionDataBuildModule;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }
}
