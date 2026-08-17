package com.facebook.react.devsupport;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.devsupport.interfaces.StackFrame;
import com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import expo.modules.notifications.service.NotificationsService;
import j7.AbstractC2800q;
import java.io.File;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001,B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010\u001aJ\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u001b¢\u0006\u0002\u0010\u001cJ\u0019\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0002\u0010\u001dJ\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001f\u001a\u00020 H\u0007¢\u0006\u0002\u0010!J\u000e\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0017J%\u0010$\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0007¢\u0006\u0002\u0010&J\u0015\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\b+R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/facebook/react/devsupport/StackTraceHelper;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "COLUMN_KEY", PointerEventHelper.POINTER_TYPE_UNKNOWN, "LINE_NUMBER_KEY", "FILE_KEY", "METHOD_NAME_KEY", "COLLAPSE_KEY", "MESSAGE_KEY", "ORIGINAL_MESSAGE_KEY", "NAME_KEY", "COMPONENT_STACK_KEY", "STACK_KEY", "ID_KEY", "IS_FATAL_KEY", "EXTRA_DATA_KEY", "STACK_FRAME_PATTERN1", "Ljava/util/regex/Pattern;", "STACK_FRAME_PATTERN2", "convertJsStackTrace", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/devsupport/interfaces/StackFrame;", StackTraceHelper.STACK_KEY, "Lcom/facebook/react/bridge/ReadableArray;", "(Lcom/facebook/react/bridge/ReadableArray;)[Lcom/facebook/react/devsupport/interfaces/StackFrame;", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)[Lcom/facebook/react/devsupport/interfaces/StackFrame;", "(Ljava/lang/String;)[Lcom/facebook/react/devsupport/interfaces/StackFrame;", "convertJavaStackTrace", NotificationsService.EXCEPTION_KEY, PointerEventHelper.POINTER_TYPE_UNKNOWN, "(Ljava/lang/Throwable;)[Lcom/facebook/react/devsupport/interfaces/StackFrame;", "formatFrameSource", "frame", "formatStackTrace", AlertFragment.ARG_TITLE, "(Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;)Ljava/lang/String;", "convertProcessedError", "Lcom/facebook/react/bridge/JavaOnlyMap;", "error", "Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ProcessedError;", "convertProcessedError$ReactAndroid_release", "StackFrameImpl", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StackTraceHelper {
    public static final String COLLAPSE_KEY = "collapse";
    public static final String COLUMN_KEY = "column";
    public static final String COMPONENT_STACK_KEY = "componentStack";
    public static final String EXTRA_DATA_KEY = "extraData";
    public static final String FILE_KEY = "file";
    public static final String ID_KEY = "id";
    public static final StackTraceHelper INSTANCE = new StackTraceHelper();
    public static final String IS_FATAL_KEY = "isFatal";
    public static final String LINE_NUMBER_KEY = "lineNumber";
    public static final String MESSAGE_KEY = "message";
    public static final String METHOD_NAME_KEY = "methodName";
    public static final String NAME_KEY = "name";
    public static final String ORIGINAL_MESSAGE_KEY = "originalMessage";
    private static final Pattern STACK_FRAME_PATTERN1;
    private static final Pattern STACK_FRAME_PATTERN2;
    public static final String STACK_KEY = "stack";

    static {
        Pattern patternCompile = Pattern.compile("^(?:(.*?)@)?(.*?)\\:([0-9]+)\\:([0-9]+)$");
        AbstractC2855l.f(patternCompile, "compile(...)");
        STACK_FRAME_PATTERN1 = patternCompile;
        Pattern patternCompile2 = Pattern.compile("\\s*(?:at)\\s*(.+?)\\s*[@(](.*):([0-9]+):([0-9]+)[)]$");
        AbstractC2855l.f(patternCompile2, "compile(...)");
        STACK_FRAME_PATTERN2 = patternCompile2;
    }

    private StackTraceHelper() {
    }

    public static final StackFrame[] convertJavaStackTrace(Throwable exception) {
        AbstractC2855l.g(exception, "exception");
        StackTraceElement[] stackTrace = exception.getStackTrace();
        int length = stackTrace.length;
        StackFrame[] stackFrameArr = new StackFrame[length];
        for (int i10 = 0; i10 < length; i10++) {
            String className = stackTrace[i10].getClassName();
            String fileName = stackTrace[i10].getFileName();
            String methodName = stackTrace[i10].getMethodName();
            AbstractC2855l.f(methodName, "getMethodName(...)");
            stackFrameArr[i10] = new StackFrameImpl(className, fileName, methodName, stackTrace[i10].getLineNumber(), -1, false, 32, null);
        }
        return stackFrameArr;
    }

    public static final StackFrame[] convertJsStackTrace(ReadableArray stack) {
        StackFrameImpl stackFrameImpl;
        int size = stack != null ? stack.size() : 0;
        if (stack == null) {
            return new StackFrame[0];
        }
        StackFrame[] stackFrameArr = new StackFrame[size];
        for (int i10 = 0; i10 < size; i10++) {
            ReadableType type = stack.getType(i10);
            if (type == ReadableType.Map) {
                ReadableMap map = stack.getMap(i10);
                if (map == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String string = map.getString("methodName");
                if (string == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String string2 = map.getString("file");
                if (string2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                boolean z10 = map.hasKey(COLLAPSE_KEY) && !map.isNull(COLLAPSE_KEY) && map.getBoolean(COLLAPSE_KEY);
                int i11 = -1;
                int i12 = (!map.hasKey("lineNumber") || map.isNull("lineNumber")) ? -1 : map.getInt("lineNumber");
                if (map.hasKey("column") && !map.isNull("column")) {
                    i11 = map.getInt("column");
                }
                stackFrameImpl = new StackFrameImpl(string2, null, string, i12, i11, z10, 2, null);
            } else {
                if (type != ReadableType.String) {
                    throw new IllegalStateException(("Cannot parse the stackframe for " + stack).toString());
                }
                String string3 = stack.getString(i10);
                if (string3 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                stackFrameImpl = new StackFrameImpl(null, null, string3, -1, -1, false, 34, null);
            }
            stackFrameArr[i10] = stackFrameImpl;
        }
        return stackFrameArr;
    }

    public static final JavaOnlyMap convertProcessedError$ReactAndroid_release(ReactJsExceptionHandler.ProcessedError error) {
        AbstractC2855l.g(error, "error");
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        for (ReactJsExceptionHandler.ProcessedError.StackFrame stackFrame : error.getStack()) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            if (stackFrame.getColumn() != null) {
                javaOnlyMap.putDouble("column", r4.intValue());
            }
            if (stackFrame.getLineNumber() != null) {
                javaOnlyMap.putDouble("lineNumber", r4.intValue());
            }
            javaOnlyMap.putString("file", stackFrame.getFile());
            javaOnlyMap.putString("methodName", stackFrame.getMethodName());
            javaOnlyArray.pushMap(javaOnlyMap);
        }
        JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
        javaOnlyMap2.putString("message", error.getMessage());
        String originalMessage = error.getOriginalMessage();
        if (originalMessage != null) {
            javaOnlyMap2.putString(ORIGINAL_MESSAGE_KEY, originalMessage);
        }
        String name = error.getName();
        if (name != null) {
            javaOnlyMap2.putString("name", name);
        }
        String componentStack = error.getComponentStack();
        if (componentStack != null) {
            javaOnlyMap2.putString(COMPONENT_STACK_KEY, componentStack);
        }
        javaOnlyMap2.putArray(STACK_KEY, javaOnlyArray);
        javaOnlyMap2.putInt("id", error.getId());
        javaOnlyMap2.putBoolean(IS_FATAL_KEY, error.isFatal());
        javaOnlyMap2.putMap("extraData", error.getExtraData());
        return javaOnlyMap2;
    }

    public static final String formatStackTrace(String title, StackFrame[] stack) {
        AbstractC2855l.g(stack, "stack");
        StringBuilder sb = new StringBuilder();
        sb.append(title);
        sb.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        for (StackFrame stackFrame : stack) {
            sb.append(stackFrame.getMethod());
            sb.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            sb.append("    ");
            sb.append(INSTANCE.formatFrameSource(stackFrame));
            sb.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    public final String formatFrameSource(StackFrame frame) {
        AbstractC2855l.g(frame, "frame");
        StringBuilder sb = new StringBuilder();
        sb.append(frame.getFileName());
        int line = frame.getLine();
        if (line > 0) {
            sb.append(":");
            sb.append(line);
            int column = frame.getColumn();
            if (column > 0) {
                sb.append(":");
                sb.append(column);
            }
        }
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;", "Lcom/facebook/react/devsupport/interfaces/StackFrame;", "file", PointerEventHelper.POINTER_TYPE_UNKNOWN, "fileName", "method", "line", PointerEventHelper.POINTER_TYPE_UNKNOWN, "column", "isCollapsed", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V", "getFile", "()Ljava/lang/String;", "getFileName", "getMethod", "getLine", "()I", "getColumn", "()Z", "toJSON", "Lorg/json/JSONObject;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StackFrameImpl implements StackFrame {
        private final int column;
        private final String file;
        private final String fileName;
        private final boolean isCollapsed;
        private final int line;
        private final String method;

        public StackFrameImpl(String str, String str2, String method, int i10, int i11, boolean z10) {
            AbstractC2855l.g(method, "method");
            this.file = str;
            this.fileName = str2;
            this.method = method;
            this.line = i10;
            this.column = i11;
            this.isCollapsed = z10;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        public int getColumn() {
            return this.column;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        public String getFile() {
            return this.file;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        public String getFileName() {
            return this.fileName;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        public int getLine() {
            return this.line;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        public String getMethod() {
            return this.method;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        /* JADX INFO: renamed from: isCollapsed, reason: from getter */
        public boolean getIsCollapsed() {
            return this.isCollapsed;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        public JSONObject toJSON() {
            String file = getFile();
            if (file == null) {
                file = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            }
            return new JSONObject(j7.K.l(i7.t.a("file", file), i7.t.a("methodName", getMethod()), i7.t.a("lineNumber", Integer.valueOf(getLine())), i7.t.a("column", Integer.valueOf(getColumn())), i7.t.a(StackTraceHelper.COLLAPSE_KEY, Boolean.valueOf(getIsCollapsed()))));
        }

        public /* synthetic */ StackFrameImpl(String str, String str2, String str3, int i10, int i11, boolean z10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i12 & 2) != 0 ? str != null ? new File(str).getName() : null : str2, str3, i10, i11, (i12 & 32) != 0 ? false : z10);
        }
    }

    public final StackFrame[] convertJsStackTrace(JSONArray stack) {
        if (stack == null) {
            return new StackFrame[0];
        }
        int length = stack.length();
        try {
            StackFrame[] stackFrameArr = new StackFrame[length];
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = stack.getJSONObject(i10);
                String string = jSONObject.getString("methodName");
                String string2 = jSONObject.getString("file");
                int i11 = -1;
                int i12 = (!jSONObject.has("lineNumber") || jSONObject.isNull("lineNumber")) ? -1 : jSONObject.getInt("lineNumber");
                if (jSONObject.has("column") && !jSONObject.isNull("column")) {
                    i11 = jSONObject.getInt("column");
                }
                int i13 = i11;
                boolean z10 = jSONObject.has(COLLAPSE_KEY) && !jSONObject.isNull(COLLAPSE_KEY) && jSONObject.getBoolean(COLLAPSE_KEY);
                AbstractC2855l.d(string);
                stackFrameArr[i10] = new StackFrameImpl(string2, null, string, i12, i13, z10, 2, null);
            }
            return stackFrameArr;
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final StackFrame[] convertJsStackTrace(String stack) {
        List listJ;
        StackFrameImpl stackFrameImpl;
        AbstractC2855l.g(stack, "stack");
        List listF = new P8.o(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).f(stack, 0);
        if (!listF.isEmpty()) {
            ListIterator listIterator = listF.listIterator(listF.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listJ = AbstractC2800q.I0(listF, listIterator.nextIndex() + 1);
                    break;
                }
            }
            listJ = AbstractC2800q.j();
        } else {
            listJ = AbstractC2800q.j();
        }
        String[] strArr = (String[]) listJ.toArray(new String[0]);
        int length = strArr.length;
        StackFrame[] stackFrameArr = new StackFrame[length];
        for (int i10 = 0; i10 < length; i10++) {
            Matcher matcher = STACK_FRAME_PATTERN1.matcher(strArr[i10]);
            Matcher matcher2 = STACK_FRAME_PATTERN2.matcher(strArr[i10]);
            if (matcher2.find()) {
                matcher = matcher2;
            } else if (!matcher.find()) {
                matcher = null;
            }
            if (matcher != null) {
                String strGroup = matcher.group(2);
                String strGroup2 = matcher.group(1);
                if (strGroup2 == null) {
                    strGroup2 = "(unknown)";
                }
                String str = strGroup2;
                String strGroup3 = matcher.group(3);
                String strGroup4 = matcher.group(4);
                if (strGroup3 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                int i11 = Integer.parseInt(strGroup3);
                if (strGroup4 != null) {
                    stackFrameImpl = new StackFrameImpl(strGroup, null, str, i11, Integer.parseInt(strGroup4), false, 34, null);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                stackFrameImpl = new StackFrameImpl(null, null, strArr[i10], -1, -1, false, 34, null);
            }
            stackFrameArr[i10] = stackFrameImpl;
        }
        return stackFrameArr;
    }
}
