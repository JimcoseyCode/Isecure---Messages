package com.facebook.react.internal.featureflags;

import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsLocalAccessor;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2800q;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b?\n\u0002\u0010\u0006\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\bZ\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u0006J\u000f\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u0006J\u000f\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u0006J\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\u0006J\u000f\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\u0006J\u000f\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010\u0006J\u000f\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010\u0006J\u000f\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010\u0006J\u000f\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010\u0006J\u000f\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010\u0006J\u000f\u0010'\u001a\u00020\u0004H\u0016¢\u0006\u0004\b'\u0010\u0006J\u000f\u0010(\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010\u0006J\u000f\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010\u0006J\u000f\u0010*\u001a\u00020\u0004H\u0016¢\u0006\u0004\b*\u0010\u0006J\u000f\u0010+\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010\u0006J\u000f\u0010,\u001a\u00020\u0004H\u0016¢\u0006\u0004\b,\u0010\u0006J\u000f\u0010-\u001a\u00020\u0004H\u0016¢\u0006\u0004\b-\u0010\u0006J\u000f\u0010.\u001a\u00020\u0004H\u0016¢\u0006\u0004\b.\u0010\u0006J\u000f\u0010/\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u0010\u0006J\u000f\u00100\u001a\u00020\u0004H\u0016¢\u0006\u0004\b0\u0010\u0006J\u000f\u00101\u001a\u00020\u0004H\u0016¢\u0006\u0004\b1\u0010\u0006J\u000f\u00102\u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u0010\u0006J\u000f\u00103\u001a\u00020\u0004H\u0016¢\u0006\u0004\b3\u0010\u0006J\u000f\u00104\u001a\u00020\u0004H\u0016¢\u0006\u0004\b4\u0010\u0006J\u000f\u00105\u001a\u00020\u0004H\u0016¢\u0006\u0004\b5\u0010\u0006J\u000f\u00106\u001a\u00020\u0004H\u0016¢\u0006\u0004\b6\u0010\u0006J\u000f\u00107\u001a\u00020\u0004H\u0016¢\u0006\u0004\b7\u0010\u0006J\u000f\u00108\u001a\u00020\u0004H\u0016¢\u0006\u0004\b8\u0010\u0006J\u000f\u00109\u001a\u00020\u0004H\u0016¢\u0006\u0004\b9\u0010\u0006J\u000f\u0010:\u001a\u00020\u0004H\u0016¢\u0006\u0004\b:\u0010\u0006J\u000f\u0010;\u001a\u00020\u0004H\u0016¢\u0006\u0004\b;\u0010\u0006J\u000f\u0010<\u001a\u00020\u0004H\u0016¢\u0006\u0004\b<\u0010\u0006J\u000f\u0010=\u001a\u00020\u0004H\u0016¢\u0006\u0004\b=\u0010\u0006J\u000f\u0010>\u001a\u00020\u0004H\u0016¢\u0006\u0004\b>\u0010\u0006J\u000f\u0010?\u001a\u00020\u0004H\u0016¢\u0006\u0004\b?\u0010\u0006J\u000f\u0010@\u001a\u00020\u0004H\u0016¢\u0006\u0004\b@\u0010\u0006J\u000f\u0010A\u001a\u00020\u0004H\u0016¢\u0006\u0004\bA\u0010\u0006J\u000f\u0010B\u001a\u00020\u0004H\u0016¢\u0006\u0004\bB\u0010\u0006J\u000f\u0010C\u001a\u00020\u0004H\u0016¢\u0006\u0004\bC\u0010\u0006J\u000f\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0004H\u0016¢\u0006\u0004\bG\u0010\u0006J\u000f\u0010H\u001a\u00020\u0004H\u0016¢\u0006\u0004\bH\u0010\u0006J\u000f\u0010I\u001a\u00020\u0004H\u0016¢\u0006\u0004\bI\u0010\u0006J\u000f\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bJ\u0010\u0006J\u000f\u0010K\u001a\u00020\u0004H\u0016¢\u0006\u0004\bK\u0010\u0006J\u000f\u0010L\u001a\u00020\u0004H\u0016¢\u0006\u0004\bL\u0010\u0006J\u000f\u0010M\u001a\u00020\u0004H\u0016¢\u0006\u0004\bM\u0010\u0006J\u000f\u0010N\u001a\u00020\u0004H\u0016¢\u0006\u0004\bN\u0010\u0006J\u000f\u0010O\u001a\u00020\u0004H\u0016¢\u0006\u0004\bO\u0010\u0006J\u000f\u0010P\u001a\u00020\u0004H\u0016¢\u0006\u0004\bP\u0010\u0006J\u000f\u0010Q\u001a\u00020\u0004H\u0016¢\u0006\u0004\bQ\u0010\u0006J\u000f\u0010R\u001a\u00020\u0004H\u0016¢\u0006\u0004\bR\u0010\u0006J\u000f\u0010S\u001a\u00020\u0004H\u0016¢\u0006\u0004\bS\u0010\u0006J\u000f\u0010T\u001a\u00020\u0004H\u0016¢\u0006\u0004\bT\u0010\u0006J\u000f\u0010U\u001a\u00020\u0004H\u0016¢\u0006\u0004\bU\u0010\u0006J\u000f\u0010V\u001a\u00020\u0004H\u0016¢\u0006\u0004\bV\u0010\u0006J\u000f\u0010W\u001a\u00020\u0004H\u0016¢\u0006\u0004\bW\u0010\u0006J\u000f\u0010X\u001a\u00020\u0004H\u0016¢\u0006\u0004\bX\u0010\u0006J\u000f\u0010Y\u001a\u00020\u0004H\u0016¢\u0006\u0004\bY\u0010\u0006J\u000f\u0010Z\u001a\u00020DH\u0016¢\u0006\u0004\bZ\u0010FJ\u000f\u0010[\u001a\u00020DH\u0016¢\u0006\u0004\b[\u0010FJ\u000f\u0010\\\u001a\u00020DH\u0016¢\u0006\u0004\b\\\u0010FJ\u0017\u0010`\u001a\u00020_2\u0006\u0010^\u001a\u00020]H\u0016¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020_H\u0016¢\u0006\u0004\bb\u0010\u0003J\u0019\u0010d\u001a\u0004\u0018\u00010c2\u0006\u0010^\u001a\u00020]H\u0016¢\u0006\u0004\bd\u0010eJ\u0011\u0010h\u001a\u0004\u0018\u00010cH\u0000¢\u0006\u0004\bf\u0010gR\u0016\u0010i\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020c0k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010p\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010oR\u0018\u0010q\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010oR\u0018\u0010r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010oR\u0018\u0010s\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010oR\u0018\u0010t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010oR\u0018\u0010u\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010oR\u0018\u0010v\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010oR\u0018\u0010w\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010oR\u0018\u0010x\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010oR\u0018\u0010y\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010oR\u0018\u0010z\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010oR\u0018\u0010{\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010oR\u0018\u0010|\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010oR\u0018\u0010}\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010oR\u0018\u0010~\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010oR\u0018\u0010\u007f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010oR\u001a\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010oR\u001a\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010oR\u001a\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010oR\u001a\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010oR\u001a\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010oR\u001a\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010oR\u001a\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010oR\u001a\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010oR\u001a\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010oR\u001a\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010oR\u001a\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010oR\u001a\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010oR\u001a\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010oR\u001a\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010oR\u001a\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010oR\u001a\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010oR\u001a\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010oR\u001a\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010oR\u001a\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010oR\u001a\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010oR\u001a\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010oR\u001a\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010oR\u001a\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010oR\u001a\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010oR\u001a\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010oR\u001a\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0099\u0001\u0010oR\u001a\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010oR\u001a\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009b\u0001\u0010oR\u001a\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010oR\u001a\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009d\u0001\u0010oR\u001a\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009e\u0001\u0010oR\u001a\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009f\u0001\u0010oR\u001a\u0010 \u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0001\u0010oR\u001a\u0010¡\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¡\u0001\u0010oR\u001a\u0010¢\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¢\u0001\u0010oR\u001a\u0010£\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b£\u0001\u0010oR\u001a\u0010¤\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¤\u0001\u0010oR\u001a\u0010¥\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¥\u0001\u0010oR\u001a\u0010¦\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¦\u0001\u0010oR\u001a\u0010§\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b§\u0001\u0010oR\u001a\u0010¨\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¨\u0001\u0010oR\u001a\u0010©\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b©\u0001\u0010oR\u001a\u0010ª\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bª\u0001\u0010oR\u001a\u0010«\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b«\u0001\u0010oR\u001a\u0010¬\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¬\u0001\u0010oR\u001b\u0010\u00ad\u0001\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u001a\u0010¯\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¯\u0001\u0010oR\u001a\u0010°\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b°\u0001\u0010oR\u001a\u0010±\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b±\u0001\u0010oR\u001a\u0010²\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b²\u0001\u0010oR\u001a\u0010³\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b³\u0001\u0010oR\u001a\u0010´\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b´\u0001\u0010oR\u001a\u0010µ\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bµ\u0001\u0010oR\u001a\u0010¶\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¶\u0001\u0010oR\u001a\u0010·\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b·\u0001\u0010oR\u001a\u0010¸\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¸\u0001\u0010oR\u001a\u0010¹\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¹\u0001\u0010oR\u001a\u0010º\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bº\u0001\u0010oR\u001a\u0010»\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b»\u0001\u0010oR\u001a\u0010¼\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¼\u0001\u0010oR\u001a\u0010½\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b½\u0001\u0010oR\u001a\u0010¾\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¾\u0001\u0010oR\u001a\u0010¿\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¿\u0001\u0010oR\u001a\u0010À\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÀ\u0001\u0010oR\u001a\u0010Á\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÁ\u0001\u0010oR\u001b\u0010Â\u0001\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010®\u0001R\u001b\u0010Ã\u0001\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010®\u0001R\u001b\u0010Ä\u0001\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010®\u0001¨\u0006Å\u0001"}, d2 = {"Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsLocalAccessor;", "Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;", "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "commonTestFlag", "()Z", "cdpInteractionMetricsEnabled", "cxxNativeAnimatedEnabled", "cxxNativeAnimatedRemoveJsSync", "disableEarlyViewCommandExecution", "disableFabricCommitInCXXAnimated", "disableMountItemReorderingAndroid", "disableOldAndroidAttachmentMetricsWorkarounds", "disableTextLayoutManagerCacheAndroid", "enableAccessibilityOrder", "enableAccumulatedUpdatesInRawPropsAndroid", "enableAndroidLinearText", "enableAndroidTextMeasurementOptimizations", "enableBridgelessArchitecture", "enableCppPropsIteratorSetter", "enableCustomFocusSearchOnClippedElementsAndroid", "enableDestroyShadowTreeRevisionAsync", "enableDoubleMeasurementFixAndroid", "enableEagerMainQueueModulesOnIOS", "enableEagerRootViewAttachment", "enableFabricLogs", "enableFabricRenderer", "enableFontScaleChangesUpdatingLayout", "enableIOSTextBaselineOffsetPerLine", "enableIOSViewClipToPaddingBox", "enableImagePrefetchingAndroid", "enableImagePrefetchingOnUiThreadAndroid", "enableImmediateUpdateModeForContentOffsetChanges", "enableImperativeFocus", "enableInteropViewManagerClassLookUpOptimizationIOS", "enableIntersectionObserverByDefault", "enableKeyEvents", "enableLayoutAnimationsOnAndroid", "enableLayoutAnimationsOnIOS", "enableMainQueueCoordinatorOnIOS", "enableModuleArgumentNSNullConversionIOS", "enableNativeCSSParsing", "enableNetworkEventReporting", "enablePreparedTextLayout", "enablePropsUpdateReconciliationAndroid", "enableResourceTimingAPI", "enableSwiftUIBasedFilters", "enableViewCulling", "enableViewRecycling", "enableViewRecyclingForImage", "enableViewRecyclingForScrollView", "enableViewRecyclingForText", "enableViewRecyclingForView", "enableVirtualViewClippingWithoutScrollViewClipping", "enableVirtualViewContainerStateExperimental", "enableVirtualViewDebugFeatures", "enableVirtualViewRenderState", "enableVirtualViewWindowFocusDetection", "enableWebPerformanceAPIsByDefault", "fixMappingOfEventPrioritiesBetweenFabricAndReact", "fuseboxAssertSingleHostState", "fuseboxEnabledRelease", "fuseboxNetworkInspectionEnabled", "hideOffscreenVirtualViewsOnIOS", "overrideBySynchronousMountPropsAtMountingAndroid", "perfIssuesEnabled", "perfMonitorV2Enabled", PointerEventHelper.POINTER_TYPE_UNKNOWN, "preparedTextCacheSize", "()D", "preventShadowTreeCommitExhaustion", "shouldPressibilityUseW3CPointerEventsForHover", "shouldTriggerResponderTransferOnScrollAndroid", "skipActivityIdentityAssertionOnHostPause", "sweepActiveTouchOnChildNativeGesturesAndroid", "traceTurboModulePromiseRejectionsOnAndroid", "updateRuntimeShadowNodeReferencesOnCommit", "useAlwaysAvailableJSErrorHandling", "useFabricInterop", "useNativeEqualsInNativeReadableArrayAndroid", "useNativeTransformHelperAndroid", "useNativeViewConfigsInBridgelessMode", "useOptimizedEventBatchingOnAndroid", "useRawPropsJsiValue", "useShadowNodeStateOnClone", "useSharedAnimatedBackend", "useTraitHiddenOnAndroid", "useTurboModuleInterop", "useTurboModules", "viewCullingOutsetRatio", "virtualViewHysteresisRatio", "virtualViewPrerenderRatio", "Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;", "provider", "Li7/B;", "override", "(Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;)V", "dangerouslyReset", PointerEventHelper.POINTER_TYPE_UNKNOWN, "dangerouslyForceOverride", "(Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;)Ljava/lang/String;", "getAccessedFeatureFlags$ReactAndroid_release", "()Ljava/lang/String;", "getAccessedFeatureFlags", "currentProvider", "Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "accessedFeatureFlags", "Ljava/util/Set;", "commonTestFlagCache", "Ljava/lang/Boolean;", "cdpInteractionMetricsEnabledCache", "cxxNativeAnimatedEnabledCache", "cxxNativeAnimatedRemoveJsSyncCache", "disableEarlyViewCommandExecutionCache", "disableFabricCommitInCXXAnimatedCache", "disableMountItemReorderingAndroidCache", "disableOldAndroidAttachmentMetricsWorkaroundsCache", "disableTextLayoutManagerCacheAndroidCache", "enableAccessibilityOrderCache", "enableAccumulatedUpdatesInRawPropsAndroidCache", "enableAndroidLinearTextCache", "enableAndroidTextMeasurementOptimizationsCache", "enableBridgelessArchitectureCache", "enableCppPropsIteratorSetterCache", "enableCustomFocusSearchOnClippedElementsAndroidCache", "enableDestroyShadowTreeRevisionAsyncCache", "enableDoubleMeasurementFixAndroidCache", "enableEagerMainQueueModulesOnIOSCache", "enableEagerRootViewAttachmentCache", "enableFabricLogsCache", "enableFabricRendererCache", "enableFontScaleChangesUpdatingLayoutCache", "enableIOSTextBaselineOffsetPerLineCache", "enableIOSViewClipToPaddingBoxCache", "enableImagePrefetchingAndroidCache", "enableImagePrefetchingOnUiThreadAndroidCache", "enableImmediateUpdateModeForContentOffsetChangesCache", "enableImperativeFocusCache", "enableInteropViewManagerClassLookUpOptimizationIOSCache", "enableIntersectionObserverByDefaultCache", "enableKeyEventsCache", "enableLayoutAnimationsOnAndroidCache", "enableLayoutAnimationsOnIOSCache", "enableMainQueueCoordinatorOnIOSCache", "enableModuleArgumentNSNullConversionIOSCache", "enableNativeCSSParsingCache", "enableNetworkEventReportingCache", "enablePreparedTextLayoutCache", "enablePropsUpdateReconciliationAndroidCache", "enableResourceTimingAPICache", "enableSwiftUIBasedFiltersCache", "enableViewCullingCache", "enableViewRecyclingCache", "enableViewRecyclingForImageCache", "enableViewRecyclingForScrollViewCache", "enableViewRecyclingForTextCache", "enableViewRecyclingForViewCache", "enableVirtualViewClippingWithoutScrollViewClippingCache", "enableVirtualViewContainerStateExperimentalCache", "enableVirtualViewDebugFeaturesCache", "enableVirtualViewRenderStateCache", "enableVirtualViewWindowFocusDetectionCache", "enableWebPerformanceAPIsByDefaultCache", "fixMappingOfEventPrioritiesBetweenFabricAndReactCache", "fuseboxAssertSingleHostStateCache", "fuseboxEnabledReleaseCache", "fuseboxNetworkInspectionEnabledCache", "hideOffscreenVirtualViewsOnIOSCache", "overrideBySynchronousMountPropsAtMountingAndroidCache", "perfIssuesEnabledCache", "perfMonitorV2EnabledCache", "preparedTextCacheSizeCache", "Ljava/lang/Double;", "preventShadowTreeCommitExhaustionCache", "shouldPressibilityUseW3CPointerEventsForHoverCache", "shouldTriggerResponderTransferOnScrollAndroidCache", "skipActivityIdentityAssertionOnHostPauseCache", "sweepActiveTouchOnChildNativeGesturesAndroidCache", "traceTurboModulePromiseRejectionsOnAndroidCache", "updateRuntimeShadowNodeReferencesOnCommitCache", "useAlwaysAvailableJSErrorHandlingCache", "useFabricInteropCache", "useNativeEqualsInNativeReadableArrayAndroidCache", "useNativeTransformHelperAndroidCache", "useNativeViewConfigsInBridgelessModeCache", "useOptimizedEventBatchingOnAndroidCache", "useRawPropsJsiValueCache", "useShadowNodeStateOnCloneCache", "useSharedAnimatedBackendCache", "useTraitHiddenOnAndroidCache", "useTurboModuleInteropCache", "useTurboModulesCache", "viewCullingOutsetRatioCache", "virtualViewHysteresisRatioCache", "virtualViewPrerenderRatioCache", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactNativeFeatureFlagsLocalAccessor implements ReactNativeFeatureFlagsAccessor {
    private Boolean cdpInteractionMetricsEnabledCache;
    private Boolean commonTestFlagCache;
    private Boolean cxxNativeAnimatedEnabledCache;
    private Boolean cxxNativeAnimatedRemoveJsSyncCache;
    private Boolean disableEarlyViewCommandExecutionCache;
    private Boolean disableFabricCommitInCXXAnimatedCache;
    private Boolean disableMountItemReorderingAndroidCache;
    private Boolean disableOldAndroidAttachmentMetricsWorkaroundsCache;
    private Boolean disableTextLayoutManagerCacheAndroidCache;
    private Boolean enableAccessibilityOrderCache;
    private Boolean enableAccumulatedUpdatesInRawPropsAndroidCache;
    private Boolean enableAndroidLinearTextCache;
    private Boolean enableAndroidTextMeasurementOptimizationsCache;
    private Boolean enableBridgelessArchitectureCache;
    private Boolean enableCppPropsIteratorSetterCache;
    private Boolean enableCustomFocusSearchOnClippedElementsAndroidCache;
    private Boolean enableDestroyShadowTreeRevisionAsyncCache;
    private Boolean enableDoubleMeasurementFixAndroidCache;
    private Boolean enableEagerMainQueueModulesOnIOSCache;
    private Boolean enableEagerRootViewAttachmentCache;
    private Boolean enableFabricLogsCache;
    private Boolean enableFabricRendererCache;
    private Boolean enableFontScaleChangesUpdatingLayoutCache;
    private Boolean enableIOSTextBaselineOffsetPerLineCache;
    private Boolean enableIOSViewClipToPaddingBoxCache;
    private Boolean enableImagePrefetchingAndroidCache;
    private Boolean enableImagePrefetchingOnUiThreadAndroidCache;
    private Boolean enableImmediateUpdateModeForContentOffsetChangesCache;
    private Boolean enableImperativeFocusCache;
    private Boolean enableInteropViewManagerClassLookUpOptimizationIOSCache;
    private Boolean enableIntersectionObserverByDefaultCache;
    private Boolean enableKeyEventsCache;
    private Boolean enableLayoutAnimationsOnAndroidCache;
    private Boolean enableLayoutAnimationsOnIOSCache;
    private Boolean enableMainQueueCoordinatorOnIOSCache;
    private Boolean enableModuleArgumentNSNullConversionIOSCache;
    private Boolean enableNativeCSSParsingCache;
    private Boolean enableNetworkEventReportingCache;
    private Boolean enablePreparedTextLayoutCache;
    private Boolean enablePropsUpdateReconciliationAndroidCache;
    private Boolean enableResourceTimingAPICache;
    private Boolean enableSwiftUIBasedFiltersCache;
    private Boolean enableViewCullingCache;
    private Boolean enableViewRecyclingCache;
    private Boolean enableViewRecyclingForImageCache;
    private Boolean enableViewRecyclingForScrollViewCache;
    private Boolean enableViewRecyclingForTextCache;
    private Boolean enableViewRecyclingForViewCache;
    private Boolean enableVirtualViewClippingWithoutScrollViewClippingCache;
    private Boolean enableVirtualViewContainerStateExperimentalCache;
    private Boolean enableVirtualViewDebugFeaturesCache;
    private Boolean enableVirtualViewRenderStateCache;
    private Boolean enableVirtualViewWindowFocusDetectionCache;
    private Boolean enableWebPerformanceAPIsByDefaultCache;
    private Boolean fixMappingOfEventPrioritiesBetweenFabricAndReactCache;
    private Boolean fuseboxAssertSingleHostStateCache;
    private Boolean fuseboxEnabledReleaseCache;
    private Boolean fuseboxNetworkInspectionEnabledCache;
    private Boolean hideOffscreenVirtualViewsOnIOSCache;
    private Boolean overrideBySynchronousMountPropsAtMountingAndroidCache;
    private Boolean perfIssuesEnabledCache;
    private Boolean perfMonitorV2EnabledCache;
    private Double preparedTextCacheSizeCache;
    private Boolean preventShadowTreeCommitExhaustionCache;
    private Boolean shouldPressibilityUseW3CPointerEventsForHoverCache;
    private Boolean shouldTriggerResponderTransferOnScrollAndroidCache;
    private Boolean skipActivityIdentityAssertionOnHostPauseCache;
    private Boolean sweepActiveTouchOnChildNativeGesturesAndroidCache;
    private Boolean traceTurboModulePromiseRejectionsOnAndroidCache;
    private Boolean updateRuntimeShadowNodeReferencesOnCommitCache;
    private Boolean useAlwaysAvailableJSErrorHandlingCache;
    private Boolean useFabricInteropCache;
    private Boolean useNativeEqualsInNativeReadableArrayAndroidCache;
    private Boolean useNativeTransformHelperAndroidCache;
    private Boolean useNativeViewConfigsInBridgelessModeCache;
    private Boolean useOptimizedEventBatchingOnAndroidCache;
    private Boolean useRawPropsJsiValueCache;
    private Boolean useShadowNodeStateOnCloneCache;
    private Boolean useSharedAnimatedBackendCache;
    private Boolean useTraitHiddenOnAndroidCache;
    private Boolean useTurboModuleInteropCache;
    private Boolean useTurboModulesCache;
    private Double viewCullingOutsetRatioCache;
    private Double virtualViewHysteresisRatioCache;
    private Double virtualViewPrerenderRatioCache;
    private ReactNativeFeatureFlagsProvider currentProvider = new ReactNativeFeatureFlagsDefaults();
    private final Set<String> accessedFeatureFlags = new LinkedHashSet();

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence getAccessedFeatureFlags$lambda$1(String it) {
        AbstractC2855l.g(it, "it");
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence override$lambda$0(String it) {
        AbstractC2855l.g(it, "it");
        return it;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean cdpInteractionMetricsEnabled() {
        Boolean boolValueOf = this.cdpInteractionMetricsEnabledCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.cdpInteractionMetricsEnabled());
            this.accessedFeatureFlags.add("cdpInteractionMetricsEnabled");
            this.cdpInteractionMetricsEnabledCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean commonTestFlag() {
        Boolean boolValueOf = this.commonTestFlagCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.commonTestFlag());
            this.accessedFeatureFlags.add("commonTestFlag");
            this.commonTestFlagCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean cxxNativeAnimatedEnabled() {
        Boolean boolValueOf = this.cxxNativeAnimatedEnabledCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.cxxNativeAnimatedEnabled());
            this.accessedFeatureFlags.add("cxxNativeAnimatedEnabled");
            this.cxxNativeAnimatedEnabledCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean cxxNativeAnimatedRemoveJsSync() {
        Boolean boolValueOf = this.cxxNativeAnimatedRemoveJsSyncCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.cxxNativeAnimatedRemoveJsSync());
            this.accessedFeatureFlags.add("cxxNativeAnimatedRemoveJsSync");
            this.cxxNativeAnimatedRemoveJsSyncCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsAccessor
    public String dangerouslyForceOverride(ReactNativeFeatureFlagsProvider provider) {
        AbstractC2855l.g(provider, "provider");
        String accessedFeatureFlags$ReactAndroid_release = getAccessedFeatureFlags$ReactAndroid_release();
        this.currentProvider = provider;
        return accessedFeatureFlags$ReactAndroid_release;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean disableEarlyViewCommandExecution() {
        Boolean boolValueOf = this.disableEarlyViewCommandExecutionCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.disableEarlyViewCommandExecution());
            this.accessedFeatureFlags.add("disableEarlyViewCommandExecution");
            this.disableEarlyViewCommandExecutionCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean disableFabricCommitInCXXAnimated() {
        Boolean boolValueOf = this.disableFabricCommitInCXXAnimatedCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.disableFabricCommitInCXXAnimated());
            this.accessedFeatureFlags.add("disableFabricCommitInCXXAnimated");
            this.disableFabricCommitInCXXAnimatedCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean disableMountItemReorderingAndroid() {
        Boolean boolValueOf = this.disableMountItemReorderingAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.disableMountItemReorderingAndroid());
            this.accessedFeatureFlags.add("disableMountItemReorderingAndroid");
            this.disableMountItemReorderingAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean disableOldAndroidAttachmentMetricsWorkarounds() {
        Boolean boolValueOf = this.disableOldAndroidAttachmentMetricsWorkaroundsCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.disableOldAndroidAttachmentMetricsWorkarounds());
            this.accessedFeatureFlags.add("disableOldAndroidAttachmentMetricsWorkarounds");
            this.disableOldAndroidAttachmentMetricsWorkaroundsCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean disableTextLayoutManagerCacheAndroid() {
        Boolean boolValueOf = this.disableTextLayoutManagerCacheAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.disableTextLayoutManagerCacheAndroid());
            this.accessedFeatureFlags.add("disableTextLayoutManagerCacheAndroid");
            this.disableTextLayoutManagerCacheAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableAccessibilityOrder() {
        Boolean boolValueOf = this.enableAccessibilityOrderCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableAccessibilityOrder());
            this.accessedFeatureFlags.add("enableAccessibilityOrder");
            this.enableAccessibilityOrderCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableAccumulatedUpdatesInRawPropsAndroid() {
        Boolean boolValueOf = this.enableAccumulatedUpdatesInRawPropsAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableAccumulatedUpdatesInRawPropsAndroid());
            this.accessedFeatureFlags.add("enableAccumulatedUpdatesInRawPropsAndroid");
            this.enableAccumulatedUpdatesInRawPropsAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableAndroidLinearText() {
        Boolean boolValueOf = this.enableAndroidLinearTextCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableAndroidLinearText());
            this.accessedFeatureFlags.add("enableAndroidLinearText");
            this.enableAndroidLinearTextCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableAndroidTextMeasurementOptimizations() {
        Boolean boolValueOf = this.enableAndroidTextMeasurementOptimizationsCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableAndroidTextMeasurementOptimizations());
            this.accessedFeatureFlags.add("enableAndroidTextMeasurementOptimizations");
            this.enableAndroidTextMeasurementOptimizationsCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    /* JADX INFO: renamed from: enableBridgelessArchitecture */
    public boolean getNewArchitectureEnabled() {
        Boolean boolValueOf = this.enableBridgelessArchitectureCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.getNewArchitectureEnabled());
            this.accessedFeatureFlags.add("enableBridgelessArchitecture");
            this.enableBridgelessArchitectureCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableCppPropsIteratorSetter() {
        Boolean boolValueOf = this.enableCppPropsIteratorSetterCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableCppPropsIteratorSetter());
            this.accessedFeatureFlags.add("enableCppPropsIteratorSetter");
            this.enableCppPropsIteratorSetterCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableCustomFocusSearchOnClippedElementsAndroid() {
        Boolean boolValueOf = this.enableCustomFocusSearchOnClippedElementsAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableCustomFocusSearchOnClippedElementsAndroid());
            this.accessedFeatureFlags.add("enableCustomFocusSearchOnClippedElementsAndroid");
            this.enableCustomFocusSearchOnClippedElementsAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableDestroyShadowTreeRevisionAsync() {
        Boolean boolValueOf = this.enableDestroyShadowTreeRevisionAsyncCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableDestroyShadowTreeRevisionAsync());
            this.accessedFeatureFlags.add("enableDestroyShadowTreeRevisionAsync");
            this.enableDestroyShadowTreeRevisionAsyncCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableDoubleMeasurementFixAndroid() {
        Boolean boolValueOf = this.enableDoubleMeasurementFixAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableDoubleMeasurementFixAndroid());
            this.accessedFeatureFlags.add("enableDoubleMeasurementFixAndroid");
            this.enableDoubleMeasurementFixAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableEagerMainQueueModulesOnIOS() {
        Boolean boolValueOf = this.enableEagerMainQueueModulesOnIOSCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableEagerMainQueueModulesOnIOS());
            this.accessedFeatureFlags.add("enableEagerMainQueueModulesOnIOS");
            this.enableEagerMainQueueModulesOnIOSCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableEagerRootViewAttachment() {
        Boolean boolValueOf = this.enableEagerRootViewAttachmentCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableEagerRootViewAttachment());
            this.accessedFeatureFlags.add("enableEagerRootViewAttachment");
            this.enableEagerRootViewAttachmentCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFabricLogs() {
        Boolean boolValueOf = this.enableFabricLogsCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableFabricLogs());
            this.accessedFeatureFlags.add("enableFabricLogs");
            this.enableFabricLogsCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFabricRenderer() {
        Boolean boolValueOf = this.enableFabricRendererCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableFabricRenderer());
            this.accessedFeatureFlags.add("enableFabricRenderer");
            this.enableFabricRendererCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFontScaleChangesUpdatingLayout() {
        Boolean boolValueOf = this.enableFontScaleChangesUpdatingLayoutCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableFontScaleChangesUpdatingLayout());
            this.accessedFeatureFlags.add("enableFontScaleChangesUpdatingLayout");
            this.enableFontScaleChangesUpdatingLayoutCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableIOSTextBaselineOffsetPerLine() {
        Boolean boolValueOf = this.enableIOSTextBaselineOffsetPerLineCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableIOSTextBaselineOffsetPerLine());
            this.accessedFeatureFlags.add("enableIOSTextBaselineOffsetPerLine");
            this.enableIOSTextBaselineOffsetPerLineCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableIOSViewClipToPaddingBox() {
        Boolean boolValueOf = this.enableIOSViewClipToPaddingBoxCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableIOSViewClipToPaddingBox());
            this.accessedFeatureFlags.add("enableIOSViewClipToPaddingBox");
            this.enableIOSViewClipToPaddingBoxCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableImagePrefetchingAndroid() {
        Boolean boolValueOf = this.enableImagePrefetchingAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableImagePrefetchingAndroid());
            this.accessedFeatureFlags.add("enableImagePrefetchingAndroid");
            this.enableImagePrefetchingAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableImagePrefetchingOnUiThreadAndroid() {
        Boolean boolValueOf = this.enableImagePrefetchingOnUiThreadAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableImagePrefetchingOnUiThreadAndroid());
            this.accessedFeatureFlags.add("enableImagePrefetchingOnUiThreadAndroid");
            this.enableImagePrefetchingOnUiThreadAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableImmediateUpdateModeForContentOffsetChanges() {
        Boolean boolValueOf = this.enableImmediateUpdateModeForContentOffsetChangesCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableImmediateUpdateModeForContentOffsetChanges());
            this.accessedFeatureFlags.add("enableImmediateUpdateModeForContentOffsetChanges");
            this.enableImmediateUpdateModeForContentOffsetChangesCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableImperativeFocus() {
        Boolean boolValueOf = this.enableImperativeFocusCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableImperativeFocus());
            this.accessedFeatureFlags.add("enableImperativeFocus");
            this.enableImperativeFocusCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableInteropViewManagerClassLookUpOptimizationIOS() {
        Boolean boolValueOf = this.enableInteropViewManagerClassLookUpOptimizationIOSCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableInteropViewManagerClassLookUpOptimizationIOS());
            this.accessedFeatureFlags.add("enableInteropViewManagerClassLookUpOptimizationIOS");
            this.enableInteropViewManagerClassLookUpOptimizationIOSCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableIntersectionObserverByDefault() {
        Boolean boolValueOf = this.enableIntersectionObserverByDefaultCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableIntersectionObserverByDefault());
            this.accessedFeatureFlags.add("enableIntersectionObserverByDefault");
            this.enableIntersectionObserverByDefaultCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableKeyEvents() {
        Boolean boolValueOf = this.enableKeyEventsCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableKeyEvents());
            this.accessedFeatureFlags.add("enableKeyEvents");
            this.enableKeyEventsCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableLayoutAnimationsOnAndroid() {
        Boolean boolValueOf = this.enableLayoutAnimationsOnAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableLayoutAnimationsOnAndroid());
            this.accessedFeatureFlags.add("enableLayoutAnimationsOnAndroid");
            this.enableLayoutAnimationsOnAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableLayoutAnimationsOnIOS() {
        Boolean boolValueOf = this.enableLayoutAnimationsOnIOSCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableLayoutAnimationsOnIOS());
            this.accessedFeatureFlags.add("enableLayoutAnimationsOnIOS");
            this.enableLayoutAnimationsOnIOSCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableMainQueueCoordinatorOnIOS() {
        Boolean boolValueOf = this.enableMainQueueCoordinatorOnIOSCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableMainQueueCoordinatorOnIOS());
            this.accessedFeatureFlags.add("enableMainQueueCoordinatorOnIOS");
            this.enableMainQueueCoordinatorOnIOSCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableModuleArgumentNSNullConversionIOS() {
        Boolean boolValueOf = this.enableModuleArgumentNSNullConversionIOSCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableModuleArgumentNSNullConversionIOS());
            this.accessedFeatureFlags.add("enableModuleArgumentNSNullConversionIOS");
            this.enableModuleArgumentNSNullConversionIOSCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableNativeCSSParsing() {
        Boolean boolValueOf = this.enableNativeCSSParsingCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableNativeCSSParsing());
            this.accessedFeatureFlags.add("enableNativeCSSParsing");
            this.enableNativeCSSParsingCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableNetworkEventReporting() {
        Boolean boolValueOf = this.enableNetworkEventReportingCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableNetworkEventReporting());
            this.accessedFeatureFlags.add("enableNetworkEventReporting");
            this.enableNetworkEventReportingCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enablePreparedTextLayout() {
        Boolean boolValueOf = this.enablePreparedTextLayoutCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enablePreparedTextLayout());
            this.accessedFeatureFlags.add("enablePreparedTextLayout");
            this.enablePreparedTextLayoutCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enablePropsUpdateReconciliationAndroid() {
        Boolean boolValueOf = this.enablePropsUpdateReconciliationAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enablePropsUpdateReconciliationAndroid());
            this.accessedFeatureFlags.add("enablePropsUpdateReconciliationAndroid");
            this.enablePropsUpdateReconciliationAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableResourceTimingAPI() {
        Boolean boolValueOf = this.enableResourceTimingAPICache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableResourceTimingAPI());
            this.accessedFeatureFlags.add("enableResourceTimingAPI");
            this.enableResourceTimingAPICache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableSwiftUIBasedFilters() {
        Boolean boolValueOf = this.enableSwiftUIBasedFiltersCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableSwiftUIBasedFilters());
            this.accessedFeatureFlags.add("enableSwiftUIBasedFilters");
            this.enableSwiftUIBasedFiltersCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewCulling() {
        Boolean boolValueOf = this.enableViewCullingCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableViewCulling());
            this.accessedFeatureFlags.add("enableViewCulling");
            this.enableViewCullingCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewRecycling() {
        Boolean boolValueOf = this.enableViewRecyclingCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableViewRecycling());
            this.accessedFeatureFlags.add("enableViewRecycling");
            this.enableViewRecyclingCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewRecyclingForImage() {
        Boolean boolValueOf = this.enableViewRecyclingForImageCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableViewRecyclingForImage());
            this.accessedFeatureFlags.add("enableViewRecyclingForImage");
            this.enableViewRecyclingForImageCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewRecyclingForScrollView() {
        Boolean boolValueOf = this.enableViewRecyclingForScrollViewCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableViewRecyclingForScrollView());
            this.accessedFeatureFlags.add("enableViewRecyclingForScrollView");
            this.enableViewRecyclingForScrollViewCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewRecyclingForText() {
        Boolean boolValueOf = this.enableViewRecyclingForTextCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableViewRecyclingForText());
            this.accessedFeatureFlags.add("enableViewRecyclingForText");
            this.enableViewRecyclingForTextCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewRecyclingForView() {
        Boolean boolValueOf = this.enableViewRecyclingForViewCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableViewRecyclingForView());
            this.accessedFeatureFlags.add("enableViewRecyclingForView");
            this.enableViewRecyclingForViewCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableVirtualViewClippingWithoutScrollViewClipping() {
        Boolean boolValueOf = this.enableVirtualViewClippingWithoutScrollViewClippingCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableVirtualViewClippingWithoutScrollViewClipping());
            this.accessedFeatureFlags.add("enableVirtualViewClippingWithoutScrollViewClipping");
            this.enableVirtualViewClippingWithoutScrollViewClippingCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableVirtualViewContainerStateExperimental() {
        Boolean boolValueOf = this.enableVirtualViewContainerStateExperimentalCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableVirtualViewContainerStateExperimental());
            this.accessedFeatureFlags.add("enableVirtualViewContainerStateExperimental");
            this.enableVirtualViewContainerStateExperimentalCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableVirtualViewDebugFeatures() {
        Boolean boolValueOf = this.enableVirtualViewDebugFeaturesCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableVirtualViewDebugFeatures());
            this.accessedFeatureFlags.add("enableVirtualViewDebugFeatures");
            this.enableVirtualViewDebugFeaturesCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableVirtualViewRenderState() {
        Boolean boolValueOf = this.enableVirtualViewRenderStateCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableVirtualViewRenderState());
            this.accessedFeatureFlags.add("enableVirtualViewRenderState");
            this.enableVirtualViewRenderStateCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableVirtualViewWindowFocusDetection() {
        Boolean boolValueOf = this.enableVirtualViewWindowFocusDetectionCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableVirtualViewWindowFocusDetection());
            this.accessedFeatureFlags.add("enableVirtualViewWindowFocusDetection");
            this.enableVirtualViewWindowFocusDetectionCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableWebPerformanceAPIsByDefault() {
        Boolean boolValueOf = this.enableWebPerformanceAPIsByDefaultCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableWebPerformanceAPIsByDefault());
            this.accessedFeatureFlags.add("enableWebPerformanceAPIsByDefault");
            this.enableWebPerformanceAPIsByDefaultCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixMappingOfEventPrioritiesBetweenFabricAndReact() {
        Boolean boolValueOf = this.fixMappingOfEventPrioritiesBetweenFabricAndReactCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.fixMappingOfEventPrioritiesBetweenFabricAndReact());
            this.accessedFeatureFlags.add("fixMappingOfEventPrioritiesBetweenFabricAndReact");
            this.fixMappingOfEventPrioritiesBetweenFabricAndReactCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxAssertSingleHostState() {
        Boolean boolValueOf = this.fuseboxAssertSingleHostStateCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.fuseboxAssertSingleHostState());
            this.accessedFeatureFlags.add("fuseboxAssertSingleHostState");
            this.fuseboxAssertSingleHostStateCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxEnabledRelease() {
        Boolean boolValueOf = this.fuseboxEnabledReleaseCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.fuseboxEnabledRelease());
            this.accessedFeatureFlags.add("fuseboxEnabledRelease");
            this.fuseboxEnabledReleaseCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxNetworkInspectionEnabled() {
        Boolean boolValueOf = this.fuseboxNetworkInspectionEnabledCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.fuseboxNetworkInspectionEnabled());
            this.accessedFeatureFlags.add("fuseboxNetworkInspectionEnabled");
            this.fuseboxNetworkInspectionEnabledCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public final String getAccessedFeatureFlags$ReactAndroid_release() {
        if (this.accessedFeatureFlags.isEmpty()) {
            return null;
        }
        return AbstractC2800q.o0(this.accessedFeatureFlags, ", ", null, null, 0, null, new Function1() { // from class: r3.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReactNativeFeatureFlagsLocalAccessor.getAccessedFeatureFlags$lambda$1((String) obj);
            }
        }, 30, null);
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean hideOffscreenVirtualViewsOnIOS() {
        Boolean boolValueOf = this.hideOffscreenVirtualViewsOnIOSCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.hideOffscreenVirtualViewsOnIOS());
            this.accessedFeatureFlags.add("hideOffscreenVirtualViewsOnIOS");
            this.hideOffscreenVirtualViewsOnIOSCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsAccessor
    public void override(ReactNativeFeatureFlagsProvider provider) {
        AbstractC2855l.g(provider, "provider");
        if (this.accessedFeatureFlags.isEmpty()) {
            this.currentProvider = provider;
            return;
        }
        throw new IllegalStateException("Feature flags were accessed before being overridden: " + AbstractC2800q.o0(this.accessedFeatureFlags, ", ", null, null, 0, null, new Function1() { // from class: r3.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReactNativeFeatureFlagsLocalAccessor.override$lambda$0((String) obj);
            }
        }, 30, null));
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean overrideBySynchronousMountPropsAtMountingAndroid() {
        Boolean boolValueOf = this.overrideBySynchronousMountPropsAtMountingAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.overrideBySynchronousMountPropsAtMountingAndroid());
            this.accessedFeatureFlags.add("overrideBySynchronousMountPropsAtMountingAndroid");
            this.overrideBySynchronousMountPropsAtMountingAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean perfIssuesEnabled() {
        Boolean boolValueOf = this.perfIssuesEnabledCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.perfIssuesEnabled());
            this.accessedFeatureFlags.add("perfIssuesEnabled");
            this.perfIssuesEnabledCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean perfMonitorV2Enabled() {
        Boolean boolValueOf = this.perfMonitorV2EnabledCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.perfMonitorV2Enabled());
            this.accessedFeatureFlags.add("perfMonitorV2Enabled");
            this.perfMonitorV2EnabledCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public double preparedTextCacheSize() {
        Double dValueOf = this.preparedTextCacheSizeCache;
        if (dValueOf == null) {
            dValueOf = Double.valueOf(this.currentProvider.preparedTextCacheSize());
            this.accessedFeatureFlags.add("preparedTextCacheSize");
            this.preparedTextCacheSizeCache = dValueOf;
        }
        return dValueOf.doubleValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean preventShadowTreeCommitExhaustion() {
        Boolean boolValueOf = this.preventShadowTreeCommitExhaustionCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.preventShadowTreeCommitExhaustion());
            this.accessedFeatureFlags.add("preventShadowTreeCommitExhaustion");
            this.preventShadowTreeCommitExhaustionCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean shouldPressibilityUseW3CPointerEventsForHover() {
        Boolean boolValueOf = this.shouldPressibilityUseW3CPointerEventsForHoverCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.shouldPressibilityUseW3CPointerEventsForHover());
            this.accessedFeatureFlags.add("shouldPressibilityUseW3CPointerEventsForHover");
            this.shouldPressibilityUseW3CPointerEventsForHoverCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean shouldTriggerResponderTransferOnScrollAndroid() {
        Boolean boolValueOf = this.shouldTriggerResponderTransferOnScrollAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.shouldTriggerResponderTransferOnScrollAndroid());
            this.accessedFeatureFlags.add("shouldTriggerResponderTransferOnScrollAndroid");
            this.shouldTriggerResponderTransferOnScrollAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean skipActivityIdentityAssertionOnHostPause() {
        Boolean boolValueOf = this.skipActivityIdentityAssertionOnHostPauseCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.skipActivityIdentityAssertionOnHostPause());
            this.accessedFeatureFlags.add("skipActivityIdentityAssertionOnHostPause");
            this.skipActivityIdentityAssertionOnHostPauseCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean sweepActiveTouchOnChildNativeGesturesAndroid() {
        Boolean boolValueOf = this.sweepActiveTouchOnChildNativeGesturesAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.sweepActiveTouchOnChildNativeGesturesAndroid());
            this.accessedFeatureFlags.add("sweepActiveTouchOnChildNativeGesturesAndroid");
            this.sweepActiveTouchOnChildNativeGesturesAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean traceTurboModulePromiseRejectionsOnAndroid() {
        Boolean boolValueOf = this.traceTurboModulePromiseRejectionsOnAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.traceTurboModulePromiseRejectionsOnAndroid());
            this.accessedFeatureFlags.add("traceTurboModulePromiseRejectionsOnAndroid");
            this.traceTurboModulePromiseRejectionsOnAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean updateRuntimeShadowNodeReferencesOnCommit() {
        Boolean boolValueOf = this.updateRuntimeShadowNodeReferencesOnCommitCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.updateRuntimeShadowNodeReferencesOnCommit());
            this.accessedFeatureFlags.add("updateRuntimeShadowNodeReferencesOnCommit");
            this.updateRuntimeShadowNodeReferencesOnCommitCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useAlwaysAvailableJSErrorHandling() {
        Boolean boolValueOf = this.useAlwaysAvailableJSErrorHandlingCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.useAlwaysAvailableJSErrorHandling());
            this.accessedFeatureFlags.add("useAlwaysAvailableJSErrorHandling");
            this.useAlwaysAvailableJSErrorHandlingCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useFabricInterop() {
        Boolean boolValueOf = this.useFabricInteropCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.useFabricInterop());
            this.accessedFeatureFlags.add("useFabricInterop");
            this.useFabricInteropCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useNativeEqualsInNativeReadableArrayAndroid() {
        Boolean boolValueOf = this.useNativeEqualsInNativeReadableArrayAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.useNativeEqualsInNativeReadableArrayAndroid());
            this.accessedFeatureFlags.add("useNativeEqualsInNativeReadableArrayAndroid");
            this.useNativeEqualsInNativeReadableArrayAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useNativeTransformHelperAndroid() {
        Boolean boolValueOf = this.useNativeTransformHelperAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.useNativeTransformHelperAndroid());
            this.accessedFeatureFlags.add("useNativeTransformHelperAndroid");
            this.useNativeTransformHelperAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useNativeViewConfigsInBridgelessMode() {
        Boolean boolValueOf = this.useNativeViewConfigsInBridgelessModeCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.useNativeViewConfigsInBridgelessMode());
            this.accessedFeatureFlags.add("useNativeViewConfigsInBridgelessMode");
            this.useNativeViewConfigsInBridgelessModeCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useOptimizedEventBatchingOnAndroid() {
        Boolean boolValueOf = this.useOptimizedEventBatchingOnAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.useOptimizedEventBatchingOnAndroid());
            this.accessedFeatureFlags.add("useOptimizedEventBatchingOnAndroid");
            this.useOptimizedEventBatchingOnAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useRawPropsJsiValue() {
        Boolean boolValueOf = this.useRawPropsJsiValueCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.useRawPropsJsiValue());
            this.accessedFeatureFlags.add("useRawPropsJsiValue");
            this.useRawPropsJsiValueCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useShadowNodeStateOnClone() {
        Boolean boolValueOf = this.useShadowNodeStateOnCloneCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.useShadowNodeStateOnClone());
            this.accessedFeatureFlags.add("useShadowNodeStateOnClone");
            this.useShadowNodeStateOnCloneCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useSharedAnimatedBackend() {
        Boolean boolValueOf = this.useSharedAnimatedBackendCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.useSharedAnimatedBackend());
            this.accessedFeatureFlags.add("useSharedAnimatedBackend");
            this.useSharedAnimatedBackendCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useTraitHiddenOnAndroid() {
        Boolean boolValueOf = this.useTraitHiddenOnAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.useTraitHiddenOnAndroid());
            this.accessedFeatureFlags.add("useTraitHiddenOnAndroid");
            this.useTraitHiddenOnAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useTurboModuleInterop() {
        Boolean boolValueOf = this.useTurboModuleInteropCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.useTurboModuleInterop());
            this.accessedFeatureFlags.add("useTurboModuleInterop");
            this.useTurboModuleInteropCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useTurboModules() {
        Boolean boolValueOf = this.useTurboModulesCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.useTurboModules());
            this.accessedFeatureFlags.add("useTurboModules");
            this.useTurboModulesCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public double viewCullingOutsetRatio() {
        Double dValueOf = this.viewCullingOutsetRatioCache;
        if (dValueOf == null) {
            dValueOf = Double.valueOf(this.currentProvider.viewCullingOutsetRatio());
            this.accessedFeatureFlags.add("viewCullingOutsetRatio");
            this.viewCullingOutsetRatioCache = dValueOf;
        }
        return dValueOf.doubleValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public double virtualViewHysteresisRatio() {
        Double dValueOf = this.virtualViewHysteresisRatioCache;
        if (dValueOf == null) {
            dValueOf = Double.valueOf(this.currentProvider.virtualViewHysteresisRatio());
            this.accessedFeatureFlags.add("virtualViewHysteresisRatio");
            this.virtualViewHysteresisRatioCache = dValueOf;
        }
        return dValueOf.doubleValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public double virtualViewPrerenderRatio() {
        Double dValueOf = this.virtualViewPrerenderRatioCache;
        if (dValueOf == null) {
            dValueOf = Double.valueOf(this.currentProvider.virtualViewPrerenderRatio());
            this.accessedFeatureFlags.add("virtualViewPrerenderRatio");
            this.virtualViewPrerenderRatioCache = dValueOf;
        }
        return dValueOf.doubleValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsAccessor
    public void dangerouslyReset() {
    }
}
