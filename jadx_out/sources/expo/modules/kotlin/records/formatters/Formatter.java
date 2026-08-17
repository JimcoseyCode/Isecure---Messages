package expo.modules.kotlin.records.formatters;

import C7.m;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.records.formatters.Formatter;
import expo.modules.kotlin.records.formatters.PropertySelector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.I;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0017B\u001f\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\t\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\fJ9\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00102\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012R*\u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lexpo/modules/kotlin/records/formatters/Formatter;", "Lexpo/modules/kotlin/records/Record;", "RecordType", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/records/formatters/PropertySelector;", "selectors", "<init>", "(Ljava/util/List;)V", "record", "Lexpo/modules/kotlin/records/formatters/FormattedRecord;", "invoke", "(Lexpo/modules/kotlin/records/Record;)Lexpo/modules/kotlin/records/formatters/FormattedRecord;", "format", "LC7/m;", "property", "Lkotlin/Function2;", "getAction$expo_modules_core_release", "(LC7/m;)Lkotlin/jvm/functions/Function2;", "getAction", "Ljava/util/List;", "getSelectors$expo_modules_core_release", "()Ljava/util/List;", "Builder", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Formatter<RecordType extends Record> {
    private final List<PropertySelector<RecordType, ?>> selectors;

    /* JADX WARN: Multi-variable type inference failed */
    public Formatter(List<? extends PropertySelector<RecordType, ?>> selectors) {
        AbstractC2855l.g(selectors, "selectors");
        this.selectors = selectors;
    }

    public final FormattedRecord<RecordType> format(RecordType record) {
        AbstractC2855l.g(record, "record");
        return new FormattedRecord<>(record, this);
    }

    public final Function2 getAction$expo_modules_core_release(m property) {
        Object next;
        AbstractC2855l.g(property, "property");
        Iterator<T> it = this.selectors.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Boolean) ((PropertySelector) next).getSelector().invoke(property)).booleanValue()) {
                break;
            }
        }
        PropertySelector propertySelector = (PropertySelector) next;
        return (Function2) I.e(propertySelector != null ? propertySelector.getAction() : null, 2);
    }

    public final List<PropertySelector<RecordType, ?>> getSelectors$expo_modules_core_release() {
        return this.selectors;
    }

    public final FormattedRecord<RecordType> invoke(RecordType record) {
        AbstractC2855l.g(record, "record");
        return new FormattedRecord<>(record, this);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0007\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J=\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00028\u00020\tR\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\n\"\u0004\b\u0002\u0010\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00028\u00020\rR\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\n\"\b\b\u0002\u0010\u0006*\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u000eJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R2\u0010\u0014\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0001\u0012\u0002\b\u00030\n0\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lexpo/modules/kotlin/records/formatters/Formatter$Builder;", "Lexpo/modules/kotlin/records/Record;", "RecordType", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "PropertyType", "LC7/m;", "propertyRef", "Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;", "Lexpo/modules/kotlin/records/formatters/PropertySelector;", "property", "(LC7/m;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;", "Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilderForRecord;", "(LC7/m;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilderForRecord;", "Lexpo/modules/kotlin/records/formatters/Formatter;", "build$expo_modules_core_release", "()Lexpo/modules/kotlin/records/formatters/Formatter;", "build", PointerEventHelper.POINTER_TYPE_UNKNOWN, "selectors", "Ljava/util/List;", "getSelectors$expo_modules_core_release", "()Ljava/util/List;", "setSelectors$expo_modules_core_release", "(Ljava/util/List;)V", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder<RecordType extends Record> {
        private List<PropertySelector<RecordType, ?>> selectors = new ArrayList();

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean property$lambda$0(m mVar, m property) {
            AbstractC2855l.g(property, "property");
            return AbstractC2855l.b(property, mVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean property$lambda$1(m mVar, m property) {
            AbstractC2855l.g(property, "property");
            return AbstractC2855l.b(property.getName(), mVar.getName()) && AbstractC2855l.b(property.getReturnType(), mVar.getReturnType());
        }

        public final Formatter<RecordType> build$expo_modules_core_release() {
            return new Formatter<>(this.selectors);
        }

        public final List<PropertySelector<RecordType, ?>> getSelectors$expo_modules_core_release() {
            return this.selectors;
        }

        public final <PropertyType> PropertySelector<RecordType, PropertyType>.ActionBuilder<PropertyType> property(final m propertyRef) {
            AbstractC2855l.g(propertyRef, "propertyRef");
            PropertySelector<RecordType, ?> propertySelector = new PropertySelector<>(new Function1() { // from class: expo.modules.kotlin.records.formatters.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(Formatter.Builder.property$lambda$0(propertyRef, (m) obj));
                }
            });
            this.selectors.add(propertySelector);
            return new PropertySelector.ActionBuilder<>();
        }

        public final void setSelectors$expo_modules_core_release(List<PropertySelector<RecordType, ?>> list) {
            AbstractC2855l.g(list, "<set-?>");
            this.selectors = list;
        }

        /* JADX INFO: renamed from: property, reason: collision with other method in class */
        public final <PropertyType extends Record> PropertySelector<RecordType, PropertyType>.ActionBuilderForRecord<PropertyType> m232property(final m propertyRef) {
            AbstractC2855l.g(propertyRef, "propertyRef");
            PropertySelector<RecordType, ?> propertySelector = new PropertySelector<>(new Function1() { // from class: expo.modules.kotlin.records.formatters.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(Formatter.Builder.property$lambda$1(propertyRef, (m) obj));
                }
            });
            this.selectors.add(propertySelector);
            return new PropertySelector.ActionBuilderForRecord<>();
        }
    }
}
