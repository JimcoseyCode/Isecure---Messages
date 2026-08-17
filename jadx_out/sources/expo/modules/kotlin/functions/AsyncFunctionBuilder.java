package expo.modules.kotlin.functions;

import R8.N;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.text.TextAttributeProps;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2854k;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.AbstractC3016b;
import w7.InterfaceC3487a;
import w7.o;
import w7.p;
import w7.q;
import w7.r;
import w7.s;
import w7.t;
import w7.u;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\r\u001a\u00020\f\"\u0006\b\u0000\u0010\b\u0018\u00012\u001e\b\u0004\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJI\u0010\r\u001a\u00020\u0011\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u00012$\b\u0004\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0012JW\u0010\r\u001a\u00020\u0011\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u00012*\b\u0004\u0010\u000b\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0015Je\u0010\r\u001a\u00020\u0011\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u000120\b\u0004\u0010\u000b\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017H\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0018Js\u0010\r\u001a\u00020\u0011\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u0001\"\u0006\b\u0004\u0010\u0019\u0018\u000126\b\u0004\u0010\u000b\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001aH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u001bJ\u0081\u0001\u0010\r\u001a\u00020\u0011\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u0001\"\u0006\b\u0004\u0010\u0019\u0018\u0001\"\u0006\b\u0005\u0010\u001c\u0018\u00012<\b\u0004\u0010\u000b\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u001eJ\u008f\u0001\u0010\r\u001a\u00020\u0011\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u0001\"\u0006\b\u0004\u0010\u0019\u0018\u0001\"\u0006\b\u0005\u0010\u001c\u0018\u0001\"\u0006\b\u0006\u0010\u001f\u0018\u00012B\b\u0004\u0010\u000b\u001a<\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010 H\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010!J\u009d\u0001\u0010\r\u001a\u00020\u0011\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u0001\"\u0006\b\u0004\u0010\u0019\u0018\u0001\"\u0006\b\u0005\u0010\u001c\u0018\u0001\"\u0006\b\u0006\u0010\u001f\u0018\u0001\"\u0006\b\u0007\u0010\"\u0018\u00012H\b\u0004\u0010\u000b\u001aB\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010#H\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010$J«\u0001\u0010\r\u001a\u00020\u0011\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u0001\"\u0006\b\u0004\u0010\u0019\u0018\u0001\"\u0006\b\u0005\u0010\u001c\u0018\u0001\"\u0006\b\u0006\u0010\u001f\u0018\u0001\"\u0006\b\u0007\u0010\"\u0018\u0001\"\u0006\b\b\u0010%\u0018\u00012N\b\u0004\u0010\u000b\u001aH\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010&H\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010'J%\u0010-\u001a\u00020*2\u0010\b\u0004\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010(H\u0087\bø\u0001\u0000¢\u0006\u0004\b+\u0010,J+\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u00012\u000e\b\u0004\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0086\bø\u0001\u0000¢\u0006\u0004\b-\u0010,J9\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u00012\u0014\b\u0004\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b-\u0010.JG\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u00012\u001a\b\u0004\u0010)\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b-\u0010/J?\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u00012\u001a\b\u0004\u0010)\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00028\u00000\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\b1\u0010/JU\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u00012 \b\u0004\u0010)\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b-\u00102JM\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u00012 \b\u0004\u0010)\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00028\u00000\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b1\u00102Jc\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u0001\"\u0006\b\u0004\u0010\u0019\u0018\u00012&\b\u0004\u0010)\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00000\u0017H\u0086\bø\u0001\u0000¢\u0006\u0004\b-\u00103J[\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u00012&\b\u0004\u0010)\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00028\u00000\u0017H\u0087\bø\u0001\u0000¢\u0006\u0004\b1\u00103Jq\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u0001\"\u0006\b\u0004\u0010\u0019\u0018\u0001\"\u0006\b\u0005\u0010\u001c\u0018\u00012,\b\u0004\u0010)\u001a&\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00000\u001aH\u0086\bø\u0001\u0000¢\u0006\u0004\b-\u00104Ji\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u0001\"\u0006\b\u0004\u0010\u0019\u0018\u00012,\b\u0004\u0010)\u001a&\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00028\u00000\u001aH\u0087\bø\u0001\u0000¢\u0006\u0004\b1\u00104J\u007f\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u0001\"\u0006\b\u0004\u0010\u0019\u0018\u0001\"\u0006\b\u0005\u0010\u001c\u0018\u0001\"\u0006\b\u0006\u0010\u001f\u0018\u000122\b\u0004\u0010)\u001a,\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00000\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b-\u00105Jw\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u0001\"\u0006\b\u0004\u0010\u0019\u0018\u0001\"\u0006\b\u0005\u0010\u001c\u0018\u000122\b\u0004\u0010)\u001a,\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00028\u00000\u001dH\u0087\bø\u0001\u0000¢\u0006\u0004\b1\u00105J\u008d\u0001\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u0001\"\u0006\b\u0004\u0010\u0019\u0018\u0001\"\u0006\b\u0005\u0010\u001c\u0018\u0001\"\u0006\b\u0006\u0010\u001f\u0018\u0001\"\u0006\b\u0007\u0010\"\u0018\u000128\b\u0004\u0010)\u001a2\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u00000 H\u0086\bø\u0001\u0000¢\u0006\u0004\b-\u00106J\u0085\u0001\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u0001\"\u0006\b\u0004\u0010\u0019\u0018\u0001\"\u0006\b\u0005\u0010\u001c\u0018\u0001\"\u0006\b\u0006\u0010\u001f\u0018\u000128\b\u0004\u0010)\u001a2\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00028\u00000 H\u0087\bø\u0001\u0000¢\u0006\u0004\b1\u00106J\u009b\u0001\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u0001\"\u0006\b\u0004\u0010\u0019\u0018\u0001\"\u0006\b\u0005\u0010\u001c\u0018\u0001\"\u0006\b\u0006\u0010\u001f\u0018\u0001\"\u0006\b\u0007\u0010\"\u0018\u0001\"\u0006\b\b\u0010%\u0018\u00012>\b\u0004\u0010)\u001a8\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\u00000#H\u0086\bø\u0001\u0000¢\u0006\u0004\b-\u00107J\u0093\u0001\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u0001\"\u0006\b\u0004\u0010\u0019\u0018\u0001\"\u0006\b\u0005\u0010\u001c\u0018\u0001\"\u0006\b\u0006\u0010\u001f\u0018\u0001\"\u0006\b\u0007\u0010\"\u0018\u00012>\b\u0004\u0010)\u001a8\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00028\u00000#H\u0087\bø\u0001\u0000¢\u0006\u0004\b1\u00107J\u000f\u0010:\u001a\u00020\fH\u0000¢\u0006\u0004\b8\u00109R \u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010;\u0012\u0004\b>\u0010?\u001a\u0004\b<\u0010=R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010@\u0012\u0004\bC\u0010?\u001a\u0004\bA\u0010BR*\u0010D\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bD\u0010E\u0012\u0004\bI\u0010?\u001a\u0004\bF\u00109\"\u0004\bG\u0010H\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006J"}, d2 = {"Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converters", "<init>", "(Ljava/lang/String;Lexpo/modules/kotlin/types/TypeConverterProvider;)V", "R", "Lkotlin/Function1;", "Ln7/f;", "block", "Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;", "SuspendBody", "(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;", "P0", "Lkotlin/Function2;", "Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "(Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P1", "Lkotlin/Function3;", "(Lw7/o;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P2", "Lkotlin/Function4;", "(Lw7/p;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P3", "Lkotlin/Function5;", "(Lw7/q;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P4", "Lkotlin/Function6;", "(Lw7/r;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P5", "Lkotlin/Function7;", "(Lw7/s;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P6", "Lkotlin/Function8;", "(Lw7/t;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P7", "Lkotlin/Function9;", "(Lw7/u;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "Lkotlin/Function0;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "AsyncBodyWithoutArgs", "(Lw7/a;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "AsyncBody", "(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "Lexpo/modules/kotlin/Promise;", "AsyncFunctionWithPromise", "(Lw7/o;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Lw7/p;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Lw7/q;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Lw7/r;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Lw7/s;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Lw7/t;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "build$expo_modules_core_release", "()Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;", "build", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getName$annotations", "()V", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "getConverters", "()Lexpo/modules/kotlin/types/TypeConverterProvider;", "getConverters$annotations", "asyncFunctionComponent", "Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;", "getAsyncFunctionComponent", "setAsyncFunctionComponent", "(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V", "getAsyncFunctionComponent$annotations", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AsyncFunctionBuilder {
    private BaseAsyncFunctionComponent asyncFunctionComponent;
    private final TypeConverterProvider converters;
    private final String name;

    /* JADX INFO: renamed from: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$5, reason: invalid class name */
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

    /* JADX INFO: renamed from: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$1", f = "AsyncFunctionBuilder.kt", l = {TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "it", "<anonymous>", "(LR8/N;Lkotlin/Array;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class C24901 extends l implements o {
        final /* synthetic */ Function1 $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24901(Function1 function1, n7.f fVar) {
            super(3, fVar);
            this.$block = function1;
        }

        @Override // w7.o
        public final Object invoke(N n10, Object[] objArr, n7.f fVar) {
            return new C24901(this.$block, fVar).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                return obj;
            }
            AbstractC2753p.b(obj);
            Function1 function1 = this.$block;
            this.label = 1;
            Object objInvoke = function1.invoke(this);
            return objInvoke == objE ? objE : objInvoke;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            return this.$block.invoke(this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$11, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$11", f = "AsyncFunctionBuilder.kt", l = {65}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "<destruct>", "<anonymous>", "(LR8/N;Lkotlin/Array;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass11 extends l implements o {
        final /* synthetic */ r $block;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(r rVar, n7.f fVar) {
            super(3, fVar);
            this.$block = rVar;
        }

        @Override // w7.o
        public final Object invoke(N n10, Object[] objArr, n7.f fVar) {
            AnonymousClass11 anonymousClass11 = new AnonymousClass11(this.$block, fVar);
            anonymousClass11.L$0 = objArr;
            return anonymousClass11.invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                return obj;
            }
            AbstractC2753p.b(obj);
            Object[] objArr = (Object[]) this.L$0;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            r rVar = this.$block;
            this.label = 1;
            Object objM = rVar.m(obj2, obj3, obj4, obj5, obj6, this);
            return objM == objE ? objE : objM;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            Object[] objArr = (Object[]) this.L$0;
            AbstractC2854k.c(10);
            return this.$block.m(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$13, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$13", f = "AsyncFunctionBuilder.kt", l = {74}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "<destruct>", "<anonymous>", "(LR8/N;Lkotlin/Array;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass13 extends l implements o {
        final /* synthetic */ s $block;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass13(s sVar, n7.f fVar) {
            super(3, fVar);
            this.$block = sVar;
        }

        @Override // w7.o
        public final Object invoke(N n10, Object[] objArr, n7.f fVar) {
            AnonymousClass13 anonymousClass13 = new AnonymousClass13(this.$block, fVar);
            anonymousClass13.L$0 = objArr;
            return anonymousClass13.invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                return obj;
            }
            AbstractC2753p.b(obj);
            Object[] objArr = (Object[]) this.L$0;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            Object obj7 = objArr[5];
            s sVar = this.$block;
            this.label = 1;
            Object objS = sVar.s(obj2, obj3, obj4, obj5, obj6, obj7, this);
            return objS == objE ? objE : objS;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            Object[] objArr = (Object[]) this.L$0;
            AbstractC2854k.c(10);
            return this.$block.s(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$15, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$15", f = "AsyncFunctionBuilder.kt", l = {83}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "<destruct>", "<anonymous>", "(LR8/N;Lkotlin/Array;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass15 extends l implements o {
        final /* synthetic */ t $block;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass15(t tVar, n7.f fVar) {
            super(3, fVar);
            this.$block = tVar;
        }

        @Override // w7.o
        public final Object invoke(N n10, Object[] objArr, n7.f fVar) {
            AnonymousClass15 anonymousClass15 = new AnonymousClass15(this.$block, fVar);
            anonymousClass15.L$0 = objArr;
            return anonymousClass15.invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                return obj;
            }
            AbstractC2753p.b(obj);
            Object[] objArr = (Object[]) this.L$0;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            Object obj7 = objArr[5];
            Object obj8 = objArr[6];
            t tVar = this.$block;
            this.label = 1;
            Object objI = tVar.i(obj2, obj3, obj4, obj5, obj6, obj7, obj8, this);
            return objI == objE ? objE : objI;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            Object[] objArr = (Object[]) this.L$0;
            AbstractC2854k.c(10);
            return this.$block.i(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$17, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$17", f = "AsyncFunctionBuilder.kt", l = {92}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "<destruct>", "<anonymous>", "(LR8/N;Lkotlin/Array;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass17 extends l implements o {
        final /* synthetic */ u $block;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass17(u uVar, n7.f fVar) {
            super(3, fVar);
            this.$block = uVar;
        }

        @Override // w7.o
        public final Object invoke(N n10, Object[] objArr, n7.f fVar) {
            AnonymousClass17 anonymousClass17 = new AnonymousClass17(this.$block, fVar);
            anonymousClass17.L$0 = objArr;
            return anonymousClass17.invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                return obj;
            }
            AbstractC2753p.b(obj);
            Object[] objArr = (Object[]) this.L$0;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            Object obj7 = objArr[5];
            Object obj8 = objArr[6];
            Object obj9 = objArr[7];
            u uVar = this.$block;
            this.label = 1;
            Object objP = uVar.p(obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, this);
            return objP == objE ? objE : objP;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            Object[] objArr = (Object[]) this.L$0;
            AbstractC2854k.c(10);
            return this.$block.p(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7], this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$3", f = "AsyncFunctionBuilder.kt", l = {29}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "<destruct>", "<anonymous>", "(LR8/N;Lkotlin/Array;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class C24913 extends l implements o {
        final /* synthetic */ Function2 $block;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24913(Function2 function2, n7.f fVar) {
            super(3, fVar);
            this.$block = function2;
        }

        @Override // w7.o
        public final Object invoke(N n10, Object[] objArr, n7.f fVar) {
            C24913 c24913 = new C24913(this.$block, fVar);
            c24913.L$0 = objArr;
            return c24913.invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                return obj;
            }
            AbstractC2753p.b(obj);
            Object obj2 = ((Object[]) this.L$0)[0];
            Function2 function2 = this.$block;
            this.label = 1;
            Object objInvoke = function2.invoke(obj2, this);
            return objInvoke == objE ? objE : objInvoke;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            Object[] objArr = (Object[]) this.L$0;
            AbstractC2854k.c(10);
            return this.$block.invoke(objArr[0], this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$5, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$5", f = "AsyncFunctionBuilder.kt", l = {38}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "<destruct>", "<anonymous>", "(LR8/N;Lkotlin/Array;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class C24925 extends l implements o {
        final /* synthetic */ o $block;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24925(o oVar, n7.f fVar) {
            super(3, fVar);
            this.$block = oVar;
        }

        @Override // w7.o
        public final Object invoke(N n10, Object[] objArr, n7.f fVar) {
            C24925 c24925 = new C24925(this.$block, fVar);
            c24925.L$0 = objArr;
            return c24925.invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                return obj;
            }
            AbstractC2753p.b(obj);
            Object[] objArr = (Object[]) this.L$0;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            o oVar = this.$block;
            this.label = 1;
            Object objInvoke = oVar.invoke(obj2, obj3, this);
            return objInvoke == objE ? objE : objInvoke;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            Object[] objArr = (Object[]) this.L$0;
            AbstractC2854k.c(10);
            return this.$block.invoke(objArr[0], objArr[1], this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$7", f = "AsyncFunctionBuilder.kt", l = {47}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "<destruct>", "<anonymous>", "(LR8/N;Lkotlin/Array;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass7 extends l implements o {
        final /* synthetic */ p $block;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(p pVar, n7.f fVar) {
            super(3, fVar);
            this.$block = pVar;
        }

        @Override // w7.o
        public final Object invoke(N n10, Object[] objArr, n7.f fVar) {
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(this.$block, fVar);
            anonymousClass7.L$0 = objArr;
            return anonymousClass7.invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                return obj;
            }
            AbstractC2753p.b(obj);
            Object[] objArr = (Object[]) this.L$0;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            p pVar = this.$block;
            this.label = 1;
            Object objE2 = pVar.e(obj2, obj3, obj4, this);
            return objE2 == objE ? objE : objE2;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            Object[] objArr = (Object[]) this.L$0;
            AbstractC2854k.c(10);
            return this.$block.e(objArr[0], objArr[1], objArr[2], this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$9, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$9", f = "AsyncFunctionBuilder.kt", l = {56}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "<destruct>", "<anonymous>", "(LR8/N;Lkotlin/Array;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass9 extends l implements o {
        final /* synthetic */ q $block;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(q qVar, n7.f fVar) {
            super(3, fVar);
            this.$block = qVar;
        }

        @Override // w7.o
        public final Object invoke(N n10, Object[] objArr, n7.f fVar) {
            AnonymousClass9 anonymousClass9 = new AnonymousClass9(this.$block, fVar);
            anonymousClass9.L$0 = objArr;
            return anonymousClass9.invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                return obj;
            }
            AbstractC2753p.b(obj);
            Object[] objArr = (Object[]) this.L$0;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            q qVar = this.$block;
            this.label = 1;
            Object objInvoke = qVar.invoke(obj2, obj3, obj4, obj5, this);
            return objInvoke == objE ? objE : objInvoke;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            Object[] objArr = (Object[]) this.L$0;
            AbstractC2854k.c(10);
            return this.$block.invoke(objArr[0], objArr[1], objArr[2], objArr[3], this);
        }
    }

    public AsyncFunctionBuilder(String name, TypeConverterProvider typeConverterProvider) {
        AbstractC2855l.g(name, "name");
        this.name = name;
        this.converters = typeConverterProvider;
    }

    public final /* synthetic */ <R> AsyncFunctionComponent AsyncBody(final InterfaceC3487a body) {
        AbstractC2855l.g(body, "body");
        String name = getName();
        AnyType[] anyTypeArr = new AnyType[0];
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.3
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
        setAsyncFunctionComponent(intAsyncFunctionComponent);
        return intAsyncFunctionComponent;
    }

    public final AsyncFunctionComponent AsyncBodyWithoutArgs(final InterfaceC3487a body) {
        AbstractC2855l.g(body, "body");
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(getName(), new AnyType[0], new Function1() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] it) {
                AbstractC2855l.g(it, "it");
                return body.invoke();
            }
        });
        setAsyncFunctionComponent(untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0> AsyncFunctionComponent AsyncFunctionWithPromise(final Function2 body) {
        AbstractC2855l.g(body, "body");
        String name = getName();
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$4 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$4 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$4
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$4), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType}, new Function2() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.10
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
        setAsyncFunctionComponent(asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R> BaseAsyncFunctionComponent SuspendBody(Function1 block) {
        AbstractC2855l.g(block, "block");
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(getName(), new AnyType[0], new C24901(block, null));
        setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public final BaseAsyncFunctionComponent build$expo_modules_core_release() {
        BaseAsyncFunctionComponent baseAsyncFunctionComponent = this.asyncFunctionComponent;
        if (baseAsyncFunctionComponent != null) {
            return baseAsyncFunctionComponent;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final BaseAsyncFunctionComponent getAsyncFunctionComponent() {
        return this.asyncFunctionComponent;
    }

    public final TypeConverterProvider getConverters() {
        return this.converters;
    }

    public final String getName() {
        return this.name;
    }

    public final void setAsyncFunctionComponent(BaseAsyncFunctionComponent baseAsyncFunctionComponent) {
        this.asyncFunctionComponent = baseAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0> SuspendFunctionComponent SuspendBody(Function2 block) {
        AbstractC2855l.g(block, "block");
        String name = getName();
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$1 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$1 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$1
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$1), converters);
        }
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, new AnyType[]{anyType}, new C24913(block, null));
        setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public /* synthetic */ AsyncFunctionBuilder(String str, TypeConverterProvider typeConverterProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : typeConverterProvider);
    }

    public final /* synthetic */ <R, P0> AsyncFunctionComponent AsyncBody(final Function1 body) {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        AbstractC2855l.g(body, "body");
        AbstractC2855l.m(4, "P0");
        String name = getName();
        TypeConverterProvider converters = getConverters();
        AbstractC2855l.m(4, "P0");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$1 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$1 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$1
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$1), converters);
        }
        AnyType[] anyTypeArr = {anyType};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.6
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
        setAsyncFunctionComponent(untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1> AsyncFunctionComponent AsyncFunctionWithPromise(final o body) {
        AbstractC2855l.g(body, "body");
        String name = getName();
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$8 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$8 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$8
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$8), converters);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$9 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$9 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$9
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$9), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2}, new Function2() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.14
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
        setAsyncFunctionComponent(asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public static /* synthetic */ void getAsyncFunctionComponent$annotations() {
    }

    public static /* synthetic */ void getConverters$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public final /* synthetic */ <R, P0, P1> SuspendFunctionComponent SuspendBody(o block) {
        AbstractC2855l.g(block, "block");
        String name = getName();
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
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$2 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$2 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$2
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$2), converters);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$3 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$3 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$3
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$3), converters);
        }
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, new AnyType[]{anyType, anyType2}, new C24925(block, null));
        setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2> AsyncFunctionComponent AsyncFunctionWithPromise(final p body) {
        AbstractC2855l.g(body, "body");
        String name = getName();
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$14 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$14 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$14
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$14), converters);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$15 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$15 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$15
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$15), converters);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$16 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$16 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$16
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$16), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3}, new Function2() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.18
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
        setAsyncFunctionComponent(asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2> SuspendFunctionComponent SuspendBody(p block) {
        AbstractC2855l.g(block, "block");
        String name = getName();
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
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$4 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$4 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$4
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$4), converters);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$5 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$5 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$5
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$5), converters);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$6 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$6 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$6
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$6), converters);
        }
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, new AnyType[]{anyType, anyType2, anyType3}, new AnonymousClass7(block, null));
        setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1> AsyncFunctionComponent AsyncBody(final Function2 body) {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        AbstractC2855l.g(body, "body");
        String name = getName();
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$2 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$2 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$2
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$2), converters);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$3 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$3 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$3
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$3), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.8
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
        setAsyncFunctionComponent(untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3> AsyncFunctionComponent AsyncFunctionWithPromise(final q body) {
        AbstractC2855l.g(body, "body");
        String name = getName();
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$22 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$22 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$22
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$22), converters);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$23 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$23 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$23
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$23), converters);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$24 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$24 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$24
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$24), converters);
        }
        AbstractC2855l.m(4, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$25 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$25 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$25
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$25), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4}, new Function2() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.22
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
        setAsyncFunctionComponent(asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3> SuspendFunctionComponent SuspendBody(q block) {
        AbstractC2855l.g(block, "block");
        String name = getName();
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
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$7 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$7 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$7
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$7), converters);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$8 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$8 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$8
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$8), converters);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$9 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$9 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$9
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$9), converters);
        }
        AbstractC2855l.m(4, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$10 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$10 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$10
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$10), converters);
        }
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4}, new AnonymousClass9(block, null));
        setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2> AsyncFunctionComponent AsyncBody(final o body) {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        AbstractC2855l.g(body, "body");
        String name = getName();
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$5 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$5 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$5
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$5), converters);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$6 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$6 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$6
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$6), converters);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$7 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$7 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$7
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$7), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.12
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
        setAsyncFunctionComponent(untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> AsyncFunctionComponent AsyncFunctionWithPromise(final r body) {
        AnyTypeProvider anyTypeProvider;
        int i10;
        int i11;
        int i12;
        int i13;
        AbstractC2855l.g(body, "body");
        String name = getName();
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$32 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$32 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$32
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            anyTypeProvider = anyTypeProvider2;
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$32), converters);
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$33 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$33 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$33
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            i11 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$33), converters);
        } else {
            i11 = 3;
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(i11, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$34 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$34 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$34
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            i12 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$34), converters);
        } else {
            i12 = 3;
        }
        AbstractC2855l.m(4, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(i12, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$35 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$35 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$35
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            i13 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$35), converters);
        } else {
            i13 = 3;
        }
        AbstractC2855l.m(4, "P4");
        C7.d dVarB9 = D.b(Object.class);
        AbstractC2855l.m(i13, "P4");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType5 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$36 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$36 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$36
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(Object.class);
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$36), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5}, new Function2() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.26
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
        setAsyncFunctionComponent(asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> SuspendFunctionComponent SuspendBody(r block) {
        AnyTypeProvider anyTypeProvider;
        int i10;
        int i11;
        int i12;
        int i13;
        AbstractC2855l.g(block, "block");
        String name = getName();
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
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$11 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$11 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$11
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            anyTypeProvider = anyTypeProvider2;
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$11), converters);
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
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$12 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$12 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$12
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            i11 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$12), converters);
        } else {
            i11 = 3;
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(i11, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$13 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$13 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$13
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            i12 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$13), converters);
        } else {
            i12 = 3;
        }
        AbstractC2855l.m(4, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(i12, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$14 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$14 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$14
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            i13 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$14), converters);
        } else {
            i13 = 3;
        }
        AbstractC2855l.m(4, "P4");
        C7.d dVarB9 = D.b(Object.class);
        AbstractC2855l.m(i13, "P4");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType5 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$15 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$15 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$15
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(Object.class);
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$15), converters);
        }
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5}, new AnonymousClass11(block, null));
        setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3> AsyncFunctionComponent AsyncBody(final p body) {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        AbstractC2855l.g(body, "body");
        String name = getName();
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$10 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$10 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$10
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$10), converters);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$11 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$11 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$11
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$11), converters);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$12 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$12 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$12
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$12), converters);
        }
        AbstractC2855l.m(4, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$13 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$13 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$13
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$13), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.16
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
        setAsyncFunctionComponent(untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> AsyncFunctionComponent AsyncFunctionWithPromise(final s body) {
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
        AbstractC2855l.g(body, "body");
        String name = getName();
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$44 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$44 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$44
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
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
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$44), converters);
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$45 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$45 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$45
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            i11 = 4;
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(cls);
            i12 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$45), converters);
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$46 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$46 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$46
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            i13 = 4;
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(cls);
            i14 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$46), converters);
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$47 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$47 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$47
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            i15 = 4;
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(cls);
            i16 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$47), converters);
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$48 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$48 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$48
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            i17 = 4;
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(cls);
            i18 = 3;
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$48), converters);
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$49 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$49 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$49
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P5");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P5");
            C7.d dVarB12 = D.b(cls);
            AbstractC2855l.m(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$49), converters);
        } else {
            anyType6 = anyType12;
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5, anyType6}, new Function2() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.30
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
        setAsyncFunctionComponent(asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> SuspendFunctionComponent SuspendBody(s block) {
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
        AbstractC2855l.g(block, "block");
        String name = getName();
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
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$16 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$16 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$16
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
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
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$16), converters);
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
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$17 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$17 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$17
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            i11 = 4;
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(cls);
            i12 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$17), converters);
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
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$18 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$18 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$18
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            i13 = 4;
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(cls);
            i14 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$18), converters);
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
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$19 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$19 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$19
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            i15 = 4;
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(cls);
            i16 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$19), converters);
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
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$20 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$20 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$20
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            i17 = 4;
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(cls);
            i18 = 3;
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$20), converters);
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
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$21 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$21 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$21
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P5");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P5");
            C7.d dVarB12 = D.b(cls);
            AbstractC2855l.m(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$21), converters);
        } else {
            anyType6 = anyType12;
        }
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5, anyType6}, new AnonymousClass13(block, null));
        setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> AsyncFunctionComponent AsyncBody(final q body) {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        AbstractC2855l.g(body, "body");
        String name = getName();
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$17 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$17 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$17
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$17), converters);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$18 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$18 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$18
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$18), converters);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$19 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$19 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$19
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$19), converters);
        }
        AbstractC2855l.m(4, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$20 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$20 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$20
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$20), converters);
        }
        AbstractC2855l.m(4, "P4");
        C7.d dVarB9 = D.b(Object.class);
        AbstractC2855l.m(3, "P4");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType5 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$21 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$21 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$21
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(Object.class);
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$21), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.20
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
        setAsyncFunctionComponent(untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent, still in use, count: 2, list:
          (r1v1 expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent) from 0x0081: MOVE (r19v0 expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent) = (r1v1 expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent)
          (r1v1 expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent) from 0x0070: MOVE (r19v2 expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent) = (r1v1 expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> expo.modules.kotlin.functions.AsyncFunctionComponent AsyncFunctionWithPromise(final w7.t r28) {
        /*
            Method dump skipped, instruction units count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncFunctionWithPromise(w7.t):expo.modules.kotlin.functions.AsyncFunctionComponent");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 expo.modules.kotlin.functions.SuspendFunctionComponent, still in use, count: 2, list:
          (r1v1 expo.modules.kotlin.functions.SuspendFunctionComponent) from 0x0081: MOVE (r19v0 expo.modules.kotlin.functions.SuspendFunctionComponent) = (r1v1 expo.modules.kotlin.functions.SuspendFunctionComponent)
          (r1v1 expo.modules.kotlin.functions.SuspendFunctionComponent) from 0x0070: MOVE (r19v2 expo.modules.kotlin.functions.SuspendFunctionComponent) = (r1v1 expo.modules.kotlin.functions.SuspendFunctionComponent)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> expo.modules.kotlin.functions.SuspendFunctionComponent SuspendBody(w7.t r28) {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.functions.AsyncFunctionBuilder.SuspendBody(w7.t):expo.modules.kotlin.functions.SuspendFunctionComponent");
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> AsyncFunctionComponent AsyncBody(final r body) {
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
        AbstractC2855l.g(body, "body");
        String name = getName();
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$26 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$26 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$26
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            anyTypeProvider = anyTypeProvider2;
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$26), converters);
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$27 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$27 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$27
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            i11 = 4;
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            i12 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$27), converters);
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$28 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$28 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$28
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            i13 = 4;
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            i14 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$28), converters);
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$29 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$29 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$29
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            i15 = 4;
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            i16 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$29), converters);
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$30 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$30 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$30
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            i17 = 4;
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(Object.class);
            i18 = 3;
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$30), converters);
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$31 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$31 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$31
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P5");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P5");
            C7.d dVarB12 = D.b(Object.class);
            i19 = 3;
            AbstractC2855l.m(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$31), converters);
        } else {
            i19 = 3;
            anyType6 = anyType12;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.24
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
        setAsyncFunctionComponent(untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 expo.modules.kotlin.functions.SuspendFunctionComponent, still in use, count: 2, list:
          (r1v1 expo.modules.kotlin.functions.SuspendFunctionComponent) from 0x0088: MOVE (r19v0 expo.modules.kotlin.functions.SuspendFunctionComponent) = (r1v1 expo.modules.kotlin.functions.SuspendFunctionComponent)
          (r1v1 expo.modules.kotlin.functions.SuspendFunctionComponent) from 0x006d: MOVE (r19v2 expo.modules.kotlin.functions.SuspendFunctionComponent) = (r1v1 expo.modules.kotlin.functions.SuspendFunctionComponent)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6, P7> expo.modules.kotlin.functions.SuspendFunctionComponent SuspendBody(w7.u r30) {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.functions.AsyncFunctionBuilder.SuspendBody(w7.u):expo.modules.kotlin.functions.SuspendFunctionComponent");
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> AsyncFunctionComponent AsyncBody(final s body) {
        String str;
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
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        AbstractC2855l.g(body, "body");
        String name = getName();
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$37 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$37 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$37
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            anyTypeProvider = anyTypeProvider2;
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            str = name;
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$37), converters);
        } else {
            str = name;
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$38 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$38 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$38
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            i11 = 4;
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            i12 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$38), converters);
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$39 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$39 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$39
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            i13 = 4;
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            i14 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$39), converters);
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$40 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$40 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$40
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            i15 = 4;
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            i16 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$40), converters);
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$41 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$41 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$41
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            i17 = 4;
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(Object.class);
            i18 = 3;
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$41), converters);
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$42 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$42 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$42
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P5");
                    return null;
                }
            };
            i19 = 4;
            AbstractC2855l.m(4, "P5");
            C7.d dVarB12 = D.b(Object.class);
            i20 = 3;
            AbstractC2855l.m(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$42), converters);
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$43 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$43 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$43
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P6");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P6");
            C7.d dVarB14 = D.b(Object.class);
            i21 = 3;
            AbstractC2855l.m(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$43), converters);
        } else {
            i21 = 3;
            anyType7 = anyType14;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.28
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
            untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(str, anyTypeArr, function1);
        } else {
            String str2 = str;
            if (AbstractC2855l.b(Object.class, Boolean.TYPE)) {
                untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(str2, anyTypeArr, function1);
            } else if (AbstractC2855l.b(Object.class, Double.TYPE)) {
                untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(str2, anyTypeArr, function1);
            } else if (AbstractC2855l.b(Object.class, Float.TYPE)) {
                untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(str2, anyTypeArr, function1);
            } else if (AbstractC2855l.b(Object.class, String.class)) {
                untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(str2, anyTypeArr, function1);
            } else {
                untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(str2, anyTypeArr, function1);
            }
        }
        setAsyncFunctionComponent(untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6, P7> AsyncFunctionComponent AsyncBody(final t body) {
        String str;
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
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        AbstractC2855l.g(body, "body");
        String name = getName();
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$50 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$50 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$50
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            anyTypeProvider = anyTypeProvider2;
            str = name;
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            cls = Object.class;
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$50), converters);
        } else {
            str = name;
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$51 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$51 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$51
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            i11 = 4;
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(cls);
            i12 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$51), converters);
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$52 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$52 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$52
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            i13 = 4;
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(cls);
            i14 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$52), converters);
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$53 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$53 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$53
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            i15 = 4;
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(cls);
            i16 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$53), converters);
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$54 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$54 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$54
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            i17 = 4;
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(cls);
            i18 = 3;
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$54), converters);
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$55 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$55 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$55
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P5");
                    return null;
                }
            };
            i19 = 4;
            AbstractC2855l.m(4, "P5");
            C7.d dVarB12 = D.b(cls);
            i20 = 3;
            AbstractC2855l.m(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$55), converters);
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$56 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$56 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$56
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P6");
                    return null;
                }
            };
            i21 = 4;
            AbstractC2855l.m(4, "P6");
            C7.d dVarB14 = D.b(cls);
            i22 = 3;
            AbstractC2855l.m(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$56), converters);
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
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$57 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$57 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$57
                @Override // w7.InterfaceC3487a
                public final C7.o invoke() {
                    AbstractC2855l.m(6, "P7");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P7");
            C7.d dVarB16 = D.b(cls);
            i23 = 3;
            AbstractC2855l.m(3, "P7");
            anyType8 = new AnyType(new LazyKType(dVarB16, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$57), converters);
        } else {
            i23 = 3;
            anyType8 = anyType16;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7, anyType8};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.32
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
            untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(str, anyTypeArr, function1);
        } else {
            String str2 = str;
            if (AbstractC2855l.b(cls2, Boolean.TYPE)) {
                untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(str2, anyTypeArr, function1);
            } else if (AbstractC2855l.b(cls2, Double.TYPE)) {
                untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(str2, anyTypeArr, function1);
            } else if (AbstractC2855l.b(cls2, Float.TYPE)) {
                untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(str2, anyTypeArr, function1);
            } else if (AbstractC2855l.b(cls2, String.class)) {
                untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(str2, anyTypeArr, function1);
            } else {
                untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(str2, anyTypeArr, function1);
            }
        }
        setAsyncFunctionComponent(untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }
}
