package expo.modules.kotlin.classcomponent;

import C7.d;
import C7.g;
import C7.o;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.ConcatIterator;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.functions.AnyFunction;
import expo.modules.kotlin.functions.AsyncFunctionBuilder;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.FunctionBuilder;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.objects.ObjectDefinitionBuilder;
import expo.modules.kotlin.objects.ObjectDefinitionData;
import expo.modules.kotlin.objects.PropertyComponentBuilderWithThis;
import expo.modules.kotlin.objects.PropertyComponentBuilderWithThis$get$1$1;
import expo.modules.kotlin.sharedobjects.SharedObject;
import expo.modules.kotlin.sharedobjects.SharedObjectKt;
import expo.modules.kotlin.sharedobjects.SharedRefKt;
import expo.modules.kotlin.traits.Trait;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import i7.C2735B;
import i7.t;
import j7.AbstractC2800q;
import j7.K;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2853j;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w7.InterfaceC3487a;
import w7.p;
import w7.q;
import w7.r;
import w7.s;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0012\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B9\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001b\u001a\u00020\u001a2\u000e\b\u0004\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010\u001b\u001a\u00020\u001a\"\u0006\b\u0001\u0010\u001d\u0018\u00012\u0014\b\u0004\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001fJ?\u0010\u001b\u001a\u00020\u001a\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u00012\u001a\b\u0004\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000!H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\"JM\u0010\u001b\u001a\u00020\u001a\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u00012 \b\u0004\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00000$H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010%J[\u0010\u001b\u001a\u00020\u001a\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u00012&\b\u0004\u0010\u0019\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00000'H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010(Ji\u0010\u001b\u001a\u00020\u001a\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u0001\"\u0006\b\u0005\u0010)\u0018\u00012,\b\u0004\u0010\u0019\u001a&\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00000*H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010+Jw\u0010\u001b\u001a\u00020\u001a\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u0001\"\u0006\b\u0005\u0010)\u0018\u0001\"\u0006\b\u0006\u0010,\u0018\u000122\b\u0004\u0010\u0019\u001a,\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00000-H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010.J\u0085\u0001\u0010\u001b\u001a\u00020\u001a\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u0001\"\u0006\b\u0005\u0010)\u0018\u0001\"\u0006\b\u0006\u0010,\u0018\u0001\"\u0006\b\u0007\u0010/\u0018\u000128\b\u0004\u0010\u0019\u001a2\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u000000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u00101J\u0093\u0001\u0010\u001b\u001a\u00020\u001a\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u0001\"\u0006\b\u0005\u0010)\u0018\u0001\"\u0006\b\u0006\u0010,\u0018\u0001\"\u0006\b\u0007\u0010/\u0018\u0001\"\u0006\b\b\u00102\u0018\u00012>\b\u0004\u0010\u0019\u001a8\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\u000003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u00104J?\u00107\u001a\b\u0012\u0004\u0012\u00028\u000006\"\u0006\b\u0001\u00105\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0014\b\u0004\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b7\u00108J\u001d\u00107\u001a\b\u0012\u0004\u0012\u00028\u0000062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b7\u00109J\u0015\u0010;\u001a\u00020:2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b;\u0010<J-\u0010;\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\u0010\b\u0004\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018H\u0087\bø\u0001\u0000¢\u0006\u0004\b=\u0010>J3\u0010;\u001a\u00020\u001a\"\u0006\b\u0001\u0010?\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u000e\b\u0004\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0018H\u0086\bø\u0001\u0000¢\u0006\u0004\b;\u0010>JA\u0010;\u001a\u00020\u001a\"\u0006\b\u0001\u0010?\u0018\u0001\"\u0006\b\u0002\u0010\u001d\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0014\b\u0004\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00010\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b;\u0010@JO\u0010;\u001a\u00020\u001a\"\u0006\b\u0001\u0010?\u0018\u0001\"\u0006\b\u0002\u0010\u001d\u0018\u0001\"\u0006\b\u0003\u0010 \u0018\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u001a\b\u0004\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00010!H\u0086\bø\u0001\u0000¢\u0006\u0004\b;\u0010AJ]\u0010;\u001a\u00020\u001a\"\u0006\b\u0001\u0010?\u0018\u0001\"\u0006\b\u0002\u0010\u001d\u0018\u0001\"\u0006\b\u0003\u0010 \u0018\u0001\"\u0006\b\u0004\u0010#\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u00062 \b\u0004\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00010$H\u0086\bø\u0001\u0000¢\u0006\u0004\b;\u0010BJk\u0010;\u001a\u00020\u001a\"\u0006\b\u0001\u0010?\u0018\u0001\"\u0006\b\u0002\u0010\u001d\u0018\u0001\"\u0006\b\u0003\u0010 \u0018\u0001\"\u0006\b\u0004\u0010#\u0018\u0001\"\u0006\b\u0005\u0010&\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u00062&\b\u0004\u0010\u0019\u001a \u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00010'H\u0086\bø\u0001\u0000¢\u0006\u0004\b;\u0010CJy\u0010;\u001a\u00020\u001a\"\u0006\b\u0001\u0010?\u0018\u0001\"\u0006\b\u0002\u0010\u001d\u0018\u0001\"\u0006\b\u0003\u0010 \u0018\u0001\"\u0006\b\u0004\u0010#\u0018\u0001\"\u0006\b\u0005\u0010&\u0018\u0001\"\u0006\b\u0006\u0010)\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u00062,\b\u0004\u0010\u0019\u001a&\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00010*H\u0086\bø\u0001\u0000¢\u0006\u0004\b;\u0010DJ\u0087\u0001\u0010;\u001a\u00020\u001a\"\u0006\b\u0001\u0010?\u0018\u0001\"\u0006\b\u0002\u0010\u001d\u0018\u0001\"\u0006\b\u0003\u0010 \u0018\u0001\"\u0006\b\u0004\u0010#\u0018\u0001\"\u0006\b\u0005\u0010&\u0018\u0001\"\u0006\b\u0006\u0010)\u0018\u0001\"\u0006\b\u0007\u0010,\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u000622\b\u0004\u0010\u0019\u001a,\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u00010-H\u0086\bø\u0001\u0000¢\u0006\u0004\b;\u0010EJ\u0095\u0001\u0010;\u001a\u00020\u001a\"\u0006\b\u0001\u0010?\u0018\u0001\"\u0006\b\u0002\u0010\u001d\u0018\u0001\"\u0006\b\u0003\u0010 \u0018\u0001\"\u0006\b\u0004\u0010#\u0018\u0001\"\u0006\b\u0005\u0010&\u0018\u0001\"\u0006\b\u0006\u0010)\u0018\u0001\"\u0006\b\u0007\u0010,\u0018\u0001\"\u0006\b\b\u0010/\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u000628\b\u0004\u0010\u0019\u001a2\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\u000100H\u0086\bø\u0001\u0000¢\u0006\u0004\b;\u0010FJ£\u0001\u0010;\u001a\u00020\u001a\"\u0006\b\u0001\u0010?\u0018\u0001\"\u0006\b\u0002\u0010\u001d\u0018\u0001\"\u0006\b\u0003\u0010 \u0018\u0001\"\u0006\b\u0004\u0010#\u0018\u0001\"\u0006\b\u0005\u0010&\u0018\u0001\"\u0006\b\u0006\u0010)\u0018\u0001\"\u0006\b\u0007\u0010,\u0018\u0001\"\u0006\b\b\u0010/\u0018\u0001\"\u0006\b\t\u00102\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u00062>\b\u0004\u0010\u0019\u001a8\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\u000103H\u0086\bø\u0001\u0000¢\u0006\u0004\b;\u0010GJ\u0015\u0010I\u001a\u00020H2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\bI\u0010JJ-\u0010I\u001a\u00020K2\u0006\u0010\u0007\u001a\u00020\u00062\u0010\b\u0004\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018H\u0087\bø\u0001\u0000¢\u0006\u0004\bL\u0010MJ3\u0010I\u001a\u00020K\"\u0006\b\u0001\u0010?\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u000e\b\u0004\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0018H\u0086\bø\u0001\u0000¢\u0006\u0004\bI\u0010MJA\u0010I\u001a\u00020K\"\u0006\b\u0001\u0010?\u0018\u0001\"\u0006\b\u0002\u0010\u001d\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0014\b\u0004\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00010\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\bI\u0010NJO\u0010I\u001a\u00020K\"\u0006\b\u0001\u0010?\u0018\u0001\"\u0006\b\u0002\u0010\u001d\u0018\u0001\"\u0006\b\u0003\u0010 \u0018\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u001a\b\u0004\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00010!H\u0086\bø\u0001\u0000¢\u0006\u0004\bI\u0010OJG\u0010I\u001a\u00020K\"\u0006\b\u0001\u0010?\u0018\u0001\"\u0006\b\u0002\u0010\u001d\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u001a\b\u0004\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00028\u00010!H\u0087\bø\u0001\u0000¢\u0006\u0004\bQ\u0010OJ]\u0010I\u001a\u00020K\"\u0006\b\u0001\u0010?\u0018\u0001\"\u0006\b\u0002\u0010\u001d\u0018\u0001\"\u0006\b\u0003\u0010 \u0018\u0001\"\u0006\b\u0004\u0010#\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u00062 \b\u0004\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00010$H\u0086\bø\u0001\u0000¢\u0006\u0004\bI\u0010RJU\u0010I\u001a\u00020K\"\u0006\b\u0001\u0010?\u0018\u0001\"\u0006\b\u0002\u0010\u001d\u0018\u0001\"\u0006\b\u0003\u0010 \u0018\u00012\u0006\u0010\u0007\u001a\u00020\u00062 \b\u0004\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00028\u00010$H\u0087\bø\u0001\u0000¢\u0006\u0004\bQ\u0010RJk\u0010I\u001a\u00020K\"\u0006\b\u0001\u0010?\u0018\u0001\"\u0006\b\u0002\u0010\u001d\u0018\u0001\"\u0006\b\u0003\u0010 \u0018\u0001\"\u0006\b\u0004\u0010#\u0018\u0001\"\u0006\b\u0005\u0010&\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u00062&\b\u0004\u0010\u0019\u001a \u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00010'H\u0086\bø\u0001\u0000¢\u0006\u0004\bI\u0010SJc\u0010I\u001a\u00020K\"\u0006\b\u0001\u0010?\u0018\u0001\"\u0006\b\u0002\u0010\u001d\u0018\u0001\"\u0006\b\u0003\u0010 \u0018\u0001\"\u0006\b\u0004\u0010#\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u00062&\b\u0004\u0010\u0019\u001a \u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00028\u00010'H\u0087\bø\u0001\u0000¢\u0006\u0004\bQ\u0010SJy\u0010I\u001a\u00020K\"\u0006\b\u0001\u0010?\u0018\u0001\"\u0006\b\u0002\u0010\u001d\u0018\u0001\"\u0006\b\u0003\u0010 \u0018\u0001\"\u0006\b\u0004\u0010#\u0018\u0001\"\u0006\b\u0005\u0010&\u0018\u0001\"\u0006\b\u0006\u0010)\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u00062,\b\u0004\u0010\u0019\u001a&\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00010*H\u0086\bø\u0001\u0000¢\u0006\u0004\bI\u0010TJq\u0010I\u001a\u00020K\"\u0006\b\u0001\u0010?\u0018\u0001\"\u0006\b\u0002\u0010\u001d\u0018\u0001\"\u0006\b\u0003\u0010 \u0018\u0001\"\u0006\b\u0004\u0010#\u0018\u0001\"\u0006\b\u0005\u0010&\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u00062,\b\u0004\u0010\u0019\u001a&\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00028\u00010*H\u0087\bø\u0001\u0000¢\u0006\u0004\bQ\u0010TJ\u0087\u0001\u0010I\u001a\u00020K\"\u0006\b\u0001\u0010?\u0018\u0001\"\u0006\b\u0002\u0010\u001d\u0018\u0001\"\u0006\b\u0003\u0010 \u0018\u0001\"\u0006\b\u0004\u0010#\u0018\u0001\"\u0006\b\u0005\u0010&\u0018\u0001\"\u0006\b\u0006\u0010)\u0018\u0001\"\u0006\b\u0007\u0010,\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u000622\b\u0004\u0010\u0019\u001a,\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u00010-H\u0086\bø\u0001\u0000¢\u0006\u0004\bI\u0010UJ\u007f\u0010I\u001a\u00020K\"\u0006\b\u0001\u0010?\u0018\u0001\"\u0006\b\u0002\u0010\u001d\u0018\u0001\"\u0006\b\u0003\u0010 \u0018\u0001\"\u0006\b\u0004\u0010#\u0018\u0001\"\u0006\b\u0005\u0010&\u0018\u0001\"\u0006\b\u0006\u0010)\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u000622\b\u0004\u0010\u0019\u001a,\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00028\u00010-H\u0087\bø\u0001\u0000¢\u0006\u0004\bQ\u0010UJ\u0095\u0001\u0010I\u001a\u00020K\"\u0006\b\u0001\u0010?\u0018\u0001\"\u0006\b\u0002\u0010\u001d\u0018\u0001\"\u0006\b\u0003\u0010 \u0018\u0001\"\u0006\b\u0004\u0010#\u0018\u0001\"\u0006\b\u0005\u0010&\u0018\u0001\"\u0006\b\u0006\u0010)\u0018\u0001\"\u0006\b\u0007\u0010,\u0018\u0001\"\u0006\b\b\u0010/\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u000628\b\u0004\u0010\u0019\u001a2\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\u000100H\u0086\bø\u0001\u0000¢\u0006\u0004\bI\u0010VJ\u008d\u0001\u0010I\u001a\u00020K\"\u0006\b\u0001\u0010?\u0018\u0001\"\u0006\b\u0002\u0010\u001d\u0018\u0001\"\u0006\b\u0003\u0010 \u0018\u0001\"\u0006\b\u0004\u0010#\u0018\u0001\"\u0006\b\u0005\u0010&\u0018\u0001\"\u0006\b\u0006\u0010)\u0018\u0001\"\u0006\b\u0007\u0010,\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u000628\b\u0004\u0010\u0019\u001a2\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00028\u000100H\u0087\bø\u0001\u0000¢\u0006\u0004\bQ\u0010VJ£\u0001\u0010I\u001a\u00020K\"\u0006\b\u0001\u0010?\u0018\u0001\"\u0006\b\u0002\u0010\u001d\u0018\u0001\"\u0006\b\u0003\u0010 \u0018\u0001\"\u0006\b\u0004\u0010#\u0018\u0001\"\u0006\b\u0005\u0010&\u0018\u0001\"\u0006\b\u0006\u0010)\u0018\u0001\"\u0006\b\u0007\u0010,\u0018\u0001\"\u0006\b\b\u0010/\u0018\u0001\"\u0006\b\t\u00102\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u00062>\b\u0004\u0010\u0019\u001a8\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\u000103H\u0086\bø\u0001\u0000¢\u0006\u0004\bI\u0010WJ\u009b\u0001\u0010I\u001a\u00020K\"\u0006\b\u0001\u0010?\u0018\u0001\"\u0006\b\u0002\u0010\u001d\u0018\u0001\"\u0006\b\u0003\u0010 \u0018\u0001\"\u0006\b\u0004\u0010#\u0018\u0001\"\u0006\b\u0005\u0010&\u0018\u0001\"\u0006\b\u0006\u0010)\u0018\u0001\"\u0006\b\u0007\u0010,\u0018\u0001\"\u0006\b\b\u0010/\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u00062>\b\u0004\u0010\u0019\u001a8\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00028\u000103H\u0087\bø\u0001\u0000¢\u0006\u0004\bQ\u0010WR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010XR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010Y\u001a\u0004\bZ\u0010[R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\\R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010]\u001a\u0004\b^\u0010_R$\u0010`\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR%\u0010g\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00130f8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR4\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a0k8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bl\u0010m\u0012\u0004\br\u0010s\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR4\u0010t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020:0k8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bt\u0010m\u0012\u0004\bw\u0010s\u001a\u0004\bu\u0010o\"\u0004\bv\u0010qR4\u0010x\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020K0k8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bx\u0010m\u0012\u0004\b{\u0010s\u001a\u0004\by\u0010o\"\u0004\bz\u0010qR\"\u0010|\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020H0k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010m\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006}"}, d2 = {"Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "SharedObjectType", "Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;", "Lexpo/modules/kotlin/AppContext;", "appContext", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", "LC7/d;", "ownerClass", "Lexpo/modules/kotlin/types/AnyType;", "ownerType", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converters", "<init>", "(Lexpo/modules/kotlin/AppContext;Ljava/lang/String;LC7/d;Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/TypeConverterProvider;)V", "Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;", "buildClass", "()Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;", "Lexpo/modules/kotlin/traits/Trait;", "trait", "Li7/B;", "UseTrait", "(Lexpo/modules/kotlin/traits/Trait;)V", "Lkotlin/Function0;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "Constructor", "(Lw7/a;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P0", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P1", "Lkotlin/Function2;", "(Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P2", "Lkotlin/Function3;", "(Lw7/o;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P3", "Lkotlin/Function4;", "(Lw7/p;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P4", "Lkotlin/Function5;", "(Lw7/q;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P5", "Lkotlin/Function6;", "(Lw7/r;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P6", "Lkotlin/Function7;", "(Lw7/s;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P7", "Lkotlin/Function8;", "(Lw7/t;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "T", "Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;", "Property", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;", "(Ljava/lang/String;)Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;", "Lexpo/modules/kotlin/functions/FunctionBuilder;", "StaticFunction", "(Ljava/lang/String;)Lexpo/modules/kotlin/functions/FunctionBuilder;", "StaticFunctionWithoutArgs", "(Ljava/lang/String;Lw7/a;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "R", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "(Ljava/lang/String;Lw7/o;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "(Ljava/lang/String;Lw7/p;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "(Ljava/lang/String;Lw7/q;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "(Ljava/lang/String;Lw7/r;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "(Ljava/lang/String;Lw7/s;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "(Ljava/lang/String;Lw7/t;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;", "StaticAsyncFunction", "(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;", "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "StaticAsyncFunctionWithoutArgs", "(Ljava/lang/String;Lw7/a;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "Lexpo/modules/kotlin/Promise;", "StaticAsyncFunctionWithPromise", "(Ljava/lang/String;Lw7/o;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Ljava/lang/String;Lw7/p;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Ljava/lang/String;Lw7/q;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Ljava/lang/String;Lw7/r;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Ljava/lang/String;Lw7/s;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Ljava/lang/String;Lw7/t;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "Lexpo/modules/kotlin/AppContext;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LC7/d;", "Lexpo/modules/kotlin/types/AnyType;", "getOwnerType", "()Lexpo/modules/kotlin/types/AnyType;", "constructor", "Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "getConstructor", "()Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "setConstructor", "(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "traits", "Ljava/util/List;", "getTraits", "()Ljava/util/List;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "staticSyncFunctions", "Ljava/util/Map;", "getStaticSyncFunctions", "()Ljava/util/Map;", "setStaticSyncFunctions", "(Ljava/util/Map;)V", "getStaticSyncFunctions$annotations", "()V", "staticSyncFunctionBuilder", "getStaticSyncFunctionBuilder", "setStaticSyncFunctionBuilder", "getStaticSyncFunctionBuilder$annotations", "staticAsyncFunctions", "getStaticAsyncFunctions", "setStaticAsyncFunctions", "getStaticAsyncFunctions$annotations", "staticAsyncFunctionBuilders", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClassComponentBuilder<SharedObjectType> extends ObjectDefinitionBuilder {
    private final AppContext appContext;
    private SyncFunctionComponent constructor;
    private final String name;
    private final d ownerClass;
    private final AnyType ownerType;
    private Map<String, AsyncFunctionBuilder> staticAsyncFunctionBuilders;
    private Map<String, AsyncFunctionComponent> staticAsyncFunctions;
    private Map<String, FunctionBuilder> staticSyncFunctionBuilder;
    private Map<String, SyncFunctionComponent> staticSyncFunctions;
    private final List<Trait<? super SharedObjectType>> traits;

    /* JADX INFO: renamed from: expo.modules.kotlin.classcomponent.ClassComponentBuilder$buildClass$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class C24871 extends AbstractC2853j implements Function2 {
        public static final C24871 INSTANCE = new C24871();

        C24871() {
            super(2, SharedObject.class, "onStartListeningToEvent", "onStartListeningToEvent(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((SharedObject) obj, (String) obj2);
            return C2735B.f28704a;
        }

        public final void invoke(SharedObject p02, String p12) {
            AbstractC2855l.g(p02, "p0");
            AbstractC2855l.g(p12, "p1");
            p02.onStartListeningToEvent(p12);
        }
    }

    /* JADX INFO: renamed from: expo.modules.kotlin.classcomponent.ClassComponentBuilder$buildClass$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class C24882 extends AbstractC2853j implements Function2 {
        public static final C24882 INSTANCE = new C24882();

        C24882() {
            super(2, SharedObject.class, "onStopListeningToEvent", "onStopListeningToEvent(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((SharedObject) obj, (String) obj2);
            return C2735B.f28704a;
        }

        public final void invoke(SharedObject p02, String p12) {
            AbstractC2855l.g(p02, "p0");
            AbstractC2855l.g(p12, "p1");
            p02.onStopListeningToEvent(p12);
        }
    }

    public /* synthetic */ ClassComponentBuilder(AppContext appContext, String str, d dVar, AnyType anyType, TypeConverterProvider typeConverterProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(appContext, str, dVar, anyType, (i10 & 16) != 0 ? null : typeConverterProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B buildClass$lambda$2$lambda$0(g gVar, Object[] objArr) {
        AbstractC2855l.g(objArr, "<destruct>");
        ((Function2) gVar).invoke(objArr[0], objArr[1]);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B buildClass$lambda$6(Object[] it) {
        AbstractC2855l.g(it, "it");
        return C2735B.f28704a;
    }

    public final SyncFunctionComponent Constructor(final InterfaceC3487a body) {
        AbstractC2855l.g(body, "body");
        AnyType[] anyTypeArr = new AnyType[0];
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(D.b(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(D.b(Object.class));
            returnTypeProvider.getTypes().put(D.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("constructor", anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.Constructor.1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] it) {
                AbstractC2855l.g(it, "it");
                return body.invoke();
            }
        });
        setConstructor(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final AsyncFunctionBuilder StaticAsyncFunction(String name) {
        AbstractC2855l.g(name, "name");
        AsyncFunctionBuilder asyncFunctionBuilder = new AsyncFunctionBuilder(name, getConverters());
        this.staticAsyncFunctionBuilders.put(name, asyncFunctionBuilder);
        return asyncFunctionBuilder;
    }

    public final /* synthetic */ <R, P0> AsyncFunctionComponent StaticAsyncFunctionWithPromise(String name, final Function2 body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$4 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$4 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$4
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$4), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType}, new Function2() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.StaticAsyncFunction.11
            public final void invoke(Object[] objArr, Promise promise) {
                AbstractC2855l.g(objArr, "<destruct>");
                AbstractC2855l.g(promise, "promise");
                body.invoke(objArr[0], promise);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Object[]) obj, (Promise) obj2);
                return C2735B.f28704a;
            }
        });
        getStaticAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final AsyncFunctionComponent StaticAsyncFunctionWithoutArgs(String name, final InterfaceC3487a body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(name, new AnyType[0], new Function1() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.StaticAsyncFunction.2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] it) {
                AbstractC2855l.g(it, "it");
                return body.invoke();
            }
        });
        getStaticAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final FunctionBuilder StaticFunction(String name) {
        AbstractC2855l.g(name, "name");
        FunctionBuilder functionBuilder = new FunctionBuilder(name);
        this.staticSyncFunctionBuilder.put(name, functionBuilder);
        return functionBuilder;
    }

    public final SyncFunctionComponent StaticFunctionWithoutArgs(String name, final InterfaceC3487a body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        AnyType[] anyTypeArr = new AnyType[0];
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(D.b(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(D.b(Object.class));
            returnTypeProvider.getTypes().put(D.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.StaticFunction.2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] it) {
                AbstractC2855l.g(it, "it");
                return body.invoke();
            }
        });
        getStaticSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final void UseTrait(Trait<? super SharedObjectType> trait) {
        AbstractC2855l.g(trait, "trait");
        this.traits.add(trait);
    }

    public final ClassDefinitionData buildClass() {
        boolean zB = AbstractC2855l.b(this.ownerClass, D.b(C2735B.class));
        boolean z10 = !zB && SharedObjectKt.isSharedObjectClass(this.ownerClass);
        boolean z11 = !zB && SharedRefKt.isSharedRefClass(this.ownerClass);
        Object next = null;
        if (getEventsDefinition() != null && z10) {
            for (Pair pair : AbstractC2800q.m(t.a("__expo_onStartListeningToEvent", C24871.INSTANCE), t.a("__expo_onStopListeningToEvent", C24882.INSTANCE))) {
                String str = (String) pair.getFirst();
                final g gVar = (g) pair.getSecond();
                AnyType anyType = this.ownerType;
                AnyType anyType2 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(String.class), Boolean.FALSE));
                if (anyType2 == null) {
                    anyType2 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$buildClass$lambda$2$$inlined$toAnyType$default$1
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(String.class);
                        }
                    }), null);
                }
                AnyType[] anyTypeArr = {anyType, anyType2};
                ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
                ReturnType returnType = returnTypeProvider.getTypes().get(D.b(C2735B.class));
                if (returnType == null) {
                    returnType = new ReturnType(D.b(C2735B.class));
                    returnTypeProvider.getTypes().put(D.b(C2735B.class), returnType);
                }
                SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(str, anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.classcomponent.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ClassComponentBuilder.buildClass$lambda$2$lambda$0(gVar, (Object[]) obj);
                    }
                });
                syncFunctionComponent.enumerable(false);
                getSyncFunctions().put(str, syncFunctionComponent);
            }
        }
        ObjectDefinitionData objectDefinitionDataBuildObject = buildObject();
        List<Trait<? super SharedObjectType>> list = this.traits;
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Trait) it.next()).export(this.appContext));
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            while (it2.hasNext()) {
                next = ((ObjectDefinitionData) next).plus((ObjectDefinitionData) it2.next());
            }
        }
        ObjectDefinitionData objectDefinitionDataPlus = objectDefinitionDataBuildObject.plus((ObjectDefinitionData) next);
        ConcatIterator<AnyFunction> functions = objectDefinitionDataPlus.getFunctions();
        while (functions.hasNext()) {
            AnyFunction next2 = functions.next();
            next2.setOwnerType(this.ownerType.getKType());
            next2.setCanTakeOwner(true);
        }
        if (!zB && this.constructor == null && !z11) {
            throw new IllegalArgumentException("constructor cannot be null");
        }
        SyncFunctionComponent syncFunctionComponent2 = this.constructor;
        if (syncFunctionComponent2 == null) {
            AnyType[] anyTypeArr2 = new AnyType[0];
            ReturnTypeProvider returnTypeProvider2 = ReturnTypeProvider.INSTANCE;
            ReturnType returnType2 = returnTypeProvider2.getTypes().get(D.b(C2735B.class));
            if (returnType2 == null) {
                returnType2 = new ReturnType(D.b(C2735B.class));
                returnTypeProvider2.getTypes().put(D.b(C2735B.class), returnType2);
            }
            syncFunctionComponent2 = new SyncFunctionComponent("constructor", anyTypeArr2, returnType2, new Function1() { // from class: expo.modules.kotlin.classcomponent.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ClassComponentBuilder.buildClass$lambda$6((Object[]) obj);
                }
            });
        }
        SyncFunctionComponent syncFunctionComponent3 = syncFunctionComponent2;
        syncFunctionComponent3.setCanTakeOwner(true);
        syncFunctionComponent3.setOwnerType(this.ownerType.getKType());
        String str2 = this.name;
        Map<String, SyncFunctionComponent> map = this.staticSyncFunctions;
        Map<String, FunctionBuilder> map2 = this.staticSyncFunctionBuilder;
        LinkedHashMap linkedHashMap = new LinkedHashMap(K.e(map2.size()));
        Iterator<T> it3 = map2.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            linkedHashMap.put(entry.getKey(), ((FunctionBuilder) entry.getValue()).build$expo_modules_core_release());
        }
        Map mapO = K.o(map, linkedHashMap);
        Map<String, AsyncFunctionComponent> map3 = this.staticAsyncFunctions;
        Map<String, AsyncFunctionBuilder> map4 = this.staticAsyncFunctionBuilders;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(K.e(map4.size()));
        Iterator<T> it4 = map4.entrySet().iterator();
        while (it4.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it4.next();
            linkedHashMap2.put(entry2.getKey(), ((AsyncFunctionBuilder) entry2.getValue()).build$expo_modules_core_release());
        }
        return new ClassDefinitionData(str2, syncFunctionComponent3, mapO, K.o(map3, linkedHashMap2), objectDefinitionDataPlus, z11);
    }

    public final SyncFunctionComponent getConstructor() {
        return this.constructor;
    }

    public final String getName() {
        return this.name;
    }

    public final AnyType getOwnerType() {
        return this.ownerType;
    }

    public final Map<String, AsyncFunctionComponent> getStaticAsyncFunctions() {
        return this.staticAsyncFunctions;
    }

    public final Map<String, FunctionBuilder> getStaticSyncFunctionBuilder() {
        return this.staticSyncFunctionBuilder;
    }

    public final Map<String, SyncFunctionComponent> getStaticSyncFunctions() {
        return this.staticSyncFunctions;
    }

    public final List<Trait<? super SharedObjectType>> getTraits() {
        return this.traits;
    }

    public final void setConstructor(SyncFunctionComponent syncFunctionComponent) {
        this.constructor = syncFunctionComponent;
    }

    public final void setStaticAsyncFunctions(Map<String, AsyncFunctionComponent> map) {
        AbstractC2855l.g(map, "<set-?>");
        this.staticAsyncFunctions = map;
    }

    public final void setStaticSyncFunctionBuilder(Map<String, FunctionBuilder> map) {
        AbstractC2855l.g(map, "<set-?>");
        this.staticSyncFunctionBuilder = map;
    }

    public final void setStaticSyncFunctions(Map<String, SyncFunctionComponent> map) {
        AbstractC2855l.g(map, "<set-?>");
        this.staticSyncFunctions = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassComponentBuilder(AppContext appContext, String name, d ownerClass, AnyType ownerType, TypeConverterProvider typeConverterProvider) {
        super(typeConverterProvider);
        AbstractC2855l.g(appContext, "appContext");
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(ownerClass, "ownerClass");
        AbstractC2855l.g(ownerType, "ownerType");
        this.appContext = appContext;
        this.name = name;
        this.ownerClass = ownerClass;
        this.ownerType = ownerType;
        this.traits = new ArrayList();
        this.staticSyncFunctions = new LinkedHashMap();
        this.staticSyncFunctionBuilder = new LinkedHashMap();
        this.staticAsyncFunctions = new LinkedHashMap();
        this.staticAsyncFunctionBuilders = new LinkedHashMap();
    }

    public final /* synthetic */ <T> PropertyComponentBuilderWithThis<SharedObjectType> Property(String name, Function1 body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        PropertyComponentBuilderWithThis<SharedObjectType> propertyComponentBuilderWithThis = new PropertyComponentBuilderWithThis<>(getOwnerType().getKType(), name);
        AnyType[] anyTypeArr = {new AnyType(propertyComponentBuilderWithThis.getThisType(), null, 2, null)};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<d, ReturnType> types = returnTypeProvider.getTypes();
        AbstractC2855l.m(4, "T");
        ReturnType returnType = types.get(D.b(Object.class));
        if (returnType == null) {
            AbstractC2855l.m(4, "T");
            returnType = new ReturnType(D.b(Object.class));
            Map<d, ReturnType> types2 = returnTypeProvider.getTypes();
            AbstractC2855l.m(4, "T");
            types2.put(D.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("get", anyTypeArr, returnType, new PropertyComponentBuilderWithThis$get$1$1(body));
        syncFunctionComponent.setOwnerType(propertyComponentBuilderWithThis.getThisType());
        syncFunctionComponent.setCanTakeOwner(true);
        propertyComponentBuilderWithThis.setGetter(syncFunctionComponent);
        getProperties().put(name, propertyComponentBuilderWithThis);
        return propertyComponentBuilderWithThis;
    }

    public final /* synthetic */ <R> AsyncFunctionComponent StaticAsyncFunction(String name, final InterfaceC3487a body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        AnyType[] anyTypeArr = new AnyType[0];
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.StaticAsyncFunction.4
            /* JADX WARN: Type inference failed for: r2v2, types: [R, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(Object[] it) {
                AbstractC2855l.g(it, "it");
                return body.invoke();
            }
        };
        AbstractC2855l.m(3, "R");
        AbstractC2855l.m(4, "R");
        AsyncFunctionComponent intAsyncFunctionComponent = AbstractC2855l.b(Object.class, Integer.TYPE) ? new IntAsyncFunctionComponent(name, anyTypeArr, function1) : AbstractC2855l.b(Object.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent(name, anyTypeArr, function1) : AbstractC2855l.b(Object.class, Double.TYPE) ? new DoubleAsyncFunctionComponent(name, anyTypeArr, function1) : AbstractC2855l.b(Object.class, Float.TYPE) ? new FloatAsyncFunctionComponent(name, anyTypeArr, function1) : AbstractC2855l.b(Object.class, String.class) ? new StringAsyncFunctionComponent(name, anyTypeArr, function1) : new UntypedAsyncFunctionComponent(name, anyTypeArr, function1);
        getStaticAsyncFunctions().put(name, intAsyncFunctionComponent);
        return intAsyncFunctionComponent;
    }

    public final /* synthetic */ <R> SyncFunctionComponent StaticFunction(String name, final InterfaceC3487a body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        AnyType[] anyTypeArr = new AnyType[0];
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<d, ReturnType> types = returnTypeProvider.getTypes();
        AbstractC2855l.m(4, "R");
        ReturnType returnType = types.get(D.b(Object.class));
        if (returnType == null) {
            AbstractC2855l.m(4, "R");
            returnType = new ReturnType(D.b(Object.class));
            Map<d, ReturnType> types2 = returnTypeProvider.getTypes();
            AbstractC2855l.m(4, "R");
            types2.put(D.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.StaticFunction.4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] it) {
                AbstractC2855l.g(it, "it");
                return body.invoke();
            }
        });
        getStaticSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <P0> SyncFunctionComponent Constructor(final Function1 body) {
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$1 classComponentBuilder$Constructor$$inlined$toArgsArray$default$1 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$1
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$1), converters);
        }
        AnyType[] anyTypeArr = {anyType};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(D.b(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(D.b(Object.class));
            returnTypeProvider.getTypes().put(D.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("constructor", anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.Constructor.3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.invoke(objArr[0]);
            }
        });
        setConstructor(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0> SyncFunctionComponent StaticFunction(String name, final Function1 body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$1 classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$1 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$1
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$1), converters);
        }
        AnyType[] anyTypeArr = {anyType};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<d, ReturnType> types = returnTypeProvider.getTypes();
        AbstractC2855l.m(4, "R");
        ReturnType returnType = types.get(D.b(Object.class));
        if (returnType == null) {
            AbstractC2855l.m(4, "R");
            returnType = new ReturnType(D.b(Object.class));
            Map<d, ReturnType> types2 = returnTypeProvider.getTypes();
            AbstractC2855l.m(4, "R");
            types2.put(D.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.StaticFunction.6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.invoke(objArr[0]);
            }
        });
        getStaticSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    @Override // expo.modules.kotlin.objects.ObjectDefinitionBuilder
    public PropertyComponentBuilderWithThis<SharedObjectType> Property(String name) {
        AbstractC2855l.g(name, "name");
        PropertyComponentBuilderWithThis<SharedObjectType> propertyComponentBuilderWithThis = new PropertyComponentBuilderWithThis<>(this.ownerType.getKType(), name);
        getProperties().put(name, propertyComponentBuilderWithThis);
        return propertyComponentBuilderWithThis;
    }

    public final /* synthetic */ <R, P0, P1> AsyncFunctionComponent StaticAsyncFunctionWithPromise(String name, final w7.o body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$8 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$8 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$8
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$8), converters);
        }
        AbstractC2855l.m(4, "P1");
        d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$9 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$9 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$9
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$9), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2}, new Function2() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.StaticAsyncFunction.15
            public final void invoke(Object[] objArr, Promise promise) {
                AbstractC2855l.g(objArr, "<destruct>");
                AbstractC2855l.g(promise, "promise");
                body.invoke(objArr[0], objArr[1], promise);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Object[]) obj, (Promise) obj2);
                return C2735B.f28704a;
            }
        });
        getStaticAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public static /* synthetic */ void getStaticAsyncFunctions$annotations() {
    }

    public static /* synthetic */ void getStaticSyncFunctionBuilder$annotations() {
    }

    public static /* synthetic */ void getStaticSyncFunctions$annotations() {
    }

    public final /* synthetic */ <R, P0> AsyncFunctionComponent StaticAsyncFunction(String name, final Function1 body) {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        AsyncFunctionComponent asyncFunctionWithPromiseComponent;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        AbstractC2855l.m(4, "P0");
        if (AbstractC2855l.b(Object.class, Promise.class)) {
            AbstractC2855l.l();
            asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[0], new Function2() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.StaticAsyncFunction.6
                public final void invoke(Object[] objArr, Promise promise) {
                    AbstractC2855l.g(objArr, "<unused var>");
                    AbstractC2855l.g(promise, "promise");
                    Function1 function1 = body;
                    AbstractC2855l.m(1, "P0");
                    function1.invoke(promise);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Object[]) obj, (Promise) obj2);
                    return C2735B.f28704a;
                }
            });
        } else {
            TypeConverterProvider converters = getConverters();
            AbstractC2855l.m(4, "P0");
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            AbstractC2855l.m(4, "P0");
            d dVarB = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
            if (anyType == null) {
                AbstractC2855l.l();
                ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$1 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$1 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        AbstractC2855l.m(6, "P0");
                        return null;
                    }
                };
                AbstractC2855l.m(4, "P0");
                d dVarB2 = D.b(Object.class);
                AbstractC2855l.m(3, "P0");
                anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$1), converters);
            }
            AnyType[] anyTypeArr = {anyType};
            AbstractC2855l.l();
            Function1 function1 = new Function1() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.StaticAsyncFunction.7
                /* JADX WARN: Type inference failed for: r2v2, types: [R, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public final R invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    return body.invoke(objArr[0]);
                }
            };
            AbstractC2855l.m(3, "R");
            AbstractC2855l.m(4, "R");
            if (AbstractC2855l.b(Object.class, Integer.TYPE)) {
                untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(name, anyTypeArr, function1);
            } else if (AbstractC2855l.b(Object.class, Boolean.TYPE)) {
                untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(name, anyTypeArr, function1);
            } else if (AbstractC2855l.b(Object.class, Double.TYPE)) {
                untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(name, anyTypeArr, function1);
            } else if (AbstractC2855l.b(Object.class, Float.TYPE)) {
                untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(name, anyTypeArr, function1);
            } else if (AbstractC2855l.b(Object.class, String.class)) {
                untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(name, anyTypeArr, function1);
            } else {
                untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(name, anyTypeArr, function1);
            }
            asyncFunctionWithPromiseComponent = untypedAsyncFunctionComponent;
        }
        getStaticAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <P0, P1> SyncFunctionComponent Constructor(final Function2 body) {
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$2 classComponentBuilder$Constructor$$inlined$toArgsArray$default$2 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$2
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$2), converters);
        }
        AbstractC2855l.m(4, "P1");
        d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$3 classComponentBuilder$Constructor$$inlined$toArgsArray$default$3 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$3
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$3), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(D.b(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(D.b(Object.class));
            returnTypeProvider.getTypes().put(D.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("constructor", anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.Constructor.5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1]);
            }
        });
        setConstructor(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1> SyncFunctionComponent StaticFunction(String name, final Function2 body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$2 classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$2 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$2
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$2), converters);
        }
        AbstractC2855l.m(4, "P1");
        d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$3 classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$3 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$3
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$3), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<d, ReturnType> types = returnTypeProvider.getTypes();
        AbstractC2855l.m(4, "R");
        ReturnType returnType = types.get(D.b(Object.class));
        if (returnType == null) {
            AbstractC2855l.m(4, "R");
            returnType = new ReturnType(D.b(Object.class));
            Map<d, ReturnType> types2 = returnTypeProvider.getTypes();
            AbstractC2855l.m(4, "R");
            types2.put(D.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.StaticFunction.8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1]);
            }
        });
        getStaticSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2> AsyncFunctionComponent StaticAsyncFunctionWithPromise(String name, final p body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$14 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$14 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$14
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$14), converters);
        }
        AbstractC2855l.m(4, "P1");
        d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$15 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$15 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$15
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$15), converters);
        }
        AbstractC2855l.m(4, "P2");
        d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$16 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$16 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$16
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$16), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3}, new Function2() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.StaticAsyncFunction.19
            public final void invoke(Object[] objArr, Promise promise) {
                AbstractC2855l.g(objArr, "<destruct>");
                AbstractC2855l.g(promise, "promise");
                body.e(objArr[0], objArr[1], objArr[2], promise);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Object[]) obj, (Promise) obj2);
                return C2735B.f28704a;
            }
        });
        getStaticAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1> AsyncFunctionComponent StaticAsyncFunction(String name, final Function2 body) {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$2 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$2 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$2
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$2), converters);
        }
        AbstractC2855l.m(4, "P1");
        d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$3 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$3 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$3
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$3), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.StaticAsyncFunction.9
            /* JADX WARN: Type inference failed for: r3v2, types: [R, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1]);
            }
        };
        AbstractC2855l.m(3, "R");
        AbstractC2855l.m(4, "R");
        if (AbstractC2855l.b(Object.class, Integer.TYPE)) {
            untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(name, anyTypeArr, function1);
        } else if (AbstractC2855l.b(Object.class, Boolean.TYPE)) {
            untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(name, anyTypeArr, function1);
        } else if (AbstractC2855l.b(Object.class, Double.TYPE)) {
            untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(name, anyTypeArr, function1);
        } else if (AbstractC2855l.b(Object.class, Float.TYPE)) {
            untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(name, anyTypeArr, function1);
        } else if (AbstractC2855l.b(Object.class, String.class)) {
            untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(name, anyTypeArr, function1);
        } else {
            untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(name, anyTypeArr, function1);
        }
        getStaticAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <P0, P1, P2> SyncFunctionComponent Constructor(final w7.o body) {
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$4 classComponentBuilder$Constructor$$inlined$toArgsArray$default$4 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$4
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$4), converters);
        }
        AbstractC2855l.m(4, "P1");
        d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$5 classComponentBuilder$Constructor$$inlined$toArgsArray$default$5 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$5
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$5), converters);
        }
        AbstractC2855l.m(4, "P2");
        d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$6 classComponentBuilder$Constructor$$inlined$toArgsArray$default$6 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$6
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$6), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(D.b(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(D.b(Object.class));
            returnTypeProvider.getTypes().put(D.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("constructor", anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.Constructor.7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2]);
            }
        });
        setConstructor(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2> SyncFunctionComponent StaticFunction(String name, final w7.o body) {
        int i10;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$4 classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$4 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$4
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$4), converters);
        }
        AbstractC2855l.m(4, "P1");
        d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$5 classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$5 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$5
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$5), converters);
        }
        AbstractC2855l.m(4, "P2");
        d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$6 classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$6 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$6
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            i10 = 4;
            AbstractC2855l.m(4, "P2");
            d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$6), converters);
        } else {
            i10 = 4;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<d, ReturnType> types = returnTypeProvider.getTypes();
        AbstractC2855l.m(i10, "R");
        ReturnType returnType = types.get(D.b(Object.class));
        if (returnType == null) {
            AbstractC2855l.m(i10, "R");
            returnType = new ReturnType(D.b(Object.class));
            Map<d, ReturnType> types2 = returnTypeProvider.getTypes();
            AbstractC2855l.m(i10, "R");
            types2.put(D.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.StaticFunction.10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2]);
            }
        });
        getStaticSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3> AsyncFunctionComponent StaticAsyncFunctionWithPromise(String name, final q body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AbstractC2855l.m(4, "P3");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$22 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$22 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$22
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$22), converters);
        }
        AbstractC2855l.m(4, "P1");
        d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$23 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$23 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$23
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$23), converters);
        }
        AbstractC2855l.m(4, "P2");
        d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$24 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$24 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$24
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$24), converters);
        }
        AbstractC2855l.m(4, "P3");
        d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$25 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$25 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$25
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P3");
            d dVarB8 = D.b(Object.class);
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$25), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4}, new Function2() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.StaticAsyncFunction.23
            public final void invoke(Object[] objArr, Promise promise) {
                AbstractC2855l.g(objArr, "<destruct>");
                AbstractC2855l.g(promise, "promise");
                body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], promise);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Object[]) obj, (Promise) obj2);
                return C2735B.f28704a;
            }
        });
        getStaticAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2> AsyncFunctionComponent StaticAsyncFunction(String name, final w7.o body) {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$5 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$5 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$5
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$5), converters);
        }
        AbstractC2855l.m(4, "P1");
        d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$6 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$6 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$6
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$6), converters);
        }
        AbstractC2855l.m(4, "P2");
        d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$7 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$7 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$7
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$7), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.StaticAsyncFunction.13
            /* JADX WARN: Type inference failed for: r4v2, types: [R, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2]);
            }
        };
        AbstractC2855l.m(3, "R");
        AbstractC2855l.m(4, "R");
        if (AbstractC2855l.b(Object.class, Integer.TYPE)) {
            untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(name, anyTypeArr, function1);
        } else if (AbstractC2855l.b(Object.class, Boolean.TYPE)) {
            untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(name, anyTypeArr, function1);
        } else if (AbstractC2855l.b(Object.class, Double.TYPE)) {
            untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(name, anyTypeArr, function1);
        } else if (AbstractC2855l.b(Object.class, Float.TYPE)) {
            untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(name, anyTypeArr, function1);
        } else if (AbstractC2855l.b(Object.class, String.class)) {
            untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(name, anyTypeArr, function1);
        } else {
            untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(name, anyTypeArr, function1);
        }
        getStaticAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <P0, P1, P2, P3> SyncFunctionComponent Constructor(final p body) {
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AbstractC2855l.m(4, "P3");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$7 classComponentBuilder$Constructor$$inlined$toArgsArray$default$7 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$7
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$7), converters);
        }
        AbstractC2855l.m(4, "P1");
        d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$8 classComponentBuilder$Constructor$$inlined$toArgsArray$default$8 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$8
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$8), converters);
        }
        AbstractC2855l.m(4, "P2");
        d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$9 classComponentBuilder$Constructor$$inlined$toArgsArray$default$9 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$9
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$9), converters);
        }
        AbstractC2855l.m(4, "P3");
        d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$10 classComponentBuilder$Constructor$$inlined$toArgsArray$default$10 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$10
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P3");
            d dVarB8 = D.b(Object.class);
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$10), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(D.b(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(D.b(Object.class));
            returnTypeProvider.getTypes().put(D.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("constructor", anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.Constructor.9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.e(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
        });
        setConstructor(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3> SyncFunctionComponent StaticFunction(String name, final p body) {
        int i10;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AbstractC2855l.m(4, "P3");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$7 classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$7 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$7
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$7), converters);
        }
        AbstractC2855l.m(4, "P1");
        d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$8 classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$8 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$8
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$8), converters);
        }
        AbstractC2855l.m(4, "P2");
        d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$9 classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$9 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$9
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$9), converters);
        }
        AbstractC2855l.m(4, "P3");
        d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$10 classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$10 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$10
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            i10 = 4;
            AbstractC2855l.m(4, "P3");
            d dVarB8 = D.b(Object.class);
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$10), converters);
        } else {
            i10 = 4;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<d, ReturnType> types = returnTypeProvider.getTypes();
        AbstractC2855l.m(i10, "R");
        ReturnType returnType = types.get(D.b(Object.class));
        if (returnType == null) {
            AbstractC2855l.m(i10, "R");
            returnType = new ReturnType(D.b(Object.class));
            Map<d, ReturnType> types2 = returnTypeProvider.getTypes();
            AbstractC2855l.m(i10, "R");
            types2.put(D.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.StaticFunction.12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.e(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
        });
        getStaticSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> AsyncFunctionComponent StaticAsyncFunctionWithPromise(String name, final r body) {
        AnyTypeProvider anyTypeProvider;
        int i10;
        int i11;
        int i12;
        int i13;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AbstractC2855l.m(4, "P3");
        AbstractC2855l.m(4, "P4");
        AnyTypeProvider anyTypeProvider2 = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$32 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$32 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$32
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            d dVarB2 = D.b(Object.class);
            anyTypeProvider = anyTypeProvider2;
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$32), converters);
        } else {
            anyTypeProvider = anyTypeProvider2;
            i10 = 3;
        }
        AbstractC2855l.m(4, "P1");
        d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(i10, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$33 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$33 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$33
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            d dVarB4 = D.b(Object.class);
            i11 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$33), converters);
        } else {
            i11 = 3;
        }
        AbstractC2855l.m(4, "P2");
        d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(i11, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$34 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$34 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$34
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            d dVarB6 = D.b(Object.class);
            i12 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$34), converters);
        } else {
            i12 = 3;
        }
        AbstractC2855l.m(4, "P3");
        d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(i12, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$35 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$35 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$35
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P3");
            d dVarB8 = D.b(Object.class);
            i13 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$35), converters);
        } else {
            i13 = 3;
        }
        AbstractC2855l.m(4, "P4");
        d dVarB9 = D.b(Object.class);
        AbstractC2855l.m(i13, "P4");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType5 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$36 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$36 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$36
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P4");
            d dVarB10 = D.b(Object.class);
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$36), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5}, new Function2() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.StaticAsyncFunction.27
            public final void invoke(Object[] objArr, Promise promise) {
                AbstractC2855l.g(objArr, "<destruct>");
                AbstractC2855l.g(promise, "promise");
                body.m(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], promise);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Object[]) obj, (Promise) obj2);
                return C2735B.f28704a;
            }
        });
        getStaticAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3> AsyncFunctionComponent StaticAsyncFunction(String name, final p body) {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AbstractC2855l.m(4, "P3");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$10 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$10 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$10
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$10), converters);
        }
        AbstractC2855l.m(4, "P1");
        d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$11 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$11 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$11
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$11), converters);
        }
        AbstractC2855l.m(4, "P2");
        d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$12 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$12 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$12
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$12), converters);
        }
        AbstractC2855l.m(4, "P3");
        d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$13 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$13 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$13
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P3");
            d dVarB8 = D.b(Object.class);
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$13), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.StaticAsyncFunction.17
            /* JADX WARN: Type inference failed for: r5v2, types: [R, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.e(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
        };
        AbstractC2855l.m(3, "R");
        AbstractC2855l.m(4, "R");
        if (AbstractC2855l.b(Object.class, Integer.TYPE)) {
            untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(name, anyTypeArr, function1);
        } else if (AbstractC2855l.b(Object.class, Boolean.TYPE)) {
            untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(name, anyTypeArr, function1);
        } else if (AbstractC2855l.b(Object.class, Double.TYPE)) {
            untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(name, anyTypeArr, function1);
        } else if (AbstractC2855l.b(Object.class, Float.TYPE)) {
            untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(name, anyTypeArr, function1);
        } else if (AbstractC2855l.b(Object.class, String.class)) {
            untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(name, anyTypeArr, function1);
        } else {
            untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(name, anyTypeArr, function1);
        }
        getStaticAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <P0, P1, P2, P3, P4> SyncFunctionComponent Constructor(final q body) {
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AbstractC2855l.m(4, "P3");
        AbstractC2855l.m(4, "P4");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$11 classComponentBuilder$Constructor$$inlined$toArgsArray$default$11 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$11
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$11), converters);
        }
        AbstractC2855l.m(4, "P1");
        d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$12 classComponentBuilder$Constructor$$inlined$toArgsArray$default$12 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$12
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$12), converters);
        }
        AbstractC2855l.m(4, "P2");
        d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$13 classComponentBuilder$Constructor$$inlined$toArgsArray$default$13 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$13
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$13), converters);
        }
        AbstractC2855l.m(4, "P3");
        d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$14 classComponentBuilder$Constructor$$inlined$toArgsArray$default$14 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$14
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P3");
            d dVarB8 = D.b(Object.class);
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$14), converters);
        }
        AbstractC2855l.m(4, "P4");
        d dVarB9 = D.b(Object.class);
        AbstractC2855l.m(3, "P4");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType5 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$15 classComponentBuilder$Constructor$$inlined$toArgsArray$default$15 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$15
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P4");
            d dVarB10 = D.b(Object.class);
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$15), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(D.b(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(D.b(Object.class));
            returnTypeProvider.getTypes().put(D.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("constructor", anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.Constructor.11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            }
        });
        setConstructor(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> SyncFunctionComponent StaticFunction(String name, final q body) {
        AnyTypeProvider anyTypeProvider;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AbstractC2855l.m(4, "P3");
        AbstractC2855l.m(4, "P4");
        AnyTypeProvider anyTypeProvider2 = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$11 classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$11 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$11
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            d dVarB2 = D.b(Object.class);
            anyTypeProvider = anyTypeProvider2;
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$11), converters);
        } else {
            anyTypeProvider = anyTypeProvider2;
            i10 = 3;
        }
        AbstractC2855l.m(4, "P1");
        d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(i10, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$12 classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$12 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$12
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            d dVarB4 = D.b(Object.class);
            i11 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$12), converters);
        } else {
            i11 = 3;
        }
        AbstractC2855l.m(4, "P2");
        d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(i11, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$13 classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$13 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$13
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            d dVarB6 = D.b(Object.class);
            i12 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$13), converters);
        } else {
            i12 = 3;
        }
        AbstractC2855l.m(4, "P3");
        d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(i12, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$14 classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$14 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$14
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P3");
            d dVarB8 = D.b(Object.class);
            i13 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$14), converters);
        } else {
            i13 = 3;
        }
        AbstractC2855l.m(4, "P4");
        d dVarB9 = D.b(Object.class);
        AbstractC2855l.m(i13, "P4");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType5 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$15 classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$15 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$15
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            i14 = 4;
            AbstractC2855l.m(4, "P4");
            d dVarB10 = D.b(Object.class);
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$15), converters);
        } else {
            i14 = 4;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<d, ReturnType> types = returnTypeProvider.getTypes();
        AbstractC2855l.m(i14, "R");
        ReturnType returnType = types.get(D.b(Object.class));
        if (returnType == null) {
            AbstractC2855l.m(i14, "R");
            returnType = new ReturnType(D.b(Object.class));
            Map<d, ReturnType> types2 = returnTypeProvider.getTypes();
            AbstractC2855l.m(i14, "R");
            types2.put(D.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.StaticFunction.14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            }
        });
        getStaticSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> AsyncFunctionComponent StaticAsyncFunctionWithPromise(String name, final s body) {
        AnyTypeProvider anyTypeProvider;
        Class cls;
        int i10;
        AnyType anyType;
        int i11;
        int i12;
        AnyType anyType2;
        int i13;
        int i14;
        AnyType anyType3;
        int i15;
        int i16;
        AnyType anyType4;
        int i17;
        int i18;
        AnyType anyType5;
        AnyType anyType6;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AbstractC2855l.m(4, "P3");
        AbstractC2855l.m(4, "P4");
        AbstractC2855l.m(4, "P5");
        AnyTypeProvider anyTypeProvider2 = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType7 = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, false));
        if (anyType7 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$44 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$44 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$44
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            anyTypeProvider = anyTypeProvider2;
            AbstractC2855l.m(4, "P0");
            d dVarB2 = D.b(Object.class);
            cls = Object.class;
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$44), converters);
        } else {
            anyTypeProvider = anyTypeProvider2;
            cls = Object.class;
            i10 = 3;
            anyType = anyType7;
        }
        AbstractC2855l.m(4, "P1");
        d dVarB3 = D.b(cls);
        AbstractC2855l.m(i10, "P1");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType8 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$45 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$45 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$45
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            i11 = 4;
            AbstractC2855l.m(4, "P1");
            d dVarB4 = D.b(cls);
            i12 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$45), converters);
        } else {
            i11 = 4;
            i12 = 3;
            anyType2 = anyType8;
        }
        AbstractC2855l.m(i11, "P2");
        d dVarB5 = D.b(cls);
        AbstractC2855l.m(i12, "P2");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType9 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$46 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$46 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$46
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            i13 = 4;
            AbstractC2855l.m(4, "P2");
            d dVarB6 = D.b(cls);
            i14 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$46), converters);
        } else {
            i13 = 4;
            i14 = 3;
            anyType3 = anyType9;
        }
        AbstractC2855l.m(i13, "P3");
        d dVarB7 = D.b(cls);
        AbstractC2855l.m(i14, "P3");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType10 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$47 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$47 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$47
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            i15 = 4;
            AbstractC2855l.m(4, "P3");
            d dVarB8 = D.b(cls);
            i16 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$47), converters);
        } else {
            i15 = 4;
            i16 = 3;
            anyType4 = anyType10;
        }
        AbstractC2855l.m(i15, "P4");
        d dVarB9 = D.b(cls);
        AbstractC2855l.m(i16, "P4");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType11 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$48 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$48 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$48
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            i17 = 4;
            AbstractC2855l.m(4, "P4");
            d dVarB10 = D.b(cls);
            i18 = 3;
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$48), converters);
        } else {
            i17 = 4;
            i18 = 3;
            anyType5 = anyType11;
        }
        AbstractC2855l.m(i17, "P5");
        d dVarB11 = D.b(cls);
        AbstractC2855l.m(i18, "P5");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType12 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$49 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$49 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$49
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P5");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P5");
            d dVarB12 = D.b(cls);
            AbstractC2855l.m(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$49), converters);
        } else {
            anyType6 = anyType12;
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5, anyType6}, new Function2() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.StaticAsyncFunction.31
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Object[]) obj, (Promise) obj2);
                return C2735B.f28704a;
            }

            public final void invoke(Object[] objArr, Promise promise) {
                AbstractC2855l.g(objArr, "<destruct>");
                AbstractC2855l.g(promise, "promise");
                body.s(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], promise);
            }
        });
        getStaticAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> AsyncFunctionComponent StaticAsyncFunction(String name, final q body) {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AbstractC2855l.m(4, "P3");
        AbstractC2855l.m(4, "P4");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$17 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$17 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$17
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$17), converters);
        }
        AbstractC2855l.m(4, "P1");
        d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$18 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$18 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$18
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$18), converters);
        }
        AbstractC2855l.m(4, "P2");
        d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$19 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$19 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$19
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$19), converters);
        }
        AbstractC2855l.m(4, "P3");
        d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$20 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$20 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$20
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P3");
            d dVarB8 = D.b(Object.class);
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$20), converters);
        }
        AbstractC2855l.m(4, "P4");
        d dVarB9 = D.b(Object.class);
        AbstractC2855l.m(3, "P4");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType5 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$21 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$21 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$21
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P4");
            d dVarB10 = D.b(Object.class);
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$21), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.StaticAsyncFunction.21
            /* JADX WARN: Type inference failed for: r8v1, types: [R, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            }
        };
        AbstractC2855l.m(3, "R");
        AbstractC2855l.m(4, "R");
        if (AbstractC2855l.b(Object.class, Integer.TYPE)) {
            untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(name, anyTypeArr, function1);
        } else if (AbstractC2855l.b(Object.class, Boolean.TYPE)) {
            untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(name, anyTypeArr, function1);
        } else if (AbstractC2855l.b(Object.class, Double.TYPE)) {
            untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(name, anyTypeArr, function1);
        } else if (AbstractC2855l.b(Object.class, Float.TYPE)) {
            untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(name, anyTypeArr, function1);
        } else if (AbstractC2855l.b(Object.class, String.class)) {
            untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(name, anyTypeArr, function1);
        } else {
            untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(name, anyTypeArr, function1);
        }
        getStaticAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <P0, P1, P2, P3, P4, P5> SyncFunctionComponent Constructor(final r body) {
        AnyTypeProvider anyTypeProvider;
        int i10;
        AnyType anyType;
        int i11;
        int i12;
        AnyType anyType2;
        int i13;
        int i14;
        AnyType anyType3;
        int i15;
        int i16;
        AnyType anyType4;
        int i17;
        int i18;
        AnyType anyType5;
        AnyType anyType6;
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AbstractC2855l.m(4, "P3");
        AbstractC2855l.m(4, "P4");
        AbstractC2855l.m(4, "P5");
        AnyTypeProvider anyTypeProvider2 = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType7 = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, false));
        if (anyType7 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$16 classComponentBuilder$Constructor$$inlined$toArgsArray$default$16 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$16
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            d dVarB2 = D.b(Object.class);
            anyTypeProvider = anyTypeProvider2;
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$16), converters);
        } else {
            anyTypeProvider = anyTypeProvider2;
            i10 = 3;
            anyType = anyType7;
        }
        AbstractC2855l.m(4, "P1");
        d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(i10, "P1");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType8 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$17 classComponentBuilder$Constructor$$inlined$toArgsArray$default$17 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$17
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            i11 = 4;
            AbstractC2855l.m(4, "P1");
            d dVarB4 = D.b(Object.class);
            i12 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$17), converters);
        } else {
            i11 = 4;
            i12 = 3;
            anyType2 = anyType8;
        }
        AbstractC2855l.m(i11, "P2");
        d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(i12, "P2");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType9 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$18 classComponentBuilder$Constructor$$inlined$toArgsArray$default$18 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$18
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            i13 = 4;
            AbstractC2855l.m(4, "P2");
            d dVarB6 = D.b(Object.class);
            i14 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$18), converters);
        } else {
            i13 = 4;
            i14 = 3;
            anyType3 = anyType9;
        }
        AbstractC2855l.m(i13, "P3");
        d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(i14, "P3");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType10 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$19 classComponentBuilder$Constructor$$inlined$toArgsArray$default$19 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$19
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            i15 = 4;
            AbstractC2855l.m(4, "P3");
            d dVarB8 = D.b(Object.class);
            i16 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$19), converters);
        } else {
            i15 = 4;
            i16 = 3;
            anyType4 = anyType10;
        }
        AbstractC2855l.m(i15, "P4");
        d dVarB9 = D.b(Object.class);
        AbstractC2855l.m(i16, "P4");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType11 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$20 classComponentBuilder$Constructor$$inlined$toArgsArray$default$20 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$20
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            i17 = 4;
            AbstractC2855l.m(4, "P4");
            d dVarB10 = D.b(Object.class);
            i18 = 3;
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$20), converters);
        } else {
            i17 = 4;
            i18 = 3;
            anyType5 = anyType11;
        }
        AbstractC2855l.m(i17, "P5");
        d dVarB11 = D.b(Object.class);
        AbstractC2855l.m(i18, "P5");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType12 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$21 classComponentBuilder$Constructor$$inlined$toArgsArray$default$21 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$21
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P5");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P5");
            d dVarB12 = D.b(Object.class);
            AbstractC2855l.m(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$21), converters);
        } else {
            anyType6 = anyType12;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(D.b(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(D.b(Object.class));
            returnTypeProvider.getTypes().put(D.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("constructor", anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.Constructor.13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.m(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
        });
        setConstructor(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> SyncFunctionComponent StaticFunction(String name, final r body) {
        AnyTypeProvider anyTypeProvider;
        Class cls;
        int i10;
        AnyType anyType;
        int i11;
        int i12;
        AnyType anyType2;
        int i13;
        int i14;
        AnyType anyType3;
        int i15;
        int i16;
        AnyType anyType4;
        int i17;
        int i18;
        AnyType anyType5;
        int i19;
        AnyType anyType6;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AbstractC2855l.m(4, "P3");
        AbstractC2855l.m(4, "P4");
        AbstractC2855l.m(4, "P5");
        AnyTypeProvider anyTypeProvider2 = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType7 = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, false));
        if (anyType7 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$16 classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$16 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$16
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            anyTypeProvider = anyTypeProvider2;
            AbstractC2855l.m(4, "P0");
            d dVarB2 = D.b(Object.class);
            cls = Object.class;
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$16), converters);
        } else {
            anyTypeProvider = anyTypeProvider2;
            cls = Object.class;
            i10 = 3;
            anyType = anyType7;
        }
        AbstractC2855l.m(4, "P1");
        d dVarB3 = D.b(cls);
        AbstractC2855l.m(i10, "P1");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType8 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$17 classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$17 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$17
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            i11 = 4;
            AbstractC2855l.m(4, "P1");
            d dVarB4 = D.b(cls);
            i12 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$17), converters);
        } else {
            i11 = 4;
            i12 = 3;
            anyType2 = anyType8;
        }
        AbstractC2855l.m(i11, "P2");
        d dVarB5 = D.b(cls);
        AbstractC2855l.m(i12, "P2");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType9 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$18 classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$18 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$18
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            i13 = 4;
            AbstractC2855l.m(4, "P2");
            d dVarB6 = D.b(cls);
            i14 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$18), converters);
        } else {
            i13 = 4;
            i14 = 3;
            anyType3 = anyType9;
        }
        AbstractC2855l.m(i13, "P3");
        d dVarB7 = D.b(cls);
        AbstractC2855l.m(i14, "P3");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType10 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$19 classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$19 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$19
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            i15 = 4;
            AbstractC2855l.m(4, "P3");
            d dVarB8 = D.b(cls);
            i16 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$19), converters);
        } else {
            i15 = 4;
            i16 = 3;
            anyType4 = anyType10;
        }
        AbstractC2855l.m(i15, "P4");
        d dVarB9 = D.b(cls);
        AbstractC2855l.m(i16, "P4");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType11 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$20 classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$20 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$20
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            i17 = 4;
            AbstractC2855l.m(4, "P4");
            d dVarB10 = D.b(cls);
            i18 = 3;
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$20), converters);
        } else {
            i17 = 4;
            i18 = 3;
            anyType5 = anyType11;
        }
        AbstractC2855l.m(i17, "P5");
        d dVarB11 = D.b(cls);
        AbstractC2855l.m(i18, "P5");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType12 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$21 classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$21 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$21
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P5");
                    return null;
                }
            };
            i19 = 4;
            AbstractC2855l.m(4, "P5");
            d dVarB12 = D.b(cls);
            AbstractC2855l.m(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$21), converters);
        } else {
            i19 = 4;
            anyType6 = anyType12;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<d, ReturnType> types = returnTypeProvider.getTypes();
        AbstractC2855l.m(i19, "R");
        ReturnType returnType = types.get(D.b(cls));
        if (returnType == null) {
            AbstractC2855l.m(i19, "R");
            returnType = new ReturnType(D.b(cls));
            Map<d, ReturnType> types2 = returnTypeProvider.getTypes();
            AbstractC2855l.m(i19, "R");
            types2.put(D.b(cls), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.StaticFunction.16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.m(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
        });
        getStaticSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> AsyncFunctionComponent StaticAsyncFunctionWithPromise(String name, final w7.t body) {
        AnyTypeProvider anyTypeProvider;
        Class cls;
        int i10;
        AnyType anyType;
        int i11;
        int i12;
        AnyType anyType2;
        int i13;
        int i14;
        AnyType anyType3;
        int i15;
        int i16;
        AnyType anyType4;
        int i17;
        int i18;
        AnyType anyType5;
        int i19;
        int i20;
        AnyType anyType6;
        AnyType anyType7;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AbstractC2855l.m(4, "P3");
        AbstractC2855l.m(4, "P4");
        AbstractC2855l.m(4, "P5");
        AbstractC2855l.m(4, "P6");
        AnyTypeProvider anyTypeProvider2 = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType8 = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, false));
        if (anyType8 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$58 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$58 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$58
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            anyTypeProvider = anyTypeProvider2;
            cls = Object.class;
            AbstractC2855l.m(4, "P0");
            d dVarB2 = D.b(cls);
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$58), converters);
        } else {
            anyTypeProvider = anyTypeProvider2;
            cls = Object.class;
            i10 = 3;
            anyType = anyType8;
        }
        AbstractC2855l.m(4, "P1");
        d dVarB3 = D.b(cls);
        AbstractC2855l.m(i10, "P1");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType9 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$59 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$59 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$59
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            i11 = 4;
            AbstractC2855l.m(4, "P1");
            d dVarB4 = D.b(cls);
            i12 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$59), converters);
        } else {
            i11 = 4;
            i12 = 3;
            anyType2 = anyType9;
        }
        AbstractC2855l.m(i11, "P2");
        d dVarB5 = D.b(cls);
        AbstractC2855l.m(i12, "P2");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType10 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$60 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$60 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$60
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            i13 = 4;
            AbstractC2855l.m(4, "P2");
            d dVarB6 = D.b(cls);
            i14 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$60), converters);
        } else {
            i13 = 4;
            i14 = 3;
            anyType3 = anyType10;
        }
        AbstractC2855l.m(i13, "P3");
        d dVarB7 = D.b(cls);
        AbstractC2855l.m(i14, "P3");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType11 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$61 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$61 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$61
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            i15 = 4;
            AbstractC2855l.m(4, "P3");
            d dVarB8 = D.b(cls);
            i16 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$61), converters);
        } else {
            i15 = 4;
            i16 = 3;
            anyType4 = anyType11;
        }
        AbstractC2855l.m(i15, "P4");
        d dVarB9 = D.b(cls);
        AbstractC2855l.m(i16, "P4");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType12 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$62 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$62 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$62
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            i17 = 4;
            AbstractC2855l.m(4, "P4");
            d dVarB10 = D.b(cls);
            i18 = 3;
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$62), converters);
        } else {
            i17 = 4;
            i18 = 3;
            anyType5 = anyType12;
        }
        AbstractC2855l.m(i17, "P5");
        d dVarB11 = D.b(cls);
        AbstractC2855l.m(i18, "P5");
        AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType13 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$63 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$63 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$63
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P5");
                    return null;
                }
            };
            i19 = 4;
            AbstractC2855l.m(4, "P5");
            d dVarB12 = D.b(cls);
            i20 = 3;
            AbstractC2855l.m(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$63), converters);
        } else {
            i19 = 4;
            i20 = 3;
            anyType6 = anyType13;
        }
        AbstractC2855l.m(i19, "P6");
        d dVarB13 = D.b(cls);
        AbstractC2855l.m(i20, "P6");
        AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType14 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$64 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$64 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$64
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P6");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P6");
            d dVarB14 = D.b(cls);
            AbstractC2855l.m(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$64), converters);
        } else {
            anyType7 = anyType14;
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7}, new Function2() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.StaticAsyncFunction.35
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Object[]) obj, (Promise) obj2);
                return C2735B.f28704a;
            }

            public final void invoke(Object[] objArr, Promise promise) {
                AbstractC2855l.g(objArr, "<destruct>");
                AbstractC2855l.g(promise, "promise");
                body.i(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], promise);
            }
        });
        getStaticAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> AsyncFunctionComponent StaticAsyncFunction(String name, final r body) {
        AnyTypeProvider anyTypeProvider;
        int i10;
        AnyType anyType;
        int i11;
        int i12;
        AnyType anyType2;
        int i13;
        int i14;
        AnyType anyType3;
        int i15;
        int i16;
        AnyType anyType4;
        int i17;
        int i18;
        AnyType anyType5;
        int i19;
        AnyType anyType6;
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AbstractC2855l.m(4, "P3");
        AbstractC2855l.m(4, "P4");
        AbstractC2855l.m(4, "P5");
        AnyTypeProvider anyTypeProvider2 = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType7 = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, false));
        if (anyType7 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$26 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$26 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$26
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            d dVarB2 = D.b(Object.class);
            anyTypeProvider = anyTypeProvider2;
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$26), converters);
        } else {
            anyTypeProvider = anyTypeProvider2;
            i10 = 3;
            anyType = anyType7;
        }
        AbstractC2855l.m(4, "P1");
        d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(i10, "P1");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType8 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$27 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$27 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$27
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            i11 = 4;
            AbstractC2855l.m(4, "P1");
            d dVarB4 = D.b(Object.class);
            i12 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$27), converters);
        } else {
            i11 = 4;
            i12 = 3;
            anyType2 = anyType8;
        }
        AbstractC2855l.m(i11, "P2");
        d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(i12, "P2");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType9 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$28 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$28 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$28
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            i13 = 4;
            AbstractC2855l.m(4, "P2");
            d dVarB6 = D.b(Object.class);
            i14 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$28), converters);
        } else {
            i13 = 4;
            i14 = 3;
            anyType3 = anyType9;
        }
        AbstractC2855l.m(i13, "P3");
        d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(i14, "P3");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType10 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$29 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$29 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$29
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            i15 = 4;
            AbstractC2855l.m(4, "P3");
            d dVarB8 = D.b(Object.class);
            i16 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$29), converters);
        } else {
            i15 = 4;
            i16 = 3;
            anyType4 = anyType10;
        }
        AbstractC2855l.m(i15, "P4");
        d dVarB9 = D.b(Object.class);
        AbstractC2855l.m(i16, "P4");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType11 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$30 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$30 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$30
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            i17 = 4;
            AbstractC2855l.m(4, "P4");
            d dVarB10 = D.b(Object.class);
            i18 = 3;
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$30), converters);
        } else {
            i17 = 4;
            i18 = 3;
            anyType5 = anyType11;
        }
        AbstractC2855l.m(i17, "P5");
        d dVarB11 = D.b(Object.class);
        AbstractC2855l.m(i18, "P5");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType12 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$31 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$31 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$31
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P5");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P5");
            d dVarB12 = D.b(Object.class);
            i19 = 3;
            AbstractC2855l.m(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$31), converters);
        } else {
            i19 = 3;
            anyType6 = anyType12;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.StaticAsyncFunction.25
            /* JADX WARN: Type inference failed for: r9v1, types: [R, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.m(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
        };
        AbstractC2855l.m(i19, "R");
        AbstractC2855l.m(4, "R");
        if (AbstractC2855l.b(Object.class, Integer.TYPE)) {
            untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(name, anyTypeArr, function1);
        } else if (AbstractC2855l.b(Object.class, Boolean.TYPE)) {
            untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(name, anyTypeArr, function1);
        } else if (AbstractC2855l.b(Object.class, Double.TYPE)) {
            untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(name, anyTypeArr, function1);
        } else if (AbstractC2855l.b(Object.class, Float.TYPE)) {
            untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(name, anyTypeArr, function1);
        } else if (AbstractC2855l.b(Object.class, String.class)) {
            untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(name, anyTypeArr, function1);
        } else {
            untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(name, anyTypeArr, function1);
        }
        getStaticAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <P0, P1, P2, P3, P4, P5, P6> SyncFunctionComponent Constructor(final s body) {
        AnyTypeProvider anyTypeProvider;
        Class cls;
        int i10;
        AnyType anyType;
        int i11;
        int i12;
        AnyType anyType2;
        int i13;
        int i14;
        AnyType anyType3;
        int i15;
        int i16;
        AnyType anyType4;
        int i17;
        int i18;
        AnyType anyType5;
        int i19;
        int i20;
        AnyType anyType6;
        AnyType anyType7;
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AbstractC2855l.m(4, "P3");
        AbstractC2855l.m(4, "P4");
        AbstractC2855l.m(4, "P5");
        AbstractC2855l.m(4, "P6");
        AnyTypeProvider anyTypeProvider2 = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType8 = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, false));
        if (anyType8 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$22 classComponentBuilder$Constructor$$inlined$toArgsArray$default$22 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$22
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            anyTypeProvider = anyTypeProvider2;
            AbstractC2855l.m(4, "P0");
            d dVarB2 = D.b(Object.class);
            cls = Object.class;
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$22), converters);
        } else {
            anyTypeProvider = anyTypeProvider2;
            cls = Object.class;
            i10 = 3;
            anyType = anyType8;
        }
        AbstractC2855l.m(4, "P1");
        d dVarB3 = D.b(cls);
        AbstractC2855l.m(i10, "P1");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType9 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$23 classComponentBuilder$Constructor$$inlined$toArgsArray$default$23 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$23
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            i11 = 4;
            AbstractC2855l.m(4, "P1");
            d dVarB4 = D.b(cls);
            i12 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$23), converters);
        } else {
            i11 = 4;
            i12 = 3;
            anyType2 = anyType9;
        }
        AbstractC2855l.m(i11, "P2");
        d dVarB5 = D.b(cls);
        AbstractC2855l.m(i12, "P2");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType10 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$24 classComponentBuilder$Constructor$$inlined$toArgsArray$default$24 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$24
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            i13 = 4;
            AbstractC2855l.m(4, "P2");
            d dVarB6 = D.b(cls);
            i14 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$24), converters);
        } else {
            i13 = 4;
            i14 = 3;
            anyType3 = anyType10;
        }
        AbstractC2855l.m(i13, "P3");
        d dVarB7 = D.b(cls);
        AbstractC2855l.m(i14, "P3");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType11 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$25 classComponentBuilder$Constructor$$inlined$toArgsArray$default$25 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$25
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            i15 = 4;
            AbstractC2855l.m(4, "P3");
            d dVarB8 = D.b(cls);
            i16 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$25), converters);
        } else {
            i15 = 4;
            i16 = 3;
            anyType4 = anyType11;
        }
        AbstractC2855l.m(i15, "P4");
        d dVarB9 = D.b(cls);
        AbstractC2855l.m(i16, "P4");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType12 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$26 classComponentBuilder$Constructor$$inlined$toArgsArray$default$26 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$26
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            i17 = 4;
            AbstractC2855l.m(4, "P4");
            d dVarB10 = D.b(cls);
            i18 = 3;
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$26), converters);
        } else {
            i17 = 4;
            i18 = 3;
            anyType5 = anyType12;
        }
        AbstractC2855l.m(i17, "P5");
        d dVarB11 = D.b(cls);
        AbstractC2855l.m(i18, "P5");
        AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType13 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$27 classComponentBuilder$Constructor$$inlined$toArgsArray$default$27 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$27
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P5");
                    return null;
                }
            };
            i19 = 4;
            AbstractC2855l.m(4, "P5");
            d dVarB12 = D.b(cls);
            i20 = 3;
            AbstractC2855l.m(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$27), converters);
        } else {
            i19 = 4;
            i20 = 3;
            anyType6 = anyType13;
        }
        AbstractC2855l.m(i19, "P6");
        d dVarB13 = D.b(cls);
        AbstractC2855l.m(i20, "P6");
        AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType14 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$28 classComponentBuilder$Constructor$$inlined$toArgsArray$default$28 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$28
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P6");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P6");
            d dVarB14 = D.b(cls);
            AbstractC2855l.m(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$28), converters);
        } else {
            anyType7 = anyType14;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(D.b(cls));
        if (returnType == null) {
            returnType = new ReturnType(D.b(cls));
            returnTypeProvider.getTypes().put(D.b(cls), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("constructor", anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.Constructor.15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.s(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
            }
        });
        setConstructor(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> SyncFunctionComponent StaticFunction(String name, final s body) {
        AnyTypeProvider anyTypeProvider;
        Class cls;
        int i10;
        AnyType anyType;
        int i11;
        int i12;
        AnyType anyType2;
        int i13;
        int i14;
        AnyType anyType3;
        int i15;
        int i16;
        AnyType anyType4;
        int i17;
        int i18;
        AnyType anyType5;
        int i19;
        int i20;
        AnyType anyType6;
        int i21;
        AnyType anyType7;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AbstractC2855l.m(4, "P3");
        AbstractC2855l.m(4, "P4");
        AbstractC2855l.m(4, "P5");
        AbstractC2855l.m(4, "P6");
        AnyTypeProvider anyTypeProvider2 = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType8 = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, false));
        if (anyType8 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$22 classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$22 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$22
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            anyTypeProvider = anyTypeProvider2;
            cls = Object.class;
            AbstractC2855l.m(4, "P0");
            d dVarB2 = D.b(cls);
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$22), converters);
        } else {
            anyTypeProvider = anyTypeProvider2;
            cls = Object.class;
            i10 = 3;
            anyType = anyType8;
        }
        AbstractC2855l.m(4, "P1");
        d dVarB3 = D.b(cls);
        AbstractC2855l.m(i10, "P1");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType9 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$23 classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$23 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$23
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            i11 = 4;
            AbstractC2855l.m(4, "P1");
            d dVarB4 = D.b(cls);
            i12 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$23), converters);
        } else {
            i11 = 4;
            i12 = 3;
            anyType2 = anyType9;
        }
        AbstractC2855l.m(i11, "P2");
        d dVarB5 = D.b(cls);
        AbstractC2855l.m(i12, "P2");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType10 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$24 classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$24 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$24
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            i13 = 4;
            AbstractC2855l.m(4, "P2");
            d dVarB6 = D.b(cls);
            i14 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$24), converters);
        } else {
            i13 = 4;
            i14 = 3;
            anyType3 = anyType10;
        }
        AbstractC2855l.m(i13, "P3");
        d dVarB7 = D.b(cls);
        AbstractC2855l.m(i14, "P3");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType11 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$25 classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$25 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$25
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            i15 = 4;
            AbstractC2855l.m(4, "P3");
            d dVarB8 = D.b(cls);
            i16 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$25), converters);
        } else {
            i15 = 4;
            i16 = 3;
            anyType4 = anyType11;
        }
        AbstractC2855l.m(i15, "P4");
        d dVarB9 = D.b(cls);
        AbstractC2855l.m(i16, "P4");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType12 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$26 classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$26 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$26
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            i17 = 4;
            AbstractC2855l.m(4, "P4");
            d dVarB10 = D.b(cls);
            i18 = 3;
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$26), converters);
        } else {
            i17 = 4;
            i18 = 3;
            anyType5 = anyType12;
        }
        AbstractC2855l.m(i17, "P5");
        d dVarB11 = D.b(cls);
        AbstractC2855l.m(i18, "P5");
        AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType13 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$27 classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$27 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$27
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P5");
                    return null;
                }
            };
            i19 = 4;
            AbstractC2855l.m(4, "P5");
            d dVarB12 = D.b(cls);
            i20 = 3;
            AbstractC2855l.m(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$27), converters);
        } else {
            i19 = 4;
            i20 = 3;
            anyType6 = anyType13;
        }
        AbstractC2855l.m(i19, "P6");
        d dVarB13 = D.b(cls);
        AbstractC2855l.m(i20, "P6");
        AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType14 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$28 classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$28 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$28
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P6");
                    return null;
                }
            };
            i21 = 4;
            AbstractC2855l.m(4, "P6");
            d dVarB14 = D.b(cls);
            AbstractC2855l.m(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, classComponentBuilder$StaticFunction$$inlined$toArgsArray$default$28), converters);
        } else {
            i21 = 4;
            anyType7 = anyType14;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<d, ReturnType> types = returnTypeProvider.getTypes();
        AbstractC2855l.m(i21, "R");
        ReturnType returnType = types.get(D.b(cls));
        if (returnType == null) {
            AbstractC2855l.m(i21, "R");
            returnType = new ReturnType(D.b(cls));
            Map<d, ReturnType> types2 = returnTypeProvider.getTypes();
            AbstractC2855l.m(i21, "R");
            types2.put(D.b(cls), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.StaticFunction.18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.s(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
            }
        });
        getStaticSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> AsyncFunctionComponent StaticAsyncFunction(String name, final s body) {
        AnyTypeProvider anyTypeProvider;
        int i10;
        AnyType anyType;
        int i11;
        int i12;
        AnyType anyType2;
        int i13;
        int i14;
        AnyType anyType3;
        int i15;
        int i16;
        AnyType anyType4;
        int i17;
        int i18;
        AnyType anyType5;
        int i19;
        int i20;
        AnyType anyType6;
        int i21;
        AnyType anyType7;
        String str;
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AbstractC2855l.m(4, "P3");
        AbstractC2855l.m(4, "P4");
        AbstractC2855l.m(4, "P5");
        AbstractC2855l.m(4, "P6");
        AnyTypeProvider anyTypeProvider2 = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType8 = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, false));
        if (anyType8 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$37 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$37 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$37
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            anyTypeProvider = anyTypeProvider2;
            AbstractC2855l.m(4, "P0");
            d dVarB2 = D.b(Object.class);
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$37), converters);
        } else {
            anyTypeProvider = anyTypeProvider2;
            i10 = 3;
            anyType = anyType8;
        }
        AbstractC2855l.m(4, "P1");
        d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(i10, "P1");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType9 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$38 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$38 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$38
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            i11 = 4;
            AbstractC2855l.m(4, "P1");
            d dVarB4 = D.b(Object.class);
            i12 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$38), converters);
        } else {
            i11 = 4;
            i12 = 3;
            anyType2 = anyType9;
        }
        AbstractC2855l.m(i11, "P2");
        d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(i12, "P2");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType10 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$39 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$39 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$39
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            i13 = 4;
            AbstractC2855l.m(4, "P2");
            d dVarB6 = D.b(Object.class);
            i14 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$39), converters);
        } else {
            i13 = 4;
            i14 = 3;
            anyType3 = anyType10;
        }
        AbstractC2855l.m(i13, "P3");
        d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(i14, "P3");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType11 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$40 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$40 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$40
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            i15 = 4;
            AbstractC2855l.m(4, "P3");
            d dVarB8 = D.b(Object.class);
            i16 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$40), converters);
        } else {
            i15 = 4;
            i16 = 3;
            anyType4 = anyType11;
        }
        AbstractC2855l.m(i15, "P4");
        d dVarB9 = D.b(Object.class);
        AbstractC2855l.m(i16, "P4");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType12 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$41 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$41 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$41
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            i17 = 4;
            AbstractC2855l.m(4, "P4");
            d dVarB10 = D.b(Object.class);
            i18 = 3;
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$41), converters);
        } else {
            i17 = 4;
            i18 = 3;
            anyType5 = anyType12;
        }
        AbstractC2855l.m(i17, "P5");
        d dVarB11 = D.b(Object.class);
        AbstractC2855l.m(i18, "P5");
        AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType13 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$42 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$42 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$42
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P5");
                    return null;
                }
            };
            i19 = 4;
            AbstractC2855l.m(4, "P5");
            d dVarB12 = D.b(Object.class);
            i20 = 3;
            AbstractC2855l.m(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$42), converters);
        } else {
            i19 = 4;
            i20 = 3;
            anyType6 = anyType13;
        }
        AbstractC2855l.m(i19, "P6");
        d dVarB13 = D.b(Object.class);
        AbstractC2855l.m(i20, "P6");
        AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType14 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$43 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$43 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$43
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P6");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P6");
            d dVarB14 = D.b(Object.class);
            i21 = 3;
            AbstractC2855l.m(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$43), converters);
        } else {
            i21 = 3;
            anyType7 = anyType14;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.StaticAsyncFunction.29
            /* JADX WARN: Type inference failed for: r10v1, types: [R, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.s(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
            }
        };
        AbstractC2855l.m(i21, "R");
        AbstractC2855l.m(4, "R");
        if (AbstractC2855l.b(Object.class, Integer.TYPE)) {
            str = name;
            untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(str, anyTypeArr, function1);
        } else {
            str = name;
            if (AbstractC2855l.b(Object.class, Boolean.TYPE)) {
                untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(str, anyTypeArr, function1);
            } else if (AbstractC2855l.b(Object.class, Double.TYPE)) {
                untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(str, anyTypeArr, function1);
            } else if (AbstractC2855l.b(Object.class, Float.TYPE)) {
                untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(str, anyTypeArr, function1);
            } else if (AbstractC2855l.b(Object.class, String.class)) {
                untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(str, anyTypeArr, function1);
            } else {
                untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(str, anyTypeArr, function1);
            }
        }
        getStaticAsyncFunctions().put(str, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 expo.modules.kotlin.functions.SyncFunctionComponent, still in use, count: 2, list:
          (r1v1 expo.modules.kotlin.functions.SyncFunctionComponent) from 0x0082: MOVE (r19v0 expo.modules.kotlin.functions.SyncFunctionComponent) = (r1v1 expo.modules.kotlin.functions.SyncFunctionComponent)
          (r1v1 expo.modules.kotlin.functions.SyncFunctionComponent) from 0x0071: MOVE (r19v2 expo.modules.kotlin.functions.SyncFunctionComponent) = (r1v1 expo.modules.kotlin.functions.SyncFunctionComponent)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final /* synthetic */ <P0, P1, P2, P3, P4, P5, P6, P7> expo.modules.kotlin.functions.SyncFunctionComponent Constructor(final w7.t r29) {
        /*
            Method dump skipped, instruction units count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.classcomponent.ClassComponentBuilder.Constructor(w7.t):expo.modules.kotlin.functions.SyncFunctionComponent");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v2 expo.modules.kotlin.functions.SyncFunctionComponent, still in use, count: 2, list:
          (r2v2 expo.modules.kotlin.functions.SyncFunctionComponent) from 0x0089: MOVE (r19v0 expo.modules.kotlin.functions.SyncFunctionComponent) = (r2v2 expo.modules.kotlin.functions.SyncFunctionComponent)
          (r2v2 expo.modules.kotlin.functions.SyncFunctionComponent) from 0x0078: MOVE (r19v2 expo.modules.kotlin.functions.SyncFunctionComponent) = (r2v2 expo.modules.kotlin.functions.SyncFunctionComponent)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6, P7> expo.modules.kotlin.functions.SyncFunctionComponent StaticFunction(java.lang.String r29, final w7.t r30) {
        /*
            Method dump skipped, instruction units count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.classcomponent.ClassComponentBuilder.StaticFunction(java.lang.String, w7.t):expo.modules.kotlin.functions.SyncFunctionComponent");
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6, P7> AsyncFunctionComponent StaticAsyncFunction(String name, final w7.t body) {
        AnyTypeProvider anyTypeProvider;
        Class cls;
        int i10;
        AnyType anyType;
        int i11;
        int i12;
        AnyType anyType2;
        int i13;
        int i14;
        AnyType anyType3;
        int i15;
        int i16;
        AnyType anyType4;
        int i17;
        int i18;
        AnyType anyType5;
        int i19;
        int i20;
        AnyType anyType6;
        int i21;
        int i22;
        AnyType anyType7;
        int i23;
        AnyType anyType8;
        String str;
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AbstractC2855l.m(4, "P3");
        AbstractC2855l.m(4, "P4");
        AbstractC2855l.m(4, "P5");
        AbstractC2855l.m(4, "P6");
        AbstractC2855l.m(4, "P7");
        AnyTypeProvider anyTypeProvider2 = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType9 = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, false));
        if (anyType9 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$50 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$50 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$50
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            anyTypeProvider = anyTypeProvider2;
            AbstractC2855l.m(4, "P0");
            d dVarB2 = D.b(Object.class);
            cls = Object.class;
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$50), converters);
        } else {
            anyTypeProvider = anyTypeProvider2;
            cls = Object.class;
            i10 = 3;
            anyType = anyType9;
        }
        AbstractC2855l.m(4, "P1");
        d dVarB3 = D.b(cls);
        AbstractC2855l.m(i10, "P1");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType10 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$51 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$51 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$51
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            i11 = 4;
            AbstractC2855l.m(4, "P1");
            d dVarB4 = D.b(cls);
            i12 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$51), converters);
        } else {
            i11 = 4;
            i12 = 3;
            anyType2 = anyType10;
        }
        AbstractC2855l.m(i11, "P2");
        d dVarB5 = D.b(cls);
        AbstractC2855l.m(i12, "P2");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType11 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$52 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$52 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$52
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            i13 = 4;
            AbstractC2855l.m(4, "P2");
            d dVarB6 = D.b(cls);
            i14 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$52), converters);
        } else {
            i13 = 4;
            i14 = 3;
            anyType3 = anyType11;
        }
        AbstractC2855l.m(i13, "P3");
        d dVarB7 = D.b(cls);
        AbstractC2855l.m(i14, "P3");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType12 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$53 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$53 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$53
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            i15 = 4;
            AbstractC2855l.m(4, "P3");
            d dVarB8 = D.b(cls);
            i16 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$53), converters);
        } else {
            i15 = 4;
            i16 = 3;
            anyType4 = anyType12;
        }
        AbstractC2855l.m(i15, "P4");
        d dVarB9 = D.b(cls);
        AbstractC2855l.m(i16, "P4");
        AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType13 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$54 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$54 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$54
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            i17 = 4;
            AbstractC2855l.m(4, "P4");
            d dVarB10 = D.b(cls);
            i18 = 3;
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$54), converters);
        } else {
            i17 = 4;
            i18 = 3;
            anyType5 = anyType13;
        }
        AbstractC2855l.m(i17, "P5");
        d dVarB11 = D.b(cls);
        AbstractC2855l.m(i18, "P5");
        AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType14 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$55 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$55 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$55
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P5");
                    return null;
                }
            };
            i19 = 4;
            AbstractC2855l.m(4, "P5");
            d dVarB12 = D.b(cls);
            i20 = 3;
            AbstractC2855l.m(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$55), converters);
        } else {
            i19 = 4;
            i20 = 3;
            anyType6 = anyType14;
        }
        AbstractC2855l.m(i19, "P6");
        d dVarB13 = D.b(cls);
        AbstractC2855l.m(i20, "P6");
        AnyType anyType15 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType15 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$56 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$56 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$56
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P6");
                    return null;
                }
            };
            i21 = 4;
            AbstractC2855l.m(4, "P6");
            d dVarB14 = D.b(cls);
            i22 = 3;
            AbstractC2855l.m(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$56), converters);
        } else {
            i21 = 4;
            i22 = 3;
            anyType7 = anyType15;
        }
        AbstractC2855l.m(i21, "P7");
        d dVarB15 = D.b(cls);
        AbstractC2855l.m(i22, "P7");
        AnyType anyType16 = anyTypeProvider.getTypesMap().get(new Pair(dVarB15, false));
        if (anyType16 == null) {
            AbstractC2855l.l();
            ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$57 classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$57 = new InterfaceC3487a() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$57
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P7");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P7");
            d dVarB16 = D.b(cls);
            i23 = 3;
            AbstractC2855l.m(3, "P7");
            anyType8 = new AnyType(new LazyKType(dVarB16, false, classComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$57), converters);
        } else {
            i23 = 3;
            anyType8 = anyType16;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7, anyType8};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.StaticAsyncFunction.33
            /* JADX WARN: Type inference failed for: r11v1, types: [R, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.i(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
            }
        };
        AbstractC2855l.m(i23, "R");
        AbstractC2855l.m(4, "R");
        Class cls2 = cls;
        if (AbstractC2855l.b(cls2, Integer.TYPE)) {
            str = name;
            untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(str, anyTypeArr, function1);
        } else {
            str = name;
            if (AbstractC2855l.b(cls2, Boolean.TYPE)) {
                untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(str, anyTypeArr, function1);
            } else if (AbstractC2855l.b(cls2, Double.TYPE)) {
                untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(str, anyTypeArr, function1);
            } else if (AbstractC2855l.b(cls2, Float.TYPE)) {
                untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(str, anyTypeArr, function1);
            } else if (AbstractC2855l.b(cls2, String.class)) {
                untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(str, anyTypeArr, function1);
            } else {
                untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(str, anyTypeArr, function1);
            }
        }
        getStaticAsyncFunctions().put(str, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }
}
