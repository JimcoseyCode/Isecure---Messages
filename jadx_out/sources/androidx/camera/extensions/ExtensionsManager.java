package androidx.camera.extensions;

import android.content.Context;
import androidx.camera.extensions.impl.InitializerImpl;
import androidx.concurrent.futures.c;
import y.AbstractC3583h0;
import y.r;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class ExtensionsManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f15264c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ExtensionsManager f15265d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExtensionsAvailability f15266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f15267b;

    /* JADX INFO: renamed from: androidx.camera.extensions.ExtensionsManager$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class AnonymousClass1 implements InitializerImpl.OnExtensionsInitializedCallback {
        final /* synthetic */ Context val$applicationContext;
        final /* synthetic */ r val$cameraProvider;
        final /* synthetic */ c.a val$completer;

        AnonymousClass1(c.a aVar, r rVar, Context context) {
            this.val$completer = aVar;
            this.val$cameraProvider = rVar;
            this.val$applicationContext = context;
        }

        public void onFailure(int i10) {
            AbstractC3583h0.c("ExtensionsManager", "Failed to initialize extensions");
            this.val$completer.c(ExtensionsManager.a(ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING, this.val$cameraProvider, this.val$applicationContext));
        }

        public void onSuccess() {
            AbstractC3583h0.a("ExtensionsManager", "Successfully initialized extensions");
            this.val$completer.c(ExtensionsManager.a(ExtensionsAvailability.LIBRARY_AVAILABLE, this.val$cameraProvider, this.val$applicationContext));
        }
    }

    /* JADX INFO: renamed from: androidx.camera.extensions.ExtensionsManager$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class AnonymousClass2 implements InitializerImpl.OnExtensionsDeinitializedCallback {
        final /* synthetic */ c.a val$completer;

        AnonymousClass2(c.a aVar) {
            this.val$completer = aVar;
        }

        public void onFailure(int i10) {
            this.val$completer.f(new Exception("Failed to deinitialize extensions."));
        }

        public void onSuccess() {
            this.val$completer.c(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    enum ExtensionsAvailability {
        LIBRARY_AVAILABLE,
        LIBRARY_UNAVAILABLE_ERROR_LOADING,
        LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION,
        NONE
    }

    private ExtensionsManager(ExtensionsAvailability extensionsAvailability, r rVar, Context context) {
        this.f15266a = extensionsAvailability;
        this.f15267b = new b(rVar, context);
    }

    static ExtensionsManager a(ExtensionsAvailability extensionsAvailability, r rVar, Context context) {
        synchronized (f15264c) {
            try {
                ExtensionsManager extensionsManager = f15265d;
                if (extensionsManager != null) {
                    return extensionsManager;
                }
                ExtensionsManager extensionsManager2 = new ExtensionsManager(extensionsAvailability, rVar, context);
                f15265d = extensionsManager2;
                return extensionsManager2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
