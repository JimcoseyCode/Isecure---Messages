package expo.modules.kotlin.objects;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\t\u001a\u00020\u0000\"\u0006\b\u0000\u0010\u0006\u0018\u00012\u000e\b\u0004\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R,\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Lexpo/modules/kotlin/objects/ConstantComponentBuilder;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", "<init>", "(Ljava/lang/String;)V", "R", "Lkotlin/Function0;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "get", "(Lw7/a;)Lexpo/modules/kotlin/objects/ConstantComponentBuilder;", "Lexpo/modules/kotlin/objects/ConstantComponent;", "build", "()Lexpo/modules/kotlin/objects/ConstantComponent;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getter", "Lw7/a;", "getGetter", "()Lw7/a;", "setGetter", "(Lw7/a;)V", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ConstantComponentBuilder {
    private InterfaceC3487a getter;
    private final String name;

    public ConstantComponentBuilder(String name) {
        AbstractC2855l.g(name, "name");
        this.name = name;
    }

    public final ConstantComponent build() {
        String str = this.name;
        InterfaceC3487a interfaceC3487a = this.getter;
        if (interfaceC3487a != null) {
            return new ConstantComponent(str, interfaceC3487a);
        }
        throw new IllegalArgumentException(("The constant '" + str + "' doesn't have getter.").toString());
    }

    public final /* synthetic */ <R> ConstantComponentBuilder get(final InterfaceC3487a body) {
        AbstractC2855l.g(body, "body");
        AbstractC2855l.l();
        setGetter(new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ConstantComponentBuilder$get$1$1
            /* JADX WARN: Type inference failed for: r0v1, types: [R, java.lang.Object] */
            @Override // w7.InterfaceC3487a
            public final R invoke() {
                return body.invoke();
            }
        });
        return this;
    }

    public final InterfaceC3487a getGetter() {
        return this.getter;
    }

    public final String getName() {
        return this.name;
    }

    public final void setGetter(InterfaceC3487a interfaceC3487a) {
        this.getter = interfaceC3487a;
    }
}
