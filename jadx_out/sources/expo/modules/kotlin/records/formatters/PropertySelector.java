package expo.modules.kotlin.records.formatters;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.records.formatters.PropertySelector;
import expo.modules.kotlin.records.formatters.ValueOrSkip;
import i7.C2750m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.I;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0004:\u0002\u0015\u0016B'\u0012\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nR2\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\rR:\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lexpo/modules/kotlin/records/formatters/PropertySelector;", "Lexpo/modules/kotlin/records/Record;", "RecordType", "PropertyType", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lkotlin/Function1;", "LC7/m;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "selector", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "getSelector$expo_modules_core_release", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/Function2;", "action", "Lkotlin/jvm/functions/Function2;", "getAction$expo_modules_core_release", "()Lkotlin/jvm/functions/Function2;", "setAction$expo_modules_core_release", "(Lkotlin/jvm/functions/Function2;)V", "ActionBuilder", "ActionBuilderForRecord", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PropertySelector<RecordType extends Record, PropertyType> {
    private Function2 action;
    private final Function1 selector;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0096\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004Jm\u0010\n\u001a\u0018\u0012\u0004\u0012\u00028\u00030\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0003\u0010\u0005\"\u0004\b\u0004\u0010\u00062\u001e\b\u0002\u0010\b\u001a\u0018\u0012\u0004\u0012\u00028\u00030\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00028\u00020\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\f0\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00028\u00020\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0003\u0010\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0011¢\u0006\u0004\b\u0013\u0010\u0014JC\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00028\u00020\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0003\u0010\u00102\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\t¢\u0006\u0004\b\u0013\u0010\u000fJ9\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00028\u00020\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\f0\u0011¢\u0006\u0004\b\u0016\u0010\u0014J1\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00028\u00020\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u0017¢\u0006\u0004\b\u0016\u0010\u0018J=\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00028\u00020\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b\u0016\u0010\u000f¨\u0006\u0019"}, d2 = {"Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;", "InputType", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Lexpo/modules/kotlin/records/formatters/PropertySelector;)V", "T", "R", "Lexpo/modules/kotlin/records/formatters/PropertySelector;", "nextBuilder", "Lkotlin/Function2;", "nextAction", "(Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "shouldSkip", "defaultSkipAction", "(Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;", "ResultType", "Lkotlin/Function1;", "mapper", "map", "(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;", "valueSelector", "skip", "Lexpo/modules/kotlin/records/formatters/ValueSelector;", "(Lexpo/modules/kotlin/records/formatters/ValueSelector;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public class ActionBuilder<InputType> {
        public ActionBuilder() {
        }

        private final PropertySelector<RecordType, PropertyType>.ActionBuilder<InputType> defaultSkipAction(final Function2 shouldSkip) {
            return (PropertySelector<RecordType, PropertyType>.ActionBuilder<InputType>) nextAction(PropertySelector.this.new ActionBuilder<>(), new Function2() { // from class: expo.modules.kotlin.records.formatters.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PropertySelector.ActionBuilder.defaultSkipAction$lambda$1(shouldSkip, (Record) obj, obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ValueOrSkip defaultSkipAction$lambda$1(Function2 function2, Record record, Object obj) {
            AbstractC2855l.g(record, "record");
            return ((Boolean) function2.invoke(record, obj)).booleanValue() ? ValueOrSkip.Skip.INSTANCE : new ValueOrSkip.Value(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object map$lambda$2(Function1 function1, Record record, Object obj) {
            AbstractC2855l.g(record, "<unused var>");
            return function1.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object map$lambda$3(Function2 function2, Record record, Object obj) {
            AbstractC2855l.g(record, "record");
            return function2.invoke(record, obj);
        }

        private final <T, R> PropertySelector<RecordType, PropertyType>.ActionBuilder<T> nextAction(PropertySelector<RecordType, PropertyType>.ActionBuilder<T> nextBuilder, Function2 nextAction) {
            AbstractC2855l.e(nextAction, "null cannot be cast to non-null type kotlin.Function2<RecordType of expo.modules.kotlin.records.formatters.PropertySelector, kotlin.Any?, kotlin.Any?>");
            final Function2 function2 = (Function2) I.e(nextAction, 2);
            final Function2 action = PropertySelector.this.getAction();
            PropertySelector<RecordType, PropertyType> propertySelector = PropertySelector.this;
            if (action != null) {
                function2 = new Function2() { // from class: expo.modules.kotlin.records.formatters.j
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PropertySelector.ActionBuilder.nextAction$lambda$0(action, function2, (Record) obj, obj2);
                    }
                };
            }
            propertySelector.setAction$expo_modules_core_release(function2);
            return nextBuilder;
        }

        static /* synthetic */ ActionBuilder nextAction$default(ActionBuilder actionBuilder, ActionBuilder actionBuilder2, Function2 function2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextAction");
            }
            if ((i10 & 1) != 0) {
                actionBuilder2 = PropertySelector.this.new ActionBuilder();
            }
            return actionBuilder.nextAction(actionBuilder2, function2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object nextAction$lambda$0(Function2 function2, Function2 function22, Record record, Object obj) {
            AbstractC2855l.g(record, "record");
            Object objInvoke = function2.invoke(record, obj);
            if (!(objInvoke instanceof ValueOrSkip)) {
                return function22.invoke(record, objInvoke);
            }
            ValueOrSkip valueOrSkip = (ValueOrSkip) objInvoke;
            if (valueOrSkip instanceof ValueOrSkip.Value) {
                return function22.invoke(record, ((ValueOrSkip.Value) objInvoke).getValue());
            }
            ValueOrSkip.Skip skip = ValueOrSkip.Skip.INSTANCE;
            if (AbstractC2855l.b(valueOrSkip, skip)) {
                return skip;
            }
            throw new C2750m();
        }

        public static /* synthetic */ ActionBuilder skip$default(ActionBuilder actionBuilder, Function1 function1, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: skip");
            }
            if ((i10 & 1) != 0) {
                function1 = new Function1() { // from class: expo.modules.kotlin.records.formatters.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(PropertySelector.ActionBuilder.skip$lambda$4(obj2));
                    }
                };
            }
            return actionBuilder.skip(function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean skip$lambda$4(Object obj) {
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean skip$lambda$5(Function1 function1, Record record, Object obj) {
            AbstractC2855l.g(record, "<unused var>");
            return ((Boolean) function1.invoke(obj)).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean skip$lambda$6(ValueSelector valueSelector, Record record, Object obj) {
            AbstractC2855l.g(record, "<unused var>");
            return valueSelector.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean skip$lambda$7(Function2 function2, Record record, Object obj) {
            AbstractC2855l.g(record, "record");
            return ((Boolean) function2.invoke(record, obj)).booleanValue();
        }

        public final <ResultType> PropertySelector<RecordType, PropertyType>.ActionBuilder<InputType> map(final Function1 mapper) {
            AbstractC2855l.g(mapper, "mapper");
            return nextAction$default(this, null, new Function2() { // from class: expo.modules.kotlin.records.formatters.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PropertySelector.ActionBuilder.map$lambda$2(mapper, (Record) obj, obj2);
                }
            }, 1, null);
        }

        public final PropertySelector<RecordType, PropertyType>.ActionBuilder<InputType> skip(final Function1 valueSelector) {
            AbstractC2855l.g(valueSelector, "valueSelector");
            return defaultSkipAction(new Function2() { // from class: expo.modules.kotlin.records.formatters.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Boolean.valueOf(PropertySelector.ActionBuilder.skip$lambda$5(valueSelector, (Record) obj, obj2));
                }
            });
        }

        public final <ResultType> PropertySelector<RecordType, PropertyType>.ActionBuilder<InputType> map(final Function2 mapper) {
            AbstractC2855l.g(mapper, "mapper");
            return nextAction$default(this, null, new Function2() { // from class: expo.modules.kotlin.records.formatters.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PropertySelector.ActionBuilder.map$lambda$3(mapper, (Record) obj, obj2);
                }
            }, 1, null);
        }

        public final PropertySelector<RecordType, PropertyType>.ActionBuilder<InputType> skip(final ValueSelector<InputType> valueSelector) {
            AbstractC2855l.g(valueSelector, "valueSelector");
            return defaultSkipAction(new Function2() { // from class: expo.modules.kotlin.records.formatters.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Boolean.valueOf(PropertySelector.ActionBuilder.skip$lambda$6(valueSelector, (Record) obj, obj2));
                }
            });
        }

        public final PropertySelector<RecordType, PropertyType>.ActionBuilder<InputType> skip(final Function2 valueSelector) {
            AbstractC2855l.g(valueSelector, "valueSelector");
            return defaultSkipAction(new Function2() { // from class: expo.modules.kotlin.records.formatters.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Boolean.valueOf(PropertySelector.ActionBuilder.skip$lambda$7(valueSelector, (Record) obj, obj2));
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u0018\u0012\u0004\u0012\u00028\u00020\u0003R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\t\u001a\u0018\u0012\u0004\u0012\u00028\u00020\u0003R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\t\u001a\u0018\u0012\u0004\u0012\u00028\u00020\u0003R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0010"}, d2 = {"Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilderForRecord;", "Lexpo/modules/kotlin/records/Record;", "InputType", "Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;", "Lexpo/modules/kotlin/records/formatters/PropertySelector;", "<init>", "(Lexpo/modules/kotlin/records/formatters/PropertySelector;)V", "Lexpo/modules/kotlin/records/formatters/Formatter;", "formatter", "format", "(Lexpo/modules/kotlin/records/formatters/Formatter;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;", "Lkotlin/Function1;", "Lexpo/modules/kotlin/records/formatters/Formatter$Builder;", "Li7/B;", "builder", "(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ActionBuilderForRecord<InputType extends Record> extends PropertySelector<RecordType, PropertyType>.ActionBuilder<InputType> {
        public ActionBuilderForRecord() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FormattedRecord format$lambda$0(Formatter formatter, Record record) {
            AbstractC2855l.g(record, "record");
            return formatter.format(record);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FormattedRecord format$lambda$1(Function1 function1, Record record) {
            AbstractC2855l.g(record, "record");
            return FormatterKt.formatter(function1).format(record);
        }

        public final PropertySelector<RecordType, PropertyType>.ActionBuilder<InputType> format(final Formatter<InputType> formatter) {
            AbstractC2855l.g(formatter, "formatter");
            return map(new Function1() { // from class: expo.modules.kotlin.records.formatters.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PropertySelector.ActionBuilderForRecord.format$lambda$0(formatter, (Record) obj);
                }
            });
        }

        public final PropertySelector<RecordType, PropertyType>.ActionBuilder<InputType> format(final Function1 builder) {
            AbstractC2855l.g(builder, "builder");
            return map(new Function1() { // from class: expo.modules.kotlin.records.formatters.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PropertySelector.ActionBuilderForRecord.format$lambda$1(builder, (Record) obj);
                }
            });
        }
    }

    public PropertySelector(Function1 selector) {
        AbstractC2855l.g(selector, "selector");
        this.selector = selector;
    }

    /* JADX INFO: renamed from: getAction$expo_modules_core_release, reason: from getter */
    public final Function2 getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: getSelector$expo_modules_core_release, reason: from getter */
    public final Function1 getSelector() {
        return this.selector;
    }

    public final void setAction$expo_modules_core_release(Function2 function2) {
        this.action = function2;
    }
}
