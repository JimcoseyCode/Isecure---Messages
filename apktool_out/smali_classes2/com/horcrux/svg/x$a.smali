.class abstract Lcom/horcrux/svg/x$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/horcrux/svg/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field private static final a:[Lcom/horcrux/svg/g0;

.field private static final b:[I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    sget-object v0, Lcom/horcrux/svg/g0;->j:Lcom/horcrux/svg/g0;

    .line 2
    .line 3
    sget-object v2, Lcom/horcrux/svg/g0;->k:Lcom/horcrux/svg/g0;

    .line 4
    .line 5
    sget-object v3, Lcom/horcrux/svg/g0;->l:Lcom/horcrux/svg/g0;

    .line 6
    .line 7
    sget-object v4, Lcom/horcrux/svg/g0;->h:Lcom/horcrux/svg/g0;

    .line 8
    .line 9
    sget-object v5, Lcom/horcrux/svg/g0;->n:Lcom/horcrux/svg/g0;

    .line 10
    .line 11
    sget-object v6, Lcom/horcrux/svg/g0;->o:Lcom/horcrux/svg/g0;

    .line 12
    .line 13
    sget-object v7, Lcom/horcrux/svg/g0;->i:Lcom/horcrux/svg/g0;

    .line 14
    .line 15
    sget-object v8, Lcom/horcrux/svg/g0;->q:Lcom/horcrux/svg/g0;

    .line 16
    .line 17
    sget-object v9, Lcom/horcrux/svg/g0;->r:Lcom/horcrux/svg/g0;

    .line 18
    .line 19
    move-object v1, v0

    .line 20
    move-object v10, v9

    .line 21
    filled-new-array/range {v0 .. v10}, [Lcom/horcrux/svg/g0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lcom/horcrux/svg/x$a;->a:[Lcom/horcrux/svg/g0;

    .line 26
    .line 27
    const/16 v0, 0xb

    .line 28
    .line 29
    new-array v0, v0, [I

    .line 30
    .line 31
    fill-array-data v0, :array_0

    .line 32
    .line 33
    .line 34
    sput-object v0, Lcom/horcrux/svg/x$a;->b:[I

    .line 35
    .line 36
    return-void

    .line 37
    :array_0
    .array-data 4
        0x190
        0x2bc
        0x64
        0xc8
        0x12c
        0x190
        0x1f4
        0x258
        0x2bc
        0x320
        0x384
    .end array-data
.end method

.method private static a(I)I
    .locals 1

    .line 1
    const/16 v0, 0x15e

    .line 2
    .line 3
    if-ge p0, v0, :cond_0

    .line 4
    .line 5
    const/16 p0, 0x190

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    const/16 v0, 0x226

    .line 9
    .line 10
    if-ge p0, v0, :cond_1

    .line 11
    .line 12
    const/16 p0, 0x2bc

    .line 13
    .line 14
    return p0

    .line 15
    :cond_1
    const/16 v0, 0x384

    .line 16
    .line 17
    if-ge p0, v0, :cond_2

    .line 18
    .line 19
    return v0

    .line 20
    :cond_2
    return p0
.end method

.method static b(Lcom/horcrux/svg/g0;Lcom/horcrux/svg/x;)I
    .locals 1

    .line 1
    sget-object v0, Lcom/horcrux/svg/g0;->s:Lcom/horcrux/svg/g0;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    iget p0, p1, Lcom/horcrux/svg/x;->f:I

    .line 6
    .line 7
    invoke-static {p0}, Lcom/horcrux/svg/x$a;->a(I)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    sget-object v0, Lcom/horcrux/svg/g0;->t:Lcom/horcrux/svg/g0;

    .line 13
    .line 14
    if-ne p0, v0, :cond_1

    .line 15
    .line 16
    iget p0, p1, Lcom/horcrux/svg/x;->f:I

    .line 17
    .line 18
    invoke-static {p0}, Lcom/horcrux/svg/x$a;->c(I)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_1
    sget-object p1, Lcom/horcrux/svg/x$a;->b:[I

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    aget p0, p1, p0

    .line 30
    .line 31
    return p0
.end method

.method private static c(I)I
    .locals 2

    .line 1
    const/16 v0, 0x64

    .line 2
    .line 3
    if-ge p0, v0, :cond_0

    .line 4
    .line 5
    return p0

    .line 6
    :cond_0
    const/16 v1, 0x226

    .line 7
    .line 8
    if-ge p0, v1, :cond_1

    .line 9
    .line 10
    return v0

    .line 11
    :cond_1
    const/16 v0, 0x2ee

    .line 12
    .line 13
    if-ge p0, v0, :cond_2

    .line 14
    .line 15
    const/16 p0, 0x190

    .line 16
    .line 17
    return p0

    .line 18
    :cond_2
    const/16 p0, 0x2bc

    .line 19
    .line 20
    return p0
.end method

.method static d(I)Lcom/horcrux/svg/g0;
    .locals 2

    .line 1
    sget-object v0, Lcom/horcrux/svg/x$a;->a:[Lcom/horcrux/svg/g0;

    .line 2
    .line 3
    int-to-float p0, p0

    .line 4
    const/high16 v1, 0x42c80000    # 100.0f

    .line 5
    .line 6
    div-float/2addr p0, v1

    .line 7
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    aget-object p0, v0, p0

    .line 12
    .line 13
    return-object p0
.end method
