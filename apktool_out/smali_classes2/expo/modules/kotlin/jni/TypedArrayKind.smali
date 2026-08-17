.class public final enum Lexpo/modules/kotlin/jni/TypedArrayKind;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lexpo/modules/kotlin/jni/TypedArrayKind;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0010\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\u0008\u0002\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lexpo/modules/kotlin/jni/TypedArrayKind;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;II)V",
        "getValue",
        "()I",
        "Int8Array",
        "Int16Array",
        "Int32Array",
        "Uint8Array",
        "Uint8ClampedArray",
        "Uint16Array",
        "Uint32Array",
        "Float32Array",
        "Float64Array",
        "BigInt64Array",
        "BigUint64Array",
        "expo-modules-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lexpo/modules/kotlin/jni/TypedArrayKind;

.field public static final enum BigInt64Array:Lexpo/modules/kotlin/jni/TypedArrayKind;

.field public static final enum BigUint64Array:Lexpo/modules/kotlin/jni/TypedArrayKind;

.field public static final enum Float32Array:Lexpo/modules/kotlin/jni/TypedArrayKind;

.field public static final enum Float64Array:Lexpo/modules/kotlin/jni/TypedArrayKind;

.field public static final enum Int16Array:Lexpo/modules/kotlin/jni/TypedArrayKind;

.field public static final enum Int32Array:Lexpo/modules/kotlin/jni/TypedArrayKind;

.field public static final enum Int8Array:Lexpo/modules/kotlin/jni/TypedArrayKind;

.field public static final enum Uint16Array:Lexpo/modules/kotlin/jni/TypedArrayKind;

.field public static final enum Uint32Array:Lexpo/modules/kotlin/jni/TypedArrayKind;

.field public static final enum Uint8Array:Lexpo/modules/kotlin/jni/TypedArrayKind;

.field public static final enum Uint8ClampedArray:Lexpo/modules/kotlin/jni/TypedArrayKind;


# instance fields
.field private final value:I


