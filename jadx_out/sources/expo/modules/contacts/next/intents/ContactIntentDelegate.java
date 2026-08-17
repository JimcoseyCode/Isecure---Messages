package expo.modules.contacts.next.intents;

import android.content.ContentValues;
import android.net.Uri;
import androidx.customview.widget.a;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.text.TextAttributeProps;
import expo.modules.kotlin.activityresult.AppContextActivityResultCaller;
import expo.modules.kotlin.activityresult.AppContextActivityResultLauncher;
import i7.AbstractC2753p;
import i7.C2735B;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n0\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R$\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, d2 = {"Lexpo/modules/contacts/next/intents/ContactIntentDelegate;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;", "Li7/B;", "registerContactContracts", "(Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;Ln7/f;)Ljava/lang/Object;", "Landroid/net/Uri;", "lookupKeyUri", PointerEventHelper.POINTER_TYPE_UNKNOWN, "launchEditContact", "(Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/content/ContentValues;", "contentValues", "launchAddContact", "(Ljava/util/List;Ln7/f;)Ljava/lang/Object;", "launchPickContact", "(Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;", "Lexpo/modules/contacts/next/intents/EditContactInput;", "editContactLauncher", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;", "Lexpo/modules/contacts/next/intents/AddContactInput;", "addContactLauncher", "Lexpo/modules/contacts/next/intents/PickContactInput;", "pickContactLauncher", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ContactIntentDelegate {
    private AppContextActivityResultLauncher<AddContactInput, Boolean> addContactLauncher;
    private AppContextActivityResultLauncher<EditContactInput, Boolean> editContactLauncher;
    private AppContextActivityResultLauncher<PickContactInput, Uri> pickContactLauncher;

    /* JADX INFO: renamed from: expo.modules.contacts.next.intents.ContactIntentDelegate$registerContactContracts$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.contacts.next.intents.ContactIntentDelegate", f = "ContactIntentDelegate.kt", l = {TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR, TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE, 16}, m = "registerContactContracts")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= a.INVALID_ID;
            return ContactIntentDelegate.this.registerContactContracts(null, this);
        }
    }

    public final Object launchAddContact(List<ContentValues> list, n7.f fVar) {
        AppContextActivityResultLauncher<AddContactInput, Boolean> appContextActivityResultLauncher = this.addContactLauncher;
        if (appContextActivityResultLauncher == null) {
            AbstractC2855l.y("addContactLauncher");
            appContextActivityResultLauncher = null;
        }
        return appContextActivityResultLauncher.launch(new AddContactInput(list), fVar);
    }

    public final Object launchEditContact(Uri uri, n7.f fVar) {
        AppContextActivityResultLauncher<EditContactInput, Boolean> appContextActivityResultLauncher = this.editContactLauncher;
        if (appContextActivityResultLauncher == null) {
            AbstractC2855l.y("editContactLauncher");
            appContextActivityResultLauncher = null;
        }
        return appContextActivityResultLauncher.launch(new EditContactInput(uri), fVar);
    }

    public final Object launchPickContact(n7.f fVar) {
        AppContextActivityResultLauncher<PickContactInput, Uri> appContextActivityResultLauncher = this.pickContactLauncher;
        if (appContextActivityResultLauncher == null) {
            AbstractC2855l.y("pickContactLauncher");
            appContextActivityResultLauncher = null;
        }
        return appContextActivityResultLauncher.launch(new PickContactInput(), fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object registerContactContracts(AppContextActivityResultCaller appContextActivityResultCaller, n7.f fVar) {
        AnonymousClass1 anonymousClass1;
        AppContextActivityResultCaller appContextActivityResultCaller2;
        ContactIntentDelegate contactIntentDelegate;
        ContactIntentDelegate contactIntentDelegate2;
        ContactIntentDelegate contactIntentDelegate3;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & a.INVALID_ID) != 0) {
                anonymousClass1.label = i10 - a.INVALID_ID;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        }
        AnonymousClass1 anonymousClass12 = anonymousClass1;
        Object objRegisterForActivityResult$default = anonymousClass12.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass12.label;
        if (i11 == 0) {
            AbstractC2753p.b(objRegisterForActivityResult$default);
            EditContactContract editContactContract = new EditContactContract();
            anonymousClass12.L$0 = appContextActivityResultCaller;
            anonymousClass12.L$1 = this;
            anonymousClass12.label = 1;
            appContextActivityResultCaller2 = appContextActivityResultCaller;
            objRegisterForActivityResult$default = AppContextActivityResultCaller.DefaultImpls.registerForActivityResult$default(appContextActivityResultCaller2, editContactContract, null, anonymousClass12, 2, null);
            if (objRegisterForActivityResult$default != objE) {
                contactIntentDelegate = this;
            }
            return objE;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                contactIntentDelegate3 = (ContactIntentDelegate) anonymousClass12.L$0;
                AbstractC2753p.b(objRegisterForActivityResult$default);
                contactIntentDelegate3.pickContactLauncher = (AppContextActivityResultLauncher) objRegisterForActivityResult$default;
                return C2735B.f28704a;
            }
            contactIntentDelegate2 = (ContactIntentDelegate) anonymousClass12.L$1;
            appContextActivityResultCaller2 = (AppContextActivityResultCaller) anonymousClass12.L$0;
            AbstractC2753p.b(objRegisterForActivityResult$default);
            contactIntentDelegate2.addContactLauncher = (AppContextActivityResultLauncher) objRegisterForActivityResult$default;
            PickContactContract pickContactContract = new PickContactContract();
            anonymousClass12.L$0 = this;
            anonymousClass12.L$1 = null;
            anonymousClass12.label = 3;
            objRegisterForActivityResult$default = AppContextActivityResultCaller.DefaultImpls.registerForActivityResult$default(appContextActivityResultCaller2, pickContactContract, null, anonymousClass12, 2, null);
            if (objRegisterForActivityResult$default != objE) {
                contactIntentDelegate3 = this;
                contactIntentDelegate3.pickContactLauncher = (AppContextActivityResultLauncher) objRegisterForActivityResult$default;
                return C2735B.f28704a;
            }
            return objE;
        }
        contactIntentDelegate = (ContactIntentDelegate) anonymousClass12.L$1;
        appContextActivityResultCaller2 = (AppContextActivityResultCaller) anonymousClass12.L$0;
        AbstractC2753p.b(objRegisterForActivityResult$default);
        contactIntentDelegate.editContactLauncher = (AppContextActivityResultLauncher) objRegisterForActivityResult$default;
        AddContactContract addContactContract = new AddContactContract();
        anonymousClass12.L$0 = appContextActivityResultCaller2;
        anonymousClass12.L$1 = this;
        anonymousClass12.label = 2;
        objRegisterForActivityResult$default = AppContextActivityResultCaller.DefaultImpls.registerForActivityResult$default(appContextActivityResultCaller2, addContactContract, null, anonymousClass12, 2, null);
        if (objRegisterForActivityResult$default != objE) {
            contactIntentDelegate2 = this;
            contactIntentDelegate2.addContactLauncher = (AppContextActivityResultLauncher) objRegisterForActivityResult$default;
            PickContactContract pickContactContract2 = new PickContactContract();
            anonymousClass12.L$0 = this;
            anonymousClass12.L$1 = null;
            anonymousClass12.label = 3;
            objRegisterForActivityResult$default = AppContextActivityResultCaller.DefaultImpls.registerForActivityResult$default(appContextActivityResultCaller2, pickContactContract2, null, anonymousClass12, 2, null);
            if (objRegisterForActivityResult$default != objE) {
            }
        }
        return objE;
    }
}
