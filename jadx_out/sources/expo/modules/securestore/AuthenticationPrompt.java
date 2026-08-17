package expo.modules.securestore;

import android.content.Context;
import androidx.core.content.a;
import androidx.fragment.app.AbstractActivityC1749q;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.text.TextAttributeProps;
import i7.AbstractC2753p;
import i7.C2752o;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.AbstractC2855l;
import n7.f;
import n7.l;
import o.C2998f;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lexpo/modules/securestore/AuthenticationPrompt;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroidx/fragment/app/q;", "currentActivity", "Landroid/content/Context;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, AlertFragment.ARG_TITLE, "<init>", "(Landroidx/fragment/app/q;Landroid/content/Context;Ljava/lang/String;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "code", "convertErrorCode", "(I)Ljava/lang/String;", "Ljavax/crypto/Cipher;", "cipher", "Lo/f$b;", "authenticate", "(Ljavax/crypto/Cipher;Ln7/f;)Ljava/lang/Object;", "Landroidx/fragment/app/q;", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/concurrent/Executor;", "Lo/f$d;", "promptInfo", "Lo/f$d;", "expo-secure-store_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AuthenticationPrompt {
    private final AbstractActivityC1749q currentActivity;
    private Executor executor;
    private C2998f.d promptInfo;

    public AuthenticationPrompt(AbstractActivityC1749q currentActivity, Context context, String title) {
        AbstractC2855l.g(currentActivity, "currentActivity");
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(title, "title");
        this.currentActivity = currentActivity;
        Executor executorH = a.h(context);
        AbstractC2855l.f(executorH, "getMainExecutor(...)");
        this.executor = executorH;
        C2998f.d dVarA = new C2998f.d.a().c(title).b(context.getString(android.R.string.cancel)).a();
        AbstractC2855l.f(dVarA, "build(...)");
        this.promptInfo = dVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String convertErrorCode(int code) {
        switch (code) {
            case 1:
                return "Hardware unavailable";
            case 2:
                return "Unable to process";
            case 3:
                return "Timeout";
            case 4:
                return "No space";
            case 5:
            case 6:
            default:
                return "Unknown error (code: " + code + ")";
            case 7:
                return "Lockout";
            case 8:
                return "Vendor error";
            case 9:
                return "Lockout permanent";
            case 10:
                return "User canceled the authentication";
            case 11:
                return "No biometrics enrolled";
            case 12:
                return "Hardware not present";
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                return "User canceled the authentication";
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                return "No device credential";
        }
    }

    public final Object authenticate(Cipher cipher, f fVar) {
        final l lVar = new l(AbstractC3016b.c(fVar));
        new C2998f(this.currentActivity, this.executor, new C2998f.a() { // from class: expo.modules.securestore.AuthenticationPrompt$authenticate$2$1
            @Override // o.C2998f.a
            public void onAuthenticationError(int errorCode, CharSequence errString) {
                AbstractC2855l.g(errString, "errString");
                super.onAuthenticationError(errorCode, errString);
                String str = this.this$0.convertErrorCode(errorCode) + ". " + ((Object) errString);
                f fVar2 = lVar;
                C2752o.a aVar = C2752o.f28721h;
                fVar2.resumeWith(C2752o.b(AbstractC2753p.a(new AuthenticationException(str, null, 2, null))));
            }

            @Override // o.C2998f.a
            public void onAuthenticationSucceeded(C2998f.b result) {
                AbstractC2855l.g(result, "result");
                super.onAuthenticationSucceeded(result);
                lVar.resumeWith(C2752o.b(result));
            }
        }).a(this.promptInfo, new C2998f.c(cipher));
        Object objA = lVar.a();
        if (objA == AbstractC3016b.e()) {
            h.c(fVar);
        }
        return objA;
    }
}
