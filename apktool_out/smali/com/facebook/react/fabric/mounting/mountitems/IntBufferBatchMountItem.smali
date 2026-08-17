.class public final Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/fabric/mounting/mountitems/BatchMountItem;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u001fR\u001c\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010 R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u001eR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010\u001e\u00a8\u0006$"
    }
    d2 = {
        "Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;",
        "Lcom/facebook/react/fabric/mounting/mountitems/BatchMountItem;",
        "",
        "surfaceId",
        "",
        "intBuffer",
        "",
        "",
        "objBuffer",
        "commitNumber",
        "<init>",
        "(I[I[Ljava/lang/Object;I)V",
        "",
        "reason",
        "Li7/B;",
        "beginMarkers",
        "(Ljava/lang/String;)V",
        "endMarkers",
        "()V",
        "Lcom/facebook/react/fabric/mounting/MountingManager;",
        "mountingManager",
        "execute",
        "(Lcom/facebook/react/fabric/mounting/MountingManager;)V",
        "getSurfaceId",
        "()I",
        "",
        "isBatchEmpty",
        "()Z",
        "toString",
        "()Ljava/lang/String;",
        "I",
        "[I",
        "[Ljava/lang/Object;",
        "intBufferLen",
        "objBufferLen",
        "Companion",
        "ReactAndroid_release"
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
.field public static final Companion:Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem$Companion;

.field public static final INSTRUCTION_CREATE:I = 0x2

.field public static final INSTRUCTION_DELETE:I = 0x4

.field public static final INSTRUCTION_FLAG_MULTIPLE:I = 0x1

.field public static final INSTRUCTION_INSERT:I = 0x8

.field public static final INSTRUCTION_REMOVE:I = 0x10

.field public static final INSTRUCTION_UPDATE_EVENT_EMITTER:I = 0x100

.field public static final INSTRUCTION_UPDATE_LAYOUT:I = 0x80

.field public static final INSTRUCTION_UPDATE_OVERFLOW_INSET:I = 0x400

.field public static final INSTRUCTION_UPDATE_PADDING:I = 0x200

.field public static final INSTRUCTION_UPDATE_PROPS:I = 0x20

.field public static final INSTRUCTION_UPDATE_STATE:I = 0x40


# instance fields
.field private final commitNumber:I

.field private final intBuffer:[I

.field private final intBufferLen:I

.field private final objBuffer:[Ljava/lang/Object;

.field private final objBufferLen:I

.field private final surfaceId:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->Companion:Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(I[I[Ljava/lang/Object;I)V
    .locals 1

    .line 1
    const-string v0, "intBuffer"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "objBuffer"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput p1, p0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->surfaceId:I

    .line 15
    .line 16
    iput-object p2, p0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 17
    .line 18
    iput-object p3, p0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->objBuffer:[Ljava/lang/Object;

    .line 19
    .line 20
    iput p4, p0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->commitNumber:I

    .line 21
    .line 22
    array-length p1, p2

    .line 23
    iput p1, p0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBufferLen:I

    .line 24
    .line 25
    array-length p1, p3

    .line 26
    iput p1, p0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->objBufferLen:I

    .line 27
    .line 28
    return-void
.end method

.method private final beginMarkers(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "IntBufferBatchMountItem::"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    invoke-static {v0, v1, p1}, LB3/a;->c(JLjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget p1, p0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->commitNumber:I

    .line 24
    .line 25
    if-lez p1, :cond_0

    .line 26
    .line 27
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_BATCH_EXECUTION_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-static {v0, v1, p1}, Lcom/facebook/react/bridge/ReactMarker;->logFabricMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method

.method private final endMarkers()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->commitNumber:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_BATCH_EXECUTION_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {v1, v2, v0}, Lcom/facebook/react/bridge/ReactMarker;->logFabricMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    invoke-static {v0, v1}, LB3/a;->i(J)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public execute(Lcom/facebook/react/fabric/mounting/MountingManager;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "mountingManager"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget v2, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->surfaceId:I

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Lcom/facebook/react/fabric/mounting/MountingManager;->getSurfaceManager(I)Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    const-string v1, "IntBufferBatchMountItem"

    .line 17
    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    iget v2, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->surfaceId:I

    .line 21
    .line 22
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const-string v3, "Skipping batch of MountItems; no SurfaceMountingManager found for [%d]."

    .line 31
    .line 32
    invoke-static {v1, v3, v2}, Ld2/a;->o(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    invoke-virtual {v3}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->isStopped()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    iget v2, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->surfaceId:I

    .line 43
    .line 44
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    const-string v3, "Skipping batch of MountItems; was stopped [%d]."

    .line 53
    .line 54
    invoke-static {v1, v3, v2}, Ld2/a;->o(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enableFabricLogs()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    iget v2, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->surfaceId:I

    .line 65
    .line 66
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    const-string v4, "Executing IntBufferBatchMountItem on surface [%d]"

    .line 71
    .line 72
    invoke-static {v1, v4, v2}, Ld2/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    const-string v1, "mountViews"

    .line 76
    .line 77
    invoke-direct {v0, v1}, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->beginMarkers(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    move v2, v1

    .line 82
    move v4, v2

    .line 83
    :goto_0
    iget v5, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBufferLen:I

    .line 84
    .line 85
    if-ge v2, v5, :cond_12

    .line 86
    .line 87
    iget-object v5, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 88
    .line 89
    add-int/lit8 v6, v2, 0x1

    .line 90
    .line 91
    aget v7, v5, v2

    .line 92
    .line 93
    and-int/lit8 v12, v7, -0x2

    .line 94
    .line 95
    const/4 v13, 0x1

    .line 96
    and-int/2addr v7, v13

    .line 97
    if-eqz v7, :cond_3

    .line 98
    .line 99
    add-int/lit8 v2, v2, 0x2

    .line 100
    .line 101
    aget v5, v5, v6

    .line 102
    .line 103
    move v6, v2

    .line 104
    move v2, v5

    .line 105
    goto :goto_1

    .line 106
    :cond_3
    move v2, v13

    .line 107
    :goto_1
    const-string v5, "numInstructions"

    .line 108
    .line 109
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    filled-new-array {v5, v7}, [Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    sget-object v7, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->Companion:Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem$Companion;

    .line 118
    .line 119
    invoke-static {v7, v12}, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem$Companion;->access$nameForInstructionString(Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem$Companion;I)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    new-instance v8, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    const-string v9, "IntBufferBatchMountItem::mountInstructions::"

    .line 129
    .line 130
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    const-wide/16 v14, 0x0

    .line 141
    .line 142
    const/4 v9, 0x2

    .line 143
    invoke-static {v14, v15, v7, v5, v9}, LB3/a;->d(JLjava/lang/String;[Ljava/lang/String;I)V

    .line 144
    .line 145
    .line 146
    move v10, v1

    .line 147
    move/from16 v16, v4

    .line 148
    .line 149
    :goto_2
    if-ge v10, v2, :cond_11

    .line 150
    .line 151
    if-eq v12, v9, :cond_e

    .line 152
    .line 153
    const/4 v4, 0x4

    .line 154
    if-eq v12, v4, :cond_d

    .line 155
    .line 156
    const/16 v4, 0x8

    .line 157
    .line 158
    if-eq v12, v4, :cond_c

    .line 159
    .line 160
    const/16 v4, 0x10

    .line 161
    .line 162
    if-eq v12, v4, :cond_b

    .line 163
    .line 164
    const/16 v4, 0x20

    .line 165
    .line 166
    if-eq v12, v4, :cond_a

    .line 167
    .line 168
    const/16 v4, 0x40

    .line 169
    .line 170
    if-eq v12, v4, :cond_9

    .line 171
    .line 172
    const/16 v4, 0x80

    .line 173
    .line 174
    if-eq v12, v4, :cond_8

    .line 175
    .line 176
    const/16 v4, 0x100

    .line 177
    .line 178
    if-eq v12, v4, :cond_6

    .line 179
    .line 180
    const/16 v4, 0x200

    .line 181
    .line 182
    if-eq v12, v4, :cond_5

    .line 183
    .line 184
    const/16 v4, 0x400

    .line 185
    .line 186
    if-ne v12, v4, :cond_4

    .line 187
    .line 188
    iget-object v4, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 189
    .line 190
    add-int/lit8 v5, v6, 0x1

    .line 191
    .line 192
    move-object v7, v4

    .line 193
    aget v4, v7, v6

    .line 194
    .line 195
    add-int/lit8 v8, v6, 0x2

    .line 196
    .line 197
    aget v5, v7, v5

    .line 198
    .line 199
    add-int/lit8 v11, v6, 0x3

    .line 200
    .line 201
    aget v8, v7, v8

    .line 202
    .line 203
    add-int/lit8 v17, v6, 0x4

    .line 204
    .line 205
    aget v11, v7, v11

    .line 206
    .line 207
    add-int/lit8 v18, v6, 0x5

    .line 208
    .line 209
    aget v6, v7, v17

    .line 210
    .line 211
    move v7, v8

    .line 212
    move v8, v6

    .line 213
    move v6, v7

    .line 214
    move v7, v11

    .line 215
    invoke-virtual/range {v3 .. v8}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->updateOverflowInset(IIIII)V

    .line 216
    .line 217
    .line 218
    :goto_3
    move/from16 v17, v10

    .line 219
    .line 220
    move/from16 v6, v18

    .line 221
    .line 222
    move/from16 v18, v9

    .line 223
    .line 224
    goto/16 :goto_8

    .line 225
    .line 226
    :cond_4
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 227
    .line 228
    new-instance v2, Ljava/lang/StringBuilder;

    .line 229
    .line 230
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 231
    .line 232
    .line 233
    const-string v3, "Invalid type argument to IntBufferBatchMountItem: "

    .line 234
    .line 235
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    const-string v3, " at index: "

    .line 242
    .line 243
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    throw v1

    .line 257
    :cond_5
    iget-object v4, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 258
    .line 259
    add-int/lit8 v5, v6, 0x1

    .line 260
    .line 261
    move-object v7, v4

    .line 262
    aget v4, v7, v6

    .line 263
    .line 264
    add-int/lit8 v8, v6, 0x2

    .line 265
    .line 266
    aget v5, v7, v5

    .line 267
    .line 268
    add-int/lit8 v11, v6, 0x3

    .line 269
    .line 270
    aget v8, v7, v8

    .line 271
    .line 272
    add-int/lit8 v17, v6, 0x4

    .line 273
    .line 274
    aget v11, v7, v11

    .line 275
    .line 276
    add-int/lit8 v18, v6, 0x5

    .line 277
    .line 278
    aget v6, v7, v17

    .line 279
    .line 280
    move v7, v8

    .line 281
    move v8, v6

    .line 282
    move v6, v7

    .line 283
    move v7, v11

    .line 284
    invoke-virtual/range {v3 .. v8}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->updatePadding(IIIII)V

    .line 285
    .line 286
    .line 287
    goto :goto_3

    .line 288
    :cond_6
    iget-object v4, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->objBuffer:[Ljava/lang/Object;

    .line 289
    .line 290
    add-int/lit8 v5, v16, 0x1

    .line 291
    .line 292
    aget-object v4, v4, v16

    .line 293
    .line 294
    check-cast v4, Lcom/facebook/react/fabric/events/EventEmitterWrapper;

    .line 295
    .line 296
    if-eqz v4, :cond_7

    .line 297
    .line 298
    iget-object v7, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 299
    .line 300
    add-int/lit8 v8, v6, 0x1

    .line 301
    .line 302
    aget v6, v7, v6

    .line 303
    .line 304
    invoke-virtual {v3, v6, v4}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->updateEventEmitter(ILcom/facebook/react/fabric/events/EventEmitterWrapper;)V

    .line 305
    .line 306
    .line 307
    move/from16 v16, v5

    .line 308
    .line 309
    move v6, v8

    .line 310
    :goto_4
    move/from16 v18, v9

    .line 311
    .line 312
    move/from16 v17, v10

    .line 313
    .line 314
    goto/16 :goto_8

    .line 315
    .line 316
    :cond_7
    move/from16 v16, v5

    .line 317
    .line 318
    goto :goto_4

    .line 319
    :cond_8
    iget-object v4, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 320
    .line 321
    add-int/lit8 v5, v6, 0x1

    .line 322
    .line 323
    move-object v7, v4

    .line 324
    aget v4, v7, v6

    .line 325
    .line 326
    add-int/lit8 v8, v6, 0x2

    .line 327
    .line 328
    aget v5, v7, v5

    .line 329
    .line 330
    add-int/lit8 v11, v6, 0x3

    .line 331
    .line 332
    aget v8, v7, v8

    .line 333
    .line 334
    add-int/lit8 v17, v6, 0x4

    .line 335
    .line 336
    aget v11, v7, v11

    .line 337
    .line 338
    add-int/lit8 v18, v6, 0x5

    .line 339
    .line 340
    aget v17, v7, v17

    .line 341
    .line 342
    add-int/lit8 v19, v6, 0x6

    .line 343
    .line 344
    aget v18, v7, v18

    .line 345
    .line 346
    add-int/lit8 v20, v6, 0x7

    .line 347
    .line 348
    aget v19, v7, v19

    .line 349
    .line 350
    add-int/lit8 v21, v6, 0x8

    .line 351
    .line 352
    aget v6, v7, v20

    .line 353
    .line 354
    move/from16 v7, v18

    .line 355
    .line 356
    move/from16 v18, v9

    .line 357
    .line 358
    move v9, v7

    .line 359
    move v7, v11

    .line 360
    move v11, v6

    .line 361
    move v6, v8

    .line 362
    move/from16 v8, v17

    .line 363
    .line 364
    move/from16 v17, v10

    .line 365
    .line 366
    move/from16 v10, v19

    .line 367
    .line 368
    invoke-virtual/range {v3 .. v11}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->updateLayout(IIIIIIII)V

    .line 369
    .line 370
    .line 371
    move/from16 v6, v21

    .line 372
    .line 373
    goto/16 :goto_8

    .line 374
    .line 375
    :cond_9
    move/from16 v18, v9

    .line 376
    .line 377
    move/from16 v17, v10

    .line 378
    .line 379
    iget-object v4, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 380
    .line 381
    add-int/lit8 v5, v6, 0x1

    .line 382
    .line 383
    aget v4, v4, v6

    .line 384
    .line 385
    iget-object v6, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->objBuffer:[Ljava/lang/Object;

    .line 386
    .line 387
    add-int/lit8 v7, v16, 0x1

    .line 388
    .line 389
    aget-object v6, v6, v16

    .line 390
    .line 391
    check-cast v6, Lcom/facebook/react/uimanager/StateWrapper;

    .line 392
    .line 393
    invoke-virtual {v3, v4, v6}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->updateState(ILcom/facebook/react/uimanager/StateWrapper;)V

    .line 394
    .line 395
    .line 396
    :goto_5
    move v6, v5

    .line 397
    move/from16 v16, v7

    .line 398
    .line 399
    goto/16 :goto_8

    .line 400
    .line 401
    :cond_a
    move/from16 v18, v9

    .line 402
    .line 403
    move/from16 v17, v10

    .line 404
    .line 405
    iget-object v4, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 406
    .line 407
    add-int/lit8 v5, v6, 0x1

    .line 408
    .line 409
    aget v4, v4, v6

    .line 410
    .line 411
    iget-object v6, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->objBuffer:[Ljava/lang/Object;

    .line 412
    .line 413
    add-int/lit8 v7, v16, 0x1

    .line 414
    .line 415
    aget-object v6, v6, v16

    .line 416
    .line 417
    check-cast v6, Lcom/facebook/react/bridge/ReadableMap;

    .line 418
    .line 419
    invoke-virtual {v3, v4, v6}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->updateProps(ILcom/facebook/react/bridge/ReadableMap;)V

    .line 420
    .line 421
    .line 422
    goto :goto_5

    .line 423
    :cond_b
    move/from16 v18, v9

    .line 424
    .line 425
    move/from16 v17, v10

    .line 426
    .line 427
    iget-object v4, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 428
    .line 429
    add-int/lit8 v5, v6, 0x1

    .line 430
    .line 431
    aget v7, v4, v6

    .line 432
    .line 433
    add-int/lit8 v8, v6, 0x2

    .line 434
    .line 435
    aget v5, v4, v5

    .line 436
    .line 437
    add-int/lit8 v6, v6, 0x3

    .line 438
    .line 439
    aget v4, v4, v8

    .line 440
    .line 441
    invoke-virtual {v3, v7, v5, v4}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->removeViewAt(III)V

    .line 442
    .line 443
    .line 444
    goto/16 :goto_8

    .line 445
    .line 446
    :cond_c
    move/from16 v18, v9

    .line 447
    .line 448
    move/from16 v17, v10

    .line 449
    .line 450
    iget-object v4, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 451
    .line 452
    add-int/lit8 v5, v6, 0x1

    .line 453
    .line 454
    aget v7, v4, v6

    .line 455
    .line 456
    add-int/lit8 v8, v6, 0x2

    .line 457
    .line 458
    aget v5, v4, v5

    .line 459
    .line 460
    add-int/lit8 v6, v6, 0x3

    .line 461
    .line 462
    aget v4, v4, v8

    .line 463
    .line 464
    invoke-virtual {v3, v5, v7, v4}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->addViewAt(III)V

    .line 465
    .line 466
    .line 467
    goto :goto_8

    .line 468
    :cond_d
    move/from16 v18, v9

    .line 469
    .line 470
    move/from16 v17, v10

    .line 471
    .line 472
    iget-object v4, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 473
    .line 474
    add-int/lit8 v5, v6, 0x1

    .line 475
    .line 476
    aget v4, v4, v6

    .line 477
    .line 478
    invoke-virtual {v3, v4}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->deleteView(I)V

    .line 479
    .line 480
    .line 481
    move v6, v5

    .line 482
    goto :goto_8

    .line 483
    :cond_e
    move/from16 v18, v9

    .line 484
    .line 485
    move/from16 v17, v10

    .line 486
    .line 487
    iget-object v4, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->objBuffer:[Ljava/lang/Object;

    .line 488
    .line 489
    add-int/lit8 v5, v16, 0x1

    .line 490
    .line 491
    aget-object v4, v4, v16

    .line 492
    .line 493
    check-cast v4, Ljava/lang/String;

    .line 494
    .line 495
    if-nez v4, :cond_f

    .line 496
    .line 497
    const-string v4, ""

    .line 498
    .line 499
    :cond_f
    invoke-static {v4}, Lcom/facebook/react/fabric/mounting/mountitems/FabricNameComponentMapping;->getFabricComponentName(Ljava/lang/String;)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v4

    .line 503
    iget-object v7, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 504
    .line 505
    add-int/lit8 v8, v6, 0x1

    .line 506
    .line 507
    move v9, v5

    .line 508
    aget v5, v7, v6

    .line 509
    .line 510
    iget-object v10, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->objBuffer:[Ljava/lang/Object;

    .line 511
    .line 512
    add-int/lit8 v11, v16, 0x2

    .line 513
    .line 514
    aget-object v9, v10, v9

    .line 515
    .line 516
    check-cast v9, Lcom/facebook/react/bridge/ReadableMap;

    .line 517
    .line 518
    add-int/lit8 v19, v16, 0x3

    .line 519
    .line 520
    aget-object v11, v10, v11

    .line 521
    .line 522
    check-cast v11, Lcom/facebook/react/uimanager/StateWrapper;

    .line 523
    .line 524
    add-int/lit8 v16, v16, 0x4

    .line 525
    .line 526
    aget-object v10, v10, v19

    .line 527
    .line 528
    check-cast v10, Lcom/facebook/react/fabric/events/EventEmitterWrapper;

    .line 529
    .line 530
    add-int/lit8 v19, v6, 0x2

    .line 531
    .line 532
    aget v6, v7, v8

    .line 533
    .line 534
    if-ne v6, v13, :cond_10

    .line 535
    .line 536
    move-object v6, v9

    .line 537
    move v9, v13

    .line 538
    :goto_6
    move-object v8, v10

    .line 539
    move-object v7, v11

    .line 540
    goto :goto_7

    .line 541
    :cond_10
    move-object v6, v9

    .line 542
    move v9, v1

    .line 543
    goto :goto_6

    .line 544
    :goto_7
    invoke-virtual/range {v3 .. v9}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->createView(Ljava/lang/String;ILcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/uimanager/StateWrapper;Lcom/facebook/react/fabric/events/EventEmitterWrapper;Z)V

    .line 545
    .line 546
    .line 547
    move/from16 v6, v19

    .line 548
    .line 549
    :goto_8
    add-int/lit8 v10, v17, 0x1

    .line 550
    .line 551
    move/from16 v9, v18

    .line 552
    .line 553
    goto/16 :goto_2

    .line 554
    .line 555
    :cond_11
    invoke-static {v14, v15}, LB3/a;->i(J)V

    .line 556
    .line 557
    .line 558
    move v2, v6

    .line 559
    move/from16 v4, v16

    .line 560
    .line 561
    goto/16 :goto_0

    .line 562
    .line 563
    :cond_12
    invoke-direct {v0}, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->endMarkers()V

    .line 564
    .line 565
    .line 566
    return-void
.end method

.method public getSurfaceId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->surfaceId:I

    .line 2
    .line 3
    return v0
.end method

.method public isBatchEmpty()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBufferLen:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, ""

    .line 4
    .line 5
    const-string v3, "IntBufferBatchMountItem"

    .line 6
    .line 7
    const-string v0, "format(...)"

    .line 8
    .line 9
    :try_start_0
    new-instance v5, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    sget-object v6, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/H;

    .line 15
    .line 16
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 17
    .line 18
    const-string v7, "IntBufferBatchMountItem [surface:%d]:\n"

    .line 19
    .line 20
    iget v8, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->surfaceId:I

    .line 21
    .line 22
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v8

    .line 26
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v8

    .line 30
    const/4 v9, 0x1

    .line 31
    invoke-static {v8, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    invoke-static {v6, v7, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    invoke-static {v6, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const/4 v6, 0x0

    .line 46
    const/4 v7, 0x0

    .line 47
    :cond_0
    iget v8, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBufferLen:I

    .line 48
    .line 49
    if-ge v6, v8, :cond_11

    .line 50
    .line 51
    iget-object v8, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 52
    .line 53
    add-int/lit8 v10, v6, 0x1

    .line 54
    .line 55
    aget v11, v8, v6

    .line 56
    .line 57
    and-int/lit8 v12, v11, -0x2

    .line 58
    .line 59
    and-int/2addr v11, v9

    .line 60
    if-eqz v11, :cond_1

    .line 61
    .line 62
    add-int/lit8 v6, v6, 0x2

    .line 63
    .line 64
    aget v8, v8, v10
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .line 66
    move v10, v6

    .line 67
    goto :goto_0

    .line 68
    :catch_0
    move-exception v0

    .line 69
    move-object/from16 v19, v2

    .line 70
    .line 71
    goto/16 :goto_5

    .line 72
    .line 73
    :cond_1
    move v8, v9

    .line 74
    :goto_0
    move v6, v10

    .line 75
    const/4 v10, 0x0

    .line 76
    :goto_1
    if-ge v10, v8, :cond_0

    .line 77
    .line 78
    const/4 v11, 0x3

    .line 79
    const/4 v13, 0x2

    .line 80
    if-eq v12, v13, :cond_f

    .line 81
    .line 82
    const/4 v14, 0x4

    .line 83
    if-eq v12, v14, :cond_e

    .line 84
    .line 85
    const/16 v14, 0x8

    .line 86
    .line 87
    if-eq v12, v14, :cond_d

    .line 88
    .line 89
    const/16 v15, 0x10

    .line 90
    .line 91
    if-eq v12, v15, :cond_c

    .line 92
    .line 93
    const/16 v11, 0x20

    .line 94
    .line 95
    const-string v15, "<hidden>"

    .line 96
    .line 97
    const-string v16, "<null>"

    .line 98
    .line 99
    if-eq v12, v11, :cond_9

    .line 100
    .line 101
    const/16 v11, 0x40

    .line 102
    .line 103
    if-eq v12, v11, :cond_6

    .line 104
    .line 105
    const/16 v11, 0x80

    .line 106
    .line 107
    if-eq v12, v11, :cond_5

    .line 108
    .line 109
    const/16 v11, 0x100

    .line 110
    .line 111
    if-eq v12, v11, :cond_4

    .line 112
    .line 113
    const/16 v11, 0x200

    .line 114
    .line 115
    if-eq v12, v11, :cond_3

    .line 116
    .line 117
    const/16 v11, 0x400

    .line 118
    .line 119
    if-ne v12, v11, :cond_2

    .line 120
    .line 121
    :try_start_1
    sget-object v11, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/H;

    .line 122
    .line 123
    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 124
    .line 125
    const-string v14, "UPDATE OVERFLOWINSET [%d]: left:%d top:%d right:%d bottom:%d\n"

    .line 126
    .line 127
    iget-object v15, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 128
    .line 129
    add-int/lit8 v16, v6, 0x1

    .line 130
    .line 131
    aget v15, v15, v6

    .line 132
    .line 133
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 134
    .line 135
    .line 136
    move-result-object v15

    .line 137
    iget-object v4, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 138
    .line 139
    add-int/lit8 v17, v6, 0x2

    .line 140
    .line 141
    aget v4, v4, v16

    .line 142
    .line 143
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    iget-object v9, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 148
    .line 149
    add-int/lit8 v16, v6, 0x3

    .line 150
    .line 151
    aget v9, v9, v17

    .line 152
    .line 153
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 154
    .line 155
    .line 156
    move-result-object v9

    .line 157
    iget-object v13, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 158
    .line 159
    add-int/lit8 v18, v6, 0x4

    .line 160
    .line 161
    aget v13, v13, v16

    .line 162
    .line 163
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object v13
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 167
    move-object/from16 v19, v2

    .line 168
    .line 169
    :try_start_2
    iget-object v2, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 170
    .line 171
    add-int/lit8 v6, v6, 0x5

    .line 172
    .line 173
    aget v2, v2, v18

    .line 174
    .line 175
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    filled-new-array {v15, v4, v9, v13, v2}, [Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    const/4 v4, 0x5

    .line 184
    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-static {v11, v14, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    invoke-static {v2, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    goto/16 :goto_4

    .line 199
    .line 200
    :catch_1
    move-exception v0

    .line 201
    goto/16 :goto_5

    .line 202
    .line 203
    :cond_2
    move-object/from16 v19, v2

    .line 204
    .line 205
    new-instance v0, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 208
    .line 209
    .line 210
    const-string v2, "String so far: "

    .line 211
    .line 212
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-static {v3, v0}, Ld2/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 226
    .line 227
    new-instance v2, Ljava/lang/StringBuilder;

    .line 228
    .line 229
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 230
    .line 231
    .line 232
    const-string v4, "Invalid type argument to IntBufferBatchMountItem: "

    .line 233
    .line 234
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    const-string v4, " at index: "

    .line 241
    .line 242
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    throw v0

    .line 256
    :cond_3
    move-object/from16 v19, v2

    .line 257
    .line 258
    sget-object v2, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/H;

    .line 259
    .line 260
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 261
    .line 262
    const-string v4, "UPDATE PADDING [%d]: top:%d right:%d bottom:%d left:%d\n"

    .line 263
    .line 264
    iget-object v9, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 265
    .line 266
    add-int/lit8 v11, v6, 0x1

    .line 267
    .line 268
    aget v9, v9, v6

    .line 269
    .line 270
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 271
    .line 272
    .line 273
    move-result-object v9

    .line 274
    iget-object v13, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 275
    .line 276
    add-int/lit8 v14, v6, 0x2

    .line 277
    .line 278
    aget v11, v13, v11

    .line 279
    .line 280
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 281
    .line 282
    .line 283
    move-result-object v11

    .line 284
    iget-object v13, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 285
    .line 286
    add-int/lit8 v15, v6, 0x3

    .line 287
    .line 288
    aget v13, v13, v14

    .line 289
    .line 290
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 291
    .line 292
    .line 293
    move-result-object v13

    .line 294
    iget-object v14, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 295
    .line 296
    add-int/lit8 v16, v6, 0x4

    .line 297
    .line 298
    aget v14, v14, v15

    .line 299
    .line 300
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 301
    .line 302
    .line 303
    move-result-object v14

    .line 304
    iget-object v15, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 305
    .line 306
    add-int/lit8 v6, v6, 0x5

    .line 307
    .line 308
    aget v15, v15, v16

    .line 309
    .line 310
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 311
    .line 312
    .line 313
    move-result-object v15

    .line 314
    filled-new-array {v9, v11, v13, v14, v15}, [Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v9

    .line 318
    const/4 v11, 0x5

    .line 319
    invoke-static {v9, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v9

    .line 323
    invoke-static {v2, v4, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    invoke-static {v2, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    goto/16 :goto_4

    .line 334
    .line 335
    :cond_4
    move-object/from16 v19, v2

    .line 336
    .line 337
    add-int/lit8 v7, v7, 0x1

    .line 338
    .line 339
    sget-object v2, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/H;

    .line 340
    .line 341
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 342
    .line 343
    const-string v4, "UPDATE EVENTEMITTER [%d]\n"

    .line 344
    .line 345
    iget-object v9, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 346
    .line 347
    add-int/lit8 v11, v6, 0x1

    .line 348
    .line 349
    aget v6, v9, v6

    .line 350
    .line 351
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 352
    .line 353
    .line 354
    move-result-object v6

    .line 355
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v6

    .line 359
    const/4 v9, 0x1

    .line 360
    invoke-static {v6, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v6

    .line 364
    invoke-static {v2, v4, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    invoke-static {v2, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    :goto_2
    move v6, v11

    .line 375
    goto/16 :goto_4

    .line 376
    .line 377
    :cond_5
    move-object/from16 v19, v2

    .line 378
    .line 379
    sget-object v2, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/H;

    .line 380
    .line 381
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 382
    .line 383
    const-string v4, "UPDATE LAYOUT [%d]->[%d]: x:%d y:%d w:%d h:%d displayType:%d layoutDirection:%d\n"

    .line 384
    .line 385
    iget-object v9, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 386
    .line 387
    add-int/lit8 v11, v6, 0x1

    .line 388
    .line 389
    aget v9, v9, v6

    .line 390
    .line 391
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 392
    .line 393
    .line 394
    move-result-object v20

    .line 395
    iget-object v9, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 396
    .line 397
    add-int/lit8 v13, v6, 0x2

    .line 398
    .line 399
    aget v9, v9, v11

    .line 400
    .line 401
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 402
    .line 403
    .line 404
    move-result-object v21

    .line 405
    iget-object v9, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 406
    .line 407
    add-int/lit8 v11, v6, 0x3

    .line 408
    .line 409
    aget v9, v9, v13

    .line 410
    .line 411
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 412
    .line 413
    .line 414
    move-result-object v22

    .line 415
    iget-object v9, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 416
    .line 417
    add-int/lit8 v13, v6, 0x4

    .line 418
    .line 419
    aget v9, v9, v11

    .line 420
    .line 421
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 422
    .line 423
    .line 424
    move-result-object v23

    .line 425
    iget-object v9, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 426
    .line 427
    add-int/lit8 v11, v6, 0x5

    .line 428
    .line 429
    aget v9, v9, v13

    .line 430
    .line 431
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 432
    .line 433
    .line 434
    move-result-object v24

    .line 435
    iget-object v9, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 436
    .line 437
    add-int/lit8 v13, v6, 0x6

    .line 438
    .line 439
    aget v9, v9, v11

    .line 440
    .line 441
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 442
    .line 443
    .line 444
    move-result-object v25

    .line 445
    iget-object v9, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 446
    .line 447
    add-int/lit8 v11, v6, 0x7

    .line 448
    .line 449
    aget v9, v9, v13

    .line 450
    .line 451
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 452
    .line 453
    .line 454
    move-result-object v26

    .line 455
    iget-object v9, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 456
    .line 457
    add-int/lit8 v6, v6, 0x8

    .line 458
    .line 459
    aget v9, v9, v11

    .line 460
    .line 461
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 462
    .line 463
    .line 464
    move-result-object v27

    .line 465
    filled-new-array/range {v20 .. v27}, [Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v9

    .line 469
    invoke-static {v9, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v9

    .line 473
    invoke-static {v2, v4, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    invoke-static {v2, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 481
    .line 482
    .line 483
    goto/16 :goto_4

    .line 484
    .line 485
    :cond_6
    move-object/from16 v19, v2

    .line 486
    .line 487
    iget-object v2, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->objBuffer:[Ljava/lang/Object;

    .line 488
    .line 489
    add-int/lit8 v4, v7, 0x1

    .line 490
    .line 491
    aget-object v2, v2, v7

    .line 492
    .line 493
    check-cast v2, Lcom/facebook/react/uimanager/StateWrapper;

    .line 494
    .line 495
    sget-boolean v7, Lcom/facebook/react/fabric/FabricUIManager;->IS_DEVELOPMENT_ENVIRONMENT:Z

    .line 496
    .line 497
    if-eqz v7, :cond_8

    .line 498
    .line 499
    if-eqz v2, :cond_7

    .line 500
    .line 501
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v15

    .line 505
    if-nez v15, :cond_8

    .line 506
    .line 507
    :cond_7
    move-object/from16 v15, v16

    .line 508
    .line 509
    :cond_8
    sget-object v2, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/H;

    .line 510
    .line 511
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 512
    .line 513
    const-string v7, "UPDATE STATE [%d]: %s\n"

    .line 514
    .line 515
    iget-object v9, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 516
    .line 517
    add-int/lit8 v11, v6, 0x1

    .line 518
    .line 519
    aget v6, v9, v6

    .line 520
    .line 521
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 522
    .line 523
    .line 524
    move-result-object v6

    .line 525
    filled-new-array {v6, v15}, [Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v6

    .line 529
    invoke-static {v6, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v6

    .line 533
    invoke-static {v2, v7, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 534
    .line 535
    .line 536
    move-result-object v2

    .line 537
    invoke-static {v2, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 541
    .line 542
    .line 543
    :goto_3
    move v7, v4

    .line 544
    goto/16 :goto_2

    .line 545
    .line 546
    :cond_9
    move-object/from16 v19, v2

    .line 547
    .line 548
    iget-object v2, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->objBuffer:[Ljava/lang/Object;

    .line 549
    .line 550
    add-int/lit8 v4, v7, 0x1

    .line 551
    .line 552
    aget-object v2, v2, v7

    .line 553
    .line 554
    sget-boolean v7, Lcom/facebook/react/fabric/FabricUIManager;->IS_DEVELOPMENT_ENVIRONMENT:Z

    .line 555
    .line 556
    if-eqz v7, :cond_b

    .line 557
    .line 558
    if-eqz v2, :cond_a

    .line 559
    .line 560
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v15

    .line 564
    if-nez v15, :cond_b

    .line 565
    .line 566
    :cond_a
    move-object/from16 v15, v16

    .line 567
    .line 568
    :cond_b
    sget-object v2, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/H;

    .line 569
    .line 570
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 571
    .line 572
    const-string v7, "UPDATE PROPS [%d]: %s\n"

    .line 573
    .line 574
    iget-object v9, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 575
    .line 576
    add-int/lit8 v11, v6, 0x1

    .line 577
    .line 578
    aget v6, v9, v6

    .line 579
    .line 580
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 581
    .line 582
    .line 583
    move-result-object v6

    .line 584
    filled-new-array {v6, v15}, [Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object v6

    .line 588
    invoke-static {v6, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v6

    .line 592
    invoke-static {v2, v7, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v2

    .line 596
    invoke-static {v2, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 597
    .line 598
    .line 599
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 600
    .line 601
    .line 602
    goto :goto_3

    .line 603
    :cond_c
    move-object/from16 v19, v2

    .line 604
    .line 605
    sget-object v2, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/H;

    .line 606
    .line 607
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 608
    .line 609
    const-string v4, "REMOVE [%d]->[%d] @%d\n"

    .line 610
    .line 611
    iget-object v9, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 612
    .line 613
    add-int/lit8 v13, v6, 0x1

    .line 614
    .line 615
    aget v9, v9, v6

    .line 616
    .line 617
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 618
    .line 619
    .line 620
    move-result-object v9

    .line 621
    iget-object v14, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 622
    .line 623
    add-int/lit8 v15, v6, 0x2

    .line 624
    .line 625
    aget v13, v14, v13

    .line 626
    .line 627
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 628
    .line 629
    .line 630
    move-result-object v13

    .line 631
    iget-object v14, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 632
    .line 633
    add-int/lit8 v6, v6, 0x3

    .line 634
    .line 635
    aget v14, v14, v15

    .line 636
    .line 637
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 638
    .line 639
    .line 640
    move-result-object v14

    .line 641
    filled-new-array {v9, v13, v14}, [Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    move-result-object v9

    .line 645
    invoke-static {v9, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 646
    .line 647
    .line 648
    move-result-object v9

    .line 649
    invoke-static {v2, v4, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v2

    .line 653
    invoke-static {v2, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 654
    .line 655
    .line 656
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 657
    .line 658
    .line 659
    goto/16 :goto_4

    .line 660
    .line 661
    :cond_d
    move-object/from16 v19, v2

    .line 662
    .line 663
    sget-object v2, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/H;

    .line 664
    .line 665
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 666
    .line 667
    const-string v4, "INSERT [%d]->[%d] @%d\n"

    .line 668
    .line 669
    iget-object v9, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 670
    .line 671
    add-int/lit8 v13, v6, 0x1

    .line 672
    .line 673
    aget v9, v9, v6

    .line 674
    .line 675
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 676
    .line 677
    .line 678
    move-result-object v9

    .line 679
    iget-object v14, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 680
    .line 681
    add-int/lit8 v15, v6, 0x2

    .line 682
    .line 683
    aget v13, v14, v13

    .line 684
    .line 685
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 686
    .line 687
    .line 688
    move-result-object v13

    .line 689
    iget-object v14, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 690
    .line 691
    add-int/lit8 v6, v6, 0x3

    .line 692
    .line 693
    aget v14, v14, v15

    .line 694
    .line 695
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 696
    .line 697
    .line 698
    move-result-object v14

    .line 699
    filled-new-array {v9, v13, v14}, [Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    move-result-object v9

    .line 703
    invoke-static {v9, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    move-result-object v9

    .line 707
    invoke-static {v2, v4, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 708
    .line 709
    .line 710
    move-result-object v2

    .line 711
    invoke-static {v2, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 712
    .line 713
    .line 714
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 715
    .line 716
    .line 717
    goto :goto_4

    .line 718
    :cond_e
    move-object/from16 v19, v2

    .line 719
    .line 720
    sget-object v2, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/H;

    .line 721
    .line 722
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 723
    .line 724
    const-string v4, "DELETE [%d]\n"

    .line 725
    .line 726
    iget-object v9, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 727
    .line 728
    add-int/lit8 v11, v6, 0x1

    .line 729
    .line 730
    aget v6, v9, v6

    .line 731
    .line 732
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 733
    .line 734
    .line 735
    move-result-object v6

    .line 736
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 737
    .line 738
    .line 739
    move-result-object v6

    .line 740
    const/4 v9, 0x1

    .line 741
    invoke-static {v6, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object v6

    .line 745
    invoke-static {v2, v4, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 746
    .line 747
    .line 748
    move-result-object v2

    .line 749
    invoke-static {v2, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 750
    .line 751
    .line 752
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 753
    .line 754
    .line 755
    goto/16 :goto_2

    .line 756
    .line 757
    :cond_f
    move-object/from16 v19, v2

    .line 758
    .line 759
    iget-object v2, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->objBuffer:[Ljava/lang/Object;

    .line 760
    .line 761
    aget-object v2, v2, v7

    .line 762
    .line 763
    check-cast v2, Ljava/lang/String;

    .line 764
    .line 765
    if-nez v2, :cond_10

    .line 766
    .line 767
    move-object/from16 v2, v19

    .line 768
    .line 769
    :cond_10
    invoke-static {v2}, Lcom/facebook/react/fabric/mounting/mountitems/FabricNameComponentMapping;->getFabricComponentName(Ljava/lang/String;)Ljava/lang/String;

    .line 770
    .line 771
    .line 772
    move-result-object v2

    .line 773
    add-int/lit8 v7, v7, 0x4

    .line 774
    .line 775
    sget-object v4, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/H;

    .line 776
    .line 777
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 778
    .line 779
    const-string v13, "CREATE [%d] - layoutable:%d - %s\n"

    .line 780
    .line 781
    iget-object v14, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 782
    .line 783
    add-int/lit8 v15, v6, 0x1

    .line 784
    .line 785
    aget v14, v14, v6

    .line 786
    .line 787
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 788
    .line 789
    .line 790
    move-result-object v14

    .line 791
    iget-object v9, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 792
    .line 793
    add-int/lit8 v6, v6, 0x2

    .line 794
    .line 795
    aget v9, v9, v15

    .line 796
    .line 797
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 798
    .line 799
    .line 800
    move-result-object v9

    .line 801
    filled-new-array {v14, v9, v2}, [Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object v2

    .line 805
    invoke-static {v2, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 806
    .line 807
    .line 808
    move-result-object v2

    .line 809
    invoke-static {v4, v13, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object v2

    .line 813
    invoke-static {v2, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 814
    .line 815
    .line 816
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 817
    .line 818
    .line 819
    :goto_4
    add-int/lit8 v10, v10, 0x1

    .line 820
    .line 821
    move-object/from16 v2, v19

    .line 822
    .line 823
    const/4 v9, 0x1

    .line 824
    goto/16 :goto_1

    .line 825
    .line 826
    :cond_11
    move-object/from16 v19, v2

    .line 827
    .line 828
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 829
    .line 830
    .line 831
    move-result-object v0

    .line 832
    const-string v2, "toString(...)"

    .line 833
    .line 834
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 835
    .line 836
    .line 837
    return-object v0

    .line 838
    :goto_5
    const-string v2, "Caught exception trying to print"

    .line 839
    .line 840
    invoke-static {v3, v2, v0}, Ld2/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 841
    .line 842
    .line 843
    new-instance v0, Ljava/lang/StringBuilder;

    .line 844
    .line 845
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 846
    .line 847
    .line 848
    const/4 v2, 0x0

    .line 849
    :goto_6
    iget v4, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBufferLen:I

    .line 850
    .line 851
    if-ge v2, v4, :cond_12

    .line 852
    .line 853
    iget-object v4, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->intBuffer:[I

    .line 854
    .line 855
    aget v4, v4, v2

    .line 856
    .line 857
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 858
    .line 859
    .line 860
    const-string v4, ", "

    .line 861
    .line 862
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 863
    .line 864
    .line 865
    add-int/lit8 v2, v2, 0x1

    .line 866
    .line 867
    goto :goto_6

    .line 868
    :cond_12
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 869
    .line 870
    .line 871
    move-result-object v0

    .line 872
    invoke-static {v3, v0}, Ld2/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 873
    .line 874
    .line 875
    const/4 v4, 0x0

    .line 876
    :goto_7
    iget v0, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->objBufferLen:I

    .line 877
    .line 878
    if-ge v4, v0, :cond_14

    .line 879
    .line 880
    iget-object v0, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->objBuffer:[Ljava/lang/Object;

    .line 881
    .line 882
    aget-object v0, v0, v4

    .line 883
    .line 884
    if-eqz v0, :cond_13

    .line 885
    .line 886
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 887
    .line 888
    .line 889
    move-result-object v0

    .line 890
    goto :goto_8

    .line 891
    :cond_13
    const-string v0, "null"

    .line 892
    .line 893
    :goto_8
    invoke-static {v3, v0}, Ld2/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 894
    .line 895
    .line 896
    add-int/lit8 v4, v4, 0x1

    .line 897
    .line 898
    goto :goto_7

    .line 899
    :cond_14
    return-object v19
.end method
