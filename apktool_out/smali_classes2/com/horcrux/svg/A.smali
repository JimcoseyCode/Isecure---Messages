.class Lcom/horcrux/svg/A;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:Ljava/util/ArrayList;

.field private final b:[[I

.field private final c:Landroid/graphics/Paint;


# direct methods
.method constructor <init>(Landroid/graphics/Paint;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/horcrux/svg/A;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/16 v1, 0x100

    .line 12
    .line 13
    new-array v1, v1, [[I

    .line 14
    .line 15
    iput-object v1, p0, Lcom/horcrux/svg/A;->b:[[I

    .line 16
    .line 17
    iput-object p1, p0, Lcom/horcrux/svg/A;->c:Landroid/graphics/Paint;

    .line 18
    .line 19
    new-instance p1, Landroid/graphics/Path;

    .line 20
    .line 21
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private a(C)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/A;->b:[[I

    .line 2
    .line 3
    shr-int/lit8 v1, p1, 0x8

    .line 4
    .line 5
    aget-object v0, v0, v1

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_0
    and-int/lit16 p1, p1, 0xff

    .line 12
    .line 13
    aget p1, v0, p1

    .line 14
    .line 15
    return p1
.end method


# virtual methods
.method b(CLjava/lang/String;)Landroid/graphics/Path;
    .locals 7

    .line 1
    invoke-direct {p0, p1}, Lcom/horcrux/svg/A;->a(C)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/horcrux/svg/A;->a:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Landroid/graphics/Path;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance v6, Landroid/graphics/Path;

    .line 17
    .line 18
    invoke-direct {v6}, Landroid/graphics/Path;-><init>()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/horcrux/svg/A;->c:Landroid/graphics/Paint;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v2, 0x0

    .line 26
    const/4 v3, 0x1

    .line 27
    move-object v1, p2

    .line 28
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Paint;->getTextPath(Ljava/lang/String;IIFFLandroid/graphics/Path;)V

    .line 29
    .line 30
    .line 31
    iget-object p2, p0, Lcom/horcrux/svg/A;->b:[[I

    .line 32
    .line 33
    shr-int/lit8 v0, p1, 0x8

    .line 34
    .line 35
    aget-object v1, p2, v0

    .line 36
    .line 37
    if-nez v1, :cond_1

    .line 38
    .line 39
    const/16 v1, 0x100

    .line 40
    .line 41
    new-array v1, v1, [I

    .line 42
    .line 43
    aput-object v1, p2, v0

    .line 44
    .line 45
    :cond_1
    and-int/lit16 p1, p1, 0xff

    .line 46
    .line 47
    iget-object p2, p0, Lcom/horcrux/svg/A;->a:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    aput p2, v1, p1

    .line 54
    .line 55
    iget-object p1, p0, Lcom/horcrux/svg/A;->a:Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-object p1, v6

    .line 61
    :goto_0
    new-instance p2, Landroid/graphics/Path;

    .line 62
    .line 63
    invoke-direct {p2}, Landroid/graphics/Path;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2, p1}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;)V

    .line 67
    .line 68
    .line 69
    return-object p2
.end method
