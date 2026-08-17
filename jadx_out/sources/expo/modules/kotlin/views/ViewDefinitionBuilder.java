package expo.modules.kotlin.views;

import C7.o;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.defaultmodules.JSLoggerModule;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.functions.AsyncFunctionBuilder;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BaseAsyncFunctionComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.Queues;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.DefinitionMarker;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import i7.C2735B;
import j7.AbstractC2800q;
import j7.K;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v7.AbstractC3430a;
import w7.InterfaceC3487a;
import w7.p;
import w7.q;
import w7.r;
import w7.s;
import w7.t;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010!\u001a\u00020\u001c2\u0014\b\u0004\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001c0\u001fH\u0086\bø\u0001\u0000¢\u0006\u0004\b!\u0010\"J5\u0010!\u001a\u00020\u001c\"\n\b\u0001\u0010#\u0018\u0001*\u00028\u00002\u0014\b\b\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u001c0\u001fH\u0087\bø\u0001\u0000¢\u0006\u0004\b$\u0010\"J)\u0010%\u001a\u00020\u001c2\u0014\b\u0004\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001c0\u001fH\u0086\bø\u0001\u0000¢\u0006\u0004\b%\u0010\"J5\u0010%\u001a\u00020\u001c\"\n\b\u0001\u0010#\u0018\u0001*\u00028\u00002\u0014\b\b\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u001c0\u001fH\u0087\bø\u0001\u0000¢\u0006\u0004\b&\u0010\"J?\u0010)\u001a\u00020\u001c\"\u0006\b\u0001\u0010'\u0018\u00012\u0006\u0010(\u001a\u00020\u001a2\u001a\b\b\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u001c0\fH\u0086\bø\u0001\u0000¢\u0006\u0004\b)\u0010*JK\u0010)\u001a\u00020\u001c\"\n\b\u0001\u0010#\u0018\u0001*\u00020\u0001\"\u0006\b\u0002\u0010'\u0018\u00012\u0006\u0010(\u001a\u00020\u001a2\u001a\b\b\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u001c0\fH\u0087\bø\u0001\u0000¢\u0006\u0004\b+\u0010*JS\u0010)\u001a\u00020\u001c\"\n\b\u0001\u0010#\u0018\u0001*\u00020\u0001\"\u0006\b\u0002\u0010'\u0018\u00012\u0006\u0010(\u001a\u00020\u001a2\u0006\u0010,\u001a\u00028\u00022\u001a\b\b\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u001c0\fH\u0087\bø\u0001\u0000¢\u0006\u0004\b+\u0010-J}\u00103\u001a\u00020\u001c\"\n\b\u0001\u0010#\u0018\u0001*\u00020\u0001\"\u0006\b\u0002\u0010'\u0018\u0001\"\u0006\b\u0003\u0010.\u0018\u00012*\u00101\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00028\u0003000/\"\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00028\u0003002 \b\b\u0010 \u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u001c02H\u0086\bø\u0001\u0000¢\u0006\u0004\b3\u00104J]\u00103\u001a\u00020\u001c\"\n\b\u0001\u0010#\u0018\u0001*\u00020\u0001\"\u0006\b\u0002\u0010'\u0018\u00012\u0012\u00101\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0/\"\u00020\u001a2 \b\b\u0010 \u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u001c02H\u0086\bø\u0001\u0000¢\u0006\u0004\b3\u00106J!\u00108\u001a\u00020\u001c2\u0012\u00107\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0/\"\u00020\u001a¢\u0006\u0004\b8\u00109J\u001d\u00108\u001a\u00020\u001c2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001a0/H\u0007¢\u0006\u0004\b:\u00109J9\u0010>\u001a\u00020\u001c\"\n\b\u0001\u0010<\u0018\u0001*\u00020;2\u0018\u0010 \u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010=\u0012\u0004\u0012\u00020\u001c0\u001fH\u0086\bø\u0001\u0000¢\u0006\u0004\b>\u0010\"J-\u0010C\u001a\u00020@2\u0006\u0010(\u001a\u00020\u001a2\u0010\b\u0004\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030?H\u0087\bø\u0001\u0000¢\u0006\u0004\bA\u0010BJ3\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u00012\u0006\u0010(\u001a\u00020\u001a2\u000e\b\u0004\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010?H\u0086\bø\u0001\u0000¢\u0006\u0004\bC\u0010BJA\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u0001\"\u0006\b\u0002\u0010E\u0018\u00012\u0006\u0010(\u001a\u00020\u001a2\u0014\b\u0004\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00010\u001fH\u0086\bø\u0001\u0000¢\u0006\u0004\bC\u0010FJO\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u0001\"\u0006\b\u0002\u0010E\u0018\u0001\"\u0006\b\u0003\u0010G\u0018\u00012\u0006\u0010(\u001a\u00020\u001a2\u001a\b\u0004\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00010\fH\u0086\bø\u0001\u0000¢\u0006\u0004\bC\u0010HJG\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u0001\"\u0006\b\u0002\u0010E\u0018\u00012\u0006\u0010(\u001a\u00020\u001a2\u001a\b\u0004\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00028\u00010\fH\u0087\bø\u0001\u0000¢\u0006\u0004\bJ\u0010HJ]\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u0001\"\u0006\b\u0002\u0010E\u0018\u0001\"\u0006\b\u0003\u0010G\u0018\u0001\"\u0006\b\u0004\u0010K\u0018\u00012\u0006\u0010(\u001a\u00020\u001a2 \b\u0004\u0010 \u001a\u001a\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u000102H\u0086\bø\u0001\u0000¢\u0006\u0004\bC\u0010LJU\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u0001\"\u0006\b\u0002\u0010E\u0018\u0001\"\u0006\b\u0003\u0010G\u0018\u00012\u0006\u0010(\u001a\u00020\u001a2 \b\u0004\u0010 \u001a\u001a\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00028\u000102H\u0087\bø\u0001\u0000¢\u0006\u0004\bJ\u0010LJk\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u0001\"\u0006\b\u0002\u0010E\u0018\u0001\"\u0006\b\u0003\u0010G\u0018\u0001\"\u0006\b\u0004\u0010K\u0018\u0001\"\u0006\b\u0005\u0010M\u0018\u00012\u0006\u0010(\u001a\u00020\u001a2&\b\u0004\u0010 \u001a \u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00010NH\u0086\bø\u0001\u0000¢\u0006\u0004\bC\u0010OJc\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u0001\"\u0006\b\u0002\u0010E\u0018\u0001\"\u0006\b\u0003\u0010G\u0018\u0001\"\u0006\b\u0004\u0010K\u0018\u00012\u0006\u0010(\u001a\u00020\u001a2&\b\u0004\u0010 \u001a \u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00028\u00010NH\u0087\bø\u0001\u0000¢\u0006\u0004\bJ\u0010OJy\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u0001\"\u0006\b\u0002\u0010E\u0018\u0001\"\u0006\b\u0003\u0010G\u0018\u0001\"\u0006\b\u0004\u0010K\u0018\u0001\"\u0006\b\u0005\u0010M\u0018\u0001\"\u0006\b\u0006\u0010P\u0018\u00012\u0006\u0010(\u001a\u00020\u001a2,\b\u0004\u0010 \u001a&\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00010QH\u0086\bø\u0001\u0000¢\u0006\u0004\bC\u0010RJq\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u0001\"\u0006\b\u0002\u0010E\u0018\u0001\"\u0006\b\u0003\u0010G\u0018\u0001\"\u0006\b\u0004\u0010K\u0018\u0001\"\u0006\b\u0005\u0010M\u0018\u00012\u0006\u0010(\u001a\u00020\u001a2,\b\u0004\u0010 \u001a&\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00028\u00010QH\u0087\bø\u0001\u0000¢\u0006\u0004\bJ\u0010RJ\u0087\u0001\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u0001\"\u0006\b\u0002\u0010E\u0018\u0001\"\u0006\b\u0003\u0010G\u0018\u0001\"\u0006\b\u0004\u0010K\u0018\u0001\"\u0006\b\u0005\u0010M\u0018\u0001\"\u0006\b\u0006\u0010P\u0018\u0001\"\u0006\b\u0007\u0010S\u0018\u00012\u0006\u0010(\u001a\u00020\u001a22\b\u0004\u0010 \u001a,\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u00010TH\u0086\bø\u0001\u0000¢\u0006\u0004\bC\u0010UJ\u007f\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u0001\"\u0006\b\u0002\u0010E\u0018\u0001\"\u0006\b\u0003\u0010G\u0018\u0001\"\u0006\b\u0004\u0010K\u0018\u0001\"\u0006\b\u0005\u0010M\u0018\u0001\"\u0006\b\u0006\u0010P\u0018\u00012\u0006\u0010(\u001a\u00020\u001a22\b\u0004\u0010 \u001a,\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00028\u00010TH\u0087\bø\u0001\u0000¢\u0006\u0004\bJ\u0010UJ\u0095\u0001\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u0001\"\u0006\b\u0002\u0010E\u0018\u0001\"\u0006\b\u0003\u0010G\u0018\u0001\"\u0006\b\u0004\u0010K\u0018\u0001\"\u0006\b\u0005\u0010M\u0018\u0001\"\u0006\b\u0006\u0010P\u0018\u0001\"\u0006\b\u0007\u0010S\u0018\u0001\"\u0006\b\b\u0010V\u0018\u00012\u0006\u0010(\u001a\u00020\u001a28\b\u0004\u0010 \u001a2\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\u00010WH\u0086\bø\u0001\u0000¢\u0006\u0004\bC\u0010XJ\u008d\u0001\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u0001\"\u0006\b\u0002\u0010E\u0018\u0001\"\u0006\b\u0003\u0010G\u0018\u0001\"\u0006\b\u0004\u0010K\u0018\u0001\"\u0006\b\u0005\u0010M\u0018\u0001\"\u0006\b\u0006\u0010P\u0018\u0001\"\u0006\b\u0007\u0010S\u0018\u00012\u0006\u0010(\u001a\u00020\u001a28\b\u0004\u0010 \u001a2\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00028\u00010WH\u0087\bø\u0001\u0000¢\u0006\u0004\bJ\u0010XJ£\u0001\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u0001\"\u0006\b\u0002\u0010E\u0018\u0001\"\u0006\b\u0003\u0010G\u0018\u0001\"\u0006\b\u0004\u0010K\u0018\u0001\"\u0006\b\u0005\u0010M\u0018\u0001\"\u0006\b\u0006\u0010P\u0018\u0001\"\u0006\b\u0007\u0010S\u0018\u0001\"\u0006\b\b\u0010V\u0018\u0001\"\u0006\b\t\u0010Y\u0018\u00012\u0006\u0010(\u001a\u00020\u001a2>\b\u0004\u0010 \u001a8\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\u00010ZH\u0086\bø\u0001\u0000¢\u0006\u0004\bC\u0010[J\u009b\u0001\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u0001\"\u0006\b\u0002\u0010E\u0018\u0001\"\u0006\b\u0003\u0010G\u0018\u0001\"\u0006\b\u0004\u0010K\u0018\u0001\"\u0006\b\u0005\u0010M\u0018\u0001\"\u0006\b\u0006\u0010P\u0018\u0001\"\u0006\b\u0007\u0010S\u0018\u0001\"\u0006\b\b\u0010V\u0018\u00012\u0006\u0010(\u001a\u00020\u001a2>\b\u0004\u0010 \u001a8\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00028\u00010ZH\u0087\bø\u0001\u0000¢\u0006\u0004\bJ\u0010[J\u0015\u0010C\u001a\u00020\\2\u0006\u0010(\u001a\u00020\u001a¢\u0006\u0004\bC\u0010]R&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010^\u0012\u0004\ba\u0010b\u001a\u0004\b_\u0010`R \u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010c\u0012\u0004\bf\u0010b\u001a\u0004\bd\u0010eR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\t\u0010g\u0012\u0004\bj\u0010b\u001a\u0004\bh\u0010iR(\u0010(\u001a\u00020\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b(\u0010k\u0012\u0004\bo\u0010b\u001a\u0004\bl\u0010m\"\u0004\bn\u0010\u001eR4\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020q0p8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b1\u0010r\u0012\u0004\bw\u0010b\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR6\u0010x\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001f8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bx\u0010y\u0012\u0004\b}\u0010b\u001a\u0004\bz\u0010{\"\u0004\b|\u0010\"R8\u0010~\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001f8\u0000@\u0000X\u0081\u000e¢\u0006\u001a\n\u0004\b~\u0010y\u0012\u0005\b\u0081\u0001\u0010b\u001a\u0004\b\u007f\u0010{\"\u0005\b\u0080\u0001\u0010\"R3\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u0012\u0005\b\u0089\u0001\u0010b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001c\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R9\u0010\u008d\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020@0p8\u0000@\u0000X\u0081\u000e¢\u0006\u001c\n\u0005\b\u008d\u0001\u0010r\u0012\u0005\b\u0090\u0001\u0010b\u001a\u0005\b\u008e\u0001\u0010t\"\u0005\b\u008f\u0001\u0010vR$\u0010\u0091\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\\0p8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0092\u0001"}, d2 = {"Lexpo/modules/kotlin/views/ViewDefinitionBuilder;", "Landroid/view/View;", "T", PointerEventHelper.POINTER_TYPE_UNKNOWN, "LC7/d;", "viewClass", "LC7/o;", "viewType", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converters", "<init>", "(LC7/d;LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V", "Lkotlin/Function2;", "Landroid/content/Context;", "Lexpo/modules/kotlin/AppContext;", "createViewFactory", "()Lkotlin/jvm/functions/Function2;", "context", "appContext", PointerEventHelper.POINTER_TYPE_UNKNOWN, "error", "handleFailureDuringViewCreation", "(Landroid/content/Context;Lexpo/modules/kotlin/AppContext;Ljava/lang/Throwable;)Landroid/view/View;", "Lexpo/modules/kotlin/views/ViewManagerDefinition;", "build", "()Lexpo/modules/kotlin/views/ViewManagerDefinition;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "viewName", "Li7/B;", "Name", "(Ljava/lang/String;)V", "Lkotlin/Function1;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "OnViewDestroys", "(Lkotlin/jvm/functions/Function1;)V", "ViewType", "OnViewDestroysGeneric", "OnViewDidUpdateProps", "OnViewDidUpdatePropsGeneric", "PropType", "name", "Prop", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "PropGeneric", "defaultValue", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "CustomValueType", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lkotlin/Pair;", "props", "Lkotlin/Function3;", "PropGroup", "([Lkotlin/Pair;Lw7/o;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "([Ljava/lang/String;Lw7/o;)V", "callbacks", "Events", "([Ljava/lang/String;)V", "EventsWithArray", "Landroid/view/ViewGroup;", "ParentType", "Lexpo/modules/kotlin/views/ViewGroupDefinitionBuilder;", "GroupView", "Lkotlin/Function0;", "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "AsyncFunctionWithoutArgs", "(Ljava/lang/String;Lw7/a;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "AsyncFunction", "R", "P0", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "P1", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "Lexpo/modules/kotlin/Promise;", "AsyncFunctionWithPromise", "P2", "(Ljava/lang/String;Lw7/o;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "P3", "Lkotlin/Function4;", "(Ljava/lang/String;Lw7/p;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "P4", "Lkotlin/Function5;", "(Ljava/lang/String;Lw7/q;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "P5", "Lkotlin/Function6;", "(Ljava/lang/String;Lw7/r;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "P6", "Lkotlin/Function7;", "(Ljava/lang/String;Lw7/s;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "P7", "Lkotlin/Function8;", "(Ljava/lang/String;Lw7/t;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;", "(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;", "LC7/d;", "getViewClass", "()LC7/d;", "getViewClass$annotations", "()V", "LC7/o;", "getViewType", "()LC7/o;", "getViewType$annotations", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "getConverters", "()Lexpo/modules/kotlin/types/TypeConverterProvider;", "getConverters$annotations", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "getName$annotations", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/views/AnyViewProp;", "Ljava/util/Map;", "getProps", "()Ljava/util/Map;", "setProps", "(Ljava/util/Map;)V", "getProps$annotations", "onViewDestroys", "Lkotlin/jvm/functions/Function1;", "getOnViewDestroys", "()Lkotlin/jvm/functions/Function1;", "setOnViewDestroys", "getOnViewDestroys$annotations", "onViewDidUpdateProps", "getOnViewDidUpdateProps", "setOnViewDidUpdateProps", "getOnViewDidUpdateProps$annotations", "Lexpo/modules/kotlin/views/ViewGroupDefinition;", "viewGroupDefinition", "Lexpo/modules/kotlin/views/ViewGroupDefinition;", "getViewGroupDefinition", "()Lexpo/modules/kotlin/views/ViewGroupDefinition;", "setViewGroupDefinition", "(Lexpo/modules/kotlin/views/ViewGroupDefinition;)V", "getViewGroupDefinition$annotations", "Lexpo/modules/kotlin/views/CallbacksDefinition;", "callbacksDefinition", "Lexpo/modules/kotlin/views/CallbacksDefinition;", "asyncFunctions", "getAsyncFunctions", "setAsyncFunctions", "getAsyncFunctions$annotations", "functionBuilders", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@DefinitionMarker
public final class ViewDefinitionBuilder<T extends View> {
    private Map<String, AsyncFunctionComponent> asyncFunctions;
    private CallbacksDefinition callbacksDefinition;
    private final TypeConverterProvider converters;
    private Map<String, AsyncFunctionBuilder> functionBuilders;
    private String name;
    private Function1 onViewDestroys;
    private Function1 onViewDidUpdateProps;
    private Map<String, AnyViewProp> props;
    private final C7.d viewClass;
    private ViewGroupDefinition viewGroupDefinition;
    private final o viewType;

    /* JADX INFO: renamed from: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class AnonymousClass5 implements Function2 {
        final /* synthetic */ Function1 $body;

        public AnonymousClass5(Function1 function1) {
            this.$body = function1;
        }

        public final void invoke(Object[] objArr, Promise promise) {
            AbstractC2855l.g(objArr, "<unused var>");
            AbstractC2855l.g(promise, "promise");
            Function1 function1 = this.$body;
            AbstractC2855l.m(1, "P0");
            function1.invoke(promise);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Object[]) obj, (Promise) obj2);
            return C2735B.f28704a;
        }
    }

    public ViewDefinitionBuilder(C7.d viewClass, o viewType, TypeConverterProvider typeConverterProvider) {
        AbstractC2855l.g(viewClass, "viewClass");
        AbstractC2855l.g(viewType, "viewType");
        this.viewClass = viewClass;
        this.viewType = viewType;
        this.converters = typeConverterProvider;
        String strO = viewClass.o();
        if (strO == null) {
            strO = AbstractC3430a.b(viewClass).getSimpleName();
            AbstractC2855l.f(strO, "getSimpleName(...)");
        }
        this.name = strO;
        this.props = new LinkedHashMap();
        this.asyncFunctions = new LinkedHashMap();
        this.functionBuilders = new LinkedHashMap();
    }

    private final Function2 createViewFactory() {
        return new Function2() { // from class: expo.modules.kotlin.views.d
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ViewDefinitionBuilder.createViewFactory$lambda$25(this.f26643g, (Context) obj, (AppContext) obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createViewFactory$lambda$25(ViewDefinitionBuilder viewDefinitionBuilder, Context context, AppContext appContext) {
        Constructor constructor;
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(appContext, "appContext");
        Constructor constructor2 = null;
        try {
            constructor = AbstractC3430a.b(viewDefinitionBuilder.viewClass).getConstructor(Context.class, AppContext.class);
        } catch (NoSuchMethodException unused) {
            constructor = null;
        }
        if (constructor != null) {
            try {
                Object objNewInstance = constructor.newInstance(context, appContext);
                AbstractC2855l.d(objNewInstance);
                return (View) objNewInstance;
            } catch (Throwable th) {
                return viewDefinitionBuilder.handleFailureDuringViewCreation(context, appContext, th);
            }
        }
        try {
            constructor2 = AbstractC3430a.b(viewDefinitionBuilder.viewClass).getConstructor(Context.class);
        } catch (NoSuchMethodException unused2) {
        }
        if (constructor2 != null) {
            try {
                Object objNewInstance2 = constructor2.newInstance(context);
                AbstractC2855l.d(objNewInstance2);
                return (View) objNewInstance2;
            } catch (Throwable th2) {
                return viewDefinitionBuilder.handleFailureDuringViewCreation(context, appContext, th2);
            }
        }
        throw new IllegalStateException("Didn't find a correct constructor for " + viewDefinitionBuilder.viewClass);
    }

    private final View handleFailureDuringViewCreation(Context context, AppContext appContext, Throwable error) {
        Objects.toString(this.viewClass);
        JSLoggerModule errorManager = appContext.getErrorManager();
        if (errorManager != null) {
            CodedException unexpectedException = error instanceof CodedException ? (CodedException) error : null;
            if (unexpectedException == null) {
                unexpectedException = new UnexpectedException(error);
            }
            errorManager.reportExceptionToLogBox(unexpectedException);
        }
        return ViewGroup.class.isAssignableFrom(AbstractC3430a.b(this.viewClass)) ? new ErrorGroupView(context) : new ErrorView(context);
    }

    public final /* synthetic */ <R> AsyncFunctionComponent AsyncFunction(String name, final InterfaceC3487a body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        AnyType[] anyTypeArr = new AnyType[0];
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.3
            /* JADX WARN: Type inference failed for: r2v2, types: [R, java.lang.Object] */
            /* JADX WARN: Unknown type variable: R in type: R */
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$4 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$4 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$4
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$4), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType}, new Function2() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.10
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
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(name, new AnyType[0], new Function1() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] it) {
                AbstractC2855l.g(it, "it");
                return body.invoke();
            }
        });
        getAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final void Events(String... callbacks) {
        AbstractC2855l.g(callbacks, "callbacks");
        this.callbacksDefinition = new CallbacksDefinition(callbacks);
    }

    public final void EventsWithArray(String[] callbacks) {
        AbstractC2855l.g(callbacks, "callbacks");
        this.callbacksDefinition = new CallbacksDefinition(callbacks);
    }

    public final /* synthetic */ <ParentType extends ViewGroup> void GroupView(Function1 body) {
        AbstractC2855l.g(body, "body");
        C7.d viewClass = getViewClass();
        AbstractC2855l.m(4, "ParentType");
        AbstractC2855l.b(viewClass, D.b(ViewGroup.class));
        if (getViewGroupDefinition() != null) {
            throw new IllegalArgumentException("The viewManager definition may have exported only one groupView definition.");
        }
        ViewGroupDefinitionBuilder viewGroupDefinitionBuilder = new ViewGroupDefinitionBuilder();
        body.invoke(viewGroupDefinitionBuilder);
        setViewGroupDefinition(viewGroupDefinitionBuilder.build());
    }

    public final void Name(String viewName) {
        AbstractC2855l.g(viewName, "viewName");
        this.name = viewName;
    }

    public final void OnViewDestroys(final Function1 body) {
        AbstractC2855l.g(body, "body");
        setOnViewDestroys(new Function1() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.OnViewDestroys.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return C2735B.f28704a;
            }

            public final void invoke(View it) {
                AbstractC2855l.g(it, "it");
                body.invoke(it);
            }
        });
    }

    public final /* synthetic */ <ViewType extends T> void OnViewDestroysGeneric(final Function1 body) {
        AbstractC2855l.g(body, "body");
        AbstractC2855l.l();
        setOnViewDestroys(new Function1() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.OnViewDestroys.2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return C2735B.f28704a;
            }

            public final void invoke(View it) {
                AbstractC2855l.g(it, "it");
                Function1 function1 = body;
                AbstractC2855l.m(1, "ViewType");
                function1.invoke(it);
            }
        });
    }

    public final void OnViewDidUpdateProps(final Function1 body) {
        AbstractC2855l.g(body, "body");
        setOnViewDidUpdateProps(new Function1() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.OnViewDidUpdateProps.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return C2735B.f28704a;
            }

            public final void invoke(View it) {
                AbstractC2855l.g(it, "it");
                body.invoke(it);
            }
        });
    }

    public final /* synthetic */ <ViewType extends T> void OnViewDidUpdatePropsGeneric(final Function1 body) {
        AbstractC2855l.g(body, "body");
        AbstractC2855l.l();
        setOnViewDidUpdateProps(new Function1() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.OnViewDidUpdateProps.2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return C2735B.f28704a;
            }

            public final void invoke(View it) {
                AbstractC2855l.g(it, "it");
                Function1 function1 = body;
                AbstractC2855l.m(1, "ViewType");
                function1.invoke(it);
            }
        });
    }

    public final /* synthetic */ <PropType> void Prop(String name, Function2 body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        Map<String, AnyViewProp> props = getProps();
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "PropType");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "PropType");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ViewDefinitionBuilder$Prop$$inlined$toAnyType$default$1 viewDefinitionBuilder$Prop$$inlined$toAnyType$default$1 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$Prop$$inlined$toAnyType$default$1
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "PropType");
                    return null;
                }
            };
            AbstractC2855l.m(4, "PropType");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "PropType");
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$Prop$$inlined$toAnyType$default$1), null);
        }
        props.put(name, new ConcreteViewProp(name, anyType, body));
    }

    public final /* synthetic */ <ViewType extends View, PropType> void PropGeneric(String name, Function2 body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        Map<String, AnyViewProp> props = getProps();
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "PropType");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "PropType");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ViewDefinitionBuilder$Prop$$inlined$toAnyType$default$2 viewDefinitionBuilder$Prop$$inlined$toAnyType$default$2 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$Prop$$inlined$toAnyType$default$2
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "PropType");
                    return null;
                }
            };
            AbstractC2855l.m(4, "PropType");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "PropType");
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$Prop$$inlined$toAnyType$default$2), null);
        }
        props.put(name, new ConcreteViewProp(name, anyType, body));
    }

    public final /* synthetic */ <ViewType extends View, PropType, CustomValueType> void PropGroup(Pair<String, ? extends CustomValueType>[] props, final w7.o body) {
        AbstractC2855l.g(props, "props");
        AbstractC2855l.g(body, "body");
        for (Pair<String, ? extends CustomValueType> pair : props) {
            String str = (String) pair.getFirst();
            final Object second = pair.getSecond();
            AbstractC2855l.l();
            Function2 function2 = new Function2() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.PropGroup.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((View) obj, obj2);
                    return C2735B.f28704a;
                }

                /* JADX WARN: Incorrect types in method signature: (TViewType;TPropType;)V */
                /* JADX WARN: Unknown type variable: PropType in type: PropType */
                /* JADX WARN: Unknown type variable: ViewType in type: ViewType */
                public final void invoke(View view, Object obj) {
                    AbstractC2855l.g(view, "view");
                    body.invoke(view, second, obj);
                }
            };
            Map<String, AnyViewProp> props2 = getProps();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            AbstractC2855l.m(4, "PropType");
            C7.d dVarB = D.b(Object.class);
            AbstractC2855l.m(3, "PropType");
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
            if (anyType == null) {
                AbstractC2855l.l();
                ViewDefinitionBuilder$PropGroup$$inlined$PropGeneric$1 viewDefinitionBuilder$PropGroup$$inlined$PropGeneric$1 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$PropGroup$$inlined$PropGeneric$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        AbstractC2855l.m(6, "PropType");
                        return null;
                    }
                };
                AbstractC2855l.m(4, "PropType");
                C7.d dVarB2 = D.b(Object.class);
                AbstractC2855l.m(3, "PropType");
                anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$PropGroup$$inlined$PropGeneric$1), null);
            }
            props2.put(str, new ConcreteViewProp(str, anyType, function2));
        }
    }

    public final ViewManagerDefinition build() {
        Map<String, AsyncFunctionComponent> map = this.asyncFunctions;
        Map<String, AsyncFunctionBuilder> map2 = this.functionBuilders;
        LinkedHashMap linkedHashMap = new LinkedHashMap(K.e(map2.size()));
        Iterator<T> it = map2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((AsyncFunctionBuilder) entry.getValue()).build$expo_modules_core_release());
        }
        Map mapO = K.o(map, linkedHashMap);
        Iterator it2 = mapO.entrySet().iterator();
        while (it2.hasNext()) {
            BaseAsyncFunctionComponent baseAsyncFunctionComponent = (BaseAsyncFunctionComponent) ((Map.Entry) it2.next()).getValue();
            baseAsyncFunctionComponent.runOnQueue(Queues.MAIN);
            baseAsyncFunctionComponent.setOwnerType(this.viewType);
            baseAsyncFunctionComponent.setCanTakeOwner(true);
        }
        return new ViewManagerDefinition(createViewFactory(), AbstractC3430a.b(this.viewClass), this.props, this.name, this.onViewDestroys, this.callbacksDefinition, this.viewGroupDefinition, this.onViewDidUpdateProps, AbstractC2800q.P0(mapO.values()));
    }

    public final Map<String, AsyncFunctionComponent> getAsyncFunctions() {
        return this.asyncFunctions;
    }

    public final TypeConverterProvider getConverters() {
        return this.converters;
    }

    public final String getName() {
        return this.name;
    }

    public final Function1 getOnViewDestroys() {
        return this.onViewDestroys;
    }

    public final Function1 getOnViewDidUpdateProps() {
        return this.onViewDidUpdateProps;
    }

    public final Map<String, AnyViewProp> getProps() {
        return this.props;
    }

    public final C7.d getViewClass() {
        return this.viewClass;
    }

    public final ViewGroupDefinition getViewGroupDefinition() {
        return this.viewGroupDefinition;
    }

    public final o getViewType() {
        return this.viewType;
    }

    public final void setAsyncFunctions(Map<String, AsyncFunctionComponent> map) {
        AbstractC2855l.g(map, "<set-?>");
        this.asyncFunctions = map;
    }

    public final void setName(String str) {
        AbstractC2855l.g(str, "<set-?>");
        this.name = str;
    }

    public final void setOnViewDestroys(Function1 function1) {
        this.onViewDestroys = function1;
    }

    public final void setOnViewDidUpdateProps(Function1 function1) {
        this.onViewDidUpdateProps = function1;
    }

    public final void setProps(Map<String, AnyViewProp> map) {
        AbstractC2855l.g(map, "<set-?>");
        this.props = map;
    }

    public final void setViewGroupDefinition(ViewGroupDefinition viewGroupDefinition) {
        this.viewGroupDefinition = viewGroupDefinition;
    }

    public /* synthetic */ ViewDefinitionBuilder(C7.d dVar, o oVar, TypeConverterProvider typeConverterProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, oVar, (i10 & 4) != 0 ? null : typeConverterProvider);
    }

    public final /* synthetic */ <ViewType extends View, PropType> void PropGeneric(String name, PropType defaultValue, Function2 body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        Map<String, AnyViewProp> props = getProps();
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "PropType");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "PropType");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ViewDefinitionBuilder$Prop$$inlined$toAnyType$default$3 viewDefinitionBuilder$Prop$$inlined$toAnyType$default$3 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$Prop$$inlined$toAnyType$default$3
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "PropType");
                    return null;
                }
            };
            AbstractC2855l.m(4, "PropType");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "PropType");
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$Prop$$inlined$toAnyType$default$3), null);
        }
        props.put(name, new ConcreteViewPropWithDefault(name, anyType, body, defaultValue));
    }

    public final /* synthetic */ <ViewType extends View, PropType> void PropGroup(String[] props, final w7.o body) {
        AbstractC2855l.g(props, "props");
        AbstractC2855l.g(body, "body");
        int length = props.length;
        int i10 = 0;
        final int i11 = 0;
        while (i10 < length) {
            String str = props[i10];
            int i12 = i11 + 1;
            AbstractC2855l.l();
            Function2 function2 = new Function2() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$PropGroup$2$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((View) obj, obj2);
                    return C2735B.f28704a;
                }

                /* JADX WARN: Incorrect types in method signature: (TViewType;TPropType;)V */
                public final void invoke(View view, Object obj) {
                    AbstractC2855l.g(view, "view");
                    body.invoke(view, Integer.valueOf(i11), obj);
                }
            };
            Map<String, AnyViewProp> props2 = getProps();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            AbstractC2855l.m(4, "PropType");
            C7.d dVarB = D.b(Object.class);
            AbstractC2855l.m(3, "PropType");
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
            if (anyType == null) {
                AbstractC2855l.l();
                AbstractC2855l.l();
                ViewDefinitionBuilder$PropGroup$$inlined$forEachIndexed$lambda$1 viewDefinitionBuilder$PropGroup$$inlined$forEachIndexed$lambda$1 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$PropGroup$$inlined$forEachIndexed$lambda$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        AbstractC2855l.m(6, "PropType");
                        return null;
                    }
                };
                AbstractC2855l.m(4, "PropType");
                C7.d dVarB2 = D.b(Object.class);
                AbstractC2855l.m(3, "PropType");
                anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$PropGroup$$inlined$forEachIndexed$lambda$1), null);
            }
            props2.put(str, new ConcreteViewProp(str, anyType, function2));
            i10++;
            i11 = i12;
        }
    }

    public final /* synthetic */ <R, P0> AsyncFunctionComponent AsyncFunction(String name, final Function1 body) {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P0");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$1 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$1 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$1
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$1), null);
        }
        AnyType[] anyTypeArr = {anyType};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.6
            /* JADX WARN: Type inference failed for: r2v2, types: [R, java.lang.Object] */
            /* JADX WARN: Unknown type variable: R in type: R */
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
        getAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$8 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$8 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$8
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$8), converters);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$9 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$9 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$9
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$9), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2}, new Function2() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.14
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

    public static /* synthetic */ void getConverters$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void getOnViewDestroys$annotations() {
    }

    public static /* synthetic */ void getOnViewDidUpdateProps$annotations() {
    }

    public static /* synthetic */ void getProps$annotations() {
    }

    public static /* synthetic */ void getViewClass$annotations() {
    }

    public static /* synthetic */ void getViewGroupDefinition$annotations() {
    }

    public static /* synthetic */ void getViewType$annotations() {
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$14 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$14 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$14
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$14), converters);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$15 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$15 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$15
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$15), converters);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$16 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$16 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$16
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$16), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3}, new Function2() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.18
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$2 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$2 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$2
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$2), converters);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$3 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$3 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$3
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$3), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.8
            /* JADX WARN: Type inference failed for: r3v2, types: [R, java.lang.Object] */
            /* JADX WARN: Unknown type variable: R in type: R */
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$22 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$22 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$22
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$22), converters);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$23 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$23 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$23
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$23), converters);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$24 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$24 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$24
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$24), converters);
        }
        AbstractC2855l.m(4, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$25 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$25 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$25
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$25), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4}, new Function2() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.22
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$5 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$5 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$5
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$5), converters);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$6 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$6 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$6
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$6), converters);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$7 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$7 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$7
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$7), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.12
            /* JADX WARN: Type inference failed for: r4v2, types: [R, java.lang.Object] */
            /* JADX WARN: Unknown type variable: R in type: R */
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$32 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$32 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$32
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
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$32), converters);
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$33 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$33 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$33
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
            anyType2 = new AnyType(new LazyKType(dVarB4, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$33), converters);
        } else {
            i11 = 3;
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(i11, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$34 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$34 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$34
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
            anyType3 = new AnyType(new LazyKType(dVarB6, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$34), converters);
        } else {
            i12 = 3;
        }
        AbstractC2855l.m(4, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(i12, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$35 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$35 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$35
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
            anyType4 = new AnyType(new LazyKType(dVarB8, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$35), converters);
        } else {
            i13 = 3;
        }
        AbstractC2855l.m(4, "P4");
        C7.d dVarB9 = D.b(Object.class);
        AbstractC2855l.m(i13, "P4");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType5 == null) {
            AbstractC2855l.l();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$36 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$36 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$36
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(Object.class);
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$36), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5}, new Function2() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.26
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$10 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$10 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$10
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$10), converters);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$11 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$11 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$11
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$11), converters);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$12 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$12 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$12
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$12), converters);
        }
        AbstractC2855l.m(4, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$13 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$13 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$13
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$13), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.16
            /* JADX WARN: Type inference failed for: r5v2, types: [R, java.lang.Object] */
            /* JADX WARN: Unknown type variable: R in type: R */
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$44 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$44 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$44
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
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$44), converters);
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$45 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$45 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$45
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
            anyType2 = new AnyType(new LazyKType(dVarB4, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$45), converters);
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$46 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$46 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$46
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
            anyType3 = new AnyType(new LazyKType(dVarB6, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$46), converters);
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$47 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$47 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$47
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
            anyType4 = new AnyType(new LazyKType(dVarB8, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$47), converters);
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$48 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$48 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$48
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
            anyType5 = new AnyType(new LazyKType(dVarB10, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$48), converters);
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$49 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$49 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$49
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P5");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P5");
            C7.d dVarB12 = D.b(cls);
            AbstractC2855l.m(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$49), converters);
        } else {
            anyType6 = anyType12;
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5, anyType6}, new Function2() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.30
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$17 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$17 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$17
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$17), converters);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$18 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$18 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$18
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$18), converters);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$19 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$19 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$19
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$19), converters);
        }
        AbstractC2855l.m(4, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$20 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$20 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$20
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$20), converters);
        }
        AbstractC2855l.m(4, "P4");
        C7.d dVarB9 = D.b(Object.class);
        AbstractC2855l.m(3, "P4");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType5 == null) {
            AbstractC2855l.l();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$21 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$21 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$21
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(Object.class);
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$21), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.20
            /* JADX WARN: Type inference failed for: r8v1, types: [R, java.lang.Object] */
            /* JADX WARN: Unknown type variable: R in type: R */
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$58 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$58 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$58
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
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$58), converters);
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$59 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$59 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$59
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
            anyType2 = new AnyType(new LazyKType(dVarB4, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$59), converters);
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$60 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$60 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$60
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
            anyType3 = new AnyType(new LazyKType(dVarB6, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$60), converters);
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$61 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$61 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$61
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
            anyType4 = new AnyType(new LazyKType(dVarB8, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$61), converters);
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$62 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$62 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$62
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
            anyType5 = new AnyType(new LazyKType(dVarB10, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$62), converters);
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$63 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$63 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$63
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
            anyType6 = new AnyType(new LazyKType(dVarB12, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$63), converters);
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$64 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$64 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$64
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P6");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P6");
            C7.d dVarB14 = D.b(cls);
            AbstractC2855l.m(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$64), converters);
        } else {
            anyType7 = anyType14;
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7}, new Function2() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.34
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$26 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$26 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$26
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
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$26), converters);
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$27 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$27 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$27
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
            anyType2 = new AnyType(new LazyKType(dVarB4, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$27), converters);
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$28 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$28 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$28
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
            anyType3 = new AnyType(new LazyKType(dVarB6, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$28), converters);
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$29 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$29 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$29
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
            anyType4 = new AnyType(new LazyKType(dVarB8, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$29), converters);
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$30 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$30 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$30
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
            anyType5 = new AnyType(new LazyKType(dVarB10, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$30), converters);
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$31 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$31 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$31
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
            anyType6 = new AnyType(new LazyKType(dVarB12, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$31), converters);
        } else {
            i19 = 3;
            anyType6 = anyType12;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.24
            /* JADX WARN: Type inference failed for: r9v1, types: [R, java.lang.Object] */
            /* JADX WARN: Unknown type variable: R in type: R */
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$37 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$37 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$37
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
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$37), converters);
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$38 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$38 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$38
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
            anyType2 = new AnyType(new LazyKType(dVarB4, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$38), converters);
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$39 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$39 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$39
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
            anyType3 = new AnyType(new LazyKType(dVarB6, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$39), converters);
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$40 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$40 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$40
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
            anyType4 = new AnyType(new LazyKType(dVarB8, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$40), converters);
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$41 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$41 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$41
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
            anyType5 = new AnyType(new LazyKType(dVarB10, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$41), converters);
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$42 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$42 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$42
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
            anyType6 = new AnyType(new LazyKType(dVarB12, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$42), converters);
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$43 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$43 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$43
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
            anyType7 = new AnyType(new LazyKType(dVarB14, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$43), converters);
        } else {
            i21 = 3;
            anyType7 = anyType14;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.28
            /* JADX WARN: Type inference failed for: r10v1, types: [R, java.lang.Object] */
            /* JADX WARN: Unknown type variable: R in type: R */
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$50 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$50 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$50
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
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$50), converters);
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$51 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$51 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$51
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
            anyType2 = new AnyType(new LazyKType(dVarB4, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$51), converters);
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$52 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$52 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$52
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
            anyType3 = new AnyType(new LazyKType(dVarB6, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$52), converters);
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$53 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$53 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$53
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
            anyType4 = new AnyType(new LazyKType(dVarB8, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$53), converters);
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$54 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$54 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$54
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
            anyType5 = new AnyType(new LazyKType(dVarB10, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$54), converters);
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$55 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$55 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$55
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
            anyType6 = new AnyType(new LazyKType(dVarB12, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$55), converters);
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$56 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$56 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$56
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
            anyType7 = new AnyType(new LazyKType(dVarB14, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$56), converters);
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
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$57 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$57 = new InterfaceC3487a() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$57
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
            anyType8 = new AnyType(new LazyKType(dVarB16, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$57), converters);
        } else {
            i23 = 3;
            anyType8 = anyType16;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7, anyType8};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.32
            /* JADX WARN: Type inference failed for: r11v1, types: [R, java.lang.Object] */
            /* JADX WARN: Unknown type variable: R in type: R */
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
        this.functionBuilders.put(name, asyncFunctionBuilder);
        return asyncFunctionBuilder;
    }
}
