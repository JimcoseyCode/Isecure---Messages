package com.facebook.react.views.textinput;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.events.BlurEvent;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.FocusEvent;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.uimanager.v;
import com.facebook.react.uimanager.w;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.facebook.react.views.scroll.ScrollEventType;
import com.facebook.react.views.text.DefaultStyleValuesUtil;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import com.facebook.react.views.text.ReactTextUpdate;
import com.facebook.react.views.text.ReactTextViewManagerCallback;
import com.facebook.react.views.text.ReactTypefaceUtils;
import com.facebook.react.views.text.TextAttributeProps;
import com.facebook.react.views.text.TextLayoutManager;
import com.facebook.react.views.text.internal.span.TextInlineImageSpan;
import d2.AbstractC2325a;
import j7.AbstractC2800q;
import j7.K;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2845b;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = ReactTextInputManager.REACT_CLASS)
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u0000 ¼\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002¼\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0012\"\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001d\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001d\u0010!J\u0017\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\"H\u0016¢\u0006\u0004\b#\u0010$J\u001b\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020&0%H\u0016¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020&0%H\u0016¢\u0006\u0004\b)\u0010(J\u001b\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0%H\u0016¢\u0006\u0004\b*\u0010(J)\u0010/\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010-H\u0017¢\u0006\u0004\b/\u00100J)\u0010/\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00101J\u001f\u00103\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u00102\u001a\u00020&H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00106\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u00105\u001a\u00020\bH\u0007¢\u0006\u0004\b6\u0010\u0011J\u001f\u00109\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u00108\u001a\u000207H\u0007¢\u0006\u0004\b9\u0010:J!\u0010<\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010;\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b<\u0010=J\u001f\u0010?\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010>\u001a\u000207H\u0007¢\u0006\u0004\b?\u0010:J!\u0010A\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010@\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bA\u0010=J!\u0010C\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010B\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bC\u0010=J!\u0010E\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010D\u001a\u0004\u0018\u00010-H\u0007¢\u0006\u0004\bE\u0010FJ\u001f\u0010I\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010H\u001a\u00020GH\u0007¢\u0006\u0004\bI\u0010JJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010K\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0010\u0010=J\u001f\u0010M\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010L\u001a\u00020GH\u0007¢\u0006\u0004\bM\u0010JJ!\u0010O\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010N\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bO\u0010=J\u001f\u0010Q\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010P\u001a\u00020GH\u0007¢\u0006\u0004\bQ\u0010JJ\u001f\u0010S\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010R\u001a\u00020GH\u0007¢\u0006\u0004\bS\u0010JJ\u001f\u0010U\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010T\u001a\u00020GH\u0007¢\u0006\u0004\bU\u0010JJ\u001f\u0010W\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010V\u001a\u000207H\u0007¢\u0006\u0004\bW\u0010:J\u001f\u0010Y\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010X\u001a\u00020GH\u0007¢\u0006\u0004\bY\u0010JJ!\u0010[\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010Z\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b[\u0010=J!\u0010]\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\\\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b]\u0010^J!\u0010_\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\\\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b_\u0010^J!\u0010`\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\\\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b`\u0010^J!\u0010a\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\\\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\ba\u0010^J\u001f\u0010c\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010b\u001a\u00020GH\u0007¢\u0006\u0004\bc\u0010JJ\u001f\u0010e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010d\u001a\u00020GH\u0007¢\u0006\u0004\be\u0010JJ\u001f\u0010g\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010f\u001a\u00020GH\u0007¢\u0006\u0004\bg\u0010JJ!\u0010h\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\\\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\bh\u0010^J!\u0010j\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010i\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\bj\u0010^J!\u0010l\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010k\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bl\u0010=J!\u0010n\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010m\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bn\u0010=J!\u0010p\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010o\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bp\u0010=J\u001f\u0010r\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010q\u001a\u00020\bH\u0007¢\u0006\u0004\br\u0010\u0011J\u001f\u0010t\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010s\u001a\u00020GH\u0007¢\u0006\u0004\bt\u0010JJ\u001f\u0010v\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010u\u001a\u00020\bH\u0007¢\u0006\u0004\bv\u0010\u0011J!\u0010x\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010w\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\bx\u0010^J!\u0010z\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010y\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bz\u0010=J!\u0010|\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010{\u001a\u0004\u0018\u00010GH\u0007¢\u0006\u0004\b|\u0010}J\u001f\u0010\u007f\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010~\u001a\u00020GH\u0007¢\u0006\u0004\b\u007f\u0010JJ\"\u0010\u0081\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0007\u0010\u0080\u0001\u001a\u00020GH\u0007¢\u0006\u0005\b\u0081\u0001\u0010JJ$\u0010\u0084\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001H\u0007¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J$\u0010\u0087\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0005\b\u0087\u0001\u0010=J$\u0010\u0089\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0005\b\u0089\u0001\u0010=J$\u0010\u008b\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010-H\u0007¢\u0006\u0005\b\u008b\u0001\u0010FJ\"\u0010\u008d\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0007\u0010\u008c\u0001\u001a\u00020GH\u0007¢\u0006\u0005\b\u008d\u0001\u0010JJ$\u0010\u008f\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0005\b\u008f\u0001\u0010=J,\u0010\u0092\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0007\u0010\u0090\u0001\u001a\u00020\b2\u0007\u0010\u0091\u0001\u001a\u000207H\u0007¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J$\u0010\u0095\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0005\b\u0095\u0001\u0010=J\"\u0010\u0096\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0007\u0010\u0096\u0001\u001a\u00020GH\u0007¢\u0006\u0005\b\u0096\u0001\u0010JJ\"\u0010\u0098\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0007\u0010\u0097\u0001\u001a\u00020GH\u0007¢\u0006\u0005\b\u0098\u0001\u0010JJ$\u0010\u009a\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\t\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0005\b\u009a\u0001\u0010=J,\u0010\u009c\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0007\u0010\u0090\u0001\u001a\u00020\b2\u0007\u0010\u009b\u0001\u001a\u000207H\u0007¢\u0006\u0006\b\u009c\u0001\u0010\u0093\u0001J-\u0010\u009d\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0007\u0010\u0090\u0001\u001a\u00020\b2\b\u0010\\\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J$\u0010 \u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\t\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0005\b \u0001\u0010=J\u001a\u0010¡\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0006\b¡\u0001\u0010¢\u0001J$\u0010¥\u0001\u001a\u00020\u000f2\u0007\u0010£\u0001\u001a\u00020\u00182\u0007\u0010¤\u0001\u001a\u00020\u0002H\u0014¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u001d\u0010§\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020&0%H\u0016¢\u0006\u0005\b§\u0001\u0010(J>\u0010¬\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0007\u0010¨\u0001\u001a\u00020\b2\u0007\u0010©\u0001\u001a\u00020\b2\u0007\u0010ª\u0001\u001a\u00020\b2\u0007\u0010«\u0001\u001a\u00020\bH\u0016¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J0\u0010²\u0001\u001a\u0004\u0018\u00010&2\u0006\u0010\r\u001a\u00020\u00022\b\u0010¯\u0001\u001a\u00030®\u00012\b\u0010±\u0001\u001a\u00030°\u0001H\u0016¢\u0006\u0006\b²\u0001\u0010³\u0001J,\u0010\u000b\u001a\u0004\u0018\u00010&2\u0006\u0010\r\u001a\u00020\u00022\b\u0010¯\u0001\u001a\u00030®\u00012\b\u0010µ\u0001\u001a\u00030´\u0001¢\u0006\u0005\b\u000b\u0010¶\u0001R)\u0010 \u001a\u0004\u0018\u00010\u001f8\u0004@\u0004X\u0084\u000e¢\u0006\u0017\n\u0005\b \u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001\"\u0006\bº\u0001\u0010»\u0001¨\u0006½\u0001"}, d2 = {"Lcom/facebook/react/views/textinput/ReactTextInputManager;", "Lcom/facebook/react/uimanager/BaseViewManager;", "Lcom/facebook/react/views/textinput/ReactEditText;", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, ReactTextInputShadowNode.PROP_TEXT, PointerEventHelper.POINTER_TYPE_UNKNOWN, "mostRecentEventCount", "Lcom/facebook/react/views/text/ReactTextUpdate;", "getReactTextUpdate", "(Ljava/lang/String;I)Lcom/facebook/react/views/text/ReactTextUpdate;", "view", "mode", "Li7/B;", "setImportantForAutofill", "(Lcom/facebook/react/views/textinput/ReactEditText;I)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hints", "setAutofillHints", "(Lcom/facebook/react/views/textinput/ReactEditText;[Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/facebook/react/views/textinput/ReactEditText;", "Lcom/facebook/react/views/text/ReactBaseTextShadowNode;", "createShadowNodeInstance", "()Lcom/facebook/react/views/text/ReactBaseTextShadowNode;", "Lcom/facebook/react/views/text/ReactTextViewManagerCallback;", "reactTextViewManagerCallback", "(Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Lcom/facebook/react/views/text/ReactBaseTextShadowNode;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "getExportedCustomBubblingEventTypeConstants", "()Ljava/util/Map;", "getExportedCustomDirectEventTypeConstants", "getCommandsMap", "reactEditText", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "receiveCommand", "(Lcom/facebook/react/views/textinput/ReactEditText;ILcom/facebook/react/bridge/ReadableArray;)V", "(Lcom/facebook/react/views/textinput/ReactEditText;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "extraData", "updateExtraData", "(Lcom/facebook/react/views/textinput/ReactEditText;Ljava/lang/Object;)V", ViewProps.LINE_HEIGHT, "setLineHeight", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.FONT_SIZE, "setFontSize", "(Lcom/facebook/react/views/textinput/ReactEditText;F)V", ViewProps.FONT_FAMILY, "setFontFamily", "(Lcom/facebook/react/views/textinput/ReactEditText;Ljava/lang/String;)V", ViewProps.MAX_FONT_SIZE_MULTIPLIER, "setMaxFontSizeMultiplier", ViewProps.FONT_WEIGHT, "setFontWeight", ViewProps.FONT_STYLE, "setFontStyle", ViewProps.FONT_VARIANT, "setFontVariant", "(Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/bridge/ReadableArray;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "includepad", "setIncludeFontPadding", "(Lcom/facebook/react/views/textinput/ReactEditText;Z)V", "value", "onSelectionChange", "setOnSelectionChange", "submitBehavior", "setSubmitBehavior", "onContentSizeChange", "setOnContentSizeChange", "onScroll", "setOnScroll", "onKeyPress", "setOnKeyPress", ViewProps.LETTER_SPACING, "setLetterSpacing", ViewProps.ALLOW_FONT_SCALING, "setAllowFontScaling", ReactTextInputShadowNode.PROP_PLACEHOLDER, "setPlaceholder", ViewProps.COLOR, "setPlaceholderTextColor", "(Lcom/facebook/react/views/textinput/ReactEditText;Ljava/lang/Integer;)V", "setSelectionColor", "setSelectionHandleColor", "setCursorColor", "caretHidden", "setCaretHidden", "contextMenuHidden", "setContextMenuHidden", "selectTextOnFocus", "setSelectTextOnFocus", "setColor", "underlineColor", "setUnderlineColor", ViewProps.TEXT_ALIGN, "setTextAlign", ViewProps.TEXT_ALIGN_VERTICAL, "setTextAlignVertical", "resource", "setInlineImageLeft", ViewProps.PADDING, "setInlineImagePadding", "editable", "setEditable", "numLines", "setNumLines", "maxLength", "setMaxLength", "autoComplete", "setTextContentType", "autoCorrect", "setAutoCorrect", "(Lcom/facebook/react/views/textinput/ReactEditText;Ljava/lang/Boolean;)V", "multiline", "setMultiline", "password", "setSecureTextEntry", "Lcom/facebook/react/bridge/Dynamic;", "autoCapitalize", "setAutoCapitalize", "(Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/bridge/Dynamic;)V", "keyboardType", "setKeyboardType", "returnKeyType", "setReturnKeyType", "acceptDragAndDropTypes", "setAcceptDragAndDropTypes", "disableFullscreenUI", "setDisableFullscreenUI", "returnKeyLabel", "setReturnKeyLabel", "index", ViewProps.BORDER_RADIUS, "setBorderRadius", "(Lcom/facebook/react/views/textinput/ReactEditText;IF)V", "borderStyle", "setBorderStyle", "showKeyboardOnFocus", "autoFocus", "setAutoFocus", "textDecorationLineString", "setTextDecorationLine", "width", "setBorderWidth", "setBorderColor", "(Lcom/facebook/react/views/textinput/ReactEditText;ILjava/lang/Integer;)V", ViewProps.OVERFLOW, "setOverflow", "onAfterUpdateTransaction", "(Lcom/facebook/react/views/textinput/ReactEditText;)V", "reactContext", "editText", "addEventEmitters", "(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/facebook/react/views/textinput/ReactEditText;)V", "getExportedViewConstants", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "setPadding", "(Lcom/facebook/react/views/textinput/ReactEditText;IIII)V", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "props", "Lcom/facebook/react/uimanager/StateWrapper;", "stateWrapper", "updateState", "(Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/uimanager/ReactStylesDiffMap;Lcom/facebook/react/uimanager/StateWrapper;)Ljava/lang/Object;", "Lcom/facebook/react/common/mapbuffer/MapBuffer;", "state", "(Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/uimanager/ReactStylesDiffMap;Lcom/facebook/react/common/mapbuffer/MapBuffer;)Ljava/lang/Object;", "Lcom/facebook/react/views/text/ReactTextViewManagerCallback;", "getReactTextViewManagerCallback", "()Lcom/facebook/react/views/text/ReactTextViewManagerCallback;", "setReactTextViewManagerCallback", "(Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)V", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ReactTextInputManager extends BaseViewManager<ReactEditText, LayoutShadowNode> {
    private static final int AUTOCAPITALIZE_FLAGS = 28672;
    private static final int BLUR_TEXT_INPUT = 2;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String[] DRAWABLE_HANDLE_FIELDS;
    private static final String[] DRAWABLE_HANDLE_RESOURCES;
    private static final InputFilter[] EMPTY_FILTERS;
    private static final int FOCUS_TEXT_INPUT = 1;
    private static final int IME_ACTION_ID = 1648;
    private static final int INPUT_TYPE_KEYBOARD_DECIMAL_PAD = 8194;
    private static final int INPUT_TYPE_KEYBOARD_NUMBERED = 12290;
    private static final int INPUT_TYPE_KEYBOARD_NUMBER_PAD = 2;
    private static final String KEYBOARD_TYPE_DECIMAL_PAD = "decimal-pad";
    private static final String KEYBOARD_TYPE_EMAIL_ADDRESS = "email-address";
    private static final String KEYBOARD_TYPE_NUMBER_PAD = "number-pad";
    private static final String KEYBOARD_TYPE_NUMERIC = "numeric";
    private static final String KEYBOARD_TYPE_PHONE_PAD = "phone-pad";
    private static final String KEYBOARD_TYPE_URI = "url";
    private static final String KEYBOARD_TYPE_VISIBLE_PASSWORD = "visible-password";
    public static final String REACT_CLASS = "AndroidTextInput";
    private static final Map<String, String> REACT_PROPS_AUTOFILL_HINTS_MAP;
    private static final int SET_MOST_RECENT_EVENT_COUNT = 3;
    private static final int SET_TEXT_AND_SELECTION = 4;
    private static final String TAG;
    private static final short TX_STATE_KEY_ATTRIBUTED_STRING = 0;
    private static final short TX_STATE_KEY_MOST_RECENT_EVENT_COUNT = 3;
    private static final short TX_STATE_KEY_PARAGRAPH_ATTRIBUTES = 1;
    private static final int UNSET = -1;
    private ReactTextViewManagerCallback reactTextViewManagerCallback;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001fR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010)\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010&R\u0014\u0010*\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010&R\u0014\u0010+\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010&R\u0014\u0010,\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010&R\u0014\u0010-\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010&R\u0014\u0010.\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\u0019R\u0014\u0010/\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010\u0019R\u0014\u00100\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010\u0019R\u0014\u00101\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010\u0019R\u0014\u00102\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010\u0019R\u0014\u00103\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010\u0019R\u0014\u00104\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010\u0019R\u001c\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u000106058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u0010&R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0017058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0017058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u0014\u0010=\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u0010&¨\u0006>"}, d2 = {"Lcom/facebook/react/views/textinput/ReactTextInputManager$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "shouldHideCursorForEmailTextInput", "()Z", "Lcom/facebook/react/views/textinput/ReactEditText;", "view", "Li7/B;", "checkPasswordType", "(Lcom/facebook/react/views/textinput/ReactEditText;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "flagsToUnset", "flagsToSet", "updateStagedInputTypeFlag", "(Lcom/facebook/react/views/textinput/ReactEditText;II)V", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "editText", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "getEventDispatcher", "(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/textinput/ReactEditText;)Lcom/facebook/react/uimanager/events/EventDispatcher;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "REACT_CLASS", PointerEventHelper.POINTER_TYPE_UNKNOWN, "TX_STATE_KEY_ATTRIBUTED_STRING", "S", "TX_STATE_KEY_PARAGRAPH_ATTRIBUTES", "TX_STATE_KEY_MOST_RECENT_EVENT_COUNT", PointerEventHelper.POINTER_TYPE_UNKNOWN, "REACT_PROPS_AUTOFILL_HINTS_MAP", "Ljava/util/Map;", "FOCUS_TEXT_INPUT", "I", "BLUR_TEXT_INPUT", "SET_MOST_RECENT_EVENT_COUNT", "SET_TEXT_AND_SELECTION", "INPUT_TYPE_KEYBOARD_NUMBER_PAD", "INPUT_TYPE_KEYBOARD_DECIMAL_PAD", "INPUT_TYPE_KEYBOARD_NUMBERED", "AUTOCAPITALIZE_FLAGS", "KEYBOARD_TYPE_EMAIL_ADDRESS", "KEYBOARD_TYPE_NUMERIC", "KEYBOARD_TYPE_DECIMAL_PAD", "KEYBOARD_TYPE_NUMBER_PAD", "KEYBOARD_TYPE_PHONE_PAD", "KEYBOARD_TYPE_VISIBLE_PASSWORD", "KEYBOARD_TYPE_URI", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/text/InputFilter;", "EMPTY_FILTERS", "[Landroid/text/InputFilter;", "UNSET", "DRAWABLE_HANDLE_RESOURCES", "[Ljava/lang/String;", "DRAWABLE_HANDLE_FIELDS", "IME_ACTION_ID", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkPasswordType(ReactEditText view) {
            if ((view.getStagedInputType() & ReactTextInputManager.INPUT_TYPE_KEYBOARD_NUMBERED) == 0 || (view.getStagedInputType() & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
                return;
            }
            updateStagedInputTypeFlag(view, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, 16);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final EventDispatcher getEventDispatcher(ReactContext reactContext, ReactEditText editText) {
            return UIManagerHelper.getEventDispatcherForReactTag(reactContext, editText.getId());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean shouldHideCursorForEmailTextInput() {
            String MANUFACTURER = Build.MANUFACTURER;
            AbstractC2855l.f(MANUFACTURER, "MANUFACTURER");
            String lowerCase = MANUFACTURER.toLowerCase(Locale.ROOT);
            AbstractC2855l.f(lowerCase, "toLowerCase(...)");
            return Build.VERSION.SDK_INT == 29 && P8.q.Q(lowerCase, "xiaomi", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void updateStagedInputTypeFlag(ReactEditText view, int flagsToUnset, int flagsToSet) {
            view.setStagedInputType(((~flagsToUnset) & view.getStagedInputType()) | flagsToSet);
        }

        public final String getTAG() {
            return ReactTextInputManager.TAG;
        }

        private Companion() {
        }
    }

    static {
        String simpleName = ReactTextInputManager.class.getSimpleName();
        AbstractC2855l.f(simpleName, "getSimpleName(...)");
        TAG = simpleName;
        REACT_PROPS_AUTOFILL_HINTS_MAP = K.l(i7.t.a("birthdate-day", "birthDateDay"), i7.t.a("birthdate-full", "birthDateFull"), i7.t.a("birthdate-month", "birthDateMonth"), i7.t.a("birthdate-year", "birthDateYear"), i7.t.a("cc-csc", "creditCardSecurityCode"), i7.t.a("cc-exp", "creditCardExpirationDate"), i7.t.a("cc-exp-day", "creditCardExpirationDay"), i7.t.a("cc-exp-month", "creditCardExpirationMonth"), i7.t.a("cc-exp-year", "creditCardExpirationYear"), i7.t.a("cc-number", "creditCardNumber"), i7.t.a("email", "emailAddress"), i7.t.a("gender", "gender"), i7.t.a("name", "personName"), i7.t.a("name-family", "personFamilyName"), i7.t.a("name-given", "personGivenName"), i7.t.a("name-middle", "personMiddleName"), i7.t.a("name-middle-initial", "personMiddleInitial"), i7.t.a("name-prefix", "personNamePrefix"), i7.t.a("name-suffix", "personNameSuffix"), i7.t.a("password", "password"), i7.t.a("password-new", "newPassword"), i7.t.a("postal-address", "postalAddress"), i7.t.a("postal-address-country", "addressCountry"), i7.t.a("postal-address-extended", "extendedAddress"), i7.t.a("postal-address-extended-postal-code", "extendedPostalCode"), i7.t.a("postal-address-locality", "addressLocality"), i7.t.a("postal-address-region", "addressRegion"), i7.t.a("postal-code", "postalCode"), i7.t.a("street-address", "streetAddress"), i7.t.a("sms-otp", "smsOTPCode"), i7.t.a("tel", "phoneNumber"), i7.t.a("tel-country-code", "phoneCountryCode"), i7.t.a("tel-national", "phoneNational"), i7.t.a("tel-device", "phoneNumberDevice"), i7.t.a("username", "username"), i7.t.a("username-new", "newUsername"));
        EMPTY_FILTERS = new InputFilter[0];
        DRAWABLE_HANDLE_RESOURCES = new String[]{"mTextSelectHandleLeftRes", "mTextSelectHandleRightRes", "mTextSelectHandleRes"};
        DRAWABLE_HANDLE_FIELDS = new String[]{"mSelectHandleLeft", "mSelectHandleRight", "mSelectHandleCenter"};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEventEmitters$lambda$2(ThemedReactContext themedReactContext, ReactEditText reactEditText, View view, boolean z10) {
        int surfaceId = themedReactContext.getSurfaceId();
        EventDispatcher eventDispatcher = INSTANCE.getEventDispatcher(themedReactContext, reactEditText);
        if (z10) {
            if (eventDispatcher != null) {
                eventDispatcher.dispatchEvent(new FocusEvent(surfaceId, reactEditText.getId()));
            }
        } else {
            if (eventDispatcher != null) {
                eventDispatcher.dispatchEvent(new BlurEvent(surfaceId, reactEditText.getId()));
            }
            if (eventDispatcher != null) {
                eventDispatcher.dispatchEvent(new ReactTextInputEndEditingEvent(surfaceId, reactEditText.getId(), String.valueOf(reactEditText.getText())));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addEventEmitters$lambda$3(ReactEditText reactEditText, ThemedReactContext themedReactContext, TextView textView, int i10, KeyEvent keyEvent) {
        EventDispatcher eventDispatcher;
        if ((i10 & 255) == 0 && i10 != 0) {
            return true;
        }
        boolean zIsMultiline$ReactAndroid_release = reactEditText.isMultiline$ReactAndroid_release();
        boolean zShouldSubmitOnReturn = reactEditText.shouldSubmitOnReturn();
        boolean zShouldBlurOnReturn = reactEditText.shouldBlurOnReturn();
        if (zShouldSubmitOnReturn && (eventDispatcher = INSTANCE.getEventDispatcher(themedReactContext, reactEditText)) != null) {
            eventDispatcher.dispatchEvent(new ReactTextInputSubmitEditingEvent(themedReactContext.getSurfaceId(), reactEditText.getId(), String.valueOf(reactEditText.getText())));
        }
        if (zShouldBlurOnReturn) {
            reactEditText.clearFocusAndMaybeRefocus$ReactAndroid_release();
        }
        return zShouldBlurOnReturn || zShouldSubmitOnReturn || !zIsMultiline$ReactAndroid_release || i10 == 5 || i10 == 7;
    }

    private final ReactTextUpdate getReactTextUpdate(String text, int mostRecentEventCount) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) text);
        return new ReactTextUpdate(spannableStringBuilder, mostRecentEventCount, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0);
    }

    private final void setAutofillHints(ReactEditText view, String... hints) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        view.setAutofillHints((String[]) Arrays.copyOf(hints, hints.length));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return K.l(i7.t.a("focusTextInput", 1), i7.t.a("blurTextInput", 2));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomBubblingEventTypeConstants = super.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants == null) {
            exportedCustomBubblingEventTypeConstants = new LinkedHashMap<>();
        }
        exportedCustomBubblingEventTypeConstants.putAll(K.l(i7.t.a("topSubmitEditing", K.f(i7.t.a("phasedRegistrationNames", K.l(i7.t.a("bubbled", "onSubmitEditing"), i7.t.a("captured", "onSubmitEditingCapture"))))), i7.t.a("topEndEditing", K.f(i7.t.a("phasedRegistrationNames", K.l(i7.t.a("bubbled", "onEndEditing"), i7.t.a("captured", "onEndEditingCapture"))))), i7.t.a(ReactTextInputKeyPressEvent.EVENT_NAME, K.f(i7.t.a("phasedRegistrationNames", K.l(i7.t.a("bubbled", "onKeyPress"), i7.t.a("captured", "onKeyPressCapture")))))));
        return exportedCustomBubblingEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new LinkedHashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(K.f(i7.t.a(ScrollEventType.INSTANCE.getJSEventName(ScrollEventType.SCROLL), K.f(i7.t.a("registrationName", "onScroll")))));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return K.f(i7.t.a("AutoCapitalizationType", K.l(i7.t.a("none", 0), i7.t.a("characters", 4096), i7.t.a("words", 8192), i7.t.a("sentences", 16384))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    protected final ReactTextViewManagerCallback getReactTextViewManagerCallback() {
        return this.reactTextViewManagerCallback;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return ReactTextInputShadowNode.class;
    }

    @ReactProp(name = "acceptDragAndDropTypes")
    public final void setAcceptDragAndDropTypes(ReactEditText view, ReadableArray acceptDragAndDropTypes) {
        AbstractC2855l.g(view, "view");
        if (acceptDragAndDropTypes == null) {
            view.setDragAndDropFilter(null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = acceptDragAndDropTypes.size();
        for (int i10 = 0; i10 < size; i10++) {
            String string = acceptDragAndDropTypes.getString(i10);
            if (string != null) {
                arrayList.add(string);
            }
        }
        view.setDragAndDropFilter(arrayList);
    }

    @ReactProp(defaultBoolean = true, name = ViewProps.ALLOW_FONT_SCALING)
    public final void setAllowFontScaling(ReactEditText view, boolean allowFontScaling) {
        AbstractC2855l.g(view, "view");
        view.setAllowFontScaling(allowFontScaling);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    @ReactProp(name = "autoCapitalize")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setAutoCapitalize(ReactEditText view, Dynamic autoCapitalize) {
        int iAsInt;
        String strAsString;
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(autoCapitalize, "autoCapitalize");
        if (autoCapitalize.getType() != ReadableType.Number) {
            if (autoCapitalize.getType() == ReadableType.String && (strAsString = autoCapitalize.asString()) != null) {
                switch (strAsString.hashCode()) {
                    case 3387192:
                        if (strAsString.equals("none")) {
                            iAsInt = 0;
                            break;
                        }
                        break;
                    case 113318569:
                        if (strAsString.equals("words")) {
                            iAsInt = 8192;
                            break;
                        }
                        break;
                    case 490141296:
                        strAsString.equals("sentences");
                        iAsInt = 16384;
                        break;
                    case 1245424234:
                        if (strAsString.equals("characters")) {
                            iAsInt = 4096;
                            break;
                        }
                        break;
                }
            } else {
                iAsInt = 16384;
            }
        } else {
            iAsInt = autoCapitalize.asInt();
        }
        INSTANCE.updateStagedInputTypeFlag(view, AUTOCAPITALIZE_FLAGS, iAsInt);
    }

    @ReactProp(name = "autoCorrect")
    public final void setAutoCorrect(ReactEditText view, Boolean autoCorrect) {
        AbstractC2855l.g(view, "view");
        INSTANCE.updateStagedInputTypeFlag(view, 557056, AbstractC2855l.b(autoCorrect, Boolean.TRUE) ? 32768 : AbstractC2855l.b(autoCorrect, Boolean.FALSE) ? 524288 : 0);
    }

    @ReactProp(defaultBoolean = false, name = "autoFocus")
    public final void setAutoFocus(ReactEditText view, boolean autoFocus) {
        AbstractC2855l.g(view, "view");
        view.setAutoFocus(autoFocus);
    }

    @ReactPropGroup(customType = "Color", names = {ViewProps.BORDER_COLOR, ViewProps.BORDER_LEFT_COLOR, ViewProps.BORDER_RIGHT_COLOR, ViewProps.BORDER_TOP_COLOR, ViewProps.BORDER_BOTTOM_COLOR})
    public final void setBorderColor(ReactEditText view, int index, Integer color) {
        AbstractC2855l.g(view, "view");
        BackgroundStyleApplicator.setBorderColor(view, LogicalEdge.ALL, color);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {ViewProps.BORDER_RADIUS, ViewProps.BORDER_TOP_LEFT_RADIUS, ViewProps.BORDER_TOP_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_LEFT_RADIUS})
    public final void setBorderRadius(ReactEditText view, int index, float borderRadius) {
        AbstractC2855l.g(view, "view");
        BackgroundStyleApplicator.setBorderRadius(view, (BorderRadiusProp) BorderRadiusProp.getEntries().get(index), Float.isNaN(borderRadius) ? null : new LengthPercentage(borderRadius, LengthPercentageType.POINT));
    }

    @ReactProp(name = "borderStyle")
    public final void setBorderStyle(ReactEditText view, String borderStyle) {
        AbstractC2855l.g(view, "view");
        BackgroundStyleApplicator.setBorderStyle(view, borderStyle != null ? BorderStyle.INSTANCE.fromString(borderStyle) : null);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {ViewProps.BORDER_WIDTH, ViewProps.BORDER_LEFT_WIDTH, ViewProps.BORDER_RIGHT_WIDTH, ViewProps.BORDER_TOP_WIDTH, ViewProps.BORDER_BOTTOM_WIDTH})
    public final void setBorderWidth(ReactEditText view, int index, float width) {
        AbstractC2855l.g(view, "view");
        BackgroundStyleApplicator.setBorderWidth(view, (LogicalEdge) LogicalEdge.getEntries().get(index), Float.valueOf(width));
    }

    @ReactProp(defaultBoolean = false, name = "caretHidden")
    public final void setCaretHidden(ReactEditText view, boolean caretHidden) {
        AbstractC2855l.g(view, "view");
        if (view.getStagedInputType() == 32 && INSTANCE.shouldHideCursorForEmailTextInput()) {
            return;
        }
        view.setCursorVisible(!caretHidden);
    }

    @ReactProp(customType = "Color", name = ViewProps.COLOR)
    public final void setColor(ReactEditText view, Integer color) {
        AbstractC2855l.g(view, "view");
        if (color != null) {
            view.setTextColor(color.intValue());
            return;
        }
        Context context = view.getContext();
        AbstractC2855l.f(context, "getContext(...)");
        ColorStateList defaultTextColor = DefaultStyleValuesUtil.getDefaultTextColor(context);
        if (defaultTextColor != null) {
            view.setTextColor(defaultTextColor);
            return;
        }
        Context context2 = view.getContext();
        ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Could not get default text color from View Context: " + (context2 != null ? context2.getClass().getCanonicalName() : "null")));
    }

    @ReactProp(defaultBoolean = false, name = "contextMenuHidden")
    public final void setContextMenuHidden(ReactEditText view, boolean contextMenuHidden) {
        AbstractC2855l.g(view, "view");
        view.setContextMenuHidden(contextMenuHidden);
    }

    @ReactProp(customType = "Color", name = "cursorColor")
    public final void setCursorColor(ReactEditText view, Integer color) {
        AbstractC2855l.g(view, "view");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            Drawable textCursorDrawable = view.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                if (color != null) {
                    w.a();
                    textCursorDrawable.setColorFilter(v.a(color.intValue(), BlendMode.SRC_IN));
                } else {
                    textCursorDrawable.clearColorFilter();
                }
                view.setTextCursorDrawable(textCursorDrawable);
                return;
            }
            return;
        }
        if (i10 == 28) {
            return;
        }
        try {
            Field declaredField = view.getClass().getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i11 = declaredField.getInt(view);
            if (i11 == 0) {
                return;
            }
            Drawable drawableE = androidx.core.content.a.e(view.getContext(), i11);
            Drawable drawableMutate = drawableE != null ? drawableE.mutate() : null;
            if (drawableMutate == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (color != null) {
                drawableMutate.setColorFilter(color.intValue(), PorterDuff.Mode.SRC_IN);
            } else {
                drawableMutate.clearColorFilter();
            }
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(view);
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            declaredField3.set(obj, new Drawable[]{drawableMutate, drawableMutate});
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }

    @ReactProp(defaultBoolean = false, name = "disableFullscreenUI")
    public final void setDisableFullscreenUI(ReactEditText view, boolean disableFullscreenUI) {
        AbstractC2855l.g(view, "view");
        view.setDisableFullscreenUI(disableFullscreenUI);
    }

    @ReactProp(defaultBoolean = true, name = "editable")
    public final void setEditable(ReactEditText view, boolean editable) {
        AbstractC2855l.g(view, "view");
        view.setEnabled(editable);
    }

    @ReactProp(name = ViewProps.FONT_FAMILY)
    public final void setFontFamily(ReactEditText view, String fontFamily) {
        AbstractC2855l.g(view, "view");
        view.setFontFamily(fontFamily);
    }

    @ReactProp(defaultFloat = ViewDefaults.FONT_SIZE_SP, name = ViewProps.FONT_SIZE)
    public final void setFontSize(ReactEditText view, float fontSize) {
        AbstractC2855l.g(view, "view");
        view.setFontSize(fontSize);
    }

    @ReactProp(name = ViewProps.FONT_STYLE)
    public final void setFontStyle(ReactEditText view, String fontStyle) {
        AbstractC2855l.g(view, "view");
        view.setFontStyle(fontStyle);
    }

    @ReactProp(name = ViewProps.FONT_VARIANT)
    public final void setFontVariant(ReactEditText view, ReadableArray fontVariant) {
        AbstractC2855l.g(view, "view");
        view.setFontFeatureSettings(ReactTypefaceUtils.parseFontVariant(fontVariant));
    }

    @ReactProp(name = ViewProps.FONT_WEIGHT)
    public final void setFontWeight(ReactEditText view, String fontWeight) {
        AbstractC2855l.g(view, "view");
        view.setFontWeight(fontWeight);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    @ReactProp(name = "importantForAutofill")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setImportantForAutofill(ReactEditText view, String value) {
        int i10;
        AbstractC2855l.g(view, "view");
        if (value == null) {
            i10 = 0;
        } else {
            int iHashCode = value.hashCode();
            if (iHashCode != 3521) {
                if (iHashCode != 119527) {
                    if (iHashCode != 1723649149) {
                        if (iHashCode == 1828836387 && value.equals("yesExcludeDescendants")) {
                            i10 = 4;
                        }
                    } else if (value.equals("noExcludeDescendants")) {
                        i10 = 8;
                    }
                } else if (value.equals("yes")) {
                    i10 = 1;
                }
            } else if (value.equals("no")) {
                i10 = 2;
            }
        }
        setImportantForAutofill(view, i10);
    }

    @ReactProp(defaultBoolean = true, name = ViewProps.INCLUDE_FONT_PADDING)
    public final void setIncludeFontPadding(ReactEditText view, boolean includepad) {
        AbstractC2855l.g(view, "view");
        view.setIncludeFontPadding(includepad);
    }

    @ReactProp(name = "inlineImageLeft")
    public final void setInlineImageLeft(ReactEditText view, String resource) {
        AbstractC2855l.g(view, "view");
        Context context = view.getContext();
        AbstractC2855l.f(context, "getContext(...)");
        view.setCompoundDrawablesWithIntrinsicBounds(ResourceDrawableIdHelper.getResourceDrawableId(context, resource), 0, 0, 0);
    }

    @ReactProp(name = "inlineImagePadding")
    public final void setInlineImagePadding(ReactEditText view, int padding) {
        AbstractC2855l.g(view, "view");
        view.setCompoundDrawablePadding(padding);
    }

    @ReactProp(name = "keyboardType")
    public final void setKeyboardType(ReactEditText view, String keyboardType) {
        AbstractC2855l.g(view, "view");
        int i10 = 1;
        if (P8.q.x("numeric", keyboardType, true)) {
            i10 = INPUT_TYPE_KEYBOARD_NUMBERED;
        } else if (P8.q.x(KEYBOARD_TYPE_NUMBER_PAD, keyboardType, true)) {
            i10 = 2;
        } else if (P8.q.x(KEYBOARD_TYPE_DECIMAL_PAD, keyboardType, true)) {
            i10 = INPUT_TYPE_KEYBOARD_DECIMAL_PAD;
        } else if (P8.q.x(KEYBOARD_TYPE_EMAIL_ADDRESS, keyboardType, true)) {
            if (INSTANCE.shouldHideCursorForEmailTextInput()) {
                view.setCursorVisible(false);
            }
            i10 = 33;
        } else if (P8.q.x(KEYBOARD_TYPE_PHONE_PAD, keyboardType, true)) {
            i10 = 3;
        } else if (P8.q.x(KEYBOARD_TYPE_VISIBLE_PASSWORD, keyboardType, true)) {
            i10 = 144;
        } else if (P8.q.x(KEYBOARD_TYPE_URI, keyboardType, true)) {
            i10 = 16;
        }
        Companion companion = INSTANCE;
        companion.updateStagedInputTypeFlag(view, 15, i10);
        companion.checkPasswordType(view);
    }

    @ReactProp(defaultFloat = 0.0f, name = ViewProps.LETTER_SPACING)
    public final void setLetterSpacing(ReactEditText view, float letterSpacing) {
        AbstractC2855l.g(view, "view");
        view.setLetterSpacingPt(letterSpacing);
    }

    @ReactProp(defaultFloat = 0.0f, name = ViewProps.LINE_HEIGHT)
    public final void setLineHeight(ReactEditText view, int lineHeight) {
        AbstractC2855l.g(view, "view");
        view.setLineHeight(lineHeight);
    }

    @ReactProp(defaultFloat = Float.NaN, name = ViewProps.MAX_FONT_SIZE_MULTIPLIER)
    public final void setMaxFontSizeMultiplier(ReactEditText view, float maxFontSizeMultiplier) {
        AbstractC2855l.g(view, "view");
        view.setMaxFontSizeMultiplier(maxFontSizeMultiplier);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[PHI: r1
      0x0046: PHI (r1v10 android.text.InputFilter[]) = (r1v8 android.text.InputFilter[]), (r1v0 android.text.InputFilter[]), (r1v0 android.text.InputFilter[]) binds: [B:31:0x006f, B:8:0x0017, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @ReactProp(name = "maxLength")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setMaxLength(ReactEditText view, Integer maxLength) {
        AbstractC2855l.g(view, "view");
        InputFilter[] filters = view.getFilters();
        InputFilter[] inputFilterArr = EMPTY_FILTERS;
        if (maxLength == null) {
            AbstractC2855l.d(filters);
            if (!(filters.length == 0)) {
                LinkedList linkedList = new LinkedList();
                Iterator itA = AbstractC2845b.a(filters);
                while (itA.hasNext()) {
                    InputFilter inputFilter = (InputFilter) itA.next();
                    if (!(inputFilter instanceof InputFilter.LengthFilter)) {
                        linkedList.add(inputFilter);
                    }
                }
                filters = !linkedList.isEmpty() ? (InputFilter[]) linkedList.toArray(new InputFilter[0]) : inputFilterArr;
            }
        } else {
            AbstractC2855l.d(filters);
            if (filters.length == 0) {
                filters = new InputFilter[]{new InputFilter.LengthFilter(maxLength.intValue())};
            } else {
                int length = filters.length;
                boolean z10 = false;
                for (int i10 = 0; i10 < length; i10++) {
                    if (filters[i10] instanceof InputFilter.LengthFilter) {
                        filters[i10] = new InputFilter.LengthFilter(maxLength.intValue());
                        z10 = true;
                    }
                }
                if (!z10) {
                    inputFilterArr = new InputFilter[filters.length + 1];
                    System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
                    filters[filters.length] = new InputFilter.LengthFilter(maxLength.intValue());
                }
            }
        }
        view.setFilters(filters);
    }

    @ReactProp(defaultBoolean = false, name = "multiline")
    public final void setMultiline(ReactEditText view, boolean multiline) {
        AbstractC2855l.g(view, "view");
        INSTANCE.updateStagedInputTypeFlag(view, multiline ? 0 : 131072, multiline ? 131072 : 0);
    }

    @ReactProp(defaultInt = 1, name = ViewProps.NUMBER_OF_LINES)
    public final void setNumLines(ReactEditText view, int numLines) {
        AbstractC2855l.g(view, "view");
        view.setLines(numLines);
    }

    @ReactProp(defaultBoolean = false, name = "onContentSizeChange")
    public final void setOnContentSizeChange(ReactEditText view, boolean onContentSizeChange) {
        AbstractC2855l.g(view, "view");
        if (onContentSizeChange) {
            view.setContentSizeWatcher(new ReactTextContentSizeWatcher(view));
        } else {
            view.setContentSizeWatcher(null);
        }
    }

    @ReactProp(defaultBoolean = false, name = "onKeyPress")
    public final void setOnKeyPress(ReactEditText view, boolean onKeyPress) {
        AbstractC2855l.g(view, "view");
        view.setOnKeyPress(onKeyPress);
    }

    @ReactProp(defaultBoolean = false, name = "onScroll")
    public final void setOnScroll(ReactEditText view, boolean onScroll) {
        AbstractC2855l.g(view, "view");
        if (onScroll) {
            view.setScrollWatcher(new ReactTextScrollWatcher(view));
        } else {
            view.setScrollWatcher(null);
        }
    }

    @ReactProp(defaultBoolean = false, name = "onSelectionChange")
    public final void setOnSelectionChange(ReactEditText view, boolean onSelectionChange) {
        AbstractC2855l.g(view, "view");
        if (onSelectionChange) {
            view.setSelectionWatcher$ReactAndroid_release(new ReactTextSelectionWatcher(view));
        } else {
            view.setSelectionWatcher$ReactAndroid_release(null);
        }
    }

    @ReactProp(name = ViewProps.OVERFLOW)
    public final void setOverflow(ReactEditText view, String overflow) {
        AbstractC2855l.g(view, "view");
        view.setOverflow(overflow);
    }

    @ReactProp(name = ReactTextInputShadowNode.PROP_PLACEHOLDER)
    public final void setPlaceholder(ReactEditText view, String placeholder) {
        AbstractC2855l.g(view, "view");
        view.setPlaceholder(placeholder);
    }

    @ReactProp(customType = "Color", name = "placeholderTextColor")
    public final void setPlaceholderTextColor(ReactEditText view, Integer color) {
        AbstractC2855l.g(view, "view");
        if (color != null) {
            view.setHintTextColor(color.intValue());
            return;
        }
        Context context = view.getContext();
        AbstractC2855l.f(context, "getContext(...)");
        view.setHintTextColor(DefaultStyleValuesUtil.getDefaultTextColorHint(context));
    }

    protected final void setReactTextViewManagerCallback(ReactTextViewManagerCallback reactTextViewManagerCallback) {
        this.reactTextViewManagerCallback = reactTextViewManagerCallback;
    }

    @ReactProp(name = "returnKeyLabel")
    public final void setReturnKeyLabel(ReactEditText view, String returnKeyLabel) {
        AbstractC2855l.g(view, "view");
        view.setImeActionLabel(returnKeyLabel, IME_ACTION_ID);
    }

    @ReactProp(name = "returnKeyType")
    public final void setReturnKeyType(ReactEditText view, String returnKeyType) {
        AbstractC2855l.g(view, "view");
        view.setReturnKeyType(returnKeyType);
    }

    @ReactProp(defaultBoolean = false, name = "secureTextEntry")
    public final void setSecureTextEntry(ReactEditText view, boolean password) {
        AbstractC2855l.g(view, "view");
        Companion companion = INSTANCE;
        companion.updateStagedInputTypeFlag(view, 144, password ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT : 0);
        companion.checkPasswordType(view);
    }

    @ReactProp(defaultBoolean = false, name = "selectTextOnFocus")
    public final void setSelectTextOnFocus(ReactEditText view, boolean selectTextOnFocus) {
        AbstractC2855l.g(view, "view");
        view.setSelectTextOnFocus(selectTextOnFocus);
    }

    @ReactProp(customType = "Color", name = "selectionColor")
    public final void setSelectionColor(ReactEditText view, Integer color) {
        AbstractC2855l.g(view, "view");
        if (color != null) {
            view.setHighlightColor(color.intValue());
            return;
        }
        Context context = view.getContext();
        AbstractC2855l.f(context, "getContext(...)");
        view.setHighlightColor(DefaultStyleValuesUtil.getDefaultTextColorHighlight(context));
    }

    @ReactProp(customType = "Color", name = "selectionHandleColor")
    public final void setSelectionHandleColor(ReactEditText view, Integer color) {
        int i10;
        AbstractC2855l.g(view, "view");
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            Drawable textSelectHandle = view.getTextSelectHandle();
            Drawable drawableMutate = textSelectHandle != null ? textSelectHandle.mutate() : null;
            if (drawableMutate == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Drawable textSelectHandleLeft = view.getTextSelectHandleLeft();
            Drawable drawableMutate2 = textSelectHandleLeft != null ? textSelectHandleLeft.mutate() : null;
            if (drawableMutate2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Drawable textSelectHandleRight = view.getTextSelectHandleRight();
            Drawable drawableMutate3 = textSelectHandleRight != null ? textSelectHandleRight.mutate() : null;
            if (drawableMutate3 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (color != null) {
                w.a();
                BlendModeColorFilter blendModeColorFilterA = v.a(color.intValue(), BlendMode.SRC_IN);
                drawableMutate.setColorFilter(blendModeColorFilterA);
                drawableMutate2.setColorFilter(blendModeColorFilterA);
                drawableMutate3.setColorFilter(blendModeColorFilterA);
            } else {
                drawableMutate.clearColorFilter();
                drawableMutate2.clearColorFilter();
                drawableMutate3.clearColorFilter();
            }
            view.setTextSelectHandle(drawableMutate);
            view.setTextSelectHandleLeft(drawableMutate2);
            view.setTextSelectHandleRight(drawableMutate3);
            return;
        }
        if (i11 == 28) {
            return;
        }
        int length = DRAWABLE_HANDLE_RESOURCES.length;
        for (int i12 = 0; i12 < length; i12++) {
            try {
                Field declaredField = view.getClass().getDeclaredField(DRAWABLE_HANDLE_RESOURCES[i12]);
                declaredField.setAccessible(true);
                i10 = declaredField.getInt(view);
            } catch (IllegalAccessException | NoSuchFieldException unused) {
            }
            if (i10 == 0) {
                return;
            }
            Drawable drawableE = androidx.core.content.a.e(view.getContext(), i10);
            Drawable drawableMutate4 = drawableE != null ? drawableE.mutate() : null;
            if (drawableMutate4 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (color != null) {
                drawableMutate4.setColorFilter(color.intValue(), PorterDuff.Mode.SRC_IN);
            } else {
                drawableMutate4.clearColorFilter();
            }
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(view);
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Field declaredField3 = obj.getClass().getDeclaredField(DRAWABLE_HANDLE_FIELDS[i12]);
            declaredField3.setAccessible(true);
            declaredField3.set(obj, drawableMutate4);
        }
    }

    @ReactProp(name = "submitBehavior")
    public final void setSubmitBehavior(ReactEditText view, String submitBehavior) {
        AbstractC2855l.g(view, "view");
        view.setSubmitBehavior(submitBehavior);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        if (r7.equals("auto") == false) goto L31;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @ReactProp(name = ViewProps.TEXT_ALIGN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTextAlign(ReactEditText view, String textAlign) {
        AbstractC2855l.g(view, "view");
        if (AbstractC2855l.b("justify", textAlign)) {
            if (Build.VERSION.SDK_INT >= 26) {
                view.setJustificationMode(1);
            }
            view.setGravityHorizontal$ReactAndroid_release(3);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            view.setJustificationMode(0);
        }
        if (textAlign != null) {
            switch (textAlign.hashCode()) {
                case -1364013995:
                    if (textAlign.equals("center")) {
                        view.setGravityHorizontal$ReactAndroid_release(1);
                    }
                    AbstractC2325a.I(ReactConstants.TAG, "Invalid textAlign: " + textAlign);
                    view.setGravityHorizontal$ReactAndroid_release(0);
                    break;
                case 3005871:
                    break;
                case 3317767:
                    if (textAlign.equals(ViewProps.LEFT)) {
                        view.setGravityHorizontal$ReactAndroid_release(3);
                    }
                    AbstractC2325a.I(ReactConstants.TAG, "Invalid textAlign: " + textAlign);
                    view.setGravityHorizontal$ReactAndroid_release(0);
                    break;
                case 108511772:
                    if (textAlign.equals(ViewProps.RIGHT)) {
                        view.setGravityHorizontal$ReactAndroid_release(5);
                    }
                    AbstractC2325a.I(ReactConstants.TAG, "Invalid textAlign: " + textAlign);
                    view.setGravityHorizontal$ReactAndroid_release(0);
                    break;
                default:
                    AbstractC2325a.I(ReactConstants.TAG, "Invalid textAlign: " + textAlign);
                    view.setGravityHorizontal$ReactAndroid_release(0);
                    break;
            }
            return;
        }
        view.setGravityHorizontal$ReactAndroid_release(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r5.equals("auto") == false) goto L22;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @ReactProp(name = ViewProps.TEXT_ALIGN_VERTICAL)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTextAlignVertical(ReactEditText view, String textAlignVertical) {
        AbstractC2855l.g(view, "view");
        if (textAlignVertical != null) {
            switch (textAlignVertical.hashCode()) {
                case -1383228885:
                    if (textAlignVertical.equals(ViewProps.BOTTOM)) {
                        view.setGravityVertical$ReactAndroid_release(80);
                    }
                    AbstractC2325a.I(ReactConstants.TAG, "Invalid textAlignVertical: " + textAlignVertical);
                    view.setGravityVertical$ReactAndroid_release(0);
                    break;
                case -1364013995:
                    if (textAlignVertical.equals("center")) {
                        view.setGravityVertical$ReactAndroid_release(16);
                    }
                    AbstractC2325a.I(ReactConstants.TAG, "Invalid textAlignVertical: " + textAlignVertical);
                    view.setGravityVertical$ReactAndroid_release(0);
                    break;
                case 115029:
                    if (textAlignVertical.equals(ViewProps.TOP)) {
                        view.setGravityVertical$ReactAndroid_release(48);
                    }
                    AbstractC2325a.I(ReactConstants.TAG, "Invalid textAlignVertical: " + textAlignVertical);
                    view.setGravityVertical$ReactAndroid_release(0);
                    break;
                case 3005871:
                    break;
                default:
                    AbstractC2325a.I(ReactConstants.TAG, "Invalid textAlignVertical: " + textAlignVertical);
                    view.setGravityVertical$ReactAndroid_release(0);
                    break;
            }
            return;
        }
        view.setGravityVertical$ReactAndroid_release(0);
    }

    @ReactProp(name = "autoComplete")
    public final void setTextContentType(ReactEditText view, String autoComplete) {
        AbstractC2855l.g(view, "view");
        if (autoComplete == null) {
            setImportantForAutofill(view, 2);
            return;
        }
        if (AbstractC2855l.b("off", autoComplete)) {
            setImportantForAutofill(view, 2);
            return;
        }
        Map<String, String> map = REACT_PROPS_AUTOFILL_HINTS_MAP;
        if (!map.containsKey(autoComplete)) {
            AbstractC2325a.I(ReactConstants.TAG, "Invalid autoComplete: " + autoComplete);
            setImportantForAutofill(view, 2);
            return;
        }
        String[] strArr = new String[1];
        String str = map.get(autoComplete);
        if (str == null) {
            throw new IllegalStateException("Required value was null.");
        }
        strArr[0] = str;
        setAutofillHints(view, strArr);
    }

    @ReactProp(name = ViewProps.TEXT_DECORATION_LINE)
    public final void setTextDecorationLine(ReactEditText view, String textDecorationLineString) {
        List listJ;
        AbstractC2855l.g(view, "view");
        view.setPaintFlags(view.getPaintFlags() & (-25));
        if (textDecorationLineString == null) {
            return;
        }
        List listF = new P8.o(" ").f(textDecorationLineString, 0);
        if (listF.isEmpty()) {
            listJ = AbstractC2800q.j();
        } else {
            ListIterator listIterator = listF.listIterator(listF.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listJ = AbstractC2800q.I0(listF, listIterator.nextIndex() + 1);
                    break;
                }
            }
            listJ = AbstractC2800q.j();
        }
        for (String str : (String[]) listJ.toArray(new String[0])) {
            if (AbstractC2855l.b(str, "underline")) {
                view.setPaintFlags(view.getPaintFlags() | 8);
            } else if (AbstractC2855l.b(str, "line-through")) {
                view.setPaintFlags(view.getPaintFlags() | 16);
            }
        }
    }

    @ReactProp(customType = "Color", name = "underlineColorAndroid")
    public final void setUnderlineColor(ReactEditText view, Integer underlineColor) {
        AbstractC2855l.g(view, "view");
        Drawable background = view.getBackground();
        if (background == null) {
            return;
        }
        if (background.getConstantState() != null) {
            try {
                Drawable drawableMutate = background.mutate();
                if (drawableMutate == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                background = drawableMutate;
            } catch (NullPointerException e10) {
                AbstractC2325a.n(TAG, "NullPointerException when setting underlineColorAndroid for TextInput", e10);
            }
        }
        if (underlineColor == null) {
            background.clearColorFilter();
        } else {
            background.setColorFilter(underlineColor.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @ReactProp(defaultBoolean = true, name = "showSoftInputOnFocus")
    public final void showKeyboardOnFocus(ReactEditText view, boolean showKeyboardOnFocus) {
        AbstractC2855l.g(view, "view");
        view.setShowSoftInputOnFocus(showKeyboardOnFocus);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(final ThemedReactContext reactContext, final ReactEditText editText) {
        AbstractC2855l.g(reactContext, "reactContext");
        AbstractC2855l.g(editText, "editText");
        editText.setEventDispatcher(INSTANCE.getEventDispatcher(reactContext, editText));
        editText.addTextChangedListener(new ReactTextInputTextWatcher(reactContext, editText));
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.facebook.react.views.textinput.t
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                ReactTextInputManager.addEventEmitters$lambda$2(reactContext, editText, view, z10);
            }
        });
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.facebook.react.views.textinput.u
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                return ReactTextInputManager.addEventEmitters$lambda$3(editText, reactContext, textView, i10, keyEvent);
            }
        });
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactBaseTextShadowNode createShadowNodeInstance() {
        return new ReactTextInputShadowNode(null, 1, null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactEditText createViewInstance(ThemedReactContext context) {
        AbstractC2855l.g(context, "context");
        ReactEditText reactEditText = new ReactEditText(context);
        reactEditText.setInputType(reactEditText.getInputType() & (-131073));
        reactEditText.setReturnKeyType("done");
        reactEditText.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return reactEditText;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(ReactEditText view) {
        AbstractC2855l.g(view, "view");
        super.onAfterUpdateTransaction(view);
        view.maybeUpdateTypeface();
        view.commitStagedInputType$ReactAndroid_release();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(ReactEditText view, int left, int top, int right, int bottom) {
        AbstractC2855l.g(view, "view");
        view.setPadding(left, top, right, bottom);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(ReactEditText view, Object extraData) {
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(extraData, "extraData");
        if (extraData instanceof ReactTextUpdate) {
            ReactTextUpdate reactTextUpdate = (ReactTextUpdate) extraData;
            int paddingLeft = (int) reactTextUpdate.getPaddingLeft();
            int paddingTop = (int) reactTextUpdate.getPaddingTop();
            int paddingRight = (int) reactTextUpdate.getPaddingRight();
            int paddingBottom = (int) reactTextUpdate.getPaddingBottom();
            int length = -1;
            if (paddingLeft != -1 || paddingTop != -1 || paddingRight != -1 || paddingBottom != -1) {
                if (paddingLeft == -1) {
                    paddingLeft = view.getPaddingLeft();
                }
                if (paddingTop == -1) {
                    paddingTop = view.getPaddingTop();
                }
                if (paddingRight == -1) {
                    paddingRight = view.getPaddingRight();
                }
                if (paddingBottom == -1) {
                    paddingBottom = view.getPaddingBottom();
                }
                view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
            }
            if (reactTextUpdate.getContainsImages()) {
                TextInlineImageSpan.INSTANCE.possiblyUpdateInlineImageSpans(reactTextUpdate.getText(), view);
            }
            if (view.getSelectionStart() == view.getSelectionEnd()) {
                Editable text = view.getText();
                length = reactTextUpdate.getText().length() - ((text != null ? text.length() : 0) - view.getSelectionStart());
            }
            view.maybeSetTextFromState(reactTextUpdate);
            view.maybeSetSelection(reactTextUpdate.getJsEventCounter(), length, length);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(ReactEditText view, ReactStylesDiffMap props, StateWrapper stateWrapper) {
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(props, "props");
        AbstractC2855l.g(stateWrapper, "stateWrapper");
        if (ReactEditText.INSTANCE.getDEBUG_MODE()) {
            AbstractC2325a.m(TAG, "updateState: [" + view.getId() + "]");
        }
        if (view.getStateWrapper() == null) {
            view.setPadding(0, 0, 0, 0);
        }
        view.setStateWrapper(stateWrapper);
        ReadableMapBuffer stateDataMapBuffer = stateWrapper.getStateDataMapBuffer();
        if (stateDataMapBuffer != null) {
            return getReactTextUpdate(view, props, stateDataMapBuffer);
        }
        return null;
    }

    private final void setImportantForAutofill(ReactEditText view, int mode) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        view.setImportantForAutofill(mode);
    }

    public final ReactBaseTextShadowNode createShadowNodeInstance(ReactTextViewManagerCallback reactTextViewManagerCallback) {
        return new ReactTextInputShadowNode(reactTextViewManagerCallback);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactEditText reactEditText, int commandId, ReadableArray args) {
        AbstractC2855l.g(reactEditText, "reactEditText");
        if (commandId == 1) {
            receiveCommand(reactEditText, "focus", args);
        } else if (commandId == 2) {
            receiveCommand(reactEditText, "blur", args);
        } else {
            if (commandId != 4) {
                return;
            }
            receiveCommand(reactEditText, "setTextAndSelection", args);
        }
    }

    public final Object getReactTextUpdate(ReactEditText view, ReactStylesDiffMap props, MapBuffer state) {
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(props, "props");
        AbstractC2855l.g(state, "state");
        if (state.getCount() == 0) {
            return null;
        }
        MapBuffer mapBuffer = state.getMapBuffer(0);
        MapBuffer mapBuffer2 = state.getMapBuffer(1);
        TextLayoutManager textLayoutManager = TextLayoutManager.INSTANCE;
        Context context = view.getContext();
        AbstractC2855l.f(context, "getContext(...)");
        Spannable orCreateSpannableForText = textLayoutManager.getOrCreateSpannableForText(context, mapBuffer, this.reactTextViewManagerCallback);
        TextAttributeProps.Companion companion = TextAttributeProps.INSTANCE;
        return ReactTextUpdate.INSTANCE.buildReactTextUpdateFromState(orCreateSpannableForText, state.getInt(3), companion.getTextAlignment(props, textLayoutManager.isRTL(mapBuffer), view.getGravityHorizontal$ReactAndroid_release()), companion.getTextBreakStrategy(mapBuffer2.getString(2)), companion.getJustificationMode(props, Build.VERSION.SDK_INT >= 26 ? view.getJustificationMode() : 0));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactEditText reactEditText, String commandId, ReadableArray args) {
        AbstractC2855l.g(reactEditText, "reactEditText");
        AbstractC2855l.g(commandId, "commandId");
        switch (commandId.hashCode()) {
            case -1699362314:
                if (!commandId.equals("blurTextInput")) {
                    return;
                }
                break;
            case 3027047:
                if (!commandId.equals("blur")) {
                    return;
                }
                break;
            case 97604824:
                if (!commandId.equals("focus")) {
                    return;
                }
                reactEditText.requestFocusFromJS();
                return;
            case 1427010500:
                if (commandId.equals("setTextAndSelection")) {
                    if (args != null) {
                        int i10 = args.getInt(0);
                        if (i10 == -1) {
                            return;
                        }
                        int i11 = args.getInt(2);
                        int i12 = args.getInt(3);
                        if (i12 == -1) {
                            i12 = i11;
                        }
                        if (!args.isNull(1)) {
                            reactEditText.maybeSetTextFromJS(getReactTextUpdate(args.getString(1), i10));
                        }
                        reactEditText.maybeSetSelection(i10, i11, i12);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                return;
            case 1690703013:
                if (!commandId.equals("focusTextInput")) {
                    return;
                }
                reactEditText.requestFocusFromJS();
                return;
            default:
                return;
        }
        reactEditText.clearFocusFromJS$ReactAndroid_release();
    }
}
