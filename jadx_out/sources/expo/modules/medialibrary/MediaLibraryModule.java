package expo.modules.medialibrary;

import C7.o;
import C7.q;
import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.activityresult.AppContextActivityResultLauncher;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionBuilder;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.SuspendFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.objects.ConstantComponentBuilder;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.medialibrary.MediaLibraryModule;
import expo.modules.medialibrary.contracts.DeleteContractInput;
import expo.modules.medialibrary.contracts.WriteContractInput;
import i7.AbstractC2746i;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.G;
import l1.AbstractC2861a;
import o7.AbstractC3016b;
import t7.AbstractC3376c;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001?B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0003¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0003¢\u0006\u0004\b\u000e\u0010\fJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001aJ(\u0010!\u001a\u00020\u00112\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010 \u001a\u00020\u0004H\u0082@¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u001c\u0010+\u001a\b\u0018\u00010*R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u0010-\u001a\b\u0018\u00010*R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\"\u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00040.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\"\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u00040.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00101R\u001b\u00106\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u001aR!\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b8\u00109R\u0014\u0010\u0010\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u001aR\u0014\u0010>\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u001a¨\u0006@"}, d2 = {"Lexpo/modules/medialibrary/MediaLibraryModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "writeOnly", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/medialibrary/GranularPermission;", "granularPermissions", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "getManifestPermissions", "(ZLjava/util/List;)[Ljava/lang/String;", "shouldIncludeGranular", "getGranularPermissions", "Landroid/content/Context;", "context", "Li7/B;", "assertGranularPermissionIntegrity", "(Landroid/content/Context;Ljava/util/List;)V", "getManifestDeclaredPermissions", "(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;", "isWritePermissionRequired", "requireSystemPermissions", "(Z)V", "hasReadPermissions", "()Z", "permissions", "maybeThrowIfExpoGo", "(Ljava/util/List;)V", "hasWritePermissions", "assetIds", "needsDeletePermission", "requestMediaLibraryActionPermission", "([Ljava/lang/String;ZLn7/f;)Ljava/lang/Object;", "Landroid/net/Uri;", "uri", "hasWritePermissionForUri", "(Landroid/net/Uri;)Z", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "Lexpo/modules/medialibrary/MediaLibraryModule$MediaStoreContentObserver;", "imagesObserver", "Lexpo/modules/medialibrary/MediaLibraryModule$MediaStoreContentObserver;", "videosObserver", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;", "Lexpo/modules/medialibrary/contracts/DeleteContractInput;", "deleteLauncher", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;", "Lexpo/modules/medialibrary/contracts/WriteContractInput;", "writeLauncher", "isExpoGo$delegate", "Lkotlin/Lazy;", "isExpoGo", "allowedPermissionsList$delegate", "getAllowedPermissionsList", "()Ljava/util/List;", "allowedPermissionsList", "getContext", "()Landroid/content/Context;", "isMissingPermissions", "isMissingWritePermission", "MediaStoreContentObserver", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MediaLibraryModule extends Module {
    private AppContextActivityResultLauncher<DeleteContractInput, Boolean> deleteLauncher;
    private MediaStoreContentObserver imagesObserver;
    private MediaStoreContentObserver videosObserver;
    private AppContextActivityResultLauncher<WriteContractInput, Boolean> writeLauncher;

    /* JADX INFO: renamed from: isExpoGo$delegate, reason: from kotlin metadata */
    private final Lazy isExpoGo = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.medialibrary.a
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return Boolean.valueOf(MediaLibraryModule.isExpoGo_delegate$lambda$0(this.f26660g));
        }
    });

    /* JADX INFO: renamed from: allowedPermissionsList$delegate, reason: from kotlin metadata */
    private final Lazy allowedPermissionsList = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.medialibrary.b
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return MediaLibraryModule.allowedPermissionsList_delegate$lambda$1(this.f26663g);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u000e\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lexpo/modules/medialibrary/MediaLibraryModule$MediaStoreContentObserver;", "Landroid/database/ContentObserver;", "Landroid/os/Handler;", "handler", PointerEventHelper.POINTER_TYPE_UNKNOWN, "mMediaType", "<init>", "(Lexpo/modules/medialibrary/MediaLibraryModule;Landroid/os/Handler;I)V", "mediaType", "getAssetsTotalCount", "(I)I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "selfChange", "Li7/B;", "onChange", "(Z)V", "Landroid/net/Uri;", "uri", "(ZLandroid/net/Uri;)V", "I", "mAssetsTotalCount", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class MediaStoreContentObserver extends ContentObserver {
        private int mAssetsTotalCount;
        private final int mMediaType;
        final /* synthetic */ MediaLibraryModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaStoreContentObserver(MediaLibraryModule mediaLibraryModule, Handler handler, int i10) {
            super(handler);
            AbstractC2855l.g(handler, "handler");
            this.this$0 = mediaLibraryModule;
            this.mMediaType = i10;
            this.mAssetsTotalCount = getAssetsTotalCount(i10);
        }

        private final int getAssetsTotalCount(int mediaType) throws IOException {
            int count = 0;
            Cursor cursorQuery = this.this$0.getContext().getContentResolver().query(MediaLibraryConstantsKt.getEXTERNAL_CONTENT_URI(), new String[0], "media_type == " + mediaType, null, null);
            if (cursorQuery != null) {
                try {
                    count = cursorQuery.getCount();
                } finally {
                }
            }
            AbstractC3376c.a(cursorQuery, null);
            return count;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange) throws IOException {
            onChange(selfChange, null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange, Uri uri) throws IOException {
            int assetsTotalCount = getAssetsTotalCount(this.mMediaType);
            if (this.mAssetsTotalCount != assetsTotalCount) {
                this.mAssetsTotalCount = assetsTotalCount;
                this.this$0.sendEvent(MediaLibraryConstantsKt.LIBRARY_DID_CHANGE_EVENT, new Bundle());
            }
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.MediaLibraryModule$requestMediaLibraryActionPermission$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.MediaLibraryModule", f = "MediaLibraryModule.kt", l = {415, 417}, m = "requestMediaLibraryActionPermission")
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
            return MediaLibraryModule.this.requestMediaLibraryActionPermission(null, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List allowedPermissionsList_delegate$lambda$1(MediaLibraryModule mediaLibraryModule) {
        return mediaLibraryModule.isExpoGo() ? AbstractC2800q.e(GranularPermission.AUDIO) : mediaLibraryModule.getManifestDeclaredPermissions(mediaLibraryModule.getContext(), AbstractC2800q.m(GranularPermission.PHOTO, GranularPermission.VIDEO, GranularPermission.AUDIO));
    }

    private final void assertGranularPermissionIntegrity(Context context, List<? extends GranularPermission> granularPermissions) throws PermissionsException {
        for (GranularPermission granularPermission : granularPermissions) {
            if (!MediaLibraryUtils.INSTANCE.hasManifestPermission(context, granularPermission.toManifestPermission())) {
                throw new PermissionsException("You have requested the " + granularPermission + " permission, but it is not declared in AndroidManifest. Update expo-media-library config plugin to include the permission before requesting it.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<GranularPermission> getAllowedPermissionsList() {
        return (List) this.allowedPermissionsList.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() throws Exceptions.ReactContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    @SuppressLint({"InlinedApi"})
    private final String[] getGranularPermissions(boolean shouldIncludeGranular, List<? extends GranularPermission> granularPermissions) throws PermissionsException {
        if (!shouldIncludeGranular) {
            return new String[0];
        }
        assertGranularPermissionIntegrity(getContext(), granularPermissions);
        return (String[]) AbstractC2800q.o(granularPermissions.contains(GranularPermission.PHOTO) ? "android.permission.READ_MEDIA_IMAGES" : null, granularPermissions.contains(GranularPermission.VIDEO) ? "android.permission.READ_MEDIA_VIDEO" : null, granularPermissions.contains(GranularPermission.AUDIO) ? "android.permission.READ_MEDIA_AUDIO" : null).toArray(new String[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<GranularPermission> getManifestDeclaredPermissions(Context context, List<? extends GranularPermission> granularPermissions) {
        if (Build.VERSION.SDK_INT < 33) {
            return granularPermissions;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : granularPermissions) {
            if (MediaLibraryUtils.INSTANCE.hasManifestPermission(context, ((GranularPermission) obj).toManifestPermission())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"InlinedApi"})
    public final String[] getManifestPermissions(boolean writeOnly, List<? extends GranularPermission> granularPermissions) {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = i10 >= 29 && MediaLibraryUtils.INSTANCE.hasManifestPermission(getContext(), "android.permission.ACCESS_MEDIA_LOCATION") && !(i10 >= 33 && granularPermissions.size() == 1 && granularPermissions.contains(GranularPermission.AUDIO));
        boolean z11 = i10 < 33 && MediaLibraryUtils.INSTANCE.hasManifestPermission(getContext(), "android.permission.WRITE_EXTERNAL_STORAGE");
        boolean z12 = i10 >= 33;
        boolean z13 = z12 && !writeOnly;
        G g10 = new G(4);
        g10.a(z11 ? "android.permission.WRITE_EXTERNAL_STORAGE" : null);
        g10.a((writeOnly || z12) ? null : "android.permission.READ_EXTERNAL_STORAGE");
        g10.a(z10 ? "android.permission.ACCESS_MEDIA_LOCATION" : null);
        g10.b(getGranularPermissions(z13, granularPermissions));
        return (String[]) AbstractC2800q.o(g10.d(new String[g10.c()])).toArray(new String[0]);
    }

    private final boolean hasReadPermissions() {
        if (Build.VERSION.SDK_INT < 33) {
            String[] strArr = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
            if (getAppContext().getPermissions() != null) {
                return !r1.hasGrantedPermissions((String[]) Arrays.copyOf(strArr, 2));
            }
            return false;
        }
        List<GranularPermission> allowedPermissionsList = getAllowedPermissionsList();
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(allowedPermissionsList, 10));
        Iterator<T> it = allowedPermissionsList.iterator();
        while (it.hasNext()) {
            arrayList.add(((GranularPermission) it.next()).toManifestPermission());
        }
        List<String> listR0 = AbstractC2800q.R0(arrayList);
        if (Build.VERSION.SDK_INT >= 34) {
            listR0.add("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        }
        ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(listR0, 10));
        for (String str : listR0) {
            Permissions permissions = getAppContext().getPermissions();
            arrayList2.add(Boolean.valueOf(permissions != null ? permissions.hasGrantedPermissions(str) : false));
        }
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (((Boolean) it2.next()).booleanValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    private final boolean hasWritePermissionForUri(Uri uri) {
        return getContext().checkUriPermission(uri, Binder.getCallingPid(), Binder.getCallingUid(), 2) == 0;
    }

    private final boolean hasWritePermissions() {
        Permissions permissions;
        if (Build.VERSION.SDK_INT < 33 && (permissions = getAppContext().getPermissions()) != null) {
            return !permissions.hasGrantedPermissions("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        return false;
    }

    private final boolean isExpoGo() {
        return ((Boolean) this.isExpoGo.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isExpoGo_delegate$lambda$0(MediaLibraryModule mediaLibraryModule) {
        return Boolean.parseBoolean(mediaLibraryModule.getContext().getResources().getString(R.string.is_expo_go));
    }

    private final boolean isMissingPermissions() {
        return hasReadPermissions();
    }

    private final boolean isMissingWritePermission() {
        return hasWritePermissions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void maybeThrowIfExpoGo(List<? extends GranularPermission> permissions) throws PermissionsException {
        if (isExpoGo()) {
            if (permissions.contains(GranularPermission.PHOTO) || permissions.contains(GranularPermission.VIDEO)) {
                throw new PermissionsException("Due to changes in Androids permission requirements, Expo Go can no longer provide full access to the media library. To test the full functionality of this module, you can create a development build");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
    
        if (r9 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b1, code lost:
    
        if (r9 == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestMediaLibraryActionPermission(String[] strArr, boolean z10, n7.f fVar) throws PermissionsException, IOException {
        AnonymousClass1 anonymousClass1;
        boolean zBooleanValue;
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
            if (Build.VERSION.SDK_INT < 30) {
                return C2735B.f28704a;
            }
            List<Uri> assetsUris = MediaLibraryUtils.INSTANCE.getAssetsUris(getContext(), strArr);
            ArrayList arrayList = new ArrayList();
            for (Object obj : assetsUris) {
                if (!hasWritePermissionForUri((Uri) obj)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return C2735B.f28704a;
            }
            AppContextActivityResultLauncher appContextActivityResultLauncher = null;
            if (z10) {
                AppContextActivityResultLauncher<DeleteContractInput, Boolean> appContextActivityResultLauncher2 = this.deleteLauncher;
                if (appContextActivityResultLauncher2 == null) {
                    AbstractC2855l.y("deleteLauncher");
                } else {
                    appContextActivityResultLauncher = appContextActivityResultLauncher2;
                }
                DeleteContractInput deleteContractInput = new DeleteContractInput(arrayList);
                anonymousClass1.label = 1;
                objLaunch = appContextActivityResultLauncher.launch(deleteContractInput, anonymousClass1);
            } else {
                AppContextActivityResultLauncher<WriteContractInput, Boolean> appContextActivityResultLauncher3 = this.writeLauncher;
                if (appContextActivityResultLauncher3 == null) {
                    AbstractC2855l.y("writeLauncher");
                } else {
                    appContextActivityResultLauncher = appContextActivityResultLauncher3;
                }
                WriteContractInput writeContractInput = new WriteContractInput(arrayList);
                anonymousClass1.label = 2;
                objLaunch = appContextActivityResultLauncher.launch(writeContractInput, anonymousClass1);
            }
            return objE;
        }
        if (i11 == 1) {
            AbstractC2753p.b(objLaunch);
            zBooleanValue = ((Boolean) objLaunch).booleanValue();
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objLaunch);
            zBooleanValue = ((Boolean) objLaunch).booleanValue();
        }
        if (zBooleanValue) {
            return C2735B.f28704a;
        }
        throw new PermissionsException(MediaLibraryConstantsKt.ERROR_USER_DID_NOT_GRANT_WRITE_PERMISSIONS_MESSAGE);
    }

    static /* synthetic */ Object requestMediaLibraryActionPermission$default(MediaLibraryModule mediaLibraryModule, String[] strArr, boolean z10, n7.f fVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return mediaLibraryModule.requestMediaLibraryActionPermission(strArr, z10, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requireSystemPermissions(boolean isWritePermissionRequired) throws PermissionsException {
        if (isWritePermissionRequired ? isMissingWritePermission() : isMissingPermissions()) {
            throw new PermissionsException(isWritePermissionRequired ? MediaLibraryConstantsKt.ERROR_NO_WRITE_PERMISSION_MESSAGE : MediaLibraryConstantsKt.ERROR_NO_PERMISSIONS_MESSAGE);
        }
    }

    static /* synthetic */ void requireSystemPermissions$default(MediaLibraryModule mediaLibraryModule, boolean z10, int i10, Object obj) throws PermissionsException {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        mediaLibraryModule.requireSystemPermissions(z10);
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        Class cls;
        Class cls2;
        Class cls3;
        Class cls4;
        Class cls5;
        Class cls6;
        Class cls7;
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoMediaLibrary");
            ConstantComponentBuilder constantComponentBuilder = new ConstantComponentBuilder("MediaType");
            constantComponentBuilder.setGetter(new InterfaceC3487a() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$Constant$1
                @Override // w7.InterfaceC3487a
                public final Map<String, ? extends String> invoke() {
                    return MediaType.INSTANCE.getConstants();
                }
            });
            moduleDefinitionBuilder.getConstants().put("MediaType", constantComponentBuilder);
            ConstantComponentBuilder constantComponentBuilder2 = new ConstantComponentBuilder("SortBy");
            constantComponentBuilder2.setGetter(new InterfaceC3487a() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$Constant$2
                @Override // w7.InterfaceC3487a
                public final Map<String, ? extends String> invoke() {
                    return SortBy.INSTANCE.getConstants();
                }
            });
            moduleDefinitionBuilder.getConstants().put("SortBy", constantComponentBuilder2);
            ConstantComponentBuilder constantComponentBuilder3 = new ConstantComponentBuilder("CHANGE_LISTENER_NAME");
            constantComponentBuilder3.setGetter(new InterfaceC3487a() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$Constant$3
                @Override // w7.InterfaceC3487a
                public final String invoke() {
                    return MediaLibraryConstantsKt.LIBRARY_DID_CHANGE_EVENT;
                }
            });
            moduleDefinitionBuilder.getConstants().put("CHANGE_LISTENER_NAME", constantComponentBuilder3);
            moduleDefinitionBuilder.Events(MediaLibraryConstantsKt.LIBRARY_DID_CHANGE_EVENT);
            TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            C7.d dVarB = D.b(Boolean.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType == null) {
                cls = AssetsOptions.class;
                cls2 = Uri.class;
                cls3 = Map.class;
                anyType = new AnyType(new LazyKType(D.b(Boolean.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$AsyncFunctionWithPromise$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Boolean.TYPE);
                    }
                }), converters);
            } else {
                cls = AssetsOptions.class;
                cls2 = Uri.class;
                cls3 = Map.class;
            }
            C7.d dVarB2 = D.b(List.class);
            Boolean bool2 = Boolean.TRUE;
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB2, bool2));
            if (anyType2 == null) {
                cls4 = List.class;
                cls5 = String[].class;
                anyType2 = new AnyType(new LazyKType(D.b(cls4), true, new InterfaceC3487a() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$AsyncFunctionWithPromise$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.g(List.class, q.f518c.d(D.o(GranularPermission.class)));
                    }
                }), converters);
            } else {
                cls4 = List.class;
                cls5 = String[].class;
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("requestPermissionsAsync", new AsyncFunctionWithPromiseComponent("requestPermissionsAsync", new AnyType[]{anyType, anyType2}, new Function2() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$AsyncFunctionWithPromise$3
                public final void invoke(Object[] objArr, Promise promise) throws PermissionsException {
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    Object obj = objArr[0];
                    List allowedPermissionsList = (List) objArr[1];
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    if (allowedPermissionsList == null) {
                        allowedPermissionsList = this.this$0.getAllowedPermissionsList();
                    }
                    this.this$0.maybeThrowIfExpoGo(allowedPermissionsList);
                    Permissions permissions = this.this$0.getAppContext().getPermissions();
                    MediaLibraryPermissionPromiseWrapper mediaLibraryPermissionPromiseWrapper = new MediaLibraryPermissionPromiseWrapper(allowedPermissionsList, promise, new WeakReference(this.this$0.getContext()));
                    String[] manifestPermissions = this.this$0.getManifestPermissions(zBooleanValue, allowedPermissionsList);
                    Permissions.askForPermissionsWithPermissionsManager(permissions, mediaLibraryPermissionPromiseWrapper, (String[]) Arrays.copyOf(manifestPermissions, manifestPermissions.length));
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws PermissionsException {
                    invoke((Object[]) obj, (Promise) obj2);
                    return C2735B.f28704a;
                }
            }));
            TypeConverterProvider converters2 = moduleDefinitionBuilder.getConverters();
            AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Boolean.class), bool));
            if (anyType3 == null) {
                anyType3 = new AnyType(new LazyKType(D.b(Boolean.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$AsyncFunctionWithPromise$4
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Boolean.TYPE);
                    }
                }), converters2);
            }
            AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls4), bool2));
            if (anyType4 == null) {
                anyType4 = new AnyType(new LazyKType(D.b(cls4), true, new InterfaceC3487a() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$AsyncFunctionWithPromise$5
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.g(List.class, q.f518c.d(D.o(GranularPermission.class)));
                    }
                }), converters2);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getPermissionsAsync", new AsyncFunctionWithPromiseComponent("getPermissionsAsync", new AnyType[]{anyType3, anyType4}, new Function2() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$AsyncFunctionWithPromise$6
                public final void invoke(Object[] objArr, Promise promise) throws PermissionsException {
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    Object obj = objArr[0];
                    List allowedPermissionsList = (List) objArr[1];
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    if (allowedPermissionsList == null) {
                        allowedPermissionsList = this.this$0.getAllowedPermissionsList();
                    }
                    this.this$0.maybeThrowIfExpoGo(allowedPermissionsList);
                    Permissions permissions = this.this$0.getAppContext().getPermissions();
                    MediaLibraryPermissionPromiseWrapper mediaLibraryPermissionPromiseWrapper = new MediaLibraryPermissionPromiseWrapper(allowedPermissionsList, promise, new WeakReference(this.this$0.getContext()));
                    String[] manifestPermissions = this.this$0.getManifestPermissions(zBooleanValue, allowedPermissionsList);
                    Permissions.getPermissionsWithPermissionsManager(permissions, mediaLibraryPermissionPromiseWrapper, (String[]) Arrays.copyOf(manifestPermissions, manifestPermissions.length));
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws PermissionsException {
                    invoke((Object[]) obj, (Promise) obj2);
                    return C2735B.f28704a;
                }
            }));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction = moduleDefinitionBuilder.AsyncFunction("saveToLibraryAsync");
            String name = asyncFunctionBuilderAsyncFunction.getName();
            TypeConverterProvider converters3 = asyncFunctionBuilderAsyncFunction.getConverters();
            AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), bool));
            if (anyType5 == null) {
                anyType5 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters3);
            }
            asyncFunctionBuilderAsyncFunction.setAsyncFunctionComponent(new SuspendFunctionComponent(name, new AnyType[]{anyType5}, new MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$2(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction2 = moduleDefinitionBuilder.AsyncFunction("createAssetAsync");
            String name2 = asyncFunctionBuilderAsyncFunction2.getName();
            TypeConverterProvider converters4 = asyncFunctionBuilderAsyncFunction2.getConverters();
            AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), bool));
            if (anyType6 == null) {
                anyType6 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$3
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters4);
            }
            AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), bool2));
            if (anyType7 == null) {
                cls6 = Boolean.class;
                anyType7 = new AnyType(new LazyKType(D.b(String.class), true, new InterfaceC3487a() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$4
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), converters4);
            } else {
                cls6 = Boolean.class;
            }
            asyncFunctionBuilderAsyncFunction2.setAsyncFunctionComponent(new SuspendFunctionComponent(name2, new AnyType[]{anyType6, anyType7}, new MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$5(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction3 = moduleDefinitionBuilder.AsyncFunction("addAssetsToAlbumAsync");
            String name3 = asyncFunctionBuilderAsyncFunction3.getName();
            TypeConverterProvider converters5 = asyncFunctionBuilderAsyncFunction3.getConverters();
            AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls5), bool));
            if (anyType8 == null) {
                anyType8 = new AnyType(new LazyKType(D.b(cls5), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$6
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.p(String[].class, q.f518c.d(D.o(String.class)));
                    }
                }), converters5);
            }
            AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), bool));
            if (anyType9 == null) {
                anyType9 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$7
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters5);
            }
            AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls6), bool));
            if (anyType10 == null) {
                cls7 = String.class;
                anyType10 = new AnyType(new LazyKType(D.b(cls6), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$8
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Boolean.TYPE);
                    }
                }), converters5);
            } else {
                cls7 = String.class;
            }
            asyncFunctionBuilderAsyncFunction3.setAsyncFunctionComponent(new SuspendFunctionComponent(name3, new AnyType[]{anyType8, anyType9, anyType10}, new MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$9(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction4 = moduleDefinitionBuilder.AsyncFunction("removeAssetsFromAlbumAsync");
            String name4 = asyncFunctionBuilderAsyncFunction4.getName();
            TypeConverterProvider converters6 = asyncFunctionBuilderAsyncFunction4.getConverters();
            AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls5), bool));
            if (anyType11 == null) {
                anyType11 = new AnyType(new LazyKType(D.b(cls5), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$10
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.p(String[].class, q.f518c.d(D.o(String.class)));
                    }
                }), converters6);
            }
            AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls7), bool));
            if (anyType12 == null) {
                anyType12 = new AnyType(new LazyKType(D.b(cls7), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$11
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters6);
            }
            asyncFunctionBuilderAsyncFunction4.setAsyncFunctionComponent(new SuspendFunctionComponent(name4, new AnyType[]{anyType11, anyType12}, new MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$12(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction5 = moduleDefinitionBuilder.AsyncFunction("deleteAssetsAsync");
            String name5 = asyncFunctionBuilderAsyncFunction5.getName();
            TypeConverterProvider converters7 = asyncFunctionBuilderAsyncFunction5.getConverters();
            AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls5), bool));
            if (anyType13 == null) {
                anyType13 = new AnyType(new LazyKType(D.b(cls5), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$13
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.p(String[].class, q.f518c.d(D.o(String.class)));
                    }
                }), converters7);
            }
            asyncFunctionBuilderAsyncFunction5.setAsyncFunctionComponent(new SuspendFunctionComponent(name5, new AnyType[]{anyType13}, new MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$14(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction6 = moduleDefinitionBuilder.AsyncFunction("getAssetInfoAsync");
            String name6 = asyncFunctionBuilderAsyncFunction6.getName();
            TypeConverterProvider converters8 = asyncFunctionBuilderAsyncFunction6.getConverters();
            AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls7), bool));
            if (anyType14 == null) {
                anyType14 = new AnyType(new LazyKType(D.b(cls7), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$15
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters8);
            }
            AnyType anyType15 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool2));
            if (anyType15 == null) {
                anyType15 = new AnyType(new LazyKType(D.b(cls3), true, new InterfaceC3487a() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$16
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        q.a aVar = q.f518c;
                        return D.h(Map.class, aVar.d(D.o(String.class)), aVar.d(D.f(Object.class)));
                    }
                }), converters8);
            }
            asyncFunctionBuilderAsyncFunction6.setAsyncFunctionComponent(new SuspendFunctionComponent(name6, new AnyType[]{anyType14, anyType15}, new MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$17(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction7 = moduleDefinitionBuilder.AsyncFunction("getAlbumsAsync");
            String name7 = asyncFunctionBuilderAsyncFunction7.getName();
            TypeConverterProvider converters9 = asyncFunctionBuilderAsyncFunction7.getConverters();
            AnyType anyType16 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool2));
            if (anyType16 == null) {
                anyType16 = new AnyType(new LazyKType(D.b(cls3), true, new InterfaceC3487a() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$18
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        q.a aVar = q.f518c;
                        return D.h(Map.class, aVar.d(D.o(String.class)), aVar.d(D.f(Object.class)));
                    }
                }), converters9);
            }
            asyncFunctionBuilderAsyncFunction7.setAsyncFunctionComponent(new SuspendFunctionComponent(name7, new AnyType[]{anyType16}, new MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$19(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction8 = moduleDefinitionBuilder.AsyncFunction("getAlbumAsync");
            String name8 = asyncFunctionBuilderAsyncFunction8.getName();
            TypeConverterProvider converters10 = asyncFunctionBuilderAsyncFunction8.getConverters();
            AnyType anyType17 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls7), bool));
            if (anyType17 == null) {
                anyType17 = new AnyType(new LazyKType(D.b(cls7), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$20
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters10);
            }
            asyncFunctionBuilderAsyncFunction8.setAsyncFunctionComponent(new SuspendFunctionComponent(name8, new AnyType[]{anyType17}, new MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$21(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction9 = moduleDefinitionBuilder.AsyncFunction("createAlbumAsync");
            String name9 = asyncFunctionBuilderAsyncFunction9.getName();
            TypeConverterProvider converters11 = asyncFunctionBuilderAsyncFunction9.getConverters();
            AnyType anyType18 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls7), bool));
            if (anyType18 == null) {
                anyType18 = new AnyType(new LazyKType(D.b(cls7), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$22
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters11);
            }
            AnyType anyType19 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls7), bool2));
            if (anyType19 == null) {
                anyType19 = new AnyType(new LazyKType(D.b(cls7), true, new InterfaceC3487a() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$23
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), converters11);
            }
            AnyType anyType20 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls6), bool));
            if (anyType20 == null) {
                anyType20 = new AnyType(new LazyKType(D.b(cls6), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$24
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Boolean.TYPE);
                    }
                }), converters11);
            }
            AnyType anyType21 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls2), bool2));
            if (anyType21 == null) {
                anyType21 = new AnyType(new LazyKType(D.b(cls2), true, new InterfaceC3487a() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$25
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(Uri.class);
                    }
                }), converters11);
            }
            asyncFunctionBuilderAsyncFunction9.setAsyncFunctionComponent(new SuspendFunctionComponent(name9, new AnyType[]{anyType18, anyType19, anyType20, anyType21}, new MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction10 = moduleDefinitionBuilder.AsyncFunction("deleteAlbumsAsync");
            String name10 = asyncFunctionBuilderAsyncFunction10.getName();
            TypeConverterProvider converters12 = asyncFunctionBuilderAsyncFunction10.getConverters();
            AnyType anyType22 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls5), bool));
            if (anyType22 == null) {
                anyType22 = new AnyType(new LazyKType(D.b(cls5), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$27
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.p(String[].class, q.f518c.d(D.o(String.class)));
                    }
                }), converters12);
            }
            asyncFunctionBuilderAsyncFunction10.setAsyncFunctionComponent(new SuspendFunctionComponent(name10, new AnyType[]{anyType22}, new MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$28(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction11 = moduleDefinitionBuilder.AsyncFunction("getAssetsAsync");
            String name11 = asyncFunctionBuilderAsyncFunction11.getName();
            TypeConverterProvider converters13 = asyncFunctionBuilderAsyncFunction11.getConverters();
            AnyType anyType23 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls), bool));
            if (anyType23 == null) {
                anyType23 = new AnyType(new LazyKType(D.b(cls), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$29
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(AssetsOptions.class);
                    }
                }), converters13);
            }
            asyncFunctionBuilderAsyncFunction11.setAsyncFunctionComponent(new SuspendFunctionComponent(name11, new AnyType[]{anyType23}, new MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$30(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction12 = moduleDefinitionBuilder.AsyncFunction("migrateAlbumIfNeededAsync");
            String name12 = asyncFunctionBuilderAsyncFunction12.getName();
            TypeConverterProvider converters14 = asyncFunctionBuilderAsyncFunction12.getConverters();
            AnyType anyType24 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls7), bool));
            if (anyType24 == null) {
                anyType24 = new AnyType(new LazyKType(D.b(cls7), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$31
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters14);
            }
            asyncFunctionBuilderAsyncFunction12.setAsyncFunctionComponent(new SuspendFunctionComponent(name12, new AnyType[]{anyType24}, new MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$32(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction13 = moduleDefinitionBuilder.AsyncFunction("albumNeedsMigrationAsync");
            String name13 = asyncFunctionBuilderAsyncFunction13.getName();
            TypeConverterProvider converters15 = asyncFunctionBuilderAsyncFunction13.getConverters();
            AnyType anyType25 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls7), bool));
            if (anyType25 == null) {
                anyType25 = new AnyType(new LazyKType(D.b(cls7), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$33
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters15);
            }
            asyncFunctionBuilderAsyncFunction13.setAsyncFunctionComponent(new SuspendFunctionComponent(name13, new AnyType[]{anyType25}, new MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$34(null, this)));
            moduleDefinitionBuilder.OnStartObserving(new InterfaceC3487a() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$1$19
                @Override // w7.InterfaceC3487a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m267invoke();
                    return C2735B.f28704a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m267invoke() {
                    if (this.this$0.imagesObserver != null) {
                        return;
                    }
                    Handler handler = new Handler(Looper.getMainLooper());
                    ContentResolver contentResolver = this.this$0.getContext().getContentResolver();
                    MediaLibraryModule mediaLibraryModule = this.this$0;
                    MediaLibraryModule.MediaStoreContentObserver mediaStoreContentObserver = new MediaLibraryModule.MediaStoreContentObserver(this.this$0, handler, 1);
                    contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, mediaStoreContentObserver);
                    mediaLibraryModule.imagesObserver = mediaStoreContentObserver;
                    MediaLibraryModule mediaLibraryModule2 = this.this$0;
                    MediaLibraryModule.MediaStoreContentObserver mediaStoreContentObserver2 = new MediaLibraryModule.MediaStoreContentObserver(this.this$0, handler, 3);
                    contentResolver.registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, mediaStoreContentObserver2);
                    mediaLibraryModule2.videosObserver = mediaStoreContentObserver2;
                }
            });
            moduleDefinitionBuilder.OnStopObserving(new InterfaceC3487a() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$1$20
                @Override // w7.InterfaceC3487a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m268invoke();
                    return C2735B.f28704a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m268invoke() {
                    ContentResolver contentResolver = this.this$0.getContext().getContentResolver();
                    MediaLibraryModule.MediaStoreContentObserver mediaStoreContentObserver = this.this$0.imagesObserver;
                    if (mediaStoreContentObserver != null) {
                        MediaLibraryModule mediaLibraryModule = this.this$0;
                        contentResolver.unregisterContentObserver(mediaStoreContentObserver);
                        mediaLibraryModule.imagesObserver = null;
                    }
                    MediaLibraryModule.MediaStoreContentObserver mediaStoreContentObserver2 = this.this$0.videosObserver;
                    if (mediaStoreContentObserver2 != null) {
                        MediaLibraryModule mediaLibraryModule2 = this.this$0;
                        contentResolver.unregisterContentObserver(mediaStoreContentObserver2);
                        mediaLibraryModule2.videosObserver = null;
                    }
                }
            });
            moduleDefinitionBuilder.RegisterActivityContracts(new MediaLibraryModule$definition$1$21(this, null));
            ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder.buildModule();
            AbstractC2861a.f();
            return moduleDefinitionDataBuildModule;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }
}
