package expo.modules.kotlin.views.decorators;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.BoxShadow;
import com.facebook.react.uimanager.style.LogicalEdge;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.views.AnyViewProp;
import expo.modules.kotlin.views.ConcreteViewProp;
import expo.modules.kotlin.views.ViewDefinitionBuilder;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import i7.C2735B;
import i7.t;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import w7.o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\b\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\b\u0004\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\b\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\b\u0010\n\u001aM\u0010\f\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\b\u0004\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00060\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\t\u001a#\u0010\f\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\f\u0010\n\u001aM\u0010\u000f\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\b\u0004\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00060\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\t\u001a#\u0010\u000f\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\n\u001aG\u0010\u0012\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001c\b\u0004\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00060\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0012\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\n\u001aG\u0010\u0014\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001c\b\u0004\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013\u001a#\u0010\u0014\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\n\u001aK\u0010\u0017\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022 \b\u0004\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u00060\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0013\u001a#\u0010\u0017\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\n\u001a#\u0010\u0018\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0001¢\u0006\u0004\b\u0018\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"Landroid/view/View;", "T", "Lexpo/modules/kotlin/views/ViewDefinitionBuilder;", "Lkotlin/Function3;", "Lcom/facebook/react/uimanager/style/LogicalEdge;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Li7/B;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "UseBorderColorProps", "(Lexpo/modules/kotlin/views/ViewDefinitionBuilder;Lw7/o;)V", "(Lexpo/modules/kotlin/views/ViewDefinitionBuilder;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "UseBorderWidthProps", "Lcom/facebook/react/uimanager/style/BorderRadiusProp;", "Lcom/facebook/react/uimanager/LengthPercentage;", "UseBorderRadiusProps", "Lkotlin/Function2;", "Lcom/facebook/react/uimanager/style/BorderStyle;", "UseBorderStyleProp", "(Lexpo/modules/kotlin/views/ViewDefinitionBuilder;Lkotlin/jvm/functions/Function2;)V", "UseBackgroundProp", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/uimanager/style/BoxShadow;", "UseBoxShadowProp", "UseCSSProps", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CSSPropsKt {
    public static final /* synthetic */ <T extends View> void UseBackgroundProp(ViewDefinitionBuilder<T> viewDefinitionBuilder, final Function2 body) {
        AbstractC2855l.g(viewDefinitionBuilder, "<this>");
        AbstractC2855l.g(body, "body");
        AbstractC2855l.l();
        Function2 function2 = new Function2() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt.UseBackgroundProp.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((View) obj, (Integer) obj2);
                return C2735B.f28704a;
            }

            /* JADX WARN: Incorrect types in method signature: (TT;Ljava/lang/Integer;)V */
            public final void invoke(View view, Integer num) {
                AbstractC2855l.g(view, "view");
                body.invoke(view, num);
            }
        };
        Map<String, AnyViewProp> props = viewDefinitionBuilder.getProps();
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(D.b(Integer.class), Boolean.TRUE));
        if (anyType == null) {
            anyType = new AnyType(new LazyKType(D.b(Integer.class), true, CSSPropsKt$UseBackgroundProp$$inlined$Prop$1.INSTANCE), null);
        }
        props.put(ViewProps.BACKGROUND_COLOR, new ConcreteViewProp(ViewProps.BACKGROUND_COLOR, anyType, function2));
    }

    public static final /* synthetic */ <T extends View> void UseBorderColorProps(ViewDefinitionBuilder<T> viewDefinitionBuilder, final o body) {
        AbstractC2855l.g(viewDefinitionBuilder, "<this>");
        AbstractC2855l.g(body, "body");
        Pair[] pairArr = {t.a(ViewProps.BORDER_COLOR, 8), t.a(ViewProps.BORDER_LEFT_COLOR, 0), t.a(ViewProps.BORDER_RIGHT_COLOR, 2), t.a(ViewProps.BORDER_TOP_COLOR, 1), t.a(ViewProps.BORDER_BOTTOM_COLOR, 3), t.a(ViewProps.BORDER_START_COLOR, 4), t.a(ViewProps.BORDER_END_COLOR, 5), t.a(ViewProps.BORDER_BLOCK_COLOR, 9), t.a(ViewProps.BORDER_BLOCK_END_COLOR, 10), t.a(ViewProps.BORDER_BLOCK_START_COLOR, 11)};
        AbstractC2855l.l();
        final o oVar = new o() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt.UseBorderColorProps.1
            @Override // w7.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((View) obj, ((Number) obj2).intValue(), (Integer) obj3);
                return C2735B.f28704a;
            }

            /* JADX WARN: Incorrect types in method signature: (TT;ILjava/lang/Integer;)V */
            public final void invoke(View view, int i10, Integer num) {
                AbstractC2855l.g(view, "view");
                body.invoke(view, LogicalEdge.INSTANCE.fromSpacingType(i10), num);
            }
        };
        for (int i10 = 0; i10 < 10; i10++) {
            Pair pair = pairArr[i10];
            String str = (String) pair.getFirst();
            final Object second = pair.getSecond();
            AbstractC2855l.l();
            Function2 function2 = new Function2() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt$UseBorderColorProps$$inlined$PropGroup$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((View) obj, obj2);
                    return C2735B.f28704a;
                }

                /* JADX WARN: Incorrect types in method signature: (TT;Ljava/lang/Integer;)V */
                public final void invoke(View view, Object obj) {
                    AbstractC2855l.g(view, "view");
                    oVar.invoke(view, second, obj);
                }
            };
            Map<String, AnyViewProp> props = viewDefinitionBuilder.getProps();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(D.b(Integer.class), Boolean.TRUE));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(D.b(Integer.class), true, CSSPropsKt$UseBorderColorProps$$inlined$PropGroup$2.INSTANCE), null);
            }
            props.put(str, new ConcreteViewProp(str, anyType, function2));
        }
    }

    public static final /* synthetic */ <T extends View> void UseBorderRadiusProps(ViewDefinitionBuilder<T> viewDefinitionBuilder, final o body) {
        AbstractC2855l.g(viewDefinitionBuilder, "<this>");
        AbstractC2855l.g(body, "body");
        String[] strArr = {ViewProps.BORDER_RADIUS, ViewProps.BORDER_TOP_LEFT_RADIUS, ViewProps.BORDER_TOP_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_LEFT_RADIUS, ViewProps.BORDER_TOP_START_RADIUS, ViewProps.BORDER_TOP_END_RADIUS, ViewProps.BORDER_BOTTOM_START_RADIUS, ViewProps.BORDER_BOTTOM_END_RADIUS, ViewProps.BORDER_END_END_RADIUS, ViewProps.BORDER_END_START_RADIUS, ViewProps.BORDER_START_END_RADIUS, ViewProps.BORDER_START_START_RADIUS};
        AbstractC2855l.l();
        final o oVar = new o() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt.UseBorderRadiusProps.1
            @Override // w7.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((View) obj, ((Number) obj2).intValue(), (Float) obj3);
                return C2735B.f28704a;
            }

            /* JADX WARN: Incorrect types in method signature: (TT;ILjava/lang/Float;)V */
            public final void invoke(View view, int i10, Float f10) {
                AbstractC2855l.g(view, "view");
                body.invoke(view, BorderRadiusProp.getEntries().get(i10), f10 != null ? new LengthPercentage(f10.floatValue(), LengthPercentageType.POINT) : null);
            }
        };
        int i10 = 0;
        final int i11 = 0;
        while (i10 < 13) {
            String str = strArr[i10];
            int i12 = i11 + 1;
            AbstractC2855l.l();
            Function2 function2 = new Function2() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt$UseBorderRadiusProps$$inlined$PropGroup$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((View) obj, obj2);
                    return C2735B.f28704a;
                }

                /* JADX WARN: Incorrect types in method signature: (TT;Ljava/lang/Float;)V */
                public final void invoke(View view, Object obj) {
                    AbstractC2855l.g(view, "view");
                    oVar.invoke(view, Integer.valueOf(i11), obj);
                }
            };
            Map<String, AnyViewProp> props = viewDefinitionBuilder.getProps();
            AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(Float.class), Boolean.TRUE));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(D.b(Float.class), true, CSSPropsKt$UseBorderRadiusProps$$inlined$PropGroup$2.INSTANCE), null);
            }
            props.put(str, new ConcreteViewProp(str, anyType, function2));
            i10++;
            i11 = i12;
        }
    }

    public static final /* synthetic */ <T extends View> void UseBorderStyleProp(ViewDefinitionBuilder<T> viewDefinitionBuilder, final Function2 body) {
        AbstractC2855l.g(viewDefinitionBuilder, "<this>");
        AbstractC2855l.g(body, "body");
        AbstractC2855l.l();
        Function2 function2 = new Function2() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt.UseBorderStyleProp.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((View) obj, (String) obj2);
                return C2735B.f28704a;
            }

            /* JADX WARN: Incorrect types in method signature: (TT;Ljava/lang/String;)V */
            public final void invoke(View view, String str) {
                AbstractC2855l.g(view, "view");
                body.invoke(view, str != null ? BorderStyle.INSTANCE.fromString(str) : null);
            }
        };
        Map<String, AnyViewProp> props = viewDefinitionBuilder.getProps();
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), Boolean.TRUE));
        if (anyType == null) {
            anyType = new AnyType(new LazyKType(D.b(String.class), true, CSSPropsKt$UseBorderStyleProp$$inlined$Prop$1.INSTANCE), null);
        }
        props.put("borderStyle", new ConcreteViewProp("borderStyle", anyType, function2));
    }

    public static final /* synthetic */ <T extends View> void UseBorderWidthProps(ViewDefinitionBuilder<T> viewDefinitionBuilder, final o body) {
        AbstractC2855l.g(viewDefinitionBuilder, "<this>");
        AbstractC2855l.g(body, "body");
        String[] strArr = {ViewProps.BORDER_WIDTH, ViewProps.BORDER_LEFT_WIDTH, ViewProps.BORDER_RIGHT_WIDTH, ViewProps.BORDER_TOP_WIDTH, ViewProps.BORDER_BOTTOM_WIDTH, ViewProps.BORDER_START_WIDTH, ViewProps.BORDER_END_WIDTH};
        AbstractC2855l.l();
        final o oVar = new o() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt.UseBorderWidthProps.1
            @Override // w7.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((View) obj, ((Number) obj2).intValue(), (Float) obj3);
                return C2735B.f28704a;
            }

            /* JADX WARN: Incorrect types in method signature: (TT;ILjava/lang/Float;)V */
            public final void invoke(View view, int i10, Float f10) {
                AbstractC2855l.g(view, "view");
                body.invoke(view, LogicalEdge.getEntries().get(i10), f10);
            }
        };
        int i10 = 0;
        final int i11 = 0;
        while (i10 < 7) {
            String str = strArr[i10];
            int i12 = i11 + 1;
            AbstractC2855l.l();
            Function2 function2 = new Function2() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt$UseBorderWidthProps$$inlined$PropGroup$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((View) obj, obj2);
                    return C2735B.f28704a;
                }

                /* JADX WARN: Incorrect types in method signature: (TT;Ljava/lang/Float;)V */
                public final void invoke(View view, Object obj) {
                    AbstractC2855l.g(view, "view");
                    oVar.invoke(view, Integer.valueOf(i11), obj);
                }
            };
            Map<String, AnyViewProp> props = viewDefinitionBuilder.getProps();
            AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(Float.class), Boolean.TRUE));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(D.b(Float.class), true, CSSPropsKt$UseBorderWidthProps$$inlined$PropGroup$2.INSTANCE), null);
            }
            props.put(str, new ConcreteViewProp(str, anyType, function2));
            i10++;
            i11 = i12;
        }
    }

    public static final /* synthetic */ <T extends View> void UseBoxShadowProp(ViewDefinitionBuilder<T> viewDefinitionBuilder, final Function2 body) {
        AbstractC2855l.g(viewDefinitionBuilder, "<this>");
        AbstractC2855l.g(body, "body");
        AbstractC2855l.l();
        Function2 function2 = new Function2() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt.UseBoxShadowProp.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((View) obj, (ReadableArray) obj2);
                return C2735B.f28704a;
            }

            /* JADX WARN: Incorrect types in method signature: (TT;Lcom/facebook/react/bridge/ReadableArray;)V */
            public final void invoke(View view, ReadableArray readableArray) {
                AbstractC2855l.g(view, "view");
                if (readableArray == null) {
                    body.invoke(view, AbstractC2800q.j());
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int size = readableArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    BoxShadow.Companion companion = BoxShadow.INSTANCE;
                    ReadableMap map = readableArray.getMap(i10);
                    Context context = view.getContext();
                    AbstractC2855l.f(context, "getContext(...)");
                    BoxShadow boxShadow = companion.parse(map, context);
                    if (boxShadow != null) {
                        arrayList.add(boxShadow);
                    }
                }
                body.invoke(view, arrayList);
            }
        };
        Map<String, AnyViewProp> props = viewDefinitionBuilder.getProps();
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(D.b(ReadableArray.class), Boolean.TRUE));
        if (anyType == null) {
            anyType = new AnyType(new LazyKType(D.b(ReadableArray.class), true, CSSPropsKt$UseBoxShadowProp$$inlined$Prop$1.INSTANCE), null);
        }
        props.put(ViewProps.BOX_SHADOW, new ConcreteViewProp(ViewProps.BOX_SHADOW, anyType, function2));
    }

    public static final <T extends View> void UseCSSProps(ViewDefinitionBuilder<T> viewDefinitionBuilder) {
        AbstractC2855l.g(viewDefinitionBuilder, "<this>");
        UseBorderColorProps(viewDefinitionBuilder);
        UseBorderWidthProps(viewDefinitionBuilder);
        UseBorderRadiusProps(viewDefinitionBuilder);
        UseBorderStyleProp(viewDefinitionBuilder);
        UseBackgroundProp(viewDefinitionBuilder);
        UseBoxShadowProp(viewDefinitionBuilder);
    }

    private static final <T extends View> void UseBackgroundProp(ViewDefinitionBuilder<T> viewDefinitionBuilder) {
        Function2 function2 = new Function2() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt$UseBackgroundProp$$inlined$UseBackgroundProp$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((View) obj, (Integer) obj2);
                return C2735B.f28704a;
            }

            public final void invoke(View view, Integer num) {
                AbstractC2855l.g(view, "view");
                BackgroundStyleApplicator.setBackgroundColor(view, num);
            }
        };
        Map<String, AnyViewProp> props = viewDefinitionBuilder.getProps();
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(D.b(Integer.class), Boolean.TRUE));
        if (anyType == null) {
            anyType = new AnyType(new LazyKType(D.b(Integer.class), true, CSSPropsKt$UseBackgroundProp$$inlined$Prop$1.INSTANCE), null);
        }
        props.put(ViewProps.BACKGROUND_COLOR, new ConcreteViewProp(ViewProps.BACKGROUND_COLOR, anyType, function2));
    }

    private static final <T extends View> void UseBorderStyleProp(ViewDefinitionBuilder<T> viewDefinitionBuilder) {
        Function2 function2 = new Function2() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt$UseBorderStyleProp$$inlined$UseBorderStyleProp$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((View) obj, (String) obj2);
                return C2735B.f28704a;
            }

            public final void invoke(View view, String str) {
                AbstractC2855l.g(view, "view");
                BackgroundStyleApplicator.setBorderStyle(view, str != null ? BorderStyle.INSTANCE.fromString(str) : null);
            }
        };
        Map<String, AnyViewProp> props = viewDefinitionBuilder.getProps();
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), Boolean.TRUE));
        if (anyType == null) {
            anyType = new AnyType(new LazyKType(D.b(String.class), true, CSSPropsKt$UseBorderStyleProp$$inlined$Prop$1.INSTANCE), null);
        }
        props.put("borderStyle", new ConcreteViewProp("borderStyle", anyType, function2));
    }

    private static final <T extends View> void UseBoxShadowProp(ViewDefinitionBuilder<T> viewDefinitionBuilder) {
        Function2 function2 = new Function2() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt$UseBoxShadowProp$$inlined$UseBoxShadowProp$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((View) obj, (ReadableArray) obj2);
                return C2735B.f28704a;
            }

            public final void invoke(View view, ReadableArray readableArray) {
                AbstractC2855l.g(view, "view");
                if (readableArray == null) {
                    BackgroundStyleApplicator.setBoxShadow(view, (List<BoxShadow>) AbstractC2800q.j());
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int size = readableArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    BoxShadow.Companion companion = BoxShadow.INSTANCE;
                    ReadableMap map = readableArray.getMap(i10);
                    Context context = view.getContext();
                    AbstractC2855l.f(context, "getContext(...)");
                    BoxShadow boxShadow = companion.parse(map, context);
                    if (boxShadow != null) {
                        arrayList.add(boxShadow);
                    }
                }
                BackgroundStyleApplicator.setBoxShadow(view, arrayList);
            }
        };
        Map<String, AnyViewProp> props = viewDefinitionBuilder.getProps();
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(D.b(ReadableArray.class), Boolean.TRUE));
        if (anyType == null) {
            anyType = new AnyType(new LazyKType(D.b(ReadableArray.class), true, CSSPropsKt$UseBoxShadowProp$$inlined$Prop$1.INSTANCE), null);
        }
        props.put(ViewProps.BOX_SHADOW, new ConcreteViewProp(ViewProps.BOX_SHADOW, anyType, function2));
    }

    private static final <T extends View> void UseBorderRadiusProps(ViewDefinitionBuilder<T> viewDefinitionBuilder) {
        String[] strArr = {ViewProps.BORDER_RADIUS, ViewProps.BORDER_TOP_LEFT_RADIUS, ViewProps.BORDER_TOP_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_LEFT_RADIUS, ViewProps.BORDER_TOP_START_RADIUS, ViewProps.BORDER_TOP_END_RADIUS, ViewProps.BORDER_BOTTOM_START_RADIUS, ViewProps.BORDER_BOTTOM_END_RADIUS, ViewProps.BORDER_END_END_RADIUS, ViewProps.BORDER_END_START_RADIUS, ViewProps.BORDER_START_END_RADIUS, ViewProps.BORDER_START_START_RADIUS};
        final o oVar = new o() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt$UseBorderRadiusProps$$inlined$UseBorderRadiusProps$1
            @Override // w7.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((View) obj, ((Number) obj2).intValue(), (Float) obj3);
                return C2735B.f28704a;
            }

            public final void invoke(View view, int i10, Float f10) {
                AbstractC2855l.g(view, "view");
                BackgroundStyleApplicator.setBorderRadius(view, (BorderRadiusProp) BorderRadiusProp.getEntries().get(i10), f10 != null ? new LengthPercentage(f10.floatValue(), LengthPercentageType.POINT) : null);
            }
        };
        int i10 = 0;
        final int i11 = 0;
        while (i10 < 13) {
            String str = strArr[i10];
            int i12 = i11 + 1;
            Function2 function2 = new Function2() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt$UseBorderRadiusProps$$inlined$UseBorderRadiusProps$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((View) obj, (Float) obj2);
                    return C2735B.f28704a;
                }

                public final void invoke(View view, Float f10) {
                    AbstractC2855l.g(view, "view");
                    oVar.invoke(view, Integer.valueOf(i11), f10);
                }
            };
            Map<String, AnyViewProp> props = viewDefinitionBuilder.getProps();
            AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(Float.class), Boolean.TRUE));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(D.b(Float.class), true, CSSPropsKt$UseBorderRadiusProps$$inlined$PropGroup$2.INSTANCE), null);
            }
            props.put(str, new ConcreteViewProp(str, anyType, function2));
            i10++;
            i11 = i12;
        }
    }

    private static final <T extends View> void UseBorderWidthProps(ViewDefinitionBuilder<T> viewDefinitionBuilder) {
        String[] strArr = {ViewProps.BORDER_WIDTH, ViewProps.BORDER_LEFT_WIDTH, ViewProps.BORDER_RIGHT_WIDTH, ViewProps.BORDER_TOP_WIDTH, ViewProps.BORDER_BOTTOM_WIDTH, ViewProps.BORDER_START_WIDTH, ViewProps.BORDER_END_WIDTH};
        final o oVar = new o() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt$UseBorderWidthProps$$inlined$UseBorderWidthProps$1
            @Override // w7.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((View) obj, ((Number) obj2).intValue(), (Float) obj3);
                return C2735B.f28704a;
            }

            public final void invoke(View view, int i10, Float f10) {
                AbstractC2855l.g(view, "view");
                BackgroundStyleApplicator.setBorderWidth(view, (LogicalEdge) LogicalEdge.getEntries().get(i10), Float.valueOf(f10 != null ? f10.floatValue() : Float.NaN));
            }
        };
        int i10 = 0;
        final int i11 = 0;
        while (i10 < 7) {
            String str = strArr[i10];
            int i12 = i11 + 1;
            Function2 function2 = new Function2() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt$UseBorderWidthProps$$inlined$UseBorderWidthProps$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((View) obj, (Float) obj2);
                    return C2735B.f28704a;
                }

                public final void invoke(View view, Float f10) {
                    AbstractC2855l.g(view, "view");
                    oVar.invoke(view, Integer.valueOf(i11), f10);
                }
            };
            Map<String, AnyViewProp> props = viewDefinitionBuilder.getProps();
            AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(Float.class), Boolean.TRUE));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(D.b(Float.class), true, CSSPropsKt$UseBorderWidthProps$$inlined$PropGroup$2.INSTANCE), null);
            }
            props.put(str, new ConcreteViewProp(str, anyType, function2));
            i10++;
            i11 = i12;
        }
    }

    private static final <T extends View> void UseBorderColorProps(ViewDefinitionBuilder<T> viewDefinitionBuilder) {
        Pair[] pairArr = {t.a(ViewProps.BORDER_COLOR, 8), t.a(ViewProps.BORDER_LEFT_COLOR, 0), t.a(ViewProps.BORDER_RIGHT_COLOR, 2), t.a(ViewProps.BORDER_TOP_COLOR, 1), t.a(ViewProps.BORDER_BOTTOM_COLOR, 3), t.a(ViewProps.BORDER_START_COLOR, 4), t.a(ViewProps.BORDER_END_COLOR, 5), t.a(ViewProps.BORDER_BLOCK_COLOR, 9), t.a(ViewProps.BORDER_BLOCK_END_COLOR, 10), t.a(ViewProps.BORDER_BLOCK_START_COLOR, 11)};
        final o oVar = new o() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt$UseBorderColorProps$$inlined$UseBorderColorProps$1
            @Override // w7.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((View) obj, ((Number) obj2).intValue(), (Integer) obj3);
                return C2735B.f28704a;
            }

            public final void invoke(View view, int i10, Integer num) {
                AbstractC2855l.g(view, "view");
                BackgroundStyleApplicator.setBorderColor(view, LogicalEdge.INSTANCE.fromSpacingType(i10), num);
            }
        };
        for (int i10 = 0; i10 < 10; i10++) {
            Pair pair = pairArr[i10];
            String str = (String) pair.getFirst();
            final Object second = pair.getSecond();
            Function2 function2 = new Function2() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt$UseBorderColorProps$$inlined$UseBorderColorProps$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((View) obj, (Integer) obj2);
                    return C2735B.f28704a;
                }

                public final void invoke(View view, Integer num) {
                    AbstractC2855l.g(view, "view");
                    oVar.invoke(view, second, num);
                }
            };
            Map<String, AnyViewProp> props = viewDefinitionBuilder.getProps();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(D.b(Integer.class), Boolean.TRUE));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(D.b(Integer.class), true, CSSPropsKt$UseBorderColorProps$$inlined$PropGroup$2.INSTANCE), null);
            }
            props.put(str, new ConcreteViewProp(str, anyType, function2));
        }
    }
}
