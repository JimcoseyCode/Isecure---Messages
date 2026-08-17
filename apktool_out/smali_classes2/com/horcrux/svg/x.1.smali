.class Lcom/horcrux/svg/x;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/horcrux/svg/x$a;
    }
.end annotation


# static fields
.field static final p:Lcom/horcrux/svg/x;


# instance fields
.field final a:D

.field final b:Ljava/lang/String;

.field final c:Lcom/horcrux/svg/e0;

.field final d:Lcom/facebook/react/bridge/ReadableMap;

.field e:Lcom/horcrux/svg/g0;

.field f:I

.field final g:Ljava/lang/String;

.field final h:Ljava/lang/String;

.field final i:Lcom/horcrux/svg/f0;

.field final j:Lcom/horcrux/svg/h0;

.field private final k:Lcom/horcrux/svg/i0;

.field final l:D

.field final m:D

.field final n:D

.field final o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/horcrux/svg/x;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/horcrux/svg/x;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/horcrux/svg/x;->p:Lcom/horcrux/svg/x;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/horcrux/svg/x;->d:Lcom/facebook/react/bridge/ReadableMap;

    .line 3
    const-string v0, ""

    iput-object v0, p0, Lcom/horcrux/svg/x;->b:Ljava/lang/String;

    .line 4
    sget-object v1, Lcom/horcrux/svg/e0;->g:Lcom/horcrux/svg/e0;

    iput-object v1, p0, Lcom/horcrux/svg/x;->c:Lcom/horcrux/svg/e0;

    .line 5
    sget-object v1, Lcom/horcrux/svg/g0;->h:Lcom/horcrux/svg/g0;

    iput-object v1, p0, Lcom/horcrux/svg/x;->e:Lcom/horcrux/svg/g0;

    const/16 v1, 0x190

    .line 6
    iput v1, p0, Lcom/horcrux/svg/x;->f:I

    .line 7
    iput-object v0, p0, Lcom/horcrux/svg/x;->g:Ljava/lang/String;

    .line 8
    iput-object v0, p0, Lcom/horcrux/svg/x;->h:Ljava/lang/String;

    .line 9
    sget-object v0, Lcom/horcrux/svg/f0;->g:Lcom/horcrux/svg/f0;

    iput-object v0, p0, Lcom/horcrux/svg/x;->i:Lcom/horcrux/svg/f0;

    .line 10
    sget-object v0, Lcom/horcrux/svg/h0;->g:Lcom/horcrux/svg/h0;

    iput-object v0, p0, Lcom/horcrux/svg/x;->j:Lcom/horcrux/svg/h0;

    .line 11
    sget-object v0, Lcom/horcrux/svg/i0;->h:Lcom/horcrux/svg/i0;

    iput-object v0, p0, Lcom/horcrux/svg/x;->k:Lcom/horcrux/svg/i0;

    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/horcrux/svg/x;->o:Z

    const-wide/16 v0, 0x0

    .line 13
    iput-wide v0, p0, Lcom/horcrux/svg/x;->l:D

    const-wide/high16 v2, 0x4028000000000000L    # 12.0

    .line 14
    iput-wide v2, p0, Lcom/horcrux/svg/x;->a:D

    .line 15
    iput-wide v0, p0, Lcom/horcrux/svg/x;->m:D

    .line 16
    iput-wide v0, p0, Lcom/horcrux/svg/x;->n:D

    return-void
.end method

