.class public final Lexpo/modules/clipboard/ClipboardModule;
.super Lexpo/modules/kotlin/modules/Module;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/clipboard/ClipboardModule$ClipboardEventEmitter;,
        Lexpo/modules/clipboard/ClipboardModule$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001\u001eB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0010\u0010\u0011R\u0012\u0010\u0014\u001a\u00060\u0015R\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001b*\u00020\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lexpo/modules/clipboard/ClipboardModule;",
        "Lexpo/modules/kotlin/modules/Module;",
        "<init>",
        "()V",
        "definition",
        "Lexpo/modules/kotlin/modules/ModuleDefinitionData;",
        "context",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "clipboardManager",
        "Landroid/content/ClipboardManager;",
        "getClipboardManager",
        "()Landroid/content/ClipboardManager;",
        "clipboardCacheDir",
        "Ljava/io/File;",
        "getClipboardCacheDir",
        "()Ljava/io/File;",
        "clipboardCacheDir$delegate",
        "Lkotlin/Lazy;",
        "clipboardEventEmitter",
        "Lexpo/modules/clipboard/ClipboardModule$ClipboardEventEmitter;",
        "clipboardHasItemWithType",
        "",
        "mimeType",
        "",
        "firstItem",
        "Landroid/content/ClipData$Item;",
        "getFirstItem",
        "(Landroid/content/ClipboardManager;)Landroid/content/ClipData$Item;",
        "ClipboardEventEmitter",
        "expo-clipboard_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final clipboardCacheDir$delegate:Lkotlin/Lazy;

