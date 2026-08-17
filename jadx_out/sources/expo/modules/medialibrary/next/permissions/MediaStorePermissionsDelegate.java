package expo.modules.medialibrary.next.permissions;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.facebook.react.uimanager.drawable.OutsetBoxShadowDrawableKt;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.ov.message.BuildConfig;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.activityresult.AppContextActivityResultCaller;
import expo.modules.kotlin.activityresult.AppContextActivityResultLauncher;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.providers.AppContextProvider;
import expo.modules.medialibrary.MediaLibraryConstantsKt;
import expo.modules.medialibrary.PermissionsException;
import expo.modules.medialibrary.next.permissions.contracts.DeleteContract;
import expo.modules.medialibrary.next.permissions.contracts.DeleteContractInput;
import expo.modules.medialibrary.next.permissions.contracts.WriteContract;
import expo.modules.medialibrary.next.permissions.contracts.WriteContractInput;
import i7.AbstractC2753p;
import i7.C2735B;
import i7.C2752o;
import j7.AbstractC2800q;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0087@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0011\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0016\u001a\u00020\r*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\b0\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\b0\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010$\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/AppContext;", "appContext", "<init>", "(Lexpo/modules/kotlin/AppContext;)V", "Landroid/net/Uri;", "uri", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hasWritePermissionForUri", "(Landroid/net/Uri;)Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "uris", "Li7/B;", "launchMediaStoreDeleteRequest", "(Ljava/util/List;Ln7/f;)Ljava/lang/Object;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "requestMediaLibraryWritePermission", "(Ljava/lang/Iterable;Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;", "Lexpo/modules/kotlin/providers/AppContextProvider;", "appContextProvider", "registerMediaStoreContracts", "(Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;Lexpo/modules/kotlin/providers/AppContextProvider;Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/kotlin/AppContext;", "getAppContext", "()Lexpo/modules/kotlin/AppContext;", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;", "Lexpo/modules/medialibrary/next/permissions/contracts/DeleteContractInput;", "deleteLauncher", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;", "Lexpo/modules/medialibrary/next/permissions/contracts/WriteContractInput;", "writeLauncher", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MediaStorePermissionsDelegate {
    private final AppContext appContext;
    private AppContextActivityResultLauncher<DeleteContractInput, Boolean> deleteLauncher;
    private AppContextActivityResultLauncher<WriteContractInput, Boolean> writeLauncher;

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.permissions.MediaStorePermissionsDelegate$launchMediaStoreDeleteRequest$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.permissions.MediaStorePermissionsDelegate", f = "MediaStorePermissionsDelegate.kt", l = {OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION}, m = "launchMediaStoreDeleteRequest")
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
            return MediaStorePermissionsDelegate.this.launchMediaStoreDeleteRequest(null, this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.permissions.MediaStorePermissionsDelegate$registerMediaStoreContracts$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.permissions.MediaStorePermissionsDelegate", f = "MediaStorePermissionsDelegate.kt", l = {52, 53}, m = "registerMediaStoreContracts")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C25621 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C25621(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return MediaStorePermissionsDelegate.this.registerMediaStoreContracts(null, null, this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.permissions.MediaStorePermissionsDelegate$requestMediaLibraryWritePermission$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.permissions.MediaStorePermissionsDelegate", f = "MediaStorePermissionsDelegate.kt", l = {BuildConfig.VERSION_CODE}, m = "requestMediaLibraryWritePermission")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C25631 extends d {
        int label;
        /* synthetic */ Object result;

        C25631(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return MediaStorePermissionsDelegate.this.requestMediaLibraryWritePermission(null, this);
        }
    }

    public MediaStorePermissionsDelegate(AppContext appContext) {
        AbstractC2855l.g(appContext, "appContext");
        this.appContext = appContext;
    }

    private final Context getContext() throws Exceptions.ReactContextLost {
        Context reactContext = this.appContext.getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    private final boolean hasWritePermissionForUri(Uri uri) {
        try {
            C2752o.a aVar = C2752o.f28721h;
            OutputStream outputStreamOpenOutputStream = getContext().getContentResolver().openOutputStream(uri, "rw");
            if (outputStreamOpenOutputStream == null) {
                return true;
            }
            outputStreamOpenOutputStream.close();
            return true;
        } catch (Throwable th) {
            C2752o.a aVar2 = C2752o.f28721h;
            Object objB = C2752o.b(AbstractC2753p.a(th));
            Boolean bool = Boolean.FALSE;
            if (C2752o.f(objB)) {
                objB = bool;
            }
            return ((Boolean) objB).booleanValue();
        }
    }

    public final AppContext getAppContext() {
        return this.appContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object launchMediaStoreDeleteRequest(List<? extends Uri> list, n7.f fVar) throws PermissionsException {
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
        Object objLaunch = anonymousClass1.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            AbstractC2753p.b(objLaunch);
            AppContextActivityResultLauncher<DeleteContractInput, Boolean> appContextActivityResultLauncher = this.deleteLauncher;
            if (appContextActivityResultLauncher == null) {
                AbstractC2855l.y("deleteLauncher");
                appContextActivityResultLauncher = null;
            }
            DeleteContractInput deleteContractInput = new DeleteContractInput(AbstractC2800q.P0(list));
            anonymousClass1.label = 1;
            objLaunch = appContextActivityResultLauncher.launch(deleteContractInput, anonymousClass1);
            if (objLaunch == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objLaunch);
        }
        if (((Boolean) objLaunch).booleanValue()) {
            return C2735B.f28704a;
        }
        throw new PermissionsException(MediaLibraryConstantsKt.ERROR_USER_DID_NOT_GRANT_WRITE_PERMISSIONS_MESSAGE);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object registerMediaStoreContracts(AppContextActivityResultCaller appContextActivityResultCaller, AppContextProvider appContextProvider, n7.f fVar) {
        C25621 c25621;
        AppContextActivityResultCaller appContextActivityResultCaller2;
        MediaStorePermissionsDelegate mediaStorePermissionsDelegate;
        MediaStorePermissionsDelegate mediaStorePermissionsDelegate2;
        if (fVar instanceof C25621) {
            c25621 = (C25621) fVar;
            int i10 = c25621.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                c25621.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                c25621 = new C25621(fVar);
            }
        }
        C25621 c256212 = c25621;
        Object objRegisterForActivityResult$default = c256212.result;
        Object objE = AbstractC3016b.e();
        int i11 = c256212.label;
        if (i11 == 0) {
            AbstractC2753p.b(objRegisterForActivityResult$default);
            DeleteContract deleteContract = new DeleteContract(appContextProvider);
            c256212.L$0 = appContextActivityResultCaller;
            c256212.L$1 = appContextProvider;
            c256212.L$2 = this;
            c256212.label = 1;
            appContextActivityResultCaller2 = appContextActivityResultCaller;
            objRegisterForActivityResult$default = AppContextActivityResultCaller.DefaultImpls.registerForActivityResult$default(appContextActivityResultCaller2, deleteContract, null, c256212, 2, null);
            if (objRegisterForActivityResult$default != objE) {
                mediaStorePermissionsDelegate = this;
            }
            return objE;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mediaStorePermissionsDelegate2 = (MediaStorePermissionsDelegate) c256212.L$0;
            AbstractC2753p.b(objRegisterForActivityResult$default);
            mediaStorePermissionsDelegate2.writeLauncher = (AppContextActivityResultLauncher) objRegisterForActivityResult$default;
            return C2735B.f28704a;
        }
        mediaStorePermissionsDelegate = (MediaStorePermissionsDelegate) c256212.L$2;
        appContextProvider = (AppContextProvider) c256212.L$1;
        appContextActivityResultCaller2 = (AppContextActivityResultCaller) c256212.L$0;
        AbstractC2753p.b(objRegisterForActivityResult$default);
        mediaStorePermissionsDelegate.deleteLauncher = (AppContextActivityResultLauncher) objRegisterForActivityResult$default;
        WriteContract writeContract = new WriteContract(appContextProvider);
        c256212.L$0 = this;
        c256212.L$1 = null;
        c256212.L$2 = null;
        c256212.label = 2;
        objRegisterForActivityResult$default = AppContextActivityResultCaller.DefaultImpls.registerForActivityResult$default(appContextActivityResultCaller2, writeContract, null, c256212, 2, null);
        if (objRegisterForActivityResult$default != objE) {
            mediaStorePermissionsDelegate2 = this;
            mediaStorePermissionsDelegate2.writeLauncher = (AppContextActivityResultLauncher) objRegisterForActivityResult$default;
            return C2735B.f28704a;
        }
        return objE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestMediaLibraryWritePermission(Iterable<? extends Uri> iterable, n7.f fVar) throws PermissionsException {
        C25631 c25631;
        if (fVar instanceof C25631) {
            c25631 = (C25631) fVar;
            int i10 = c25631.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                c25631.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                c25631 = new C25631(fVar);
            }
        }
        Object objLaunch = c25631.result;
        Object objE = AbstractC3016b.e();
        int i11 = c25631.label;
        if (i11 == 0) {
            AbstractC2753p.b(objLaunch);
            if (Build.VERSION.SDK_INT < 30) {
                return C2735B.f28704a;
            }
            ArrayList arrayList = new ArrayList();
            for (Uri uri : iterable) {
                if (!hasWritePermissionForUri(uri)) {
                    arrayList.add(uri);
                }
            }
            if (arrayList.isEmpty()) {
                return C2735B.f28704a;
            }
            AppContextActivityResultLauncher<WriteContractInput, Boolean> appContextActivityResultLauncher = this.writeLauncher;
            if (appContextActivityResultLauncher == null) {
                AbstractC2855l.y("writeLauncher");
                appContextActivityResultLauncher = null;
            }
            WriteContractInput writeContractInput = new WriteContractInput(arrayList);
            c25631.label = 1;
            objLaunch = appContextActivityResultLauncher.launch(writeContractInput, c25631);
            if (objLaunch == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objLaunch);
        }
        if (((Boolean) objLaunch).booleanValue()) {
            return C2735B.f28704a;
        }
        throw new PermissionsException(MediaLibraryConstantsKt.ERROR_USER_DID_NOT_GRANT_WRITE_PERMISSIONS_MESSAGE);
    }
}
