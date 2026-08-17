package expo.modules.securestore;

import R8.AbstractC1413i;
import R8.C1404d0;
import R8.K0;
import R8.N;
import android.app.Activity;
import android.content.Context;
import androidx.customview.widget.a;
import androidx.fragment.app.AbstractActivityC1749q;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.text.TextAttributeProps;
import expo.modules.core.ModuleRegistry;
import expo.modules.core.interfaces.ActivityProvider;
import i7.AbstractC2753p;
import i7.C2735B;
import javax.crypto.Cipher;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o.C2997e;
import o.C2998f;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lexpo/modules/securestore/AuthenticationHelper;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/content/Context;", "context", "Lexpo/modules/core/ModuleRegistry;", "moduleRegistry", "<init>", "(Landroid/content/Context;Lexpo/modules/core/ModuleRegistry;)V", "Ljavax/crypto/Cipher;", "cipher", PointerEventHelper.POINTER_TYPE_UNKNOWN, AlertFragment.ARG_TITLE, "Lo/f$b;", "openAuthenticationPrompt", "(Ljavax/crypto/Cipher;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "requiresAuthentication", "authenticateCipher", "(Ljavax/crypto/Cipher;ZLjava/lang/String;Ln7/f;)Ljava/lang/Object;", "Li7/B;", "assertBiometricsSupport", "()V", "Landroid/content/Context;", "Lexpo/modules/core/ModuleRegistry;", "isAuthenticating", "Z", "Companion", "expo-secure-store_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AuthenticationHelper {
    public static final String REQUIRE_AUTHENTICATION_PROPERTY = "requireAuthentication";
    private final Context context;
    private boolean isAuthenticating;
    private final ModuleRegistry moduleRegistry;

    /* JADX INFO: renamed from: expo.modules.securestore.AuthenticationHelper$authenticateCipher$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.securestore.AuthenticationHelper", f = "AuthenticationHelper.kt", l = {TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE}, m = "authenticateCipher")
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
            this.label |= a.INVALID_ID;
            return AuthenticationHelper.this.authenticateCipher(null, false, null, this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.securestore.AuthenticationHelper$openAuthenticationPrompt$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.securestore.AuthenticationHelper", f = "AuthenticationHelper.kt", l = {50}, m = "openAuthenticationPrompt")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C25641 extends d {
        int label;
        /* synthetic */ Object result;

        C25641(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= a.INVALID_ID;
            return AuthenticationHelper.this.openAuthenticationPrompt(null, null, this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.securestore.AuthenticationHelper$openAuthenticationPrompt$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.securestore.AuthenticationHelper$openAuthenticationPrompt$2", f = "AuthenticationHelper.kt", l = {51}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Lo/f$b;", "<anonymous>", "(LR8/N;)Lo/f$b;"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass2 extends l implements Function2 {
        final /* synthetic */ AuthenticationPrompt $authenticationPrompt;
        final /* synthetic */ Cipher $cipher;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AuthenticationPrompt authenticationPrompt, Cipher cipher, n7.f fVar) {
            super(2, fVar);
            this.$authenticationPrompt = authenticationPrompt;
            this.$cipher = cipher;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return new AnonymousClass2(this.$authenticationPrompt, this.$cipher, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws AuthenticationException {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                AuthenticationPrompt authenticationPrompt = this.$authenticationPrompt;
                Cipher cipher = this.$cipher;
                this.label = 1;
                obj = authenticationPrompt.authenticate(cipher, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
            }
            C2998f.b bVar = (C2998f.b) obj;
            if (bVar != null) {
                return bVar;
            }
            throw new AuthenticationException("Couldn't get the authentication result", null, 2, null);
        }
    }

    public AuthenticationHelper(Context context, ModuleRegistry moduleRegistry) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(moduleRegistry, "moduleRegistry");
        this.context = context;
        this.moduleRegistry = moduleRegistry;
    }

    private final Activity getCurrentActivity() {
        Object module = this.moduleRegistry.getModule(ActivityProvider.class);
        AbstractC2855l.f(module, "getModule(...)");
        return ((ActivityProvider) module).getCurrentActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object openAuthenticationPrompt(Cipher cipher, String str, n7.f fVar) throws AuthenticationException {
        C25641 c25641;
        if (fVar instanceof C25641) {
            c25641 = (C25641) fVar;
            int i10 = c25641.label;
            if ((i10 & a.INVALID_ID) != 0) {
                c25641.label = i10 - a.INVALID_ID;
            } else {
                c25641 = new C25641(fVar);
            }
        }
        Object objG = c25641.result;
        Object objE = AbstractC3016b.e();
        int i11 = c25641.label;
        try {
            if (i11 == 0) {
                AbstractC2753p.b(objG);
                if (this.isAuthenticating) {
                    throw new AuthenticationException("Authentication is already in progress", null, 2, null);
                }
                this.isAuthenticating = true;
                assertBiometricsSupport();
                Activity currentActivity = getCurrentActivity();
                AbstractActivityC1749q abstractActivityC1749q = currentActivity instanceof AbstractActivityC1749q ? (AbstractActivityC1749q) currentActivity : null;
                if (abstractActivityC1749q == null) {
                    throw new AuthenticationException("Cannot display biometric prompt when the app is not in the foreground", null, 2, null);
                }
                AuthenticationPrompt authenticationPrompt = new AuthenticationPrompt(abstractActivityC1749q, this.context, str);
                K0 k0O0 = C1404d0.c().O0();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(authenticationPrompt, cipher, null);
                c25641.label = 1;
                objG = AbstractC1413i.g(k0O0, anonymousClass2, c25641);
                if (objG == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(objG);
            }
            return objG;
        } finally {
            this.isAuthenticating = false;
        }
    }

    public final void assertBiometricsSupport() throws AuthenticationException {
        C2997e c2997eG = C2997e.g(this.context);
        AbstractC2855l.f(c2997eG, "from(...)");
        int iA = c2997eG.a(15);
        if (iA == -2) {
            throw new AuthenticationException("Biometric authentication is unsupported", null, 2, null);
        }
        if (iA == -1) {
            throw new AuthenticationException("Biometric authentication status is unknown", null, 2, null);
        }
        if (iA != 1) {
            if (iA == 15) {
                throw new AuthenticationException("An update is required before the biometrics can be used", null, 2, null);
            }
            if (iA == 11) {
                throw new AuthenticationException("No biometrics are currently enrolled", null, 2, null);
            }
            if (iA != 12) {
                return;
            }
        }
        throw new AuthenticationException("No hardware available for biometric authentication. Use expo-local-authentication to check if the device supports it", null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object authenticateCipher(Cipher cipher, boolean z10, String str, n7.f fVar) throws AuthenticationException {
        AnonymousClass1 anonymousClass1;
        Cipher cipherA;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & a.INVALID_ID) != 0) {
                anonymousClass1.label = i10 - a.INVALID_ID;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        }
        Object objOpenAuthenticationPrompt = anonymousClass1.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            AbstractC2753p.b(objOpenAuthenticationPrompt);
            if (!z10) {
                return cipher;
            }
            anonymousClass1.label = 1;
            objOpenAuthenticationPrompt = openAuthenticationPrompt(cipher, str, anonymousClass1);
            if (objOpenAuthenticationPrompt == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objOpenAuthenticationPrompt);
        }
        C2998f.c cVarB = ((C2998f.b) objOpenAuthenticationPrompt).b();
        if (cVarB == null || (cipherA = cVarB.a()) == null) {
            throw new AuthenticationException("Couldn't get cipher from authentication result", null, 2, null);
        }
        return cipherA;
    }
}
