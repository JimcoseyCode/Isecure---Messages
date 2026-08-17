package expo.modules.medialibrary.next.permissions;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.medialibrary.R;
import expo.modules.medialibrary.next.exceptions.PermissionException;
import expo.modules.medialibrary.next.permissions.enums.GranularPermission;
import i7.AbstractC2746i;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import j7.T;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.G;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00162\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a2\u0006\u0010\u0019\u001a\u00020\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u001bJ+\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a2\u0006\u0010\u001c\u001a\u00020\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ%\u0010\u001e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\"\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00132\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J-\u0010$\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00132\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b$\u0010#J\r\u0010%\u001a\u00020\t¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\t¢\u0006\u0004\b'\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u001b\u0010+\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R!\u00100\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010/R\u0014\u0010\r\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/AppContext;", "appContext", "<init>", "(Lexpo/modules/kotlin/AppContext;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/medialibrary/next/permissions/enums/GranularPermission;", "permissions", "Li7/B;", "maybeThrowIfExpoGo", "(Ljava/util/List;)V", "Landroid/content/Context;", "context", "granularPermissions", "getManifestDeclaredPermissions", "(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "permission", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hasManifestPermission", "(Landroid/content/Context;Ljava/lang/String;)Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getManifestPermissions", "(Landroid/content/Context;)Ljava/util/Set;", "writeOnly", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(ZLjava/util/List;)[Ljava/lang/String;", "shouldIncludeGranular", "getGranularPermissions", "assertGranularPermissionIntegrity", "(Landroid/content/Context;Ljava/util/List;)V", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "requestPermissions", "(ZLjava/util/List;Lexpo/modules/kotlin/Promise;)V", "getPermissions", "requireReadPermissions", "()V", "requireWritePermissions", "Lexpo/modules/kotlin/AppContext;", "isExpoGo$delegate", "Lkotlin/Lazy;", "isExpoGo", "()Z", "allowedPermissionsList$delegate", "getAllowedPermissionsList", "()Ljava/util/List;", "allowedPermissionsList", "getContext", "()Landroid/content/Context;", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SystemPermissionsDelegate {

    /* JADX INFO: renamed from: allowedPermissionsList$delegate, reason: from kotlin metadata */
    private final Lazy allowedPermissionsList;
    private final AppContext appContext;

    /* JADX INFO: renamed from: isExpoGo$delegate, reason: from kotlin metadata */
    private final Lazy isExpoGo;

    public SystemPermissionsDelegate(AppContext appContext) {
        AbstractC2855l.g(appContext, "appContext");
        this.appContext = appContext;
        this.isExpoGo = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.permissions.a
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return Boolean.valueOf(SystemPermissionsDelegate.isExpoGo_delegate$lambda$0(this.f26672g));
            }
        });
        this.allowedPermissionsList = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.permissions.b
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return SystemPermissionsDelegate.allowedPermissionsList_delegate$lambda$1(this.f26673g);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List allowedPermissionsList_delegate$lambda$1(SystemPermissionsDelegate systemPermissionsDelegate) {
        return systemPermissionsDelegate.isExpoGo() ? AbstractC2800q.e(GranularPermission.AUDIO) : systemPermissionsDelegate.getManifestDeclaredPermissions(systemPermissionsDelegate.getContext(), AbstractC2800q.m(GranularPermission.PHOTO, GranularPermission.VIDEO, GranularPermission.AUDIO));
    }

    private final void assertGranularPermissionIntegrity(Context context, List<? extends GranularPermission> granularPermissions) throws PermissionException {
        for (GranularPermission granularPermission : granularPermissions) {
            if (!hasManifestPermission(context, granularPermission.toManifestPermission())) {
                throw new PermissionException("You have requested the " + granularPermission + " permission, but it is not declared in AndroidManifest. Update expo-media-library config plugin to include the permission before requesting it.", null, 2, null);
            }
        }
    }

    private final List<GranularPermission> getAllowedPermissionsList() {
        return (List) this.allowedPermissionsList.getValue();
    }

    private final Context getContext() throws Exceptions.ReactContextLost {
        Context reactContext = this.appContext.getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    private final String[] getGranularPermissions(boolean shouldIncludeGranular, List<? extends GranularPermission> granularPermissions) throws PermissionException {
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
            if (hasManifestPermission(context, ((GranularPermission) obj).toManifestPermission())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final Set<String> getManifestPermissions(Context context) {
        Set<String> setI0;
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null && (setI0 = AbstractC2793j.I0(strArr)) != null) {
                return setI0;
            }
            return T.e();
        } catch (PackageManager.NameNotFoundException unused) {
            return T.e();
        }
    }

    private final boolean hasManifestPermission(Context context, String permission) {
        return getManifestPermissions(context).contains(permission);
    }

    private final boolean isExpoGo() {
        return ((Boolean) this.isExpoGo.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isExpoGo_delegate$lambda$0(SystemPermissionsDelegate systemPermissionsDelegate) {
        return Boolean.parseBoolean(systemPermissionsDelegate.getContext().getResources().getString(R.string.is_expo_go));
    }

    private final void maybeThrowIfExpoGo(List<? extends GranularPermission> permissions) throws PermissionException {
        if (isExpoGo()) {
            if (permissions.contains(GranularPermission.PHOTO) || permissions.contains(GranularPermission.VIDEO)) {
                throw new PermissionException("Due to changes in Androids permission requirements, Expo Go can no longer provide full access to the media library. To test the full functionality of this module, you can create a development build", null, 2, null);
            }
        }
    }

    public final void getPermissions(boolean writeOnly, List<? extends GranularPermission> permissions, Promise promise) throws PermissionException {
        AbstractC2855l.g(promise, "promise");
        if (permissions == null) {
            permissions = getAllowedPermissionsList();
        }
        maybeThrowIfExpoGo(permissions);
        Permissions permissions2 = this.appContext.getPermissions();
        MediaLibraryPermissionPromiseWrapper mediaLibraryPermissionPromiseWrapper = new MediaLibraryPermissionPromiseWrapper(permissions, promise, new WeakReference(getContext()));
        String[] manifestPermissions = getManifestPermissions(writeOnly, permissions);
        Permissions.getPermissionsWithPermissionsManager(permissions2, mediaLibraryPermissionPromiseWrapper, (String[]) Arrays.copyOf(manifestPermissions, manifestPermissions.length));
    }

    public final void requestPermissions(boolean writeOnly, List<? extends GranularPermission> permissions, Promise promise) throws PermissionException {
        AbstractC2855l.g(promise, "promise");
        if (permissions == null) {
            permissions = getAllowedPermissionsList();
        }
        maybeThrowIfExpoGo(permissions);
        Permissions permissions2 = this.appContext.getPermissions();
        MediaLibraryPermissionPromiseWrapper mediaLibraryPermissionPromiseWrapper = new MediaLibraryPermissionPromiseWrapper(permissions, promise, new WeakReference(getContext()));
        String[] manifestPermissions = getManifestPermissions(writeOnly, permissions);
        Permissions.askForPermissionsWithPermissionsManager(permissions2, mediaLibraryPermissionPromiseWrapper, (String[]) Arrays.copyOf(manifestPermissions, manifestPermissions.length));
    }

    public final void requireReadPermissions() throws PermissionException {
        Permissions permissions = this.appContext.getPermissions();
        if (!AbstractC2855l.b(permissions != null ? Boolean.valueOf(permissions.hasGrantedPermissions("android.permission.READ_EXTERNAL_STORAGE")) : null, Boolean.TRUE)) {
            throw new PermissionException("Missing READ_EXTERNAL_STORAGE permission", null, 2, null);
        }
    }

    public final void requireWritePermissions() throws PermissionException {
        Permissions permissions = this.appContext.getPermissions();
        if (!AbstractC2855l.b(permissions != null ? Boolean.valueOf(permissions.hasGrantedPermissions("android.permission.WRITE_EXTERNAL_STORAGE")) : null, Boolean.TRUE)) {
            throw new PermissionException("Missing WRITE_EXTERNAL_STORAGE permission", null, 2, null);
        }
    }

    private final String[] getManifestPermissions(boolean writeOnly, List<? extends GranularPermission> granularPermissions) {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = i10 >= 29 && hasManifestPermission(getContext(), "android.permission.ACCESS_MEDIA_LOCATION") && !(i10 >= 33 && granularPermissions.size() == 1 && granularPermissions.contains(GranularPermission.AUDIO));
        boolean z11 = i10 < 33 && hasManifestPermission(getContext(), "android.permission.WRITE_EXTERNAL_STORAGE");
        boolean z12 = i10 >= 33;
        boolean z13 = z12 && !writeOnly;
        G g10 = new G(4);
        g10.a(z11 ? "android.permission.WRITE_EXTERNAL_STORAGE" : null);
        g10.a((writeOnly || z12) ? null : "android.permission.READ_EXTERNAL_STORAGE");
        g10.a(z10 ? "android.permission.ACCESS_MEDIA_LOCATION" : null);
        g10.b(getGranularPermissions(z13, granularPermissions));
        return (String[]) AbstractC2800q.o(g10.d(new String[g10.c()])).toArray(new String[0]);
    }
}