.field private clipboardEventEmitter:Lexpo/modules/clipboard/ClipboardModule$ClipboardEventEmitter;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lexpo/modules/kotlin/modules/Module;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lexpo/modules/clipboard/i;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lexpo/modules/clipboard/i;-><init>(Lexpo/modules/clipboard/ClipboardModule;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lexpo/modules/clipboard/ClipboardModule;->clipboardCacheDir$delegate:Lkotlin/Lazy;

    .line 14
    .line 15
    return-void
.end method

.method public static final synthetic access$clipboardHasItemWithType(Lexpo/modules/clipboard/ClipboardModule;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lexpo/modules/clipboard/ClipboardModule;->clipboardHasItemWithType(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$getClipboardCacheDir(Lexpo/modules/clipboard/ClipboardModule;)Ljava/io/File;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/clipboard/ClipboardModule;->getClipboardCacheDir()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getClipboardEventEmitter$p(Lexpo/modules/clipboard/ClipboardModule;)Lexpo/modules/clipboard/ClipboardModule$ClipboardEventEmitter;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/clipboard/ClipboardModule;->clipboardEventEmitter:Lexpo/modules/clipboard/ClipboardModule$ClipboardEventEmitter;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getClipboardManager(Lexpo/modules/clipboard/ClipboardModule;)Landroid/content/ClipboardManager;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/clipboard/ClipboardModule;->getClipboardManager()Landroid/content/ClipboardManager;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getContext(Lexpo/modules/clipboard/ClipboardModule;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/clipboard/ClipboardModule;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getFirstItem(Lexpo/modules/clipboard/ClipboardModule;Landroid/content/ClipboardManager;)Landroid/content/ClipData$Item;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lexpo/modules/clipboard/ClipboardModule;->getFirstItem(Landroid/content/ClipboardManager;)Landroid/content/ClipData$Item;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$setClipboardEventEmitter$p(Lexpo/modules/clipboard/ClipboardModule;Lexpo/modules/clipboard/ClipboardModule$ClipboardEventEmitter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/clipboard/ClipboardModule;->clipboardEventEmitter:Lexpo/modules/clipboard/ClipboardModule$ClipboardEventEmitter;

    .line 2
    .line 3
    return-void
.end method

.method public static synthetic b(Lexpo/modules/clipboard/ClipboardModule;)Ljava/io/File;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/clipboard/ClipboardModule;->clipboardCacheDir_delegate$lambda$15(Lexpo/modules/clipboard/ClipboardModule;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final clipboardCacheDir_delegate$lambda$15(Lexpo/modules/clipboard/ClipboardModule;)Ljava/io/File;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {p0}, Lexpo/modules/clipboard/ClipboardModule;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v1, ".clipboard"

    .line 12
    .line 13
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method private final clipboardHasItemWithType(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lexpo/modules/clipboard/ClipboardModule;->getClipboardManager()Landroid/content/ClipboardManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/ClipboardManager;->getPrimaryClipDescription()Landroid/content/ClipDescription;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
.end method

.method private final getClipboardCacheDir()Ljava/io/File;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/clipboard/ClipboardModule;->clipboardCacheDir$delegate:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/io/File;

    .line 8
    .line 9
    return-object v0
.end method

.method private final getClipboardManager()Landroid/content/ClipboardManager;
    .locals 2

    .line 1
    invoke-direct {p0}, Lexpo/modules/clipboard/ClipboardModule;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "clipboard"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v1, v0, Landroid/content/ClipboardManager;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    check-cast v0, Landroid/content/ClipboardManager;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    if-eqz v0, :cond_1

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_1
    new-instance v0, Lexpo/modules/clipboard/ClipboardUnavailableException;

    .line 23
    .line 24
    invoke-direct {v0}, Lexpo/modules/clipboard/ClipboardUnavailableException;-><init>()V

    .line 25
    .line 26
    .line 27
    throw v0
.end method

.method private final getContext()Landroid/content/Context;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getReactContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    const-string v1, "React Application Context is null"

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw v0
.end method

.method private final getFirstItem(Landroid/content/ClipboardManager;)Landroid/content/ClipData$Item;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/content/ClipData;->getItemCount()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-lez v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object p1, v0

    .line 16
    :goto_0
    if-eqz p1, :cond_1

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-virtual {p1, v0}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_1
    return-object v0
.end method


# virtual methods
.method public definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-class v0, Lexpo/modules/clipboard/GetImageOptions;

    .line 4
    .line 5
    const-class v2, Lexpo/modules/clipboard/SetStringOptions;

    .line 6
    .line 7
    const-class v3, Ljava/lang/Boolean;

    .line 8
    .line 9
    const-class v4, Lexpo/modules/clipboard/GetStringOptions;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    new-instance v6, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v5, ".ModuleDefinition"

    .line 24
    .line 25
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    new-instance v6, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v7, "["

    .line 38
    .line 39
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v7, "ExpoModulesCore"

    .line 43
    .line 44
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v7, "] "

    .line 48
    .line 49
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-static {v5}, Ll1/a;->c(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :try_start_0
    new-instance v5, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;

    .line 63
    .line 64
    invoke-direct {v5, v1}, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;-><init>(Lexpo/modules/kotlin/modules/Module;)V

    .line 65
    .line 66
    .line 67
    const-string v6, "ExpoClipboard"

    .line 68
    .line 69
    invoke-virtual {v5, v6}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->Name(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const-string v6, "getStringAsync"

    .line 73
    .line 74
    const-class v7, Lexpo/modules/kotlin/Promise;

    .line 75
    .line 76
    invoke-static {v4, v7}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 81
    .line 82
    sget-object v9, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 83
    .line 84
    sget-object v10, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 85
    .line 86
    sget-object v11, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 87
    .line 88
    const/4 v12, 0x0

    .line 89
    const-class v13, Ljava/lang/String;

    .line 90
    .line 91
    if-eqz v7, :cond_0

    .line 92
    .line 93
    :try_start_1
    new-instance v4, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    .line 94
    .line 95
    new-array v7, v12, [Lexpo/modules/kotlin/types/AnyType;

    .line 96
    .line 97
    new-instance v14, Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$AsyncFunction$1;

    .line 98
    .line 99
    invoke-direct {v14, v1}, Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$AsyncFunction$1;-><init>(Lexpo/modules/clipboard/ClipboardModule;)V

    .line 100
    .line 101
    .line 102
    invoke-direct {v4, v6, v7, v14}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    .line 103
    .line 104
    .line 105
    move-object/from16 v16, v0

    .line 106
    .line 107
    goto/16 :goto_1

    .line 108
    .line 109
    :catchall_0
    move-exception v0

    .line 110
    goto/16 :goto_8

    .line 111
    .line 112
    :cond_0
    invoke-virtual {v5}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    sget-object v14, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 117
    .line 118
    new-instance v15, Lkotlin/Pair;

    .line 119
    .line 120
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 121
    .line 122
    .line 123
    move-result-object v12

    .line 124
    move-object/from16 v16, v0

    .line 125
    .line 126
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 127
    .line 128
    invoke-direct {v15, v12, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v14}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-interface {v0, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    check-cast v0, Lexpo/modules/kotlin/types/AnyType;

    .line 140
    .line 141
    if-nez v0, :cond_1

    .line 142
    .line 143
    sget-object v0, Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$AsyncFunction$2;->INSTANCE:Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$AsyncFunction$2;

    .line 144
    .line 145
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 146
    .line 147
    new-instance v14, Lexpo/modules/kotlin/types/LazyKType;

    .line 148
    .line 149
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    const/4 v15, 0x0

    .line 154
    invoke-direct {v14, v4, v15, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 155
    .line 156
    .line 157
    invoke-direct {v12, v14, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 158
    .line 159
    .line 160
    move-object v0, v12

    .line 161
    :cond_1
    filled-new-array {v0}, [Lexpo/modules/kotlin/types/AnyType;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    new-instance v4, Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$AsyncFunction$3;

    .line 166
    .line 167
    invoke-direct {v4, v1}, Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$AsyncFunction$3;-><init>(Lexpo/modules/clipboard/ClipboardModule;)V

    .line 168
    .line 169
    .line 170
    invoke-static {v13, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    if-eqz v7, :cond_2

    .line 175
    .line 176
    new-instance v7, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    .line 177
    .line 178
    invoke-direct {v7, v6, v0, v4}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 179
    .line 180
    .line 181
    :goto_0
    move-object v4, v7

    .line 182
    goto :goto_1

    .line 183
    :cond_2
    invoke-static {v13, v11}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v7

    .line 187
    if-eqz v7, :cond_3

    .line 188
    .line 189
    new-instance v7, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    .line 190
    .line 191
    invoke-direct {v7, v6, v0, v4}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 192
    .line 193
    .line 194
    goto :goto_0

    .line 195
    :cond_3
    invoke-static {v13, v10}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v7

    .line 199
    if-eqz v7, :cond_4

    .line 200
    .line 201
    new-instance v7, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    .line 202
    .line 203
    invoke-direct {v7, v6, v0, v4}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 204
    .line 205
    .line 206
    goto :goto_0

    .line 207
    :cond_4
    invoke-static {v13, v9}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v7

    .line 211
    if-eqz v7, :cond_5

    .line 212
    .line 213
    new-instance v7, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    .line 214
    .line 215
    invoke-direct {v7, v6, v0, v4}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 216
    .line 217
    .line 218
    goto :goto_0

    .line 219
    :cond_5
    invoke-static {v13, v13}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v7

    .line 223
    if-eqz v7, :cond_6

    .line 224
    .line 225
    new-instance v7, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    .line 226
    .line 227
    invoke-direct {v7, v6, v0, v4}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 228
    .line 229
    .line 230
    goto :goto_0

    .line 231
    :cond_6
    new-instance v7, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    .line 232
    .line 233
    invoke-direct {v7, v6, v0, v4}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 234
    .line 235
    .line 236
    goto :goto_0

    .line 237
    :goto_1
    invoke-virtual {v5}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-interface {v0, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    const-string v0, "setStringAsync"

    .line 245
    .line 246
    invoke-virtual {v5}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    sget-object v6, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 251
    .line 252
    new-instance v7, Lkotlin/Pair;

    .line 253
    .line 254
    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 255
    .line 256
    .line 257
    move-result-object v12

    .line 258
    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 259
    .line 260
    invoke-direct {v7, v12, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v6}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 264
    .line 265
    .line 266
    move-result-object v12

    .line 267
    invoke-interface {v12, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v7

    .line 271
    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    .line 272
    .line 273
    if-nez v7, :cond_7

    .line 274
    .line 275
    sget-object v7, Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$AsyncFunction$4;->INSTANCE:Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$AsyncFunction$4;

    .line 276
    .line 277
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 278
    .line 279
    new-instance v15, Lexpo/modules/kotlin/types/LazyKType;

    .line 280
    .line 281
    move-object/from16 v17, v2

    .line 282
    .line 283
    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    move-object/from16 v18, v6

    .line 288
    .line 289
    const/4 v6, 0x0

    .line 290
    invoke-direct {v15, v2, v6, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 291
    .line 292
    .line 293
    invoke-direct {v12, v15, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 294
    .line 295
    .line 296
    move-object v7, v12

    .line 297
    goto :goto_2

    .line 298
    :cond_7
    move-object/from16 v17, v2

    .line 299
    .line 300
    move-object/from16 v18, v6

    .line 301
    .line 302
    :goto_2
    new-instance v2, Lkotlin/Pair;

    .line 303
    .line 304
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 305
    .line 306
    .line 307
    move-result-object v6

    .line 308
    invoke-direct {v2, v6, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 312
    .line 313
    .line 314
    move-result-object v6

    .line 315
    invoke-interface {v6, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    check-cast v2, Lexpo/modules/kotlin/types/AnyType;

    .line 320
    .line 321
    if-nez v2, :cond_8

    .line 322
    .line 323
    sget-object v2, Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$AsyncFunction$5;->INSTANCE:Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$AsyncFunction$5;

    .line 324
    .line 325
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 326
    .line 327
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    .line 328
    .line 329
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 330
    .line 331
    .line 332
    move-result-object v15

    .line 333
    move-object/from16 v17, v14

    .line 334
    .line 335
    const/4 v14, 0x0

    .line 336
    invoke-direct {v12, v15, v14, v2}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 337
    .line 338
    .line 339
    invoke-direct {v6, v12, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 340
    .line 341
    .line 342
    move-object v2, v6

    .line 343
    goto :goto_3

    .line 344
    :cond_8
    move-object/from16 v17, v14

    .line 345
    .line 346
    :goto_3
    filled-new-array {v7, v2}, [Lexpo/modules/kotlin/types/AnyType;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    new-instance v4, Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$AsyncFunction$6;

    .line 351
    .line 352
    invoke-direct {v4, v1}, Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$AsyncFunction$6;-><init>(Lexpo/modules/clipboard/ClipboardModule;)V

    .line 353
    .line 354
    .line 355
    invoke-static {v3, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v6

    .line 359
    if-eqz v6, :cond_9

    .line 360
    .line 361
    new-instance v6, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    .line 362
    .line 363
    invoke-direct {v6, v0, v2, v4}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 364
    .line 365
    .line 366
    goto :goto_4

    .line 367
    :cond_9
    invoke-static {v3, v11}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v6

    .line 371
    if-eqz v6, :cond_a

    .line 372
    .line 373
    new-instance v6, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    .line 374
    .line 375
    invoke-direct {v6, v0, v2, v4}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 376
    .line 377
    .line 378
    goto :goto_4

    .line 379
    :cond_a
    invoke-static {v3, v10}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v6

    .line 383
    if-eqz v6, :cond_b

    .line 384
    .line 385
    new-instance v6, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    .line 386
    .line 387
    invoke-direct {v6, v0, v2, v4}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 388
    .line 389
    .line 390
    goto :goto_4

    .line 391
    :cond_b
    invoke-static {v3, v9}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    move-result v6

    .line 395
    if-eqz v6, :cond_c

    .line 396
    .line 397
    new-instance v6, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    .line 398
    .line 399
    invoke-direct {v6, v0, v2, v4}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 400
    .line 401
    .line 402
    goto :goto_4

    .line 403
    :cond_c
    invoke-static {v3, v13}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v6

    .line 407
    if-eqz v6, :cond_d

    .line 408
    .line 409
    new-instance v6, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    .line 410
    .line 411
    invoke-direct {v6, v0, v2, v4}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 412
    .line 413
    .line 414
    goto :goto_4

    .line 415
    :cond_d
    new-instance v6, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    .line 416
    .line 417
    invoke-direct {v6, v0, v2, v4}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 418
    .line 419
    .line 420
    :goto_4
    invoke-virtual {v5}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    invoke-interface {v2, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    const-string v0, "hasStringAsync"

    .line 428
    .line 429
    const/4 v15, 0x0

    .line 430
    new-array v2, v15, [Lexpo/modules/kotlin/types/AnyType;

    .line 431
    .line 432
    new-instance v4, Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$AsyncFunction$7;

    .line 433
    .line 434
    invoke-direct {v4, v1}, Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$AsyncFunction$7;-><init>(Lexpo/modules/clipboard/ClipboardModule;)V

    .line 435
    .line 436
    .line 437
    invoke-static {v3, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    move-result v6

    .line 441
    if-eqz v6, :cond_e

    .line 442
    .line 443
    new-instance v6, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    .line 444
    .line 445
    invoke-direct {v6, v0, v2, v4}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 446
    .line 447
    .line 448
    goto :goto_5

    .line 449
    :cond_e
    invoke-static {v3, v11}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    move-result v6

    .line 453
    if-eqz v6, :cond_f

    .line 454
    .line 455
    new-instance v6, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    .line 456
    .line 457
    invoke-direct {v6, v0, v2, v4}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 458
    .line 459
    .line 460
    goto :goto_5

    .line 461
    :cond_f
    invoke-static {v3, v10}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    move-result v6

    .line 465
    if-eqz v6, :cond_10

    .line 466
    .line 467
    new-instance v6, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    .line 468
    .line 469
    invoke-direct {v6, v0, v2, v4}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 470
    .line 471
    .line 472
    goto :goto_5

    .line 473
    :cond_10
    invoke-static {v3, v9}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    move-result v6

    .line 477
    if-eqz v6, :cond_11

    .line 478
    .line 479
    new-instance v6, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    .line 480
    .line 481
    invoke-direct {v6, v0, v2, v4}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 482
    .line 483
    .line 484
    goto :goto_5

    .line 485
    :cond_11
    invoke-static {v3, v13}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    move-result v6

    .line 489
    if-eqz v6, :cond_12

    .line 490
    .line 491
    new-instance v6, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    .line 492
    .line 493
    invoke-direct {v6, v0, v2, v4}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 494
    .line 495
    .line 496
    goto :goto_5

    .line 497
    :cond_12
    new-instance v6, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    .line 498
    .line 499
    invoke-direct {v6, v0, v2, v4}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 500
    .line 501
    .line 502
    :goto_5
    invoke-virtual {v5}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    .line 503
    .line 504
    .line 505
    move-result-object v2

    .line 506
    invoke-interface {v2, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    const-string v0, "getImageAsync"

    .line 510
    .line 511
    invoke-virtual {v5, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    new-instance v2, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    .line 516
    .line 517
    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v4

    .line 521
    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 522
    .line 523
    .line 524
    move-result-object v6

    .line 525
    new-instance v7, Lkotlin/Pair;

    .line 526
    .line 527
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 528
    .line 529
    .line 530
    move-result-object v12

    .line 531
    move-object/from16 v14, v17

    .line 532
    .line 533
    invoke-direct {v7, v12, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 534
    .line 535
    .line 536
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 537
    .line 538
    .line 539
    move-result-object v12

    .line 540
    invoke-interface {v12, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v7

    .line 544
    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    .line 545
    .line 546
    if-nez v7, :cond_13

    .line 547
    .line 548
    sget-object v7, Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$Coroutine$1;->INSTANCE:Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$Coroutine$1;

    .line 549
    .line 550
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 551
    .line 552
    new-instance v15, Lexpo/modules/kotlin/types/LazyKType;

    .line 553
    .line 554
    move-object/from16 v17, v13

    .line 555
    .line 556
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 557
    .line 558
    .line 559
    move-result-object v13

    .line 560
    move-object/from16 v16, v9

    .line 561
    .line 562
    const/4 v9, 0x0

    .line 563
    invoke-direct {v15, v13, v9, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 564
    .line 565
    .line 566
    invoke-direct {v12, v15, v6}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 567
    .line 568
    .line 569
    move-object v7, v12

    .line 570
    goto :goto_6

    .line 571
    :cond_13
    move-object/from16 v16, v9

    .line 572
    .line 573
    move-object/from16 v17, v13

    .line 574
    .line 575
    :goto_6
    filled-new-array {v7}, [Lexpo/modules/kotlin/types/AnyType;

    .line 576
    .line 577
    .line 578
    move-result-object v6

    .line 579
    new-instance v7, Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$Coroutine$2;

    .line 580
    .line 581
    const/4 v9, 0x0

    .line 582
    invoke-direct {v7, v9, v1}, Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$Coroutine$2;-><init>(Ln7/f;Lexpo/modules/clipboard/ClipboardModule;)V

    .line 583
    .line 584
    .line 585
    invoke-direct {v2, v4, v6, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v0, v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 589
    .line 590
    .line 591
    const-string v0, "setImageAsync"

    .line 592
    .line 593
    invoke-virtual {v5, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    new-instance v2, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    .line 598
    .line 599
    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object v4

    .line 603
    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 604
    .line 605
    .line 606
    move-result-object v6

    .line 607
    new-instance v7, Lkotlin/Pair;

    .line 608
    .line 609
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 610
    .line 611
    .line 612
    move-result-object v12

    .line 613
    invoke-direct {v7, v12, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 614
    .line 615
    .line 616
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 617
    .line 618
    .line 619
    move-result-object v12

    .line 620
    invoke-interface {v12, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object v7

    .line 624
    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    .line 625
    .line 626
    if-nez v7, :cond_14

    .line 627
    .line 628
    sget-object v7, Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$Coroutine$3;->INSTANCE:Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$Coroutine$3;

    .line 629
    .line 630
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 631
    .line 632
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    .line 633
    .line 634
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 635
    .line 636
    .line 637
    move-result-object v14

    .line 638
    const/4 v15, 0x0

    .line 639
    invoke-direct {v13, v14, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 640
    .line 641
    .line 642
    invoke-direct {v12, v13, v6}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 643
    .line 644
    .line 645
    move-object v7, v12

    .line 646
    :cond_14
    filled-new-array {v7}, [Lexpo/modules/kotlin/types/AnyType;

    .line 647
    .line 648
    .line 649
    move-result-object v6

    .line 650
    new-instance v7, Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$Coroutine$4;

    .line 651
    .line 652
    invoke-direct {v7, v9, v1}, Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$Coroutine$4;-><init>(Ln7/f;Lexpo/modules/clipboard/ClipboardModule;)V

    .line 653
    .line 654
    .line 655
    invoke-direct {v2, v4, v6, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v0, v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 659
    .line 660
    .line 661
    const-string v0, "hasImageAsync"

    .line 662
    .line 663
    const/4 v15, 0x0

    .line 664
    new-array v2, v15, [Lexpo/modules/kotlin/types/AnyType;

    .line 665
    .line 666
    new-instance v4, Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$AsyncFunction$8;

    .line 667
    .line 668
    invoke-direct {v4, v1}, Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$AsyncFunction$8;-><init>(Lexpo/modules/clipboard/ClipboardModule;)V

    .line 669
    .line 670
    .line 671
    invoke-static {v3, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 672
    .line 673
    .line 674
    move-result v6

    .line 675
    if-eqz v6, :cond_15

    .line 676
    .line 677
    new-instance v3, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    .line 678
    .line 679
    invoke-direct {v3, v0, v2, v4}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 680
    .line 681
    .line 682
    goto :goto_7

    .line 683
    :cond_15
    invoke-static {v3, v11}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 684
    .line 685
    .line 686
    move-result v6

    .line 687
    if-eqz v6, :cond_16

    .line 688
    .line 689
    new-instance v3, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    .line 690
    .line 691
    invoke-direct {v3, v0, v2, v4}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 692
    .line 693
    .line 694
    goto :goto_7

    .line 695
    :cond_16
    invoke-static {v3, v10}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 696
    .line 697
    .line 698
    move-result v6

    .line 699
    if-eqz v6, :cond_17

    .line 700
    .line 701
    new-instance v3, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    .line 702
    .line 703
    invoke-direct {v3, v0, v2, v4}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 704
    .line 705
    .line 706
    goto :goto_7

    .line 707
    :cond_17
    move-object/from16 v6, v16

    .line 708
    .line 709
    invoke-static {v3, v6}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 710
    .line 711
    .line 712
    move-result v6

    .line 713
    if-eqz v6, :cond_18

    .line 714
    .line 715
    new-instance v3, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    .line 716
    .line 717
    invoke-direct {v3, v0, v2, v4}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 718
    .line 719
    .line 720
    goto :goto_7

    .line 721
    :cond_18
    move-object/from16 v6, v17

    .line 722
    .line 723
    invoke-static {v3, v6}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 724
    .line 725
    .line 726
    move-result v3

    .line 727
    if-eqz v3, :cond_19

    .line 728
    .line 729
    new-instance v3, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    .line 730
    .line 731
    invoke-direct {v3, v0, v2, v4}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 732
    .line 733
    .line 734
    goto :goto_7

    .line 735
    :cond_19
    new-instance v3, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    .line 736
    .line 737
    invoke-direct {v3, v0, v2, v4}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 738
    .line 739
    .line 740
    :goto_7
    invoke-virtual {v5}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    .line 741
    .line 742
    .line 743
    move-result-object v2

    .line 744
    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    const-string v0, "onClipboardChanged"

    .line 748
    .line 749
    filled-new-array {v0}, [Ljava/lang/String;

    .line 750
    .line 751
    .line 752
    move-result-object v0

    .line 753
    invoke-virtual {v5, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->Events([Ljava/lang/String;)V

    .line 754
    .line 755
    .line 756
    invoke-virtual {v5}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getEventListeners()Ljava/util/Map;

    .line 757
    .line 758
    .line 759
    move-result-object v0

    .line 760
    sget-object v2, Lexpo/modules/kotlin/events/EventName;->MODULE_CREATE:Lexpo/modules/kotlin/events/EventName;

    .line 761
    .line 762
    new-instance v3, Lexpo/modules/kotlin/events/BasicEventListener;

    .line 763
    .line 764
    new-instance v4, Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$OnCreate$1;

    .line 765
    .line 766
    invoke-direct {v4, v1}, Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$OnCreate$1;-><init>(Lexpo/modules/clipboard/ClipboardModule;)V

    .line 767
    .line 768
    .line 769
    invoke-direct {v3, v2, v4}, Lexpo/modules/kotlin/events/BasicEventListener;-><init>(Lexpo/modules/kotlin/events/EventName;Lw7/a;)V

    .line 770
    .line 771
    .line 772
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 773
    .line 774
    .line 775
    invoke-virtual {v5}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getEventListeners()Ljava/util/Map;

    .line 776
    .line 777
    .line 778
    move-result-object v0

    .line 779
    sget-object v2, Lexpo/modules/kotlin/events/EventName;->MODULE_DESTROY:Lexpo/modules/kotlin/events/EventName;

    .line 780
    .line 781
    new-instance v3, Lexpo/modules/kotlin/events/BasicEventListener;

    .line 782
    .line 783
    new-instance v4, Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$OnDestroy$1;

    .line 784
    .line 785
    invoke-direct {v4, v1}, Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$OnDestroy$1;-><init>(Lexpo/modules/clipboard/ClipboardModule;)V

    .line 786
    .line 787
    .line 788
    invoke-direct {v3, v2, v4}, Lexpo/modules/kotlin/events/BasicEventListener;-><init>(Lexpo/modules/kotlin/events/EventName;Lw7/a;)V

    .line 789
    .line 790
    .line 791
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    invoke-virtual {v5}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getEventListeners()Ljava/util/Map;

    .line 795
    .line 796
    .line 797
    move-result-object v0

    .line 798
    sget-object v2, Lexpo/modules/kotlin/events/EventName;->ACTIVITY_ENTERS_BACKGROUND:Lexpo/modules/kotlin/events/EventName;

    .line 799
    .line 800
    new-instance v3, Lexpo/modules/kotlin/events/BasicEventListener;

    .line 801
    .line 802
    new-instance v4, Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$OnActivityEntersBackground$1;

    .line 803
    .line 804
    invoke-direct {v4, v1}, Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$OnActivityEntersBackground$1;-><init>(Lexpo/modules/clipboard/ClipboardModule;)V

    .line 805
    .line 806
    .line 807
    invoke-direct {v3, v2, v4}, Lexpo/modules/kotlin/events/BasicEventListener;-><init>(Lexpo/modules/kotlin/events/EventName;Lw7/a;)V

    .line 808
    .line 809
    .line 810
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 811
    .line 812
    .line 813
    invoke-virtual {v5}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getEventListeners()Ljava/util/Map;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    sget-object v2, Lexpo/modules/kotlin/events/EventName;->ACTIVITY_ENTERS_FOREGROUND:Lexpo/modules/kotlin/events/EventName;

    .line 818
    .line 819
    new-instance v3, Lexpo/modules/kotlin/events/BasicEventListener;

    .line 820
    .line 821
    new-instance v4, Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$OnActivityEntersForeground$1;

    .line 822
    .line 823
    invoke-direct {v4, v1}, Lexpo/modules/clipboard/ClipboardModule$definition$lambda$12$$inlined$OnActivityEntersForeground$1;-><init>(Lexpo/modules/clipboard/ClipboardModule;)V

    .line 824
    .line 825
    .line 826
    invoke-direct {v3, v2, v4}, Lexpo/modules/kotlin/events/BasicEventListener;-><init>(Lexpo/modules/kotlin/events/EventName;Lw7/a;)V

    .line 827
    .line 828
    .line 829
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 830
    .line 831
    .line 832
    invoke-virtual {v5}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->buildModule()Lexpo/modules/kotlin/modules/ModuleDefinitionData;

    .line 833
    .line 834
    .line 835
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 836
    invoke-static {}, Ll1/a;->f()V

    .line 837
    .line 838
    .line 839
    return-object v0

    .line 840
    :goto_8
    invoke-static {}, Ll1/a;->f()V

    .line 841
    .line 842
    .line 843
    throw v0
.end method
