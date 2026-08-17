package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.C2750m;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\r2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/facebook/react/animated/ObjectAnimatedNode;", "Lcom/facebook/react/animated/AnimatedNode;", "Lcom/facebook/react/bridge/ReadableMap;", "config", "Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "nativeAnimatedNodesManager", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/NativeAnimatedNodesManager;)V", "Lcom/facebook/react/bridge/ReadableArray;", "source", "Lcom/facebook/react/bridge/JavaOnlyArray;", "collectViewUpdatesHelper", "(Lcom/facebook/react/bridge/ReadableArray;)Lcom/facebook/react/bridge/JavaOnlyArray;", "Lcom/facebook/react/bridge/JavaOnlyMap;", "(Lcom/facebook/react/bridge/ReadableMap;)Lcom/facebook/react/bridge/JavaOnlyMap;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "propKey", "propsMap", "Li7/B;", "collectViewUpdates", "(Ljava/lang/String;Lcom/facebook/react/bridge/JavaOnlyMap;)V", "prettyPrint$ReactAndroid_release", "()Ljava/lang/String;", "prettyPrint", "Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "configClone", "Lcom/facebook/react/bridge/JavaOnlyMap;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ObjectAnimatedNode extends AnimatedNode {
    private static final String NODE_TAG_KEY = "nodeTag";
    private static final String VALUE_KEY = "value";
    private final JavaOnlyMap configClone;
    private final NativeAnimatedNodesManager nativeAnimatedNodesManager;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ObjectAnimatedNode(ReadableMap config, NativeAnimatedNodesManager nativeAnimatedNodesManager) {
        AbstractC2855l.g(config, "config");
        AbstractC2855l.g(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.nativeAnimatedNodesManager = nativeAnimatedNodesManager;
        this.configClone = JavaOnlyMap.INSTANCE.deepClone(config);
    }

    private final JavaOnlyArray collectViewUpdatesHelper(ReadableArray source) {
        if (source == null) {
            return null;
        }
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int size = source.size();
        for (int i10 = 0; i10 < size; i10++) {
            switch (WhenMappings.$EnumSwitchMapping$0[source.getType(i10).ordinal()]) {
                case 1:
                    javaOnlyArray.pushNull();
                    break;
                case 2:
                    javaOnlyArray.pushBoolean(source.getBoolean(i10));
                    break;
                case 3:
                    javaOnlyArray.pushDouble(source.getDouble(i10));
                    break;
                case 4:
                    javaOnlyArray.pushString(source.getString(i10));
                    break;
                case 5:
                    ReadableMap map = source.getMap(i10);
                    if (map != null && map.hasKey(NODE_TAG_KEY) && map.getType(NODE_TAG_KEY) == ReadableType.Number) {
                        AnimatedNode nodeById = this.nativeAnimatedNodesManager.getNodeById(map.getInt(NODE_TAG_KEY));
                        if (nodeById == null) {
                            throw new IllegalArgumentException("Mapped value node does not exist");
                        }
                        if (nodeById instanceof ValueAnimatedNode) {
                            ValueAnimatedNode valueAnimatedNode = (ValueAnimatedNode) nodeById;
                            Object objectValue = valueAnimatedNode.getObjectValue();
                            if (objectValue instanceof Integer) {
                                javaOnlyArray.pushInt(((Number) objectValue).intValue());
                            } else if (objectValue instanceof String) {
                                javaOnlyArray.pushString((String) objectValue);
                            } else {
                                javaOnlyArray.pushDouble(valueAnimatedNode.getValue());
                            }
                        } else if (nodeById instanceof ColorAnimatedNode) {
                            javaOnlyArray.pushInt(((ColorAnimatedNode) nodeById).getColor());
                        }
                    } else {
                        javaOnlyArray.pushMap(collectViewUpdatesHelper(source.getMap(i10)));
                    }
                    break;
                case 6:
                    javaOnlyArray.pushArray(collectViewUpdatesHelper(source.getArray(i10)));
                    break;
                default:
                    throw new C2750m();
            }
        }
        return javaOnlyArray;
    }

    public final void collectViewUpdates(String propKey, JavaOnlyMap propsMap) {
        AbstractC2855l.g(propKey, "propKey");
        AbstractC2855l.g(propsMap, "propsMap");
        ReadableType type = this.configClone.getType(VALUE_KEY);
        if (type == ReadableType.Map) {
            propsMap.putMap(propKey, collectViewUpdatesHelper(this.configClone.getMap(VALUE_KEY)));
        } else {
            if (type != ReadableType.Array) {
                throw new IllegalArgumentException("Invalid value type for ObjectAnimatedNode");
            }
            propsMap.putArray(propKey, collectViewUpdatesHelper(this.configClone.getArray(VALUE_KEY)));
        }
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public String prettyPrint$ReactAndroid_release() {
        return "ObjectAnimatedNode[" + this.tag + "]: mConfig: " + this.configClone;
    }

    private final JavaOnlyMap collectViewUpdatesHelper(ReadableMap source) {
        if (source == null) {
            return null;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = source.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            switch (WhenMappings.$EnumSwitchMapping$0[source.getType(strNextKey).ordinal()]) {
                case 1:
                    javaOnlyMap.putNull(strNextKey);
                    break;
                case 2:
                    javaOnlyMap.putBoolean(strNextKey, source.getBoolean(strNextKey));
                    break;
                case 3:
                    javaOnlyMap.putDouble(strNextKey, source.getDouble(strNextKey));
                    break;
                case 4:
                    javaOnlyMap.putString(strNextKey, source.getString(strNextKey));
                    break;
                case 5:
                    ReadableMap map = source.getMap(strNextKey);
                    if (map != null && map.hasKey(NODE_TAG_KEY) && map.getType(NODE_TAG_KEY) == ReadableType.Number) {
                        AnimatedNode nodeById = this.nativeAnimatedNodesManager.getNodeById(map.getInt(NODE_TAG_KEY));
                        if (nodeById != null) {
                            if (nodeById instanceof ValueAnimatedNode) {
                                ValueAnimatedNode valueAnimatedNode = (ValueAnimatedNode) nodeById;
                                Object objectValue = valueAnimatedNode.getObjectValue();
                                if (objectValue instanceof Integer) {
                                    javaOnlyMap.putInt(strNextKey, ((Number) objectValue).intValue());
                                } else if (objectValue instanceof String) {
                                    javaOnlyMap.putString(strNextKey, (String) objectValue);
                                } else {
                                    javaOnlyMap.putDouble(strNextKey, valueAnimatedNode.getValue());
                                }
                            } else if (nodeById instanceof ColorAnimatedNode) {
                                javaOnlyMap.putInt(strNextKey, ((ColorAnimatedNode) nodeById).getColor());
                            }
                        } else {
                            throw new IllegalArgumentException("Mapped value node does not exist");
                        }
                    } else {
                        javaOnlyMap.putMap(strNextKey, collectViewUpdatesHelper(map));
                    }
                    break;
                case 6:
                    javaOnlyMap.putArray(strNextKey, collectViewUpdatesHelper(source.getArray(strNextKey)));
                    break;
                default:
                    throw new C2750m();
            }
        }
        return javaOnlyMap;
    }
}
