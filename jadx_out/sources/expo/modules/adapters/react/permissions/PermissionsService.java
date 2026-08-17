package expo.modules.adapters.react.permissions;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.ModuleRegistry;
import expo.modules.core.Promise;
import expo.modules.core.interfaces.ActivityProvider;
import expo.modules.core.interfaces.InternalModule;
import expo.modules.core.interfaces.LifecycleEventListener;
import expo.modules.core.interfaces.services.UIManager;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.interfaces.permissions.PermissionsResponse;
import expo.modules.interfaces.permissions.PermissionsResponseListener;
import expo.modules.interfaces.permissions.PermissionsStatus;
import i7.C2735B;
import i7.t;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\fJ3\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000fH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\nH\u0002¢\u0006\u0004\b&\u0010'J\u001d\u0010+\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020*0)0(H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J+\u00103\u001a\u00020\u000f2\u0006\u00102\u001a\u0002012\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\r\"\u00020\bH\u0016¢\u0006\u0004\b3\u00104J+\u00105\u001a\u00020\u000f2\u0006\u00102\u001a\u0002012\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\r\"\u00020\bH\u0016¢\u0006\u0004\b5\u00104J+\u00108\u001a\u00020\u000f2\u0006\u00107\u001a\u0002062\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\r\"\u00020\bH\u0016¢\u0006\u0004\b8\u00109J+\u0010:\u001a\u00020\u000f2\u0006\u00107\u001a\u0002062\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\r\"\u00020\bH\u0016¢\u0006\u0004\b:\u00109J#\u0010;\u001a\u00020\n2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\r\"\u00020\bH\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b=\u0010\fJ\u0017\u0010>\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b>\u0010\u0015J'\u0010@\u001a\u00020\u000f2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\r2\u0006\u0010?\u001a\u000206H\u0014¢\u0006\u0004\b@\u0010AJ%\u0010B\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010?\u001a\u000206H\u0004¢\u0006\u0004\bB\u0010AJ\u000f\u0010C\u001a\u00020\u000fH\u0016¢\u0006\u0004\bC\u0010%J\u000f\u0010D\u001a\u00020\u000fH\u0016¢\u0006\u0004\bD\u0010%J\u000f\u0010E\u001a\u00020\u000fH\u0016¢\u0006\u0004\bE\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010N\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u001e\u0010P\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR,\u0010T\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r\u0012\u0004\u0012\u0002060S0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010V\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010OR\u0016\u0010X\u001a\u00020W8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bX\u0010Y¨\u0006Z"}, d2 = {"Lexpo/modules/adapters/react/permissions/PermissionsService;", "Lexpo/modules/core/interfaces/InternalModule;", "Lexpo/modules/interfaces/permissions/Permissions;", "Lexpo/modules/core/interfaces/LifecycleEventListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "permission", PointerEventHelper.POINTER_TYPE_UNKNOWN, "didAsk", "(Ljava/lang/String;)Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "permissions", "Li7/B;", "addToAskedPermissionsCache", "([Ljava/lang/String;)V", "isPermissionGranted", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getManifestPermission", "(Ljava/lang/String;)I", PermissionsResponse.CAN_ASK_AGAIN_KEY, "permissionsString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "grantResults", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/interfaces/permissions/PermissionsResponse;", "parseNativeResult", "([Ljava/lang/String;[I)Ljava/util/Map;", "result", "getPermissionResponseFromNativeResponse", "(Ljava/lang/String;I)Lexpo/modules/interfaces/permissions/PermissionsResponse;", "Lcom/facebook/react/modules/core/PermissionListener;", "createListenerWithPendingPermissionsRequest", "()Lcom/facebook/react/modules/core/PermissionListener;", "askForWriteSettingsPermissionFirst", "()V", "hasWriteSettingsPermission", "()Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Ljava/lang/Class;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getExportedInterfaces", "()Ljava/util/List;", "Lexpo/modules/core/ModuleRegistry;", "moduleRegistry", "onCreate", "(Lexpo/modules/core/ModuleRegistry;)V", "Lexpo/modules/core/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "getPermissionsWithPromise", "(Lexpo/modules/core/Promise;[Ljava/lang/String;)V", "askForPermissionsWithPromise", "Lexpo/modules/interfaces/permissions/PermissionsResponseListener;", "responseListener", "getPermissions", "(Lexpo/modules/interfaces/permissions/PermissionsResponseListener;[Ljava/lang/String;)V", "askForPermissions", "hasGrantedPermissions", "([Ljava/lang/String;)Z", "isPermissionPresentInManifest", "getManifestPermissionFromContext", "listener", "askForManifestPermissions", "([Ljava/lang/String;Lexpo/modules/interfaces/permissions/PermissionsResponseListener;)V", "delegateRequestToActivity", "onHostResume", "onHostPause", "onHostDestroy", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lexpo/modules/core/interfaces/ActivityProvider;", "mActivityProvider", "Lexpo/modules/core/interfaces/ActivityProvider;", "mWriteSettingsPermissionBeingAsked", "Z", "mAskAsyncListener", "Lexpo/modules/interfaces/permissions/PermissionsResponseListener;", "mAskAsyncRequestedPermissions", "[Ljava/lang/String;", "Ljava/util/Queue;", "Lkotlin/Pair;", "mPendingPermissionCalls", "Ljava/util/Queue;", "mCurrentPermissionListener", "Landroid/content/SharedPreferences;", "mAskedPermissionsCache", "Landroid/content/SharedPreferences;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class PermissionsService implements InternalModule, Permissions, LifecycleEventListener {
    private final Context context;
    private ActivityProvider mActivityProvider;
    private PermissionsResponseListener mAskAsyncListener;
    private String[] mAskAsyncRequestedPermissions;
    private SharedPreferences mAskedPermissionsCache;
    private PermissionsResponseListener mCurrentPermissionListener;
    private final Queue<Pair<String[], PermissionsResponseListener>> mPendingPermissionCalls;
    private boolean mWriteSettingsPermissionBeingAsked;

    public PermissionsService(Context context) {
        AbstractC2855l.g(context, "context");
        this.context = context;
        this.mPendingPermissionCalls = new LinkedList();
    }

    private final void addToAskedPermissionsCache(String[] permissions) {
        SharedPreferences sharedPreferences = this.mAskedPermissionsCache;
        if (sharedPreferences == null) {
            AbstractC2855l.y("mAskedPermissionsCache");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        for (String str : permissions) {
            editorEdit.putBoolean(str, true);
        }
        editorEdit.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void askForPermissions$lambda$10(PermissionsService permissionsService, PermissionsResponseListener permissionsResponseListener, Map map) {
        int i10 = permissionsService.hasWriteSettingsPermission() ? 0 : -1;
        AbstractC2855l.d(map);
        map.put("android.permission.WRITE_SETTINGS", permissionsService.getPermissionResponseFromNativeResponse("android.permission.WRITE_SETTINGS", i10));
        permissionsResponseListener.onResult(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void askForPermissionsWithPromise$lambda$7(PermissionsService permissionsService, Promise promise, String[] strArr, Map map) {
        permissionsService.getPermissionsWithPromise(promise, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    private final void askForWriteSettingsPermissionFirst() {
        Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
        intent.setData(Uri.parse("package:" + this.context.getPackageName()));
        intent.addFlags(268435456);
        this.mWriteSettingsPermissionBeingAsked = true;
        this.context.startActivity(intent);
    }

    private final boolean canAskAgain(String permission) {
        Activity currentActivity;
        ActivityProvider activityProvider = this.mActivityProvider;
        return (activityProvider == null || (currentActivity = activityProvider.getCurrentActivity()) == null || !androidx.core.app.b.u(currentActivity, permission)) ? false : true;
    }

    private final PermissionListener createListenerWithPendingPermissionsRequest() {
        return new PermissionListener() { // from class: expo.modules.adapters.react.permissions.c
            @Override // com.facebook.react.modules.core.PermissionListener
            public final boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
                return PermissionsService.createListenerWithPendingPermissionsRequest$lambda$21(this.f26443g, i10, strArr, iArr);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createListenerWithPendingPermissionsRequest$lambda$21(PermissionsService permissionsService, int i10, String[] receivePermissions, int[] grantResults) {
        AbstractC2855l.g(receivePermissions, "receivePermissions");
        AbstractC2855l.g(grantResults, "grantResults");
        if (i10 != 13) {
            return false;
        }
        synchronized (permissionsService) {
            try {
                PermissionsResponseListener permissionsResponseListener = permissionsService.mCurrentPermissionListener;
                if (permissionsResponseListener == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                permissionsResponseListener.onResult(permissionsService.parseNativeResult(receivePermissions, grantResults));
                permissionsService.mCurrentPermissionListener = null;
                Pair<String[], PermissionsResponseListener> pairPoll = permissionsService.mPendingPermissionCalls.poll();
                if (pairPoll != null) {
                    ActivityProvider activityProvider = permissionsService.mActivityProvider;
                    Activity currentActivity = activityProvider != null ? activityProvider.getCurrentActivity() : null;
                    PermissionAwareActivity permissionAwareActivity = currentActivity instanceof PermissionAwareActivity ? (PermissionAwareActivity) currentActivity : null;
                    if (permissionAwareActivity != null) {
                        permissionsService.mCurrentPermissionListener = (PermissionsResponseListener) pairPoll.d();
                        permissionAwareActivity.requestPermissions((String[]) pairPoll.c(), 13, permissionsService.createListenerWithPendingPermissionsRequest());
                        return false;
                    }
                    PermissionsResponseListener permissionsResponseListener2 = (PermissionsResponseListener) pairPoll.d();
                    String[] strArr = (String[]) pairPoll.c();
                    int length = ((Object[]) pairPoll.c()).length;
                    int[] iArr = new int[length];
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr[i11] = -1;
                    }
                    permissionsResponseListener2.onResult(permissionsService.parseNativeResult(strArr, iArr));
                    Iterator<T> it = permissionsService.mPendingPermissionCalls.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        PermissionsResponseListener permissionsResponseListener3 = (PermissionsResponseListener) pair.d();
                        String[] strArr2 = (String[]) pair.c();
                        int length2 = ((Object[]) pair.c()).length;
                        int[] iArr2 = new int[length2];
                        for (int i12 = 0; i12 < length2; i12++) {
                            iArr2[i12] = -1;
                        }
                        permissionsResponseListener3.onResult(permissionsService.parseNativeResult(strArr2, iArr2));
                    }
                    permissionsService.mPendingPermissionCalls.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final boolean didAsk(String permission) {
        SharedPreferences sharedPreferences = this.mAskedPermissionsCache;
        if (sharedPreferences == null) {
            AbstractC2855l.y("mAskedPermissionsCache");
            sharedPreferences = null;
        }
        return sharedPreferences.getBoolean(permission, false);
    }

    private final int getManifestPermission(String permission) {
        Activity currentActivity;
        ActivityProvider activityProvider = this.mActivityProvider;
        return (activityProvider == null || (currentActivity = activityProvider.getCurrentActivity()) == null || !(currentActivity instanceof PermissionAwareActivity)) ? getManifestPermissionFromContext(permission) : androidx.core.content.a.a(currentActivity, permission);
    }

    private final PermissionsResponse getPermissionResponseFromNativeResponse(String permission, int result) {
        PermissionsStatus permissionsStatus = result == 0 ? PermissionsStatus.GRANTED : didAsk(permission) ? PermissionsStatus.DENIED : PermissionsStatus.UNDETERMINED;
        return new PermissionsResponse(permissionsStatus, permissionsStatus == PermissionsStatus.DENIED ? canAskAgain(permission) : true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getPermissionsWithPromise$lambda$6(Promise promise, Map permissionsMap) {
        boolean z10;
        boolean z11;
        AbstractC2855l.g(permissionsMap, "permissionsMap");
        boolean z12 = false;
        if (permissionsMap.isEmpty()) {
            z10 = true;
        } else {
            Iterator it = permissionsMap.entrySet().iterator();
            while (it.hasNext()) {
                if (((PermissionsResponse) ((Map.Entry) it.next()).getValue()).getStatus() != PermissionsStatus.GRANTED) {
                    z10 = false;
                    break;
                }
            }
            z10 = true;
        }
        if (permissionsMap.isEmpty()) {
            z11 = false;
            break;
        }
        if (!permissionsMap.isEmpty()) {
            Iterator it2 = permissionsMap.entrySet().iterator();
            while (it2.hasNext()) {
                if (((PermissionsResponse) ((Map.Entry) it2.next()).getValue()).getStatus() != PermissionsStatus.DENIED) {
                    z11 = false;
                    break;
                }
            }
        }
        z11 = true;
        if (permissionsMap.isEmpty()) {
            z12 = true;
        } else {
            Iterator it3 = permissionsMap.entrySet().iterator();
            while (it3.hasNext()) {
                if (!((PermissionsResponse) ((Map.Entry) it3.next()).getValue()).getCanAskAgain()) {
                    break;
                }
            }
            z12 = true;
        }
        Bundle bundle = new Bundle();
        bundle.putString(PermissionsResponse.EXPIRES_KEY, "never");
        bundle.putString(PermissionsResponse.STATUS_KEY, z10 ? PermissionsStatus.GRANTED.getStatus() : z11 ? PermissionsStatus.DENIED.getStatus() : PermissionsStatus.UNDETERMINED.getStatus());
        bundle.putBoolean(PermissionsResponse.CAN_ASK_AGAIN_KEY, z12);
        bundle.putBoolean(PermissionsResponse.GRANTED_KEY, z10);
        promise.resolve(bundle);
    }

    private final boolean hasWriteSettingsPermission() {
        return Settings.System.canWrite(this.context.getApplicationContext());
    }

    private final boolean isPermissionGranted(String permission) {
        return AbstractC2855l.b(permission, "android.permission.WRITE_SETTINGS") ? hasWriteSettingsPermission() : getManifestPermission(permission) == 0;
    }

    private final Map<String, PermissionsResponse> parseNativeResult(String[] permissionsString, int[] grantResults) {
        HashMap map = new HashMap();
        for (Pair pair : AbstractC2793j.L0(grantResults, permissionsString)) {
            int iIntValue = ((Number) pair.getFirst()).intValue();
            String str = (String) pair.getSecond();
            map.put(str, getPermissionResponseFromNativeResponse(str, iIntValue));
        }
        return map;
    }

    protected void askForManifestPermissions(String[] permissions, PermissionsResponseListener listener) {
        AbstractC2855l.g(permissions, "permissions");
        AbstractC2855l.g(listener, "listener");
        delegateRequestToActivity((String[]) Arrays.copyOf(permissions, permissions.length), listener);
    }

    @Override // expo.modules.interfaces.permissions.Permissions
    public void askForPermissions(final PermissionsResponseListener responseListener, String... permissions) throws IllegalStateException {
        AbstractC2855l.g(responseListener, "responseListener");
        AbstractC2855l.g(permissions, "permissions");
        if (permissions.length == 0) {
            responseListener.onResult(new LinkedHashMap());
            return;
        }
        if (!AbstractC2793j.B(permissions, "android.permission.WRITE_SETTINGS")) {
            askForManifestPermissions(permissions, responseListener);
            return;
        }
        List listE0 = AbstractC2793j.E0(permissions);
        listE0.remove("android.permission.WRITE_SETTINGS");
        String[] strArr = (String[]) listE0.toArray(new String[0]);
        PermissionsResponseListener permissionsResponseListener = new PermissionsResponseListener() { // from class: expo.modules.adapters.react.permissions.b
            @Override // expo.modules.interfaces.permissions.PermissionsResponseListener
            public final void onResult(Map map) {
                PermissionsService.askForPermissions$lambda$10(this.f26441a, responseListener, map);
            }
        };
        if (hasWriteSettingsPermission()) {
            if (strArr.length == 0) {
                permissionsResponseListener.onResult(new LinkedHashMap());
                return;
            } else {
                askForManifestPermissions(strArr, permissionsResponseListener);
                return;
            }
        }
        if (this.mAskAsyncListener != null) {
            throw new IllegalStateException("Another permissions request is in progress. Await the old request and then try again.");
        }
        this.mAskAsyncListener = permissionsResponseListener;
        this.mAskAsyncRequestedPermissions = strArr;
        addToAskedPermissionsCache(new String[]{"android.permission.WRITE_SETTINGS"});
        askForWriteSettingsPermissionFirst();
    }

    @Override // expo.modules.interfaces.permissions.Permissions
    public void askForPermissionsWithPromise(final Promise promise, final String... permissions) {
        AbstractC2855l.g(promise, "promise");
        AbstractC2855l.g(permissions, "permissions");
        askForPermissions(new PermissionsResponseListener() { // from class: expo.modules.adapters.react.permissions.a
            @Override // expo.modules.interfaces.permissions.PermissionsResponseListener
            public final void onResult(Map map) {
                PermissionsService.askForPermissionsWithPromise$lambda$7(this.f26438a, promise, permissions, map);
            }
        }, (String[]) Arrays.copyOf(permissions, permissions.length));
    }

    protected final void delegateRequestToActivity(String[] permissions, PermissionsResponseListener listener) {
        AbstractC2855l.g(permissions, "permissions");
        AbstractC2855l.g(listener, "listener");
        addToAskedPermissionsCache(permissions);
        ActivityProvider activityProvider = this.mActivityProvider;
        ComponentCallbacks2 currentActivity = activityProvider != null ? activityProvider.getCurrentActivity() : null;
        if (!(currentActivity instanceof PermissionAwareActivity)) {
            int length = permissions.length;
            int[] iArr = new int[length];
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = -1;
            }
            listener.onResult(parseNativeResult(permissions, iArr));
            return;
        }
        synchronized (this) {
            try {
                if (this.mCurrentPermissionListener != null) {
                    this.mPendingPermissionCalls.add(t.a(permissions, listener));
                } else {
                    this.mCurrentPermissionListener = listener;
                    ((PermissionAwareActivity) currentActivity).requestPermissions(permissions, 13, createListenerWithPendingPermissionsRequest());
                    C2735B c2735b = C2735B.f28704a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // expo.modules.core.interfaces.InternalModule
    public List<Class<? extends Object>> getExportedInterfaces() {
        return AbstractC2800q.e(Permissions.class);
    }

    protected int getManifestPermissionFromContext(String permission) {
        AbstractC2855l.g(permission, "permission");
        return androidx.core.content.a.a(this.context, permission);
    }

    @Override // expo.modules.interfaces.permissions.Permissions
    public void getPermissions(PermissionsResponseListener responseListener, String... permissions) {
        AbstractC2855l.g(responseListener, "responseListener");
        AbstractC2855l.g(permissions, "permissions");
        ArrayList arrayList = new ArrayList(permissions.length);
        for (String str : permissions) {
            arrayList.add(Integer.valueOf(isPermissionGranted(str) ? 0 : -1));
        }
        responseListener.onResult(parseNativeResult(permissions, AbstractC2800q.O0(arrayList)));
    }

    @Override // expo.modules.interfaces.permissions.Permissions
    public void getPermissionsWithPromise(final Promise promise, String... permissions) {
        AbstractC2855l.g(promise, "promise");
        AbstractC2855l.g(permissions, "permissions");
        getPermissions(new PermissionsResponseListener() { // from class: expo.modules.adapters.react.permissions.d
            @Override // expo.modules.interfaces.permissions.PermissionsResponseListener
            public final void onResult(Map map) {
                PermissionsService.getPermissionsWithPromise$lambda$6(promise, map);
            }
        }, (String[]) Arrays.copyOf(permissions, permissions.length));
    }

    @Override // expo.modules.interfaces.permissions.Permissions
    public boolean hasGrantedPermissions(String... permissions) {
        AbstractC2855l.g(permissions, "permissions");
        for (String str : permissions) {
            if (!isPermissionGranted(str)) {
                return false;
            }
        }
        return true;
    }

    @Override // expo.modules.interfaces.permissions.Permissions
    public boolean isPermissionPresentInManifest(String permission) {
        AbstractC2855l.g(permission, "permission");
        try {
            PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 4096);
            if (packageInfo != null) {
                String[] strArr = packageInfo.requestedPermissions;
                AbstractC2855l.d(strArr);
                return AbstractC2793j.B(strArr, permission);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    @Override // expo.modules.core.interfaces.RegistryLifecycleListener
    public void onCreate(ModuleRegistry moduleRegistry) throws IllegalStateException {
        AbstractC2855l.g(moduleRegistry, "moduleRegistry");
        ActivityProvider activityProvider = (ActivityProvider) moduleRegistry.getModule(ActivityProvider.class);
        if (activityProvider == null) {
            throw new IllegalStateException("Couldn't find implementation for ActivityProvider.");
        }
        this.mActivityProvider = activityProvider;
        ((UIManager) moduleRegistry.getModule(UIManager.class)).registerLifecycleEventListener(this);
        this.mAskedPermissionsCache = this.context.getApplicationContext().getSharedPreferences("expo.modules.permissions.asked", 0);
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostResume() {
        if (this.mWriteSettingsPermissionBeingAsked) {
            this.mWriteSettingsPermissionBeingAsked = false;
            PermissionsResponseListener permissionsResponseListener = this.mAskAsyncListener;
            AbstractC2855l.d(permissionsResponseListener);
            String[] strArr = this.mAskAsyncRequestedPermissions;
            AbstractC2855l.d(strArr);
            this.mAskAsyncListener = null;
            this.mAskAsyncRequestedPermissions = null;
            if (strArr.length == 0) {
                permissionsResponseListener.onResult(new LinkedHashMap());
            } else {
                askForManifestPermissions(strArr, permissionsResponseListener);
            }
        }
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostPause() {
    }
}
