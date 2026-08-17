package com.facebook.yoga;

import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0003\b\u0086\u0001\n\u0002\u0010\u0014\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0087 ¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\rH\u0087 ¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0087 ¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0019\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0087 ¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b!\u0010\u0006J\u0018\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b%\u0010\nJ\u0018\u0010&\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b&\u0010\nJ(\u0010)\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b)\u0010*J(\u0010+\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b+\u0010*J \u0010-\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\rH\u0087 ¢\u0006\u0004\b-\u0010\u0013J\u0018\u0010.\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b0\u0010\nJ \u00101\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b1\u00102J>\u0010:\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u00142\u0006\u00104\u001a\u00020\u00142\u0006\u00106\u001a\u0002052\f\u00109\u001a\b\u0012\u0004\u0012\u00020807H\u0087 ¢\u0006\u0004\b:\u0010;J\u0018\u0010<\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b<\u0010\nJ\u0018\u0010=\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b=\u0010/J \u0010@\u001a\u00020\b2\u0006\u0010>\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b@\u00102J\u0018\u0010A\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bA\u0010\u001cJ \u0010C\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\bC\u0010\u001aJ\u0018\u0010D\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bD\u0010\u001cJ \u0010F\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010E\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\bF\u0010\u001aJ\u0018\u0010G\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bG\u0010\u001cJ \u0010I\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010H\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\bI\u0010\u001aJ\u0018\u0010J\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bJ\u0010\u001cJ \u0010L\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\bL\u0010\u001aJ\u0018\u0010M\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bM\u0010\u001cJ \u0010O\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\bO\u0010\u001aJ\u0018\u0010P\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bP\u0010\u001cJ \u0010R\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\bR\u0010\u001aJ\u0018\u0010S\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bS\u0010\u001cJ \u0010U\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\bU\u0010\u001aJ\u0018\u0010V\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bV\u0010\u001cJ \u0010X\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\bX\u0010\u001aJ\u0018\u0010Y\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bY\u0010\u001cJ \u0010[\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b[\u0010\u001aJ\u0018\u0010\\\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\\\u0010\u001cJ \u0010^\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b^\u0010\u001aJ\u0018\u0010_\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b_\u0010\u001cJ \u0010a\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010`\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\ba\u0010\u001aJ\u0018\u0010b\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bb\u0010cJ \u0010e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010d\u001a\u00020\u0014H\u0087 ¢\u0006\u0004\be\u0010\u0017J\u0018\u0010f\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bf\u0010cJ \u0010h\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010g\u001a\u00020\u0014H\u0087 ¢\u0006\u0004\bh\u0010\u0017J\u0018\u0010i\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bi\u0010cJ \u0010k\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010j\u001a\u00020\u0014H\u0087 ¢\u0006\u0004\bk\u0010\u0017J\u0018\u0010l\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bl\u0010$J \u0010n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010m\u001a\u00020\u0014H\u0087 ¢\u0006\u0004\bn\u0010\u0017J \u0010p\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010o\u001a\u00020\u0014H\u0087 ¢\u0006\u0004\bp\u0010\u0017J\u0018\u0010q\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bq\u0010\nJ\u0018\u0010r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\br\u0010\nJ\u0018\u0010s\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bs\u0010\nJ\u0018\u0010t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bt\u0010\nJ \u0010v\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010u\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\bv\u0010wJ(\u0010y\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010u\u001a\u00020\u000b2\u0006\u0010x\u001a\u00020\u0014H\u0087 ¢\u0006\u0004\by\u0010zJ(\u0010{\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010u\u001a\u00020\u000b2\u0006\u0010o\u001a\u00020\u0014H\u0087 ¢\u0006\u0004\b{\u0010zJ \u0010|\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010u\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b|\u0010\u001aJ \u0010}\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010u\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b}\u0010wJ(\u0010\u007f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010u\u001a\u00020\u000b2\u0006\u0010~\u001a\u00020\u0014H\u0087 ¢\u0006\u0004\b\u007f\u0010zJ*\u0010\u0080\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010u\u001a\u00020\u000b2\u0006\u0010o\u001a\u00020\u0014H\u0087 ¢\u0006\u0005\b\u0080\u0001\u0010zJ#\u0010\u0081\u0001\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010u\u001a\u00020\u000bH\u0087 ¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J+\u0010\u0084\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010u\u001a\u00020\u000b2\u0007\u0010\u0083\u0001\u001a\u00020\u0014H\u0087 ¢\u0006\u0005\b\u0084\u0001\u0010zJ\"\u0010\u0085\u0001\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010u\u001a\u00020\u000bH\u0087 ¢\u0006\u0005\b\u0085\u0001\u0010wJ+\u0010\u0087\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010u\u001a\u00020\u000b2\u0007\u0010\u0086\u0001\u001a\u00020\u0014H\u0087 ¢\u0006\u0005\b\u0087\u0001\u0010zJ*\u0010\u0088\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010u\u001a\u00020\u000b2\u0006\u0010o\u001a\u00020\u0014H\u0087 ¢\u0006\u0005\b\u0088\u0001\u0010zJ\"\u0010\u0089\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010u\u001a\u00020\u000bH\u0087 ¢\u0006\u0005\b\u0089\u0001\u0010\u001aJ\u001a\u0010\u008a\u0001\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0005\b\u008a\u0001\u0010$J\"\u0010\u008b\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u0014H\u0087 ¢\u0006\u0005\b\u008b\u0001\u0010\u0017J\"\u0010\u008c\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010o\u001a\u00020\u0014H\u0087 ¢\u0006\u0005\b\u008c\u0001\u0010\u0017J\u001a\u0010\u008d\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0005\b\u008d\u0001\u0010\nJ\u001a\u0010\u008e\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0005\b\u008e\u0001\u0010\nJ\u001a\u0010\u008f\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0005\b\u008f\u0001\u0010\nJ\u001a\u0010\u0090\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0005\b\u0090\u0001\u0010\nJ\u001a\u0010\u0091\u0001\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0005\b\u0091\u0001\u0010$J\"\u0010\u0092\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u0014H\u0087 ¢\u0006\u0005\b\u0092\u0001\u0010\u0017J\"\u0010\u0093\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010o\u001a\u00020\u0014H\u0087 ¢\u0006\u0005\b\u0093\u0001\u0010\u0017J\u001a\u0010\u0094\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0005\b\u0094\u0001\u0010\nJ\u001a\u0010\u0095\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0005\b\u0095\u0001\u0010\nJ\u001a\u0010\u0096\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0005\b\u0096\u0001\u0010\nJ\u001a\u0010\u0097\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0005\b\u0097\u0001\u0010\nJ\u001a\u0010\u0098\u0001\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0005\b\u0098\u0001\u0010$J#\u0010\u009a\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u0014H\u0087 ¢\u0006\u0005\b\u009a\u0001\u0010\u0017J\"\u0010\u009b\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010o\u001a\u00020\u0014H\u0087 ¢\u0006\u0005\b\u009b\u0001\u0010\u0017J\u001a\u0010\u009c\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0005\b\u009c\u0001\u0010\nJ\u001a\u0010\u009d\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0005\b\u009d\u0001\u0010\nJ\u001a\u0010\u009e\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0005\b\u009e\u0001\u0010\nJ\u001a\u0010\u009f\u0001\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0005\b\u009f\u0001\u0010$J#\u0010¡\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0007\u0010 \u0001\u001a\u00020\u0014H\u0087 ¢\u0006\u0005\b¡\u0001\u0010\u0017J\"\u0010¢\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010o\u001a\u00020\u0014H\u0087 ¢\u0006\u0005\b¢\u0001\u0010\u0017J\u001a\u0010£\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0005\b£\u0001\u0010\nJ\u001a\u0010¤\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0005\b¤\u0001\u0010\nJ\u001a\u0010¥\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0005\b¥\u0001\u0010\nJ\u001a\u0010¦\u0001\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0005\b¦\u0001\u0010$J#\u0010¨\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0007\u0010§\u0001\u001a\u00020\u0014H\u0087 ¢\u0006\u0005\b¨\u0001\u0010\u0017J\"\u0010©\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010o\u001a\u00020\u0014H\u0087 ¢\u0006\u0005\b©\u0001\u0010\u0017J\u001a\u0010ª\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0005\bª\u0001\u0010\nJ\u001a\u0010«\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0005\b«\u0001\u0010\nJ\u001a\u0010¬\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0005\b¬\u0001\u0010\nJ\u001a\u0010\u00ad\u0001\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0005\b\u00ad\u0001\u0010$J#\u0010¯\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0007\u0010®\u0001\u001a\u00020\u0014H\u0087 ¢\u0006\u0005\b¯\u0001\u0010\u0017J\"\u0010°\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010o\u001a\u00020\u0014H\u0087 ¢\u0006\u0005\b°\u0001\u0010\u0017J\u001a\u0010±\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0005\b±\u0001\u0010\nJ\u001a\u0010²\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0005\b²\u0001\u0010\nJ\u001a\u0010³\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0005\b³\u0001\u0010\nJ\u001a\u0010´\u0001\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0005\b´\u0001\u0010cJ#\u0010¶\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0007\u0010µ\u0001\u001a\u00020\u0014H\u0087 ¢\u0006\u0005\b¶\u0001\u0010\u0017J#\u0010¸\u0001\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0007\u0010·\u0001\u001a\u00020\u000bH\u0087 ¢\u0006\u0005\b¸\u0001\u0010wJ,\u0010º\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0007\u0010·\u0001\u001a\u00020\u000b2\u0007\u0010¹\u0001\u001a\u00020\u0014H\u0087 ¢\u0006\u0005\bº\u0001\u0010zJ,\u0010»\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0007\u0010·\u0001\u001a\u00020\u000b2\u0007\u0010¹\u0001\u001a\u00020\u0014H\u0087 ¢\u0006\u0005\b»\u0001\u0010zJ#\u0010½\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0007\u0010¼\u0001\u001a\u00020\rH\u0087 ¢\u0006\u0005\b½\u0001\u0010\u0013J#\u0010¾\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0007\u0010¼\u0001\u001a\u00020\rH\u0087 ¢\u0006\u0005\b¾\u0001\u0010\u0013J.\u0010Â\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010À\u0001\u001a\u00030¿\u00012\u0007\u0010Á\u0001\u001a\u00020\u000bH\u0087 ¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J\u001a\u0010Ä\u0001\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0005\bÄ\u0001\u0010$J#\u0010Æ\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0007\u0010Å\u0001\u001a\u00020\rH\u0087 ¢\u0006\u0005\bÆ\u0001\u0010\u0013¨\u0006Ç\u0001"}, d2 = {"Lcom/facebook/yoga/YogaNative;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "jni_YGConfigNewJNI", "()J", "nativePointer", "Li7/B;", "jni_YGConfigFreeJNI", "(J)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "feature", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.ENABLED, "jni_YGConfigSetExperimentalFeatureEnabledJNI", "(JIZ)V", "useWebDefaults", "jni_YGConfigSetUseWebDefaultsJNI", "(JZ)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "pixelsInPoint", "jni_YGConfigSetPointScaleFactorJNI", "(JF)V", "errata", "jni_YGConfigSetErrataJNI", "(JI)V", "jni_YGConfigGetErrataJNI", "(J)I", "Lcom/facebook/yoga/YogaLogger;", "logger", "jni_YGConfigSetLoggerJNI", "(JLcom/facebook/yoga/YogaLogger;)V", "jni_YGNodeNewJNI", "configPointer", "jni_YGNodeNewWithConfigJNI", "(J)J", "jni_YGNodeFinalizeJNI", "jni_YGNodeResetJNI", "childPointer", "index", "jni_YGNodeInsertChildJNI", "(JJI)V", "jni_YGNodeSwapChildJNI", "isReferenceBaseline", "jni_YGNodeSetIsReferenceBaselineJNI", "jni_YGNodeIsReferenceBaselineJNI", "(J)Z", "jni_YGNodeRemoveAllChildrenJNI", "jni_YGNodeRemoveChildJNI", "(JJ)V", "width", "height", PointerEventHelper.POINTER_TYPE_UNKNOWN, "nativePointers", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/yoga/YogaNodeJNIBase;", "nodes", "jni_YGNodeCalculateLayoutJNI", "(JFF[J[Lcom/facebook/yoga/YogaNodeJNIBase;)V", "jni_YGNodeMarkDirtyJNI", "jni_YGNodeIsDirtyJNI", "dstNativePointer", "srcNativePointer", "jni_YGNodeCopyStyleJNI", "jni_YGNodeStyleGetDirectionJNI", "direction", "jni_YGNodeStyleSetDirectionJNI", "jni_YGNodeStyleGetFlexDirectionJNI", ViewProps.FLEX_DIRECTION, "jni_YGNodeStyleSetFlexDirectionJNI", "jni_YGNodeStyleGetJustifyContentJNI", ViewProps.JUSTIFY_CONTENT, "jni_YGNodeStyleSetJustifyContentJNI", "jni_YGNodeStyleGetAlignItemsJNI", ViewProps.ALIGN_ITEMS, "jni_YGNodeStyleSetAlignItemsJNI", "jni_YGNodeStyleGetAlignSelfJNI", ViewProps.ALIGN_SELF, "jni_YGNodeStyleSetAlignSelfJNI", "jni_YGNodeStyleGetAlignContentJNI", ViewProps.ALIGN_CONTENT, "jni_YGNodeStyleSetAlignContentJNI", "jni_YGNodeStyleGetPositionTypeJNI", "positionType", "jni_YGNodeStyleSetPositionTypeJNI", "jni_YGNodeStyleGetBoxSizingJNI", "boxSizing", "jni_YGNodeStyleSetBoxSizingJNI", "jni_YGNodeStyleGetFlexWrapJNI", "wrapType", "jni_YGNodeStyleSetFlexWrapJNI", "jni_YGNodeStyleGetOverflowJNI", ViewProps.OVERFLOW, "jni_YGNodeStyleSetOverflowJNI", "jni_YGNodeStyleGetDisplayJNI", ViewProps.DISPLAY, "jni_YGNodeStyleSetDisplayJNI", "jni_YGNodeStyleGetFlexJNI", "(J)F", ViewProps.FLEX, "jni_YGNodeStyleSetFlexJNI", "jni_YGNodeStyleGetFlexGrowJNI", ViewProps.FLEX_GROW, "jni_YGNodeStyleSetFlexGrowJNI", "jni_YGNodeStyleGetFlexShrinkJNI", ViewProps.FLEX_SHRINK, "jni_YGNodeStyleSetFlexShrinkJNI", "jni_YGNodeStyleGetFlexBasisJNI", ViewProps.FLEX_BASIS, "jni_YGNodeStyleSetFlexBasisJNI", "percent", "jni_YGNodeStyleSetFlexBasisPercentJNI", "jni_YGNodeStyleSetFlexBasisAutoJNI", "jni_YGNodeStyleSetFlexBasisMaxContentJNI", "jni_YGNodeStyleSetFlexBasisFitContentJNI", "jni_YGNodeStyleSetFlexBasisStretchJNI", "edge", "jni_YGNodeStyleGetMarginJNI", "(JI)J", ViewProps.MARGIN, "jni_YGNodeStyleSetMarginJNI", "(JIF)V", "jni_YGNodeStyleSetMarginPercentJNI", "jni_YGNodeStyleSetMarginAutoJNI", "jni_YGNodeStyleGetPaddingJNI", ViewProps.PADDING, "jni_YGNodeStyleSetPaddingJNI", "jni_YGNodeStyleSetPaddingPercentJNI", "jni_YGNodeStyleGetBorderJNI", "(JI)F", "border", "jni_YGNodeStyleSetBorderJNI", "jni_YGNodeStyleGetPositionJNI", ViewProps.POSITION, "jni_YGNodeStyleSetPositionJNI", "jni_YGNodeStyleSetPositionPercentJNI", "jni_YGNodeStyleSetPositionAutoJNI", "jni_YGNodeStyleGetWidthJNI", "jni_YGNodeStyleSetWidthJNI", "jni_YGNodeStyleSetWidthPercentJNI", "jni_YGNodeStyleSetWidthAutoJNI", "jni_YGNodeStyleSetWidthMaxContentJNI", "jni_YGNodeStyleSetWidthFitContentJNI", "jni_YGNodeStyleSetWidthStretchJNI", "jni_YGNodeStyleGetHeightJNI", "jni_YGNodeStyleSetHeightJNI", "jni_YGNodeStyleSetHeightPercentJNI", "jni_YGNodeStyleSetHeightAutoJNI", "jni_YGNodeStyleSetHeightMaxContentJNI", "jni_YGNodeStyleSetHeightFitContentJNI", "jni_YGNodeStyleSetHeightStretchJNI", "jni_YGNodeStyleGetMinWidthJNI", ViewProps.MIN_WIDTH, "jni_YGNodeStyleSetMinWidthJNI", "jni_YGNodeStyleSetMinWidthPercentJNI", "jni_YGNodeStyleSetMinWidthMaxContentJNI", "jni_YGNodeStyleSetMinWidthFitContentJNI", "jni_YGNodeStyleSetMinWidthStretchJNI", "jni_YGNodeStyleGetMinHeightJNI", ViewProps.MIN_HEIGHT, "jni_YGNodeStyleSetMinHeightJNI", "jni_YGNodeStyleSetMinHeightPercentJNI", "jni_YGNodeStyleSetMinHeightMaxContentJNI", "jni_YGNodeStyleSetMinHeightFitContentJNI", "jni_YGNodeStyleSetMinHeightStretchJNI", "jni_YGNodeStyleGetMaxWidthJNI", ViewProps.MAX_WIDTH, "jni_YGNodeStyleSetMaxWidthJNI", "jni_YGNodeStyleSetMaxWidthPercentJNI", "jni_YGNodeStyleSetMaxWidthMaxContentJNI", "jni_YGNodeStyleSetMaxWidthFitContentJNI", "jni_YGNodeStyleSetMaxWidthStretchJNI", "jni_YGNodeStyleGetMaxHeightJNI", "maxheight", "jni_YGNodeStyleSetMaxHeightJNI", "jni_YGNodeStyleSetMaxHeightPercentJNI", "jni_YGNodeStyleSetMaxHeightMaxContentJNI", "jni_YGNodeStyleSetMaxHeightFitContentJNI", "jni_YGNodeStyleSetMaxHeightStretchJNI", "jni_YGNodeStyleGetAspectRatioJNI", ViewProps.ASPECT_RATIO, "jni_YGNodeStyleSetAspectRatioJNI", "gutter", "jni_YGNodeStyleGetGapJNI", "gapLength", "jni_YGNodeStyleSetGapJNI", "jni_YGNodeStyleSetGapPercentJNI", "hasMeasureFunc", "jni_YGNodeSetHasMeasureFuncJNI", "jni_YGNodeSetHasBaselineFuncJNI", PointerEventHelper.POINTER_TYPE_UNKNOWN, "styleInputsArray", "size", "jni_YGNodeSetStyleInputsJNI", "(J[FI)V", "jni_YGNodeCloneJNI", "alwaysFormContainingBlock", "jni_YGNodeSetAlwaysFormsContainingBlockJNI", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class YogaNative {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final YogaNative f20736a = new YogaNative();

    static {
        SoLoader.t("yoga");
    }

    private YogaNative() {
    }

    public static final native void jni_YGConfigFreeJNI(long nativePointer);

    public static final native int jni_YGConfigGetErrataJNI(long nativePointer);

    public static final native long jni_YGConfigNewJNI();

    public static final native void jni_YGConfigSetErrataJNI(long nativePointer, int errata);

    public static final native void jni_YGConfigSetExperimentalFeatureEnabledJNI(long nativePointer, int feature, boolean enabled);

    public static final native void jni_YGConfigSetLoggerJNI(long nativePointer, YogaLogger logger);

    public static final native void jni_YGConfigSetPointScaleFactorJNI(long nativePointer, float pixelsInPoint);

    public static final native void jni_YGConfigSetUseWebDefaultsJNI(long nativePointer, boolean useWebDefaults);

    public static final native void jni_YGNodeCalculateLayoutJNI(long nativePointer, float width, float height, long[] nativePointers, YogaNodeJNIBase[] nodes);

    public static final native long jni_YGNodeCloneJNI(long nativePointer);

    public static final native void jni_YGNodeCopyStyleJNI(long dstNativePointer, long srcNativePointer);

    public static final native void jni_YGNodeFinalizeJNI(long nativePointer);

    public static final native void jni_YGNodeInsertChildJNI(long nativePointer, long childPointer, int index);

    public static final native boolean jni_YGNodeIsDirtyJNI(long nativePointer);

    public static final native boolean jni_YGNodeIsReferenceBaselineJNI(long nativePointer);

    public static final native void jni_YGNodeMarkDirtyJNI(long nativePointer);

    public static final native long jni_YGNodeNewJNI();

    public static final native long jni_YGNodeNewWithConfigJNI(long configPointer);

    public static final native void jni_YGNodeRemoveAllChildrenJNI(long nativePointer);

    public static final native void jni_YGNodeRemoveChildJNI(long nativePointer, long childPointer);

    public static final native void jni_YGNodeResetJNI(long nativePointer);

    public static final native void jni_YGNodeSetAlwaysFormsContainingBlockJNI(long nativePointer, boolean alwaysFormContainingBlock);

    public static final native void jni_YGNodeSetHasBaselineFuncJNI(long nativePointer, boolean hasMeasureFunc);

    public static final native void jni_YGNodeSetHasMeasureFuncJNI(long nativePointer, boolean hasMeasureFunc);

    public static final native void jni_YGNodeSetIsReferenceBaselineJNI(long nativePointer, boolean isReferenceBaseline);

    public static final native void jni_YGNodeSetStyleInputsJNI(long nativePointer, float[] styleInputsArray, int size);

    public static final native int jni_YGNodeStyleGetAlignContentJNI(long nativePointer);

    public static final native int jni_YGNodeStyleGetAlignItemsJNI(long nativePointer);

    public static final native int jni_YGNodeStyleGetAlignSelfJNI(long nativePointer);

    public static final native float jni_YGNodeStyleGetAspectRatioJNI(long nativePointer);

    public static final native float jni_YGNodeStyleGetBorderJNI(long nativePointer, int edge);

    public static final native int jni_YGNodeStyleGetBoxSizingJNI(long nativePointer);

    public static final native int jni_YGNodeStyleGetDirectionJNI(long nativePointer);

    public static final native int jni_YGNodeStyleGetDisplayJNI(long nativePointer);

    public static final native long jni_YGNodeStyleGetFlexBasisJNI(long nativePointer);

    public static final native int jni_YGNodeStyleGetFlexDirectionJNI(long nativePointer);

    public static final native float jni_YGNodeStyleGetFlexGrowJNI(long nativePointer);

    public static final native float jni_YGNodeStyleGetFlexJNI(long nativePointer);

    public static final native float jni_YGNodeStyleGetFlexShrinkJNI(long nativePointer);

    public static final native int jni_YGNodeStyleGetFlexWrapJNI(long nativePointer);

    public static final native long jni_YGNodeStyleGetGapJNI(long nativePointer, int gutter);

    public static final native long jni_YGNodeStyleGetHeightJNI(long nativePointer);

    public static final native int jni_YGNodeStyleGetJustifyContentJNI(long nativePointer);

    public static final native long jni_YGNodeStyleGetMarginJNI(long nativePointer, int edge);

    public static final native long jni_YGNodeStyleGetMaxHeightJNI(long nativePointer);

    public static final native long jni_YGNodeStyleGetMaxWidthJNI(long nativePointer);

    public static final native long jni_YGNodeStyleGetMinHeightJNI(long nativePointer);

    public static final native long jni_YGNodeStyleGetMinWidthJNI(long nativePointer);

    public static final native int jni_YGNodeStyleGetOverflowJNI(long nativePointer);

    public static final native long jni_YGNodeStyleGetPaddingJNI(long nativePointer, int edge);

    public static final native long jni_YGNodeStyleGetPositionJNI(long nativePointer, int edge);

    public static final native int jni_YGNodeStyleGetPositionTypeJNI(long nativePointer);

    public static final native long jni_YGNodeStyleGetWidthJNI(long nativePointer);

    public static final native void jni_YGNodeStyleSetAlignContentJNI(long nativePointer, int alignContent);

    public static final native void jni_YGNodeStyleSetAlignItemsJNI(long nativePointer, int alignItems);

    public static final native void jni_YGNodeStyleSetAlignSelfJNI(long nativePointer, int alignSelf);

    public static final native void jni_YGNodeStyleSetAspectRatioJNI(long nativePointer, float aspectRatio);

    public static final native void jni_YGNodeStyleSetBorderJNI(long nativePointer, int edge, float border);

    public static final native void jni_YGNodeStyleSetBoxSizingJNI(long nativePointer, int boxSizing);

    public static final native void jni_YGNodeStyleSetDirectionJNI(long nativePointer, int direction);

    public static final native void jni_YGNodeStyleSetDisplayJNI(long nativePointer, int display);

    public static final native void jni_YGNodeStyleSetFlexBasisAutoJNI(long nativePointer);

    public static final native void jni_YGNodeStyleSetFlexBasisFitContentJNI(long nativePointer);

    public static final native void jni_YGNodeStyleSetFlexBasisJNI(long nativePointer, float flexBasis);

    public static final native void jni_YGNodeStyleSetFlexBasisMaxContentJNI(long nativePointer);

    public static final native void jni_YGNodeStyleSetFlexBasisPercentJNI(long nativePointer, float percent);

    public static final native void jni_YGNodeStyleSetFlexBasisStretchJNI(long nativePointer);

    public static final native void jni_YGNodeStyleSetFlexDirectionJNI(long nativePointer, int flexDirection);

    public static final native void jni_YGNodeStyleSetFlexGrowJNI(long nativePointer, float flexGrow);

    public static final native void jni_YGNodeStyleSetFlexJNI(long nativePointer, float flex);

    public static final native void jni_YGNodeStyleSetFlexShrinkJNI(long nativePointer, float flexShrink);

    public static final native void jni_YGNodeStyleSetFlexWrapJNI(long nativePointer, int wrapType);

    public static final native void jni_YGNodeStyleSetGapJNI(long nativePointer, int gutter, float gapLength);

    public static final native void jni_YGNodeStyleSetGapPercentJNI(long nativePointer, int gutter, float gapLength);

    public static final native void jni_YGNodeStyleSetHeightAutoJNI(long nativePointer);

    public static final native void jni_YGNodeStyleSetHeightFitContentJNI(long nativePointer);

    public static final native void jni_YGNodeStyleSetHeightJNI(long nativePointer, float height);

    public static final native void jni_YGNodeStyleSetHeightMaxContentJNI(long nativePointer);

    public static final native void jni_YGNodeStyleSetHeightPercentJNI(long nativePointer, float percent);

    public static final native void jni_YGNodeStyleSetHeightStretchJNI(long nativePointer);

    public static final native void jni_YGNodeStyleSetJustifyContentJNI(long nativePointer, int justifyContent);

    public static final native void jni_YGNodeStyleSetMarginAutoJNI(long nativePointer, int edge);

    public static final native void jni_YGNodeStyleSetMarginJNI(long nativePointer, int edge, float margin);

    public static final native void jni_YGNodeStyleSetMarginPercentJNI(long nativePointer, int edge, float percent);

    public static final native void jni_YGNodeStyleSetMaxHeightFitContentJNI(long nativePointer);

    public static final native void jni_YGNodeStyleSetMaxHeightJNI(long nativePointer, float maxheight);

    public static final native void jni_YGNodeStyleSetMaxHeightMaxContentJNI(long nativePointer);

    public static final native void jni_YGNodeStyleSetMaxHeightPercentJNI(long nativePointer, float percent);

    public static final native void jni_YGNodeStyleSetMaxHeightStretchJNI(long nativePointer);

    public static final native void jni_YGNodeStyleSetMaxWidthFitContentJNI(long nativePointer);

    public static final native void jni_YGNodeStyleSetMaxWidthJNI(long nativePointer, float maxWidth);

    public static final native void jni_YGNodeStyleSetMaxWidthMaxContentJNI(long nativePointer);

    public static final native void jni_YGNodeStyleSetMaxWidthPercentJNI(long nativePointer, float percent);

    public static final native void jni_YGNodeStyleSetMaxWidthStretchJNI(long nativePointer);

    public static final native void jni_YGNodeStyleSetMinHeightFitContentJNI(long nativePointer);

    public static final native void jni_YGNodeStyleSetMinHeightJNI(long nativePointer, float minHeight);

    public static final native void jni_YGNodeStyleSetMinHeightMaxContentJNI(long nativePointer);

    public static final native void jni_YGNodeStyleSetMinHeightPercentJNI(long nativePointer, float percent);

    public static final native void jni_YGNodeStyleSetMinHeightStretchJNI(long nativePointer);

    public static final native void jni_YGNodeStyleSetMinWidthFitContentJNI(long nativePointer);

    public static final native void jni_YGNodeStyleSetMinWidthJNI(long nativePointer, float minWidth);

    public static final native void jni_YGNodeStyleSetMinWidthMaxContentJNI(long nativePointer);

    public static final native void jni_YGNodeStyleSetMinWidthPercentJNI(long nativePointer, float percent);

    public static final native void jni_YGNodeStyleSetMinWidthStretchJNI(long nativePointer);

    public static final native void jni_YGNodeStyleSetOverflowJNI(long nativePointer, int overflow);

    public static final native void jni_YGNodeStyleSetPaddingJNI(long nativePointer, int edge, float padding);

    public static final native void jni_YGNodeStyleSetPaddingPercentJNI(long nativePointer, int edge, float percent);

    public static final native void jni_YGNodeStyleSetPositionAutoJNI(long nativePointer, int edge);

    public static final native void jni_YGNodeStyleSetPositionJNI(long nativePointer, int edge, float position);

    public static final native void jni_YGNodeStyleSetPositionPercentJNI(long nativePointer, int edge, float percent);

    public static final native void jni_YGNodeStyleSetPositionTypeJNI(long nativePointer, int positionType);

    public static final native void jni_YGNodeStyleSetWidthAutoJNI(long nativePointer);

    public static final native void jni_YGNodeStyleSetWidthFitContentJNI(long nativePointer);

    public static final native void jni_YGNodeStyleSetWidthJNI(long nativePointer, float width);

    public static final native void jni_YGNodeStyleSetWidthMaxContentJNI(long nativePointer);

    public static final native void jni_YGNodeStyleSetWidthPercentJNI(long nativePointer, float percent);

    public static final native void jni_YGNodeStyleSetWidthStretchJNI(long nativePointer);

    public static final native void jni_YGNodeSwapChildJNI(long nativePointer, long childPointer, int index);
}