.method constructor <init>(Lcom/facebook/react/bridge/ReadableMap;Lcom/horcrux/svg/x;D)V
    .locals 9

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iget-wide v5, p2, Lcom/horcrux/svg/x;->a:D

    .line 19
    const-string v0, "fontSize"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 20
    const-string v2, "fontSize"

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    move-wide v7, v5

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v8}, Lcom/horcrux/svg/x;->c(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;DDD)D

    move-result-wide v2

    iput-wide v2, p0, Lcom/horcrux/svg/x;->a:D

    goto :goto_0

    .line 21
    :cond_0
    iput-wide v5, p0, Lcom/horcrux/svg/x;->a:D

    .line 22
    :goto_0
    const-string v2, "fontWeight"

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 23
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v3

    .line 24
    sget-object v4, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    if-ne v3, v4, :cond_1

    .line 25
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v2

    invoke-direct {p0, p2, v2, v3}, Lcom/horcrux/svg/x;->a(Lcom/horcrux/svg/x;D)V

    goto :goto_1

    .line 26
    :cond_1
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 27
    invoke-static {v2}, Lcom/horcrux/svg/g0;->k(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 28
    invoke-static {v2}, Lcom/horcrux/svg/g0;->j(Ljava/lang/String;)Lcom/horcrux/svg/g0;

    move-result-object v2

    invoke-static {v2, p2}, Lcom/horcrux/svg/x$a;->b(Lcom/horcrux/svg/g0;Lcom/horcrux/svg/x;)I

    move-result v2

    iput v2, p0, Lcom/horcrux/svg/x;->f:I

    .line 29
    invoke-static {v2}, Lcom/horcrux/svg/x$a;->d(I)Lcom/horcrux/svg/g0;

    move-result-object v2

    iput-object v2, p0, Lcom/horcrux/svg/x;->e:Lcom/horcrux/svg/g0;

    goto :goto_1

    :cond_2
    if-eqz v2, :cond_3

    .line 30
    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    invoke-direct {p0, p2, v2, v3}, Lcom/horcrux/svg/x;->a(Lcom/horcrux/svg/x;D)V

    goto :goto_1

    .line 31
    :cond_3
    invoke-direct {p0, p2}, Lcom/horcrux/svg/x;->b(Lcom/horcrux/svg/x;)V

    goto :goto_1

    .line 32
    :cond_4
    invoke-direct {p0, p2}, Lcom/horcrux/svg/x;->b(Lcom/horcrux/svg/x;)V

    .line 33
    :goto_1
    const-string v2, "fontData"

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v2

    goto :goto_2

    :cond_5
    iget-object v2, p2, Lcom/horcrux/svg/x;->d:Lcom/facebook/react/bridge/ReadableMap;

    :goto_2
    iput-object v2, p0, Lcom/horcrux/svg/x;->d:Lcom/facebook/react/bridge/ReadableMap;

    .line 34
    const-string v2, "fontFamily"

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_3

    :cond_6
    iget-object v2, p2, Lcom/horcrux/svg/x;->b:Ljava/lang/String;

    :goto_3
    iput-object v2, p0, Lcom/horcrux/svg/x;->b:Ljava/lang/String;

    .line 35
    const-string v2, "fontStyle"

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/horcrux/svg/e0;->valueOf(Ljava/lang/String;)Lcom/horcrux/svg/e0;

    move-result-object v2

    goto :goto_4

    :cond_7
    iget-object v2, p2, Lcom/horcrux/svg/x;->c:Lcom/horcrux/svg/e0;

    :goto_4
    iput-object v2, p0, Lcom/horcrux/svg/x;->c:Lcom/horcrux/svg/e0;

    .line 36
    const-string v2, "fontFeatureSettings"

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 37
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_5

    .line 38
    :cond_8
    iget-object v2, p2, Lcom/horcrux/svg/x;->g:Ljava/lang/String;

    :goto_5
    iput-object v2, p0, Lcom/horcrux/svg/x;->g:Ljava/lang/String;

    .line 39
    const-string v2, "fontVariationSettings"

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_9

    .line 40
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_6

    .line 41
    :cond_9
    iget-object v2, p2, Lcom/horcrux/svg/x;->h:Ljava/lang/String;

    :goto_6
    iput-object v2, p0, Lcom/horcrux/svg/x;->h:Ljava/lang/String;

    .line 42
    const-string v2, "fontVariantLigatures"

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_a

    .line 43
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/horcrux/svg/f0;->valueOf(Ljava/lang/String;)Lcom/horcrux/svg/f0;

    move-result-object v2

    goto :goto_7

    .line 44
    :cond_a
    iget-object v2, p2, Lcom/horcrux/svg/x;->i:Lcom/horcrux/svg/f0;

    :goto_7
    iput-object v2, p0, Lcom/horcrux/svg/x;->i:Lcom/horcrux/svg/f0;

    .line 45
    const-string v2, "textAnchor"

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_b

    .line 46
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/horcrux/svg/h0;->valueOf(Ljava/lang/String;)Lcom/horcrux/svg/h0;

    move-result-object v2

    goto :goto_8

    .line 47
    :cond_b
    iget-object v2, p2, Lcom/horcrux/svg/x;->j:Lcom/horcrux/svg/h0;

    :goto_8
    iput-object v2, p0, Lcom/horcrux/svg/x;->j:Lcom/horcrux/svg/h0;

    .line 48
    const-string v2, "textDecoration"

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_c

    .line 49
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/horcrux/svg/i0;->j(Ljava/lang/String;)Lcom/horcrux/svg/i0;

    move-result-object v2

    goto :goto_9

    .line 50
    :cond_c
    iget-object v2, p2, Lcom/horcrux/svg/x;->k:Lcom/horcrux/svg/i0;

    :goto_9
    iput-object v2, p0, Lcom/horcrux/svg/x;->k:Lcom/horcrux/svg/i0;

    .line 51
    const-string v2, "kerning"

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_e

    .line 52
    iget-boolean v3, p2, Lcom/horcrux/svg/x;->o:Z

    if-eqz v3, :cond_d

    goto :goto_a

    :cond_d
    const/4 v3, 0x0

    goto :goto_b

    :cond_e
    :goto_a
    const/4 v3, 0x1

    :goto_b
    iput-boolean v3, p0, Lcom/horcrux/svg/x;->o:Z

    if-eqz v2, :cond_f

    .line 53
    iget-wide v5, p0, Lcom/horcrux/svg/x;->a:D

    const-wide/16 v7, 0x0

    const-string v2, "kerning"

    move-object v0, p0

    move-object v1, p1

    move-wide v3, p3

    invoke-direct/range {v0 .. v8}, Lcom/horcrux/svg/x;->c(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;DDD)D

    move-result-wide v5

    goto :goto_c

    :cond_f
    iget-wide v5, p2, Lcom/horcrux/svg/x;->l:D

    :goto_c
    iput-wide v5, p0, Lcom/horcrux/svg/x;->l:D

    .line 54
    const-string v2, "wordSpacing"

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_10

    .line 55
    iget-wide v5, p0, Lcom/horcrux/svg/x;->a:D

    const-wide/16 v7, 0x0

    const-string v2, "wordSpacing"

    move-object v0, p0

    move-object v1, p1

    move-wide v3, p3

    invoke-direct/range {v0 .. v8}, Lcom/horcrux/svg/x;->c(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;DDD)D

    move-result-wide v5

    goto :goto_d

    .line 56
    :cond_10
    iget-wide v5, p2, Lcom/horcrux/svg/x;->m:D

    :goto_d
    iput-wide v5, p0, Lcom/horcrux/svg/x;->m:D

    .line 57
    const-string v2, "letterSpacing"

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_11

    .line 58
    iget-wide v5, p0, Lcom/horcrux/svg/x;->a:D

    const-wide/16 v7, 0x0

    const-string v2, "letterSpacing"

    move-object v0, p0

    move-object v1, p1

    move-wide v3, p3

    invoke-direct/range {v0 .. v8}, Lcom/horcrux/svg/x;->c(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;DDD)D

    move-result-wide v1

    goto :goto_e

    .line 59
    :cond_11
    iget-wide v1, p2, Lcom/horcrux/svg/x;->n:D

    :goto_e
    iput-wide v1, p0, Lcom/horcrux/svg/x;->n:D

    return-void
.end method

.method private a(Lcom/horcrux/svg/x;D)V
    .locals 2

    .line 1
    invoke-static {p2, p3}, Ljava/lang/Math;->round(D)J

    .line 2
    .line 3
    .line 4
    move-result-wide p2

    .line 5
    const-wide/16 v0, 0x1

    .line 6
    .line 7
    cmp-long v0, p2, v0

    .line 8
    .line 9
    if-ltz v0, :cond_0

    .line 10
    .line 11
    const-wide/16 v0, 0x3e8

    .line 12
    .line 13
    cmp-long v0, p2, v0

    .line 14
    .line 15
    if-gtz v0, :cond_0

    .line 16
    .line 17
    long-to-int p1, p2

    .line 18
    iput p1, p0, Lcom/horcrux/svg/x;->f:I

    .line 19
    .line 20
    invoke-static {p1}, Lcom/horcrux/svg/x$a;->d(I)Lcom/horcrux/svg/g0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lcom/horcrux/svg/x;->e:Lcom/horcrux/svg/g0;

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-direct {p0, p1}, Lcom/horcrux/svg/x;->b(Lcom/horcrux/svg/x;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private b(Lcom/horcrux/svg/x;)V
    .locals 1

    .line 1
    iget v0, p1, Lcom/horcrux/svg/x;->f:I

    .line 2
    .line 3
    iput v0, p0, Lcom/horcrux/svg/x;->f:I

    .line 4
    .line 5
    iget-object p1, p1, Lcom/horcrux/svg/x;->e:Lcom/horcrux/svg/g0;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/horcrux/svg/x;->e:Lcom/horcrux/svg/g0;

    .line 8
    .line 9
    return-void
.end method

.method private c(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;DDD)D
    .locals 7

    .line 1
    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    mul-double/2addr p1, p3

    .line 14
    return-wide p1

    .line 15
    :cond_0
    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    move-wide v3, p3

    .line 20
    move-wide v5, p5

    .line 21
    move-wide v1, p7

    .line 22
    invoke-static/range {v0 .. v6}, Lcom/horcrux/svg/M;->b(Ljava/lang/String;DDD)D

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    return-wide p1
.end method
