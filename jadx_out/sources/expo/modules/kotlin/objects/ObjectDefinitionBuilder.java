package expo.modules.kotlin.objects;

import C7.g;
import C7.j;
import C7.m;
import C7.o;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.EnumExtensionsKt;
import expo.modules.kotlin.KClassExtensionsKt;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.events.EventsDefinition;
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
import expo.modules.kotlin.objects.EventObservingDefinition;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.Enumerable;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import i7.C2735B;
import j7.AbstractC2793j;
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
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w7.InterfaceC3487a;
import w7.p;
import w7.q;
import w7.r;
import w7.s;
import w7.t;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0017\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u001a\u0010\f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n0\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u000e\u001a\u00020\r2.\u0010\u0012\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00110\u0010\"\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0007¢\u0006\u0004\b\u000e\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0016\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u000b2\u0010\b\u0004\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010\u0016\u001a\u00020\u0019\"\u0006\b\u0000\u0010\u001c\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2\u000e\b\u0004\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u001bJA\u0010\u0016\u001a\u00020\u0019\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2\u0014\b\u0004\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u001fJO\u0010\u0016\u001a\u00020\u0019\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2\u001a\b\u0004\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000!H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\"J]\u0010\u0016\u001a\u00020\u0019\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2 \b\u0004\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00000$H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010%Jk\u0010\u0016\u001a\u00020\u0019\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2&\b\u0004\u0010\u0018\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00000'H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010(Jy\u0010\u0016\u001a\u00020\u0019\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u0001\"\u0006\b\u0005\u0010)\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2,\b\u0004\u0010\u0018\u001a&\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00000*H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010+J\u0087\u0001\u0010\u0016\u001a\u00020\u0019\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u0001\"\u0006\b\u0005\u0010)\u0018\u0001\"\u0006\b\u0006\u0010,\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b22\b\u0004\u0010\u0018\u001a,\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00000-H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010.J\u0095\u0001\u0010\u0016\u001a\u00020\u0019\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u0001\"\u0006\b\u0005\u0010)\u0018\u0001\"\u0006\b\u0006\u0010,\u0018\u0001\"\u0006\b\u0007\u0010/\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b28\b\u0004\u0010\u0018\u001a2\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u000000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u00101J£\u0001\u0010\u0016\u001a\u00020\u0019\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u0001\"\u0006\b\u0005\u0010)\u0018\u0001\"\u0006\b\u0006\u0010,\u0018\u0001\"\u0006\b\u0007\u0010/\u0018\u0001\"\u0006\b\b\u00102\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2>\b\u0004\u0010\u0018\u001a8\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\u000003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u00104J-\u00108\u001a\u0002052\u0006\u0010\u0014\u001a\u00020\u000b2\u0010\b\u0004\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0087\bø\u0001\u0000¢\u0006\u0004\b6\u00107J3\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2\u000e\b\u0004\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b8\u00107JA\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2\u0014\b\u0004\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b8\u00109JO\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2\u001a\b\u0004\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000!H\u0086\bø\u0001\u0000¢\u0006\u0004\b8\u0010:JG\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2\u001a\b\u0004\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00028\u00000!H\u0087\bø\u0001\u0000¢\u0006\u0004\b<\u0010:J]\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2 \b\u0004\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00000$H\u0086\bø\u0001\u0000¢\u0006\u0004\b8\u0010=JU\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2 \b\u0004\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00028\u00000$H\u0087\bø\u0001\u0000¢\u0006\u0004\b<\u0010=Jk\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2&\b\u0004\u0010\u0018\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00000'H\u0086\bø\u0001\u0000¢\u0006\u0004\b8\u0010>Jc\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2&\b\u0004\u0010\u0018\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00028\u00000'H\u0087\bø\u0001\u0000¢\u0006\u0004\b<\u0010>Jy\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u0001\"\u0006\b\u0005\u0010)\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2,\b\u0004\u0010\u0018\u001a&\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00000*H\u0086\bø\u0001\u0000¢\u0006\u0004\b8\u0010?Jq\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2,\b\u0004\u0010\u0018\u001a&\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00028\u00000*H\u0087\bø\u0001\u0000¢\u0006\u0004\b<\u0010?J\u0087\u0001\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u0001\"\u0006\b\u0005\u0010)\u0018\u0001\"\u0006\b\u0006\u0010,\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b22\b\u0004\u0010\u0018\u001a,\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00000-H\u0086\bø\u0001\u0000¢\u0006\u0004\b8\u0010@J\u007f\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u0001\"\u0006\b\u0005\u0010)\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b22\b\u0004\u0010\u0018\u001a,\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00028\u00000-H\u0087\bø\u0001\u0000¢\u0006\u0004\b<\u0010@J\u0095\u0001\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u0001\"\u0006\b\u0005\u0010)\u0018\u0001\"\u0006\b\u0006\u0010,\u0018\u0001\"\u0006\b\u0007\u0010/\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b28\b\u0004\u0010\u0018\u001a2\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u000000H\u0086\bø\u0001\u0000¢\u0006\u0004\b8\u0010AJ\u008d\u0001\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u0001\"\u0006\b\u0005\u0010)\u0018\u0001\"\u0006\b\u0006\u0010,\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b28\b\u0004\u0010\u0018\u001a2\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00028\u000000H\u0087\bø\u0001\u0000¢\u0006\u0004\b<\u0010AJ£\u0001\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u0001\"\u0006\b\u0005\u0010)\u0018\u0001\"\u0006\b\u0006\u0010,\u0018\u0001\"\u0006\b\u0007\u0010/\u0018\u0001\"\u0006\b\b\u00102\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2>\b\u0004\u0010\u0018\u001a8\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\u000003H\u0086\bø\u0001\u0000¢\u0006\u0004\b8\u0010BJ\u009b\u0001\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u0001\"\u0006\b\u0005\u0010)\u0018\u0001\"\u0006\b\u0006\u0010,\u0018\u0001\"\u0006\b\u0007\u0010/\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2>\b\u0004\u0010\u0018\u001a8\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00028\u000003H\u0087\bø\u0001\u0000¢\u0006\u0004\b<\u0010BJ\u0015\u00108\u001a\u00020C2\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b8\u0010DJ!\u0010F\u001a\u00020\r2\u0012\u0010E\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0010\"\u00020\u000b¢\u0006\u0004\bF\u0010GJ\u001d\u0010F\u001a\u00020\r2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H\u0007¢\u0006\u0004\bH\u0010GJ&\u0010F\u001a\u00020\r\"\u0014\b\u0000\u0010K\u0018\u0001*\u00020I*\b\u0012\u0004\u0012\u00028\u00000JH\u0086\b¢\u0006\u0004\bF\u0010LJ#\u0010N\u001a\u00020\r2\u0006\u0010M\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\bN\u0010OJ7\u0010N\u001a\u00020\r\"\u0012\b\u0000\u0010K*\u00020I*\b\u0012\u0004\u0012\u00028\u00000J2\u0006\u0010P\u001a\u00028\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\bN\u0010QJ\u001b\u0010N\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\bN\u0010\u000fJ#\u0010R\u001a\u00020\r2\u0006\u0010M\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\bR\u0010OJ7\u0010R\u001a\u00020\r\"\u0012\b\u0000\u0010K*\u00020I*\b\u0012\u0004\u0012\u00028\u00000J2\u0006\u0010P\u001a\u00028\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\bR\u0010QJ\u001b\u0010R\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\bR\u0010\u000fJ\u0017\u0010T\u001a\u00020S2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\bT\u0010UJ3\u0010T\u001a\u00020S\"\u0006\b\u0000\u0010K\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2\u000e\b\u0004\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0086\bø\u0001\u0000¢\u0006\u0004\bT\u0010VJ\u0017\u0010X\u001a\u00020W2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\bX\u0010YJ3\u0010X\u001a\u00020W\"\u0006\b\u0000\u0010K\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2\u000e\b\u0004\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0086\bø\u0001\u0000¢\u0006\u0004\bX\u0010ZR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010[\u0012\u0004\b^\u0010L\u001a\u0004\b\\\u0010]R*\u0010\f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010_R*\u0010a\u001a\u0004\u0018\u00010`8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\ba\u0010b\u0012\u0004\bg\u0010L\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR4\u0010i\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00190h8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bi\u0010j\u0012\u0004\bo\u0010L\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR4\u0010p\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00150h8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bp\u0010j\u0012\u0004\bs\u0010L\u001a\u0004\bq\u0010l\"\u0004\br\u0010nR4\u0010t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002050h8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bt\u0010j\u0012\u0004\bw\u0010L\u001a\u0004\bu\u0010l\"\u0004\bv\u0010nR\"\u0010x\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020C0h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010jR4\u0010y\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020S0h8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\by\u0010j\u0012\u0004\b|\u0010L\u001a\u0004\bz\u0010l\"\u0004\b{\u0010nR4\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020W0h8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010j\u0012\u0004\b\u007f\u0010L\u001a\u0004\b}\u0010l\"\u0004\b~\u0010nR\u001f\u0010\u0082\u0001\u001a\n\u0012\u0005\u0012\u00030\u0081\u00010\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0084\u0001"}, d2 = {"Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converters", "<init>", "(Lexpo/modules/kotlin/types/TypeConverterProvider;)V", "Lexpo/modules/kotlin/objects/ObjectDefinitionData;", "buildObject", "()Lexpo/modules/kotlin/objects/ObjectDefinitionData;", "Lkotlin/Function0;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "legacyConstantsProvider", "Li7/B;", "Constants", "(Lw7/a;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lkotlin/Pair;", "constants", "([Lkotlin/Pair;)V", "name", "Lexpo/modules/kotlin/functions/FunctionBuilder;", "Function", "(Ljava/lang/String;)Lexpo/modules/kotlin/functions/FunctionBuilder;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "FunctionWithoutArgs", "(Ljava/lang/String;Lw7/a;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "R", "P0", "Lkotlin/Function1;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P1", "Lkotlin/Function2;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P2", "Lkotlin/Function3;", "(Ljava/lang/String;Lw7/o;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P3", "Lkotlin/Function4;", "(Ljava/lang/String;Lw7/p;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P4", "Lkotlin/Function5;", "(Ljava/lang/String;Lw7/q;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P5", "Lkotlin/Function6;", "(Ljava/lang/String;Lw7/r;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P6", "Lkotlin/Function7;", "(Ljava/lang/String;Lw7/s;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P7", "Lkotlin/Function8;", "(Ljava/lang/String;Lw7/t;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "AsyncFunctionWithoutArgs", "(Ljava/lang/String;Lw7/a;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "AsyncFunction", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "Lexpo/modules/kotlin/Promise;", "AsyncFunctionWithPromise", "(Ljava/lang/String;Lw7/o;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Ljava/lang/String;Lw7/p;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Ljava/lang/String;Lw7/q;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Ljava/lang/String;Lw7/r;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Ljava/lang/String;Lw7/s;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Ljava/lang/String;Lw7/t;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;", "(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;", "events", "Events", "([Ljava/lang/String;)V", "EventsWithArray", "Lexpo/modules/kotlin/types/Enumerable;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "T", "()V", "eventName", "OnStartObserving", "(Ljava/lang/String;Lw7/a;)V", "enum", "(Ljava/lang/Enum;Lw7/a;)V", "OnStopObserving", "Lexpo/modules/kotlin/objects/PropertyComponentBuilder;", "Property", "(Ljava/lang/String;)Lexpo/modules/kotlin/objects/PropertyComponentBuilder;", "(Ljava/lang/String;Lw7/a;)Lexpo/modules/kotlin/objects/PropertyComponentBuilder;", "Lexpo/modules/kotlin/objects/ConstantComponentBuilder;", "Constant", "(Ljava/lang/String;)Lexpo/modules/kotlin/objects/ConstantComponentBuilder;", "(Ljava/lang/String;Lw7/a;)Lexpo/modules/kotlin/objects/ConstantComponentBuilder;", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "getConverters", "()Lexpo/modules/kotlin/types/TypeConverterProvider;", "getConverters$annotations", "Lw7/a;", "Lexpo/modules/kotlin/events/EventsDefinition;", "eventsDefinition", "Lexpo/modules/kotlin/events/EventsDefinition;", "getEventsDefinition", "()Lexpo/modules/kotlin/events/EventsDefinition;", "setEventsDefinition", "(Lexpo/modules/kotlin/events/EventsDefinition;)V", "getEventsDefinition$annotations", PointerEventHelper.POINTER_TYPE_UNKNOWN, "syncFunctions", "Ljava/util/Map;", "getSyncFunctions", "()Ljava/util/Map;", "setSyncFunctions", "(Ljava/util/Map;)V", "getSyncFunctions$annotations", "syncFunctionBuilder", "getSyncFunctionBuilder", "setSyncFunctionBuilder", "getSyncFunctionBuilder$annotations", "asyncFunctions", "getAsyncFunctions", "setAsyncFunctions", "getAsyncFunctions$annotations", "asyncFunctionBuilders", "properties", "getProperties", "setProperties", "getProperties$annotations", "getConstants", "setConstants", "getConstants$annotations", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/objects/EventObservingDefinition;", "eventObservers", "Ljava/util/List;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ObjectDefinitionBuilder {
    private Map<String, AsyncFunctionBuilder> asyncFunctionBuilders;
    private Map<String, AsyncFunctionComponent> asyncFunctions;
    private Map<String, ConstantComponentBuilder> constants;
    private final TypeConverterProvider converters;
    private final List<EventObservingDefinition> eventObservers;
    private EventsDefinition eventsDefinition;
    private InterfaceC3487a legacyConstantsProvider;
    private Map<String, PropertyComponentBuilder> properties;
    private Map<String, FunctionBuilder> syncFunctionBuilder;
    private Map<String, SyncFunctionComponent> syncFunctions;

    /* JADX WARN: Multi-variable type inference failed */
    public ObjectDefinitionBuilder() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final /* synthetic */ <R> AsyncFunctionComponent AsyncFunction(String name, final InterfaceC3487a body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        AnyType[] anyTypeArr = new AnyType[0];
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.3
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
        getAsyncFunctions().put(name, intAsyncFunctionComponent);
        return intAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0> AsyncFunctionComponent AsyncFunctionWithPromise(String name, final Function2 body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$7 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$7 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$7
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$7), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType}, new Function2() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.10
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
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final AsyncFunctionComponent AsyncFunctionWithoutArgs(String name, final InterfaceC3487a body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(name, new AnyType[0], new Function1() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] it) {
                AbstractC2855l.g(it, "it");
                return body.invoke();
            }
        });
        getAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public ConstantComponentBuilder Constant(String name) {
        AbstractC2855l.g(name, "name");
        ConstantComponentBuilder constantComponentBuilder = new ConstantComponentBuilder(name);
        this.constants.put(name, constantComponentBuilder);
        return constantComponentBuilder;
    }

    public final void Constants(InterfaceC3487a legacyConstantsProvider) {
        AbstractC2855l.g(legacyConstantsProvider, "legacyConstantsProvider");
        this.legacyConstantsProvider = legacyConstantsProvider;
    }

    public final void Events(String... events) {
        AbstractC2855l.g(events, "events");
        this.eventsDefinition = new EventsDefinition((String[]) AbstractC2793j.e(events).toArray(new String[0]));
    }

    public final void EventsWithArray(String[] events) {
        AbstractC2855l.g(events, "events");
        this.eventsDefinition = new EventsDefinition(events);
    }

    public final FunctionBuilder Function(String name) {
        AbstractC2855l.g(name, "name");
        FunctionBuilder functionBuilder = new FunctionBuilder(name);
        this.syncFunctionBuilder.put(name, functionBuilder);
        return functionBuilder;
    }

    public final SyncFunctionComponent FunctionWithoutArgs(String name, final InterfaceC3487a body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        AnyType[] anyTypeArr = new AnyType[0];
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(D.b(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(D.b(Object.class));
            returnTypeProvider.getTypes().put(D.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.Function.2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] it) {
                AbstractC2855l.g(it, "it");
                return body.invoke();
            }
        });
        getSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final void OnStartObserving(String eventName, InterfaceC3487a body) {
        AbstractC2855l.g(eventName, "eventName");
        AbstractC2855l.g(body, "body");
        this.eventObservers.add(new EventObservingDefinition(EventObservingDefinition.Type.StartObserving, new EventObservingDefinition.SelectedEventFiler(eventName), body));
    }

    public final void OnStopObserving(String eventName, InterfaceC3487a body) {
        AbstractC2855l.g(eventName, "eventName");
        AbstractC2855l.g(body, "body");
        this.eventObservers.add(new EventObservingDefinition(EventObservingDefinition.Type.StopObserving, new EventObservingDefinition.SelectedEventFiler(eventName), body));
    }

    public PropertyComponentBuilder Property(String name) {
        AbstractC2855l.g(name, "name");
        PropertyComponentBuilder propertyComponentBuilder = new PropertyComponentBuilder(name);
        this.properties.put(name, propertyComponentBuilder);
        return propertyComponentBuilder;
    }

    public final ObjectDefinitionData buildObject() {
        AsyncFunctionComponent intAsyncFunctionComponent;
        for (final EventObservingDefinition.Type type : EventObservingDefinition.Type.getEntries()) {
            if (!this.asyncFunctions.containsKey(type.getValue())) {
                String value = type.getValue();
                if (AbstractC2855l.b(String.class, Promise.class)) {
                    intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent(value, new AnyType[0], new Function2() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$buildObject$lambda$3$$inlined$AsyncFunction$1
                        /* JADX WARN: Multi-variable type inference failed */
                        public final void invoke(Object[] objArr, Promise promise) {
                            AbstractC2855l.g(objArr, "<unused var>");
                            AbstractC2855l.g(promise, "promise");
                            String str = (String) promise;
                            Iterator it = this.this$0.eventObservers.iterator();
                            while (it.hasNext()) {
                                ((EventObservingDefinition) it.next()).invokedIfNeed(type, str);
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Object[]) obj, (Promise) obj2);
                            return C2735B.f28704a;
                        }
                    });
                } else {
                    TypeConverterProvider converters = getConverters();
                    AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(String.class), Boolean.FALSE));
                    if (anyType == null) {
                        anyType = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$buildObject$lambda$3$$inlined$AsyncFunction$2
                            @Override // w7.InterfaceC3487a
                            public final o invoke() {
                                return D.o(String.class);
                            }
                        }), converters);
                    }
                    AnyType[] anyTypeArr = {anyType};
                    Function1 function1 = new Function1() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$buildObject$lambda$3$$inlined$AsyncFunction$3
                        @Override // kotlin.jvm.functions.Function1
                        public final C2735B invoke(Object[] objArr) {
                            AbstractC2855l.g(objArr, "<destruct>");
                            String str = (String) objArr[0];
                            Iterator it = this.this$0.eventObservers.iterator();
                            while (it.hasNext()) {
                                ((EventObservingDefinition) it.next()).invokedIfNeed(type, str);
                            }
                            return C2735B.f28704a;
                        }
                    };
                    intAsyncFunctionComponent = AbstractC2855l.b(C2735B.class, Integer.TYPE) ? new IntAsyncFunctionComponent(value, anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent(value, anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, Double.TYPE) ? new DoubleAsyncFunctionComponent(value, anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, Float.TYPE) ? new FloatAsyncFunctionComponent(value, anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent(value, anyTypeArr, function1) : new UntypedAsyncFunctionComponent(value, anyTypeArr, function1);
                }
                getAsyncFunctions().put(value, intAsyncFunctionComponent);
            }
        }
        Map<String, AsyncFunctionComponent> map = this.asyncFunctions;
        Map<String, AsyncFunctionBuilder> map2 = this.asyncFunctionBuilders;
        LinkedHashMap linkedHashMap = new LinkedHashMap(K.e(map2.size()));
        Iterator<T> it = map2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((AsyncFunctionBuilder) entry.getValue()).build$expo_modules_core_release());
        }
        Map mapW = K.w(K.o(map, linkedHashMap));
        InterfaceC3487a interfaceC3487a = this.legacyConstantsProvider;
        Map<String, SyncFunctionComponent> map3 = this.syncFunctions;
        Map<String, FunctionBuilder> map4 = this.syncFunctionBuilder;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(K.e(map4.size()));
        Iterator<T> it2 = map4.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            linkedHashMap2.put(entry2.getKey(), ((FunctionBuilder) entry2.getValue()).build$expo_modules_core_release());
        }
        Map mapO = K.o(map3, linkedHashMap2);
        EventsDefinition eventsDefinition = this.eventsDefinition;
        Map<String, PropertyComponentBuilder> map5 = this.properties;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(K.e(map5.size()));
        Iterator<T> it3 = map5.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it3.next();
            linkedHashMap3.put(entry3.getKey(), ((PropertyComponentBuilder) entry3.getValue()).build());
        }
        Map<String, ConstantComponentBuilder> map6 = this.constants;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(K.e(map6.size()));
        Iterator<T> it4 = map6.entrySet().iterator();
        while (it4.hasNext()) {
            Map.Entry entry4 = (Map.Entry) it4.next();
            linkedHashMap4.put(entry4.getKey(), ((ConstantComponentBuilder) entry4.getValue()).build());
        }
        return new ObjectDefinitionData(interfaceC3487a, mapO, mapW, eventsDefinition, linkedHashMap3, linkedHashMap4);
    }

    public final Map<String, AsyncFunctionComponent> getAsyncFunctions() {
        return this.asyncFunctions;
    }

    public final Map<String, ConstantComponentBuilder> getConstants() {
        return this.constants;
    }

    public final TypeConverterProvider getConverters() {
        return this.converters;
    }

    public final EventsDefinition getEventsDefinition() {
        return this.eventsDefinition;
    }

    public final Map<String, PropertyComponentBuilder> getProperties() {
        return this.properties;
    }

    public final Map<String, FunctionBuilder> getSyncFunctionBuilder() {
        return this.syncFunctionBuilder;
    }

    public final Map<String, SyncFunctionComponent> getSyncFunctions() {
        return this.syncFunctions;
    }

    public final void setAsyncFunctions(Map<String, AsyncFunctionComponent> map) {
        AbstractC2855l.g(map, "<set-?>");
        this.asyncFunctions = map;
    }

    public final void setConstants(Map<String, ConstantComponentBuilder> map) {
        AbstractC2855l.g(map, "<set-?>");
        this.constants = map;
    }

    public final void setEventsDefinition(EventsDefinition eventsDefinition) {
        this.eventsDefinition = eventsDefinition;
    }

    public final void setProperties(Map<String, PropertyComponentBuilder> map) {
        AbstractC2855l.g(map, "<set-?>");
        this.properties = map;
    }

    public final void setSyncFunctionBuilder(Map<String, FunctionBuilder> map) {
        AbstractC2855l.g(map, "<set-?>");
        this.syncFunctionBuilder = map;
    }

    public final void setSyncFunctions(Map<String, SyncFunctionComponent> map) {
        AbstractC2855l.g(map, "<set-?>");
        this.syncFunctions = map;
    }

    public ObjectDefinitionBuilder(TypeConverterProvider typeConverterProvider) {
        this.converters = typeConverterProvider;
        this.legacyConstantsProvider = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.c
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return K.i();
            }
        };
        this.syncFunctions = new LinkedHashMap();
        this.syncFunctionBuilder = new LinkedHashMap();
        this.asyncFunctions = new LinkedHashMap();
        this.asyncFunctionBuilders = new LinkedHashMap();
        this.properties = new LinkedHashMap();
        this.constants = new LinkedHashMap();
        this.eventObservers = new ArrayList();
    }

    public final void Constants(final Pair<String, ? extends Object>... constants) {
        AbstractC2855l.g(constants, "constants");
        this.legacyConstantsProvider = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.b
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return K.u(constants);
            }
        };
    }

    public final /* synthetic */ <R> SyncFunctionComponent Function(String name, final InterfaceC3487a body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        AnyType[] anyTypeArr = new AnyType[0];
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<C7.d, ReturnType> types = returnTypeProvider.getTypes();
        AbstractC2855l.m(4, "R");
        ReturnType returnType = types.get(D.b(Object.class));
        if (returnType == null) {
            AbstractC2855l.m(4, "R");
            returnType = new ReturnType(D.b(Object.class));
            Map<C7.d, ReturnType> types2 = returnTypeProvider.getTypes();
            AbstractC2855l.m(4, "R");
            types2.put(D.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.Function.4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] it) {
                AbstractC2855l.g(it, "it");
                return body.invoke();
            }
        });
        getSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <T> ConstantComponentBuilder Constant(String name, final InterfaceC3487a body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        ConstantComponentBuilder constantComponentBuilder = new ConstantComponentBuilder(name);
        AbstractC2855l.l();
        constantComponentBuilder.setGetter(new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Constant$lambda$50$$inlined$get$1
            /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
            @Override // w7.InterfaceC3487a
            public final T invoke() {
                return body.invoke();
            }
        });
        getConstants().put(name, constantComponentBuilder);
        return constantComponentBuilder;
    }

    public final /* synthetic */ <T> PropertyComponentBuilder Property(String name, InterfaceC3487a body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        PropertyComponentBuilder propertyComponentBuilder = new PropertyComponentBuilder(name);
        AnyType[] anyTypeArr = new AnyType[0];
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<C7.d, ReturnType> types = returnTypeProvider.getTypes();
        AbstractC2855l.m(4, "T");
        ReturnType returnType = types.get(D.b(Object.class));
        if (returnType == null) {
            AbstractC2855l.m(4, "T");
            returnType = new ReturnType(D.b(Object.class));
            Map<C7.d, ReturnType> types2 = returnTypeProvider.getTypes();
            AbstractC2855l.m(4, "T");
            types2.put(D.b(Object.class), returnType);
        }
        propertyComponentBuilder.setGetter(new SyncFunctionComponent("get", anyTypeArr, returnType, new PropertyComponentBuilder$get$1$1(body)));
        getProperties().put(name, propertyComponentBuilder);
        return propertyComponentBuilder;
    }

    public final /* synthetic */ <T extends Enum<T> & Enumerable> void Events() {
        ArrayList arrayList;
        List parameters;
        Object next;
        AbstractC2855l.m(4, "T");
        g fastPrimaryConstructor = KClassExtensionsKt.getFastPrimaryConstructor(D.b(Enum.class));
        if (fastPrimaryConstructor != null && (parameters = fastPrimaryConstructor.getParameters()) != null && parameters.size() == 1) {
            String name = ((j) AbstractC2800q.e0(fastPrimaryConstructor.getParameters())).getName();
            AbstractC2855l.m(4, "T");
            Iterator it = D7.c.a(D.b(Enum.class)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (AbstractC2855l.b(((m) next).getName(), name)) {
                        break;
                    }
                }
            }
            m mVar = (m) next;
            if (mVar != null) {
                if (AbstractC2855l.b(mVar.getReturnType().getClassifier(), D.b(String.class))) {
                    AbstractC2855l.m(5, "T");
                    arrayList = new ArrayList(0);
                } else {
                    throw new IllegalArgumentException("The enum parameter has to be a string.");
                }
            } else {
                throw new IllegalArgumentException(("Cannot find a property for " + name + " parameter").toString());
            }
        } else {
            AbstractC2855l.m(5, "T");
            arrayList = new ArrayList(0);
        }
        setEventsDefinition(new EventsDefinition((String[]) arrayList.toArray(new String[0])));
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Enum<TT;>;:Lexpo/modules/kotlin/types/Enumerable;>(TT;Lw7/a;)V */
    public final void OnStartObserving(Enum r22, InterfaceC3487a body) {
        AbstractC2855l.g(r22, "enum");
        AbstractC2855l.g(body, "body");
        OnStartObserving(EnumExtensionsKt.convertToString(r22), body);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Enum<TT;>;:Lexpo/modules/kotlin/types/Enumerable;>(TT;Lw7/a;)V */
    public final void OnStopObserving(Enum r22, InterfaceC3487a body) {
        AbstractC2855l.g(r22, "enum");
        AbstractC2855l.g(body, "body");
        OnStopObserving(EnumExtensionsKt.convertToString(r22), body);
    }

    public final void OnStartObserving(InterfaceC3487a body) {
        AbstractC2855l.g(body, "body");
        this.eventObservers.add(new EventObservingDefinition(EventObservingDefinition.Type.StartObserving, EventObservingDefinition.AllEventsFilter.INSTANCE, body));
    }

    public final void OnStopObserving(InterfaceC3487a body) {
        AbstractC2855l.g(body, "body");
        this.eventObservers.add(new EventObservingDefinition(EventObservingDefinition.Type.StopObserving, EventObservingDefinition.AllEventsFilter.INSTANCE, body));
    }

    public final /* synthetic */ <R, P0> SyncFunctionComponent Function(String name, final Function1 body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$3 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$3 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$3
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$3), converters);
        }
        AnyType[] anyTypeArr = {anyType};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<C7.d, ReturnType> types = returnTypeProvider.getTypes();
        AbstractC2855l.m(4, "R");
        ReturnType returnType = types.get(D.b(Object.class));
        if (returnType == null) {
            AbstractC2855l.m(4, "R");
            returnType = new ReturnType(D.b(Object.class));
            Map<C7.d, ReturnType> types2 = returnTypeProvider.getTypes();
            AbstractC2855l.m(4, "R");
            types2.put(D.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.Function.6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.invoke(objArr[0]);
            }
        });
        getSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public /* synthetic */ ObjectDefinitionBuilder(TypeConverterProvider typeConverterProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : typeConverterProvider);
    }

    public final /* synthetic */ <R, P0> AsyncFunctionComponent AsyncFunction(String name, final Function1 body) {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        AsyncFunctionComponent asyncFunctionWithPromiseComponent;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        AbstractC2855l.m(4, "P0");
        if (AbstractC2855l.b(Object.class, Promise.class)) {
            AbstractC2855l.l();
            asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[0], new Function2() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.5
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
            C7.d dVarB = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
            if (anyType == null) {
                AbstractC2855l.l();
                ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$1 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$1 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        AbstractC2855l.m(6, "P0");
                        return null;
                    }
                };
                AbstractC2855l.m(4, "P0");
                C7.d dVarB2 = D.b(Object.class);
                AbstractC2855l.m(3, "P0");
                anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$1), converters);
            }
            AnyType[] anyTypeArr = {anyType};
            AbstractC2855l.l();
            Function1 function1 = new Function1() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.6
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
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1> AsyncFunctionComponent AsyncFunctionWithPromise(String name, final w7.o body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$11 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$11 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$11
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$11), converters);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$12 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$12 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$12
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$12), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2}, new Function2() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.14
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
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public static /* synthetic */ void getAsyncFunctions$annotations() {
    }

    public static /* synthetic */ void getConstants$annotations() {
    }

    public static /* synthetic */ void getConverters$annotations() {
    }

    public static /* synthetic */ void getEventsDefinition$annotations() {
    }

    public static /* synthetic */ void getProperties$annotations() {
    }

    public static /* synthetic */ void getSyncFunctionBuilder$annotations() {
    }

    public static /* synthetic */ void getSyncFunctions$annotations() {
    }

    public final /* synthetic */ <R, P0, P1> SyncFunctionComponent Function(String name, final Function2 body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$1 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$1 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$1
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$1), converters);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$2 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$2 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$2
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$2), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<C7.d, ReturnType> types = returnTypeProvider.getTypes();
        AbstractC2855l.m(4, "R");
        ReturnType returnType = types.get(D.b(Object.class));
        if (returnType == null) {
            AbstractC2855l.m(4, "R");
            returnType = new ReturnType(D.b(Object.class));
            Map<C7.d, ReturnType> types2 = returnTypeProvider.getTypes();
            AbstractC2855l.m(4, "R");
            types2.put(D.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.Function.8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1]);
            }
        });
        getSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2> AsyncFunctionComponent AsyncFunctionWithPromise(String name, final p body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$2 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$2 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$2
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$2), converters);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$3 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$3 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$3
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$3), converters);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$4 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$4 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$4
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$4), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3}, new Function2() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.18
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
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1> AsyncFunctionComponent AsyncFunction(String name, final Function2 body) {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$5 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$5 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$5
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$5), converters);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$6 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$6 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$6
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$6), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.8
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
        getAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2> SyncFunctionComponent Function(String name, final w7.o body) {
        int i10;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$4 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$4 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$4
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$4), converters);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$5 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$5 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$5
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$5), converters);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$6 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$6 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$6
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            i10 = 4;
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$6), converters);
        } else {
            i10 = 4;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<C7.d, ReturnType> types = returnTypeProvider.getTypes();
        AbstractC2855l.m(i10, "R");
        ReturnType returnType = types.get(D.b(Object.class));
        if (returnType == null) {
            AbstractC2855l.m(i10, "R");
            returnType = new ReturnType(D.b(Object.class));
            Map<C7.d, ReturnType> types2 = returnTypeProvider.getTypes();
            AbstractC2855l.m(i10, "R");
            types2.put(D.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.Function.10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2]);
            }
        });
        getSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3> AsyncFunctionComponent AsyncFunctionWithPromise(String name, final q body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AbstractC2855l.m(4, "P3");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$22 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$22 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$22
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$22), converters);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$23 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$23 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$23
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$23), converters);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$24 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$24 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$24
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$24), converters);
        }
        AbstractC2855l.m(4, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$25 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$25 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$25
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$25), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4}, new Function2() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.22
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
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2> AsyncFunctionComponent AsyncFunction(String name, final w7.o body) {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$8 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$8 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$8
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$8), converters);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$9 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$9 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$9
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$9), converters);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$10 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$10 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$10
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$10), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.12
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
        getAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3> SyncFunctionComponent Function(String name, final p body) {
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
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$7 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$7 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$7
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$7), converters);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$8 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$8 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$8
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$8), converters);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$9 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$9 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$9
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$9), converters);
        }
        AbstractC2855l.m(4, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$10 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$10 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$10
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            i10 = 4;
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$10), converters);
        } else {
            i10 = 4;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<C7.d, ReturnType> types = returnTypeProvider.getTypes();
        AbstractC2855l.m(i10, "R");
        ReturnType returnType = types.get(D.b(Object.class));
        if (returnType == null) {
            AbstractC2855l.m(i10, "R");
            returnType = new ReturnType(D.b(Object.class));
            Map<C7.d, ReturnType> types2 = returnTypeProvider.getTypes();
            AbstractC2855l.m(i10, "R");
            types2.put(D.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.Function.12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.e(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
        });
        getSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> AsyncFunctionComponent AsyncFunctionWithPromise(String name, final r body) {
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
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$32 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$32 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$32
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            anyTypeProvider = anyTypeProvider2;
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$32), converters);
        } else {
            anyTypeProvider = anyTypeProvider2;
            i10 = 3;
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(i10, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$33 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$33 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$33
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            i11 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$33), converters);
        } else {
            i11 = 3;
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(i11, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$34 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$34 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$34
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            i12 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$34), converters);
        } else {
            i12 = 3;
        }
        AbstractC2855l.m(4, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(i12, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$35 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$35 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$35
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            i13 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$35), converters);
        } else {
            i13 = 3;
        }
        AbstractC2855l.m(4, "P4");
        C7.d dVarB9 = D.b(Object.class);
        AbstractC2855l.m(i13, "P4");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType5 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$36 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$36 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$36
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(Object.class);
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$36), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5}, new Function2() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.26
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
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3> AsyncFunctionComponent AsyncFunction(String name, final p body) {
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
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$13 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$13 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$13
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$13), converters);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$14 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$14 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$14
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$14), converters);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$15 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$15 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$15
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$15), converters);
        }
        AbstractC2855l.m(4, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$16 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$16 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$16
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$16), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.16
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
        getAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> SyncFunctionComponent Function(String name, final q body) {
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
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$11 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$11 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$11
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            anyTypeProvider = anyTypeProvider2;
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$11), converters);
        } else {
            anyTypeProvider = anyTypeProvider2;
            i10 = 3;
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(i10, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$12 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$12 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$12
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            i11 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$12), converters);
        } else {
            i11 = 3;
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(i11, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$13 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$13 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$13
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            i12 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$13), converters);
        } else {
            i12 = 3;
        }
        AbstractC2855l.m(4, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(i12, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$14 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$14 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$14
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            i13 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$14), converters);
        } else {
            i13 = 3;
        }
        AbstractC2855l.m(4, "P4");
        C7.d dVarB9 = D.b(Object.class);
        AbstractC2855l.m(i13, "P4");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType5 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$15 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$15 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$15
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            i14 = 4;
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(Object.class);
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$15), converters);
        } else {
            i14 = 4;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<C7.d, ReturnType> types = returnTypeProvider.getTypes();
        AbstractC2855l.m(i14, "R");
        ReturnType returnType = types.get(D.b(Object.class));
        if (returnType == null) {
            AbstractC2855l.m(i14, "R");
            returnType = new ReturnType(D.b(Object.class));
            Map<C7.d, ReturnType> types2 = returnTypeProvider.getTypes();
            AbstractC2855l.m(i14, "R");
            types2.put(D.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.Function.14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            }
        });
        getSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> AsyncFunctionComponent AsyncFunctionWithPromise(String name, final s body) {
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
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType7 = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, false));
        if (anyType7 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$44 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$44 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$44
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            anyTypeProvider = anyTypeProvider2;
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            cls = Object.class;
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$44), converters);
        } else {
            anyTypeProvider = anyTypeProvider2;
            cls = Object.class;
            i10 = 3;
            anyType = anyType7;
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(cls);
        AbstractC2855l.m(i10, "P1");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType8 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$45 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$45 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$45
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            i11 = 4;
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(cls);
            i12 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$45), converters);
        } else {
            i11 = 4;
            i12 = 3;
            anyType2 = anyType8;
        }
        AbstractC2855l.m(i11, "P2");
        C7.d dVarB5 = D.b(cls);
        AbstractC2855l.m(i12, "P2");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType9 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$46 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$46 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$46
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            i13 = 4;
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(cls);
            i14 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$46), converters);
        } else {
            i13 = 4;
            i14 = 3;
            anyType3 = anyType9;
        }
        AbstractC2855l.m(i13, "P3");
        C7.d dVarB7 = D.b(cls);
        AbstractC2855l.m(i14, "P3");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType10 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$47 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$47 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$47
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            i15 = 4;
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(cls);
            i16 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$47), converters);
        } else {
            i15 = 4;
            i16 = 3;
            anyType4 = anyType10;
        }
        AbstractC2855l.m(i15, "P4");
        C7.d dVarB9 = D.b(cls);
        AbstractC2855l.m(i16, "P4");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType11 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$48 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$48 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$48
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            i17 = 4;
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(cls);
            i18 = 3;
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$48), converters);
        } else {
            i17 = 4;
            i18 = 3;
            anyType5 = anyType11;
        }
        AbstractC2855l.m(i17, "P5");
        C7.d dVarB11 = D.b(cls);
        AbstractC2855l.m(i18, "P5");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType12 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$49 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$49 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$49
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P5");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P5");
            C7.d dVarB12 = D.b(cls);
            AbstractC2855l.m(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$49), converters);
        } else {
            anyType6 = anyType12;
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5, anyType6}, new Function2() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.30
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
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> AsyncFunctionComponent AsyncFunction(String name, final q body) {
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
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$17 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$17 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$17
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$17), converters);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$18 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$18 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$18
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$18), converters);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$19 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$19 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$19
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$19), converters);
        }
        AbstractC2855l.m(4, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$20 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$20 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$20
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$20), converters);
        }
        AbstractC2855l.m(4, "P4");
        C7.d dVarB9 = D.b(Object.class);
        AbstractC2855l.m(3, "P4");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType5 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$21 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$21 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$21
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(Object.class);
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$21), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.20
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
        getAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> SyncFunctionComponent Function(String name, final r body) {
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
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType7 = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, false));
        if (anyType7 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$16 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$16 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$16
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            anyTypeProvider = anyTypeProvider2;
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            cls = Object.class;
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$16), converters);
        } else {
            anyTypeProvider = anyTypeProvider2;
            cls = Object.class;
            i10 = 3;
            anyType = anyType7;
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(cls);
        AbstractC2855l.m(i10, "P1");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType8 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$17 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$17 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$17
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            i11 = 4;
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(cls);
            i12 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$17), converters);
        } else {
            i11 = 4;
            i12 = 3;
            anyType2 = anyType8;
        }
        AbstractC2855l.m(i11, "P2");
        C7.d dVarB5 = D.b(cls);
        AbstractC2855l.m(i12, "P2");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType9 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$18 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$18 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$18
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            i13 = 4;
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(cls);
            i14 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$18), converters);
        } else {
            i13 = 4;
            i14 = 3;
            anyType3 = anyType9;
        }
        AbstractC2855l.m(i13, "P3");
        C7.d dVarB7 = D.b(cls);
        AbstractC2855l.m(i14, "P3");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType10 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$19 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$19 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$19
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            i15 = 4;
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(cls);
            i16 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$19), converters);
        } else {
            i15 = 4;
            i16 = 3;
            anyType4 = anyType10;
        }
        AbstractC2855l.m(i15, "P4");
        C7.d dVarB9 = D.b(cls);
        AbstractC2855l.m(i16, "P4");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType11 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$20 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$20 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$20
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            i17 = 4;
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(cls);
            i18 = 3;
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$20), converters);
        } else {
            i17 = 4;
            i18 = 3;
            anyType5 = anyType11;
        }
        AbstractC2855l.m(i17, "P5");
        C7.d dVarB11 = D.b(cls);
        AbstractC2855l.m(i18, "P5");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType12 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$21 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$21 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$21
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P5");
                    return null;
                }
            };
            i19 = 4;
            AbstractC2855l.m(4, "P5");
            C7.d dVarB12 = D.b(cls);
            AbstractC2855l.m(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$21), converters);
        } else {
            i19 = 4;
            anyType6 = anyType12;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<C7.d, ReturnType> types = returnTypeProvider.getTypes();
        AbstractC2855l.m(i19, "R");
        ReturnType returnType = types.get(D.b(cls));
        if (returnType == null) {
            AbstractC2855l.m(i19, "R");
            returnType = new ReturnType(D.b(cls));
            Map<C7.d, ReturnType> types2 = returnTypeProvider.getTypes();
            AbstractC2855l.m(i19, "R");
            types2.put(D.b(cls), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.Function.16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.m(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
        });
        getSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> AsyncFunctionComponent AsyncFunctionWithPromise(String name, final t body) {
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
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType8 = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, false));
        if (anyType8 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$58 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$58 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$58
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            anyTypeProvider = anyTypeProvider2;
            cls = Object.class;
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(cls);
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$58), converters);
        } else {
            anyTypeProvider = anyTypeProvider2;
            cls = Object.class;
            i10 = 3;
            anyType = anyType8;
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(cls);
        AbstractC2855l.m(i10, "P1");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType9 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$59 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$59 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$59
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            i11 = 4;
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(cls);
            i12 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$59), converters);
        } else {
            i11 = 4;
            i12 = 3;
            anyType2 = anyType9;
        }
        AbstractC2855l.m(i11, "P2");
        C7.d dVarB5 = D.b(cls);
        AbstractC2855l.m(i12, "P2");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType10 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$60 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$60 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$60
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            i13 = 4;
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(cls);
            i14 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$60), converters);
        } else {
            i13 = 4;
            i14 = 3;
            anyType3 = anyType10;
        }
        AbstractC2855l.m(i13, "P3");
        C7.d dVarB7 = D.b(cls);
        AbstractC2855l.m(i14, "P3");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType11 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$61 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$61 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$61
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            i15 = 4;
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(cls);
            i16 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$61), converters);
        } else {
            i15 = 4;
            i16 = 3;
            anyType4 = anyType11;
        }
        AbstractC2855l.m(i15, "P4");
        C7.d dVarB9 = D.b(cls);
        AbstractC2855l.m(i16, "P4");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType12 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$62 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$62 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$62
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            i17 = 4;
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(cls);
            i18 = 3;
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$62), converters);
        } else {
            i17 = 4;
            i18 = 3;
            anyType5 = anyType12;
        }
        AbstractC2855l.m(i17, "P5");
        C7.d dVarB11 = D.b(cls);
        AbstractC2855l.m(i18, "P5");
        AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType13 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$63 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$63 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$63
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P5");
                    return null;
                }
            };
            i19 = 4;
            AbstractC2855l.m(4, "P5");
            C7.d dVarB12 = D.b(cls);
            i20 = 3;
            AbstractC2855l.m(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$63), converters);
        } else {
            i19 = 4;
            i20 = 3;
            anyType6 = anyType13;
        }
        AbstractC2855l.m(i19, "P6");
        C7.d dVarB13 = D.b(cls);
        AbstractC2855l.m(i20, "P6");
        AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType14 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$64 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$64 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$64
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P6");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P6");
            C7.d dVarB14 = D.b(cls);
            AbstractC2855l.m(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$64), converters);
        } else {
            anyType7 = anyType14;
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7}, new Function2() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.34
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
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> AsyncFunctionComponent AsyncFunction(String name, final r body) {
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
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType7 = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, false));
        if (anyType7 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$26 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$26 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$26
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            anyTypeProvider = anyTypeProvider2;
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$26), converters);
        } else {
            anyTypeProvider = anyTypeProvider2;
            i10 = 3;
            anyType = anyType7;
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(i10, "P1");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType8 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$27 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$27 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$27
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            i11 = 4;
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            i12 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$27), converters);
        } else {
            i11 = 4;
            i12 = 3;
            anyType2 = anyType8;
        }
        AbstractC2855l.m(i11, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(i12, "P2");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType9 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$28 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$28 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$28
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            i13 = 4;
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            i14 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$28), converters);
        } else {
            i13 = 4;
            i14 = 3;
            anyType3 = anyType9;
        }
        AbstractC2855l.m(i13, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(i14, "P3");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType10 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$29 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$29 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$29
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            i15 = 4;
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            i16 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$29), converters);
        } else {
            i15 = 4;
            i16 = 3;
            anyType4 = anyType10;
        }
        AbstractC2855l.m(i15, "P4");
        C7.d dVarB9 = D.b(Object.class);
        AbstractC2855l.m(i16, "P4");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType11 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$30 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$30 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$30
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            i17 = 4;
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(Object.class);
            i18 = 3;
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$30), converters);
        } else {
            i17 = 4;
            i18 = 3;
            anyType5 = anyType11;
        }
        AbstractC2855l.m(i17, "P5");
        C7.d dVarB11 = D.b(Object.class);
        AbstractC2855l.m(i18, "P5");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType12 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$31 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$31 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$31
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P5");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P5");
            C7.d dVarB12 = D.b(Object.class);
            i19 = 3;
            AbstractC2855l.m(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$31), converters);
        } else {
            i19 = 3;
            anyType6 = anyType12;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.24
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
        getAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> SyncFunctionComponent Function(String name, final s body) {
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
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType8 = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, false));
        if (anyType8 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$22 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$22 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$22
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            anyTypeProvider = anyTypeProvider2;
            cls = Object.class;
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(cls);
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$22), converters);
        } else {
            anyTypeProvider = anyTypeProvider2;
            cls = Object.class;
            i10 = 3;
            anyType = anyType8;
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(cls);
        AbstractC2855l.m(i10, "P1");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType9 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$23 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$23 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$23
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            i11 = 4;
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(cls);
            i12 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$23), converters);
        } else {
            i11 = 4;
            i12 = 3;
            anyType2 = anyType9;
        }
        AbstractC2855l.m(i11, "P2");
        C7.d dVarB5 = D.b(cls);
        AbstractC2855l.m(i12, "P2");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType10 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$24 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$24 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$24
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            i13 = 4;
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(cls);
            i14 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$24), converters);
        } else {
            i13 = 4;
            i14 = 3;
            anyType3 = anyType10;
        }
        AbstractC2855l.m(i13, "P3");
        C7.d dVarB7 = D.b(cls);
        AbstractC2855l.m(i14, "P3");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType11 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$25 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$25 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$25
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            i15 = 4;
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(cls);
            i16 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$25), converters);
        } else {
            i15 = 4;
            i16 = 3;
            anyType4 = anyType11;
        }
        AbstractC2855l.m(i15, "P4");
        C7.d dVarB9 = D.b(cls);
        AbstractC2855l.m(i16, "P4");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType12 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$26 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$26 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$26
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            i17 = 4;
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(cls);
            i18 = 3;
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$26), converters);
        } else {
            i17 = 4;
            i18 = 3;
            anyType5 = anyType12;
        }
        AbstractC2855l.m(i17, "P5");
        C7.d dVarB11 = D.b(cls);
        AbstractC2855l.m(i18, "P5");
        AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType13 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$27 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$27 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$27
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P5");
                    return null;
                }
            };
            i19 = 4;
            AbstractC2855l.m(4, "P5");
            C7.d dVarB12 = D.b(cls);
            i20 = 3;
            AbstractC2855l.m(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$27), converters);
        } else {
            i19 = 4;
            i20 = 3;
            anyType6 = anyType13;
        }
        AbstractC2855l.m(i19, "P6");
        C7.d dVarB13 = D.b(cls);
        AbstractC2855l.m(i20, "P6");
        AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType14 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$28 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$28 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$28
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P6");
                    return null;
                }
            };
            i21 = 4;
            AbstractC2855l.m(4, "P6");
            C7.d dVarB14 = D.b(cls);
            AbstractC2855l.m(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$28), converters);
        } else {
            i21 = 4;
            anyType7 = anyType14;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<C7.d, ReturnType> types = returnTypeProvider.getTypes();
        AbstractC2855l.m(i21, "R");
        ReturnType returnType = types.get(D.b(cls));
        if (returnType == null) {
            AbstractC2855l.m(i21, "R");
            returnType = new ReturnType(D.b(cls));
            Map<C7.d, ReturnType> types2 = returnTypeProvider.getTypes();
            AbstractC2855l.m(i21, "R");
            types2.put(D.b(cls), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.Function.18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.s(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
            }
        });
        getSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> AsyncFunctionComponent AsyncFunction(String name, final s body) {
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
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType8 = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, false));
        if (anyType8 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$37 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$37 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$37
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            anyTypeProvider = anyTypeProvider2;
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$37), converters);
        } else {
            anyTypeProvider = anyTypeProvider2;
            i10 = 3;
            anyType = anyType8;
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(i10, "P1");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType9 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$38 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$38 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$38
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            i11 = 4;
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            i12 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$38), converters);
        } else {
            i11 = 4;
            i12 = 3;
            anyType2 = anyType9;
        }
        AbstractC2855l.m(i11, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(i12, "P2");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType10 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$39 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$39 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$39
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            i13 = 4;
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            i14 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$39), converters);
        } else {
            i13 = 4;
            i14 = 3;
            anyType3 = anyType10;
        }
        AbstractC2855l.m(i13, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(i14, "P3");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType11 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$40 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$40 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$40
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            i15 = 4;
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            i16 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$40), converters);
        } else {
            i15 = 4;
            i16 = 3;
            anyType4 = anyType11;
        }
        AbstractC2855l.m(i15, "P4");
        C7.d dVarB9 = D.b(Object.class);
        AbstractC2855l.m(i16, "P4");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType12 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$41 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$41 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$41
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            i17 = 4;
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(Object.class);
            i18 = 3;
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$41), converters);
        } else {
            i17 = 4;
            i18 = 3;
            anyType5 = anyType12;
        }
        AbstractC2855l.m(i17, "P5");
        C7.d dVarB11 = D.b(Object.class);
        AbstractC2855l.m(i18, "P5");
        AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType13 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$42 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$42 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$42
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P5");
                    return null;
                }
            };
            i19 = 4;
            AbstractC2855l.m(4, "P5");
            C7.d dVarB12 = D.b(Object.class);
            i20 = 3;
            AbstractC2855l.m(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$42), converters);
        } else {
            i19 = 4;
            i20 = 3;
            anyType6 = anyType13;
        }
        AbstractC2855l.m(i19, "P6");
        C7.d dVarB13 = D.b(Object.class);
        AbstractC2855l.m(i20, "P6");
        AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType14 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$43 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$43 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$43
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P6");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P6");
            C7.d dVarB14 = D.b(Object.class);
            i21 = 3;
            AbstractC2855l.m(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$43), converters);
        } else {
            i21 = 3;
            anyType7 = anyType14;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.28
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
        getAsyncFunctions().put(str, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
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
    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6, P7> expo.modules.kotlin.functions.SyncFunctionComponent Function(java.lang.String r29, final w7.t r30) {
        /*
            Method dump skipped, instruction units count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.objects.ObjectDefinitionBuilder.Function(java.lang.String, w7.t):expo.modules.kotlin.functions.SyncFunctionComponent");
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6, P7> AsyncFunctionComponent AsyncFunction(String name, final t body) {
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
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType9 = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, false));
        if (anyType9 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$50 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$50 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$50
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            anyTypeProvider = anyTypeProvider2;
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            cls = Object.class;
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$50), converters);
        } else {
            anyTypeProvider = anyTypeProvider2;
            cls = Object.class;
            i10 = 3;
            anyType = anyType9;
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(cls);
        AbstractC2855l.m(i10, "P1");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType10 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$51 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$51 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$51
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            i11 = 4;
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(cls);
            i12 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$51), converters);
        } else {
            i11 = 4;
            i12 = 3;
            anyType2 = anyType10;
        }
        AbstractC2855l.m(i11, "P2");
        C7.d dVarB5 = D.b(cls);
        AbstractC2855l.m(i12, "P2");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType11 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$52 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$52 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$52
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            i13 = 4;
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(cls);
            i14 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$52), converters);
        } else {
            i13 = 4;
            i14 = 3;
            anyType3 = anyType11;
        }
        AbstractC2855l.m(i13, "P3");
        C7.d dVarB7 = D.b(cls);
        AbstractC2855l.m(i14, "P3");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType12 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$53 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$53 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$53
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            i15 = 4;
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(cls);
            i16 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$53), converters);
        } else {
            i15 = 4;
            i16 = 3;
            anyType4 = anyType12;
        }
        AbstractC2855l.m(i15, "P4");
        C7.d dVarB9 = D.b(cls);
        AbstractC2855l.m(i16, "P4");
        AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType13 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$54 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$54 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$54
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            i17 = 4;
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(cls);
            i18 = 3;
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$54), converters);
        } else {
            i17 = 4;
            i18 = 3;
            anyType5 = anyType13;
        }
        AbstractC2855l.m(i17, "P5");
        C7.d dVarB11 = D.b(cls);
        AbstractC2855l.m(i18, "P5");
        AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType14 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$55 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$55 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$55
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P5");
                    return null;
                }
            };
            i19 = 4;
            AbstractC2855l.m(4, "P5");
            C7.d dVarB12 = D.b(cls);
            i20 = 3;
            AbstractC2855l.m(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$55), converters);
        } else {
            i19 = 4;
            i20 = 3;
            anyType6 = anyType14;
        }
        AbstractC2855l.m(i19, "P6");
        C7.d dVarB13 = D.b(cls);
        AbstractC2855l.m(i20, "P6");
        AnyType anyType15 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType15 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$56 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$56 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$56
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P6");
                    return null;
                }
            };
            i21 = 4;
            AbstractC2855l.m(4, "P6");
            C7.d dVarB14 = D.b(cls);
            i22 = 3;
            AbstractC2855l.m(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$56), converters);
        } else {
            i21 = 4;
            i22 = 3;
            anyType7 = anyType15;
        }
        AbstractC2855l.m(i21, "P7");
        C7.d dVarB15 = D.b(cls);
        AbstractC2855l.m(i22, "P7");
        AnyType anyType16 = anyTypeProvider.getTypesMap().get(new Pair(dVarB15, false));
        if (anyType16 == null) {
            AbstractC2855l.l();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$57 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$57 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$57
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P7");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P7");
            C7.d dVarB16 = D.b(cls);
            i23 = 3;
            AbstractC2855l.m(3, "P7");
            anyType8 = new AnyType(new LazyKType(dVarB16, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$57), converters);
        } else {
            i23 = 3;
            anyType8 = anyType16;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7, anyType8};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.32
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
        getAsyncFunctions().put(str, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final AsyncFunctionBuilder AsyncFunction(String name) {
        AbstractC2855l.g(name, "name");
        AsyncFunctionBuilder asyncFunctionBuilder = new AsyncFunctionBuilder(name, this.converters);
        this.asyncFunctionBuilders.put(name, asyncFunctionBuilder);
        return asyncFunctionBuilder;
    }
}