# direct methods
.method private static final synthetic $values()[Lexpo/modules/kotlin/jni/TypedArrayKind;
    .locals 11

    .line 1
    sget-object v0, Lexpo/modules/kotlin/jni/TypedArrayKind;->Int8Array:Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/kotlin/jni/TypedArrayKind;->Int16Array:Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 4
    .line 5
    sget-object v2, Lexpo/modules/kotlin/jni/TypedArrayKind;->Int32Array:Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 6
    .line 7
    sget-object v3, Lexpo/modules/kotlin/jni/TypedArrayKind;->Uint8Array:Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 8
    .line 9
    sget-object v4, Lexpo/modules/kotlin/jni/TypedArrayKind;->Uint8ClampedArray:Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 10
    .line 11
    sget-object v5, Lexpo/modules/kotlin/jni/TypedArrayKind;->Uint16Array:Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 12
    .line 13
    sget-object v6, Lexpo/modules/kotlin/jni/TypedArrayKind;->Uint32Array:Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 14
    .line 15
    sget-object v7, Lexpo/modules/kotlin/jni/TypedArrayKind;->Float32Array:Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 16
    .line 17
    sget-object v8, Lexpo/modules/kotlin/jni/TypedArrayKind;->Float64Array:Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 18
    .line 19
    sget-object v9, Lexpo/modules/kotlin/jni/TypedArrayKind;->BigInt64Array:Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 20
    .line 21
    sget-object v10, Lexpo/modules/kotlin/jni/TypedArrayKind;->BigUint64Array:Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 22
    .line 23
    filled-new-array/range {v0 .. v10}, [Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 2
    .line 3
    const/4 v4, 0x1

    .line 4
    const/4 v5, 0x0

    .line 5
    const-string v1, "Int8Array"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct/range {v0 .. v5}, Lexpo/modules/kotlin/jni/TypedArrayKind;-><init>(Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lexpo/modules/kotlin/jni/TypedArrayKind;->Int8Array:Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 13
    .line 14
    new-instance v1, Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 15
    .line 16
    const/4 v5, 0x1

    .line 17
    const/4 v6, 0x0

    .line 18
    const-string v2, "Int16Array"

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-direct/range {v1 .. v6}, Lexpo/modules/kotlin/jni/TypedArrayKind;-><init>(Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 23
    .line 24
    .line 25
    sput-object v1, Lexpo/modules/kotlin/jni/TypedArrayKind;->Int16Array:Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 26
    .line 27
    new-instance v2, Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 28
    .line 29
    const/4 v6, 0x1

    .line 30
    const/4 v7, 0x0

    .line 31
    const-string v3, "Int32Array"

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    const/4 v5, 0x0

    .line 35
    invoke-direct/range {v2 .. v7}, Lexpo/modules/kotlin/jni/TypedArrayKind;-><init>(Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 36
    .line 37
    .line 38
    sput-object v2, Lexpo/modules/kotlin/jni/TypedArrayKind;->Int32Array:Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 39
    .line 40
    new-instance v3, Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 41
    .line 42
    const/4 v7, 0x1

    .line 43
    const/4 v8, 0x0

    .line 44
    const-string v4, "Uint8Array"

    .line 45
    .line 46
    const/4 v5, 0x3

    .line 47
    const/4 v6, 0x0

    .line 48
    invoke-direct/range {v3 .. v8}, Lexpo/modules/kotlin/jni/TypedArrayKind;-><init>(Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 49
    .line 50
    .line 51
    sput-object v3, Lexpo/modules/kotlin/jni/TypedArrayKind;->Uint8Array:Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 52
    .line 53
    new-instance v4, Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 54
    .line 55
    const/4 v8, 0x1

    .line 56
    const/4 v9, 0x0

    .line 57
    const-string v5, "Uint8ClampedArray"

    .line 58
    .line 59
    const/4 v6, 0x4

    .line 60
    const/4 v7, 0x0

    .line 61
    invoke-direct/range {v4 .. v9}, Lexpo/modules/kotlin/jni/TypedArrayKind;-><init>(Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 62
    .line 63
    .line 64
    sput-object v4, Lexpo/modules/kotlin/jni/TypedArrayKind;->Uint8ClampedArray:Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 65
    .line 66
    new-instance v5, Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 67
    .line 68
    const/4 v9, 0x1

    .line 69
    const/4 v10, 0x0

    .line 70
    const-string v6, "Uint16Array"

    .line 71
    .line 72
    const/4 v7, 0x5

    .line 73
    const/4 v8, 0x0

    .line 74
    invoke-direct/range {v5 .. v10}, Lexpo/modules/kotlin/jni/TypedArrayKind;-><init>(Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 75
    .line 76
    .line 77
    sput-object v5, Lexpo/modules/kotlin/jni/TypedArrayKind;->Uint16Array:Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 78
    .line 79
    new-instance v6, Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 80
    .line 81
    const/4 v10, 0x1

    .line 82
    const/4 v11, 0x0

    .line 83
    const-string v7, "Uint32Array"

    .line 84
    .line 85
    const/4 v8, 0x6

    .line 86
    const/4 v9, 0x0

    .line 87
    invoke-direct/range {v6 .. v11}, Lexpo/modules/kotlin/jni/TypedArrayKind;-><init>(Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 88
    .line 89
    .line 90
    sput-object v6, Lexpo/modules/kotlin/jni/TypedArrayKind;->Uint32Array:Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 91
    .line 92
    new-instance v0, Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 93
    .line 94
    const/4 v4, 0x1

    .line 95
    const/4 v5, 0x0

    .line 96
    const-string v1, "Float32Array"

    .line 97
    .line 98
    const/4 v2, 0x7

    .line 99
    const/4 v3, 0x0

    .line 100
    invoke-direct/range {v0 .. v5}, Lexpo/modules/kotlin/jni/TypedArrayKind;-><init>(Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 101
    .line 102
    .line 103
    sput-object v0, Lexpo/modules/kotlin/jni/TypedArrayKind;->Float32Array:Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 104
    .line 105
    new-instance v1, Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 106
    .line 107
    const/4 v5, 0x1

    .line 108
    const/4 v6, 0x0

    .line 109
    const-string v2, "Float64Array"

    .line 110
    .line 111
    const/16 v3, 0x8

    .line 112
    .line 113
    const/4 v4, 0x0

    .line 114
    invoke-direct/range {v1 .. v6}, Lexpo/modules/kotlin/jni/TypedArrayKind;-><init>(Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 115
    .line 116
    .line 117
    sput-object v1, Lexpo/modules/kotlin/jni/TypedArrayKind;->Float64Array:Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 118
    .line 119
    new-instance v2, Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 120
    .line 121
    const/4 v6, 0x1

    .line 122
    const/4 v7, 0x0

    .line 123
    const-string v3, "BigInt64Array"

    .line 124
    .line 125
    const/16 v4, 0x9

    .line 126
    .line 127
    const/4 v5, 0x0

    .line 128
    invoke-direct/range {v2 .. v7}, Lexpo/modules/kotlin/jni/TypedArrayKind;-><init>(Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 129
    .line 130
    .line 131
    sput-object v2, Lexpo/modules/kotlin/jni/TypedArrayKind;->BigInt64Array:Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 132
    .line 133
    new-instance v3, Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 134
    .line 135
    const/4 v7, 0x1

    .line 136
    const/4 v8, 0x0

    .line 137
    const-string v4, "BigUint64Array"

    .line 138
    .line 139
    const/16 v5, 0xa

    .line 140
    .line 141
    const/4 v6, 0x0

    .line 142
    invoke-direct/range {v3 .. v8}, Lexpo/modules/kotlin/jni/TypedArrayKind;-><init>(Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 143
    .line 144
    .line 145
    sput-object v3, Lexpo/modules/kotlin/jni/TypedArrayKind;->BigUint64Array:Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 146
    .line 147
    invoke-static {}, Lexpo/modules/kotlin/jni/TypedArrayKind;->$values()[Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    sput-object v0, Lexpo/modules/kotlin/jni/TypedArrayKind;->$VALUES:[Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 152
    .line 153
    invoke-static {v0}, Lp7/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    sput-object v0, Lexpo/modules/kotlin/jni/TypedArrayKind;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 158
    .line 159
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lexpo/modules/kotlin/jni/TypedArrayKind;->value:I

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    .line 2
    invoke-static {}, Lexpo/modules/kotlin/jni/JavaScriptTypedArrayKt;->access$nextValue()I

    move-result p3

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lexpo/modules/kotlin/jni/TypedArrayKind;-><init>(Ljava/lang/String;II)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries;"
        }
    .end annotation

    .line 1
    sget-object v0, Lexpo/modules/kotlin/jni/TypedArrayKind;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lexpo/modules/kotlin/jni/TypedArrayKind;
    .locals 1

    .line 1
    const-class v0, Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lexpo/modules/kotlin/jni/TypedArrayKind;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/kotlin/jni/TypedArrayKind;->$VALUES:[Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getValue()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/kotlin/jni/TypedArrayKind;->value:I

    .line 2
    .line 3
    return v0
.end method
